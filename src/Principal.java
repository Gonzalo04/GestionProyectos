import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Principal {

    public static void main (String[] args ) {
        // MIO
        /*Ventana miVentana = new Ventana("Gestion de TFG'S");
        miVentana.setVisible(true);*/

        // SUYO
        pantallaInicio();
    }
        private static void pantallaInicio () {
            JFrame frame = new JFrame("Prueba pantalla inicio");
            Dimension dimension = new Dimension(700,100);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setMaximumSize(dimension);
            frame.setMinimumSize(dimension);
            placeComponents(frame);
            frame.setVisible(true);
            frame.setLocation(300,300);

        }


    private static void placeComponents (final JFrame frame) {
        frame.setLayout(new GridLayout(2,1));
        Container contenedorN = new Container();
        contenedorN.setLayout(new GridLayout(1,3));
        frame.add(contenedorN);

        JLabel etiqueta = new JLabel("Nombre del proyecto:");
        etiqueta.setSize(100, 30);
        etiqueta.setVisible(true);
        contenedorN.add(etiqueta);

        final JTextField busqueda = new JTextField();
        busqueda.setSize(90, 30);
        busqueda.setVisible(true);
        contenedorN.add(busqueda);

        JButton btnbuscar = new JButton();
        btnbuscar.setText("Buscar proyecto");
        contenedorN.add(btnbuscar);
        btnbuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String strbusqueda = busqueda.getText().toString();
                //TODO: FUNCION DE BUSCAR PROYECTO
            }
        });

        JButton btnnuevo = new JButton();
        btnnuevo.setText("Nuevo proyecto");
        Dimension dimbutton = new Dimension(50,30);
        btnnuevo.setMaximumSize(dimbutton);
        frame.add(btnnuevo);
        btnnuevo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO: FUNCION DE CREAR PROYECTO
                frame.setVisible(false);
                crearPanel();
            }
        });

    }

    public static void crearPanel () {
        final JFrame newProject = new JFrame("Crear nuevo proyecto");
        newProject.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Dimension dim2 = new Dimension(500,500);
        newProject.setVisible(true);
        newProject.setMaximumSize(dim2);
        newProject.setMinimumSize(dim2);
        newProject.setLocation(300,300);
        newProject.setLayout(new BorderLayout());


        Container contenedor2 = new Container();
        contenedor2.setLayout(new GridLayout(6,2));
        contenedor2.setVisible(true);
        Container contenedor3 = new Container();
        contenedor3.setLayout(new BorderLayout());
        contenedor3.setVisible(true);

        JLabel label1 = new JLabel("Nombre del proyecto:");
        JTextField tf1 = new JTextField();
        JLabel label2 = new JLabel("Nombre del profesor:");
        JTextField tf2 = new JTextField();
        JLabel label3 = new JLabel("Nombre del alumno:");
        JTextField tf3 = new JTextField();
        JLabel label4 = new JLabel("Estado:");
        JTextField tf4 = new JTextField();
        JLabel label5 = new JLabel("Fecha de inicio:");
        JTextField tf5 = new JTextField();
        JLabel descripcion = new JLabel("Descripcion:");
        JTextField tfDescrip = new JTextField();
        JButton btnguardar = new JButton();
        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO: FUNCION PARA ALMACENAR EN ARCHIVO
                newProject.dispose();
                pantallaInicio();
            }
        });
        JButton btncancelar =  new JButton();
        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                newProject.dispose();
                pantallaInicio();

            }
        });

        contenedor2.add(label1);
        contenedor2.add(tf1);
        contenedor2.add(label2);
        contenedor2.add(tf2);
        contenedor2.add(label3);
        contenedor2.add(tf3);
        contenedor2.add(label4);
        contenedor2.add(tf4);
        contenedor2.add(label5);
        contenedor2.add(tf5);
        contenedor2.add(btnguardar);
        contenedor2.add(btncancelar);


        contenedor3.add(descripcion, BorderLayout.NORTH);
        contenedor3.add(tfDescrip, BorderLayout.CENTER);

        newProject.add(contenedor2, BorderLayout.NORTH);
        newProject.add(contenedor3, BorderLayout.CENTER);

    }

    public static void panelModif () {
        JFrame modif = new JFrame("Crear nuevo proyecto");
        modif.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Dimension dim2 = new Dimension(500,500);
        modif.setVisible(true);
        modif.setMaximumSize(dim2);
        modif.setMinimumSize(dim2);


    }

    }

