package Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author Haff
 */
public class ConexionBD {

    //Variable de conexion
    private static Connection conexion;
    //Variable para las propiedades de la base de datos
    private static Properties prop = new Properties();

    //Se cargan los datos de la base de datos
    static {
        Properties properties = new Properties();
        properties.setProperty("DB_URL", "jdbc:mysql://localhost/apppreguntas");
        properties.setProperty("USER", "root");
        properties.setProperty("PASS", "");
        prop = properties;
    }

    //Contructor por defecto
    public ConexionBD() {

    }

    //Obtener la conexion
    public Connection getConexion() {
        try {//Si La CONEXION es NULA o esta CERRADA
            if (conexion == null || conexion.isClosed()) {
                //Se genera la conexion con los parametros ya seteados antes
                Class.forName("com.mysql.jdbc.Driver");
                conexion = DriverManager.getConnection(prop.getProperty("DB_URL"), prop.getProperty("USER"), prop.getProperty("PASS"));
                System.out.println("Conexion exitosa a la DB");
            }//Se devuelve la conexion
            return conexion;
        } catch (ClassNotFoundException | SQLException e) {
            //Exepcion por si ocurre algun error
            throw new RuntimeException(String.format("Error al conectar a la DB [%s]", e.getMessage()));
        }

    }
}
