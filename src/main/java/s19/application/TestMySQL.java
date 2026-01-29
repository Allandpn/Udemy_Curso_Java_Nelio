package s19.application;

import s19.db.DB;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestMySQL {
    public static void main(String[] args){
        Connection conn = DB.getConnection();
        if (conn != null) {
            System.out.println("Conectado com sucesso!");
        } else {
            System.out.println("Conexão falhou!");
        }
        DB.closeConnection();
        System.out.println("Conexao encerrada");
    }
}
