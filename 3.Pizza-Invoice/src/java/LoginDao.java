import java.sql.*;   
public class LoginDao {  
public static boolean validate(String Aadharnumber){  
boolean status=false;  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost/allstudents","root","");        
PreparedStatement ps=con.prepareStatement( "select * from studentdata where Aadhar_Number = ?");  
ps.setString(1,Aadharnumber);  
      
ResultSet rs=ps.executeQuery();  
status=rs.next();  
          
}catch(Exception e){System.out.println(e);}  
return status;  
}  
}  