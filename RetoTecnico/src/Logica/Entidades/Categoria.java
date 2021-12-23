package Logica.Entidades;

/**
 *
 * @author Haff
 */
public class Categoria {

    private int id;
    private String nombre;
    private int dificultad;

    public Categoria() {
    }

    public Categoria(int id, String nombre, int puntos) {
        this.id = id;
        this.nombre = nombre;
        this.dificultad = puntos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntos() {
        return dificultad;
    }

    public void setPuntos(int puntos) {
        this.dificultad = puntos;
    }

}
