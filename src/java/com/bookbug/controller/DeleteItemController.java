/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

/**
 *
 * @author MEGHA
 */
public class DeleteItemController extends HttpServlet{
    
    
    @Override
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
    {
        try {
            String delItemId, userId;
            delItemId=request.getParameter("productId");
            HttpSession session=request.getSession();
            User u=(User)session.getAttribute("user");
            userId=u.getEmailId();
            Dao dao=new Dao();
            int row=0;
            row=dao.delDataDao(delItemId, userId);
            if(row>0)
            {
                request.getRequestDispatcher("/cart.jsp").include(request, response);
            }   
            else
            {
                request.getRequestDispatcher("/cart.jsp").include(request, response);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DeleteItemController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(DeleteItemController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}

