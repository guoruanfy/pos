/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pos;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author fangyuan01
 */
public class DB {   

    public List<Product> queryProductsByName(String name) {
        List<Product> products = new ArrayList<Product>();
         try {
            String fuzzyName = "%"+name+"%";
            String queryString = "select * from product where name like '"+fuzzyName +"'";
            Statement stmt = DBConnector.getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(queryString);
            while(rs.next()) {
                Product product = new Product();
                product.setCode(rs.getString("code"));
                product.setName(rs.getString("name"));
                product.setOriginalPrice(rs.getDouble("originalPrice"));
                product.setDiscountPrice1(rs.getDouble("discountPrice1"));
                product.setDiscountPrice2(rs.getDouble("discountPrice2"));
                product.setDiscountPrice3(rs.getDouble("discountPrice3"));
                product.setTotalNo(rs.getDouble("totalNo"));
                product.setSaleNo(rs.getDouble("saleNo"));
                products.add(product);
            }
            stmt.close();
        } catch(Exception e) {
            System.err.println(e.getMessage());
        } 
        return products;
    }

    
    public  Product queryProductByCode(String code) {
        Product product = null;
        Statement stmt = null;
        try {
            String queryString = "select * from product where code = '"+code +"'";
            stmt = DBConnector.getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(queryString);
            
            if(rs.next()) {
                product = new Product();
                product.setCode(rs.getString("code"));
                product.setName(rs.getString("name"));
                product.setOriginalPrice(rs.getDouble("originalPrice"));
                product.setDiscountPrice1(rs.getDouble("discountPrice1"));
                product.setDiscountPrice2(rs.getDouble("discountPrice2"));
                product.setDiscountPrice3(rs.getDouble("discountPrice3"));
                product.setTotalNo(rs.getDouble("totalNo"));
                product.setSaleNo(rs.getDouble("saleNo"));
            }
            stmt.close();
        } catch(Exception e) {
            System.err.println(e.getMessage());
        } 
        return product;
    }
    
    public boolean hasProduct(String code) {
        return queryProductByCode(code) != null;
    }
    
    public void deleteProduct(String code) {
        String deleteString = "delete from product where code = '"+code+"'";
        try {
           Statement stmt = DBConnector.getConnection().createStatement();
           stmt.executeUpdate(deleteString);
        } catch(Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    public void saveProduct(String code, String name, double originalPrice, double discountPrice1,
            double discountPrice2, double discountPrice3, double totalNo, double saleNo) {
        Date now = new Date();
        String insertSql = "insert into product(code,name,originalPrice,discountPrice1,"
                + "discountPrice2,discountPrice3,totalNo,saleNo,createDate)"
                + " values('"+code+"','"+name+"','"+originalPrice +"','"+discountPrice1+"','"
                +discountPrice2+"','"+discountPrice3+"','"+totalNo+"','"+saleNo+"','"+now.getTime()+"')";
        try {
            Statement stmt = DBConnector.getConnection().createStatement();
            stmt.executeUpdate(insertSql);
            stmt.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    public void updateProduct(String code, String name, double originalPrice, double discountPrice1,
            double discountPrice2, double discountPrice3, double totalNo, double saleNo) {
        String updateString = "update product set name='"+name+"', originalPrice='"+originalPrice
                +"',discountPrice1='"+discountPrice1+"',discountPrice2='"+discountPrice2
                +"',discountPrice3='"+discountPrice3+"',totalNo='"+totalNo+"',saleNo='"+saleNo
                +"' where code = '"+code+"'";
        try {
           Statement stmt = DBConnector.getConnection().createStatement();
           stmt.executeUpdate(updateString);
        } catch(Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    public void saveOrder(Order order) {
        String insertSql = "insert into customer_order(no,expected_pay,actual_pay,operator,create_date)"
                + " values('"+order.getNo()
                +"','"+order.getExpectedPay()+"','"+order.getActualPay()
                +"','"+order.getOperator()+"','"+order.getDate()+"')";
        try {
            Statement stmt = DBConnector.getConnection().createStatement();
            stmt.executeUpdate(insertSql);
            stmt.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }   
    
    public List<Order> queryOrderByDate(Long start, Long end) {
        List<Order> orders = new ArrayList<Order>();
        try {
            String queryString = "select * from customer_order where create_date between '"+start +"'and '"+ end +"'";
            Statement stmt = DBConnector.getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(queryString);            
            while(rs.next()) {
                Order order = new Order();
                order.setNo(rs.getString("no"));
                order.setExpectedPay(rs.getDouble("expected_pay"));
                order.setActualPay(rs.getDouble("actual_pay"));
                order.setOperator(rs.getString("operator"));
                order.setDate(rs.getString("create_date"));
                orders.add(order);
            }
            stmt.close();
        } catch(Exception e) {
            System.err.println(e.getMessage());
        } 
        return orders;
    }
    
    public void saveItem(OrderItem item) {
        String insertSql = "insert into order_item(no,code,price,actualPrice,total,count,saleType)"
                + " values('"+item.getNo()
                +"','"+item.getCode()+"','"+item.getPrice()
                +"','"+item.getActualPrice()+"','"+item.getTotal()+"','"+
                item.getCount()+"','"+item.getSaleType() +"')";
        try {
            Statement stmt = DBConnector.getConnection().createStatement();
            stmt.executeUpdate(insertSql);
            stmt.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    public  List<OrderItem> getOrderItems(String no) {
        List<OrderItem> items = new ArrayList<OrderItem>();
        try {
            String queryString = "select * from order_item where no = '"+no +"'";
            Statement stmt = DBConnector.getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(queryString);
            
            while(rs.next()) {
                OrderItem item = new OrderItem();
                item.setCode(rs.getString("code"));
                item.setPrice(rs.getDouble("price"));
                item.setActualPrice(rs.getDouble("actualPrice"));
                item.setCount(rs.getDouble("count"));
                item.setTotal(rs.getDouble("total"));
                item.setSaleType(rs.getInt("saleType"));
                items.add(item);
            }
            
            stmt.close();
        } catch(Exception e) {
            System.err.println(e.getMessage());
        } 
        return items;
    }
    
    public User getUser(String username,String password) {
        User user = null;
        Statement stmt = null;
        try {
            String queryString = "select * from user where name = '"+username +"' and password = '"+password+"'";
            stmt = DBConnector.getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(queryString);
            
            if(rs.next()) {
                user = new User();
                user.setName(username);
                user.setPassword(password);
                user.setRole(rs.getInt("role"));
            }
            stmt.close();
        } catch(Exception e) {
            System.err.println(e.getMessage());
        } 
        return user;
    }
    
    public User getUserByName(String username) {
        User user = null;
        Statement stmt = null;
        try {
            String queryString = "select * from user where name ='"+username+"'";
            stmt = DBConnector.getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(queryString);
            
            if(rs.next()) {
                user = new User();
                user.setName(username);
                user.setPassword(rs.getString("password"));
                user.setRole(rs.getInt("role"));
            }
            stmt.close();
        } catch(Exception e) {
            System.err.println(e.getMessage());
        } 
        return user;
    }
    
    public void deleteUser(String username) {
        String deleteString = "delete from user where name = '"+username+"'";
        try {
           Statement stmt = DBConnector.getConnection().createStatement();
           stmt.executeUpdate(deleteString);
        } catch(Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    public void updateUserByName(String name, String password, int role) {
        String updateString = "update user set password='"+password+"', role='"+role+"' where name = '"+name+"'";
        try {
           Statement stmt = DBConnector.getConnection().createStatement();
           stmt.executeUpdate(updateString);
        } catch(Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    public boolean hasUserByName(String name) {
        return getUserByName(name) != null;
    }
    
    public void createUser(String name, String password, int role) {
       String insertSql = "insert into user(name,password,role)"
                + " values('"+ name +"','"+ password + "','"+ role +"')";
        try {
            Statement stmt = DBConnector.getConnection().createStatement();
            stmt.executeUpdate(insertSql);
            stmt.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    public boolean isAdmin(String password) {
        Set<String> passwords = new HashSet<String>();
        Statement stmt = null;
        try {
            String queryString = "select * from user where role = '"+User.ADMIN+"'";
            stmt = DBConnector.getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(queryString);
            
            if(rs.next()) {
                passwords.add(rs.getString("password"));
            }
            stmt.close();
        } catch(Exception e) {
            System.err.println(e.getMessage());
        } 
        return passwords.contains(password);
    }
    
    
    
    public void addSaleNoByOrderItem(OrderItem item){
        addSaleNo(item.getCode(),item.getCount());
    }
    
    public void addSaleNo(String code, double no) {
        double newNo = queryProductByCode(code).getSaleNo() + no;
        String updateString = "update product set saleNo = '"+newNo+"' where code = '"+code+"'";
        try {
           Statement stmt = DBConnector.getConnection().createStatement();
           stmt.executeUpdate(updateString);
        } catch(Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
}
