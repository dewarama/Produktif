import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {
    private static Connection mysqlconfig;
    public static Connection loginDB()throws SQLException{
        try {
            String url = "jdbc:mysql://localhost:3306/toko_buah";
            String user = "root";
            String pass = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig=DriverManager.getConnection(url, user, pass);
            
            
        }
        catch (Exception e) {
            System.out.println("koneksi gagal " +e.getMessage());
            
        }
        return mysqlconfig;
    }
}
