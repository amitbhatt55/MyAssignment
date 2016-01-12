package com.myproject.shopping.exception;
/**
 * Created by Komal on 1/10/2016.
 */
public class ProductNotFoundException extends Exception{
    public ProductNotFoundException(){}
    public ProductNotFoundException(String msg){
        super(msg);
    }
}
