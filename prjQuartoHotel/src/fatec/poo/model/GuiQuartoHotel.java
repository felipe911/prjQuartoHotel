/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;


public class GuiQuartoHotel extends javax.swing.JFrame {

    /**
     * Creates new form GuiQuartoHotel
     */
    public GuiQuartoHotel() {
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

        jButton1 = new javax.swing.JButton();
        lblNumQuarto = new javax.swing.JLabel();
        lblValDiaria = new javax.swing.JLabel();
        lblRG = new javax.swing.JLabel();
        lblQtdDias = new javax.swing.JLabel();
        lblValorHospedagem = new javax.swing.JLabel();
        txtNumQuarto = new javax.swing.JTextField();
        txtValorDiaria = new javax.swing.JTextField();
        txtRG = new javax.swing.JTextField();
        txtQtdDias = new javax.swing.JTextField();
        lblSituacaoLabel = new javax.swing.JLabel();
        lblSituacao = new javax.swing.JLabel();
        lblTotalFaturadoLabel = new javax.swing.JLabel();
        lblR$Label = new javax.swing.JLabel();
        lblTotalFaturadoReais = new javax.swing.JLabel();
        lblR$Label2 = new javax.swing.JLabel();
        lblValorHospedagemReal = new javax.swing.JLabel();
        btnInstanciar = new javax.swing.JButton();
        btnReservar = new javax.swing.JButton();
        btnLiberar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GUI Quarto Hotel");

        lblNumQuarto.setText("Num. Quarto:");

        lblValDiaria.setText("Valor Diaria:");

        lblRG.setText("RG:");

        lblQtdDias.setText("Qtde. Dias:");

        lblValorHospedagem.setText("Vl. Hospedagem:");

        txtValorDiaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorDiariaActionPerformed(evt);
            }
        });

        txtRG.setEnabled(false);

        txtQtdDias.setEnabled(false);

        lblSituacaoLabel.setText("Situação Quarto");

        lblSituacao.setText("Livre");

        lblTotalFaturadoLabel.setText("Total Faturado");

        lblR$Label.setText("R$");

        lblTotalFaturadoReais.setText("0.00");

        lblR$Label2.setText("R$");

        lblValorHospedagemReal.setText("0.00");

        btnInstanciar.setText("Instanciar");
        btnInstanciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInstanciarActionPerformed(evt);
            }
        });

        btnReservar.setText("Reservar");
        btnReservar.setEnabled(false);
        btnReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservarActionPerformed(evt);
            }
        });

        btnLiberar.setText("Liberar");
        btnLiberar.setEnabled(false);
        btnLiberar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLiberarActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSituacao)
                .addGap(76, 76, 76))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNumQuarto)
                    .addComponent(lblValDiaria)
                    .addComponent(lblRG)
                    .addComponent(lblQtdDias)
                    .addComponent(lblValorHospedagem))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtNumQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblR$Label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTotalFaturadoReais))
                            .addComponent(lblTotalFaturadoLabel)
                            .addComponent(lblSituacaoLabel))
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtQtdDias)
                            .addComponent(txtRG)
                            .addComponent(txtValorDiaria)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblR$Label2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblValorHospedagemReal)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInstanciar)
                .addGap(29, 29, 29)
                .addComponent(btnReservar)
                .addGap(33, 33, 33)
                .addComponent(btnLiberar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(btnSair)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtNumQuarto, txtQtdDias, txtRG, txtValorDiaria});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnInstanciar, btnLiberar, btnReservar, btnSair});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumQuarto)
                    .addComponent(txtNumQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSituacaoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSituacao)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValDiaria)
                    .addComponent(txtValorDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTotalFaturadoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblR$Label)
                    .addComponent(lblTotalFaturadoReais))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRG)
                    .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQtdDias)
                    .addComponent(txtQtdDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValorHospedagem)
                    .addComponent(lblR$Label2)
                    .addComponent(lblValorHospedagemReal))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInstanciar)
                    .addComponent(btnReservar)
                    .addComponent(btnLiberar)
                    .addComponent(btnSair))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInstanciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInstanciarActionPerformed

       // objQuartoHotel = new QuartoHotel();
       objQuartoHotel = new QuartoHotel(Integer.parseInt(txtNumQuarto.getText()), Double.parseDouble(txtValorDiaria.getText()));
       
       btnInstanciar.setEnabled(false);
       txtNumQuarto.setEnabled(false);
       txtValorDiaria.setEnabled(false);
       btnReservar.setEnabled(true);
       txtRG.setEnabled(true);
    }//GEN-LAST:event_btnInstanciarActionPerformed

    private void txtValorDiariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorDiariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorDiariaActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservarActionPerformed
        objQuartoHotel.reservar(Integer.parseInt(txtRG.getText()));
        btnReservar.setEnabled(false);
        txtRG.setEnabled(false);
        btnLiberar.setEnabled(true);
        txtQtdDias.setEnabled(true);
        lblSituacao.setText("Ocupado");
        //JOptionPane.showMessageDialog(null,QuartoHotel.reservar());

    }//GEN-LAST:event_btnReservarActionPerformed

    private void btnLiberarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLiberarActionPerformed
        // TODO add your handling code here:
        btnLiberar.setEnabled(false);
        txtQtdDias.setEnabled(false);
                
        lblValorHospedagemReal.setText(String.valueOf(objQuartoHotel.liberar(Integer.parseInt(txtQtdDias.getText()))));
        
        lblSituacao.setText("Livre");
        
        lblTotalFaturadoReais.setText(String.valueOf(objQuartoHotel.getTotalFaturado()));
        
        btnReservar.setEnabled(true);
        txtRG.setEnabled(true);
    }//GEN-LAST:event_btnLiberarActionPerformed

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
            java.util.logging.Logger.getLogger(GuiQuartoHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiQuartoHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiQuartoHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiQuartoHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiQuartoHotel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInstanciar;
    private javax.swing.JButton btnLiberar;
    private javax.swing.JButton btnReservar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblNumQuarto;
    private javax.swing.JLabel lblQtdDias;
    private javax.swing.JLabel lblR$Label;
    private javax.swing.JLabel lblR$Label2;
    private javax.swing.JLabel lblRG;
    private javax.swing.JLabel lblSituacao;
    private javax.swing.JLabel lblSituacaoLabel;
    private javax.swing.JLabel lblTotalFaturadoLabel;
    private javax.swing.JLabel lblTotalFaturadoReais;
    private javax.swing.JLabel lblValDiaria;
    private javax.swing.JLabel lblValorHospedagem;
    private javax.swing.JLabel lblValorHospedagemReal;
    private javax.swing.JTextField txtNumQuarto;
    private javax.swing.JTextField txtQtdDias;
    private javax.swing.JTextField txtRG;
    private javax.swing.JTextField txtValorDiaria;
    // End of variables declaration//GEN-END:variables
    private QuartoHotel objQuartoHotel;
}
