/**
 * Created by Amit Bhatt on 1/10/2016.
 */
package com.myproject;
import com.myproject.product.Product;
import com.myproject.shopping.exception.ProductNotFoundException;

import java.util.Collection;

public interface IOrder {
    boolean addProduct(Product p);
    boolean removeProduct(String pid) throws ProductNotFoundException;
    Collection getCartDetails();
    Product getProductFromCart(String pid) throws ProductNotFoundException;
    int productCount();
    double getCartPrice();
}
