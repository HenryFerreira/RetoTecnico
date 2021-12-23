package Logica.Entidades;

/**
 *
 * @author Haff
 */
public class Pregunta {

    private int id;
    private int idCategoria;
    private String pregunta;
    private String incorrecta1;
    private String incorrecta2;
    private String incorrecta3;
    private String correcta;

    public Pregunta() {
    }

    public Pregunta(int id, int idCategoria, String pregunta, String incorrecta1, String incorrecta2, String incorrecta3, String correcta) {
        this.id = id;
        this.idCategoria = idCategoria;
        this.pregunta = pregunta;
        this.incorrecta1 = incorrecta1;
        this.incorrecta2 = incorrecta2;
        this.incorrecta3 = incorrecta3;
        this.correcta = correcta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getIncorrecta1() {
        return incorrecta1;
    }

    public void setIncorrecta1(String incorrecta1) {
        this.incorrecta1 = incorrecta1;
    }

    public String getIncorrecta2() {
        return incorrecta2;
    }

    public void setIncorrecta2(String incorrecta2) {
        this.incorrecta2 = incorrecta2;
    }

    public String getIncorrecta3() {
        return incorrecta3;
    }

    public void setIncorrecta3(String incorrecta3) {
        this.incorrecta3 = incorrecta3;
    }

    public String getCorrecta() {
        return correcta;
    }

    public void setCorrecta(String correcta) {
        this.correcta = correcta;
    }

}
