package com.myproject.price;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author:  Amit Bhatt
 *
 */

public class Price {
    String result = "";
    InputStream inputStream;

    public double getProductPrice(String productprice) throws IOException {
        String price=null;
        try {
            Properties prop = new Properties();
            String propFileName = "././././price.properties";

            //Double price;


            inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

            if (inputStream != null) {
               prop.load(inputStream);
            } else {
                throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
            }

            // get the property value and print it out
            //Bananas, Oranges, Apples, Lemons, Peaches
                    if(productprice.equalsIgnoreCase("Bananas")){
                        price=prop.getProperty("Bananas");
                    }
                    else if(productprice.equalsIgnoreCase("Apples")){
                        price=prop.getProperty("Apples");                    }
                    else if(productprice.equalsIgnoreCase("Bananas")){
                        price=prop.getProperty("Bananas");
                    }
                    else if(productprice.equalsIgnoreCase("Lemons")){
                        price=prop.getProperty("Lemons");
                    }
                    else if(productprice.equalsIgnoreCase("Oranges")){
                        price=prop.getProperty("Oranges");
                    }
                    else if(productprice.equalsIgnoreCase("Peaches")){
                        price=prop.getProperty("Peaches");
                    }
                    else
                    {
                        System.out.println("No Match Condition"+productprice);
                        price="0.0";
                    }
        } catch (Exception e) {
            System.out.println("Exception in Price Class: " + e.toString());
        } finally {
            inputStream.close();
        }

        return Double.parseDouble(price);
    }
}