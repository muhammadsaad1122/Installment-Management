/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package installmentcenter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class SoldProduct extends javax.swing.JFrame {

    /**
     * Creates new form PurchasedItem
     */
    public SoldProduct() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        companyname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        productname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        interest = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        purchasingdate = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        AddRecord = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        accid = new javax.swing.JTextField();
        totalinstallment = new javax.swing.JLabel();
        pmonth = new javax.swing.JLabel();
        Calculate = new javax.swing.JButton();
        Clear = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Selling Products");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(290, 20, 193, 29);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Product Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 130, 159, 20);

        companyname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companynameActionPerformed(evt);
            }
        });
        getContentPane().add(companyname);
        companyname.setBounds(370, 170, 313, 25);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Compnay Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 180, 159, 25);

        productname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productnameActionPerformed(evt);
            }
        });
        getContentPane().add(productname);
        productname.setBounds(370, 120, 313, 24);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Retail Price");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 280, 159, 24);

        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });
        getContentPane().add(price);
        price.setBounds(370, 270, 313, 25);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Interest %");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 330, 159, 24);

        interest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                interestActionPerformed(evt);
            }
        });
        getContentPane().add(interest);
        interest.setBounds(370, 320, 313, 25);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Total Installment Amount");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 420, 159, 24);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Installment Per Month");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(40, 470, 139, 15);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Date Of Purchasing");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(40, 380, 118, 15);

        purchasingdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchasingdateActionPerformed(evt);
            }
        });
        getContentPane().add(purchasingdate);
        purchasingdate.setBounds(370, 370, 313, 25);

        back.setBackground(new java.awt.Color(0, 0, 0));
        back.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(90, 530, 110, 41);

        AddRecord.setBackground(new java.awt.Color(0, 0, 0));
        AddRecord.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AddRecord.setForeground(new java.awt.Color(255, 255, 255));
        AddRecord.setText("Add");
        AddRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddRecordActionPerformed(evt);
            }
        });
        getContentPane().add(AddRecord);
        AddRecord.setBounds(340, 530, 110, 41);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Quantity");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(40, 230, 60, 24);

        quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityActionPerformed(evt);
            }
        });
        getContentPane().add(quantity);
        quantity.setBounds(370, 220, 313, 24);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Account Number");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(40, 80, 102, 27);

        accid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accidActionPerformed(evt);
            }
        });
        getContentPane().add(accid);
        accid.setBounds(370, 70, 313, 27);

        totalinstallment.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(totalinstallment);
        totalinstallment.setBounds(370, 420, 310, 30);

        pmonth.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(pmonth);
        pmonth.setBounds(370, 460, 310, 30);

        Calculate.setBackground(new java.awt.Color(0, 0, 0));
        Calculate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Calculate.setForeground(new java.awt.Color(255, 255, 255));
        Calculate.setText("Calculate");
        Calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculateActionPerformed(evt);
            }
        });
        getContentPane().add(Calculate);
        Calculate.setBounds(667, 430, 120, 40);

        Clear.setBackground(new java.awt.Color(0, 0, 0));
        Clear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Clear.setForeground(new java.awt.Color(255, 255, 255));
        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        getContentPane().add(Clear);
        Clear.setBounds(570, 530, 110, 40);

        setSize(new java.awt.Dimension(816, 639));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void companynameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companynameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_companynameActionPerformed

    private void productnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productnameActionPerformed

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceActionPerformed

    private void interestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_interestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_interestActionPerformed

    private void purchasingdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchasingdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_purchasingdateActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
          dispose();
             java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer().setVisible(true);
            }
        });// TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

    private void AddRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddRecordActionPerformed
        FileWriter fw=null;
        BufferedWriter bw=null;
        Boolean flag=false;
        ArrayList<Customers> customer=new LoadCustomers().getdata();
        if("".equals(accid.getText())||"".equals(productname.getText()) || "".equals(companyname.getText())|| "".equals(quantity.getText()) || "".equals(price.getText()) || "".equals(interest.getText())|| "".equals(purchasingdate.getText()))
        {
            JOptionPane.showMessageDialog(this,"Field Cannot be Empty!");

        }
        else
        {
            for(int i=0;i<customer.size();i++)
            {
                if(accid.getText().contains(customer.get(i).getAccountnum()))
                {
                    flag=true;
                    
                    
                   String pname=productname.getText();
                    float prs=Float.parseFloat(price.getText());
                    int q=Integer.parseInt(quantity.getText());
                    String comp=companyname.getText();
                    customer.get(i).setInterest(interest.getText());
                    customer.get(i).setInterestamount(totalinstallment.getText());
                    customer.get(i).setDateofpurchasing(purchasingdate.getText());
                    customer.get(i).setMonthlyamount(permonth+"");
                    customer.get(i).setDateofending("0");
                    Product obj=new Product(pname,TotalAmount,q,comp,0,new ArrayList<Instalment>());
                   
                    customer.get(i).getBuyProduct().add(obj);
                    
                    break;
                }
            }
            if(flag==true){
            try{
                fw=new FileWriter("customer.txt");
                bw=new BufferedWriter(fw);
                for(int i=0;i<customer.size();i++)
                {
                    Customers obj=customer.get(i);
                    bw.write(obj.getName()+" "+obj.getFather()+" "+obj.getCnic()+" "+obj.getAddress()+" "+obj.getContact()+" "+obj.getAccountnum()+" "+obj.getInterest()+" "+obj.getInterestamount()+" "+obj.getMonthlyamount()+" "+obj.getDateofpurchasing()+" "+obj.getDateofending()+" "+obj.getBuyProduct().size());
                    for(int j=0;j<obj.getBuyProduct().size();j++){
                        Product obj2=obj.getBuyProduct().get(j);
                        bw.newLine();
                        bw.write(obj2.getName()+" "+obj2.getCompany_name()+" "+obj2.getPrice()+" "+obj2.getQuantity()+" "+obj2.getTotal()+" "+obj2.getInstalment().size());
                        for(int k=0;k<obj2.getInstalment().size();k++)
                        {
                            Instalment obj3=obj2.getInstalment().get(k);
                            obj3.setRemaning(TotalAmount);
                            bw.newLine();
                            bw.write(obj3.getMonthly()+" "+obj3.getRemaning()+" "+obj3.getDate());
                        }
                        
                    }
                    bw.newLine();
                    
                }
                bw.close();
                fw.close();

            }catch(IOException e)
            {
                e.printStackTrace();
            }
            JOptionPane.showMessageDialog(this," Added Successfully!");
        }
        }
// TODO add your handling code here:
    }//GEN-LAST:event_AddRecordActionPerformed

    private void quantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityActionPerformed

    private void accidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accidActionPerformed

    private void CalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculateActionPerformed
        // TODO add your handling code here:
                    float prs=Float.parseFloat(price.getText());
                    int   q=Integer.parseInt(quantity.getText());
                    float intrest =Float.parseFloat(interest.getText());
                    float Total=prs*q;
                    float interestamount=(Total*intrest)/100;
                    TotalAmount=Total+interestamount;
                    permonth=TotalAmount/12;
                    totalinstallment.setText(TotalAmount+"");
                    pmonth.setText(permonth+"");
    }//GEN-LAST:event_CalculateActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
       accid.setText("");
       productname.setText("");
       companyname.setText("");
       quantity.setText("");
       price.setText("");
       interest.setText("");
       purchasingdate.setText("");
       totalinstallment.setText("");
       pmonth.setText("");
    }//GEN-LAST:event_ClearActionPerformed

    /**
     * @param args the command line arguments
     */
   private float TotalAmount=0;
   private float permonth=0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddRecord;
    private javax.swing.JButton Calculate;
    private javax.swing.JButton Clear;
    private javax.swing.JTextField accid;
    private javax.swing.JButton back;
    private javax.swing.JTextField companyname;
    private javax.swing.JTextField interest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel pmonth;
    private javax.swing.JTextField price;
    private javax.swing.JTextField productname;
    private javax.swing.JTextField purchasingdate;
    private javax.swing.JTextField quantity;
    private javax.swing.JLabel totalinstallment;
    // End of variables declaration//GEN-END:variables
}
