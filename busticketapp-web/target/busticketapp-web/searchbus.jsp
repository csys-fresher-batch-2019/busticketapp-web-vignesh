<%@page import="java.time.LocalDate"%>
<%@page import="com.chainsys.busticketapp.model.UserRegistration"%>
<html>
<body>
<%UserRegistration user=(UserRegistration)session.getAttribute("User");
%>
<center>UserId:<%=user.getUserId() %></center>
<h2>BusTicketApp</h2>
<img src="assets/images/busimage1.jpg"
width="300" height="200"
alt="busimage"/>
<h3>Find Bus</h3>


<form action="NoOfBuses.jsp"><br/>
<body style="background-color:pink;">
<br/>
Enter Source: 
<input name="source" list = "source_list" style="margin-left:27px;" required>
<datalist id = "source_list">
<option value="None">
<option value="tmb">
<option value="cmbt">
<option value="chennai">
</datalist>
<br/><br/>
Enter Destination:
<input name="destination" list = "destination_list" required>
<datalist id = "destination_list">
<option value="None">
<option value="madurai">
<option value="kovai">
<option value="ramnad">
<option value="vellore">
<option value="tirpur">
</datalist>
<br/>
<%
LocalDate date = LocalDate.now();
%><br>
<label for="journeydate">Journey Date:</label>
<input type="date" id="journeydate" name="journeydate"style="margin-left:30px;" min =<%=date%> required><br/>
<br>
<button type="submit">Search</button>
<br/>
</form>
</body>
<center><jsp:include page="Logout.jsp"/></center>
</html>