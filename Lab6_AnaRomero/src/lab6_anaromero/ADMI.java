package lab6_anaromero;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ana Romero
 */
public class ADMI {

    private ArrayList<PROGRAMAS> listaprogramas = new ArrayList();
    private File archivo = null;

    public ADMI(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<PROGRAMAS> getListaProgramas() {
        return listaprogramas;
    }

    public void setListaProgramas(ArrayList<PROGRAMAS> listaPersonas) {
        this.listaprogramas = listaPersonas;
    }

    @Override
    public String toString() {
        return "" + listaprogramas;
    }

    //extra mutador
    public void setPROGRAMAS(PROGRAMAS p) {
        this.listaprogramas.add(p);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (PROGRAMAS t : listaprogramas) {
                bw.write(t.getNombre()+ "/");
                bw.write(t.getPuntuacion()+ "/");
                bw.write(t.getFechaLanzamiento()+ "/");
                bw.write(t.getTipo() + "/");
                bw.write(t.getGenero()+ "/");
                bw.write("\n");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listaprogramas = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter("/");
                while (sc.hasNext()) {
                    listaprogramas.add(new PROGRAMAS(sc.next(),sc.next(),sc.next(),sc.next(),sc.nextInt()));
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
}
