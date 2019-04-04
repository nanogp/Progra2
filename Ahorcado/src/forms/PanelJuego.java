package forms;

import ahorcado.Main;
import excepciones.GanaJuego;
import excepciones.GanaPartida;
import excepciones.PierdePartida;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class PanelJuego extends javax.swing.JPanel
{

    //<editor-fold defaultstate="collapsed" desc="Autogenerado">
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        panelTeclado = new javax.swing.JPanel();
        panelImagen = new javax.swing.JPanel();
        panelPalabra = new javax.swing.JPanel();

        setMaximumSize(new java.awt.Dimension(791, 536));
        setMinimumSize(new java.awt.Dimension(791, 536));
        setOpaque(false);
        addComponentListener(new java.awt.event.ComponentAdapter()
        {
            public void componentShown(java.awt.event.ComponentEvent evt)
            {
                formComponentShown(evt);
            }
        });

        panelTeclado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        panelTeclado.setMaximumSize(new java.awt.Dimension(443, 227));
        panelTeclado.setMinimumSize(new java.awt.Dimension(443, 227));
        panelTeclado.setOpaque(false);
        panelTeclado.setPreferredSize(new java.awt.Dimension(443, 227));

        javax.swing.GroupLayout panelTecladoLayout = new javax.swing.GroupLayout(panelTeclado);
        panelTeclado.setLayout(panelTecladoLayout);
        panelTecladoLayout.setHorizontalGroup(
            panelTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 441, Short.MAX_VALUE)
        );
        panelTecladoLayout.setVerticalGroup(
            panelTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 225, Short.MAX_VALUE)
        );

        panelImagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        panelImagen.setMaximumSize(new java.awt.Dimension(300, 360));
        panelImagen.setMinimumSize(new java.awt.Dimension(300, 360));

        javax.swing.GroupLayout panelImagenLayout = new javax.swing.GroupLayout(panelImagen);
        panelImagen.setLayout(panelImagenLayout);
        panelImagenLayout.setHorizontalGroup(
            panelImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );
        panelImagenLayout.setVerticalGroup(
            panelImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 358, Short.MAX_VALUE)
        );

        panelPalabra.setBackground(new java.awt.Color(255, 255, 255));
        panelPalabra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        panelPalabra.setMaximumSize(new java.awt.Dimension(749, 50));
        panelPalabra.setMinimumSize(new java.awt.Dimension(749, 50));
        panelPalabra.setPreferredSize(new java.awt.Dimension(749, 50));

        javax.swing.GroupLayout panelPalabraLayout = new javax.swing.GroupLayout(panelPalabra);
        panelPalabra.setLayout(panelPalabraLayout);
        panelPalabraLayout.setHorizontalGroup(
            panelPalabraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelPalabraLayout.setVerticalGroup(
            panelPalabraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelPalabra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelTeclado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelTeclado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(panelPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt)//GEN-FIRST:event_formComponentShown
    {//GEN-HEADEREND:event_formComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentShown

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panelImagen;
    private javax.swing.JPanel panelPalabra;
    private javax.swing.JPanel panelTeclado;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Atributos">

    JButton[] botones;
    Container cp;
    JLabel[] letras;

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructor">
    public PanelJuego()
    {
        botones = new JButton[28];
        initComponents();
        iniciarTeclado();
        actualizarImagen();
        iniciarPalabra();

    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodos">
    public void actualizarImagen()
    {
        if (this.panelImagen != null)
        {
            this.panelImagen.removeAll();
        }

        Container cp = this.panelImagen;
        GridLayout gl = new GridLayout(1, 1);
        cp.setLayout(gl);
        String archivoImagen = "meme/meme-0" + Integer.toString(Main.backend.getContadorFallos() + 1) + ".jpg";
        System.out.println("imagen: " + archivoImagen);
        ImageIcon tiros = new ImageIcon(archivoImagen);
        JLabel lblImagen = new JLabel(tiros);
        cp.add(lblImagen);
    }

    public void iniciarPalabra()
    {
        if (this.panelPalabra != null)
        {
            this.panelPalabra.removeAll();
        }
        Container cp = this.panelPalabra;
        // poner el lenght de la palabra
        GridLayout gl = new GridLayout(1, Main.backend.getPalabra().getTamaño());
        gl.setHgap(2);
        gl.setVgap(2);
        cp.setLayout(gl);
        // hacer un vector del largo de la palabra
        letras = new JLabel[Main.backend.getPalabra().getNombre().length()];

        for (int i = 0; i < letras.length; i++)
        {
            letras[i] = new JLabel();
            cp.add(letras[i]);
            letras[i].setText(" * ");
            letras[i].setForeground(new Color(52, 125, 255));
            letras[i].setHorizontalAlignment((int) CENTER_ALIGNMENT);
            letras[i].setFont(new java.awt.Font("Tahoma", 1, 20));
            letras[i].setVisible(true);
        }

    }

    public void actualizarPalabra()
    {
        for (int i = 0; i < letras.length; i++)
        {
            letras[i].setText(" " + Main.backend.getPalabraSecreta().get(i) + " ");
        }
    }

    public void iniciarTeclado()
    {
        if (this.panelTeclado != null)
        {
            this.panelTeclado.removeAll();
        }

        cp = this.panelTeclado;
        GridLayout gl = new GridLayout(4, 7);
        gl.setHgap(2);
        gl.setVgap(2);
        cp.setLayout(gl);

        //centrar iconos
        for (int i = 0; i < 28; i++)
        {
            if (i < 27)
            {
                botones[i] = new JButton();
                cp.add(botones[i]);
                botones[i].setText(String.valueOf(Main.backend.getAlfabeto().charAt(i)));
                botones[i].setVisible(true);
                botones[i].setForeground(new Color(0, 0, 0));
                botones[i].setFont(new Font("Tahoma", 1, 20));
                botones[i].setBorder(null);
                botones[i].setContentAreaFilled(true);
                botones[i].setFocusPainted(false);

                botones[i].addActionListener(new ActionListener()
                {
                    public void actionPerformed(java.awt.event.ActionEvent evt)
                    {
                        letraClickeada(evt);
                    }

                });
            }
            else
            {
                botones[i] = new JButton();
                cp.add(botones[i]);
                botones[i].setIcon(new ImageIcon("boton-sorpresa-19.jpg"));
                botones[i].setRolloverIcon(new ImageIcon("boton-sorpresa-20.jpg"));
                botones[i].setVisible(true);
                botones[i].setBorder(null);
                botones[i].setContentAreaFilled(true);
                botones[i].setFocusPainted(false);

                botones[i].addActionListener(new ActionListener()
                {
                    public void actionPerformed(java.awt.event.ActionEvent evt)
                    {
                        try
                        {
                            // LANZA PISTA O ALGO
                        }
                        catch (Exception e)
                        {

                        }

                    }
                });
            }
        }
    }

    public void letraClickeada(java.awt.event.ActionEvent evt)
    {
        JButton evento = (JButton) evt.getSource();

        Main.backend.setLetraElegida(evento.getText().charAt(0));

        //libero el evento
        evento.setEnabled(false);
        evento.setContentAreaFilled(false);

        //valida la letra
        Main.backend.validarLetraElegida();

        //muestro letras coincidentes
        actualizarPalabra();

        //actualizar imagen
        actualizarImagen();

        try
        {
            //valida partida
            Main.backend.validarEstadoPartida();

            if (Main.backend.getContadorFallos() == Main.backend.getMomentoPista()
                    && !Main.backend.isPistaMostrada())
            {
                FormDialogo pista = new FormDialogo(null, true, Main.backend.getPalabra().getDefinicion(), 0);
                pista.setVisible(true);

                /*
                 * JOptionPane.showMessageDialog(null,
                 * Main.backend.getPalabra().getDefinicion(),
                 * "PISTA",
                 * TrayIcon.MessageType.WARNING.ordinal()
                 * );
                 */
                Main.backend.setPistaMostrada(true);
            }
        }
        catch (GanaPartida ex)
        {
            FormDialogo ganaste = new FormDialogo(null, true, "F E L I C I T A C I O N E S ! ! !" + "\n"
                    + "Adivinaste la palabra: "
                    + "\n"
                    + Main.backend.getPalabra().getNombre(),
                     1);
            ganaste.setVisible(true);
            if (ganaste.isDialogResult)
            {
                limpiarTodo();
            }
            /*
             * JOptionPane.showMessageDialog(null,
             * "F E L I C I T A C I O N E S ! ! !"
             * + "\n"
             * + "Adivinaste la palabra: "
             * + "\n"
             * + Main.backend.getPalabra().getNombre(),
             * "GANASTE LA PARTIDA!",
             * TrayIcon.MessageType.INFO.ordinal());
             */

            //pasar siguiente nivel
        }
        catch (PierdePartida ex)
        {
            FormDialogo perdiste = new FormDialogo(null, true, "La palabra secreta era: " + "\n" + Main.backend.getPalabra().getNombre() + "\n\n" + "PERDISTE!", 2);
            perdiste.setVisible(true);
            if (perdiste.isDialogResult)
            {
                this.setVisible(false);
            }
            /*
             * JOptionPane.showMessageDialog(null,
             * "La palabra secreta era: "
             * + "\n"
             * + Main.backend.getPalabra().getNombre(),
             * "PERDISTE!",
             * TrayIcon.MessageType.ERROR.ordinal());
             */
            //volver a inicio
        }

    }

    void limpiarTodo()
    {
        try
        {
            Main.backend.nuevaPartida();
            iniciarTeclado();
            actualizarImagen();
            iniciarPalabra();
        }
        catch (GanaJuego ex)
        {
            FormDialogo ganaste = new FormDialogo(null,
                    true,
                    "SOS EL PUTO AMO SARASASASA",
                    1);
        }

    }

    //</editor-fold>
}
