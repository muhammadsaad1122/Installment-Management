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


public class DeleteProducts extends javax.swing.JFrame {

    /**
     * Creates new form DeleteProducts
     */
    public DeleteProducts() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        companyName = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        deleteProducts = new javax.swing.JButton();
        Clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Delete Product");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(250, 20, 149, 54);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(137, 109, 94, 15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Company Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(137, 173, 94, 15);
        getContentPane().add(name);
        name.setBounds(310, 100, 220, 30);
        getContentPane().add(companyName);
        companyName.setBounds(310, 160, 220, 30);

        back.setBackground(new java.awt.Color(51, 51, 51));
        back.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(140, 260, 100, 40);

        deleteProducts.setBackground(new java.awt.Color(0, 0, 0));
        deleteProducts.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        deleteProducts.setForeground(new java.awt.Color(255, 255, 255));
        deleteProducts.setText("Delete  Product");
        deleteProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteProductsActionPerformed(evt);
            }
        });
        getContentPane().add(deleteProducts);
        deleteProducts.setBounds(270, 260, 129, 40);

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
        Clear.setBounds(430, 260, 100, 40);

        setSize(new java.awt.Dimension(696, 454));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
 dispose();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Products().setVisible(true);
            }
        });        // TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

    private void deleteProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteProductsActionPerformed
         ArrayList<Product> product=new LoadProducts().getdata();
         Boolean flag=false;
         for(int i=0;i<product.size();i++)
         {
             if(name.getText().contains(product.get(i).getName())&&companyName.getText().contains(product.get(i).getCompany_name()))
             {
                 product.remove(i);
                 JOptionPane.showMessageDialog(this,"Product Deleted Successfully");
                 flag=true;
                 break;
             }
         }
             if(flag==false)
             {
                 JOptionPane.showMessageDialog(this,"No Product Found!");
             }
         FileWriter fw=null;
         BufferedWriter bw=null;
         try{
             fw=new FileWriter("product.txt");
             bw=new BufferedWriter(fw);
             for(int i=0;i<product.size();i++)
             {
                 Product obj=product.get(i);
                 bw.write(obj.getName()+" "+ obj.getCompany_name()+" "+ obj.getPrice()+" "+ obj.getQuantity());
                 bw.newLine();
             }
             bw.close();
             fw.close();
         }catch(IOException e)
         {
              e.printStackTrace();
         }
    }//GEN-LAST:event_deleteProductsActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        name.setText("");
        companyName.setText("");
    }//GEN-LAST:event_ClearActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JButton back;
    private javax.swing.JTextField companyName;
    private javax.swing.JButton deleteProducts;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField name;
    // End of variables declaration//GEN-END:variables
}