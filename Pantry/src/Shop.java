import java.sql.*;
public class Shop {
	public static void main(String[]args)throws Exception{
		delete();
	}
	public void getConnectivity() throws SQLException {
		String url="jdbc:mysql://127.0.0.1:3306/pantry";
		String username="root";
		String password="1303";
		String Query="insert into shop values(?,?,?,?,?,?)";
		
		Connection con=DriverManager.getConnection(url,username,password);
		PreparedStatement pst = con.prepareStatement(Query);
		pst.setInt(1,6);
		pst.setString(2,"harpic");
		pst.setInt(3,100);
		pst.setString(4,"500 Ml");
		pst.setString(5,"25-12-2024");
		pst.setString(6,"06-07-2025");
		pst.executeUpdate();
		con.close();
	}
	public static void selectall() throws SQLException{
		String url="jdbc:mysql://127.0.0.1:3306/pantry";
		String username="root";
		String password="1303";
		String Query="select*from shop";
		
		Connection con=DriverManager.getConnection(url,username,password);
		Statement smt=con.createStatement();
		ResultSet rs=smt.executeQuery(Query);
		while(rs.next()) {
			System.out.println("ID:"+rs.getInt(1));
			System.out.println("Item:"+rs.getString(2));
			System.out.println("Price:"+rs.getInt(3));
			System.out.println("Quantity:"+rs.getString(4));
			System.out.println("Manufacdate:"+rs.getString(5));
			System.out.println("Expdate:"+rs.getString(6));
		}
        con.close();	
	}
	public static void update() throws SQLException{
		String url="jdbc:mysql://127.0.0.1:3306/pantry";
		String username="root";
		String password="1303";
		String Query="update shop set iteam='chillypowder' where id=5";
		Connection con=DriverManager.getConnection(url,username,password);
		PreparedStatement pst = con.prepareStatement(Query);
		int pantryitems=pst.executeUpdate();
		System.out.println(pantryitems);
		con.close();
	}
	public static void select() throws SQLException{
		String url="jdbc:mysql://127.0.0.1:3306/pantry";
		String username="root";
		String password="1303";
		String Query="select*from shop";
        
		Connection con=DriverManager.getConnection(url,username,password);
		Statement smt=con.createStatement();
		ResultSet rs=smt.executeQuery(Query);
		while(rs.next()) {
			String pantry=rs.getString("iteam");
			int iteam=rs.getInt("Price");
			System.out.println("name:"+pantry);
			System.out.println("price:"+iteam);
			}
		con.close();
	}
	public static void delete() throws SQLException{
		String url="jdbc:mysql://127.0.0.1:3306/pantry";
		String username="root";
		String password="1303";
		String Query="delete from shop where id=3";
		Connection con=DriverManager.getConnection(url,username,password);
		PreparedStatement pst = con.prepareStatement(Query);
		int pantryitems=pst.executeUpdate();
		System.out.println(pantryitems);
		con.close();
	}
	
}




