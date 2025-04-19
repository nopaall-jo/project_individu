/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author NAUFAL
 */
public class koneksi {

    public static Connection getKoneksi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private Connection koneksi;
    public Connection connect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("berhasil konek");
        } catch (ClassNotFoundException ex) {
            System.out.println("gagal koneksi"+ex);
        }
        String url = "jdbc:mysql://localhost/db_naufal";
        try {
            koneksi = DriverManager.getConnection(url,"root","");
            System.out.println("berhasil koneksi databaase");
        } catch (SQLException ex) {
            System.out.println("gagal koneksi database"+ex);
        }
        return koneksi;
    }
}
