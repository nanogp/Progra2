
import javax.swing.JOptionPane;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mponti
 */
public class Formulario1 extends javax.swing.JFrame
{

    String nombre;
    String edad;

    /**
     * Creates new form Formulario1
     */
    public Formulario1()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnIngreso = new javax.swing.JButton();
        cmbEdades = new javax.swing.JComboBox<>();
        txtRecibe = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(600, 400));

        lblNombre.setText("Su Nombre");

        txtNombre.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtNombreActionPerformed(evt);
            }
        });

        btnIngreso.setText("Ingresar Nombre");
        btnIngreso.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnIngresoActionPerformed(evt);
            }
        });
        btnIngreso.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btnIngresoKeyPressed(evt);
            }
        });

        cmbEdades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "11", "12", "14", "15", "53" }));
        cmbEdades.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cmbEdadesActionPerformed(evt);
            }
        });

        txtRecibe.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtRecibeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(cmbEdades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(btnIngreso))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNombre)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRecibe, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngreso)
                    .addComponent(cmbEdades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(txtRecibe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(160, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtNombreActionPerformed
    {//GEN-HEADEREND:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void cmbEdadesActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cmbEdadesActionPerformed
    {//GEN-HEADEREND:event_cmbEdadesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEdadesActionPerformed

    private void btnIngresoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnIngresoActionPerformed
    {//GEN-HEADEREND:event_btnIngresoActionPerformed
        //txtNombre.setText("HOLA VITEH");
        txtRecibe.setText(txtNombre.getText());
        nombre = txtNombre.getText();
        edad = (String) cmbEdades.getSelectedItem();
        JOptionPane.showMessageDialog(this, "edad: " + edad + " - nombre: " + nombre, "titulo", JOptionPane.WARNING_MESSAGE);

//JOptionPane.showMessageDialog(this,);
    }//GEN-LAST:event_btnIngresoActionPerformed

    private void btnIngresoKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btnIngresoKeyPressed
    {//GEN-HEADEREND:event_btnIngresoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIngresoKeyPressed

    private void txtRecibeActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtRecibeActionPerformed
    {//GEN-HEADEREND:event_txtRecibeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRecibeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {


        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Formulario1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Formulario1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Formulario1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Formulario1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(
                new Runnable()
        {

            public void run()
            {
                new Formulario1().setVisible(true);
            }
        }
        );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngreso;
    private javax.swing.JComboBox<String> cmbEdades;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRecibe;
    // End of variables declaration//GEN-END:variables
}
