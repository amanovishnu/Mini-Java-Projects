package user;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;
public class questionValidator extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String answer = request.getParameter("answerr");
        

        String path = "jdbc:mysql://localhost/exp?useSSL=false",
                user = "root",
                password = "";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Successfully loaded");
            Connection con = DriverManager.getConnection(path, user, password);
            System.out.println("Connection Successfully obtained");

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("select secretA, Password from allUsers");

            Boolean rightAnswer = false;
            String pass = "";

            while (rs.next()) {

                System.out.println("\n" + rs.getString(1) + "\n" + rs.getString(2));

                if (rs.getString(1).equals(answer) ) {
                    rightAnswer = true;
                    pass=rs.getString(2);

                }
            }

            if (rightAnswer) {
                //response.sendRedirect("answerQuestion.html");  
                out.println("<!DOCTYPE html><html><head><title> Your Password! </title></head><body><center><h2><br/><br/><br/><br/><br/> Your Password is: </h2> <br/><br/> <h3>" + pass + " </h3><br/><br/><br/><br/> <h3> <a href='login.html'> Login Here! </a> <h3>  <h3></body></html>");
            } else {

                out.println("<!DOCTYPE html><html><head><title> Incorrect Answer! </title></head><body><center><h2><br/><br/><br/><br/><br/> Sorry, The answer you provided was Incorrect! </h2> <br/><br/><br/> <h3> <a href='login.html'> Try logging in again! </a> <h3>  <h3></body></html>");

            }

        } catch (Exception e2) {
            System.out.println(e2);
        }

        out.close();
    }

}
