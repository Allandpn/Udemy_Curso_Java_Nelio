package s19.application;

import s19.db.DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConectDataBase {
    public static void main(String args[]){
        Connection conn;
        Statement st = null;
        ResultSet rs = null;

        try {
            conn = DB.getConnection();

            st = conn.createStatement();

            rs = st.executeQuery("SELECT D.NAME as D_NAME, S.NAME AS S_NAME FROM DEPARTMENT D JOIN SELLER S ON D.Id = S.DEPARTMENTID");

            while(rs.next()) {
                System.out.println(rs.getString("D_NAME") + " - " + rs.getString("S_NAME"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            DB.closeResultSet(rs);
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}
