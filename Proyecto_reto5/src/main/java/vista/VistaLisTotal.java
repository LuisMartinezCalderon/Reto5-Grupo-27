package vista;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controlador.ControladorRequerimientos;

public class VistaLisTotal extends JFrame {
    private JLabel nombres;

public VistaLisTotal() throws SQLException{
  
    setTitle("Materiales");
    nombres=new JLabel("ID Líder");
    nombres.setBounds(0,0,117,20);
    nombres.setOpaque(true);
    nombres.setBackground(Color.RED);
    nombres.setFont(new Font("Andale Mono",1, 12));  
    nombres.setForeground(new Color(255,255,255));
    add(nombres);


    nombres=new JLabel("Nombres");
    nombres.setBounds(118,0,116,20);
    nombres.setOpaque(true);
    nombres.setBackground(Color.RED);
    nombres.setFont(new Font("Andale Mono",1, 12));  
    nombres.setForeground(new Color(255,255,255));
    add(nombres);
  
    nombres=new JLabel("Primer Apellido");
    nombres.setBounds(235,0,116,20);
    nombres.setOpaque(true);
    nombres.setBackground(Color.RED);
    nombres.setFont(new Font("Andale Mono",1, 12));  
    nombres.setForeground(new Color(255,255,255));
    add(nombres);

    nombres=new JLabel("Segundo Apellido");
    nombres.setBounds(352,0,115,20);
    nombres.setOpaque(true);
    nombres.setBackground(Color.RED);
    nombres.setFont(new Font("Andale Mono",1, 12));  
    nombres.setForeground(new Color(255,255,255));
    add(nombres);

    nombres=new JLabel("Salario");
    nombres.setBounds(468,0,116,20);
    nombres.setOpaque(true);
    nombres.setBackground(Color.RED);
    nombres.setFont(new Font("Andale Mono",1, 12));  
    nombres.setForeground(new Color(255,255,255));
    add(nombres);
    nombres=new JLabel("Ciudad_Residencia");
    nombres.setBounds(585,0,115,20);
    nombres.setOpaque(true);
    nombres.setBackground(Color.RED);
    nombres.setFont(new Font("Andale Mono",1, 12));  
    nombres.setForeground(new Color(255,255,255));
    add(nombres);

    nombres=new JLabel("Cargo");
    nombres.setBounds(701,0,115,20);
    nombres.setOpaque(true);
    nombres.setBackground(Color.RED);
    nombres.setFont(new Font("Andale Mono",1, 12));  
    nombres.setForeground(new Color(255,255,255));
    add(nombres);

    nombres=new JLabel("Clasificacion");
    nombres.setBounds(701,0,116,20);
    nombres.setOpaque(true);
    nombres.setBackground(Color.RED);
    nombres.setFont(new Font("Andale Mono",1, 12));  
    nombres.setForeground(new Color(255,255,255));
    add(nombres);


    nombres=new JLabel("Clasificacion");
    nombres.setBounds(818,0,115,20);
    nombres.setOpaque(true);
    nombres.setBackground(Color.RED);
    nombres.setFont(new Font("Andale Mono",1, 12));  
    nombres.setForeground(new Color(255,255,255));
    add(nombres);

    nombres=new JLabel("Documento Identidad");
    nombres.setBounds(934,0,116,20);
    nombres.setOpaque(true);
    nombres.setBackground(Color.RED);
    nombres.setFont(new Font("Andale Mono",1, 12));  
    nombres.setForeground(new Color(255,255,255));
    add(nombres);

    nombres=new JLabel("Fecha Nacimiento");
    nombres.setBounds(1051,0,116,20);
    nombres.setOpaque(true);
    nombres.setBackground(Color.RED);
    nombres.setFont(new Font("Andale Mono",1, 12));  
    nombres.setForeground(new Color(255,255,255));
    add(nombres);
  
   
    ControladorRequerimientos controlador = new ControladorRequerimientos();
    getContentPane().setBackground(new Color(0,0,0));
    setIconImage(new ImageIcon(getClass().getResource("Imagenes/icono.png")).getImage());


    DefaultTableModel dtm = new DefaultTableModel();
  
    dtm.addColumn("ID_Lider");
    dtm.addColumn("Nombre,");
    dtm.addColumn("Primer_Apellido");
    dtm.addColumn("Segundo_Apellido");
    dtm.addColumn("Salario");
    dtm.addColumn("Ciudad_Residencia");
    dtm.addColumn("Cargo");
    dtm.addColumn("Clasificacion");
    dtm.addColumn("Documento_Identidad");
    dtm.addColumn("Fecha_Nacimiento");
    String[] datos = new String[10];
    ArrayList<String> Listatotalideres = controlador.consultarRequerimiento3();

    int con1 = -2;
    int con2 = 0;
    int con3 = 1;
    int con4 = 2;
    int con5 = 3;
    int con6 = 4;
    int con7 = 5;
    int con8 = 6;
    int con9 = 7;
    int con10 = 8;
    for (int i = 0; i < Listatotalideres.size(); i++) {
        
        if (i == 0) { con1 += 2; }
        if (i > 0) {con1 += 10;}

        if (con1 < Listatotalideres.size()) {
            datos[0] = Listatotalideres.get(con1);

        }

        if (i == 0) {con2++; }
        if (i > 0) { con2 += 10; }

        if (con2 < Listatotalideres.size()) {
            datos[1] = Listatotalideres.get(con2);

        }

        if (i == 0) {con3++; }
        if (i > 0) {con3 += 10;}

        if (con2 < Listatotalideres.size()) {
            datos[2] = Listatotalideres.get(con3);
           
        }

        if (i == 0) {con4++; }
        if (i > 0) {con4 += 10;}

        if (con2 < Listatotalideres.size()) {
            datos[3] = Listatotalideres.get(con4);
           
        }

        if (i == 0) {con5++; }
        if (i > 0) {con5 += 10;}

        if (con2 < Listatotalideres.size()) {
            datos[4] = Listatotalideres.get(con5);
           
        }

        if (i == 0) {con6++; }
        if (i > 0) {con6 += 10;}

        if (con2 < Listatotalideres.size()) {
            datos[5] = Listatotalideres.get(con6);
           
        }
        if (i == 0) {con7++; }
        if (i > 0) {con7 += 10;}

        if (con2 < Listatotalideres.size()) {
            datos[6] = Listatotalideres.get(con7);
           
        }

        if (i == 0) {con8++; }
        if (i > 0) {con8 += 10;}

        if (con2 < Listatotalideres.size()) {
            datos[7] = Listatotalideres.get(con8);
           
        }

        if (i == 0) {con9++; }
        if (i > 0) {con9 += 10;}

        if (con2 < Listatotalideres.size()) {
            datos[8] = Listatotalideres.get(con9);
           
        }

        if (i == 0) {con10++; }
        if (i > 0) {con10 += 10;}

        if (con2 < Listatotalideres.size()) {
            datos[9] = Listatotalideres.get(con10);
            dtm.addRow(datos);
        }
        
     
     
    }
   

    final JTable tables = new JTable(dtm);
    tables.setPreferredScrollableViewportSize(new Dimension(300, 100));
    JScrollPane scrollPane = new JScrollPane(tables);
    getContentPane().add(scrollPane, BorderLayout.CENTER);
    tables.setBackground(Color.CYAN);
    tables.setFont(new Font("Andale Mono",1, 12));  
    tables.setForeground(new Color(20,25,25));
    tables.setBounds(0,0,900,599);
    tables.setGridColor(Color.BLACK);
 
 
}
}
    
    

