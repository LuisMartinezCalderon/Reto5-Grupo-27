
package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

import controlador.ControladorRequerimientos;

public class VistaTablaMateriales  extends JFrame {
    private JLabel ID_Proyecto,Nombematerial,IMporttado;



    public VistaTablaMateriales () throws SQLException {
        
        setTitle(" Lista de Materiales");

        ID_Proyecto=new JLabel("ID Proyecto");
        ID_Proyecto.setBounds(1,0,292,20);
        ID_Proyecto.setOpaque(true);
        ID_Proyecto.setBackground(Color.RED);
       // Border border =BorderFactory.createLineBorder(Color.GREEN,1);
        ID_Proyecto.setFont(new Font("Andale Mono",1, 12));  
        ID_Proyecto.setForeground(new Color(255,255,255));
        //ID_Proyecto.setBorder(border);
        add(ID_Proyecto);


        Nombematerial=new JLabel("Nombre del Material");
        Nombematerial.setBounds(295,0,292,20);
        Nombematerial.setOpaque(true);
        Nombematerial.setBackground(Color.RED);
        Border border2 =BorderFactory.createLineBorder(Color.RED,1);
        Nombematerial.setFont(new Font("Andale Mono",1, 12));  
        Nombematerial.setForeground(new Color(255,255,255));
        Nombematerial.setBorder(border2);
        add(Nombematerial);

        IMporttado=new JLabel("Importado");
        IMporttado.setBounds(589,0,298,20);
        IMporttado.setOpaque(true);
        IMporttado.setBackground(Color.RED);
       // Border border2 =BorderFactory.createLineBorder(Color.RED,1);
        IMporttado.setFont(new Font("Andale Mono",1, 12));  
        IMporttado.setForeground(new Color(255,255,255));
       // IMporttado.setBorder(border2);
        add(IMporttado);
       
        ControladorRequerimientos controlador = new ControladorRequerimientos();
        getContentPane().setBackground(new Color(0,0,0));
        setIconImage(new ImageIcon(getClass().getResource("Imagenes/icono.png")).getImage());


        DefaultTableModel dtm = new DefaultTableModel();

        dtm.addColumn("ID_Proyecto");
        dtm.addColumn("Nombre del Material,");
        dtm.addColumn("IMporttado");
        String[] datos = new String[3];
        ArrayList<String> Materiales = controlador.consultarRequerimiento2();

        int con1 = -2;
        int con2 = 0;
        int con3 = 1;
        for (int i = 0; i < Materiales.size(); i++) {
            
            if (i == 0) { con1 += 2; }
            if (i > 0) {con1 += 3;}

            if (con1 < Materiales.size()) {
                datos[0] = Materiales.get(con1);

            }

            if (i == 0) {con2++; }
            if (i > 0) { con2 += 3; }

            if (con2 < Materiales.size()) {
                datos[1] = Materiales.get(con2);

            }

            if (i == 0) {con3++; }
            if (i > 0) {con3 += 3;}

            if (con2 < Materiales.size()) {
                datos[2] = Materiales.get(con3);
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
        tables.setBounds(0,20,900,599);
        tables.setGridColor(Color.GREEN);
        tables.setPreferredSize(new Dimension(340, 438));
      

    }


}
