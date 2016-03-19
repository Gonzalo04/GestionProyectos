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
        añadirContenedor(ventana);
        ventana.setVisible(true);
    }

    private void añadirContenedor(final JFrame ventana){
        final JPanel panel= new JPanel();
        panel.setLayout(null);
        ventana.add(panel);
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

        panel.add(Titulo);
        panel.add(BotonCrear);
        panel.add(BotonModifi);
        panel.add(BotonBorrar);
        panel.add(Buscar);
        panel.add(TextBuscar);
        panel.add(BotonBuscar);

        BotonCrear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel.setVisible(false);
                panel.removeAll();
                crearVentanaNuevoProyecto(panel);

            }
        });
        BotonModifi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel.setVisible(false);
                panel.removeAll();
                //crearVentanaModificarTFG();
            }
        });
    }
    private void crearVentanaNuevoProyecto(final JPanel panel){
        ventana.setTitle("Gestion de TFG'S - Nuevo Proyecto");
        JPanel panelNuevo = new JPanel();
        panelNuevo.setLayout(null);
        añadirComponentesPanelNuevo(panelNuevo,panel);
        ventana.add(panelNuevo);
    }
    private void añadirComponentesPanelNuevo(final JPanel panelNuevo, final JPanel panel){
        JButton volver = new JButton("Volver");
        volver.setBounds(485,625,200,30);
        panelNuevo.add(volver);
        volver.requestFocus();

        volver.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panelNuevo.setVisible(false);
                panelNuevo.removeAll();
                añadirContenedor(ventana);
            }
        });
    }
}
