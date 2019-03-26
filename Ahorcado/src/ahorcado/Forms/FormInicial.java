/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado.Forms;

import ahorcado.Ahorcado;
import ahorcado.Enumerados.Dificultad;
import ahorcado.Excepciones.GanaJuego;
import java.awt.Container;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nano
 */
public class FormInicial extends javax.swing.JFrame
{
    //<editor-fold defaultstate="collapsed" desc="Atributos">
    Ahorcado ahorcado;
    FormEligeNivel nivel;
    PanelUsuario usuario;
    Container contenedor;

    //</editor-fold>
    /**
     * Creates new form FormInicial
     */
    public FormInicial()
    {
        initComponents();
        nivel = new FormEligeNivel(this, true);
        nivel.setLocationRelativeTo(null);
        usuario = new PanelUsuario();
        contenedor = new Container();
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

        jpRank = new javax.swing.JPanel();
        jpInicio = new javax.swing.JPanel();
        jpImagenInicio = new javax.swing.JPanel();
        btnJugar = new javax.swing.JButton();
        jpGameplay = new javax.swing.JPanel();
        menuBar = new javax.swing.JMenuBar();
        mnMenu = new javax.swing.JMenu();
        mnItemNuevo = new javax.swing.JMenuItem();
        mnItemRank = new javax.swing.JMenuItem();
        mnItemSalir = new javax.swing.JMenuItem();

        jpRank.setMaximumSize(null);

        javax.swing.GroupLayout jpRankLayout = new javax.swing.GroupLayout(jpRank);
        jpRank.setLayout(jpRankLayout);
        jpRankLayout.setHorizontalGroup(
            jpRankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        jpRankLayout.setVerticalGroup(
            jpRankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ahorcado"); // NOI18N
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        jpInicio.setAlignmentX(0.0F);
        jpInicio.setAlignmentY(0.0F);
        jpInicio.setMaximumSize(null);
        jpInicio.setPreferredSize(new java.awt.Dimension(800, 600));

        jpImagenInicio.setAlignmentX(0.0F);
        jpImagenInicio.setAlignmentY(0.0F);
        jpImagenInicio.setMaximumSize(null);

        btnJugar.setText("JUGAR");
        btnJugar.setAlignmentY(0.0F);
        btnJugar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnJugarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpImagenInicioLayout = new javax.swing.GroupLayout(jpImagenInicio);
        jpImagenInicio.setLayout(jpImagenInicioLayout);
        jpImagenInicioLayout.setHorizontalGroup(
            jpImagenInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpImagenInicioLayout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addComponent(btnJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(250, Short.MAX_VALUE))
        );
        jpImagenInicioLayout.setVerticalGroup(
            jpImagenInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpImagenInicioLayout.createSequentialGroup()
                .addContainerGap(328, Short.MAX_VALUE)
                .addComponent(btnJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(166, 166, 166))
        );

        javax.swing.GroupLayout jpInicioLayout = new javax.swing.GroupLayout(jpInicio);
        jpInicio.setLayout(jpInicioLayout);
        jpInicioLayout.setHorizontalGroup(
            jpInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpImagenInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpInicioLayout.setVerticalGroup(
            jpInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpImagenInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jpGameplay.setAlignmentX(0.0F);
        jpGameplay.setAlignmentY(0.0F);
        jpGameplay.setMaximumSize(null);
        jpGameplay.setPreferredSize(new java.awt.Dimension(800, 600));

        javax.swing.GroupLayout jpGameplayLayout = new javax.swing.GroupLayout(jpGameplay);
        jpGameplay.setLayout(jpGameplayLayout);
        jpGameplayLayout.setHorizontalGroup(
            jpGameplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jpGameplayLayout.setVerticalGroup(
            jpGameplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        mnMenu.setMnemonic('J');
        mnMenu.setText("Juego");

        mnItemNuevo.setMnemonic('N');
        mnItemNuevo.setText("Nuevo");
        mnItemNuevo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mnItemNuevoActionPerformed(evt);
            }
        });
        mnMenu.add(mnItemNuevo);

        mnItemRank.setMnemonic('R');
        mnItemRank.setText("Ranking");
        mnItemRank.setToolTipText("");
        mnItemRank.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mnItemRankActionPerformed(evt);
            }
        });
        mnMenu.add(mnItemRank);

        mnItemSalir.setMnemonic('S');
        mnItemSalir.setText("Salir");
        mnItemSalir.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mnItemSalirActionPerformed(evt);
            }
        });
        mnMenu.add(mnItemSalir);

        menuBar.add(mnMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jpInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jpGameplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jpInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jpGameplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnItemSalirActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_mnItemSalirActionPerformed
    {//GEN-HEADEREND:event_mnItemSalirActionPerformed
        System.exit(NORMAL);
    }//GEN-LAST:event_mnItemSalirActionPerformed

    private void mnItemNuevoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_mnItemNuevoActionPerformed
    {//GEN-HEADEREND:event_mnItemNuevoActionPerformed
        //llama al evento de presionar btnJugar
        btnJugarActionPerformed(evt);
    }//GEN-LAST:event_mnItemNuevoActionPerformed

    private void mnItemRankActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_mnItemRankActionPerformed
    {//GEN-HEADEREND:event_mnItemRankActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnItemRankActionPerformed

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnJugarActionPerformed
    {//GEN-HEADEREND:event_btnJugarActionPerformed

        //mostrar inicio
        this.setVisible(true);

        //pedir usuario
        this.usuario.addComponentListener(new ComponentListener()
        {
            @Override
            public void componentResized(ComponentEvent e)
            {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void componentMoved(ComponentEvent e)
            {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void componentShown(ComponentEvent e)
            {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void componentHidden(ComponentEvent e)
            {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });

        //contenedor.add(this.usuario);
        //contenedor.setVisible(true);
        //usuario.setVisible(true);
        //this.setVisible(false);

        //pedir dificultad
        nivel.setVisible(true);

        try
        {
            //llamar a nueva partida
            ahorcado.nuevoJuego(ahorcado.getUsuario(), ahorcado.getDificultad());

        }
        catch (GanaJuego ex)
        {
            //CARTELITO de que gano
        }
//jdContenedor.add(jpGameplay);
//jpGameplay.setVisible(true);
    }//GEN-LAST:event_btnJugarActionPerformed

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
            java.util.logging.Logger.getLogger(FormInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(FormInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(FormInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(FormInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new FormInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJugar;
    private javax.swing.JPanel jpGameplay;
    private javax.swing.JPanel jpImagenInicio;
    private javax.swing.JPanel jpInicio;
    private javax.swing.JPanel jpRank;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem mnItemNuevo;
    private javax.swing.JMenuItem mnItemRank;
    private javax.swing.JMenuItem mnItemSalir;
    private javax.swing.JMenu mnMenu;
    // End of variables declaration//GEN-END:variables
}
