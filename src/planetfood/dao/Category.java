
package planetfood.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import planetfood.dbutil.DBConnection;
import planetfood.pojo.Categories;


public class Category {
    
    public static HashMap<String,String>getAllCategoryid()throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("Select cat_name,cat_id from categories");
        HashMap<String,String>categories = new HashMap<>();
        while(rs.next())
        {
            String catName = rs.getString(1);
            String catId= rs.getString(2);
            categories.put(catName,catId);
        }
        return categories;
    }
    
    public static boolean addCategories(Categories c) throws SQLException
    { 
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("insert into categories values(?,?)");
        ps.setString(1, c.getCatId());
        ps.setString(2,c.getCatName());
        
     
        int x= ps.executeUpdate();
       
        return (x>0);
    }   
    
        public static String getNewID()throws SQLException
    {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("Select count(*) from categories");
        int id =101;
        ResultSet rs = ps.executeQuery();
        if(rs.next())
        {
            id = id+rs.getInt(1);
        }
        return "C"+id;
    }

 
public static HashMap<String,String> getActiveProductsByCategory(String catId)throws SQLException{
       Connection conn=DBConnection.getConnection();
       String qry="Select prod_name,prod_id from Products where cat_id=? and active='Y'";
       PreparedStatement ps=conn.prepareStatement(qry);
       ps.setString(1, catId);
       ResultSet rs=ps.executeQuery();
       HashMap<String,String> productList=new HashMap<>();
       while(rs.next()){
               String prodName=rs.getString("prod_name");
               String prodId=rs.getString("prod_id");
               productList.put(prodName,prodId);
          }
       return productList;
         
        }

    
   public static ArrayList<Categories>getAllCategories()throws SQLException
    {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("Select * from categories ");
       
        ResultSet rs= ps.executeQuery();
        ArrayList<Categories> categoriesList = new ArrayList<Categories>();
        while(rs.next())
        {
            Categories obj = new Categories();
            obj.setCatId(rs.getString("cat_id"));               //obj.setOrdId(rs.getString("ord_id"));
            obj.setCatName(rs.getString("cat_name"));
            
            categoriesList.add(obj);
        }
        return categoriesList;
    }
    


public static boolean editCategories(Categories c) throws SQLException
    { 
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("update categories set cat_name =(?) where cat_name=(?)");
        
    
        ps.setString(1,c.getCatName());
        ps.setString(2, c.getCatId());
       
        
       
        int x= ps.executeUpdate();
        System.out.println("nkfsf");
        return (x>0);
    }   






    
}
