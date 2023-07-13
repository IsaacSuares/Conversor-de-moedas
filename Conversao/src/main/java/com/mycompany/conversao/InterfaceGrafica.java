/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.conversao;

import javax.swing.JOptionPane;

/**
 *
 * @author isaac
 */
public class InterfaceGrafica extends javax.swing.JFrame {

    /**
     * Creates new form InterfaceGrafica
     */
    public InterfaceGrafica() {
        initComponents();
        valorOrigemFormatadoTF.setBackground(new java.awt.Color(0,0,0,1));
        resultadoFormatadoTF.setBackground(new java.awt.Color(0,0,0,1));
    }
    
    
    public Moeda moedaOrigem = null;
    public Moeda moedaDestino = null;
    Conversor conversor = new Conversor();
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        moedaOrigemCB = new javax.swing.JComboBox<>();
        moedaDestinoCB = new javax.swing.JComboBox<>();
        valorTF = new javax.swing.JTextField();
        converterBT = new javax.swing.JButton();
        resultadoTF = new javax.swing.JTextField();
        valorOrigemFormatadoTF = new javax.swing.JTextField();
        resultadoFormatadoTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(48, 49, 52));

        moedaOrigemCB.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        moedaOrigemCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione>", "Real", "Dólar", "Euro" }));
        moedaOrigemCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moedaOrigemCBActionPerformed(evt);
            }
        });

        moedaDestinoCB.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        moedaDestinoCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione>", "Real", "Dólar", "Euro" }));
        moedaDestinoCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moedaDestinoCBActionPerformed(evt);
            }
        });

        valorTF.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        valorTF.setForeground(new java.awt.Color(154, 160, 157));
        valorTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorTFActionPerformed(evt);
            }
        });

        converterBT.setText("Converter");
        converterBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                converterBTActionPerformed(evt);
            }
        });

        resultadoTF.setEditable(false);
        resultadoTF.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        resultadoTF.setForeground(new java.awt.Color(154, 160, 157));

        valorOrigemFormatadoTF.setEditable(false);
        valorOrigemFormatadoTF.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        valorOrigemFormatadoTF.setForeground(new java.awt.Color(154, 160, 157));
        valorOrigemFormatadoTF.setBorder(null);
        valorOrigemFormatadoTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorOrigemFormatadoTFActionPerformed(evt);
            }
        });

        resultadoFormatadoTF.setEditable(false);
        resultadoFormatadoTF.setFont(new java.awt.Font("Serif", 0, 36)); // NOI18N
        resultadoFormatadoTF.setForeground(new java.awt.Color(232, 234, 237));
        resultadoFormatadoTF.setBorder(null);
        resultadoFormatadoTF.setSelectedTextColor(new java.awt.Color(242, 242, 242));
        resultadoFormatadoTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultadoFormatadoTFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(valorTF)
                            .addComponent(resultadoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(moedaDestinoCB, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(moedaOrigemCB, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(converterBT)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(resultadoFormatadoTF)
                        .addGap(282, 282, 282))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(valorOrigemFormatadoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(398, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(valorOrigemFormatadoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(resultadoFormatadoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(166, 166, 166)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(valorTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(moedaOrigemCB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(resultadoTF)
                    .addComponent(moedaDestinoCB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(converterBT)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void converterBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_converterBTActionPerformed
        resultadoTF.setText("");
        validaEntrada(valorTF.getText());

        if(moedaOrigemCB.getSelectedItem().toString().equals("<Selecione>")){
            JOptionPane.showMessageDialog(rootPane, "Você deve selecionar uma moeda de origem", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        else if(moedaDestinoCB.getSelectedItem().toString().equals("<Selecione>")){
            JOptionPane.showMessageDialog(rootPane, "Você deve selecionar uma moeda de destino", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        else{
            moedaOrigem.setValor(Double.parseDouble(valorTF.getText().replace(',', '.')));
            double resultado = conversor.converter(moedaOrigem, moedaDestino);
            resultadoTF.setText(String.valueOf(resultado));
            
            valorOrigemFormatadoTF.setText(valorTF.getText()+" " + moedaOrigemCB.getSelectedItem().toString() + " igual a ");
            resultadoFormatadoTF.setText(resultadoTF.getText() + " " + moedaDestinoCB.getSelectedItem().toString());

        }

    }//GEN-LAST:event_converterBTActionPerformed

    private void valorTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorTFActionPerformed
        validaEntrada(valorTF.getText());
    }//GEN-LAST:event_valorTFActionPerformed

    private void moedaDestinoCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moedaDestinoCBActionPerformed
        if(moedaDestinoCB.getSelectedItem().toString().equals(moedaOrigemCB.getSelectedItem().toString())){
            moedaDestinoCB.setSelectedItem("<Selecione>");
        }
        switch (moedaDestinoCB.getSelectedItem().toString()) {
            case "Real" -> moedaDestino = new Real();
            case "Dólar" -> moedaDestino = new Dolar();
            case "Euro" -> moedaDestino = new Euro();
            case "<Selecione>" -> JOptionPane.showMessageDialog(rootPane, "Você deve selecionar uma moeda", "Selecione uma moeda", JOptionPane.ERROR_MESSAGE);
            default -> {
            }
        }
    }//GEN-LAST:event_moedaDestinoCBActionPerformed

    private void moedaOrigemCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moedaOrigemCBActionPerformed
        if(moedaOrigemCB.getSelectedItem().toString().equals(moedaDestinoCB.getSelectedItem().toString())){
            moedaOrigemCB.setSelectedItem("<Selecione>");
        }
        switch (moedaOrigemCB.getSelectedItem().toString()) {
            case "Real" -> moedaOrigem = new Real();
            case "Dólar" -> moedaOrigem = new Dolar();
            case "Euro" -> moedaOrigem = new Euro();
            case "<Selecione>" -> JOptionPane.showMessageDialog(rootPane, "Você deve selecionar uma moeda", "Selecione uma moeda", JOptionPane.ERROR_MESSAGE);
            default -> {
            }
        }
    }//GEN-LAST:event_moedaOrigemCBActionPerformed

    private void valorOrigemFormatadoTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorOrigemFormatadoTFActionPerformed
        
    }//GEN-LAST:event_valorOrigemFormatadoTFActionPerformed

    private void resultadoFormatadoTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultadoFormatadoTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultadoFormatadoTFActionPerformed
    
    private void validaEntrada(String entrada){
        String regex = "^\\d+(?:[,.]\\d+)?$";
            if (!valorTF.getText().matches(regex)){
                valorTF.setText("");
                JOptionPane.showMessageDialog(rootPane, "Valor inválido, tente novamente", "Erro", JOptionPane.ERROR_MESSAGE);
            }
    }
    
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
            java.util.logging.Logger.getLogger(InterfaceGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceGrafica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton converterBT;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> moedaDestinoCB;
    private javax.swing.JComboBox<String> moedaOrigemCB;
    private javax.swing.JTextField resultadoFormatadoTF;
    private javax.swing.JTextField resultadoTF;
    private javax.swing.JTextField valorOrigemFormatadoTF;
    private javax.swing.JTextField valorTF;
    // End of variables declaration//GEN-END:variables
}
