<%-- 
    Document   : viewEmployees
    Created on : Nov 2, 2017, 3:22:17 PM
    Author     : Alexander
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html" charset=UTF-8">
        <link rel="stylesheet" href="styles/viewEmployees.css" type="text/css"/>
        <script src="modernizr-1.5.js"></script>
        <title>View Employees</title>
    </head>
    
    <body>
            
            <div id="employeeFormPanel">
                <form id="employeeForm">
                    <label class="pad_top">Employee ID:</label>
                    <input type="text" name="employeeID" value="${employee.employeeID}">
                    <label class="pad_top">First Name:</label>
                    <input type="text" name="firstName" value="${employee.firstName}">
                    <label class="pad_top">Last Name:</label>
                    <input type="text" name="lastName" value="${employee.lastName}">
                    <label class="pad_top">Auth Level:</label>
                    <input type="text" name="authLevel" value="${employee.authLevel}">
                    <label class="pad_top">Pay Rate:</label>
                    <input type="text" name="payRate" value="${employee.payRate}">
                </form>
            </div>
            
            <div id="employeeTablePanel">
                <table id="employeeTable">
                    <tr>
                        <th>Employee ID</th>
                        <th>First Name</th>
                        <th>Last Name</th>
                        <th>Auth Level</th>
                        <th>Pay Rate</th>
                        <th colspan="2">Options</th>
                    </tr>

                    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
                        <c:forEach var="employeeList" items="${employees}">
                        <tr>

                          <td>${employee.EmployeeID}</td>
                          <td>${employee.FirstName}</td>
                          <td>${employee.LastName}</td>
                          <td>${employee.AuthLevel}</td>
                          <td>${employee.PayRate}</td>
                          <!-- edit action will trigger selected employees information to the above form -->
                          <td><button action="editEmployee">Edit</button></td>
                          <!-- view hours action will hide employeeTablePanel and employeeFormPanel -->
                          <td><button action="viewHours">View Hours</button></td>
                          <!-- after the current panels are hidden timeClockTablePanel and timeClockFormPanel will display -->
                          
                        </tr>
                        </c:forEach>

                </table>
                        <p><button action = "display_employees">Refresh</button></p>
            </div>
            
            <div id="timeClockFormPanel">
                <form id="timeClockForm">
                    <label class="pad_top">Day:</label>
                    <input type="date" name="day" value="${timeClock.day}">
                    <label class="pad_top">Start Time:</label>
                    <input type="date" name="startTime" value="${timeClock.startTime}">
                    <label class="pad_top">Lunch Start:</label>
                    <input type="date" name="lunchOut" value="${timeClock.lunchOut}">
                    <label class="pad_top">Lunch End:</label>
                    <input type="date" name="lunchIn" value="${timeClock.lunchIn}">
                    <label class="pad_top">End Time:</label>
                    <input type="date" name="endTime" value="${timeClock.endTime}">
                </form>
            </div>
                
            <div id="timeClockTablePanel">
                <table id="timeClockTable">
                    <tr>
                        <th>Day</th>
                        <th>Start Time</th>
                        <th>Lunch Start</th>
                        <th>Lunch End</th>
                        <th>End Time</th>
                        <th>Options</th>
                    </tr>
                    
                    
                    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
                        <c:forEach var="timeClock" items="${timeClocks}">
                        <tr>

                          <td>${timeClock.day}</td>
                          <td>${timeClock.startTime}</td>
                          <td>${timeClock.lunchOut}</td>
                          <td>${timeClock.lunchIn}</td>
                          <td>${timeClock.endTime}</td>
                          <!-- edit time button will populate the timeClockForm with the selected dates information -->
                          <td><button action="editTime">Edit</button></td>

                        </tr>
                        </c:forEach>
                    
                </table>
            </div>
               
    </body>
    
</html>
