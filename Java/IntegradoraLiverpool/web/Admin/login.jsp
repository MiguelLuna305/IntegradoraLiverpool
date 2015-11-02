<%-- 
    Document   : login
    Created on : 13-oct-2015, 1:24:53
    Author     : Sandy
--%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <title>jQuery Dropdown Login Freebie | The Finished Box</title>
        <link rel="stylesheet" href="css/style.css" />
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.4.2/jquery.min.js?ver=1.4.2"></script>
        <script src="js/login.js"></script>
    </head>
    <body>
        <div id="bar">
            <div id="container">
              <!-- Login Starts Here -->
            <div id="loginContainer">
                <li>  <a href="#" id="loginButton"><span>Login</span></a></li>
                <div style="clear:both"></div>
                <div id="loginBox">                
                    <form id="loginForm">
                        <fieldset id="body">
                            <fieldset>
                                <label for="email">Correo</label>
                                <input type="text" name="email" id="email" />
                            </fieldset>
                            <fieldset>
                                <label for="password">Contraseña</label>
                                <input type="password" name="password" id="password" />
                            </fieldset>
                            <s:submit id="login" value="Aceptar"/>
                           <!-- <label for="checkbox"><input type="checkbox" id="checkbox" />Remember me</label>-->
                        </fieldset>
                       <!--- <span><a href="#">Forgot your password?</a></span>-->
                    </form>
                </div>
            </div>
            <!-- Login Ends Here -->
            </div>
        </div>
    </body>
</html>