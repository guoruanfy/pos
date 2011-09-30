/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * InventoryDialog.java
 *
 * Created on 2011-9-26, 13:20:45
 */
package pos;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.application.Action;

/**
 *
 * @author fangyuan01
 */
public class InventoryDialog extends javax.swing.JDialog {

    /** Creates new form InventoryDialog */
    public InventoryDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        ordersTable.getSelectionModel().addListSelectionListener(new ListSelectionListener(){

            public void valueChanged(ListSelectionEvent e) {
                selectedOrderItem = ordersTable.getSelectedRow();
            }

         }); 
        
//        默认开始结束日期都为今天
        Date now = new Date();
        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
        String dateStr = dateFormatter.format(now);
        startDateTF.setText(dateStr);
        endDateTF.setText(dateStr);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        startDateTF = new javax.swing.JTextField();
        endDateTF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ordersTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(pos.POSApp.class).getContext().getResourceMap(InventoryDialog.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setMinimumSize(new java.awt.Dimension(726, 464));
        setName("Form"); // NOI18N
        setResizable(false);

        jLabel1.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        startDateTF.setText(resourceMap.getString("startDateTF.text")); // NOI18N
        startDateTF.setName("startDateTF"); // NOI18N

        endDateTF.setText(resourceMap.getString("endDateTF.text")); // NOI18N
        endDateTF.setName("endDateTF"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        ordersTable.setModel(ordersTableModel);
        ordersTable.setName("ordersTable"); // NOI18N
        ordersTable.setRowHeight(25);
        ordersTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(ordersTable);

        javax.swing.ActionMap actionMap = org.jdesktop.application.Application.getInstance(pos.POSApp.class).getContext().getActionMap(InventoryDialog.class, this);
        jButton1.setAction(actionMap.get("search")); // NOI18N
        jButton1.setFont(resourceMap.getFont("jButton1.font")); // NOI18N
        jButton1.setText(resourceMap.getString("jButton1.text")); // NOI18N
        jButton1.setName("jButton1"); // NOI18N

        jButton2.setAction(actionMap.get("showOrderItemDetail")); // NOI18N
        jButton2.setFont(resourceMap.getFont("jButton2.font")); // NOI18N
        jButton2.setText(resourceMap.getString("jButton2.text")); // NOI18N
        jButton2.setName("jButton2"); // NOI18N

        jButton3.setAction(actionMap.get("sumOrderItems")); // NOI18N
        jButton3.setFont(resourceMap.getFont("jButton3.font")); // NOI18N
        jButton3.setText(resourceMap.getString("jButton3.text")); // NOI18N
        jButton3.setName("jButton3"); // NOI18N

        jLabel2.setFont(resourceMap.getFont("jLabel2.font")); // NOI18N
        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(startDateTF, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(endDateTF, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jButton1))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(endDateTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(startDateTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(InventoryDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InventoryDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InventoryDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InventoryDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                InventoryDialog dialog = new InventoryDialog(new javax.swing.JFrame(), true);
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

    @Action
    public void search() {
        String startDateStr = startDateTF.getText();
        String endDateStr = endDateTF.getText();
        if(POSUtils.isNull(startDateStr) || POSUtils.isNull(endDateStr)) {
            POSUtils.showTips("请输入查询的日期");
        } else {
            Long start = POSUtils.getTimeFromDateString(startDateStr);
            Long end = POSUtils.getTimeFromDateString(endDateStr);
            
            if(start == -1 || end == -1) {
                POSUtils.showTips("请按格式 2011-8-8的形式输入日期");
            } else {
                clearTableModel();
//                end 需要加一天
                end += 24*60*60*1000;
                orders = db.queryOrderByDate(start, end);
                for(Order order : orders) {
                    Object[] row = {order.getNo(),POSUtils.toLocalDate(Long.parseLong(order.getDate())),
                        POSUtils.formatCash(order.getExpectedPay()),
                        POSUtils.formatCash(order.getActualPay()),order.getOperator()};
                    ordersTableModel.addRow(row);
                }
            }
        }


    }
    
    private void clearTableModel() {
        int length = ordersTableModel.getRowCount();
        for(int i = 0;i < length; i++) {
            ordersTableModel.removeRow(0);
        }
    }

    @Action
    public void showOrderItemDetail() {
           if( ordersTableModel.getRowCount() > 0) {
                if(selectedOrderItem >= 0 && selectedOrderItem <  ordersTableModel.getRowCount()) {
//                     JDialog updateOrderItemDialog = new UpdateOrderItemDialog(mainFrame,true,this);
//                     showDialog(updateOrderItemDialog);
                    String no = ordersTableModel.getValueAt(selectedOrderItem,0).toString();
                    List<OrderItem> items = db.getOrderItems(no);
                    JFrame mainFrame = POSApp.getApplication().getMainFrame();
                    JDialog orderItemDialog = new OrderItemDialog(mainFrame,true,items);
                    orderItemDialog.setLocationRelativeTo(mainFrame);
                    orderItemDialog.setAlwaysOnTop(true);
                    POSApp.getApplication().show(orderItemDialog);
                } else {
                    POSUtils.showTips("请选择要查看哪条交易明细！");
                }
            } else {
                POSUtils.showTips("请选择要查看哪条交易明细！");
            }
    }

    @Action
    public void sumOrderItems() {
        if(orders == null || orders.isEmpty()) {
            POSUtils.showTips("请选择要扎帐的时间段！");
        } else {
            double sum = 0.0;
            HashMap<String,Double> sperateSum = new HashMap<String, Double>();
            for(Order order: orders) {
                sum += order.getActualPay();
                String operator = order.getOperator();
                if(sperateSum.get(operator) == null) {
                    sperateSum.put(operator, order.getActualPay());
                } else {
                    sperateSum.put(operator, sperateSum.get(operator) + order.getActualPay());
                }
            }
            JFrame mainFrame = POSApp.getApplication().getMainFrame();
            JDialog orderItemDialog = new PitchAccountDialog(mainFrame,true,
                    startDateTF.getText(),endDateTF.getText(),sum,sperateSum);
            orderItemDialog.setLocationRelativeTo(mainFrame);
            orderItemDialog.setAlwaysOnTop(true);
            POSApp.getApplication().show(orderItemDialog);
        }
    }
    
    private String[] columnNames= {"交易号","交易日期","应付款","最终付款","操作人"};
    private Object[][] rowData = {};
    private DefaultTableModel ordersTableModel = new DefaultTableModel(rowData, columnNames){
        @Override
        public boolean isCellEditable(int row, int column) { 
            return false; 
        }
       
    };
  //    保存当前选中的交易记录
    private int selectedOrderItem = -1;
    private DB db = new DB();
    private List<Order> orders = null;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField endDateTF;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable ordersTable;
    private javax.swing.JTextField startDateTF;
    // End of variables declaration//GEN-END:variables
}
