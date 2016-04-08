/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment2;

import javax.swing.JOptionPane;

/**
 *
 * @author 12003065165
 */
public class Segmentation extends javax.swing.JFrame {
    Algorithem algorithem = null;
        
    /**
     * Creates new form Segmentation
     */
    public Segmentation() {
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

        jPanel1 = new javax.swing.JPanel();
        radMaxMatch = new javax.swing.JRadioButton();
        radLonMatch = new javax.swing.JRadioButton();
        btnSelectDictionary = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtInput = new javax.swing.JTextPane();
        btnSegment = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtOutput = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        radMaxMatch.setText("Maximuim Matching");
        radMaxMatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radMaxMatchActionPerformed(evt);
            }
        });

        radLonMatch.setText("Longest Matching");
        radLonMatch.setSelected(true);
        algorithem = new LogestMacthing();
        radLonMatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radLonMatchActionPerformed(evt);
            }
        });

        btnSelectDictionary.setText("Select Dictionary");
        btnSelectDictionary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectDictionaryActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(txtInput);

        btnSegment.setText("Segment Text");
        btnSegment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSegmentActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 0));
        jLabel1.setFont(new java.awt.Font("Tekton Pro Ext", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 51, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Word Segmentation");

        txtOutput.setColumns(20);
        txtOutput.setRows(5);
        jScrollPane3.setViewportView(txtOutput);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(radMaxMatch)
                            .addGap(18, 18, 18)
                            .addComponent(radLonMatch)
                            .addGap(18, 18, 18)
                            .addComponent(btnSelectDictionary, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE))
                        .addComponent(btnSegment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radMaxMatch)
                    .addComponent(radLonMatch)
                    .addComponent(btnSelectDictionary, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSegment, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void btnSelectDictionaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectDictionaryActionPerformed
        // TODO add your handling code here:
       try{
        new OpenDictionary().open();
       }catch(Exception ex){
          
           JOptionPane.showMessageDialog(btnSegment, ex, null, WIDTH, null);
       }
    }//GEN-LAST:event_btnSelectDictionaryActionPerformed

    private void radMaxMatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radMaxMatchActionPerformed
        // TODO add your handling code here:
        algorithem = new MaxumuimMatching();

        radLonMatch.setSelected(false);
    }//GEN-LAST:event_radMaxMatchActionPerformed

    private void radLonMatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radLonMatchActionPerformed
        // TODO add your handling code here:
        algorithem = new LogestMacthing();

        radMaxMatch.setSelected(false);
        
    }//GEN-LAST:event_radLonMatchActionPerformed

    private void btnSegmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSegmentActionPerformed
        // TODO add your handling code here:
        try{
            txtOutput.setText(algorithem.perform(txtInput.getText()));
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(btnSegment,ex);
        }
        
    }//GEN-LAST:event_btnSegmentActionPerformed

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
            java.util.logging.Logger.getLogger(Segmentation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Segmentation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Segmentation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Segmentation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Segmentation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSegment;
    private javax.swing.JButton btnSelectDictionary;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JRadioButton radLonMatch;
    private javax.swing.JRadioButton radMaxMatch;
    private javax.swing.JTextPane txtInput;
    private javax.swing.JTextArea txtOutput;
    // End of variables declaration//GEN-END:variables
}
