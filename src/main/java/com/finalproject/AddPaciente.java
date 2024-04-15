/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.finalproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author darlyn
 */
public class AddPaciente extends javax.swing.JFrame {

    ConexionDB con = new ConexionDB();
    Connection conexion = con.conectar();
    public AddPaciente() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtCedula = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        box = new javax.swing.JComboBox<>();
        btnHome = new javax.swing.JButton();
        btnSave1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "AÑADIR PACIENTE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Fira Sans", 1, 36), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCedula.setBackground(new java.awt.Color(255, 255, 255));
        txtCedula.setForeground(new java.awt.Color(0, 0, 0));
        txtCedula.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CEDULA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Fira Sans", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel2.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 300, 50));

        txtName.setBackground(new java.awt.Color(255, 255, 255));
        txtName.setForeground(new java.awt.Color(0, 0, 0));
        txtName.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NOMBRE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Fira Sans", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel2.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 300, 50));

        txtLastName.setBackground(new java.awt.Color(255, 255, 255));
        txtLastName.setForeground(new java.awt.Color(0, 0, 0));
        txtLastName.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "APELLIDO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Fira Sans", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel2.add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 300, 50));

        box.setBackground(new java.awt.Color(0, 51, 255));
        box.setFont(new java.awt.Font("Fira Sans", 1, 18)); // NOI18N
        box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECCIONAR--", "CONSULTA", "CHEQUEO RUTINARIO" }));
        jPanel2.add(box, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 330, 60));

        btnHome.setBackground(new java.awt.Color(0, 102, 102));
        btnHome.setFont(new java.awt.Font("Fira Sans", 1, 18)); // NOI18N
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setText("INICIO");
        btnHome.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        jPanel2.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, 120, 60));

        btnSave1.setBackground(new java.awt.Color(0, 102, 102));
        btnSave1.setFont(new java.awt.Font("Fira Sans", 1, 18)); // NOI18N
        btnSave1.setForeground(new java.awt.Color(255, 255, 255));
        btnSave1.setText("AGREGAR");
        btnSave1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnSave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnSave1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, -1, 140));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 570, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        AppInicio home = new AppInicio();
        home.setResizable(false);
        home.setLocationRelativeTo(null);
        home.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnSave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave1ActionPerformed
        AppInicio home = new AppInicio();
        addCustomer();
        JOptionPane.showMessageDialog(null, "PACIENTE AGENDADO CORRECTAMENTE");
        home.setResizable(false);
        home.setLocationRelativeTo(null);
        home.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnSave1ActionPerformed


    private void addCustomer(){
        
        String consultaSQL = "INSERT INTO pacientes values (?,?,?,?)";
        if(conexion != null){
            try {
                PreparedStatement consulta = conexion.prepareStatement(consultaSQL);
                consulta.setString(1, txtCedula.getText());
                consulta.setString(2, txtName.getText());
                consulta.setString(3, txtLastName.getText()); // este es el apellido
                consulta.setString(4, box.getSelectedItem().toString());
                consulta.executeUpdate();
                JOptionPane.showMessageDialog(null, "el paciente se ha registrado correctamente");
            } catch(SQLException ex){
                System.out.println("no se pudo ejecutar la consulta " + ex.getMessage());
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> box;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnSave1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
