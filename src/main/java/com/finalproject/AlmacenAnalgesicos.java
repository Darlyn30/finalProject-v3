
package com.finalproject;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;


public class AlmacenAnalgesicos extends javax.swing.JFrame {

    ConexionDB con = new ConexionDB();
    Connection conexion = con.conectar();
    public AlmacenAnalgesicos() {
        initComponents();
        mostrarDatos();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();
        btnHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ANALGESICOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Fira Sans", 1, 36), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(dataTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 600, 290));

        btnHome.setBackground(new java.awt.Color(0, 153, 153));
        btnHome.setFont(new java.awt.Font("Fira Sans", 1, 36)); // NOI18N
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setText("INICIO");
        btnHome.setBorder(null);
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        jPanel1.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 250, 80));

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

        private void mostrarDatos(){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID"); //a?adimos las propiedades de la tabla
        modelo.addColumn("Nombre producto");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio");
        modelo.addColumn("Proveedor");
        modelo.addColumn("Ubicacion");
        dataTable.setModel(modelo); // la seteamos en la tabla
        String consultasSQL = "SELECT * FROM medicamentoss where descripcion like '%Antibiótico%'"; // aqui creamos la consulta que queremos ejecutar
        //segun la funcion
        String data[] = new String[7];
        Statement st;
        
        if(conexion != null){
            try {
                st = conexion.prepareStatement(consultasSQL);
                ResultSet resultado = st.executeQuery(consultasSQL);
                while(resultado.next()){

                    data[0] = resultado.getString("id");
                    data[1] = resultado.getString("nombre_producto");
                    data[2] = resultado.getString("descripcion");
                    data[3] = resultado.getString("cantidad");
                    data[4] = resultado.getString("precio");
                    data[5] = resultado.getString("proveedor");
                    data[6] = resultado.getString("ubicacion");
                    modelo.addRow(data);
                }
            } catch(SQLException ex){
                System.out.println("Error al mostar los datos " + ex.getMessage());
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHome;
    private javax.swing.JTable dataTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
