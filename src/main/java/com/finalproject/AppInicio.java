/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.finalproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author darlyn
 */
public class AppInicio extends javax.swing.JFrame {

    ConexionDB con = new ConexionDB();
    Connection conexion = con.conectar();
    public AppInicio() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        logOut = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        btnMenuAlmacen = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("/home/darlyn/NetBeansProjects/finalProject/src/main/java/com/assets/WhatsApp Image 2024-04-05 at 18.48.54.jpeg")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 80, 110));

        jTextArea1.setBackground(new java.awt.Color(0, 102, 102));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Fira Sans", 1, 18)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setText("Este software de gestión hospitalaria\nes una herramienta diseñada para \nmejorar la eficiencia y la calidad\ndel cuidado en las\n instalaciones médicas.");
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 320, 200));

        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("VERSION 8.0.26");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, -1, -1));

        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("jdbc");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 380, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("/home/darlyn/NetBeansProjects/finalProject/src/main/java/com/assets/user50x50.png")); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("/home/darlyn/NetBeansProjects/finalProject/src/main/java/com/assets/Log Out_16x16.png")); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, 30, 30));

        logOut.setBackground(new java.awt.Color(0, 102, 102));
        logOut.setForeground(new java.awt.Color(255, 255, 255));
        logOut.setText("cerrar sesion");
        logOut.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        logOut.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutActionPerformed(evt);
            }
        });
        jPanel1.add(logOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 120, 40));

        jMenu1.setText("INICIO");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("ALMACEN");

        btnMenuAlmacen.setText("MENU DE ALMACEN");
        btnMenuAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuAlmacenActionPerformed(evt);
            }
        });
        jMenu2.add(btnMenuAlmacen);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("PACIENTES");

        jMenuItem1.setText("VER PACIENTES");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setText("AÑADIR PACIENTE");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem3.setText("ELIMINAR PACIENTE");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        AddPaciente addPaciente = new AddPaciente();
        addPaciente.setVisible(true);
        addPaciente.setLocationRelativeTo(null);
        addPaciente.setResizable(false);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void btnMenuAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuAlmacenActionPerformed
        Almacen almacen = new Almacen();
        almacen.setResizable(false);
        almacen.setLocationRelativeTo(null);
        almacen.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMenuAlmacenActionPerformed

    private void logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutActionPerformed
        Log log = new Log();
        log.setTitle("INICIAR SESION");
        log.setResizable(false);
        log.setLocationRelativeTo(null);
        log.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logOutActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        ListaPaciente listaPaciente = new ListaPaciente();
        listaPaciente.setResizable(false);
        listaPaciente.setLocationRelativeTo(null);
        listaPaciente.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        DeletePaciente deletePaciente = new DeletePaciente();
        deletePaciente.setResizable(false);
        deletePaciente.setLocationRelativeTo(null);
        deletePaciente.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem3ActionPerformed


//    private void mostrarUserName(){
//        String consultaSQL = "SELECT nombre FROM datos_persona WHERE correo = '"+"'";
//        if(conexion != null){
//            try {
//                PreparedStatement consulta = conexion.prepareStatement(consultaSQL);
//                ResultSet resultado = consulta.executeQuery();
//                
//                while(resultado.next()){
//                    String userName = resultado.getString("nombre");
//                    lblUser.setText(userName);
//                }
//            } catch(SQLException ex){
//                System.out.println("no se pudo ejecutar la consulta " + ex.getMessage());
//            }
//        }
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnMenuAlmacen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton logOut;
    // End of variables declaration//GEN-END:variables
}
