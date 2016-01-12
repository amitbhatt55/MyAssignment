package com.myproject.order;
import com.myproject.IOrder;
import com.myproject.product.Product;
import com.myproject.shopping.exception.ProductNotFoundException;
import com.myproject.price.Price;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Order implements IOrder {

    public String uid;
    private Map<String, Product> map;

    //public Order(){}
    public Order(String uid){
        this.uid=uid;
        map = new HashMap<String, Product>();
    }//Order

    public boolean addProduct(Product p){
        if(map.containsKey(p.getPid())){
            Product p1 = map.get(p.getPid());
            p1.setQty(p1.getQty()+p.getQty());
            return true;
        }
        map.put(p.getPid(),p);
        return false;
    }//addProduct

    public boolean removeProduct(String pid)
            throws ProductNotFoundException {
        if(map.containsKey(pid)){
            map.remove(pid);
            return true;
        }else throw new ProductNotFoundException(
                "Product with ID "+pid+" is not Found.");
    }

    public Collection<Product> getCartDetails(){
        return map.values();
    }

    public Product getProductFromCart(String pid)
            throws ProductNotFoundException {
        if(map.containsKey(pid)){
            return map.get(pid);
        }else {
            throw new ProductNotFoundException(
                    "Product with ID "+pid+" is not Found.");
        }
    }

    public int productCount(){
        return map.size();
    }

    public double getCartPrice() {
        double price = 0.0d;
        Iterator<Product> iterator = getCartDetails().iterator();


        Price p;
        p = new Price();


        try{


            for (Product product : getCartDetails()) {
                //System.out.println("Product Id...."+product.getPid());
                //System.out.println("Product Name....."+product.getPname());
                //System.out.println("Qty...."+product.getQty());
                //System.out.println("Price Per Product...."+p.getProductPrice(product.getPname()));
                price+=product.getQty()*p.getProductPrice(product.getPname());
                //System.out.println("Overall Price...."+product.getQty()*p.getProductPrice(product.getPname()));
            };


        }
        catch(Exception e){
            System.out.print("Exception in Order Class....."+e.toString());
        }
        return price;
    }
}