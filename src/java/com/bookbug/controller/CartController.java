/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bookbug.controller;

import com.bookbug.bean.CartBean;
import com.bookbug.bean.User;
import com.bookbug.dao.Dao;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
public class CartController extends HttpServlet {
    
     @Override
     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
 
System.out.println("------------------------------------------------------------------------------------------------------");
         CartBean cb=new CartBean();
         Dao dao=new Dao();
         System.out.println("productId in cartController: "+request.getParameter("productId"));
         cb.setProductId(request.getParameter("productId"));
         cb.setQuantity(Integer.parseInt(request.getParameter("Quantity")));
         HttpSession session=request.getSession();
         User u=(User)session.getAttribute("user");
         System.out.println("userId in cartcontroller: "+u.getEmailId());
         cb.setUserId(u.getEmailId());
         System.out.println("ProductId: "+cb.getProductId());
         System.out.println("UserId: "+cb.getUserId());
         System.out.println("Quantity: "+cb.getQuantity());
         int row=0;
         row=dao.cartUpdateDao(cb);
         if(row>0)
         {
             System.out.println("Success mofo");
             request.getRequestDispatcher("/store.jsp").include(request, response);
              
System.out.println("------------------------------------------------------------------------------------------------------");
         }
         else
         {
             System.out.println("Failure bleh");
             request.getRequestDispatcher("/fail.jsp").include(request, response);
         }
//         System.out.println(userEmail);
         
     }
}
//try{
//             int i,val, rows;
//             rows=0;
//             i=Integer.parseInt(request.getParameter("NumberOfItems"));
//             CartBean cb=new CartBean();
//             System.out.println("Number of items: "+i);
//             
//             //Date generator
//             SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
//             Date date=new Date();
//             String strdate= sdf.format(date);
//             
//             //User Email fetching
//             HttpSession session=request.getSession();
//            
//              User u=(User)session.getAttribute("user");
//             
//             String userEmail=u.getEmailId();
//             System.out.println(userEmail);
//
//         //get orderId
////         orderid = Dao.getLastOrderId();
////             System.out.println(orderid);
//             for(int counter=1; counter<=i; counter++)
//             {
////                 orderid++;
////                 cb.setOrderId(orderid);
//                 cb.setUserId(userEmail);
//                 cb.setDateOfOrder(strdate);
//                 cb.setItemName(request.getParameter("Item"+counter));
//                 System.out.println("Item"+Integer.toString(counter));
//                 cb.setQuantity(request.getParameter("Quan"+counter));
//                 cb.setPrice(request.getParameter("Pric"+counter));
//                 cb.setTotalPrice(request.getParameter("Ttal"+counter));
//                 val=Dao.updateOrder(cb);
//                 rows=rows+val;
//             }   
//             if(rows==i)
//             {
//                 request.getRequestDispatcher("/thanks.jsp").include(request, response);
//             }
//             else
//             {
//                 request.getRequestDispatcher("/orders.jsp").include(request, response);
//             }
//         } catch (SQLException ex) {
//             Logger.getLogger(CartController.class.getName()).log(Level.SEVERE, null, ex);
//         }

 //    }
   //  }
    

