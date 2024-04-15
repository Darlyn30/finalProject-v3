/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.finalproject;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author darlyn
 */
public class Log extends javax.swing.JFrame {


    //atributtes
    public String mail;
    private String pass;
    ConexionDB con = new ConexionDB();
    Connection conexion = con.conectar();
    public Log() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtMail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnSeePass = new javax.swing.JCheckBox();
        txtPass = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnAccess = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Fira Sans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CORREO:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 110, 40));

        txtMail.setBackground(new java.awt.Color(255, 255, 255));
        txtMail.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 300, 40));

        jLabel2.setFont(new java.awt.Font("Fira Sans", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CONTRASEÑA:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 170, 40));

        btnSeePass.setBackground(new java.awt.Color(0, 153, 153));
        btnSeePass.setFont(new java.awt.Font("Fira Sans", 0, 18)); // NOI18N
        btnSeePass.setForeground(new java.awt.Color(255, 255, 255));
        btnSeePass.setText("ver contraseña");
        btnSeePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeePassActionPerformed(evt);
            }
        });
        jPanel1.add(btnSeePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 150, 30));

        txtPass.setBackground(new java.awt.Color(255, 255, 255));
        txtPass.setForeground(new java.awt.Color(0, 0, 0));
        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });
        jPanel1.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 250, 40));

        jLabel3.setFont(new java.awt.Font("Fira Sans", 0, 18)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon("/home/darlyn/NetBeansProjects/finalProject/src/main/java/com/assets/WhatsApp Image 2024-04-05 at 18.48.54.jpeg")); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 80, 90));

        jLabel4.setFont(new java.awt.Font("Fira Sans", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DDA");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 60, 50));

        btnAccess.setBackground(new java.awt.Color(0, 51, 51));
        btnAccess.setFont(new java.awt.Font("Fira Sans", 1, 24)); // NOI18N
        btnAccess.setForeground(new java.awt.Color(255, 255, 255));
        btnAccess.setText("ACCEDER");
        btnAccess.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnAccess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccessActionPerformed(evt);
            }
        });
        jPanel1.add(btnAccess, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 190, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed

    }//GEN-LAST:event_txtPassActionPerformed

    private void btnAccessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccessActionPerformed
        verificarCuenta();
    }//GEN-LAST:event_btnAccessActionPerformed

    private void btnSeePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeePassActionPerformed
        if(btnSeePass.isSelected()){
            txtPass.setEchoChar((char) 0);
        } else {
            txtPass.setEchoChar('*');
        }
    }//GEN-LAST:event_btnSeePassActionPerformed

    
    
    private void verificarCuenta(){
        mail = txtMail.getText();
        pass = txtPass.getText();
        String consultaSQL = "SELECT * FROM datos_cuenta WHERE correo = '"+mail+"' and contra = '"+pass+"'";
        
        try {
            Statement st = conexion.createStatement();
            ResultSet resultado = st.executeQuery(consultaSQL);
            
            if(resultado.next()){
                JOptionPane.showMessageDialog(null, "BIENVENIDO");
                appInicio();
                
            } else {
                JOptionPane.showMessageDialog(null, "mail o contrase?a incorrectos");
            }
        } catch(SQLException ex){
            System.out.println("no se pudo ejecutar la consulta " + ex.getMessage());
        }
    }

    public void appInicio(){
        AppInicio inicio = new AppInicio();
        inicio.setResizable(false);
        inicio.setDefaultCloseOperation(EXIT_ON_CLOSE);
        inicio.setLocationRelativeTo(null);
        inicio.setVisible(true);
        this.setVisible(false);
    }
    
    public void saveMail(){
        mail = txtMail.getText();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccess;
    private javax.swing.JCheckBox btnSeePass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtMail;
    private javax.swing.JPasswordField txtPass;
    // End of variables declaration//GEN-END:variables
}
