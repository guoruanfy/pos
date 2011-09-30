/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pos;


/**
 *
 * @author fangyuan01
 */
public class Product {
    public  static int level = 1;
    //    进价
    public static final int ORIGINAL_LEVEL = 0;
    //    零售价
    public static final int LOW_LEVEL = 1;
    //   整售价
    public static final int MIDDLE_LEVEL = 2;
    //    批发价
    public static final int HIGH_LEVEL = 3;
    
    
    private String code;
    private String name;
    private double totalNo;
    private double saleNo;
//    进价
    private double originalPrice;
//    零售价
    private double discountPrice1;
//   整售价
    private double discountPrice2;
//    批发价
    private double discountPrice3;

    private String createDate;

    public static int getLevel() {
        return level;
    }

    public static void setLevel(int level) {
        Product.level = level;
    }


    
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public double getDiscountPrice1() {
        return discountPrice1;
    }

    public void setDiscountPrice1(double discountPrice1) {
        this.discountPrice1 = discountPrice1;
    }

    public double getDiscountPrice2() {
        return discountPrice2;
    }

    public void setDiscountPrice2(double discountPrice2) {
        this.discountPrice2 = discountPrice2;
    }

    public double getDiscountPrice3() {
        return discountPrice3;
    }

    public void setDiscountPrice3(double discountPrice3) {
        this.discountPrice3 = discountPrice3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSaleNo() {
        return saleNo;
    }

    public void setSaleNo(double saleNo) {
        this.saleNo = saleNo;
    }

    public double getTotalNo() {
        return totalNo;
    }

    public void setTotalNo(double totalNo) {
        this.totalNo = totalNo;
    }



    public double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }


    public double getDiscountPrice() {
        return getDiscountPrice(Product.level);
    }
    
    public double getDiscountPrice(int level) {
        double price = 0.0;
        switch(level) {
            case 1:
                price = this.getDiscountPrice1();
                break;
            case 2:
                price = this.getDiscountPrice2();
                break;
            case 3:
                price = this.getDiscountPrice3();
                break;
            case 0:
                price = this.originalPrice;
                break;
        }
        return price;
    } 
    
    
}
