package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class koneksi {
    private Connection koneksi;
    
    public Connection connect(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Berhasil Koneksi");
        }   catch (ClassNotFoundException ex){
            System.out.println ("Gagal Koneksi "+ex);
        }
        
        String url ="jdbc:mysql://127.0.0.1:3306/inventory-app?zeroDateTimeBehavior=convertToNull&serverTimezone=UTC";
        try {
            koneksi = DriverManager.getConnection(url,"root","Julhendri@123");
            System.out.println("Berhasil Koneksi Database");
        }   catch (SQLException ex){
            System.out.println("Gagal Koneksi Database "+ex);
        }
        return koneksi;
    }
}
