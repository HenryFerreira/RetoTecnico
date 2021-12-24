package Persistencia.Consultas;

/**
 *
 * @author Haff
 */
public class Consultas_Usuarios {

    //Obtener todos los USUARIOS de la base de datos
    public final String todosLosUsuarios = "SELECT * FROM usuarios";
    public final String altaUsuario = "INSERT INTO usuarios (id, nickname, puntos) VALUES (NULL, ?, ?)";
    public final String modificarPuntuacion = "UPDATE usuarios SET puntos = ? WHERE usuarios.id = ?";
    public final String getUsuarioPorNickname = "SELECT * FROM usuarios U WHERE U.nickname = ?";
    
    


    public Consultas_Usuarios() {
    }
}
