# MyAssignment
This project starts from PlaceOrder.java file where call is made to place the order by invoking Order class using addProduct method.

 Order o = new Order("Amit Bhatt");
 o.addProduct(new Product("f101","Bananas",12));
 o.addProduct(new Product("f102","Oranges",4));
 o.addProduct(new Product("f103","Lemons",8));
 o.addProduct(new Product("f104","Apples",8));
 o.addProduct(new Product("f105","Oranges",12));
 o.addProduct(new Product("f106","Lemons",4));
        
This Order calls inturn invokes Product, where fist argument is Product Id, Second argument is Product Name and Third One is Quantity.

This Order class also has provision to compute the price based on Product Type and Quantity wherein it invokes properties file(resources/price.properties) where all the price is defined and it is assumed that this price is received from some external source and placed on daily basis.Following is the format of price.

Bananas=8
Oranges=2
Apples=9
Lemons=3 
Peaches=7


There is also a provision to handle Userdefined Exception
com.myproject.shopping.exception.ProductNotFoundException;

There is lot of scope of improvement. Future changes will be introduction to Java8 features like Lamda Expression, Streams, default Interface Method.
