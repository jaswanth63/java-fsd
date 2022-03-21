<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="com.model.Booking" %>
<%
    Booking.flight_booking_id = request.getParameter("flight_id");
    Booking.ticket_price = Integer.parseInt(request.getParameter("ticket_price"));
    Booking.flight_name = request.getParameter("name");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
     <section >
        <section >
            <div class="row">
                <div class="col">
                    <h1 align="center" ><b>Booking Details</b></h1>
                    <p align="center"><span><strong>Enter Passenger Details</strong></span></p><br>
                </div>
            </div>
            <section >
                <form action="${pageContext.request.contextPath}/Payment.jsp" method="post" class="form-container">
                    <div >
                        <label for="pname">Passenger Name</label>
                        <input type="text" name="pname" placeholder="Name of Passenger">
                    </div>
                    <div >
                        <label for="email">Email address</label>
                        <input type="email" name="email"  aria-describedby="emailHelp" placeholder="Enter email">
                    </div>
                    <div >
                        <label for="phone">Phone</label>
                        <input type="number"  name="phone" placeholder="Enter phone number">
                    </div>
                    <br>
                    <button type="submit" value="Submit">Submit</button>
                </form>
            </section>
        </section>
    </section>
    </center>
</body>
</html>