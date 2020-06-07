
package com.bookbug.controller;

import com.bookbug.bean.User;
import com.bookbug.dao.Dao;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginCon extends HttpServlet{
    
    
    @Override
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
    {
        String LoginEmailId=null;
        String LoginPassword=null;
        LoginEmailId=request.getParameter("EmailId");
        LoginPassword=request.getParameter("Password");
        Dao dao=new Dao();
        if(dao.isValidUser(LoginEmailId,LoginPassword))
        {
            User user;
            user = new User();
            user=dao.getUserData(LoginEmailId, LoginPassword);
            HttpSession session=request.getSession();
            session.setAttribute("Password",user.getPassword());
            session.setAttribute("EmailId",user.getEmailId());
            session.setAttribute("user",user);
            request.setAttribute("message","<font color='green' size='5'>Welcome:"+user.getEmailId()+"</font>");
            if(user.getUserType().equals("a"))
            {
                request.getRequestDispatcher("/admin.jsp").include(request,response);
            }
            else if(user.getUserType().equals("u"))
            {
            request.getRequestDispatcher("/index.jsp").include(request,response);
            }
        }
        else{
            request.setAttribute("message","<font color='red' size='5'>invalid EmailId or Password</font>");
            request.getRequestDispatcher("/fail.jsp").include(request,response);
        }
        
        
    }

}
