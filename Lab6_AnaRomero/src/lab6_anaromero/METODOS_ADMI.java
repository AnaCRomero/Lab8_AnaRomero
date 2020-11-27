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
public class METODOS_ADMI {

    private ArrayList<PROGRAMAS> listaProgramas = new ArrayList();
    private File archivo = null;

    public METODOS_ADMI (String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<PROGRAMAS> getListaCel() {
        return listaProgramas;
    }

    public void setListaCel(ArrayList<PROGRAMAS> listaPersonas) {
        this.listaProgramas = listaPersonas;
    }

    @Override
    public String toString() {
        return "" + listaProgramas;
    }

    //extra mutador
    public void setCELULAR(PROGRAMAS p) {
        this.listaProgramas.add(p);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (PROGRAMAS t : listaProgramas) {
                bw.write(t.getNombre() + ";");
                bw.write(t.getPuntuacion()+ ";");
                bw.write(t.getTipo()+ ";");
                bw.write(t.getGenero()+ ";");
                bw.write(t.getFechaLanzamiento()+ ";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listaProgramas = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    listaProgramas.add(new PROGRAMAS(sc.next(),sc.next(),sc.next(),sc.next(),sc.nextInt()));
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }

}
