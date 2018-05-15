<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
        .j
        {
            color: red;
        }
        </style>
    </head>
    <body>
        <form action="User" method="post" style="text-align:center">
            First Name : <input type="text" name="fname" required><br><br>
            Last Name : <input type="text" name="lname" required><br><br>
            Email-Id : <input type="text" name="emailid" required><br><br>
            Password : <input type="password" name="pass" required><br>
            <p class="j"> ${message}</p>
            Date Of Birth : <input type="date" name="dob" required><br><br>
            Place Of Birth : <input type="text" name="pob" required><br><br>
            UserName : <input type="text" name="user" required><br>
            <p class="j"> ${messages}</p>
            Secret Question : <input type="text" name="secretQuestion" required><br><br>
            Secret Answer : <input type="text" name="secretAnswer" required><br><br>
            <input type="submit" value="Submit">
        </form>
    </body>
</html>
