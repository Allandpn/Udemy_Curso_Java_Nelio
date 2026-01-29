package s19.application;

import s19.db.DB;
import s19.exceptions.DbException;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class InsertDataBase {
    public static void main (String args[]){

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Connection conn;
        PreparedStatement st = null;

        try{
            conn = DB.getConnection();

//            st = conn.prepareStatement(
//                    "INSERT INTO SELLER "
//                            + "(Name, Email, BirthDate, BaseSalary, DepartmentId) "
//                            + "VALUES "
//                            + "(?, ?, ? ,? ,?)",
//                    Statement.RETURN_GENERATED_KEYS
//            );
//            st.setString(1, "Allan Nascimento");
//            st.setString(2, "email@email.com");
//            st.setDate(3, new java.sql.Date(sdf.parse("22/08/1988").getTime()));
//            st.setDouble(4, 3000.0);
//            st.setInt(5, 4);

            st = conn.prepareStatement("INSERT INTO DEPARTMENT (NAME) VALUES ('D1'), ('D2')", Statement.RETURN_GENERATED_KEYS);

            int rowAffects = st.executeUpdate();

            if(rowAffects > 0){
                ResultSet rs = st.getGeneratedKeys();
                while(rs.next()){
                    int id = rs.getInt(1);
                    System.out.println("Done! Id = " + id );
                }
            } else {
                System.out.println("No row affects");
            }

//            System.out.println("Done! " + rowAffects + " linhas alteradas");
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
//        catch (ParseException e) {
//            throw new RuntimeException(e);
//        }
        finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}
