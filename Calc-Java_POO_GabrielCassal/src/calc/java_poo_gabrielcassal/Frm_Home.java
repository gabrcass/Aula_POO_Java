/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc.java_poo_gabrielcassal;

import javax.swing.JOptionPane;

/**
 *
 * @author gabrc
 */
public class Frm_Home extends javax.swing.JFrame {

    public void sair(){
        int confirma = JOptionPane.showConfirmDialog(this, "Tem certeza ?", "Alerta",JOptionPane.YES_NO_OPTION);
        if (confirma == 0){
            System.exit(0);
        }
    }
    /**
     * Creates new form Frm_Home
     */
    public Frm_Home() {
        initComponents();
        Rb_CalcMate.setSelected(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GroupRB_Home = new javax.swing.ButtonGroup();
        Panel_Home = new javax.swing.JPanel();
        B_Sair = new javax.swing.JButton();
        B_Avan = new javax.swing.JButton();
        Rb_CalcMate = new javax.swing.JRadioButton();
        Rb_CalcFina = new javax.swing.JRadioButton();
        Rb_CalcEspe = new javax.swing.JRadioButton();
        MB_Home = new javax.swing.JMenuBar();
        M_Nave = new javax.swing.JMenu();
        MI_NaveMate = new javax.swing.JMenuItem();
        MI_NaveFina = new javax.swing.JMenuItem();
        MI_NaveEspe = new javax.swing.JMenuItem();
        MI_NaveSair = new javax.swing.JMenuItem();
        M_Sobre = new javax.swing.JMenu();

        setTitle("Tela inicial");
        setName("Tela inicial"); // NOI18N

        B_Sair.setFont(B_Sair.getFont().deriveFont(B_Sair.getFont().getSize()+16f));
        B_Sair.setText("Sair");
        B_Sair.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.gray));
        B_Sair.setPreferredSize(new java.awt.Dimension(175, 50));
        B_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_SairActionPerformed(evt);
            }
        });

        B_Avan.setFont(B_Avan.getFont().deriveFont(B_Avan.getFont().getSize()+16f));
        B_Avan.setText("Avançar");
        B_Avan.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.gray));
        B_Avan.setPreferredSize(new java.awt.Dimension(175, 50));
        B_Avan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_AvanActionPerformed(evt);
            }
        });

        GroupRB_Home.add(Rb_CalcMate);
        Rb_CalcMate.setFont(Rb_CalcMate.getFont().deriveFont(Rb_CalcMate.getFont().getSize()+16f));
        Rb_CalcMate.setText("Cálculos Matemáticos");
        Rb_CalcMate.setActionCommand("CalcMate");
        Rb_CalcMate.setPreferredSize(new java.awt.Dimension(400, 50));

        GroupRB_Home.add(Rb_CalcFina);
        Rb_CalcFina.setFont(Rb_CalcFina.getFont().deriveFont(Rb_CalcFina.getFont().getSize()+16f));
        Rb_CalcFina.setText("Cálculos Financeiros");
        Rb_CalcFina.setActionCommand("CalcFina");
        Rb_CalcFina.setPreferredSize(new java.awt.Dimension(400, 50));

        GroupRB_Home.add(Rb_CalcEspe);
        Rb_CalcEspe.setFont(Rb_CalcEspe.getFont().deriveFont(Rb_CalcEspe.getFont().getSize()+16f));
        Rb_CalcEspe.setText("Cálculos Especiais");
        Rb_CalcEspe.setActionCommand("CalcEspe");
        Rb_CalcEspe.setPreferredSize(new java.awt.Dimension(400, 50));

        javax.swing.GroupLayout Panel_HomeLayout = new javax.swing.GroupLayout(Panel_Home);
        Panel_Home.setLayout(Panel_HomeLayout);
        Panel_HomeLayout.setHorizontalGroup(
            Panel_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_HomeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Panel_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Panel_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Rb_CalcFina, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Rb_CalcEspe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Rb_CalcMate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel_HomeLayout.createSequentialGroup()
                        .addComponent(B_Avan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(B_Sair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        Panel_HomeLayout.setVerticalGroup(
            Panel_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_HomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Rb_CalcMate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Rb_CalcFina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Rb_CalcEspe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Panel_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B_Avan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B_Sair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        M_Nave.setText("Navegar");

        MI_NaveMate.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        MI_NaveMate.setText("Cálculos Matemáticos");
        MI_NaveMate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_NaveMateActionPerformed(evt);
            }
        });
        M_Nave.add(MI_NaveMate);

        MI_NaveFina.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        MI_NaveFina.setText("Cálculos Financeiros");
        MI_NaveFina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_NaveFinaActionPerformed(evt);
            }
        });
        M_Nave.add(MI_NaveFina);

        MI_NaveEspe.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        MI_NaveEspe.setText("Cálculos Especiais");
        MI_NaveEspe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_NaveEspeActionPerformed(evt);
            }
        });
        M_Nave.add(MI_NaveEspe);

        MI_NaveSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        MI_NaveSair.setText("Sair");
        MI_NaveSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_NaveSairActionPerformed(evt);
            }
        });
        M_Nave.add(MI_NaveSair);

        MB_Home.add(M_Nave);

        M_Sobre.setText("Sobre");
        M_Sobre.addMenuKeyListener(new javax.swing.event.MenuKeyListener() {
            public void menuKeyPressed(javax.swing.event.MenuKeyEvent evt) {
            }
            public void menuKeyReleased(javax.swing.event.MenuKeyEvent evt) {
            }
            public void menuKeyTyped(javax.swing.event.MenuKeyEvent evt) {
                M_SobreMenuKeyTyped(evt);
            }
        });
        M_Sobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                M_SobreMouseClicked(evt);
            }
        });
        MB_Home.add(M_Sobre);

        setJMenuBar(MB_Home);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel_Home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel_Home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B_AvanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_AvanActionPerformed
        // TODO add your handling code here:
        if (Rb_CalcMate.isSelected()){
            new Frm_CalcMate().setVisible(true);
        }
        if (Rb_CalcFina.isSelected()){
            new Frm_CalcFina().setVisible(true);
        }
        if (Rb_CalcEspe.isSelected()){
            new Frm_CalcEspe().setVisible(true);
        }
    }//GEN-LAST:event_B_AvanActionPerformed

    private void B_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_SairActionPerformed
        sair();
    }//GEN-LAST:event_B_SairActionPerformed

    private void MI_NaveMateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_NaveMateActionPerformed
        new Frm_CalcMate().setVisible(true);
    }//GEN-LAST:event_MI_NaveMateActionPerformed

    private void MI_NaveFinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_NaveFinaActionPerformed
        new Frm_CalcFina().setVisible(true);
    }//GEN-LAST:event_MI_NaveFinaActionPerformed

    private void MI_NaveEspeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_NaveEspeActionPerformed
        new Frm_CalcEspe().setVisible(true);
    }//GEN-LAST:event_MI_NaveEspeActionPerformed

    private void MI_NaveSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_NaveSairActionPerformed
        sair();
    }//GEN-LAST:event_MI_NaveSairActionPerformed

    private void M_SobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_M_SobreMouseClicked
        new Frm_About().setVisible(true);
    }//GEN-LAST:event_M_SobreMouseClicked

    private void M_SobreMenuKeyTyped(javax.swing.event.MenuKeyEvent evt) {//GEN-FIRST:event_M_SobreMenuKeyTyped
        new Frm_About().setVisible(true);
    }//GEN-LAST:event_M_SobreMenuKeyTyped

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
            java.util.logging.Logger.getLogger(Frm_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Avan;
    private javax.swing.JButton B_Sair;
    private javax.swing.ButtonGroup GroupRB_Home;
    private javax.swing.JMenuBar MB_Home;
    private javax.swing.JMenuItem MI_NaveEspe;
    private javax.swing.JMenuItem MI_NaveFina;
    private javax.swing.JMenuItem MI_NaveMate;
    private javax.swing.JMenuItem MI_NaveSair;
    private javax.swing.JMenu M_Nave;
    private javax.swing.JMenu M_Sobre;
    private javax.swing.JPanel Panel_Home;
    private javax.swing.JRadioButton Rb_CalcEspe;
    private javax.swing.JRadioButton Rb_CalcFina;
    private javax.swing.JRadioButton Rb_CalcMate;
    // End of variables declaration//GEN-END:variables
}
