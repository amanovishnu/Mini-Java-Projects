
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String connectionURL = "jdbc:mysql://localhost/allstudents";
        Connection connection = null;
        ResultSet rs;
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String sfname = request.getParameter("firstname");
        String smname = request.getParameter("middlename");
        String slname = request.getParameter("lastname");
        String sadharnum = request.getParameter("aadharnumber");
        String ssemail = request.getParameter("studentemail");
        String sdob = request.getParameter("dateofbirth");
        String sfatname = request.getParameter("fathername");
        String smotname = request.getParameter("mothername");
        String sstunum = request.getParameter("studentnumber");
        String sfatnum = request.getParameter("fathernumber");
        String smotnum = request.getParameter("mothernumber");
        String scountry = request.getParameter("country");
        String sstate = request.getParameter("state");
        String spincode = request.getParameter("pincode");
        String sstreetadd = request.getParameter("streetaddress");
        String smajor = request.getParameter("major");
        String sminor = request.getParameter("minor");
        try {
            if(sfname.equals(" ") || smname.equals(" ") || slname.equals(" ") || sadharnum.equals(" ") || ssemail.equals(" ") || sdob.equals(" ") || sfatname.equals(" ") || smotname.equals(" ") || sstunum.equals(" ") || sfatnum.equals(" ") || smotnum.equals(" ") || scountry.equals(" ") || sstate.equals(" ") || spincode.equals(" ") || sstreetadd.equals(" ") || smajor.equals(" ") || sminor.equals(" ")){
                
            } else {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(connectionURL, "root", "");
            String sql = "insert into studentdata values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, sfname);
            pst.setString(2, smname);
            pst.setString(3, slname);
            pst.setString(4, sadharnum);
            pst.setString(5, ssemail);
            pst.setString(6, sdob);
            pst.setString(7, sfatname);
            pst.setString(8, smotname);
            pst.setString(9, sstunum);
            pst.setString(10, sfatnum);
            pst.setString(11, smotnum);
            pst.setString(12, scountry);
            pst.setString(13, sstate);
            pst.setString(14, spincode);
            pst.setString(15, sstreetadd);
            pst.setString(16, smajor);
            pst.setString(17, sminor); 
            int numRowsChanged = pst.executeUpdate();
            out.println("<br><br><br><br><br><br><br><br><br><br>");
            out.println("<h1 style='text-align:center'>Your are Successfully Registered</h1>");
            out.println("<p style='text-align:center'><a href='index.html'>Return to Home Page</a></p>");
            pst.close(); }
        } catch (ClassNotFoundException e) {
            out.println("Couldn't load database driver: " + e.getMessage());
        } catch (SQLException e) {
            out.println("SQLException caught: " + e.getMessage());
        } catch (Exception e) {
            out.println(e);
        } finally {
            // Always close the database connection.
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException ignored) {
                out.println(ignored);
            }
        }
    }
}
