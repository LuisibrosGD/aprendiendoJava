package aplicacionbd_prueba;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Luis Bizarro
 */
public class ConexionDB {
    public Connection getConnection() {
        Connection connection = null;
        String url = "jdbc:mysql://127.0.0.1:3306/zona_fit_db?serverTimezone=UTC";
        String user = "root"; // Reemplaza con tu usuario de MySQL
        String password = "mondongo"; // Reemplaza con tu contraseña de MySQL

        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión exitosa a la base de datos.");
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }
        return connection;
    }

    
}
