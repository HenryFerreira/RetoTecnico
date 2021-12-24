package Logica.Entidades;

/**
 *
 * @author Haff
 */
public class Pregunta {

    //============================= ATRIBUTOS ================================//
    private Integer id;
    private Integer idCategoria;
    private String pregunta;
    private String correcta;
    //============================= ATRIBUTOS ================================//

    //=========================== CONSTRUCTORES ==============================//
    public Pregunta() {
    }

    public Pregunta(Integer id, Integer idCategoria, String pregunta, String respuesta) {
        this.id = id;
        this.idCategoria = idCategoria;
        this.pregunta = pregunta;
        this.correcta = respuesta;
    }
    //=========================== CONSTRUCTORES ==============================//

    //========================= GETTERS & SETTERS ============================//
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getCorrecta() {
        return correcta;
    }

    public void setCorrecta(String correcta) {
        this.correcta = correcta;
    }
    //========================= GETTERS & SETTERS ============================//

}
