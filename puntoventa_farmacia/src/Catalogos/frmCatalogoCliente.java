/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Catalogos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author office depot
 */
public class frmCatalogoCliente extends javax.swing.JInternalFrame {
       Connection conexion;
       boolean modifica=false;
    /**
     * Creates new form frmCatalogoCliente
     */
    public frmCatalogoCliente() {
        initComponents();
        setClosable(true);
        setMaximizable(true);
        
         inicializaBaseDeDatos();
         llenaTablaClientes();
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
    
    public void llenaTablaClientes(){
        try{            
            DefaultTableModel model = new DefaultTableModel();
            tablaClientes.setModel(model);
            
            PreparedStatement consulta = conexion.prepareStatement(""
                    + "SELECT * FROM clientes WHERE status=1");                  
            ResultSet rs = consulta.executeQuery();
            
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();            
            for(int i = 1; i <= cantidadColumnas; i++){
                model.addColumn(rsMd.getColumnLabel(i));
            }
            
            while(rs.next()){
                Object[] fila = new Object[cantidadColumnas];
                for(int j=1; j <= cantidadColumnas; j++){
                    fila[j-1] = rs.getObject(j);
                }                
                
                model.addRow(fila);
            }
            
            
        }catch(Exception e){
            e.printStackTrace();
                    
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
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido_paterno = new javax.swing.JTextField();
        txtApellido_materno = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Registro Clientes");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 19, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 85, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Apellido paterno:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 126, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("Apellido materno:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 158, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("Telefono:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 192, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("Email:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 230, -1, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setText("Direccion:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 268, -1, -1));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 142, -1));
        getContentPane().add(txtApellido_paterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 144, -1));
        getContentPane().add(txtApellido_materno, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 158, 142, -1));
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 189, 142, -1));
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 227, 142, -1));
        getContentPane().add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 265, 142, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 0));
        jLabel8.setText("ID:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 55, -1, -1));

        txtId.setText("Nuevo");
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 52, 80, -1));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/guardar.png"))); // NOI18N
        btnGuardar.setToolTipText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 19, 66, -1));

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/modificar.png"))); // NOI18N
        btnModificar.setToolTipText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 19, -1, 57));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eliminar.png"))); // NOI18N
        btnEliminar.setToolTipText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 19, -1, 57));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 303, 799, 10));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 0));
        jLabel9.setText("Buscar cliente:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 343, -1, -1));

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        getContentPane().add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 340, 182, -1));

        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tablaClientes);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 378, 712, 174));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Fondo-color-verde-688051.jpeg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String nombre = txtNombre.getText();
        String apellido_paterno = txtApellido_paterno.getText();
        String apellido_materno = txtApellido_materno.getText();
        String email = txtEmail.getText();
        String telefono = txtTelefono.getText();
        String direccion = txtDireccion.getText();
        int id=0;
         if(modifica){
            id=Integer.parseInt(txtId.getText());
        }
        if (nombre.length() == 0 || apellido_paterno.length() == 0 
                || apellido_materno.length() == 0 || email.length() == 0 
                || telefono.length() == 0 || direccion.length() == 0)
        {
                JOptionPane.showMessageDialog(null, "Debes llenar todos los campos para registrar.");
                return;
        }
        try{            
           PreparedStatement consulta;
            if(modifica){
            consulta=conexion.prepareStatement(""+"UPDATE  clientes SET nombre=?,apellido_paterno=?,apellido_materno=?,email=?,telefono=?,direccion=? WHERE id_cliente=?");
            consulta.setString(1, nombre);
            consulta.setString(2, apellido_paterno);
            consulta.setString(3, apellido_materno);
            consulta.setString(4, email);
            consulta.setString(5, telefono);
            consulta.setString(6, direccion);
            consulta.setInt(7,id);
            }else{
            consulta = conexion.prepareStatement(""
                    + "INSERT INTO clientes(nombre,apellido_paterno,apellido_materno"
                   + ",email,telefono,direccion) VALUES (?,?,?,?,?,?)");                  
           consulta.setString(1, nombre);
           consulta.setString(2, apellido_paterno);
           consulta.setString(3, apellido_materno);
           consulta.setString(4, email);
           consulta.setString(5, telefono);
           consulta.setString(6, direccion);   
            }
           
           consulta.executeUpdate();
           
           llenaTablaClientes();
           
           limpiaCampos();
           
        }catch(Exception e){
            e.printStackTrace();       
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
int id = (int) tablaClientes.getValueAt(tablaClientes.getSelectedRow(), 0);
           String nombre= (String) tablaClientes.getValueAt(tablaClientes.getSelectedRow(), 1);  // 1 es la columna 1=nombre
           String apellido_paterno= (String) tablaClientes.getValueAt(tablaClientes.getSelectedRow(), 2); //2=apellido_paterno
           String apellido_materno= (String) tablaClientes.getValueAt(tablaClientes.getSelectedRow(), 3); 
           String email= (String) tablaClientes.getValueAt(tablaClientes.getSelectedRow(), 4); 
           String telefono= (String) tablaClientes.getValueAt(tablaClientes.getSelectedRow(), 5); 
           String direccion= (String) tablaClientes.getValueAt(tablaClientes.getSelectedRow(), 6); 
           // int telefono= (int) tablaUsuario.getValueAt(tablaUsuario.getSelectedRow(), 4);
           // txtTelefono.setText(""+telefono);
        txtId.setText("" + id);
        txtNombre.setText(nombre);
        txtApellido_paterno.setText(apellido_paterno);   
        txtApellido_materno.setText(apellido_materno);
        txtEmail.setText(email);
        txtTelefono.setText(telefono);
        txtDireccion.setText(direccion);
       
        modifica=true;        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
int id =(int) tablaClientes.getValueAt(tablaClientes.getSelectedRow(), 0);
    
        try{            
           PreparedStatement consulta = conexion.prepareStatement(""
                    + "UPDATE clientes SET status=2 WHERE id_cliente=?");                  
           consulta.setInt(1, id);   
           
           
           consulta.executeUpdate();
           
           llenaTablaClientes();
           limpiaCampos();
           // txtId.setText("Nuevo");
        }catch(Exception e){
            e.printStackTrace();       
        }               // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
try{
        DefaultTableModel model = new DefaultTableModel();
        tablaClientes.setModel(model);
       /* PreparedStatement consulta = conexion.prepareStatement(""
                + "SELECT * FROM usuarios WHERE status=1 AND nombre LIKE ?");     //LIKE --> sirve para comparar cadeenas
                                                                                     //        WHERE campo LIKE '%caracter%'
        consulta.setString(1, "%"+txtBuscar.getText()+"%");*/
        
        PreparedStatement consulta = conexion.prepareStatement(""
                + "SELECT * FROM clientes WHERE status=1 AND nombre LIKE ?");  
        consulta.setString(1, "%"+txtBuscar.getText()+"%");
        ResultSet rs = consulta.executeQuery();                                
        ResultSetMetaData rsMd = rs.getMetaData();
        int cantidadColumnas = rsMd.getColumnCount();
        for (int i=1; i<= cantidadColumnas; i++){
            model.addColumn(rsMd.getColumnLabel(i));
        }
    while (rs.next()){
        Object[] fila = new Object[cantidadColumnas];
        for (int j =1; j<= cantidadColumnas; j++){
            fila[j-1]= rs.getObject(j);
        }
        model.addRow(fila);
    }
    
    
}catch(Exception e){
        e.printStackTrace();
    }        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarKeyReleased

    public void limpiaCampos(){
        txtId.setText("Nuevo");
        txtNombre.setText("");
        txtApellido_paterno.setText("");
        txtApellido_materno.setText("");
        txtEmail.setText("");
        txtTelefono.setText("");
        txtDireccion.setText("");
        modifica=false;
    }
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
            java.util.logging.Logger.getLogger(frmCatalogoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCatalogoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCatalogoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCatalogoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCatalogoCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tablaClientes;
    private javax.swing.JTextField txtApellido_materno;
    private javax.swing.JTextField txtApellido_paterno;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
