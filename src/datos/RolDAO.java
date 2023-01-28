package datos;

import domain.Rol;
import java.sql.*;
import java.util.*;

public class RolDAO {
      
    public List<Rol> seleccionar() {
        Connection conn = Conexion.connect();
        PreparedStatement pst = null;
        ResultSet rs = null;    
        List<Rol> roles = new ArrayList<>();

        try {
            pst = conn.prepareStatement("SELECT * FROM roles");
            rs = pst.executeQuery();
            while (rs.next()) {
                Rol rol = new Rol();
                rol.setId(rs.getInt("id"));
                rol.setRol(rs.getString("rol"));
                roles.add(rol);            
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(pst);
            Conexion.close(conn);
        }
        return roles;
    }
    
    public String rolByUsuarioId(int usuarioId) {
        Connection conn = Conexion.connect();
        PreparedStatement pst = null;
        ResultSet rs = null;    
        String rol = "";

        try {
            pst = conn.prepareStatement("SELECT rol FROM roles WHERE id IN (SELECT rol_id FROM usuario_rol WHERE usuario_id = ?)");
            pst.setInt(1, usuarioId);
            rs = pst.executeQuery();
            while (rs.next()) {
                rol = rs.getString("rol");
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(pst);
            Conexion.close(conn);
        }
        return rol;
    }
    
}
