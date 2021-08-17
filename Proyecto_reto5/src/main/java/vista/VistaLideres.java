package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;


import controlador.ControladorRequerimientos;

public class VistaLideres extends JFrame implements ActionListener {
private JLabel idliderJLabel,salarioJlLabel,ciudadJLabel;
   
    public VistaLideres() throws SQLException {
     
     lideres();
       
    }
     public void lideres() throws SQLException{
        getContentPane().setBackground(new Color(0,0,0));
        setTitle("Lista de Líderes");

        idliderJLabel=new JLabel("ID Líder");
        idliderJLabel.setBounds(1,0,292,20);
        idliderJLabel.setOpaque(true);
        idliderJLabel.setBackground(Color.RED);
        idliderJLabel.setFont(new Font("Andale Mono",1, 12));  
        idliderJLabel.setForeground(new Color(255,255,255));
        add(idliderJLabel);


        salarioJlLabel=new JLabel("Salario");
        salarioJlLabel.setBounds(295,0,292,20);
        salarioJlLabel.setOpaque(true);
        salarioJlLabel.setBackground(Color.RED);
        Border border2 =BorderFactory.createLineBorder(Color.RED,1);
        salarioJlLabel.setFont(new Font("Andale Mono",1, 12));  
        salarioJlLabel.setForeground(new Color(255,255,255));
        salarioJlLabel.setBorder(border2);
        add(salarioJlLabel);

        ciudadJLabel=new JLabel("Ciudad de Residencia");
        ciudadJLabel.setBounds(589,0,298,20);
        ciudadJLabel.setOpaque(true);
        ciudadJLabel.setBackground(Color.RED);
       // Border border2 =BorderFactory.createLineBorder(Color.RED,1);
        ciudadJLabel.setFont(new Font("Andale Mono",1, 12));  
        ciudadJLabel.setForeground(new Color(255,255,255));
       // ciudadJLabel.setBorder(border2);
        add(ciudadJLabel);

        ControladorRequerimientos controlador = new ControladorRequerimientos();
      
       

        DefaultTableModel dtm = new DefaultTableModel();
        this.setBackground(Color.RED);
        getContentPane().setFont(new Font("Andale Mono",3, 12));
        setIconImage(new ImageIcon(getClass().getResource("Imagenes/icono.png")).getImage());
        dtm.addColumn("ID_Líder");
        dtm.addColumn("Salario");
        dtm.addColumn("Ciudad");
        String[] datos = new String[3];
        ArrayList<String> lider = controlador.consultarRequerimiento1();

        int con1 = -2;
        int con2 = 0;
        int con3 = 1;
        for (int i = 0; i < lider.size(); i++) {
            
            if (i == 0) { con1 += 2; }
            if (i > 0) {con1 += 3;}

            if (con1 < lider.size()) {
                datos[0] = lider.get(con1);

            }

            if (i == 0) {con2++; }
            if (i > 0) { con2 += 3; }

            if (con2 < lider.size()) {
                datos[1] = lider.get(con2);

            }

            if (i == 0) {con3++; }
            if (i > 0) {con3 += 3;}

            if (con2 < lider.size()) {
                datos[2] = lider.get(con3);
                dtm.addRow(datos);
            }


        }

        final JTable tables = new JTable(dtm);
        tables.setPreferredScrollableViewportSize(new Dimension(250, 100));
        JScrollPane scrollPane = new JScrollPane(tables);
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        tables.setBackground(Color.BLACK);
        tables.setFont(new Font("Andale Mono",3, 12));  
        tables.setForeground(new Color(255,255,255));
        tables.setGridColor(Color.GREEN);
        tables.setPreferredSize(new Dimension(340, 438));
     
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public void setWindowDecorationStyle(int none) {
    }

}
