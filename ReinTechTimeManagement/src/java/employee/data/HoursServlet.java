/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.data;

import employee.main.Hour;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author Alexander
 */
@WebServlet(name = "HoursServlet", urlPatterns = {"/hour"})
public class HoursServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();

        String url = "/viewHours.jsp";
        
        // get current action
        String action = request.getParameter("action");
        
        if (action == null) {
            action = "display_hours";  // default action
        }
        
        if (action.equals("display_hours")) {            
            // get list of users
            ArrayList<Hour> hours = HourDB.selectHours();            
            request.setAttribute("hours", hours);
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
