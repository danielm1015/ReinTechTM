<%-- 
    Document   : login
    Created on : Nov 2, 2017, 3:19:11 PM
    Author     : Alexander
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html" charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <div>
            <h1>Login Page</h1>
        </div>
        
        <div>
        <!-- Employees and Managers will log in the same way
                This page will simply ask for the employee ID and password of
                the employee, the information will be matched against the
                employees information in the mySQL database and then launch the
                appropriate clock in/out page
            -->
            <form action="employee" method="post">
            <input type="hidden" name="action" value="verifyLogIn">      
                <label>Employee ID:</label><br>
                    <input type="text" name="loginID"><br>
                <label>Password:</label><br>
                    <input type="password" name="password"><br><br>
                <button type="submit" value="update" name="submit" >Log In</button><br>
            </form> 
        </div>
    </body>
</html>
