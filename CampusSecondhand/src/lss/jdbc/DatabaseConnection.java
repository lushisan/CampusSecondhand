package lss.jdbc;
import java.sql.*;
public class DatabaseConnection {
	private static final String DBDRIVER = "com.mysql.jdbc.Driver" ; 
	private static final String DBURL = "jdbc:mysql://localhost:3306/campus secondhand?characterEncoding\\=utf-8" ;
	private static final String DBUSER = "root" ;
	private static final String DBPASSWORD = "2548316766" ;
	private Connection conn ;
	public DatabaseConnection() throws Exception {
		Class.forName(DBDRIVER) ;
		this.conn = DriverManager.getConnection(DBURL,DBUSER,DBPASSWORD) ;
		//this.conn.createStatement().execute("SET NAMES utf8");
	}
	public Connection getConnection(){
		return this.conn ;
	}
	public void close() throws Exception {
		if(this.conn != null){
			try{
				this.conn.close() ;
			}catch(Exception e){
				throw e ;
			}
		}
	}
}
