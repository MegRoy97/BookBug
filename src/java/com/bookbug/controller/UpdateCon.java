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


public class UpdateCon extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
            response.setContentType("text/html;charset=UTF-8");
            try(PrintWriter out=response.getWriter()){
                int row=0;               
                User status=new User();
                Dao dao=new Dao();
                HttpSession session=request.getSession();
                session.setAttribute("user",status);
                String EmailId=request.getParameter("EmailId");
                status.setEmailId(EmailId);
                status.setName(request.getParameter("Name"));
                status.setMobileNumber(request.getParameter("MobileNumber"));
                status.setGender(request.getParameter("Gender"));
                status.setAddress(request.getParameter("Address"));
                status.setPincode(request.getParameter("Pincode"));
                 row=Dao.update(EmailId, status);
                 status=dao.getUserDataAgain(EmailId);
                 if (row>0)
                 {
                     request.getRequestDispatcher("/account.jsp").include(request, response);
                 }
                 else
                 {
                 }
            } catch (SQLException ex) {
            Logger.getLogger(UpdateCon.class.getName()).log(Level.SEVERE, null, ex);
            }        
    }    
    }

