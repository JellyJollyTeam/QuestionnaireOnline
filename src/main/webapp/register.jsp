<%-- 
    Document   : register
    Created on : 2012-12-20, 19:03:55
    Author     : fantasy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>QOL Register</title>
        <link rel="stylesheet" type="text/css" href="css/default.css" />
	<link rel="stylesheet" type="text/css" href="css/modern.css" />
	<script type="text/javascript">
		function checkpass () {
                    if(document.getElementById('pw').value != document.getElementById('checkPw').value)
                        document.getElementById('wrongInfo').innerHTML = "Check it!";
                    else
                        document.getElementById('wrongInfo').innerHTML = "";
		}
	</script>
    </head>
    <body>
        <div class="page">
            <form id="login_form">
                <div class="span4 bg-color-blueLight fg-color-white text-center">
                    <h2>Questionnaire Online</h2>
                </div>
                <div class="input-control text span5">
                    <input type="text" placeholder="Name" size=20 />
                </div>
                <div class="input-control text span5">
                    <input type="email" placeholder="your E-Mail" size=25 />
                </div>
                <div class="input-control password span5">
                    <input type="password" id="pw" placeholder="Password" size=20 />
                </div>
                <div class="input-control password span5">
                    <input type="password" id="checkPw" placeholder="Check password" size=20 onblur="checkpass()"/>
                    <span class="bg-color-red fg-color-white" id="wrongInfo"></span>
                </div>
                <input type="submit" value="OK" />
                <a href="login.jsp"><input type="button" value="Have one?" /></a>
            </form>
	</div>
    </body>
</html>
