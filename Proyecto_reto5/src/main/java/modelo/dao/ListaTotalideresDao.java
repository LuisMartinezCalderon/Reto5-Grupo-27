package modelo.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.vo.ListaTotalLideres;
import util.JDBCUtilities;

public class ListaTotalideresDao {

    public ArrayList<String> requerimiento3() throws SQLException {
        ArrayList<String> consultas = new ArrayList<>();
        String sql = "SELECT * FROM Lider";

        Connection con = JDBCUtilities.getConnection();

        try (Statement stm = con.createStatement(); var rs = stm.executeQuery(sql)) {

            while (rs.next()) {
                ListaTotalLideres consulta = new ListaTotalLideres();
                consulta.setID_Lider(rs.getInt("ID_Lider"));
                consulta.setNombre(rs.getString("Nombre"));
                consulta.setPrimer_Apellido(rs.getString("Primer_Apellido"));
                consulta.setSegundo_Apellido(rs.getString("Segundo_Apellido"));

                consulta.setSalario(rs.getInt("Salario"));

                consulta.setCiudad_Residencia(rs.getString("Ciudad_Residencia"));
                consulta.setCargo(rs.getString("Cargo"));
                consulta.setClasificacion(rs.getInt("Clasificacion"));
                consulta.setDocumento_Identidad(rs.getString("Documento_Identidad"));
                consulta.setFecha_Nacimiento(rs.getString("Fecha_Nacimiento"));

                String cons1 = consulta.getID_Lider() + "";
                String cons2 = consulta.getNombre() + "";
                String cons3 = consulta.getPrimer_Apellido() + "";
                String cons4 = consulta.getSegundo_Apellido() + "";
                String cons5 = consulta.getSalario() + "";
                String cons6 = consulta.getCiudad_Residencia() + "";
                String cons7 = consulta.getCargo() + "";
                String cons8 = consulta.getClasificacion() + "";
                String cons9 = consulta.getDocumento_Identidad() + "";
                String cons10 = consulta.getFecha_Nacimiento() + "";

                consultas.add(cons1);
                consultas.add(cons2);
                consultas.add(cons3);
                consultas.add(cons4);
                consultas.add(cons5);
                consultas.add(cons6);
                consultas.add(cons7);
                consultas.add(cons8);
                consultas.add(cons9);
                consultas.add(cons10);

            }

        }

        return consultas;

    }

}
