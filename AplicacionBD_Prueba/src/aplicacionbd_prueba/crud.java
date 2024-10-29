
package aplicacionbd_prueba;
import java.sql.*;
/**
 *
 * @author Luis Bizarro
 */
public class crud {
    public void crearUsuario(String nombre, String apellido, int membresia) {
        String sql = "INSERT INTO cliente (nombre, apellido,membresia) VALUES (?, ?, ?)";
        
        try {
            Connection con = new ConexionDB().getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,nombre);
            ps.setString(2, apellido);
            ps.setInt(3, membresia);
            ps.executeUpdate();
            System.out.println("Usuario creado exitosamente");
        } catch (SQLException e){
            System.out.println("Error al crear usuario: " + e.getMessage());
        }
    }
    
    public void leerDatos(){
        String sql = "SELECT * FROM cliente";
        try{
            Connection con = new ConexionDB().getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){ // Esto simplemente lee la tabla, mas no la guarda
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                int membresia = rs.getInt("membresia");
                System.out.println("ID: "+id+", Nombre: "+nombre+", Apellido: "+apellido+", Membresia: "+membresia);
            }
        }catch (SQLException e){
            System.out.println("Error al crear usuario: " + e.getMessage());
        }
    }
    
    public void actualizarDatos(String nombre, String apellido, int membresia){
        //Ojo no puedes modificar las llaves primarias(PK)
        String sql = "UPDATE cliente SET nombre = ?,apellido  = ? WHERE membresia = ?";
        try{
            Connection con = new ConexionDB().getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setString(2, apellido);
            ps.setInt(3,membresia);
            ps.executeUpdate();
            System.out.println("Dato actualizado con exito");
        }catch (SQLException e){
            System.out.println("Error al modificar usuario: " + e.getMessage());
        }
    }
    
    public void eliminarDato(int id){
        //Ojo no puedes modificar las llaves primarias(PK)
        String sql = "DELETE FROM cliente WHERE id = ?";
        try{
            Connection con = new ConexionDB().getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Dato eliminado con exito");
        }catch (SQLException e){
            System.out.println("Error al eliminar usuario: " + e.getMessage());
        }
    }
        


}
