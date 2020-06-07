/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bookbug.bean;

import java.io.InputStream;
import javax.servlet.http.Part;

/**
 *
 * @author MEGHA
 */
public class Product {
    private String ProductName,ProductImage, ProductDesc, ProductPages, ProductPub,  ProductPrice,ProductAuthor,ProductCategory, ProductId;
    public String getProductImage() {
        return ProductImage;
    }

    public void setProductImage(String ProductImage) {
        this.ProductImage = ProductImage;
    }

 

    public String getProductCategory() {
        return ProductCategory;
    }

    public void setProductCategory(String ProductCategory) {
        this.ProductCategory = ProductCategory;
    }

  
    

    public String getProductDesc() {
        return ProductDesc;
    }

    public void setProductDesc(String ProductDesc) {
        this.ProductDesc = ProductDesc;
    }

    public String getProductPages() {
        return ProductPages;
    }

    public void setProductPages(String ProductPages) {
        this.ProductPages = ProductPages;
    }

    public String getProductPub() {
        return ProductPub;
    }

    public void setProductPub(String ProductPub) {
        this.ProductPub = ProductPub;
    }

    public String getProductId() {
        return ProductId;
    }

    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public String getProductPrice() {
        return ProductPrice;
    }

    public void setProductPrice(String ProductPrice) {
        this.ProductPrice = ProductPrice;
    }

    public String getProductAuthor() {
        return ProductAuthor;
    }

    public void setProductAuthor(String ProductAuthor) {
        this.ProductAuthor = ProductAuthor;
    }

   
    

//    public void setProductImage(InputStream ProductImage) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//

    }
