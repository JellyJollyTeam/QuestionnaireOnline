<%-- 
    Document   : login
    Created on : 2012-12-20, 19:04:01
    Author     : fantasy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>QOL Admin Login</title>
        <link rel="stylesheet" type="text/css" href="css/default.css" />
	<link rel="stylesheet" type="text/css" href="css/modern.css" />
    </head>
    <body>
        <div class="page">
            <form id="login_form">
                <div class="span4 bg-color-blueLight fg-color-white text-center">
                    <h2>Questionnaire Online</h2>
                </div>
                <div class="input-control text span5">
                    <input type="email" placeholder="your E-Mail" size=25 />
                </div>
                <div class="input-control password span5">
                    <input type="password" placeholder="Password" size=20 />
                </div>
                <input type="submit" value="Login" />
                <a href="register.jsp"><input type="button" value="Register" /></a>
            </form>
	</div>
    </body>
</html>
