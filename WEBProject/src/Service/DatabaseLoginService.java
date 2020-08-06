package Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DatabaseLoginService {
	
	public boolean authenticate(String uname, String pwd) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
        try {
			
			Class.forName("org.apache.derby.jdbc.ClientDriver");
			conn = DriverManager.getConnection("jdbc:derby://localhost:1527//trainingdb","mj", "mj");
			
			String sql = "select count(user_id) from tbl_users where user_name = ? and user_pass = ? ";
			stmt= conn.prepareStatement(sql);
			stmt.setString (1,uname);
			stmt.setString (2,pwd);
			rs = stmt.executeQuery();
			if(rs.next()) {
				int count = rs.getInt(1);
				if(count == 1)
					return true;
			}
			return false;
        }
        
        catch(Exception e) {
        	e.printStackTrace();
        	return false;
        	
        }
        
        finally {
        	try { conn.close();} catch (Exception e) {}
        }
	}

}
