package s19.db;

import s19.exceptions.DbException;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.*;
import java.util.Properties;

public class DB {

    private static Connection conn = null;

    public static Connection getConnection(){
        if(conn == null){
            Properties props = loadProperties();
            String url = props.getProperty("url");
            try {
                conn = DriverManager.getConnection(url, props);
            }
            catch (SQLException e){
                throw new DbException(e.getMessage());
            }
        }
        return conn;
    }

    public static void closeConnection(){
        if(conn != null){
            try{
                conn.close();
                conn = null;
            }
            catch(SQLException e){
                throw new DbException(e.getMessage());
            }
        }
    }

    private static Properties loadProperties() {
        InputStream is = DB.class.getClassLoader().getResourceAsStream("db.properties");
        if(is == null){
            throw new IllegalArgumentException("Arquivo nao encontrado");
        }
        try(InputStreamReader fs = new InputStreamReader(is)){
            Properties props = new Properties();
            props.load(fs);
            return props;
        }
        catch (IOException e){
            throw new DbException(e.getMessage());
        }
    }

    public static void closeStatement(Statement st){
        if (st != null){
            try {
            st.close();
            }
            catch(SQLException e){
                throw new DbException(e.getMessage());
            }
        }
    }
    public static void closeResultSet(ResultSet rs){
        if (rs != null){
            try {
            rs.close();
            }
            catch(SQLException e){
                throw new DbException(e.getMessage());
            }
        }
    }
}
