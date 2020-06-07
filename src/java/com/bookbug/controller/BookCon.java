package com.bookbug.controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.bookbug.bean.Product;
import com.bookbug.dao.Dao;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author 91833
 */
@MultipartConfig(maxFileSize=16177216)

public class BookCon extends HttpServlet{
    
    
    @Override
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
    {
        try {
            Dao dao=new Dao();
            String ProductId=request.getParameter("ProductId");
            Product product = dao.BookDao(ProductId);
        } catch (SQLException ex) {
            Logger.getLogger(BookCon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
