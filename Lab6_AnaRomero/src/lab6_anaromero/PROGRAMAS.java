package lab6_anaromero;

/**
 *
 * @author Ana Romero
 */
public class PROGRAMAS {
    private String nombre,fechaLanzamiento,tipo,genero;
    private int puntuacion;

    public PROGRAMAS() {
    }

    public PROGRAMAS(String nombre, String fechaLanzamiento, String tipo, String genero, int puntuacion) {
        this.nombre = nombre;
        this.fechaLanzamiento = fechaLanzamiento;
        this.tipo = tipo;
        this.genero = genero;
        this.puntuacion = puntuacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(String fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    @Override
    public String toString() {
        return  nombre + "      Decha de lanzamiento: " + fechaLanzamiento + " Tipo: " + tipo + " Genero: " + genero + " Puntuacion: " + puntuacion;
    }
    
    
}
