/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hello;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author PRASHANT
 */
public class User extends HttpServlet {
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
            
            try {
                
                int c;
                String fname = request.getParameter("fname");
                String lname = request.getParameter("lname");
                String emailid = request.getParameter("emailid");
                String pass = request.getParameter("pass");
                String dob = request.getParameter("dob");
                String pob = request.getParameter("pob");
                String user = request.getParameter("user");
                String secretQuestion = request.getParameter("secretQuestion");
                String secretAnswer = request.getParameter("secretAnswer");
                
                String url = "jdbc:mysql://localhost:3306/";
                String username = "root";
                String password = "";
                String sql = "insert into website.allUsers (fname,lname,emailid,pass,dob,pob,user,secretQuestion,secretAnswer) values ('"+fname+"','"+lname+"','"+emailid+"','"+pass+"','"+dob+"','"+pob+"','"+user+"','"+secretQuestion+"','"+secretAnswer+"')";
                
                
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                if(!verifyPassword(pass))
                {
                    String message = "Wrong Password";
                    request.setAttribute("message", message);
                    request.getRequestDispatcher("/form.jsp").forward(request, response);
                }
                else{
                    Connection con = DriverManager.getConnection(url,username,password);
                    PreparedStatement st = con.prepareStatement(sql);
                    st.executeUpdate();
                }
                 
                
                }  catch (SQLIntegrityConstraintViolationException e) {
                    String message = "Try Another UserName";
                    request.setAttribute("messages", message);
                    request.getRequestDispatcher("/form.jsp").forward(request, response);   
} catch (SQLException e) {
    // Other SQL Exception
}
            
     PrintWriter out = response.getWriter();
     out.println("<h1 style='text-align:center'>Registration Success</h1>");
       
    }
    
    public boolean verifyPassword(String password){
        if(password == null || password.length() < 8)
            return false;
        if(checkDigit(password) && checkUpperAndLower(password) && specialCharacter(password))
            return true;
        else
            return false;
    }

    public boolean checkDigit(String password){
        for(int i = 0;i < password.length();i++){
            if(Character.isDigit(password.charAt(i)))
                return true;
        }
        return false;
    }

    public boolean checkUpperAndLower(String password){
        boolean upper = false, lower = false;
        for(int i = 0;i < password.length();i++){
            if(!upper && Character.isUpperCase(password.charAt(i)))
                upper = true;
            if(!lower && Character.isLowerCase(password.charAt(i)))
                lower = true;
        }
        if(upper && lower)
            return true;
        else 
            return false;
    }

    public boolean specialCharacter(String password){
        for(int i = 0;i < password.length();i++){
            if(!Character.isLetter(password.charAt(i)) && !Character.isDigit(password.charAt(i)))
                return true;
        }
        return false;
    }
     
}
