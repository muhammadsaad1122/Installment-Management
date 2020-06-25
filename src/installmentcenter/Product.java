/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package installmentcenter;

import java.util.ArrayList;


public class Product {
    private String name;
    private float price;
    private int quantity;
    private String company_name;
    private int total;
    private ArrayList<Instalment> instalment;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public ArrayList<Instalment> getInstalment() {
        return instalment;
    }

    public void setInstalment(ArrayList<Instalment> instalment) {
        this.instalment = instalment;
    }

    public Product(String name, float price, int quantity, String company_name, int total, ArrayList<Instalment> instalment) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.company_name = company_name;
        this.total = total;
        this.instalment = instalment;
    }

   

   
    
}
