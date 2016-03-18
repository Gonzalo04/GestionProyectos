import com.sun.xml.internal.ws.api.server.*;

import javax.swing.*;
import java.awt.*;
import java.awt.Container;

/**
 * Created by Gonzalo on 16/03/2016.
 */
public class Ventana {

    JFrame ventana= new JFrame("Gestion de TFG'S");

    public Ventana()
    {
        ventana.setSize(700,700);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
        añadirContenedor(ventana);
        ventana.setVisible(true);
    }

    private void añadirContenedor(JFrame ventana){
        ventana.setLayout(new GridBagLayout());
        Container contenedor= new Container();
        contenedor.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        ventana.add(contenedor);

        JLabel nomPro = new JLabel("Nombre del Proyecto:");
        constraints.gridx=0;
        constraints.gridy=0;
        contenedor.add(nomPro,constraints);

    }
}
