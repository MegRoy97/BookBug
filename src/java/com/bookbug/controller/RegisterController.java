package com.bookbug.controller;

import com.bookbug.bean.User;
import com.bookbug.dao.Dao;
import java.io.IOException;
import java.io.PrintWriter;




import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class RegisterController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
       //response.setContentType("text/html;charset=UTF-8");
       PrintWriter out=response.getWriter();
       
            String LoginEmailId=null;
            LoginEmailId=request.getParameter("EmailId");
            User user = new User();
            user.setName(request.getParameter("Name"));
            user.setMobileNumber(request.getParameter("MobileNumber"));
            user.setEmailId(request.getParameter("EmailId"));
            user.setPassword(request.getParameter("Password"));
            user.setGender(request.getParameter("Gender"));
            user.setAddress(request.getParameter("Address"));
            user.setPincode(request.getParameter("Pincode"));
            user.setUserType("u");
            Dao dao = new Dao();
            int row;
            if(dao.UserAlreadyExists(LoginEmailId))     //check if the person trying to register already has an account or not
        {
            request.getRequestDispatcher("/youhaveaccount.jsp").include(request,response);
        }
            else                                        //allow them to register as user if they dont have an account already
            {
               row = Dao.registerDao(user);
                if (row == 0) {
                    request.setAttribute("message","<font color='red' size'5'>Oops!!something went wrong,please try again.</font>");
                    request.getRequestDispatcher("/fail.jsp").include(request, response); 
                }
                if(row==1){
                    request.setAttribute("message","<font color='green' size='5'>Congratilations!!Registration successful.</font>");
                    request.getRequestDispatcher("/login.jsp").include(request, response);
                }
            }
    }

    private String EncryptPasswordWithHash(String parameter) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
