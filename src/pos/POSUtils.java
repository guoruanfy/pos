/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pos;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author fangyuan01
 */
public class POSUtils {
    
//    保存当前的用户，当用户退出的时候需要恢复初始值
    public static String currentOperator = null;
    public static int currentRole = User.NORMAL;

    
    public static String formatCash(double cash) {
        return String.format("%.1f", cash);
    }
    
//    public static String showLikeInt(double no) {
//       return String.format("%.0f", no);
//    }
    
    public static boolean isLogined(){
        return currentOperator != null;
    }
    
    public static boolean isAdmin() {
        return currentRole == User.ADMIN;
    }
    
    public static int productLevelStrToInt(String levelStr) {
        int level = Product.LOW_LEVEL;
        if(levelStr.equals("初级")) {
            level = Product.LOW_LEVEL;
        } else if(levelStr.equals("中级")) {
            level = Product.MIDDLE_LEVEL;
        }else if(levelStr.equals("高级")) {
            level = Product.HIGH_LEVEL;
        }
        return level;
    }
    
    public static String productSaleTypeIntToStr(int type) {
        String typeStr = "零售";
        switch(type) {
            case Product.LOW_LEVEL:
                typeStr = "零售";
                break;
            case Product.MIDDLE_LEVEL:
                typeStr = "整售";
                break;
        }
        return typeStr;
    }
    
    public static int productSaleTypeStrToInt(String typeStr) {
        int type = Product.LOW_LEVEL;
        if(typeStr.equals("整售")){
            type = Product.MIDDLE_LEVEL;
        }
        return type;
    }
    
    public static String getPayTypefromInt(int type) {
        String typeStr = "现金支付";
        if(type == Order.CREDIT) {
            typeStr = "记账";
        }
        return typeStr;
    }
    
    public static int getRoleFromBool(boolean flag) {
        if(flag) {
            return User.ADMIN;
        } else {
            return User.NORMAL;
        }
    }
    
    
    public static void showTips(String message){
        JOptionPane.showMessageDialog(null, message,"温馨提示！",JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static boolean isNull(String str) {
        return str == null || str.equals("");
    }
    
    public static boolean justifyAdmin(int role) {
        return role == User.ADMIN;
    }
    
    public static String getBetweenDate(String sj1, String sj2) {
        SimpleDateFormat myFormatter = new SimpleDateFormat("yyyy-MM-dd");
        long day = 0;
        try {
            java.util.Date date = myFormatter.parse(sj1);
            
            java.util.Date mydate = myFormatter.parse(sj2);
            day = (date.getTime() - mydate.getTime()) / (24 * 60 * 60 * 1000);
        } catch (Exception e) {
             return "";
        }
         return day + "";
         
    }
    
//    time是毫秒数
    public static String toLocalDate(Long time) {
        Date date = new Date(time);
        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        return dateFormatter.format(date);
    }
    
    
    public static Long getTimeFromDateString(String dateStr) {
        long date = 0;
        try {
            DateFormat df = DateFormat.getDateInstance();
            Date d = df.parse(dateStr);
            date = d.getTime();
        } catch(ParseException e) {
            date = -1;
        }
        return date;
    }
}
