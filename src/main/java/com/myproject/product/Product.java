package com.myproject.product;
/**
 * Created by Amit Bhatt on 1/10/2016.
 */
public class Product {
    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String pid;
    public String pname;
    public int qty;

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }


    public Product(){}
    public Product(String pid, String pname, int qty) {
        this.pid = pid;
        this.pname = pname;
        this.qty = qty;
    }

}
