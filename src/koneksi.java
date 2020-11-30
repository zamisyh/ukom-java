import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class koneksi {
    Connection conn;
    Statement stm;
    
    public void config(){
        try {
             Class.forName("com.mysql.jbdc.Driver");
             conn = DriverManager.getConnection("jbdc:mysql://localhost:3306/ukom_smkn5_pbp", "root", "");
             stm =  conn.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi gagal " + e.getMessage());
        }
    }
}
