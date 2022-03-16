import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbconnection {
 private Connection connection;
 
 public Dbconnection(String dburl,String userid,String pwd) throws ClassNotFoundException, SQLException {
	 
	 Class.forName("com.mysql.jdbc.Driver");
	 this.connection=DriverManager.getConnection(dburl,userid,pwd);
 }
 public Connection getconnection(){
	 return this.connection;
 }
 public void closeconnection() throws SQLException {
	 if(this.connection!=null) {
		 this.connection.close();
	 }
 }
}
