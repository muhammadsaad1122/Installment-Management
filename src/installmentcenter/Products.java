package installmentcenter;

import java.awt.Toolkit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Products extends javax.swing.JFrame {

    /**
     * Creates new form Products
     */
    public Products() {
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
        addProducts = new javax.swing.JButton();
        updateProducts = new javax.swing.JButton();
        searchProducts = new javax.swing.JButton();
        delProducts = new javax.swing.JButton();
        mainMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Inventory of Products");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(200, 30, 300, 39);

        addProducts.setBackground(new java.awt.Color(0, 0, 0));
        addProducts.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addProducts.setForeground(new java.awt.Color(255, 255, 255));
        addProducts.setText("Add Product");
        addProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProductsActionPerformed(evt);
            }
        });
        getContentPane().add(addProducts);
        addProducts.setBounds(270, 110, 140, 50);

        updateProducts.setBackground(new java.awt.Color(0, 0, 0));
        updateProducts.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        updateProducts.setForeground(new java.awt.Color(255, 255, 255));
        updateProducts.setText("Update Product");
        updateProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateProductsActionPerformed(evt);
            }
        });
        getContentPane().add(updateProducts);
        updateProducts.setBounds(270, 290, 140, 50);

        searchProducts.setBackground(new java.awt.Color(0, 0, 0));
        searchProducts.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        searchProducts.setForeground(new java.awt.Color(255, 255, 255));
        searchProducts.setText("Search Product");
        searchProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchProductsActionPerformed(evt);
            }
        });
        getContentPane().add(searchProducts);
        searchProducts.setBounds(270, 170, 140, 50);

        delProducts.setBackground(new java.awt.Color(0, 0, 0));
        delProducts.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        delProducts.setForeground(new java.awt.Color(255, 255, 255));
        delProducts.setText("Delete Product");
        delProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delProductsActionPerformed(evt);
            }
        });
        getContentPane().add(delProducts);
        delProducts.setBounds(270, 230, 140, 50);

        mainMenu.setBackground(new java.awt.Color(0, 0, 0));
        mainMenu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mainMenu.setForeground(new java.awt.Color(255, 255, 255));
        mainMenu.setText("Main Menu");
        mainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainMenuActionPerformed(evt);
            }
        });
        getContentPane().add(mainMenu);
        mainMenu.setBounds(10, 364, 100, 40);

        setSize(new java.awt.Dimension(696, 454));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProductsActionPerformed
 dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddProducts().setVisible(true);
            }
        });        // TODO add your handling code here:
    }//GEN-LAST:event_addProductsActionPerformed

    private void mainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenuActionPerformed
 
        dispose();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPage().setVisible(true);
            }
        });        // TODO add your handling code here:
    }//GEN-LAST:event_mainMenuActionPerformed

    private void searchProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchProductsActionPerformed
dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchProducts().setVisible(true);
            }
        });    }//GEN-LAST:event_searchProductsActionPerformed

    private void updateProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateProductsActionPerformed
dispose();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdtadeProducts().setVisible(true);
            }
        });        // TODO add your handling code here:
    }//GEN-LAST:event_updateProductsActionPerformed

    private void delProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delProductsActionPerformed
dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteProducts().setVisible(true);
            }
        });        // TODO add your handling code here:
    }//GEN-LAST:event_delProductsActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addProducts;
    private javax.swing.JButton delProducts;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton mainMenu;
    private javax.swing.JButton searchProducts;
    private javax.swing.JButton updateProducts;
    // End of variables declaration//GEN-END:variables
}