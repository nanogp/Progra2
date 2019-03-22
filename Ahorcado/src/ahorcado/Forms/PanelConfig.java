/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado.Forms;

/**
 *
 * @author mponti
 */
public class PanelConfig extends javax.swing.JPanel
{

    /**
     * Creates new form pnlWelcome
     */
    public PanelConfig()
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

        tabConfig = new javax.swing.JTabbedPane();
        pnlConfigInicio = new javax.swing.JPanel();
        lblRankCantidad = new javax.swing.JLabel();
        txtRankCantidad = new javax.swing.JTextField();
        lblDiccionarioCantidad = new javax.swing.JLabel();
        txtDiccionarioCantidad = new javax.swing.JTextField();
        btnIrConfigUsuarios = new javax.swing.JButton();
        btnIrConfigDiccionario = new javax.swing.JButton();
        btnVolverInicio = new javax.swing.JButton();
        pnlConfigUsuarios = new javax.swing.JPanel();
        btnVolverInicioUsr = new javax.swing.JButton();
        pnlConfigDiccionario = new javax.swing.JPanel();
        btnVolverInicioDic = new javax.swing.JButton();

        lblRankCantidad.setText("Cantidad Usuarios en Ranking:");

        txtRankCantidad.setPreferredSize(new java.awt.Dimension(20, 20));
        txtRankCantidad.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtRankCantidadActionPerformed(evt);
            }
        });

        lblDiccionarioCantidad.setText("Cantidad Palabras en Diccionario:");

        txtDiccionarioCantidad.setPreferredSize(new java.awt.Dimension(20, 20));
        txtDiccionarioCantidad.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtDiccionarioCantidadActionPerformed(evt);
            }
        });

        btnIrConfigUsuarios.setText("Configurar Usuarios");
        btnIrConfigUsuarios.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnIrConfigUsuariosActionPerformed(evt);
            }
        });

        btnIrConfigDiccionario.setText("Configurar Diccionario");
        btnIrConfigDiccionario.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnIrConfigDiccionarioActionPerformed(evt);
            }
        });

        btnVolverInicio.setText("Volver al Inicio");
        btnVolverInicio.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnVolverInicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlConfigInicioLayout = new javax.swing.GroupLayout(pnlConfigInicio);
        pnlConfigInicio.setLayout(pnlConfigInicioLayout);
        pnlConfigInicioLayout.setHorizontalGroup(
            pnlConfigInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConfigInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlConfigInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRankCantidad)
                    .addGroup(pnlConfigInicioLayout.createSequentialGroup()
                        .addComponent(lblDiccionarioCantidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlConfigInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btnIrConfigDiccionario)
                            .addComponent(btnIrConfigUsuarios)
                            .addComponent(btnVolverInicio)))
                    .addComponent(txtDiccionarioCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRankCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlConfigInicioLayout.setVerticalGroup(
            pnlConfigInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConfigInicioLayout.createSequentialGroup()
                .addGroup(pnlConfigInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlConfigInicioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblRankCantidad))
                    .addGroup(pnlConfigInicioLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(pnlConfigInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlConfigInicioLayout.createSequentialGroup()
                                .addComponent(txtRankCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblDiccionarioCantidad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDiccionarioCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlConfigInicioLayout.createSequentialGroup()
                                .addComponent(btnIrConfigUsuarios)
                                .addGap(43, 43, 43)
                                .addComponent(btnIrConfigDiccionario)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVolverInicio)
                .addGap(29, 29, 29))
        );

        tabConfig.addTab("Inicio Configuración", pnlConfigInicio);

        btnVolverInicioUsr.setText("Volver al Inicio");
        btnVolverInicioUsr.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnVolverInicioUsr.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnVolverInicioUsrActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlConfigUsuariosLayout = new javax.swing.GroupLayout(pnlConfigUsuarios);
        pnlConfigUsuarios.setLayout(pnlConfigUsuariosLayout);
        pnlConfigUsuariosLayout.setHorizontalGroup(
            pnlConfigUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
            .addGroup(pnlConfigUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlConfigUsuariosLayout.createSequentialGroup()
                    .addGap(229, 229, 229)
                    .addComponent(btnVolverInicioUsr)
                    .addContainerGap(34, Short.MAX_VALUE)))
        );
        pnlConfigUsuariosLayout.setVerticalGroup(
            pnlConfigUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 244, Short.MAX_VALUE)
            .addGroup(pnlConfigUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlConfigUsuariosLayout.createSequentialGroup()
                    .addGap(139, 139, 139)
                    .addComponent(btnVolverInicioUsr)
                    .addContainerGap(80, Short.MAX_VALUE)))
        );

        tabConfig.addTab("Ranking Usuarios", pnlConfigUsuarios);

        btnVolverInicioDic.setText("Volver al Inicio");
        btnVolverInicioDic.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnVolverInicioDic.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnVolverInicioDicActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlConfigDiccionarioLayout = new javax.swing.GroupLayout(pnlConfigDiccionario);
        pnlConfigDiccionario.setLayout(pnlConfigDiccionarioLayout);
        pnlConfigDiccionarioLayout.setHorizontalGroup(
            pnlConfigDiccionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConfigDiccionarioLayout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(btnVolverInicioDic)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        pnlConfigDiccionarioLayout.setVerticalGroup(
            pnlConfigDiccionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConfigDiccionarioLayout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(btnVolverInicioDic)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        tabConfig.addTab("Palabras en Diccionario", pnlConfigDiccionario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 409, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(tabConfig, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(tabConfig, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtRankCantidadActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtRankCantidadActionPerformed
    {//GEN-HEADEREND:event_txtRankCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRankCantidadActionPerformed

    private void txtDiccionarioCantidadActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtDiccionarioCantidadActionPerformed
    {//GEN-HEADEREND:event_txtDiccionarioCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiccionarioCantidadActionPerformed

    private void btnIrConfigUsuariosActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnIrConfigUsuariosActionPerformed
    {//GEN-HEADEREND:event_btnIrConfigUsuariosActionPerformed
        this.tabConfig.setSelectedIndex(1);
    }//GEN-LAST:event_btnIrConfigUsuariosActionPerformed

    private void btnIrConfigDiccionarioActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnIrConfigDiccionarioActionPerformed
    {//GEN-HEADEREND:event_btnIrConfigDiccionarioActionPerformed
        this.tabConfig.setSelectedIndex(2);
    }//GEN-LAST:event_btnIrConfigDiccionarioActionPerformed

    private void btnVolverInicioActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnVolverInicioActionPerformed
    {//GEN-HEADEREND:event_btnVolverInicioActionPerformed
        this.tabConfig.setVisible(Boolean.FALSE);
    }//GEN-LAST:event_btnVolverInicioActionPerformed

    private void btnVolverInicioUsrActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnVolverInicioUsrActionPerformed
    {//GEN-HEADEREND:event_btnVolverInicioUsrActionPerformed
        this.btnVolverInicioActionPerformed(evt);
    }//GEN-LAST:event_btnVolverInicioUsrActionPerformed

    private void btnVolverInicioDicActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnVolverInicioDicActionPerformed
    {//GEN-HEADEREND:event_btnVolverInicioDicActionPerformed
        this.btnVolverInicioActionPerformed(evt);
    }//GEN-LAST:event_btnVolverInicioDicActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIrConfigDiccionario;
    private javax.swing.JButton btnIrConfigUsuarios;
    private javax.swing.JButton btnVolverInicio;
    private javax.swing.JButton btnVolverInicioDic;
    private javax.swing.JButton btnVolverInicioUsr;
    private javax.swing.JLabel lblDiccionarioCantidad;
    private javax.swing.JLabel lblRankCantidad;
    private javax.swing.JPanel pnlConfigDiccionario;
    private javax.swing.JPanel pnlConfigInicio;
    private javax.swing.JPanel pnlConfigUsuarios;
    private javax.swing.JTabbedPane tabConfig;
    private javax.swing.JTextField txtDiccionarioCantidad;
    private javax.swing.JTextField txtRankCantidad;
    // End of variables declaration//GEN-END:variables
}