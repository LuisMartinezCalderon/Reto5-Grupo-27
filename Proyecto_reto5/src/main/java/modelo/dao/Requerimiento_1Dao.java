package modelo.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.vo.Requerimiento_1Vo;
import util.JDBCUtilities;

public class Requerimiento_1Dao {
    public ArrayList<String> requerimiento1() throws SQLException {
        ArrayList<String> consultas = new ArrayList<>();
        String sql = "SELECT ID_Lider,Salario ,Ciudad_Residencia  FROM Lider WHERE Ciudad_Residencia ='Barranquilla' AND Salario>1071 ORDER by Salario ASC";
        Connection con = JDBCUtilities.getConnection();

        try (Statement stm = con.createStatement(); var rs = stm.executeQuery(sql)) {

            while (rs.next()) {
                Requerimiento_1Vo consulta = new Requerimiento_1Vo();
                consulta.setID_Lider(rs.getInt("ID_Lider"));
                consulta.setSalario(rs.getString("Salario"));
                consulta.setCiudad_Residencia(rs.getString("Ciudad_Residencia"));
                

                String cons=consulta.getID_Lider()+"";
                String cons1=consulta.getSalario()+"";
                String cons2=consulta.getCiudad_Residencia()+"";
                consultas.add(cons);
                consultas.add(cons1);
                consultas.add(cons2);
            }

 

        }

        return consultas;
    }

   
 }