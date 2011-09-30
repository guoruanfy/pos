/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PayByCrashDialog.java
 *
 * Created on 2011-9-24, 1:03:27
 */
package pos;

import java.awt.event.KeyEvent;
import java.util.Date;
import java.util.UUID;
import org.jdesktop.application.Action;

/**
 *
 * @author fangyuan01
 */
public class PayByCashDialog extends javax.swing.JDialog {

    /** Creates new form PayByCrashDialog */
    public PayByCashDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
    }

    public PayByCashDialog(java.awt.Frame parent, boolean modal,POSView parentView,double expectedCrash) {
        this(parent, modal);
//        展示从主界面获得的信息
        this.expectedPayNo = expectedCrash;
        this.parentView = parentView;
        expectedPay.setText(POSUtils.formatCash(expectedCrash));
//        设定初始的焦点
        actualPay.requestFocus(); 
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        actualPay = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        discountPay = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        restPay = new javax.swing.JLabel();
        expectedPay = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(pos.POSApp.class).getContext().getResourceMap(PayByCashDialog.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setMinimumSize(new java.awt.Dimension(785, 551));
        setName("Form"); // NOI18N
        setResizable(false);

        jPanel1.setBackground(resourceMap.getColor("jPanel1.background")); // NOI18N
        jPanel1.setForeground(resourceMap.getColor("jPanel1.foreground")); // NOI18N
        jPanel1.setMaximumSize(new java.awt.Dimension(785, 551));
        jPanel1.setMinimumSize(new java.awt.Dimension(785, 551));
        jPanel1.setName("jPanel1"); // NOI18N

        jLabel1.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
        jLabel1.setForeground(resourceMap.getColor("jLabel1.foreground")); // NOI18N
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        actualPay.setBackground(resourceMap.getColor("actualPay.background")); // NOI18N
        actualPay.setFont(resourceMap.getFont("actualPay.font")); // NOI18N
        actualPay.setForeground(resourceMap.getColor("actualPay.foreground")); // NOI18N
        actualPay.setText(resourceMap.getString("actualPay.text")); // NOI18N
        actualPay.setName("actualPay"); // NOI18N
        actualPay.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                caculateAfterFocusLost1(evt);
            }
        });
        actualPay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                caculateAfterEnter1(evt);
            }
        });

        jLabel2.setFont(resourceMap.getFont("jLabel2.font")); // NOI18N
        jLabel2.setForeground(resourceMap.getColor("jLabel2.foreground")); // NOI18N
        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        jLabel7.setFont(resourceMap.getFont("jLabel7.font")); // NOI18N
        jLabel7.setForeground(resourceMap.getColor("jLabel7.foreground")); // NOI18N
        jLabel7.setText(resourceMap.getString("jLabel7.text")); // NOI18N
        jLabel7.setName("jLabel7"); // NOI18N

        discountPay.setFont(resourceMap.getFont("discountPay.font")); // NOI18N
        discountPay.setText(resourceMap.getString("discountPay.text")); // NOI18N
        discountPay.setName("discountPay"); // NOI18N
        discountPay.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                caculateAfterLostFocus2(evt);
            }
        });
        discountPay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                caculateAfterEnter2(evt);
            }
        });

        jLabel3.setFont(resourceMap.getFont("jLabel3.font")); // NOI18N
        jLabel3.setForeground(resourceMap.getColor("jLabel3.foreground")); // NOI18N
        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        restPay.setFont(resourceMap.getFont("restCrash.font")); // NOI18N
        restPay.setForeground(resourceMap.getColor("restCrash.foreground")); // NOI18N
        restPay.setText(resourceMap.getString("restCrash.text")); // NOI18N
        restPay.setName("restCrash"); // NOI18N

        expectedPay.setFont(resourceMap.getFont("expectedPay.font")); // NOI18N
        expectedPay.setForeground(resourceMap.getColor("expectedPay.foreground")); // NOI18N
        expectedPay.setText(resourceMap.getString("expectedPay.text")); // NOI18N
        expectedPay.setName("expectedPay"); // NOI18N

        javax.swing.ActionMap actionMap = org.jdesktop.application.Application.getInstance(pos.POSApp.class).getContext().getActionMap(PayByCashDialog.class, this);
        jButton1.setAction(actionMap.get("submit")); // NOI18N
        jButton1.setFont(resourceMap.getFont("jButton1.font")); // NOI18N
        jButton1.setText(resourceMap.getString("jButton1.text")); // NOI18N
        jButton1.setName("jButton1"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(jLabel2))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(actualPay, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(expectedPay, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                    .addComponent(restPay, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                    .addComponent(discountPay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE))
                .addContainerGap(166, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(expectedPay))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(actualPay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(discountPay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(restPay))
                .addGap(36, 36, 36)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
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

private void caculateAfterLostFocus2(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_caculateAfterLostFocus2
    caculate(); 
}//GEN-LAST:event_caculateAfterLostFocus2

private void caculateAfterEnter1(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caculateAfterEnter1
    if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
        caculate(); 
    }

}//GEN-LAST:event_caculateAfterEnter1

private void caculateAfterEnter2(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caculateAfterEnter2
   if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
        caculate(); 
    }
}//GEN-LAST:event_caculateAfterEnter2

private void caculateAfterFocusLost1(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_caculateAfterFocusLost1
    caculate(); 
}//GEN-LAST:event_caculateAfterFocusLost1

// 窗口退出前执行的处理
private void saveOrder() {
    

    //保存订单和详细的订单项
        String no = UUID.randomUUID().toString();
        Date date = new Date();
        Order order = new Order();
        order.setNo(no);
        order.setExpectedPay(expectedPayNo);
        order.setActualPay(finalPayNo);
        order.setOperator(POSUtils.currentOperator);
        order.setDate(date.getTime()+"");
        db.saveOrder(order);

    //    保存订单明细
        parentView.saveCurrentOrderItems(no);
        parentView.reset();

}

private void caculate(){
    String actualPayNoStr = actualPay.getText();
    String discountPayNoStr = discountPay.getText();
    Double restPayNo = 0.0;
    if(actualPayNoStr != null && !actualPayNoStr.equals("")){
        double actualPayNo = Double.parseDouble(actualPayNoStr);
        double discountPayNo = Double.parseDouble(discountPayNoStr);
        restPayNo = actualPayNo - expectedPayNo + discountPayNo;
        finalPayNo = expectedPayNo - discountPayNo;
    } 
    restPay.setText(POSUtils.formatCash(restPayNo));
}

private double expectedPayNo = 0.0;
private double finalPayNo = 0.0;
private DB db = new DB();
private POSView parentView = null;

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
            java.util.logging.Logger.getLogger(PayByCashDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PayByCashDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PayByCashDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PayByCashDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                PayByCashDialog dialog = new PayByCashDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

//    确定按钮执行的动作
    @Action
    public void submit() {
        String actualPayNoStr = actualPay.getText();
        if(POSUtils.isNull(actualPayNoStr)) {
            POSUtils.showTips("请输入付款的金额！");
        } else {
            double actualPayNo = Double.parseDouble(actualPayNoStr);
            if(actualPayNo < finalPayNo) {
                POSUtils.showTips("付款金额不够！");
            } else {   
                saveOrder();
                this.dispose();
            }
        }
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField actualPay;
    private javax.swing.JTextField discountPay;
    private javax.swing.JLabel expectedPay;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel restPay;
    // End of variables declaration//GEN-END:variables
}