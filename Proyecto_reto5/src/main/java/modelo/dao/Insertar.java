package modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import util.JDBCUtilities;

public class Insertar {
    public void InsertarDatos (int ID_Lider,String Nombre,String Primer_Apellido,String segundoApellido, int Salario,String Ciudad_Residencia,String Cargo,int Clasificacion,int Documento_Identidad,String Fecha_Nacimiento) throws SQLException {
     
        Connection con = JDBCUtilities.getConnection();

        try {
           
           
            String sql = "insert into Lider (ID_Lider,Nombre,Primer_Apellido,Segundo_Apellido,Salario,Ciudad_Residencia,Cargo,Clasificacion,Documento_Identidad,Fecha_Nacimiento) values(?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, ID_Lider);
            pstmt.setString(2,Nombre);
            pstmt.setString(3,Primer_Apellido);
            pstmt.setString(4,segundoApellido);

            pstmt.setInt(5,Salario);

            pstmt.setString(6,Ciudad_Residencia);
            pstmt.setString(7,Cargo);
            pstmt.setInt(8,Clasificacion);
            pstmt.setInt(9,Documento_Identidad);
            pstmt.setString(10,Fecha_Nacimiento);

            pstmt.executeUpdate();
           
            JOptionPane.showMessageDialog(null, "Registro Guardado...");

           

        } catch (Exception e) {
            System.out.println("Se ha producido el siguiente error:" + e.getMessage());
            e.printStackTrace();
        }
    }

    
    }

    
