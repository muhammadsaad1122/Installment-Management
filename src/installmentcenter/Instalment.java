/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package installmentcenter;


public class Instalment {
    private float monthly;
    private float remaning;
    private String date;

    public float getMonthly() {
        return monthly;
    }

    public void setMonthly(float monthly) {
        this.monthly = monthly;
    }

    public float getRemaning() {
        return remaning;
    }

    public void setRemaning(float remaning) {
        this.remaning = remaning;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Instalment(float monthly, float remaning, String date) {
        this.monthly = monthly;
        this.remaning = remaning;
        this.date = date;
    }
    
}
