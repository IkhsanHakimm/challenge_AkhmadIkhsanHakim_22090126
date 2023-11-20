package latihan;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;

public class konekdb {
    
    public static Connection bukaKon(){
        try {
            MysqlDataSource mds = new MysqlDataSource();
            mds.setUser("root");
            mds.setPassword(""); 
            mds.setDatabaseName("login");
            mds.setPort(3306); 
            mds.setServerName("localhost");
            mds.setServerTimezone("Asia/Jakarta");
            Connection con = mds.getConnection();
            return con;
        } catch (Exception e) {
        }
        return null;
    }
    
}
