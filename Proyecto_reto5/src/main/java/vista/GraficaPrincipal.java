package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import controlador.ControladorRequerimientos;

public class GraficaPrincipal extends JFrame implements ActionListener{

    private JButton BLider,BMateriales,Activarb;
    JButton NuevoRegistro,VistaTol;

    private JLabel LideresL,Materiale ,Registro;

 
    public GraficaPrincipal() {
       setTitle("Administrador");
       setLayout(null);

       getContentPane().setBackground(new Color(0,0,0));
       setIconImage(new ImageIcon(getClass().getResource("Imagenes/icono.png")).getImage());
       URL ruta= GraficaPrincipal.class.getResource("/vista/Imagenes/lideres2.png");
       ImageIcon poner = new ImageIcon(ruta);

       URL ruta2= GraficaPrincipal.class.getResource("/vista/Imagenes/Materiales.png");
       ImageIcon poner1 = new ImageIcon(ruta2);

       URL ruta3= GraficaPrincipal.class.getResource("/vista/Imagenes/registro.png");
       ImageIcon poner3 = new ImageIcon(ruta3);

       URL ruta4= GraficaPrincipal.class.getResource("/vista/Imagenes/LíderesFondo.png");
       ImageIcon poner4 = new ImageIcon(ruta4);

       LideresL=new JLabel("Lista Lideres");
       LideresL.setBounds(30,2,100,10);
       LideresL.setFont(new Font("Andale Mono",3, 12));  
       LideresL.setForeground(new Color(255,255,255));
       add(LideresL);

       BLider =new JButton("Lideres");
       BLider.setBounds(20,20,100,110);
      //  BLider.setBackground(Color.BLUE);
       BLider.setIcon(poner);
      

       Materiale=new JLabel("Lista Materiales");
       Materiale.setBounds(23,140,100,10);
       Materiale.setFont(new Font("Andale Mono",3, 12));  
       Materiale.setForeground(new Color(255,255,255));
       add(Materiale);

       Registro=new JLabel("Nuevo Registro");
       Registro.setBounds(23,280,180,10);
       Registro.setFont(new Font("Andale Mono",3, 12));  
       Registro.setForeground(new Color(255,255,255));
       add(Registro);


       Registro=new JLabel(poner4);
       Registro.setBounds(140,20,722,390);
       add(Registro);


       add(BLider);
       BLider.addActionListener(this);  
       BMateriales =new JButton("Materiales");
       BMateriales.setBounds(20,160,100,110);
       BMateriales.setIcon(poner1);
       add(BMateriales);
       BMateriales.addActionListener(this);

       NuevoRegistro =new JButton("Núevo registro");
       NuevoRegistro.setBounds(20,300,100,110);
       NuevoRegistro.setIcon(poner3);
       add(NuevoRegistro);
       NuevoRegistro.addActionListener(this);

       VistaTol =new JButton("Lista Total Líderes");
       VistaTol.setBounds(20,420,845,30);
       VistaTol.setFont(new Font("Andale Mono",1, 12));  
       VistaTol.setForeground(new Color(255,255,255));
       VistaTol.setOpaque(false);
       VistaTol.setBackground(Color.GREEN);
       add(VistaTol);
       VistaTol.addActionListener(this);


   
       


    }
    ControladorRequerimientos crt =new ControladorRequerimientos();
   @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==Activarb){
           NuevoRegistro.setEnabled(true);
           BLider.setEnabled(true);

       }

       if(e.getSource()==BLider){
        try {
            crt.MostrarGrafica();
           
           BLider.setEnabled(false);
           BMateriales.setEnabled(true);
           NuevoRegistro.setEnabled(true);
           VistaTol.setEnabled(true);
        } catch (SQLException e1) {
           JOptionPane.showMessageDialog(null, "error");
        }

       }

       if(e.getSource()==BMateriales){
        try {
            crt.MostrarGrafica2();
           
           BMateriales.setEnabled(false);
           BLider.setEnabled(true);
           NuevoRegistro.setEnabled(true);
           VistaTol.setEnabled(true);
        } catch (SQLException e1) {
           JOptionPane.showMessageDialog(null, "error");
        }

       }


       if(e.getSource()==NuevoRegistro){
        try {
            crt.MostrarGraficaInsertar();;
            BMateriales.setEnabled(true);
            BLider.setEnabled(true);
            NuevoRegistro.setEnabled(false);
            VistaTol.setEnabled(true);
           
        } catch (SQLException e1) {
           JOptionPane.showMessageDialog(null, "error");
        }
      
       }

       if(e.getSource()==VistaTol){
         try {
             crt.MostrarLiderTotal();
             BMateriales.setEnabled(true);
             BLider.setEnabled(true);
             NuevoRegistro.setEnabled(true);
             VistaTol.setEnabled(false);
            
         } catch (SQLException e1) {
            JOptionPane.showMessageDialog(null, "error");
         }
       
        }
      
    }


    
}
