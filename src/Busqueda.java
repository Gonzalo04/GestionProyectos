import com.sun.xml.internal.ws.api.ha.StickyFeature;

/**
 * Created by Gonzalo on 16/03/2016.
 */
public class Busqueda {

    String titulo;

    public Busqueda(String tituloPasado){
        titulo=tituloPasado;
    }

    public boolean buscar(){
        System.out.println("El titulo es: "+ titulo);

        return true;
    }
}
