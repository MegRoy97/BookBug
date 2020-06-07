package com.bookbug.controller;


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
public class ProductCon extends HttpServlet {
   @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String ProductId="",ProductName="", ProductImage="", ProductPub="", ProductAuthor="", ProductDesc="", ProductPages="", ProductPrice="", ProductCategory="";
        int pos;
String contentType = request.getContentType();
if((contentType != null)&&(contentType.indexOf("multipart/form-data") >= 0))
{    
    try {
        DataInputStream in = new DataInputStream(request.getInputStream());
        int formDataLength = request.getContentLength();
        byte dataBytes[] = new byte[formDataLength];
        int byteRead = 0;
        int totalBytesRead = 0;
        while(totalBytesRead < formDataLength)
        {
            byteRead = in.read(dataBytes, totalBytesRead,formDataLength);
            totalBytesRead += byteRead;
        }
        String file = new String(dataBytes);        
        String divi[]=file.split("\\n");
        for(int i=0; i<divi.length; i++)
        ProductName=divi[3];
        ProductPrice=divi[7];
        ProductDesc=divi[23];
        ProductPages=divi[15];
        ProductAuthor=divi[11];
        ProductPub=divi[19];
        ProductCategory=divi[27];
ProductImage = file.substring(file.indexOf("filename=\"") + 10);
ProductImage = ProductImage.substring(0, ProductImage.indexOf("\n"));
ProductImage = ProductImage.substring(ProductImage.lastIndexOf("\\") + 1,ProductImage.indexOf("\""));
int lastIndex = contentType.lastIndexOf("=");
String boundary = contentType.substring(lastIndex + 1,contentType.length());
pos = file.indexOf("filename=\"");
pos = file.indexOf("\n", pos) + 1;
pos = file.indexOf("\n", pos) + 1;
pos = file.indexOf("\n", pos) + 1;
int boundaryLocation = file.indexOf(boundary, pos) - 4;
int startPos = ((file.substring(0, pos)).getBytes()).length;
int endPos = ((file.substring(0, boundaryLocation)).getBytes()).length;
File ff = new File("C:/Users/91833/Desktop/BookBug1/web/images"+ProductImage);
FileOutputStream fileOut = new FileOutputStream(ff);
fileOut.write(dataBytes, startPos, (endPos - startPos));
fileOut.flush();
fileOut.close();
Product product=new Product();
product.setProductImage(ProductImage);
product.setProductName(ProductName);
product.setProductPrice(ProductPrice);
product.setProductAuthor(ProductAuthor);
product.setProductPub(ProductPub);
product.setProductDesc(ProductDesc);
product.setProductPages(ProductPages);
product.setProductCategory(ProductCategory);
int row=0;
String prodId="";
prodId=Dao.numOfItemsDao();
product.setProductId(prodId);
row=Dao.productDao(product);
System.out.println("Id"+row);
if(row>0)
{
    request.getRequestDispatcher("/adminaddproduct.jsp").include(request, response);   
}
else
{   
    request.getRequestDispatcher("/fail.jsp").include(request, response);
}   } catch (SQLException ex) {
        Logger.getLogger(ProductCon.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    }
 }
    
    


