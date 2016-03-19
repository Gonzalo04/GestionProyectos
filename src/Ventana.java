import com.sun.xml.internal.ws.api.server.*;

import javax.swing.*;
import java.awt.*;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

/**
 * Created by Gonzalo on 16/03/2016.
 */
public class Ventana {

    final JFrame ventana= new JFrame("Gestion de TFG'S");

    public Ventana()
    {
        ventana.setSize(700,700);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
        ventana.setLayout(null);
        añadirContenedor(ventana);
        ventana.setVisible(true);
    }

    private void añadirContenedor(final JFrame ventana){
        JLabel Titulo = new JLabel("Gestion de TFG'S");
        Titulo.setBounds(200,10,500,30);
        Titulo.setFont(new java.awt.Font("Tahoma", 0, 36));
        JButton BotonCrear = new JButton("Crear Proyecto");
        BotonCrear.setBounds(475,75,200,75);
        BotonCrear.setFocusPainted(false);
        JButton BotonModifi = new JButton("Modificar TFG");
        BotonModifi.setBounds(475,155,200,75);
        JButton BotonBorrar = new JButton("Borrar TFG");
        BotonBorrar.setBounds(475,235,200,75);
        JLabel Buscar = new JLabel("Buscar Proyecto: ");
        Buscar.setBounds(10,400,150,50);
        JTextField TextBuscar = new JTextField();
        TextBuscar.setBounds(120,410,350,30);
        JButton BotonBuscar = new JButton("Buscar");
        BotonBuscar.setBounds(480,410,190,30);

        ventana.add(Titulo);
        ventana.add(BotonCrear);
        ventana.add(BotonModifi);
        ventana.add(BotonBorrar);
        ventana.add(Buscar);
        ventana.add(TextBuscar);
        ventana.add(BotonBuscar);

        BotonCrear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ventana.setVisible(false);
                crearVentanaNuevoProyecto();

            }
        });
        BotonModifi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ventana.setVisible(false);
                crearVentanaModificarTFG();
            }
        });
    }
    public void crearVentanaNuevoProyecto() {
        final JFrame ventanaNuevo = new JFrame("Gestion de TFG'S - Crear nuevo Proyecto");
        ventanaNuevo.setSize(700,700);
        ventanaNuevo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaNuevo.setResizable(false);
        ventanaNuevo.setLocationRelativeTo(null);
        ventanaNuevo.setVisible(true);
        ventanaNuevo.setLayout(null);
        añadirComponentesNuevoProyecto(ventanaNuevo,ventana);
    }
    public void añadirComponentesNuevoProyecto(final JFrame ventanaNuevo,final JFrame ventana){
        JButton Volver = new JButton("Volver");
        Volver.setBounds(525,615,150,30);

        ventanaNuevo.add(Volver);
        Volver.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                ventanaNuevo.setVisible(false);
                ventana.setVisible(true);
            }
        });
    }
    public void crearVentanaModificarTFG() {
        final JFrame ventanaNuevo = new JFrame("Gestion de TFG'S - Modificar TFG");
        ventanaNuevo.setSize(700,700);
        ventanaNuevo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaNuevo.setResizable(false);
        ventanaNuevo.setLocationRelativeTo(null);
        ventanaNuevo.setVisible(true);
    }
}
