
package com.bookbug.controller;

import com.bookbug.bean.User;
import com.bookbug.dao.Dao;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class UpdatePassCon extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        try {
            response.setContentType("text/html;charset=UTF-8");
            int row=0;
            
            
            User status=new User();
            Dao dao=new Dao();
            
            HttpSession session=request.getSession();
            String EmailId=request.getParameter("EmailId");
            System.out.println(EmailId);
            status.setEmailId(EmailId);
            
            status.setPassword(request.getParameter("Password"));
            
            row=Dao.updatePass(EmailId, status);
            status=dao.getUserDataAgain(EmailId);
            System.out.println("row in con"+row);
            
            if (row>0)
            {
                System.out.println("Here pass");
                request.getRequestDispatcher("/account1.jsp").forward(request, response);
            }
            else
            {
                System.out.println("THere pass");
            }

        } catch (SQLException ex) {
            Logger.getLogger(UpdatePassCon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    }

