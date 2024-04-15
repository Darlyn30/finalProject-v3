
package com.finalproject;

/**
 *
 * @author darlyn
 */
public class Almacen extends javax.swing.JFrame {


    public Almacen() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnGeneral = new javax.swing.JButton();
        btnAnalgesicos = new javax.swing.JButton();
        btnAntibioticos = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ALMACEN", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Fira Sans", 1, 24), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHome.setBackground(new java.awt.Color(51, 102, 255));
        btnHome.setFont(new java.awt.Font("Fira Sans", 1, 36)); // NOI18N
        btnHome.setText("INICIO");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        jPanel1.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 270, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon("/home/darlyn/NetBeansProjects/finalProject/src/main/java/com/assets/WhatsApp Image 2024-04-05 at 18.48.54.jpeg")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        btnGeneral.setBackground(new java.awt.Color(255, 255, 255));
        btnGeneral.setFont(new java.awt.Font("Fira Sans", 1, 24)); // NOI18N
        btnGeneral.setForeground(new java.awt.Color(0, 0, 0));
        btnGeneral.setText("GENERAL");
        btnGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeneralActionPerformed(evt);
            }
        });
        jPanel1.add(btnGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));

        btnAnalgesicos.setBackground(new java.awt.Color(255, 255, 255));
        btnAnalgesicos.setFont(new java.awt.Font("Fira Sans", 1, 24)); // NOI18N
        btnAnalgesicos.setForeground(new java.awt.Color(0, 0, 0));
        btnAnalgesicos.setText("ANALGESICOS");
        btnAnalgesicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalgesicosActionPerformed(evt);
            }
        });
        jPanel1.add(btnAnalgesicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, -1, -1));

        btnAntibioticos.setBackground(new java.awt.Color(255, 255, 255));
        btnAntibioticos.setFont(new java.awt.Font("Fira Sans", 1, 24)); // NOI18N
        btnAntibioticos.setForeground(new java.awt.Color(0, 0, 0));
        btnAntibioticos.setText("ANTIBIOTICOS");
        btnAntibioticos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAntibioticosActionPerformed(evt);
            }
        });
        jPanel1.add(btnAntibioticos, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("/home/darlyn/NetBeansProjects/finalProject/src/main/java/com/assets/frasco para medicina36x36.png")); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 50, 60));

        jLabel4.setIcon(new javax.swing.ImageIcon("/home/darlyn/NetBeansProjects/finalProject/src/main/java/com/assets/frasco para medicina36x36.png")); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("/home/darlyn/NetBeansProjects/finalProject/src/main/java/com/assets/frasco para medicina36x36.png")); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeneralActionPerformed
        AlmacenGeneral general = new AlmacenGeneral();
        general.setLocationRelativeTo(null);
        general.setResizable(false);
        general.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnGeneralActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        AppInicio home = new AppInicio();
        home.setResizable(false);
        home.setLocationRelativeTo(null);
        home.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnAnalgesicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalgesicosActionPerformed
        AlmacenAnalgesicos analgesicos = new AlmacenAnalgesicos();
        analgesicos.setResizable(false);
        analgesicos.setLocationRelativeTo(null);
        analgesicos.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAnalgesicosActionPerformed

    private void btnAntibioticosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAntibioticosActionPerformed
        AlmacenAntibioticos antibioticos = new AlmacenAntibioticos();
        antibioticos.setResizable(false);
        antibioticos.setLocationRelativeTo(null);
        antibioticos.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAntibioticosActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnalgesicos;
    private javax.swing.JButton btnAntibioticos;
    private javax.swing.JButton btnGeneral;
    private javax.swing.JButton btnHome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    // End of variables declaration//GEN-END:variables
}
