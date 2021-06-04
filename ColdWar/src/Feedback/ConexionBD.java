package Feedback;

import java.sql.*;
import java.util.Scanner;
public class ConexionBD {
	private static final String DB = "DatabaseName=coldwar;";
	private static final String USER = "user=root;";
	private static final String PWD = "Password=usbw;";
	private static final String URL = "jdbc:mysql://localhost:3306;" + DB + USER + PWD;
	
	 
	private static Scanner smenu = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Connection connection = makeConnection();
		//insertWithStatement(connection);
		//selectWithStatement(connection);
		
	}
public static Connection makeConnection() {
		
		System.out.println("Connecting database...");
		
		Connection con = null;
		//intentamos la conexion a la base de datos
		try  {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL);
			System.out.println("Database connected!");
			
		} catch (SQLException e) {
		    throw new IllegalStateException("Cannot connect the database! ", e);
		    
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		//devolvemos el valor de la conexion
		return con;		
	}

	
	public static void closeConnection(Connection con) {
		//cierra la conexión
		try {
			con.close();
			
		} catch (SQLException e) {
			System.out.println("Error closing connection!!" + e);
			
		}
	}
	
	public static void insertWithStatement(Connection con, String nombre, String tipo) {
		
		//String sql = "INSERT INTO dbo.coldwar (nombre, tipo) VALUES ('"+nombre+"','"+tipo+"')";
		String sql = "INSERT INTO dbo.coldwar (nombre, tipo) VALUES (?, ?)";
		try {
			Statement statement = (Statement) con.createStatement();
			statement.execute(sql);
			statement.close();
			
		} catch (SQLException e) {
			System.out.println("The Insert had problems!! " + e);
			
		} 
	}
	
	public static void selectWithStatement(Connection con) {
		
		String sql = "SELECT * FROM dbo.coldwar";
		
		Statement st = null;
		
		try {
			st = con.createStatement();
			
		    ResultSet rs = st.executeQuery(sql);
		       
		    while (rs.next())
		    {
		    	int id = rs.getInt("id");
		        String nombre = rs.getString("nombre");
		      
		        System.out.println("Id:" + id + " Nombre:" + nombre + " Puntuacion:" );
		    }
		      
		    st.close();
		    
		} catch (SQLException e) {
			System.out.println("The SELECT had problems!! " + e);
			
		}
	}



}


