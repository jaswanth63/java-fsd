<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="com.flyaway.AdminLogin" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <div class="container">
        <h1>Password Change</h1>
            <%
            if (AdminLogin.isLoggedIn) {
            %>
                <form action="ChangePassword" method="post">
                    <div>
                        <label >Email address : Admin123@gmail.com</label>
                    </div>
                    <div >
                        <label for="inputPassword" >New Password</label>
                        <input type="password" name="passwordEntered"  placeholder="Enter a new password">
                        
                    </div>
                    <button type="submit">Change Password</button>
                </form>
            <%
            }
            else {
                out.print("You must Login first");
            }
            %>
    </div>
</body>
</html>