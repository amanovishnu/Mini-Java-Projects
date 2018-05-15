package model;
import java.sql.*;

public class MainModel {
	Connection connection;
	public MainModel () {
		connection = SqliteConnection.Connector();
		if(connection == null) {
			System.out.println("Connection not Successful");
			System.exit(1);
		}
	}
	public boolean isDbconnected() {
		try {
			return !connection.isClosed();
		}
		catch(SQLException e) {
			e.printStackTrace();
			return false;
		}		
	}
	public boolean isLogin(String user,String pass) throws SQLException {
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		String query = "select * from logindata where Username = ? and Password = ? ";
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1,user);
			preparedStatement.setString(2,pass);
			resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				return true;
			} else {
				return false;
			}
			
		} catch (Exception e) {
			return false;
		} finally {
			preparedStatement.close();
			resultSet.close();
		}
	}
	public boolean isrelogin(String email,String Question,String security) throws SQLException {
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		String query = "select * from logindata where EmailAddress = ? and SecurityQuestion = ? and SecurityAnswer = ? ";
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1,email);
			preparedStatement.setString(2,Question);
			preparedStatement.setString(3,security);
			resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				return true;
			} else {
				return false;
			}
			
		} catch (Exception e) {
			return false;
		} finally {
			preparedStatement.close();
			resultSet.close();
		}
	}
	/****************************************************************************************************************************/
	public boolean isregister(String name,String username,String email, String password,String securityquestion,String securityanswer) throws SQLException {
		if(name.equals("") || username.equals("") || email.equals("") ||password.equals("") || securityquestion.equals("") || securityanswer.equals("")) {
			System.out.println("Enter Details");
	    } else {
	    	String query = "INSERT INTO logindata (Name,Username,EmailAddress,Password,SecurityQuestion,SecurityAnswer) VALUES (?,?,?,?,?,?)";
			try (PreparedStatement pstmt = connection.prepareStatement(query)) {
	            pstmt.setString(1, name);
	            pstmt.setString(2, username);
	            pstmt.setString(3, email);
	            pstmt.setString(4, password);
	            pstmt.setString(5,securityquestion);
	            pstmt.setString(6, securityanswer);
	            pstmt.executeUpdate();           
	           // System.exit(1);
	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	           
	        }
	    }
		return false;
		}
		
}
	/*************************************************************************************************************************/
	

