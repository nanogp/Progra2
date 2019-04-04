package forms;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author capacita_mecon
 */
public class frmDialogo extends javax.swing.JDialog
{

    public boolean isDialogResult = false;

    private String nombreUsuario;

    public frmDialogo(java.awt.Frame parent, boolean modal, String texto, int tipoRespuesta)
    {
        super(parent, modal);
        this.setContentPane(new JLabel(new ImageIcon("dialogo-12.png")));
        initComponents();
        reaccionesConDialogo(tipoRespuesta, texto);
        this.txtNombre.setText("Ingrese su nombre");
        this.txtNombre.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent e)
            {
                txtNombre.setText("");
            }

            @Override
            public void focusLost(FocusEvent e)
            {
                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });

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

        jCheckBox1 = new javax.swing.JCheckBox();
        btnAceptar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textoMsj = new javax.swing.JTextArea();
        lblReaccion = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();

        jCheckBox1.setText("jCheckBox1");

        setAlwaysOnTop(true);
        setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        setForeground(java.awt.Color.white);
        setMaximumSize(new java.awt.Dimension(349, 228));
        setMinimumSize(new java.awt.Dimension(349, 228));
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowOpened(java.awt.event.WindowEvent evt)
            {
                formWindowOpened(evt);
            }
        });

        btnAceptar.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("Aceptar");
        btnAceptar.setBorder(null);
        btnAceptar.setBorderPainted(false);
        btnAceptar.setContentAreaFilled(false);
        btnAceptar.setFocusPainted(false);
        btnAceptar.setMaximumSize(new java.awt.Dimension(121, 35));
        btnAceptar.setMinimumSize(new java.awt.Dimension(121, 35));
        btnAceptar.setPreferredSize(new java.awt.Dimension(121, 35));
        btnAceptar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAceptarActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setInheritsPopupMenu(true);
        jScrollPane1.setMaximumSize(new java.awt.Dimension(520, 135));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(520, 135));
        jScrollPane1.setName(""); // NOI18N
        jScrollPane1.setOpaque(false);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(520, 135));
        jScrollPane1.setRequestFocusEnabled(false);
        jScrollPane1.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setWheelScrollingEnabled(false);

        textoMsj.setEditable(false);
        textoMsj.setBackground(new java.awt.Color(35, 44, 105));
        textoMsj.setColumns(20);
        textoMsj.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        textoMsj.setForeground(new java.awt.Color(255, 255, 255));
        textoMsj.setLineWrap(true);
        textoMsj.setRows(2);
        textoMsj.setToolTipText("");
        textoMsj.setWrapStyleWord(true);
        textoMsj.setAutoscrolls(false);
        textoMsj.setBorder(null);
        textoMsj.setCaretColor(new java.awt.Color(153, 0, 204));
        textoMsj.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        textoMsj.setKeymap(null);
        textoMsj.setMaximumSize(new java.awt.Dimension(259, 80));
        textoMsj.setMinimumSize(new java.awt.Dimension(259, 80));
        textoMsj.setOpaque(false);
        textoMsj.setPreferredSize(new java.awt.Dimension(259, 80));
        textoMsj.setRequestFocusEnabled(false);
        textoMsj.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(textoMsj);

        lblReaccion.setToolTipText("");
        lblReaccion.setMaximumSize(new java.awt.Dimension(108, 76));
        lblReaccion.setMinimumSize(new java.awt.Dimension(108, 76));
        lblReaccion.setPreferredSize(new java.awt.Dimension(108, 76));

        txtNombre.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtNombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblReaccion, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtNombre))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblReaccion, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAceptarActionPerformed
    {//GEN-HEADEREND:event_btnAceptarActionPerformed
        if (this.getNombreUsuario() == "invitado")
        {
            this.setNombreUsuario(this.txtNombre.getText());
        }
        this.isDialogResult = true;
        this.setVisible(false);
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtNombreActionPerformed
    {//GEN-HEADEREND:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    /**
     *
     */
    private void reaccionesConDialogo(int tipoRespuesta, String texto)
    {
        this.textoMsj.setText(texto.toUpperCase());//TEXTO QUE VA A DECIR
        this.textoMsj.setOpaque(false);
        jScrollPane1.setBackground(new Color(0, 0, 0));
        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);
        this.btnAceptar.setIcon(new ImageIcon("botones-13.png"));
        this.btnAceptar.setDisabledIcon(new ImageIcon("botones-14.png"));
        this.btnAceptar.setRolloverIcon(new ImageIcon("botones-14.png"));

        switch (tipoRespuesta)
        {
            case 0:
                this.lblReaccion.setIcon(new ImageIcon("108x76_05.jpg"));
                this.txtNombre.setVisible(false);//algo algoo PISTA
                this.setNombreUsuario("invitado");
                break;
            case 1:
                //GANASTE LA PALABRA
                this.txtNombre.setVisible(false);//algo algoo PISTA
                this.lblReaccion.setIcon(new ImageIcon("108x76_15.jpg"));
                break;
            case 2:  //algo algoo PERDISTE
                this.txtNombre.setVisible(true);
                this.lblReaccion.setIcon(new ImageIcon("108x76_06.jpg"));
                break;
            case 3: //GANASTE EL JUEGO
                this.txtNombre.setVisible(true);
                this.lblReaccion.setIcon(new ImageIcon("108x76_15.jpg"));
                break;

        }

    }

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
        }
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(frmDialogo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(frmDialogo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(frmDialogo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(frmDialogo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                frmDialogo dialog = new frmDialogo(new javax.swing.JFrame(), true, null, 0);
                dialog.addWindowListener(new java.awt.event.WindowAdapter()
                {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e)
                    {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblReaccion;
    private javax.swing.JTextArea textoMsj;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    public boolean isIsDialogResult()
    {
        return isDialogResult;
    }

    public void setIsDialogResult(boolean isDialogResult)
    {
        this.isDialogResult = isDialogResult;
    }

    //<editor-fold desc="Atributos">
    // </editor-fold>
    //<editor-fold desc="Constructores">
    // </editor-fold>    
    //<editor-fold desc="Get-Set">
    //</editor-fold>
    //<editor-fold desc="Metodo">
    // </editor-fold>
    public String getNombreUsuario()
    {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario)
    {
        this.nombreUsuario = nombreUsuario;
    }
}