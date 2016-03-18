import com.sun.xml.internal.ws.api.ha.StickyFeature;
import com.sun.xml.internal.ws.api.server.Container;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Gonzalo on 16/03/2016.
 */
public class Ventana extends JFrame{

    String titulo;

    public Ventana(String tituloPasado){
        super(tituloPasado);
        setSize(600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        añadirComponentes();
    }

    public void añadirComponentes(){
        JPanel panel = new JPanel();
        GridLayout gl = new GridLayout(5,5,5,5);
        panel.setLayout(gl);
        JButton boton1 = new JButton("Boton1");
        JButton boton2 = new JButton("Boton2");
        JButton boton3 = new JButton("Boton3");
        JButton boton4 = new JButton("Boton4");
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.setVisible(true);
        this.add(panel);
    }
}
