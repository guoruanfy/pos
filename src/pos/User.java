/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pos;

/**
 *
 * @author fangyuan01
 */
public class User {
    public static final int NORMAL = 1;
    public static final int ADMIN = 2;
    
    private String name;
    private String password;
    private int role;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
    
    
}
