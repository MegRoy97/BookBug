
package com.bookbug.dao;

import com.bookbug.bean.CartBean;
import com.bookbug.bean.OrderBean;
import com.bookbug.bean.Product;
import com.bookbug.bean.User;
import com.bookbug.connection.DbConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Dao {
    
    //registers new user
    
     public static int registerDao(User user)  {
        int row = 0;
     try {
             DbConnection con1 = new DbConnection();
            String sql = "insert into user values(?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con1.con.prepareStatement(sql);
            ps.setString(1, user.getName());
            ps.setString(2, user.getMobileNumber());
            ps.setString(3, user.getEmailId());
            ps.setString(4, user.getPassword());
            ps.setString(5, user.getGender());
            ps.setString(6, user.getAddress());
            ps.setString(7, user.getPincode());
            ps.setString(8, user.getUserType());
            System.out.println(user.getUserType());
            row = ps.executeUpdate();
            con1.con.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE,null,ex);
        }
     System.out.println("row: "+row);
        return row;
    }
     
    //checks if the email being used to register already exists in the database as a user or not
     
     public boolean UserAlreadyExists(String EmailId){
        boolean flag=false;
        String sql="select * from user where EmailId=?";
        try{
            DbConnection con1 = new DbConnection();
            PreparedStatement ps = con1.con.prepareStatement(sql);
            ps.setString(1,EmailId);
//            ps.setString(2, Password);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                flag=true;
                System.out.println("Record found");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;
    }
     
     //checks if the user who is trying to log in using an email id and password exists in the user table or not
     
     public boolean isValidUser(String EmailId,String Password){
        boolean flag=false;
        String sql="select * from user where EmailId=? and Password=?";
        try{
            DbConnection con1 = new DbConnection();
            PreparedStatement ps = con1.con.prepareStatement(sql);
            ps.setString(1,EmailId);
            ps.setString(2, Password);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                flag=true;
                System.out.println("Record found");
            }        
        } catch (SQLException ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;
    }
   
//stores the values of the user after login
     
public User getUserData(String EmailId,String Password) 
{
        User user=new User();
        DbConnection con1=new DbConnection();
        String sql="select * from user where EmailId=? and Password=?";
        try
        {
            PreparedStatement ps=con1.con.prepareStatement(sql);
            ps.setString(1,EmailId);
            ps.setString(2,Password);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
            user.setName(rs.getString(1));
            user.setMobileNumber(rs.getString(2));
            user.setEmailId(rs.getString(3));
            user.setPassword(rs.getString(4));
            user.setGender(rs.getString(5));
            user.setAddress(rs.getString(6));
            user.setPincode(rs.getString(7));
            user.setUserType(rs.getString(8));
            }
                con1.con.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
}

//updates user data

public static int update(String EmailId, User user) throws SQLException{
     DbConnection con1=new DbConnection();
     int row=0;
   
   
            String sql = "update user set Name=?, MobileNumber=?, Gender=?, Address=?, Pincode=? where EmailId=?";
            PreparedStatement ps1 = con1.con.prepareStatement(sql);
            ps1.setString(1, user.getName());
            ps1.setString(2, user.getMobileNumber());
                 ps1.setString(3, user.getGender());
            ps1.setString(4, user.getAddress());
            ps1.setString(5, user.getPincode());
           
            ps1.setString(6, EmailId);
            row = ps1.executeUpdate();  
            System.out.println("row dao "+row);
        
        con1.con.close();
    return row;
}

//gets user data again from current session using EmailId

public User getUserDataAgain(String EmailId) 
{
        User user=new User();
        DbConnection con1=new DbConnection();
        String sql="select * from user where EmailId=?";
        try
        {
            PreparedStatement ps=con1.con.prepareStatement(sql);
            ps.setString(1,EmailId);
            
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
            user.setName(rs.getString(1));
            user.setMobileNumber(rs.getString(2));
            user.setEmailId(rs.getString(3));
            user.setPassword(rs.getString(4));
            user.setGender(rs.getString(5));
            user.setAddress(rs.getString(6));
            user.setPincode(rs.getString(7));

            }
                con1.con.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
}

//adds product from admin side

public static String numOfItemsDao() throws SQLException  {
    int numberOfRows=0;
    String productId="";
    try {
         System.out.println("in dao");
             DbConnection con1 = new DbConnection();
             String sql = "select * from products";
             PreparedStatement ps = con1.con.prepareStatement(sql);
             ResultSet rs=ps.executeQuery();
             while(rs.next())
             {
                 System.out.println("counting rows");
                 numberOfRows++;
             }
              productId="p00"+Integer.toString(numberOfRows+1);
    System.out.println("ProductId in dao "+productId);
}
     catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE,null,ex);
//            ex.printStackTrace();
        }
     System.out.println("row in dao: "+numberOfRows);
        return productId;
}

public static int productDao(Product product) throws SQLException  {
        int row = 0;
     try {
         System.out.println("in dao");
             DbConnection con1 = new DbConnection();
             String sql = "insert into products(ProductId, ProductName, ProductPrice, ProductAuthor,ProductPages, ProductPub, ProductDesc, ProductCategory, ProductImage) values(?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con1.con.prepareStatement(sql);
            ps.setString(1, product.getProductId());
            ps.setString(2, product.getProductName());
            ps.setString(3, product.getProductPrice());
            ps.setString(4, product.getProductAuthor());
            ps.setString(5, product.getProductPages());
            ps.setString(6, product.getProductPub());
            ps.setString(7, product.getProductDesc());
            ps.setString(8, product.getProductCategory());
            ps.setString(9, product.getProductImage());
            System.out.println("All "+product.getProductCategory()+" "+product.getProductPub()+" "+product.getProductId());
                  
            row = ps.executeUpdate();
            con1.con.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE,null,ex);

        }
     System.out.println("row in dao: "+row);
        return row;
    }

//show products to user in shop.jsp

    public Product BookDao(String ProductId) throws SQLException
    {
        Product product=new Product();
          DbConnection con1 = new DbConnection();
            String sql = "select * from products where ProductId=?";
            PreparedStatement ps = con1.con.prepareStatement(sql);
            ps.setString(1, ProductId);
         System.out.println(ProductId);

 ResultSet rs=ps.executeQuery();
if(rs.next()){
//System.out.println("Page display successful !");
 product.setProductId(rs.getString(1));
 product.setProductName(rs.getString(2));
 product.setProductPrice(rs.getString(3));
 product.setProductAuthor(rs.getString(4));
 product.setProductPages(rs.getString(5));
 product.setProductPub(rs.getString(6));
 product.setProductDesc(rs.getString(7));
 product.setProductCategory(rs.getString(8));
 product.setProductImage(rs.getString(9));
    }
return product;

    }
    
//add product to cart

    public int cartUpdateDao(CartBean cb) {
       int updateRow = 0;
     try {
             DbConnection con1 = new DbConnection();
            String sql = "select Quantity from cart where ProductId=? and UserId=?";
            PreparedStatement ps = con1.con.prepareStatement(sql);
            ps.setString(2, cb.getUserId());
            ps.setString(1, cb.getProductId());
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                int quantity;
                updateRow=0;
                quantity=rs.getInt(1);
                quantity=quantity+cb.getQuantity();
                String sql1 = "update cart set Quantity=? where ProductId=? and UserId=?";
                PreparedStatement ps1 = con1.con.prepareStatement(sql1);
                ps1.setInt(1, quantity);
                ps1.setString(3, cb.getUserId());
                ps1.setString(2, cb.getProductId());
                updateRow=ps1.executeUpdate();
                if(updateRow>0)
                {
                    System.out.println("It works for update"+updateRow);
                }
            }
            else{
                updateRow=0;
                String sql1 = "insert into cart(UserId, ProductId, Quantity) values(?,?,?)";
            PreparedStatement ps1 = con1.con.prepareStatement(sql1);
            ps1.setString(1, cb.getUserId());
            ps1.setString(2, cb.getProductId());
            ps1.setString(3, (Integer.toString(cb.getQuantity())));
            updateRow=ps1.executeUpdate();
            if(updateRow>0)
                {
                    System.out.println("It works for insert"+updateRow);
                }
            }
            con1.con.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE,null,ex);
        }
       return updateRow;
    
    }

//delete product from cart
    
     public int delDataDao(String delItemId, String userId) throws SQLException
    {
        int row=0;
          DbConnection con1 = new DbConnection();
            String sql = "delete from cart where ProductId=? and UserId=?";
            PreparedStatement ps = con1.con.prepareStatement(sql);
            ps.setString(1, delItemId);
            ps.setString(2, userId);
         System.out.println("delItem in dao: "+delItemId+" "+userId);

 row=ps.executeUpdate();
if(row>0){
System.out.println("Deletion successful!");
}
else{
System.out.println("Error in deldatadao!");
}
     System.out.println("row in dao: "+row);
        return row;
    }
     
     //order confirmation
       public static int bookOrderConfirm(String emailId, String dateOfOrder, String TimeOfOrder)  {
        int row = 0;
     try {
             DbConnection con1 = new DbConnection();
            String sql = "select * from cart where UserId=?";
            PreparedStatement ps = con1.con.prepareStatement(sql);
            ps.setString(1, emailId);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
              OrderBean ob=new OrderBean();
              ob.setUserId(emailId);
              ob.setProductId(rs.getString(2));
              ob.setDateOfOrder(dateOfOrder);
              ob.setQuantity(rs.getInt(3));
              ob.setTimeOfOrder(TimeOfOrder);
              String sql1="insert into orders(UserId, ProductId, DateOfOrder, Quantity, TimeOfOrder) values(?,?,?,?,?)";
              PreparedStatement ps1=con1.con.prepareStatement(sql1);
              ps1.setString(1, ob.getUserId());
              ps1.setString(2, ob.getProductId());
              ps1.setString(3, ob.getDateOfOrder());
              ps1.setInt(4, ob.getQuantity());
              ps1.setString(5, ob.getTimeOfOrder());
            row=ps1.executeUpdate();
            if(row>0)
                    System.out.println("Inserted in order table");
            else
                    System.out.println("failed to insert in order table");
            
            }
            String sql1="delete from cart where UserId=?";
            PreparedStatement ps2=con1.con.prepareStatement(sql1);
            ps2.setString(1, emailId);
            row=ps2.executeUpdate();
            if(row>0)
                    System.out.println("deleted from cart table");
            else
                    System.out.println("failed to delete from cart table");
            
            con1.con.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE,null,ex);
        }
     System.out.println("row: "+row);
        return row;
    }
     
     
     
     public static String getCartProductsDao(String emailId) throws SQLException{
               String row="";
     try{
             DbConnection con1 = new DbConnection();
              String sql="select A.UserId, A.ProductId, B.ProductName, A.Quantity, B.ProductPrice";
        sql=sql+" from cart A inner join products B ";
        sql=sql+"on A.ProductId=B.ProductId where A.UserId=?";       
            PreparedStatement ps=con1.con.prepareStatement(sql);
            ps.setString(1, emailId);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                int Sales, productPrice, totalPrice;
                String productId, userId, productName, delItem;
                userId=rs.getString(1);
                System.out.println("userId in cart: "+userId);
                productId=rs.getString(2);
                System.out.println("productId in cart: "+productId);
                productName=rs.getString(3);
                System.out.println("productName in cart: "+productName);
                Sales=rs.getInt(4);
                System.out.println("Sales in cart: "+Sales);
                productPrice=rs.getInt(5);
                System.out.println("productPrice in cart: "+productPrice);
                totalPrice=productPrice*Sales;
             System.out.println("\n");
             row=row+"<form action=\"deletecon\" method=\"post\" onclick=\"window.location.reload();\"><tr>"
                     +"<td> <input type=\"text\" name=\"productId\" value="+productId+"> </td>"+
                    " <td><input type=\"text\" value="+productName+"></td>"+
                      "<td><input type=\"text\" value="+Sales+"></td>"+
                      "<td><input type=\"text\" value="+productPrice+"></td>"+
                      "<td><input type=\"text\" value="+totalPrice+"></td>"
                      +"<td><input type=\"submit\" name=\"delItemId\"></td>"
                    +"</tr>  </form>";
     }
}        catch (SQLException ex) {
             Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
         }
return row;
     }
     
     public static int updatePass(String EmailId, User user) throws SQLException{
     DbConnection con1=new DbConnection();
     int row=0;
  
            String sql = "update user set Password=? where EmailId=?";
            PreparedStatement ps1 = con1.con.prepareStatement(sql);
            
            ps1.setString(1, user.getPassword());
            ps1.setString(2, EmailId);
            row = ps1.executeUpdate();  
            System.out.println("row update pass"+row);
        
        con1.con.close();
    return row;
}
}