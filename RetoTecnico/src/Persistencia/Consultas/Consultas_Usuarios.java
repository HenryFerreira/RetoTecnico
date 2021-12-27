package Persistencia.Consultas;

/**
 *
 * @author Haff
 */
public class Consultas_Usuarios {

    //Obtener todos los USUARIOS de la base de datos
    public final String todosLosUsuarios = "SELECT * FROM usuarios U ORDER BY U.puntos DESC";
    //INSERTAR EL USUARIO EN LA BASE DE DATOS
    public final String altaUsuario = "INSERT INTO usuarios (nickname, puntos) VALUES (?, ?)";
    //MODIFICAR LOS PUNTOS DEL USUARIO
    public final String modificarPuntuacion = "UPDATE usuarios SET puntos = ? WHERE usuarios.id = ?";
    //OBTENER EL USUARIO POR EL NICKNAME
    public final String getUsuarioPorNickname = "SELECT * FROM usuarios U WHERE U.nickname = ?";
    //MODIFICAR RONDAS DEL USUARIO
    public final String modificarRondas ="UPDATE usuarios SET rondaMaxima = ? WHERE usuarios.id = ?";

    public Consultas_Usuarios() {
    }
}
