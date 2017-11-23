/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.data;

import employee.main.Employee;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Alexander
 */
@WebServlet(name = "EmployeesServlet", urlPatterns = {"/EmployeesServlet"})
public class EmployeesServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();

        String url = "/login.jsp";
        
        // get current action
        String action = request.getParameter("action");
        
        if (action == null) {
            action = "display_employees";  // default action
        }
        
        //verify user and launch proper landing page
        if (action.equals("verifyLogIn")) {            
            int employeeID = Integer.parseInt(request.getParameter("employeeID"));
            int authLevel = Integer.parseInt(request.getParameter("authLevel"));
            String password = request.getParameter("password");
            
        } 
        
        if (action.equals("display_employees")) {            
            // get list of users
            ArrayList<Employee> employeeList = EmployeeDB.selectEmployees();            
            request.setAttribute("employees", employeeList);
        }
        
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
        
    }
     
    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
    
        
}



            