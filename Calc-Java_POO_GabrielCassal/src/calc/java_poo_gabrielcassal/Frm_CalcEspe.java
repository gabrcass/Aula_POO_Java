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
public class Frm_CalcEspe extends javax.swing.JFrame {

    /**
     * Creates new form Frm_CalcEspe
     */
    public Frm_CalcEspe() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        P_Mdc = new javax.swing.JPanel();
        Tf_MdcNum1 = new javax.swing.JTextField();
        L_MdcNum1 = new javax.swing.JLabel();
        Tf_MdcNum2 = new javax.swing.JTextField();
        L_MdcNum2 = new javax.swing.JLabel();
        B_MdcVeri = new javax.swing.JButton();
        B_MdcLimp = new javax.swing.JButton();
        L_MdcResu = new javax.swing.JLabel();
        L_MdcResuR = new javax.swing.JLabel();
        P_Prim = new javax.swing.JPanel();
        Tf_PrimNum = new javax.swing.JTextField();
        L_PrimNum = new javax.swing.JLabel();
        B_PrimVeri = new javax.swing.JButton();
        B_PrimLimp = new javax.swing.JButton();
        L_PrimResu = new javax.swing.JLabel();
        P_Mmc = new javax.swing.JPanel();
        Tf_MmcNum1 = new javax.swing.JTextField();
        L_MmcNum1 = new javax.swing.JLabel();
        Tf_MmcNum2 = new javax.swing.JTextField();
        L_MmcNum2 = new javax.swing.JLabel();
        L_MmcResu = new javax.swing.JLabel();
        L_MmcResuR = new javax.swing.JLabel();
        B_MmcVeri = new javax.swing.JButton();
        B_MmcLimp = new javax.swing.JButton();
        P_Par = new javax.swing.JPanel();
        L_ParNum = new javax.swing.JLabel();
        Tf_ParNum = new javax.swing.JTextField();
        B_ParVeri = new javax.swing.JButton();
        B_ParLimp = new javax.swing.JButton();
        L_ParResu = new javax.swing.JLabel();
        L_ParResuR = new javax.swing.JLabel();
        P_Bhas = new javax.swing.JPanel();
        L_BhasNum1 = new javax.swing.JLabel();
        Tf_BhasNum1 = new javax.swing.JTextField();
        L_BhasNum2 = new javax.swing.JLabel();
        Tf_BhasNum2 = new javax.swing.JTextField();
        L_BhasNum3 = new javax.swing.JLabel();
        Tf_BhasNum3 = new javax.swing.JTextField();
        B_BhasVeri = new javax.swing.JButton();
        B_BhasLimp = new javax.swing.JButton();
        L_BhasResu = new javax.swing.JLabel();
        L_BhasDelt = new javax.swing.JLabel();
        L_BhasX2 = new javax.swing.JLabel();
        L_BhasX1 = new javax.swing.JLabel();
        L_BhasDeltR = new javax.swing.JLabel();
        L_BhasX1R = new javax.swing.JLabel();
        L_BhasX2R = new javax.swing.JLabel();
        B_Limp = new javax.swing.JButton();
        B_Fech = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Cálculos Especiais"); // NOI18N

        P_Mdc.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "MDC (Maior Divisor Comum):"));

        L_MdcNum1.setText("Número 1:");

        L_MdcNum2.setText("Número 2:");

        B_MdcVeri.setText("Varificar");
        B_MdcVeri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_MdcVeriActionPerformed(evt);
            }
        });

        B_MdcLimp.setText("Limpar");

        L_MdcResu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L_MdcResu.setText("Resultado :");
        L_MdcResu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        L_MdcResuR.setText("0");

        javax.swing.GroupLayout P_MdcLayout = new javax.swing.GroupLayout(P_Mdc);
        P_Mdc.setLayout(P_MdcLayout);
        P_MdcLayout.setHorizontalGroup(
            P_MdcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_MdcLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_MdcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_MdcLayout.createSequentialGroup()
                        .addComponent(L_MdcResu, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(L_MdcResuR, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(P_MdcLayout.createSequentialGroup()
                        .addGroup(P_MdcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(L_MdcNum1)
                            .addComponent(L_MdcNum2))
                        .addGap(18, 18, 18)
                        .addGroup(P_MdcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Tf_MdcNum2, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(Tf_MdcNum1))
                        .addGap(18, 18, 18)
                        .addGroup(P_MdcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(B_MdcVeri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(B_MdcLimp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        P_MdcLayout.setVerticalGroup(
            P_MdcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_MdcLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_MdcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tf_MdcNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L_MdcNum1)
                    .addComponent(B_MdcVeri))
                .addGap(18, 18, 18)
                .addGroup(P_MdcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tf_MdcNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L_MdcNum2)
                    .addComponent(B_MdcLimp))
                .addGap(18, 18, 18)
                .addGroup(P_MdcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L_MdcResu)
                    .addComponent(L_MdcResuR))
                .addContainerGap())
        );

        P_Prim.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Número Primo:"));

        L_PrimNum.setText("Número:");

        B_PrimVeri.setText("Verificar");
        B_PrimVeri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_PrimVeriActionPerformed(evt);
            }
        });

        B_PrimLimp.setText("Limpar");
        B_PrimLimp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_PrimLimpActionPerformed(evt);
            }
        });

        L_PrimResu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L_PrimResu.setText("...");

        javax.swing.GroupLayout P_PrimLayout = new javax.swing.GroupLayout(P_Prim);
        P_Prim.setLayout(P_PrimLayout);
        P_PrimLayout.setHorizontalGroup(
            P_PrimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_PrimLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_PrimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(L_PrimResu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(P_PrimLayout.createSequentialGroup()
                        .addComponent(L_PrimNum)
                        .addGap(18, 18, 18)
                        .addComponent(Tf_PrimNum, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(P_PrimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(B_PrimLimp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(B_PrimVeri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 15, Short.MAX_VALUE)))
                .addContainerGap())
        );
        P_PrimLayout.setVerticalGroup(
            P_PrimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_PrimLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_PrimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tf_PrimNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L_PrimNum)
                    .addComponent(B_PrimVeri))
                .addGap(18, 18, 18)
                .addComponent(B_PrimLimp)
                .addGap(18, 18, 18)
                .addComponent(L_PrimResu)
                .addContainerGap())
        );

        P_Mmc.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "MMC (Mínimo Múltiplo Comum):"));

        L_MmcNum1.setText("Número 1:");

        L_MmcNum2.setText("Número 2:");

        L_MmcResu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L_MmcResu.setText("Resultado :");
        L_MmcResu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        L_MmcResuR.setText("0");

        B_MmcVeri.setText("Varificar");

        B_MmcLimp.setText("Limpar");

        javax.swing.GroupLayout P_MmcLayout = new javax.swing.GroupLayout(P_Mmc);
        P_Mmc.setLayout(P_MmcLayout);
        P_MmcLayout.setHorizontalGroup(
            P_MmcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_MmcLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_MmcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_MmcLayout.createSequentialGroup()
                        .addComponent(L_MmcNum1)
                        .addGap(18, 18, 18)
                        .addComponent(Tf_MmcNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(B_MmcVeri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(P_MmcLayout.createSequentialGroup()
                        .addComponent(L_MmcNum2)
                        .addGap(18, 18, 18)
                        .addComponent(Tf_MmcNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(B_MmcLimp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(P_MmcLayout.createSequentialGroup()
                        .addComponent(L_MmcResu, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(L_MmcResuR, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        P_MmcLayout.setVerticalGroup(
            P_MmcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_MmcLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_MmcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tf_MmcNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L_MmcNum1)
                    .addComponent(B_MmcVeri))
                .addGap(18, 18, 18)
                .addGroup(P_MmcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tf_MmcNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L_MmcNum2)
                    .addComponent(B_MmcLimp))
                .addGap(18, 18, 18)
                .addGroup(P_MmcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L_MmcResu)
                    .addComponent(L_MmcResuR))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        P_Par.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Número Par/Ímpar:"));

        L_ParNum.setText("Número:");

        B_ParVeri.setText("Verificar");
        B_ParVeri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_ParVeriActionPerformed(evt);
            }
        });

        B_ParLimp.setText("Limpar");
        B_ParLimp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_ParLimpActionPerformed(evt);
            }
        });

        L_ParResu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L_ParResu.setText("Resultado :");

        javax.swing.GroupLayout P_ParLayout = new javax.swing.GroupLayout(P_Par);
        P_Par.setLayout(P_ParLayout);
        P_ParLayout.setHorizontalGroup(
            P_ParLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_ParLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_ParLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_ParLayout.createSequentialGroup()
                        .addComponent(L_ParNum)
                        .addGap(18, 18, 18)
                        .addComponent(Tf_ParNum, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(P_ParLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B_ParLimp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(B_ParVeri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(P_ParLayout.createSequentialGroup()
                        .addComponent(L_ParResu, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(L_ParResuR, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        P_ParLayout.setVerticalGroup(
            P_ParLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_ParLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_ParLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L_ParNum)
                    .addComponent(Tf_ParNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B_ParVeri))
                .addGap(18, 18, 18)
                .addComponent(B_ParLimp)
                .addGap(18, 18, 18)
                .addGroup(P_ParLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L_ParResu)
                    .addComponent(L_ParResuR))
                .addContainerGap())
        );

        P_Bhas.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Bhaskara:"));

        L_BhasNum1.setText("Número 1:");

        L_BhasNum2.setText("Número 2:");

        L_BhasNum3.setText("Número 3:");

        B_BhasVeri.setText("Varificar");
        B_BhasVeri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_BhasVeriActionPerformed(evt);
            }
        });

        B_BhasLimp.setText("Limpar");

        L_BhasResu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L_BhasResu.setText("Resultado :");

        L_BhasDelt.setText("Delta: ");

        L_BhasX2.setText("X2: ");

        L_BhasX1.setText("X1: ");

        L_BhasDeltR.setText("0");

        L_BhasX1R.setText("0");

        L_BhasX2R.setText("0");

        javax.swing.GroupLayout P_BhasLayout = new javax.swing.GroupLayout(P_Bhas);
        P_Bhas.setLayout(P_BhasLayout);
        P_BhasLayout.setHorizontalGroup(
            P_BhasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_BhasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_BhasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_BhasLayout.createSequentialGroup()
                        .addComponent(L_BhasNum1)
                        .addGap(18, 18, 18)
                        .addComponent(Tf_BhasNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(B_BhasVeri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(P_BhasLayout.createSequentialGroup()
                        .addComponent(L_BhasNum2)
                        .addGap(18, 18, 18)
                        .addComponent(Tf_BhasNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(B_BhasLimp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(P_BhasLayout.createSequentialGroup()
                        .addComponent(L_BhasNum3)
                        .addGap(18, 18, 18)
                        .addComponent(Tf_BhasNum3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(P_BhasLayout.createSequentialGroup()
                        .addComponent(L_BhasResu)
                        .addGap(18, 18, 18)
                        .addGroup(P_BhasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(L_BhasX2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(L_BhasDelt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(L_BhasX1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(P_BhasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(L_BhasDeltR, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(L_BhasX1R, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(L_BhasX2R, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        P_BhasLayout.setVerticalGroup(
            P_BhasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_BhasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_BhasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L_BhasNum1)
                    .addComponent(Tf_BhasNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B_BhasVeri))
                .addGap(18, 18, 18)
                .addGroup(P_BhasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L_BhasNum2)
                    .addComponent(Tf_BhasNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B_BhasLimp))
                .addGap(18, 18, 18)
                .addGroup(P_BhasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L_BhasNum3)
                    .addComponent(Tf_BhasNum3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(P_BhasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L_BhasResu)
                    .addComponent(L_BhasDelt)
                    .addComponent(L_BhasDeltR))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(P_BhasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L_BhasX1)
                    .addComponent(L_BhasX1R))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(P_BhasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L_BhasX2)
                    .addComponent(L_BhasX2R))
                .addContainerGap())
        );

        B_Limp.setText("Limpar Todos");
        B_Limp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_LimpActionPerformed(evt);
            }
        });

        B_Fech.setText("Fechar formulário");
        B_Fech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_FechActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(P_Mdc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P_Prim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(P_Mmc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P_Par, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(P_Bhas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(B_Limp, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(B_Fech)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {B_Fech, B_Limp});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(P_Bhas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B_Fech, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(B_Limp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(P_Mmc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(P_Mdc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(P_Prim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(P_Par, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B_ParVeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_ParVeriActionPerformed
        // TODO add your handling code here:
        Double num = Double.parseDouble(Tf_ParNum.getText());
        if (num == 0){
            L_ParResu.setText("O número é : ");
            L_ParResuR.setText("Inválido");
        }
        else{
            if (num%2 == 0){
                L_ParResu.setText("O número é : ");
                L_ParResuR.setText("Par");
            }
            else{
                L_ParResu.setText("O número é : ");
                L_ParResuR.setText("Impar");
            }
        }
    }//GEN-LAST:event_B_ParVeriActionPerformed

    private void B_ParLimpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_ParLimpActionPerformed
        // TODO add your handling code here:
        L_ParResuR.setText("");
        L_ParResu.setText("Resultado :");
        Tf_ParNum.setText("");
        Tf_ParNum.requestFocus();
    }//GEN-LAST:event_B_ParLimpActionPerformed

    private void B_PrimVeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_PrimVeriActionPerformed
        // TODO add your handling code here:
        double num = Double.parseDouble(Tf_PrimNum.getText());
        int valor = 0;
        if (num == 0 || num == 1){
            L_PrimResu.setText("O número é inválido");
        }
        else{
            for (int i = 1 ; i <= num; i++){
                if (num % i == 0){
                    valor++;
                }
            }
            if (valor == 2){
                L_PrimResu.setText("Número informado é primo");
            }
            else {
                L_PrimResu.setText("Número informado não é primo");
            }
        }
        
    }//GEN-LAST:event_B_PrimVeriActionPerformed

    private void B_PrimLimpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_PrimLimpActionPerformed
        L_PrimResu.setText("...");
        Tf_PrimNum.setText("");
        Tf_PrimNum.requestFocus();
    }//GEN-LAST:event_B_PrimLimpActionPerformed

    private void B_MdcVeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_MdcVeriActionPerformed
        int num1 = Integer.parseInt(Tf_MdcNum1.getText());
        int num2 = Integer.parseInt(Tf_MdcNum2.getText());
        int rest;
        
        
        
    }//GEN-LAST:event_B_MdcVeriActionPerformed

    private void B_BhasVeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_BhasVeriActionPerformed
        int a = Integer.parseInt(Tf_BhasNum1.getText());
        int b = Integer.parseInt(Tf_BhasNum2.getText());
        int c = Integer.parseInt(Tf_BhasNum3.getText());
        double delta;
        double Bhas1;
        double Bhas2;
        
        delta = (Math.pow(b, 2)) - 4*a*c;
        
        Bhas1 = (- b + Math.sqrt(delta)) / (2*a);
        Bhas2 = (- b - Math.sqrt(delta)) / (2*a);
        
        L_BhasDeltR.setText(Double.toString(delta));
        L_BhasX1R.setText(Double.toString(Bhas1));
        L_BhasX2R.setText(Double.toString(Bhas2));
    }//GEN-LAST:event_B_BhasVeriActionPerformed

    private void B_FechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_FechActionPerformed
        int confirma = JOptionPane.showConfirmDialog(this, "Tem certeza ?", "Alerta",JOptionPane.YES_NO_OPTION);
        if (confirma == 0){
            dispose();
        }
    }//GEN-LAST:event_B_FechActionPerformed

    private void B_LimpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_LimpActionPerformed
        // TODO add your handling code here:
        Tf_MdcNum1.setText("");
        Tf_MdcNum2.setText("");
        L_MdcResuR.setText("0");
        
    }//GEN-LAST:event_B_LimpActionPerformed

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
            java.util.logging.Logger.getLogger(Frm_CalcEspe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_CalcEspe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_CalcEspe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_CalcEspe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_CalcEspe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_BhasLimp;
    private javax.swing.JButton B_BhasVeri;
    private javax.swing.JButton B_Fech;
    private javax.swing.JButton B_Limp;
    private javax.swing.JButton B_MdcLimp;
    private javax.swing.JButton B_MdcVeri;
    private javax.swing.JButton B_MmcLimp;
    private javax.swing.JButton B_MmcVeri;
    private javax.swing.JButton B_ParLimp;
    private javax.swing.JButton B_ParVeri;
    private javax.swing.JButton B_PrimLimp;
    private javax.swing.JButton B_PrimVeri;
    private javax.swing.JLabel L_BhasDelt;
    private javax.swing.JLabel L_BhasDeltR;
    private javax.swing.JLabel L_BhasNum1;
    private javax.swing.JLabel L_BhasNum2;
    private javax.swing.JLabel L_BhasNum3;
    private javax.swing.JLabel L_BhasResu;
    private javax.swing.JLabel L_BhasX1;
    private javax.swing.JLabel L_BhasX1R;
    private javax.swing.JLabel L_BhasX2;
    private javax.swing.JLabel L_BhasX2R;
    private javax.swing.JLabel L_MdcNum1;
    private javax.swing.JLabel L_MdcNum2;
    private javax.swing.JLabel L_MdcResu;
    private javax.swing.JLabel L_MdcResuR;
    private javax.swing.JLabel L_MmcNum1;
    private javax.swing.JLabel L_MmcNum2;
    private javax.swing.JLabel L_MmcResu;
    private javax.swing.JLabel L_MmcResuR;
    private javax.swing.JLabel L_ParNum;
    private javax.swing.JLabel L_ParResu;
    private javax.swing.JLabel L_ParResuR;
    private javax.swing.JLabel L_PrimNum;
    private javax.swing.JLabel L_PrimResu;
    private javax.swing.JPanel P_Bhas;
    private javax.swing.JPanel P_Mdc;
    private javax.swing.JPanel P_Mmc;
    private javax.swing.JPanel P_Par;
    private javax.swing.JPanel P_Prim;
    private javax.swing.JTextField Tf_BhasNum1;
    private javax.swing.JTextField Tf_BhasNum2;
    private javax.swing.JTextField Tf_BhasNum3;
    private javax.swing.JTextField Tf_MdcNum1;
    private javax.swing.JTextField Tf_MdcNum2;
    private javax.swing.JTextField Tf_MmcNum1;
    private javax.swing.JTextField Tf_MmcNum2;
    private javax.swing.JTextField Tf_ParNum;
    private javax.swing.JTextField Tf_PrimNum;
    // End of variables declaration//GEN-END:variables
}
