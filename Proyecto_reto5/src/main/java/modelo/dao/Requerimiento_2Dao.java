package modelo.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.vo.Requerimiento_2Vo;
import util.JDBCUtilities;

public class Requerimiento_2Dao {
    public ArrayList<String> requerimiento2() throws SQLException {
        ArrayList<String> consultas = new ArrayList<>();
        String sql = "SELECT P.ID_Proyecto,mc.Nombre_Material ,mc.Importado FROM Proyecto p ,MaterialConstruccion mc NATURAL JOIN Compra c WHERE p.ID_Proyecto IN(1,184,400) ORDER BY p.ID_Proyecto ASC";
        Connection con = JDBCUtilities.getConnection();

        try (Statement stm = con.createStatement(); var rs = stm.executeQuery(sql)) {

            while (rs.next()) {
                Requerimiento_2Vo consulta = new Requerimiento_2Vo();
                consulta.setID_Proyecto(rs.getInt("ID_Proyecto"));
                consulta.setNombre_Material(rs.getString("Nombre_Material"));
                consulta.setImportado(rs.getString("Importado"));

                String cons=consulta.getID_Proyecto()+"";
                String cons1=consulta.getNombre_Material()+"";
                String cons2=consulta.getImportado()+"";
                consultas.add(cons);
                consultas.add(cons1);
                consultas.add(cons2);
                
            }

        }
        return consultas;
    }
}