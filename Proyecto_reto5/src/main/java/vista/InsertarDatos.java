package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;

import modelo.dao.Insertar;

public class InsertarDatos extends JFrame implements ActionListener {

    private JLabel ID_Lider, Nombre, Primer_Apellido, Segundo_Apellido, Salario, Ciudad_Residencia, Cargo,
            Clasificacion, Documento_Identidad, Fecha_Nacimiento;
    private JTextField ID_Lidert, Nombret, Primer_Apellidot, Segundo_Apellidot, Salariot, Ciudad_Residenciat, Cargot,
            Clasificaciont, Documento_Identidadt, Fecha_Nacimientot;
    private JButton Guardar;
    

    public InsertarDatos() {
        setLayout(null);
        setTitle("Nuevo registro");

        getContentPane().setBackground(new Color(0,0,0));
        setIconImage(new ImageIcon(getClass().getResource("Imagenes/icono.png")).getImage());
      
        ID_Lider = new JLabel("ID Proyecto");
        ID_Lider.setBounds(10, 20, 200, 30);
        ID_Lider.setFont(new Font("Andale Mono",1, 12));  
        ID_Lider.setForeground(new Color(0,176,246));
        add(ID_Lider);

        ID_Lidert = new JTextField();
        ID_Lidert.setBounds(110, 20, 220, 30);
        ID_Lidert.setOpaque(false);
        ID_Lidert.setForeground(new Color(106,135,255));
        add(ID_Lidert);

        Nombre = new JLabel("Nombre");
        Nombre.setBounds(10, 60, 200, 30);
        Nombre.setFont(new Font("Andale Mono",1, 12));  
        Nombre.setForeground(new Color(0,176,246));
        add(Nombre);

        add(ID_Lider);
        Nombret = new JTextField();
        Nombret.setBounds(110, 60, 220, 30);
        Nombret.setOpaque(false);
        Nombret.setForeground(new Color(106,135,255));
        add(Nombret);

        Primer_Apellido = new JLabel("Primer Apellido");
        Primer_Apellido.setBounds(10, 100, 200, 30);
        Primer_Apellido.setFont(new Font("Andale Mono",1, 12));  
        Primer_Apellido.setForeground(new Color(0,176,246));
        add(Primer_Apellido);

        Primer_Apellidot = new JTextField();
        Primer_Apellidot.setBounds(110, 100, 220, 30);
        Primer_Apellidot.setOpaque(false);
        Primer_Apellidot.setForeground(new Color(106,135,255));
        add(Primer_Apellidot);

        Segundo_Apellido = new JLabel("Segundo Apellido");
        Segundo_Apellido.setBounds(10, 140, 220, 30);
        Segundo_Apellido.setFont(new Font("Andale Mono",1, 12));  
        Segundo_Apellido.setForeground(new Color(0,176,246));
        add(Segundo_Apellido);

        Segundo_Apellidot = new JTextField();
        Segundo_Apellidot.setBounds(110, 140, 220, 30);
        Segundo_Apellidot.setOpaque(false);
        Segundo_Apellidot.setForeground(new Color(106,135,255));
        add(Segundo_Apellidot);

        Salario = new JLabel("Salario");
        Salario.setBounds(10, 180, 220, 30);
        Salario.setFont(new Font("Andale Mono",1, 12));  
        Salario.setForeground(new Color(0,176,246));
        add(Salario);

        Salariot = new JTextField();
        Salariot.setBounds(110, 180, 220, 30);
        Salariot.setOpaque(false);
        Salariot.setForeground(new Color(106,135,255));
        add(Salariot);

        Ciudad_Residencia = new JLabel("Ciudad");
        Ciudad_Residencia.setBounds(10, 220, 220, 30);
        Ciudad_Residencia.setFont(new Font("Andale Mono",1, 12));  
        Ciudad_Residencia.setForeground(new Color(0,176,246));
        add(Ciudad_Residencia);

        Ciudad_Residenciat = new JTextField();
        Ciudad_Residenciat.setBounds(110, 220, 220, 30);
        Ciudad_Residenciat.setOpaque(false);
        Ciudad_Residenciat.setForeground(new Color(106,135,255));
        add(Ciudad_Residenciat);

        Cargo = new JLabel("Cargo");
        Cargo.setBounds(10, 260, 220, 30);
        Cargo.setFont(new Font("Andale Mono",1, 12));  
        Cargo.setForeground(new Color(0,176,246));
        add(Cargo);

        Cargot = new JTextField();
        Cargot.setBounds(110, 260, 220, 30);
        Cargot.setOpaque(false);
        Cargot.setForeground(new Color(106,135,255));
        add(Cargot);

        Clasificacion = new JLabel("Clasificación");
        Clasificacion.setBounds(10, 300, 220, 30);
        Clasificacion.setFont(new Font("Andale Mono",1, 12));  
        Clasificacion.setForeground(new Color(0,176,246));
        add(Clasificacion);

        Clasificaciont = new JTextField();
        Clasificaciont.setBounds(110, 300, 220, 30);
        Clasificaciont.setOpaque(false);
        Clasificaciont.setForeground(new Color(106,135,255));
        add(Clasificaciont);

        Documento_Identidad = new JLabel("Documento CC");
        Documento_Identidad.setBounds(10, 340, 220, 30);
        Documento_Identidad.setFont(new Font("Andale Mono",1, 12));  
        Documento_Identidad.setForeground(new Color(0,176,246));
        add(Documento_Identidad);

        Documento_Identidadt = new JTextField();
        Documento_Identidadt.setBounds(110, 340, 220, 30);
        Documento_Identidadt.setOpaque(false);
        Documento_Identidadt.setForeground(new Color(106,135,255));
        add(Documento_Identidadt);

        Fecha_Nacimiento = new JLabel("Fecha Nac..");
        Fecha_Nacimiento.setBounds(10, 380, 220, 30);
        Fecha_Nacimiento.setFont(new Font("Andale Mono",1, 12));  
        Fecha_Nacimiento.setForeground(new Color(0,176,246));
        add(Fecha_Nacimiento);

        Fecha_Nacimientot = new JTextField();
        Fecha_Nacimientot.setBounds(110, 380, 220, 30);
        
        Fecha_Nacimientot.setFont(new Font("Andale Mono",1, 12));  
        Fecha_Nacimientot.setForeground(new Color(106,135,255));
        Fecha_Nacimientot.setOpaque(false);
        add(Fecha_Nacimientot);

        Guardar = new JButton("Guardar");
        Guardar.setBounds(1, 430, 389, 30);
        Guardar.setFont(new Font("Andale Mono",1, 12));  
        Guardar.setForeground(new Color(255,255,255));
        Guardar.setBackground(Color.GREEN);
        add(Guardar);
        Guardar.addActionListener(this);
        UIManager.put("TextField.caretForeground",new ColorUIResource(Color.CYAN) );
      

    }

    public void actionPerformed(ActionEvent e) {
        Insertar inser = new Insertar();

        if (e.getSource() == Guardar){

            try {
                if (ID_Lidert.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Porfavor llene todos los campos");
                }
                else if (Nombret.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Porfavor llene todos los campos"); 

                }
                else if (Primer_Apellidot.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Porfavor llene todos los campos");
                } else if (Segundo_Apellidot.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Porfavor llene todos los campos");
                } else if (Salariot.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Porfavor llene todos los campos");
                } else if (Ciudad_Residenciat.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Porfavor llene todos los campos");
                } else if (Cargot.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Porfavor llene todos los campos");
                } else if (Clasificaciont.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Porfavor llene todos los campos");
                } else if (Documento_Identidadt.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Porfavor llene todos los campos");
                } else if (Fecha_Nacimientot.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Porfavor llene todos los campos");
                } else {
                    inser.InsertarDatos(Integer.parseInt(ID_Lidert.getText().trim()), Nombret.getText(),
                            Primer_Apellidot.getText(), Segundo_Apellidot.getText(),
                            Integer.parseInt(Salariot.getText().trim()), Ciudad_Residenciat.getText(), Cargot.getText(),
                            Integer.parseInt(Clasificaciont.getText().trim()),
                            Integer.parseInt(Documento_Identidadt.getText().trim()), Fecha_Nacimientot.getText());

                    ID_Lidert.setText(null);
                    Nombret.setText(null);
                    Primer_Apellidot.setText(null);
                    Segundo_Apellidot.setText(null);
                    Salariot.setText(null);
                    Ciudad_Residenciat.setText(null);
                    Cargot.setText(null);
                    Clasificaciont.setText(null);
                    Documento_Identidadt.setText(null);
                    Fecha_Nacimientot.setText(null);
               
                }
              
            } catch (SQLException e1) {
                JOptionPane.showMessageDialog(null, "Error al insertar Registro");
                e1.printStackTrace();
            }

               
            

        }

        
    }

}
