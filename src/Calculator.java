/*
 * Arun K
 * This is a GUI average grade calculator
 * Septembre 21 2019
*/

/**
 *
 * @author arkir7294
 */
public class Calculator extends javax.swing.JFrame {

    /**
     * Creates new form Calculator
     */
    public Calculator() {
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
        Title = new javax.swing.JLabel();
        FirstMarkLBL = new javax.swing.JLabel();
        SecondMarkLBL = new javax.swing.JLabel();
        ThirdMarkLBL = new javax.swing.JLabel();
        FourthMarkLBL = new javax.swing.JLabel();
        FirstTxt = new javax.swing.JTextField();
        SecondTxt = new javax.swing.JTextField();
        FourthTxt = new javax.swing.JTextField();
        ThirdTxt = new javax.swing.JTextField();
        Button = new javax.swing.JButton();
        FinalGradeTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Title.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Title.setText("Grade Calculator");

        FirstMarkLBL.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        FirstMarkLBL.setText("First Mark:");

        SecondMarkLBL.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        SecondMarkLBL.setText("Second Mark:");

        ThirdMarkLBL.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ThirdMarkLBL.setText("Third Mark:");

        FourthMarkLBL.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        FourthMarkLBL.setText("Fourth Mark:");

        FirstTxt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        FirstTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstTxtActionPerformed(evt);
            }
        });

        SecondTxt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        SecondTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SecondTxtActionPerformed(evt);
            }
        });

        FourthTxt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        FourthTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FourthTxtActionPerformed(evt);
            }
        });

        ThirdTxt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ThirdTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThirdTxtActionPerformed(evt);
            }
        });

        Button.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Button.setText("Calculate");
        Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonActionPerformed(evt);
            }
        });

        FinalGradeTxt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        FinalGradeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinalGradeTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(SecondTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(38, 38, 38)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(13, 13, 13)
                                    .addComponent(FirstMarkLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(90, 90, 90)
                                    .addComponent(FirstTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(ThirdMarkLBL)
                                            .addComponent(SecondMarkLBL))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(13, 13, 13)
                                            .addComponent(FourthMarkLBL)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(ThirdTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                        .addComponent(FourthTxt))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(FinalGradeTxt)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FirstMarkLBL)
                    .addComponent(FirstTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SecondTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SecondMarkLBL))
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ThirdMarkLBL)
                    .addComponent(ThirdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FourthMarkLBL)
                    .addComponent(FourthTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addComponent(Button)
                .addGap(50, 50, 50)
                .addComponent(FinalGradeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
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

    private void FirstTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstTxtActionPerformed

    private void SecondTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SecondTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SecondTxtActionPerformed

    private void FourthTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FourthTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FourthTxtActionPerformed

    private void ThirdTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThirdTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ThirdTxtActionPerformed

    private void FinalGradeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinalGradeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FinalGradeTxtActionPerformed

    private void ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonActionPerformed
//      Variable Declaration Area
        double num1;
        double num2;
        double num3;
        double num4;
        double answer;
//      Calculation Area
        num1 = Double.parseDouble(FirstTxt.getText());
        num2 = Double.parseDouble(SecondTxt.getText());
        num3 = Double.parseDouble(ThirdTxt.getText());
        num4 = Double.parseDouble(FourthTxt.getText());
       
//      Average Calculator  
        answer = ((num1 + num2 + num3 + num4) / 4) * 10;
        
        
        answer = Math.round(answer);
        
        answer = answer /10;
        
        FinalGradeTxt.setText(String.valueOf(answer + "%"));
    }//GEN-LAST:event_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button;
    private javax.swing.JTextField FinalGradeTxt;
    private javax.swing.JLabel FirstMarkLBL;
    private javax.swing.JTextField FirstTxt;
    private javax.swing.JLabel FourthMarkLBL;
    private javax.swing.JTextField FourthTxt;
    private javax.swing.JLabel SecondMarkLBL;
    private javax.swing.JTextField SecondTxt;
    private javax.swing.JLabel ThirdMarkLBL;
    private javax.swing.JTextField ThirdTxt;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
