/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package installmentcenter;

import java.util.ArrayList;

public class Customers {
    private String name;
    private String father;
    private String cnic;
    private String address;
    private String contact;
    private String accountnum;
    private String interest;
    private String interestamount;
    private String monthlyamount;
    private String dateofpurchasing;
    private String dateofending;
    private ArrayList<Product> buyProduct;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAccountnum() {
        return accountnum;
    }

    public void setAccountnum(String accountnum) {
        this.accountnum = accountnum;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public String getInterestamount() {
        return interestamount;
    }

    public void setInterestamount(String interestamount) {
        this.interestamount = interestamount;
    }

    public String getMonthlyamount() {
        return monthlyamount;
    }

    public void setMonthlyamount(String monthlyamount) {
        this.monthlyamount = monthlyamount;
    }

    public String getDateofpurchasing() {
        return dateofpurchasing;
    }

    public void setDateofpurchasing(String dateofpurchasing) {
        this.dateofpurchasing = dateofpurchasing;
    }

    public String getDateofending() {
        return dateofending;
    }

    public void setDateofending(String dateofending) {
        this.dateofending = dateofending;
    }

    public ArrayList<Product> getBuyProduct() {
        return buyProduct;
    }

    public void setBuyProduct(ArrayList<Product> buyProduct) {
        this.buyProduct = buyProduct;
    }

    public Customers(String name, String father, String cnic, String address, String contact, String accountnum, String interest, String interestamount, String monthlyamount, String dateofpurchasing, String dateofending, ArrayList<Product> buyProduct) {
        this.name = name;
        this.father = father;
        this.cnic = cnic;
        this.address = address;
        this.contact = contact;
        this.accountnum = accountnum;
        this.interest = interest;
        this.interestamount = interestamount;
        this.monthlyamount = monthlyamount;
        this.dateofpurchasing = dateofpurchasing;
        this.dateofending = dateofending;
        this.buyProduct = buyProduct;
    }

   

   

  

    
}
