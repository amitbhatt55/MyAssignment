package com.myproject;
import com.myproject.order.Order;
import com.myproject.product.Product;
import com.myproject.price.Price;
import com.myproject.shopping.exception.ProductNotFoundException;

import java.io.IOException;
import java.util.Iterator;
/**
 * Created by Komal on 1/10/2016.
 */

public class PlaceOrder {
    public static void main(String args[]) throws IOException, ProductNotFoundException {
        Order o = new Order("Amit Bhatt");
        o.addProduct(new Product("f101","Bananas",12));
        o.addProduct(new Product("f102","Oranges",4));
        o.addProduct(new Product("f103","Lemons",8));
        o.addProduct(new Product("f104","Apples",8));
        o.addProduct(new Product("f105","Oranges",12));
        o.addProduct(new Product("f106","Lemons",4));

        System.out.println("\nNo. of Product : "+o.productCount());
        System.out.println ("Order Places By: "+o.uid);

        // Remove product from Cart
         //o.removeProduct("f103");


        final Iterator<Product> it = o.getCartDetails().iterator();
        Price p=new Price();

        for (Product product : o.getCartDetails()) {
            System.out.println("Product Id...."+product.getPid());
            System.out.println("Product Name....."+product.getPname());
            System.out.println("Qty...."+product.getQty());
            System.out.println("Price Per Fruit...."+p.getProductPrice(product.getPname()));
            System.out.println();
        };
        System.out.print("Overall Price...."+o.getCartPrice());


    }
}
