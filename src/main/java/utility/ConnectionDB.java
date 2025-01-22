package utility;

import java.sql.*;

public class ConnectionDB {
    public static Connection connection=null;
    protected PreparedStatement ps=null;
    protected ResultSet rs=null;

    public static Connection getConnection() throws ClassNotFoundException{
        final String dburl="jdbc:mysql://localhost:3306/customers";
        final String username="root";
        final String password="santhiJava1";
        try{
            connection= DriverManager.getConnection(dburl,username,password);
            System.out.println("Connected to database Sucessfully");
        }catch (SQLException e){
            System.out.println(e);
            e.printStackTrace();
        }
        return connection;
    }
    public void disconnect(){
        try{
            if(rs!=null){
                rs.close();
            }
            if(ps!=null){
                ps.close();
            }
            if(connection!=null){
                connection.close();
            }
        }catch (SQLException e){
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
