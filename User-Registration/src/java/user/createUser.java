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
public class createUser extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String FirstName = request.getParameter("FirstName");
        String LastName = request.getParameter("LastName");
        String EmailID = request.getParameter("EmailID");
        String Password = request.getParameter("Password");
        String DOB = request.getParameter("DOB");
        String Username = request.getParameter("Username");
        String secretQ = request.getParameter("secretQ");
        String secretA = request.getParameter("secretA");

        String path = "jdbc:mysql://localhost/exp?useSSL=false",
                user = "root",
                password = "";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Successfully loaded");
            Connection con = DriverManager.getConnection(path, user, password);
            System.out.println("Connection Successfully obtained");

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("select username from allUsers");

            Boolean validUsername = true, validPass = true;

            while (rs.next()) {
                int i = 1;
                if (rs.getString(i).equals(Username)) {
                    validUsername = false;
                }
                i++;
                //System.out.println(rs.getString(1) + " AND " + rs.getString(1) );

            }
            validPass = valid(Password);
            System.out.println("Inside doGet : " + Password);
            System.out.println("Value of validPass  : " + validPass);
            if (validUsername && validPass) {
                PreparedStatement ps = con.prepareStatement("insert into allUsers values(?,?,?,?,?,?,?,?)");

                ps.setString(1, FirstName);
                ps.setString(2, LastName);
                ps.setString(3, EmailID);
                ps.setString(4, Password);
                ps.setString(5, DOB);
                ps.setString(6, Username);
                ps.setString(7, secretQ);
                ps.setString(8, secretA);

                int i = ps.executeUpdate();
                if (i > 0) {
                    out.println("<!DOCTYPE html><html><head><title> Success </title></head><body><center><h2><br/><br/><br/><br/><br/>Congratulations! You have been successfully registered! :) </h2> <br/><br/><br/> <h3> <a href='index.html'> Do another registration here! </a> <h3>  <h3></body></html>");
                }

            } else if (validUsername == false) {
                out.println("<!DOCTYPE html><html><head><title> Duplicate Username </title></head><body><center><h2><br/><br/><br/><br/><br/> The username you tried for is already taken! :( </h2> <br/><br/><br/> <h3> <a href='index.html'> Try again with another username! </a> <h3>  <h3></body></html>");
            } else {
                out.println("<!DOCTYPE html><html><head><title> Error Password </title></head><body><center><h2><br/><br/><br/><br/><br/> Invalid Password! It must be 8 characters long, and must contain digits, upper and lowercase letters with atleast one special character. </h2> <br/><br/><br/> <h3> <a href='index.html'> Try again! </a> <h3>  <h3></body></html>");
            }

        } catch (Exception e2) {
            System.out.println(e2);
        }

        out.close();
    }

    public boolean valid(String password) {
        System.out.println("Inside valid : " + password);
        boolean u=false, l=false, s=false, d=false;
        String SPECIAL_CHARACTERS = "!,#,$,%,^,&,*,|";
        if (password.length() < 8) {
            return false;
        } else {
                            for (int i = 0; i < password.length(); i++) {
                                if (Character.isUpperCase(password.charAt(i))) {
                                    u = true;
                                    System.out.println("Inside upper" );
                                }
                                if (Character.isLowerCase(password.charAt(i))) {
                                    l = true;
                                    System.out.println("Inside lower" );
                                }
                                if (!Character.isUpperCase(password.charAt(i)) &&  !Character.isLowerCase(password.charAt(i)) && !Character.isDigit(password.charAt(i)) ) {
                                    s = true;
                                    System.out.println("Inside special" );
                                }
                                if (Character.isDigit(password.charAt(i))) {
                                    d = true;
                                    System.out.println("Inside digit" );
                                }


                            }
            
        }
        return s && u && d && l;

    }
}
