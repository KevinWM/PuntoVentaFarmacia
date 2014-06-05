/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Catalogos;

import busqueda.frmBuscarProducto;
import busqueda.frmBuscarUsuario;
import configuracion.config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author certificacion6
 */
public class frmCatalogoSalida extends javax.swing.JInternalFrame {
 Connection conexion;
     DefaultTableModel model;
    /**
     * Creates new form frmCatalogoSalida
     */
    public frmCatalogoSalida() {
        initComponents();
         setClosable(true);
        setMaximizable(true);
        inicializaBaseDeDatos();
        model = new DefaultTableModel();
        tablaSalida.setModel(model);
        model.addColumn("id_medicamento");
        model.addColumn("medicamento");
        model.addColumn("cantidad");
        
        
        
    }
    public void inicializaBaseDeDatos(){
        try{
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            conexion = DriverManager.
                    getConnection("jdbc:mysql://"
                    + "localhost/farmacia","root","");
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaSalida = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtProducto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        btnBuscarProducto = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tablaSalida.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaSalida);

        jLabel1.setText("Producto:");

        txtProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductoActionPerformed(evt);
            }
        });

        jLabel4.setText("Cantidad:");

        btnBuscarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/medicamento.png"))); // NOI18N
        btnBuscarProducto.setToolTipText("Buscar producto");
        btnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoActionPerformed(evt);
            }
        });

        btnAgregar.setText("Agregar Salida");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar salida");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icon-farm.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/sistem.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAgregar)
                                .addGap(18, 18, 18)
                                .addComponent(btnGuardar))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregar)
                            .addComponent(btnGuardar))))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(161, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
try{
         PreparedStatement consulta = conexion.prepareStatement(""
                    + "INSERT INTO salida (fecha_alta, id_usuario,cantidad) VALUES(NOW(),?,?)");
            consulta.setInt(1, config.id_usuario);
            consulta.setString(2, txtCantidad.getText());
            //consulta.setString(3, "0");
            consulta.executeUpdate();  
             
            consulta = conexion.prepareStatement("SELECT last_insert_id() as id FROM salida");
           ResultSet rs = consulta.executeQuery();    
            if (rs.next()){
            int id_salida= rs.getInt("id");
            for(int i=0;i<tablaSalida.getRowCount();i++){ 
             
                int id_producto= Integer.parseInt(tablaSalida.getValueAt(i, 0).toString());
                int cantidad= Integer.parseInt(tablaSalida.getValueAt(i, 2).toString());
                //  double precio= Double.parseDouble(tablaSalida.getValueAt(i, 2).toString());
                // double total= Double.parseDouble(tablaSalida.getValueAt(i, 4).toString());

                
                consulta=conexion.prepareStatement(""
                        +"INSERT INTO detalle_salida (id_salida,id_producto,cantidad) VALUES (?,?,?)" );
                consulta.setInt(1, id_salida);
                consulta.setInt(2, id_producto);
                consulta.setInt(3, cantidad);
                
                
                //consulta.setDouble(4, precio);
                 // consulta.setDouble(5, total);
                consulta.executeUpdate(); 

                consulta = conexion.prepareStatement("SELECT * FROM medicamento WHERE id_medicamento=?");
                consulta.setInt(1, id_producto);            
                ResultSet rs2 = consulta.executeQuery();    

                if (rs2.next()){
                    int cantidad_medicamentos=rs2.getInt("cantidad");
                    cantidad_medicamentos = cantidad_medicamentos + cantidad;                        
                    consulta = conexion.prepareStatement("UPDATE medicamento SET cantidad=? WHERE id_medicamento = ?");
                    consulta.setInt(1, cantidad_medicamentos);
                    consulta.setInt(2, id_producto);    

                    consulta.executeUpdate(); 
                }            
                
                consulta = conexion.prepareStatement("SELECT * FROM bodega WHERE id_medicamento=?");
                consulta.setInt(1, id_producto);            
                ResultSet rs3 = consulta.executeQuery();    

                if (rs3.next()){
                    int cantidad_bodega=rs3.getInt("cantidad");
                    cantidad_bodega = cantidad_bodega - cantidad;                        
                    consulta = conexion.prepareStatement("UPDATE bodega SET cantidad=? WHERE id_medicamento = ?");
                    consulta.setInt(1, cantidad_bodega);
                    consulta.setInt(2, id_producto);    

                    consulta.executeUpdate(); 
                }                     
                
                  
            }
              JOptionPane.showMessageDialog(null, "Se guardo la venta");
            }
    }catch(Exception e){
         e.printStackTrace();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed

     public void limpiaCampos(){
        txtProducto.setText("");
        txtCantidad.setText("");
       
    }
    private void btnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoActionPerformed
frmBuscarProducto BuscarProducto= new frmBuscarProducto(txtProducto);
        BuscarProducto.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarProductoActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
    try{
            PreparedStatement consulta = conexion.prepareStatement(""
                    + "SELECT * FROM medicamento WHERE status=1 AND id_medicamento=?");
            consulta.setString(1, txtProducto.getText());
            ResultSet rs = consulta.executeQuery();            
            
            rs.next();

            Object[] fila = new Object[5];

            fila[0]=txtProducto.getText();
            fila[1]=rs.getString("nombre");
          //  fila[2]=rs.getString("precio");
            fila[2]=txtCantidad.getText();
           // double precio = Double.parseDouble(rs.getString("precio"));
           // int cantidad = Integer.parseInt(txtCantidad.getText());
          //  double total = precio * cantidad;
          //  fila[4]=""+total;

            model.addRow(fila);        
            limpiaCampos();
            
        }catch(Exception e){
            e.printStackTrace();
        }     // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarActionPerformed

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
            java.util.logging.Logger.getLogger(frmCatalogoSalida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCatalogoSalida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCatalogoSalida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCatalogoSalida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCatalogoSalida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaSalida;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtProducto;
    // End of variables declaration//GEN-END:variables
}
