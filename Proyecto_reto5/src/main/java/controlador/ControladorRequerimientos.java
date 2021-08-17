package controlador;

import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JFrame;

import modelo.dao.ListaTotalideresDao;
//import modelo.dao.ListaTotalideresDao;
import modelo.dao.Requerimiento_1Dao;
import modelo.dao.Requerimiento_2Dao;
import vista.GraficaPrincipal;
import vista.InsertarDatos;
import vista.VistaLideres;
import vista.VistaLisTotal;
import vista.VistaTablaMateriales;

public class ControladorRequerimientos {
    Requerimiento_1Dao re1=new Requerimiento_1Dao();
    Requerimiento_2Dao re2=new Requerimiento_2Dao();
    ListaTotalideresDao r3=new ListaTotalideresDao();
    InsertarDatos vt=new InsertarDatos();
    // Su código

    public ArrayList<String> consultarRequerimiento1() throws SQLException {

       
        return re1.requerimiento1();
        
    }

    public ArrayList<String> consultarRequerimiento2() throws SQLException {
        return re2.requerimiento2();
    }



    public ArrayList<String> consultarRequerimiento3() throws SQLException {
        return r3.requerimiento3();
    }

 

    public void MostrarGraficaPripal() throws SQLException{
        GraficaPrincipal gr=new  GraficaPrincipal();
        gr.setBounds(0,0,900,500);
        gr.setVisible(true);
        gr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gr.setResizable(false);
        gr.setLocationRelativeTo(null);
    }

    
    public void MostrarGrafica() throws SQLException{
        VistaLideres jt=new VistaLideres();
        jt.setBounds(0,0,900,500);
        jt.setVisible(true);
        jt.setResizable(false);
 
        jt.setLocationRelativeTo(null);
        
    }


    public void MostrarGrafica2() throws SQLException{
        VistaTablaMateriales vt=new VistaTablaMateriales();
        vt.setBounds(0,0,900,500);
        vt.setVisible(true);
        vt.setLocationRelativeTo(null);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void MostrarGraficaInsertar() throws SQLException{
       
        vt.setBounds(0,0,400,500);
        vt.setVisible(true);
        vt.setResizable(false);
        vt.setLocationRelativeTo(null);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void MostrarLiderTotal() throws SQLException{
        VistaLisTotal vit = new VistaLisTotal();
        vit.setBounds(0,20,1200,600);
        vit.setVisible(true);
        vit.setResizable(false);
        vit.setLocationRelativeTo(null);
        vit.getContentPane().setBackground(new Color(0,0,0));
        vit.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       
    }
        
    }



