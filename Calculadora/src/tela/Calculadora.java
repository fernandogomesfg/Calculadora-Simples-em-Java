/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import javax.swing.JOptionPane;

/**
 *
 * @author Fernando Gomes
 */
public class Calculadora extends javax.swing.JFrame {

    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
        initComponents();

    }
    //Variaveis globais
    double n1, n2, res;
    String num1, num2;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_num1 = new javax.swing.JTextField();
        txt_num2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_res = new javax.swing.JTextField();
        btn_soma = new javax.swing.JButton();
        btn_subtraccao = new javax.swing.JButton();
        btn_multiplicacao = new javax.swing.JButton();
        btn_divisao = new javax.swing.JButton();
        btn_apagar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setResizable(false);

        jLabel1.setText("Numero 1");

        jLabel2.setText("Numero 2");

        txt_num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_num1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Resultado");

        txt_res.setEnabled(false);

        btn_soma.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_soma.setText("+");
        btn_soma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_somaActionPerformed(evt);
            }
        });

        btn_subtraccao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_subtraccao.setText("-");
        btn_subtraccao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_subtraccaoActionPerformed(evt);
            }
        });

        btn_multiplicacao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_multiplicacao.setText("*");
        btn_multiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multiplicacaoActionPerformed(evt);
            }
        });

        btn_divisao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_divisao.setText("/");
        btn_divisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_divisaoActionPerformed(evt);
            }
        });

        btn_apagar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_apagar.setText("C");
        btn_apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_apagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txt_num1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txt_res, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txt_num2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btn_soma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_subtraccao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_multiplicacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_divisao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_apagar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_num1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_num2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_res, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_soma)
                    .addComponent(btn_subtraccao)
                    .addComponent(btn_multiplicacao)
                    .addComponent(btn_divisao)
                    .addComponent(btn_apagar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_num1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_num1ActionPerformed

    }//GEN-LAST:event_txt_num1ActionPerformed

    private void btn_somaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_somaActionPerformed
        // soma
        //Pegando os valores digitado dentro dos campos
        num1 = txt_num1.getText();
        num2 = txt_num2.getText();

        //Fazendo a conversao dos valores 
        n1 = Double.parseDouble(num1);
        n2 = Double.parseDouble(num2);

        //Efectuando a soma
        res = n1 + n2;

        //Mostrando no campo resultado
        txt_res.setText("" + res + "");
    }//GEN-LAST:event_btn_somaActionPerformed

    private void btn_subtraccaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_subtraccaoActionPerformed
        // Subtraccao
        //Pegando os valores digitado dentro dos campos
        num1 = txt_num1.getText();
        num2 = txt_num2.getText();

        //Fazendo a conversao dos valores 
        n1 = Double.parseDouble(num1);
        n2 = Double.parseDouble(num2);

        //Efectuando a subtraccao
        res = n1 - n2;

        //Mostrando no campo resultado
        txt_res.setText("" + res + "");
    }//GEN-LAST:event_btn_subtraccaoActionPerformed

    private void btn_multiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multiplicacaoActionPerformed
        // Multiplicacao
        //Pegando os valores digitado dentro dos campos
        num1 = txt_num1.getText();
        num2 = txt_num2.getText();

        //Fazendo a conversao dos valores 
        n1 = Double.parseDouble(num1);
        n2 = Double.parseDouble(num2);

        //Efectuando a multiplicacao
        res = n1 * n2;

        //Mostrando no campo resultado
        txt_res.setText("" + res + "");
    }//GEN-LAST:event_btn_multiplicacaoActionPerformed

    private void btn_divisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_divisaoActionPerformed
        // Divisao
        //Pegando os valores digitado dentro dos campos
        num1 = txt_num1.getText();
        num2 = txt_num2.getText();

        //Fazendo a conversao dos valores 
        n1 = Double.parseDouble(num1);
        n2 = Double.parseDouble(num2);

        //Efectuando a divisao
        res = n1 / n2;

        //Mostrando no campo resultado
        txt_res.setText("" + res + "");

    }//GEN-LAST:event_btn_divisaoActionPerformed

    private void btn_apagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_apagarActionPerformed
        // Limpar
        txt_num1.setText("");
        txt_num2.setText("");
        txt_res.setText("");
    }//GEN-LAST:event_btn_apagarActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_apagar;
    private javax.swing.JButton btn_divisao;
    private javax.swing.JButton btn_multiplicacao;
    private javax.swing.JButton btn_soma;
    private javax.swing.JButton btn_subtraccao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txt_num1;
    private javax.swing.JTextField txt_num2;
    private javax.swing.JTextField txt_res;
    // End of variables declaration//GEN-END:variables
}
