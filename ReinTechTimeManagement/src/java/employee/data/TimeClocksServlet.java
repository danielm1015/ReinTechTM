/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.data;

import employee.main.TimeClock;
import employee.main.Employee;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
@WebServlet(name = "TimeClockServlet", urlPatterns = {"/timeclock"})

public class TimeClocksServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
 
    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();

        String url = "/employee.jsp";
        
        // get current action
        String action = request.getParameter("action");
        
        TimeClock tc = (TimeClock) session.getAttribute("day");
        
        if (action == "clockIn") {
            if (tc.getStartTime()==""){
                tc.setStartTime(LocalTime.now().toString());
            } else if (tc.getLunchIn()==""){
                tc.setLunchIn(LocalTime.now().toString());
            } else
                JOptionPane.showMessageDialog(null, "Please Clock Out.");
        } else if (action == "clockOut") {
            if (tc.getLunchOut()==""){
                tc.setLunchOut(LocalTime.now().toString());
            } else if (tc.getEndTime()==""){
                tc.setEndTime(LocalTime.now().toString());
            } else
                JOptionPane.showMessageDialog(null, "Please Clock In.");
        }
        
        if (action.equals("display_timeClock")) {            
            // get list of users
            ArrayList<TimeClock> timeClock = TimeClockDB.selectTimeClocks();            
            request.setAttribute("timeClock", timeClock);
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
