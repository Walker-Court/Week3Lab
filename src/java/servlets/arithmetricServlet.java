/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author WCour
 */
public class arithmetricServlet extends HttpServlet {

   

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmetricCalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String first = request.getParameter("first");
        String second = request.getParameter("second");
        
        request.setAttribute("first", first);
        request.setAttribute("second", second);
        int fNumber = Integer.parseInt(first);
        int sNumber = Integer.parseInt(second);
        int result = fNumber + sNumber;
        request.setAttribute("message", "your age will be:" + result);
         getServletContext().getRequestDispatcher("/WEB-INF/arithmetricCalculator.jsp").forward(request, response);
    }



}
