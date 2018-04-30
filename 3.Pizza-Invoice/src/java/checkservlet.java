import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class checkservlet extends HttpServlet {
	
        @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String aadharnumber=request.getParameter("aadharnumber");
                 PrintWriter out = response.getWriter();
		try {
			Class.forName("com.mysql.jdbc.Driver");
                        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/allstudents","root","");
 
		PreparedStatement ps = c.prepareStatement("select * from studentdata where AadharNumber= ?");
		ps.setString(1,aadharnumber);
 
		ResultSet rs = ps.executeQuery();
 out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>ServletRegistration</title>");
        out.println("<style>body {text-align:center; margin-left:400px}</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Student Details</h1>");
        out.println("<table border=1px cellpadding=5px cellspacing=0px>");
        out.println("<tr>");
        out.println("<td>Student Name: " + "</td> <td>Mano Vishnu A</td>");
        out.println("<br>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>Aadhar Number:" + "</td> <td> 815389511582</td>");
        out.println("<br>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>Email Address:" + "</td> <td>am.vishnu@st.niituniversity</td>");
        out.println("<br>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>Date of Birth:" + "</td> <td>08-02-2018</td>");
        out.println("<br>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>Father Name:" + "</td> <td>" + "mickey mouse senior ""</td>");
        out.println("<br>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>Mother Name:" + "</td> <td>" + "mini mouse""</td>");
        out.println("<br>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>Student Number:" + "</td> <td>" + "100100100""</td>");
        out.println("<br>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>Father Number:" + "</td> <td>" + "200200200""</td>");
        out.println("<br>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>Mother Number:" + "</td> <td>" + "300300300""</td>");
        out.println("<br>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>Country:" + "</td> <td>" + "India""</td>");
        out.println("<br>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>State:" + "</td> <td>" + "Andhra"+ "</td>");
        out.println("<br>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>Pincode:" + "</td> <td>" + " 500055""</td>");
                
        out.println("<br>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>Street Address:" + "</td> <td>" + "india"+ "</td>");
        out.println("<br>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>Major:" + "</td> <td>" + "computer science+ ""</td>");
        out.println("<br>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>Minor:" + "</td> <td>" + "Telugu""</td>");
        out.println("<br>");
        out.println("</tr>");
        out.println("</table>");
        out.println("</body>");
 
              
}catch (Exception e2) {e2.printStackTrace();}  
          
finally{out.close();}  
  
}
  
}
