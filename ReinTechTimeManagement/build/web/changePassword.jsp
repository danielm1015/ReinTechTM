<%-- 
    Document   : changePassword
    Created on : Nov 2, 2017, 3:24:11 PM
    Author     : Alexander
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Change Password</title>
    </head>
    
    <body>
        <!-- Form will not allow change to the ID, it will only display it
            employee must enter their existing password followed by their new 
            password twice, it must match
        -->
        <form action="changePassword" method="post">
            <input type="hidden" name="action" value="update_employee">        
            <label class="pad_top">Employee ID:</label>
            <input type="text" name="employeeID" value="${employee.employeeID}" 
                disabled><br>
            <label class="pad_top">Old Password:</label>
            <input type="password" name="oldPassword" required><br>
            <label class="pad_top">New Password:</label>
            <input type="password" name="newPassword" required><br>
            <label class="pad_top">Verify New Password:</label>
            <input type="password" name="verifyNewPassword" required><br>  
            <label>&nbsp;</label>
            <input type="submit" value="Update" class="margin_left">
        </form>
    </body>
    
</html>
