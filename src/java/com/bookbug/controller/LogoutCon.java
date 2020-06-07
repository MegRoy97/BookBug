
package com.bookbug.controller;



import com.bookbug.bean.User;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class LogoutCon extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
                    {
                        System.out.println("We are here in logout con");
                response.setContentType("text/html");
                HttpSession session=request.getSession();
                User user=(User)session.getAttribute("user");
                if(session.getAttribute("user")!=null)
                {
                   // session.removeAttribute("user");
                    session.invalidate();
//                    response.sendRedirect("index.jsp");
                        request.getRequestDispatcher("/index.jsp").forward(request, response);
                }
//                else
//                {
//                        request.getRequestDispatcher("/fail.jsp").forward(request, response);
//                }
                
} 
}


