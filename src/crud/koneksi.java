
package crud;


import java.sql.Connection; // import package terkait
import java.sql.DriverManager; 
import java.sql.Statement; 
import javax.swing.JOptionPane;

public class koneksi {
    Connection conn; // deklarasikan package terkait untuk digunakan
    Statement stm;
    
    public void config(){ 
        try { 
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost/ukom_smkn5_pbo", "root", ""); // NAMA DATABASE(dblogin)
            stm = conn.createStatement();
        }catch (Exception e) { 
            JOptionPane.showMessageDialog(null, "koneksi gagal "+e.getMessage());
        }
    }
}

