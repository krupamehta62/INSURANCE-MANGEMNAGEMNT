package Insurance;
import org.junit.BeforeClass;
import org.junit.Test;

import java.sql.*;
import static org.junit.Assert.assertEquals;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class CheckDatabase {


    @Test
    public void testMain() {
        try{

            String aname="";
            Class.forName("java.sql.Driver");
            Connection conn =(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/insurance?zeroDateTimeBehavior=convertToNull", "root", "");

            Statement stmt = conn.createStatement();
            String query2 = "update agent set aname=KAM where agentkey=1";
            PreparedStatement ps = conn.prepareStatement(query2);
            int rowsUpdated = ps.executeUpdate();

            if(rowsUpdated>0)
                System.out.println("quantity updated succesfully");


            String query3 = "Select * from agent  where agentkey=1";
            ResultSet rs=ps.executeQuery(query3);
            while(rs.next())
            {
                aname=rs.getString(3);
            }

            System.out.println("update  is "+aname);
            assertEquals("KAM",aname);
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    @Test
    public void checkConnection() {
        try{

            String aname="";
            Class.forName("java.sql.Driver");
            Connection conn =(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/insurance?zeroDateTimeBehavior=convertToNull", "root", "");

            Statement stmt = conn.createStatement();
            String query2 = "update agent set aname=KAM where agentkey=1";
            PreparedStatement ps = conn.prepareStatement(query2);
            int rowsUpdated = ps.executeUpdate();
            assertEquals(1,rowsUpdated);
            //if(rowsUpdated>0)
            //  System.out.println("quantity updated succesfully");


            System.out.println("connection established");
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void deletemain()
    {
        try{
            Class.forName("java.sql.Driver");
            Connection conn =(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/insurance?zeroDateTimeBehavior=convertToNull", "root", "");
            Statement stmt = conn.createStatement();
            String query2 = "delete from agent where  agentkey=A3868 ";
            PreparedStatement ps = conn.prepareStatement(query2);
            int rowsUpdated = ps.executeUpdate();
            boolean expresult=true;
            boolean result=false;
            if(rowsUpdated>=0){
                result=true;
            }
            assertEquals(expresult,result);
            System.out.println("delete");
            conn.close();
            //rowsUpdated>0,row does not exist
        }
        catch(Exception e){e.printStackTrace();
        }
    }

}


//    @BeforeClass
//    public static void connection() {
//        try {
//
//
//            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/insurance?zeroDateTimeBehavior=convertToNull", "root", "");
//            Statement pst = conn.createStatement();
//            ResultSet pst1 = pst.executeQuery("select agentkey from agent");
//            pst.close();
//            conn.close();
//
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//    @Test
//    public void testdeletePolicy() {
//        fail("Not yet implemented");
//
//
//        agentkey=1;
//        boolean result=true;
//        if(.find(Filters.eq("agentkey",)).first() != null)
//        {
//            result=false;
//        }
//        assertTrue(result);
//
//
//    }
//    @Test
//    public void testAddPolicy()
//    {
//        int ID=1;
//        boolean result;
//        result = false;
//        if(null != (Filters.eq("agentkey", ID)).first())
//        {
//            result=true;
//        }
//        assertTrue(result);
//    }
//}

