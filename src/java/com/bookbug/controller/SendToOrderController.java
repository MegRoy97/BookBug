/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bookbug.controller;

import com.bookbug.bean.OrderBean;
import com.bookbug.bean.User;
import com.bookbug.dao.Dao;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author MEGHA
 */
public class SendToOrderController extends HttpServlet{   
  
    @Override
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
    {
        String emailId="";
        emailId=request.getParameter("UserId");
        //Date of order
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date date=new Date();
        String strdate= sdf.format(date);        
        //Time of order
        Calendar cal=Calendar.getInstance();
        Date date1=cal.getTime();
        DateFormat df=new SimpleDateFormat("HH:mm:ss");
        String timeOfOrder=df.format(date1);
        int row=0;
        row=Dao.bookOrderConfirm(emailId,strdate, timeOfOrder);
        if(row>0)
        {
            request.setAttribute("timemessage",timeOfOrder);
             request.getRequestDispatcher("/order.jsp").include(request,response);
        }
        else
        {
             request.getRequestDispatcher("/fail.jsp").include(request,response);
        }
    }
}
