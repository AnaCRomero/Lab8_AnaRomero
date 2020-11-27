package lab6_anaromero;

import java.util.ArrayList;

/**
 *
 * @author Ana Romero
 */
public class ARCHIVOS {
    private ArrayList <PROGRAMAS> lista = new ArrayList();
    private String nombre;

    public ARCHIVOS() {
    }

    public ARCHIVOS(String nombre, ArrayList lista) {
        this.nombre = nombre;
        this.lista = lista;
    }

    public ArrayList<PROGRAMAS> getLista() {
        return lista;
    }

    public void setLista(ArrayList<PROGRAMAS> lista) {
        this.lista = lista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre + " " +lista ;
    }
}
