package s19.application;

import s19.db.DB;
import s19.exceptions.DbException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateDataBase {
    public static void main (String args[]){
        Connection conn;

        PreparedStatement st = null;

        try{
            conn = DB.getConnection();

            st = conn.prepareStatement("UPDATE SELLER SET NAME = ? WHERE id = ?");
            st.setString(1, "Allan Diego");
            st.setInt(2, 14);
            int rowaffects = st.executeUpdate();
            System.out.println("Done! Lines affects = " + rowaffects);
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
        finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}
