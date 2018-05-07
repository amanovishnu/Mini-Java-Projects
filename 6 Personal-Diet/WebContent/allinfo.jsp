<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@page import=" java.util.*" %>
   <%@page import=" java.lang.Math.*" %>
   <%@page import=" java.text.SimpleDateFormat" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP Page</title>
</head>
<body>
		<%
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		int dd = Integer.parseInt(request.getParameter("date"));
		int mm = Integer.parseInt(request.getParameter("month"));
		int yy = Integer.parseInt(request.getParameter("year"));
		int kg = Integer.parseInt(request.getParameter("kg")); 
		int g = Integer.parseInt(request.getParameter("g")); 
		int m =Integer.parseInt( request.getParameter("mm"));
		int cm = Integer.parseInt(request.getParameter("cm"));
		
		Double height = (double) m + ((double)cm/(double)100);
		Double weight = (double) kg + ((double) g/(double)1000);
		
		long startTime = System.currentTimeMillis();
		int Result,max=0;
		
		String sd = request.getParameter("date")+"/"+request.getParameter("month")+"/"+request.getParameter("year");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		
		 Date date = sdf.parse(sd);
		  System.out.println("Given Time in milliseconds : "+date.getTime());
		
		for(int i=0;i<10;i++)
			{
			Random r = new Random();
		    Result = r.nextInt(99-0) + 0;
		    max = Math.max(max,Result);
			}
				
	%>
	
	First Name : <%= firstName %> <br/> <br/>
	Last Name : <%= lastName %> <br/> <br/>
	Date of Birth: <%=dd %>/<%=mm %>/<%=yy %>
	Height : <%=height %>
	Weight : <%=weight %> <br/><br/>
	
	<%if (startTime % max == 0) 
		out.print("Wow! Wonderful!");
	else
		out.print("Good");
		%>
	
	

	
</body>
</html>