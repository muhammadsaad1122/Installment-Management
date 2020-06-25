/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package installmentcenter;


public class Employees {
    
    private String name;
    private String father;
    private String cnic;
    private String address;
    private int contact;
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getfathername() {
        return father;
    }

    public void setfathername(String father) {
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

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     *
     * @param name
     * @param father
     * @param cnic
     * @param address
     * @param contact
     * @param salary
     */
    public Employees(String name, String father, String cnic, String address, int contact , int salary) {
        this.name = name;
        this.father = father;
        this.cnic = cnic;
        this.address = address;
        this.contact = contact;
        this.salary = salary;
    }
    
}
