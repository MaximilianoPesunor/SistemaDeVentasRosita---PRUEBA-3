/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.sql.CallableStatement;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author GoldenLion
 */
public class AgregarCliente extends javax.swing.JFrame {

    /**
     * Creates new form MostrarVenta
     */
    public AgregarCliente() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        JNombre = new javax.swing.JTextField();
        jRut = new javax.swing.JTextField();
        jTelefono = new javax.swing.JTextField();
        jNumero = new javax.swing.JTextField();
        jComuna = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jCiudad = new javax.swing.JTextField();
        jCalle = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(102, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Agregar Cliente");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 480, 130));

        JNombre.setBackground(new java.awt.Color(102, 255, 255));
        JNombre.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        JNombre.setForeground(new java.awt.Color(255, 255, 255));
        JNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JNombreActionPerformed(evt);
            }
        });
        getContentPane().add(JNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 230, -1));

        jRut.setBackground(new java.awt.Color(102, 255, 255));
        jRut.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jRut.setForeground(new java.awt.Color(255, 255, 255));
        jRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRutActionPerformed(evt);
            }
        });
        getContentPane().add(jRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 230, -1));

        jTelefono.setBackground(new java.awt.Color(102, 255, 255));
        jTelefono.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTelefono.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 230, -1));

        jNumero.setBackground(new java.awt.Color(102, 255, 255));
        jNumero.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jNumero.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 530, 230, -1));

        jComuna.setBackground(new java.awt.Color(51, 255, 255));
        jComuna.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jComuna.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jComuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 450, 230, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("Agregar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 660, -1, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton3.setText("Volver");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 720, 140, -1));

        jCiudad.setBackground(new java.awt.Color(51, 255, 255));
        jCiudad.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jCiudad.setForeground(new java.awt.Color(255, 255, 255));
        jCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCiudadActionPerformed(evt);
            }
        });
        getContentPane().add(jCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 530, 230, -1));

        jCalle.setBackground(new java.awt.Color(51, 255, 255));
        jCalle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jCalle.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jCalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, 230, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Numero");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 490, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Calle");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Comuna");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 410, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Ciudad");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 490, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Rut");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 80, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Telefono");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, -1, -1));

        jLabel1.setBackground(new java.awt.Color(102, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo celeste.jpg"))); // NOI18N
        jLabel1.setText("Primero debe llenar direccion ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 758));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRutActionPerformed

    private void JNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JNombreActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        Menu.mp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        int rut,numero;
        String nombre;
        
        
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
     
        try{
            String calle = jCalle.getText();
            String comuna = jComuna.getText();
            String ciudad = jCiudad.getText();
            int numero;
            
            numero = Integer.parseInt(jNumero.getText());
            
            ProcedimientoSQL conn= new ProcedimientoSQL();
            Connection con =ProcedimientoSQL.getConexion();
            
            CallableStatement conec = con.prepareCall("{call dbo.AgregarDireccion (?,?,?,?)}");
            
            conec.setString(1, calle);
            conec.setInt(2, numero);
            conec.setString(3, comuna);
            conec.setString(4, ciudad);
            conec.execute();
            
            
     
        }catch(Exception ex){
        }
        try {
            int rut,telefono;
            String nombre = JNombre.getText();
            
            rut = Integer.parseInt(jRut.getText());
            telefono = Integer.parseInt(jTelefono.getText());
            
            ProcedimientoSQL conn= new ProcedimientoSQL();
            Connection con =ProcedimientoSQL.getConexion();
            
            CallableStatement conec = con.prepareCall("{call dbo.AgregarCliente (?,?,?)}");
            
            conec.setInt(1, rut);
            conec.setString(2, nombre);
            conec.setInt(3, telefono);
            conec.execute();
            JOptionPane.showMessageDialog(this,"CLIENTE AGREGADO EXITOSAMENTE");
            
            
          
            
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,"No se puede ingresar el cliente");
        }  
        jCalle.setText(" ");
        jComuna.setText(" ");
        jCiudad.setText(" ");
        jNumero.setText(" ");
        JNombre.setText("  ");
        jRut.setText(" ");
        jTelefono.setText(" ");
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCiudadActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AgregarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JNombre;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JTextField jCalle;
    private javax.swing.JTextField jCiudad;
    private javax.swing.JTextField jComuna;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jNumero;
    private javax.swing.JTextField jRut;
    private javax.swing.JTextField jTelefono;
    // End of variables declaration//GEN-END:variables
public static AgregarCliente mo = new AgregarCliente();
public static Menu mp = new Menu();
}
