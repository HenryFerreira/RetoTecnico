package Logica.Entidades;

/**
 *
 * @author Haff
 */
public class Respuesta {

    //============================= ATRIBUTOS ================================//
    Integer id;
    Integer idPregunta;
    String respusta;
    //============================= ATRIBUTOS ================================//

    //=========================== CONSTRUCTORES ==============================//
    public Respuesta() {
    }

    public Respuesta(Integer id, Integer idPregunta, String respusta) {
        this.id = id;
        this.idPregunta = idPregunta;
        this.respusta = respusta;
    }
    //=========================== CONSTRUCTORES ==============================//

    //========================= GETTERS & SETTERS ============================//
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(Integer idPregunta) {
        this.idPregunta = idPregunta;
    }

    public String getRespusta() {
        return respusta;
    }

    public void setRespusta(String respusta) {
        this.respusta = respusta;
    }
    //========================= GETTERS & SETTERS ============================//

}
