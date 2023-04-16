//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
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Model.Xogo;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author a22braisdr
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    private Xogo xogo1;
    private Timer tiempo;
    
    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        juego.setFocusable(true);
        crearTimerTempo();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        fondoPantalla = new javax.swing.JLabel();
        panelBotones = new javax.swing.JPanel();
        botonJugar = new javax.swing.JButton();
        botonOpciones = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        botonInstrucciones = new javax.swing.JButton();
        labelTitulo = new javax.swing.JLabel();
        juego = new javax.swing.JPanel();
        panelJuego = new javax.swing.JPanel();
        panelLateral = new javax.swing.JPanel();
        labelTituloAciertos = new javax.swing.JLabel();
        labelTituloErrores = new javax.swing.JLabel();
        labelTituloCargador = new javax.swing.JLabel();
        labelAciertos = new javax.swing.JLabel();
        labelErrores = new javax.swing.JLabel();
        labelCargador = new javax.swing.JLabel();
        labelRecarga = new javax.swing.JLabel();
        labelTituloTiempo = new javax.swing.JLabel();
        labelTiempo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(350, 150));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPrincipal.setBackground(new java.awt.Color(255, 204, 204));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(1000, 700));

        fondoPantalla.setIcon(new javax.swing.ImageIcon("C:\\Users\\brais\\OneDrive\\Documentos\\NetBeansProjects\\PuntoDeMira\\fondoDePantalla.jpg")); // NOI18N
        fondoPantalla.setPreferredSize(new java.awt.Dimension(1000, 700));

        panelBotones.setBackground(new java.awt.Color(255, 204, 204));
        panelBotones.setOpaque(false);
        panelBotones.setPreferredSize(new java.awt.Dimension(450, 450));

        botonJugar.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        botonJugar.setForeground(new java.awt.Color(0, 0, 0));
        botonJugar.setText("JUGAR");
        botonJugar.setAlignmentY(0.0F);
        botonJugar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonJugarActionPerformed(evt);
            }
        });

        botonOpciones.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        botonOpciones.setForeground(new java.awt.Color(0, 0, 0));
        botonOpciones.setText("OPCIONES");
        botonOpciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOpcionesActionPerformed(evt);
            }
        });

        botonSalir.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(0, 0, 0));
        botonSalir.setText("SALIR");
        botonSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        botonInstrucciones.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        botonInstrucciones.setForeground(new java.awt.Color(0, 0, 0));
        botonInstrucciones.setText("INSTRUCCIONES");
        botonInstrucciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonInstrucciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInstruccionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotonesLayout = new javax.swing.GroupLayout(panelBotones);
        panelBotones.setLayout(panelBotonesLayout);
        panelBotonesLayout.setHorizontalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotonesLayout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(botonJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonOpciones)
                    .addComponent(botonSalir)
                    .addComponent(botonInstrucciones))
                .addGap(76, 76, 76))
        );

        panelBotonesLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {botonInstrucciones, botonJugar, botonOpciones, botonSalir});

        panelBotonesLayout.setVerticalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(botonJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonInstrucciones, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonSalir)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        panelBotonesLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {botonJugar, botonSalir});

        panelBotonesLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {botonInstrucciones, botonOpciones});

        labelTitulo.setFont(new java.awt.Font("Source Serif Pro Black", 0, 48)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(0, 0, 0));
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("PUNTO DE MIRA");

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addContainerGap(283, Short.MAX_VALUE)
                .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(267, 267, 267))
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(312, 312, 312)
                .addComponent(labelTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelPrincipalLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(fondoPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(labelTitulo)
                .addGap(58, 58, 58)
                .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
            .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelPrincipalLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(fondoPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(panelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        juego.setVisible(false);
        juego.setBackground(new java.awt.Color(255, 204, 204));
        juego.setPreferredSize(new java.awt.Dimension(1000, 700));
        juego.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                juegoMouseClicked(evt);
            }
        });
        juego.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                juegoKeyPressed(evt);
            }
        });

        panelJuego.setBackground(new java.awt.Color(0, 0, 0));
        panelJuego.setPreferredSize(new java.awt.Dimension(700, 700));
        panelJuego.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelJuegoMouseClicked(evt);
            }
        });
        panelJuego.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                panelJuegoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panelJuegoLayout = new javax.swing.GroupLayout(panelJuego);
        panelJuego.setLayout(panelJuegoLayout);
        panelJuegoLayout.setHorizontalGroup(
            panelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        panelJuegoLayout.setVerticalGroup(
            panelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 725, Short.MAX_VALUE)
        );

        panelLateral.setBackground(new java.awt.Color(255, 204, 204));
        panelLateral.setOpaque(false);
        panelLateral.setPreferredSize(new java.awt.Dimension(300, 700));

        labelTituloAciertos.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        labelTituloAciertos.setForeground(new java.awt.Color(0, 0, 0));
        labelTituloAciertos.setText("ACIERTOS");

        labelTituloErrores.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        labelTituloErrores.setForeground(new java.awt.Color(0, 0, 0));
        labelTituloErrores.setText("ERRORES");

        labelTituloCargador.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        labelTituloCargador.setForeground(new java.awt.Color(0, 0, 0));
        labelTituloCargador.setText("CARGADOR");

        labelAciertos.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        labelAciertos.setForeground(new java.awt.Color(0, 0, 0));
        labelAciertos.setText("0");

        labelErrores.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        labelErrores.setForeground(new java.awt.Color(0, 0, 0));
        labelErrores.setText("0");

        labelCargador.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        labelCargador.setForeground(new java.awt.Color(0, 0, 0));
        labelCargador.setText("10");

        labelRecarga.setVisible(false);
        labelRecarga.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        labelRecarga.setForeground(new java.awt.Color(0, 0, 0));
        labelRecarga.setText("PULSA \"SPACE\" PARA RECARGAR");

        labelTituloTiempo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        labelTituloTiempo.setForeground(new java.awt.Color(0, 0, 0));
        labelTituloTiempo.setText("TIEMPO");

        labelTiempo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        labelTiempo.setForeground(new java.awt.Color(0, 0, 0));
        labelTiempo.setText("0");

        javax.swing.GroupLayout panelLateralLayout = new javax.swing.GroupLayout(panelLateral);
        panelLateral.setLayout(panelLateralLayout);
        panelLateralLayout.setHorizontalGroup(
            panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLateralLayout.createSequentialGroup()
                .addGroup(panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLateralLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(labelErrores, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelTituloErrores, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelAciertos, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelTituloAciertos, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLateralLayout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(labelCargador, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelTituloTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelLateralLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(labelTituloCargador, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLateralLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelRecarga)
                        .addGap(68, 68, 68)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelLateralLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {labelTituloAciertos, labelTituloCargador});

        panelLateralLayout.setVerticalGroup(
            panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLateralLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(labelTituloAciertos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelAciertos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(labelTituloErrores, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelErrores, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105)
                .addComponent(labelTituloTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122)
                .addComponent(labelTituloCargador, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelCargador, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelRecarga)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        panelLateralLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {labelTituloAciertos, labelTituloCargador, labelTituloErrores});

        javax.swing.GroupLayout juegoLayout = new javax.swing.GroupLayout(juego);
        juego.setLayout(juegoLayout);
        juegoLayout.setHorizontalGroup(
            juegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(juegoLayout.createSequentialGroup()
                .addComponent(panelJuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelLateral, javax.swing.GroupLayout.PREFERRED_SIZE, 294, Short.MAX_VALUE))
        );
        juegoLayout.setVerticalGroup(
            juegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(juegoLayout.createSequentialGroup()
                .addGroup(juegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelJuego, javax.swing.GroupLayout.DEFAULT_SIZE, 725, Short.MAX_VALUE)
                    .addComponent(panelLateral, javax.swing.GroupLayout.DEFAULT_SIZE, 725, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(juego, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonJugarActionPerformed
        // TODO add your handling code here:
        iniciarPartida();
    }//GEN-LAST:event_botonJugarActionPerformed

    private void botonOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOpcionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonOpcionesActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonInstruccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInstruccionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonInstruccionesActionPerformed

    private void juegoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_juegoMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_juegoMouseClicked

    private void panelJuegoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelJuegoMouseClicked
        // TODO add your handling code here:
        sumarErro();
        restarBala();
    }//GEN-LAST:event_panelJuegoMouseClicked

    private void panelJuegoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panelJuegoKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            labelCargador.setText("10");
            labelRecarga.setVisible(false);
        }
    }//GEN-LAST:event_panelJuegoKeyPressed

    private void juegoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_juegoKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_juegoKeyPressed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }
    
    
    /**
     * Crea un Obxeto da clase Xogo 
     */
    private void iniciarPartida(){
        xogo1=new Xogo(this);
        panelPrincipal.setVisible(false);
        juego.setVisible(true);
        tiempo.start();
    }
    
    
    /**
     * Colorea o Cadrado no Panel
     * @param lblCadrado Label do Cadrado a colorear
     */
    public void pintarCadrado(JLabel lblCadrado){
        panelJuego.add(lblCadrado);
        panelJuego.updateUI();
    }
    
    /**
     * Suma un acerto
     */
    public void sumarAcerto (){
        String puntuacionFicha=labelAciertos.getText();
        int puntuacion=(int) Double.parseDouble(puntuacionFicha);
        puntuacion+=1;
        escribir(puntuacion, labelAciertos);
    }
    
    
    private void sumarErro (){
        String erroDisparo=labelErrores.getText();
        int erro=(int) Double.parseDouble(erroDisparo);
        erro+=1;
        escribir(erro, labelErrores);
    }
    
    /**
     * Resta unha bala na labelCargador
     */
    public void restarBala (){
        String erroDisparo=labelCargador.getText();
        int balas=(int) Double.parseDouble(erroDisparo);
        balas-=1; 
        escribir(balas, labelCargador);
        if (balas<0){
            labelCargador.setText("0");
            labelRecarga.setVisible(true);
        }
        else if (balas<=3){
            labelCargador.setForeground(Color.red);
        }
    }
    
    
    /**
     * Método que escribe nas distintas JLabel das puntuacións
     * @param num int que imos a escribir
     * @param etiqueta JLabel na que imos a escribir
     */
    private void escribir (int num, JLabel etiqueta){
        etiqueta.setText(""+num);
    }
    
    
    
    private void crearTimerTempo(){
        tiempo=new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelJuego.requestFocus();
                String a=labelTiempo.getText();
                int b=(int) Double.parseDouble(a);
                b++;
                labelTiempo.setText(b+"");
            }
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonInstrucciones;
    private javax.swing.JButton botonJugar;
    private javax.swing.JButton botonOpciones;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel fondoPantalla;
    private javax.swing.JPanel juego;
    private javax.swing.JLabel labelAciertos;
    private javax.swing.JLabel labelCargador;
    private javax.swing.JLabel labelErrores;
    private javax.swing.JLabel labelRecarga;
    private javax.swing.JLabel labelTiempo;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelTituloAciertos;
    private javax.swing.JLabel labelTituloCargador;
    private javax.swing.JLabel labelTituloErrores;
    private javax.swing.JLabel labelTituloTiempo;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelJuego;
    private javax.swing.JPanel panelLateral;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
