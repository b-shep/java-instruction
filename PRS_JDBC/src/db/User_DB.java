package db;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import logic.User;

public class User_DB extends Connection_DB implements DAO<User>{

	@Override
	public User get(String id){
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		String sql = "SELECT * FROM User";
		List<User> users = new ArrayList<>();
		
		try(Connection conn = getConnection();
			PreparedStatement ps = conn.prepareStatement(sql)){
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				User u = mapResult(rs);
				users.add(u);
 				
			}
		} catch (SQLException e) {
			users = null;
			e.printStackTrace();
		}
		return users;
		
	}

	@Override
	public boolean add(User t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(User t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(User t) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public User mapResult(ResultSet rs) throws SQLException {
		int id = rs.getInt("ID");
		String userName = rs.getString("UserName");
		String password = rs.getString("Password");
		String firstName = rs.getString("FirstName");
		String lastName = rs.getString("PhoneNumber");
		String email = rs.getString("Email");
		boolean isReviewer = rs.getBoolean("IsReviewer");
		boolean isAdmin = rs.getBoolean("IsAdmin");
		
		User u = new User(id, userName, password, firstName, lastName, email, isReviewer, isAdmin);
		return u;
	}
	
	
}
