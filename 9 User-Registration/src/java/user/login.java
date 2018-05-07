package user;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;
public class login extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String usernam = request.getParameter("uname");
        String Pass = request.getParameter("pass");

        String path = "jdbc:mysql://localhost/exp?useSSL=false",
                user = "root",
                password = "";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Successfully loaded");
            Connection con = DriverManager.getConnection(path, user, password);
            System.out.println("Connection Successfully obtained");

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("select Username, Password, FirstName from allUsers");

            Boolean userExist = false; String NameOfUser = "";

            while (rs.next()) {

                System.out.println("\n" + rs.getString(1) + "\n" + rs.getString(2));

                if (rs.getString(1).equals(usernam) && rs.getString(2).equals(Pass)) {
                    userExist = true;
                    NameOfUser = rs.getString(3);
                }
            }

            if (userExist) {
                out.println("<!DOCTYPE html><html><head><title> Login Successful! </title></head><body><center><h2><br/><br/><br/><br/><br/> Welcome " + NameOfUser + ", Login Successful. Cheers! </h2> <br/><br/><br/> <h3> <a href='login.html'> Login as Another user! </a> <h3>  <h3></body></html>");
            
            } else {
                
                out.println("<!DOCTYPE html><html><head><title> Login Failed! </title></head><body><center><h2><br/><br/><br/><br/><br/> Invalid Credentials! </h2> <br/><br/><br/> <h3> <a href='login.html'> Try again! </a> <h3>  <h3></body></html>");
            
            }

        } catch (Exception e2) {
            System.out.println(e2);
        }

        out.close();
    }

}
