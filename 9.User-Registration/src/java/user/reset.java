/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;

/**
 *
 * @author Mano
 */
public class reset extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String email = request.getParameter("EmailID");
        String dOb = request.getParameter("DOB");

        String path = "jdbc:mysql://localhost/exp?useSSL=false",
                user = "root",
                password = "";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Successfully loaded");
            Connection con = DriverManager.getConnection(path, user, password);
            System.out.println("Connection Successfully obtained");

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("select EmailID, DOB, secretQ from allUsers");

            Boolean trueCredentials = false;
            String secretQ = "";

            while (rs.next()) {

                System.out.println("\n" + rs.getString(1) + "\n" + rs.getString(2));

                if (rs.getString(1).equals(email) && rs.getString(2).equals(dOb)) {
                    trueCredentials = true;
                    secretQ = rs.getString(3);

                }
            }

            if (trueCredentials) {
                //response.sendRedirect("answerQuestion.html");  
                out.println("<html>\n"
                        + "    <head>\n"
                        + "        <title>Answer Question</title>\n"
                        + "        <meta charset=\"UTF-8\">\n"
                        + "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
                        + "    </head>\n"
                        + "    <body>\n"
                        + "    <center>\n"
                        + "        \n"
                        + "        <form action=\"questionValidator\" method=\"post\">\n"
                        + "\n"
                        + "            \n"
                        + "            <h1> " + secretQ + " </h1> <br/><br/> <input type=\"text\" required name=\"answerr\"/><br/><br/>\n"
                        + "            \n"
                        + "\n"
                        + "\n"
                        + "\n"
                        + "            <br/><br/>\n"
                        + "            <input type=\"submit\" value=\"Submit\">  <br/><br/><br/><br/>\n"
                        + "            Already Registered? <input type=\"button\" value=\"Login\" onclick=\"location.href='login.html'\"> <br/><br/>\n"
                        + "\n"
                        + "            New User? <input type=\"button\" value=\"User Registration\" onclick=\"location.href = 'registration.html'\">\n"
                        + "\n"
                        + "        </form>\n"
                        + "    </center>\n"
                        + "    </body>\n"
                        + "</html>");
            } else {

                out.println("<!DOCTYPE html><html><head><title> Reset Password Failed! </title></head><body><center><h2><br/><br/><br/><br/><br/> Sorry, No Such Record Found! :(  </h2> <br/><br/><br/> <h3> <a href='login.html'> Try logging in again! </a> <h3>  <h3></body></html>");

            }

        } catch (Exception e2) {
            System.out.println(e2);
        }

        out.close();
    }

}
