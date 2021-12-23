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
    private static Connection conexion;
    private static Properties prop = new Properties();

    static {
        Properties properties = new Properties();
        properties.setProperty("DB_URL", "jdbc:mysql://localhost/apppreguntas");
        properties.setProperty("USER", "root");
        properties.setProperty("PASS", "");
        prop = properties;
    }

    public ConexionBD() {

    }

    public Connection getConexion() {
        try {
            if (conexion == null || conexion.isClosed()) {
                Class.forName("com.mysql.jdbc.Driver");

                conexion = DriverManager.getConnection(prop.getProperty("DB_URL"), prop.getProperty("USER"), prop.getProperty("PASS"));
                System.err.println("Conexion exitosa a la DB");
            }
            return conexion;
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(String.format("Error al conectar a la DB [%s]", e.getMessage()));
        }

    }
}
