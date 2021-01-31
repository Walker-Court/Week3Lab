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


public class ageCalcServlet extends HttpServlet {

    
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String ageString = request.getParameter("ageString");
        
        if (request.getParameter("ageString").equals("")||request.getParameter("ageString").equals(null)){
                request.setAttribute("message", "Invalid age:" );
                getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request,response);
        }
        int age = Integer.parseInt(ageString);
        age = age + 1;
        
        request.setAttribute("message", "your age will be:" + age);
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request,response);
        request.setAttribute("ageString", ageString);
        
        
       
    }

  

}
