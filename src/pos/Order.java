/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pos;


/**
 *
 * @author fangyuan01
 */
public class Order {
    public static int CASH = 0;
    public static int CREDIT = 1;
     
    
     private String no;
     private double expectedPay;
     private double actualPay;
     private String operator;
     private String date;


     

    public double getActualPay() {
        return actualPay;
    }

    public void setActualPay(double actualPay) {
        this.actualPay = actualPay;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getExpectedPay() {
        return expectedPay;
    }

    public void setExpectedPay(double expectedPay) {
        this.expectedPay = expectedPay;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
     
     
}
