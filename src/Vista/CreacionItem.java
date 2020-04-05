
package Vista;

import Controlador.ClaseControl;
import Modelo.Estado;
import Modelo.Item;
import Modelo.TipoItem;
import Modelo.Usuario;
import java.util.List;
import javax.swing.JOptionPane;


public class CreacionItem extends javax.swing.JFrame {
    
    private ClaseControl claseControl;
    
    public CreacionItem(ClaseControl claseControl) {
        initComponents();
        this.claseControl = claseControl;
        this.setLocationRelativeTo(null); 
         //Inserto los tipos de items que existen en la clase control.
        try{
            List<TipoItem> tipoItems = this.claseControl.getTipoItems();
            tipoItems.forEach((tipo) -> {
                this.boxTipo.addItem(tipo.getNombre());
            });
        }catch (NullPointerException npe){}
        
        //Inserto los usuarios que se encuentran en el sistema
        try{
            List<Usuario> usuarios = this.claseControl.getUsuarios();
            usuarios.forEach((Usuario usuario) -> {
                this.boxResponsable.addItem(usuario.getNombre());
            });
        }catch (NullPointerException npe){}
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPrioridad = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnCrear = new javax.swing.JButton();
        boxResponsable = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        boxTipo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre");

        jLabel2.setText("Prioridad");

        jLabel3.setText("Tipo");

        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        boxResponsable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxResponsableActionPerformed(evt);
            }
        });

        jLabel5.setText("Responsable");

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnVolver)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel1)
                        .addComponent(jLabel5)
                        .addComponent(jLabel2)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 224, Short.MAX_VALUE)
                        .addComponent(btnCrear)
                        .addGap(39, 39, 39))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(boxResponsable, 0, 87, Short.MAX_VALUE)
                            .addComponent(txtNombre)
                            .addComponent(txtPrioridad)
                            .addComponent(boxTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(txtPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(boxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrear)
                    .addComponent(btnVolver))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        try{
            String nombre = txtNombre.getText();
            String priori = txtPrioridad.getText();
            if ((nombre.equals("")) || (priori.equals(""))) {
                    JOptionPane.showMessageDialog(this,"Completar bien los campos");
            }else{
                int prioridad = Integer.parseInt(priori);
                String nombreTipo = (String) boxTipo.getSelectedItem();
                String nombreResponsable = (String) boxResponsable.getSelectedItem();
                List<Usuario> usuarios = claseControl.getUsuarios();
                Usuario responsable = claseControl.buscarUsuario(nombreResponsable);
                TipoItem tipo = claseControl.buscarTipo(nombreTipo);
                Estado estado = tipo.getPrimerEstado();
                Item item = new Item(nombre, prioridad, tipo, estado, responsable);
                this.claseControl.setItem(item);
                JOptionPane.showMessageDialog(this,"Item creado correctamente");
                txtNombre.setText("");
                txtPrioridad.setText("");
            }
        }catch(Exception e) {JOptionPane.showMessageDialog(this,"La prioridad debe ser un numero");}
    }//GEN-LAST:event_btnCrearActionPerformed

    private void boxResponsableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxResponsableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxResponsableActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        java.awt.EventQueue.invokeLater(() -> {
            new PantallaLider(this.claseControl).setVisible(true);
        });
        dispose();       
    }//GEN-LAST:event_btnVolverActionPerformed

    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxResponsable;
    private javax.swing.JComboBox<String> boxTipo;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrioridad;
    // End of variables declaration//GEN-END:variables
}
