package eep.view;

import eep.controller.*;

/******************************************************************************
* File:NewJFrame.java
* Course: 17655
* Project: Assignment 2
* Copyright: Copyright (c) 2009 Carnegie Mellon University
* Versions:
*	1.0 November 2009 - Initial rewrite of original assignment 2 (ajl).
*
* This class defines a GUI application that allows EEP order takers to enter
* phone orders into the database. 
*
******************************************************************************/

/**
 *
 * @author lattanze
 */
public class OrdersView extends javax.swing.JFrame {

    String versionID = "v3.0.0";
    private OrdersController controller;
    String userNameLocal = "";
    
    
    /** Creates new form NewJFrame */
    public OrdersView(OrdersController controller) {
        this.controller = controller;
        initComponents();
        jLabel1.setText("Order Management Application " + versionID);        
    }
    
    public OrdersView(OrdersController controller, String userName) {
        this(controller);        
        userNameLocal = userName;                        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("Order Management Application");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("Trees");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Seeds");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Shrubs");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setText("Press Button For Inventory Display");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel6.setText("First Name");

        jLabel7.setText("Last Name");

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jLabel8.setText("Phone #");

        jLabel5.setText("Items Selected:");

        jButton4.setText("Add to Order");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel9.setText("Order Total Cost:");

        jTextField6.setText("$0");
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jButton5.setText("Submit Order");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel10.setText("Product ID : Product Description : Price : Items in Stock");

        jLabel2.setText("Messages:");

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        jLabel3.setText("Customer Information");

        jLabel11.setText("Database IP:");

        jTextField1.setText("localhost");

        jLabel12.setText("Address");

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane4.setViewportView(jTextArea4);

        jLabel13.setText("SELECT ENTIRE INVENTORY LINE TO ADD ITEM TO ORDER (TRIPLE CLICK)");

        jButton6.setText("Culture Boxes");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Genomics");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Processing");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Reference Materials");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        btnLogOut.setText("Log Out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel10))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel11)
                                            .addGap(95, 95, 95))
                                        .addComponent(jScrollPane2)
                                        .addComponent(jScrollPane3)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(jLabel2))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jButton1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButton2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButton3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButton6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButton7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButton8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButton9)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(9, 9, 9)
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(jLabel1)
                                .addGap(416, 416, 416)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLogOut)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField6))
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(93, 93, 93))
            .addGroup(layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(jButton5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnLogOut)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel3))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton2)
                        .addComponent(jButton3)
                        .addComponent(jButton6)
                        .addComponent(jButton7)
                        .addComponent(jButton8)
                        .addComponent(jButton9)))
                .addGap(20, 20, 20)
                .addComponent(jLabel13)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        // jButton1 is responsible for querying the inventory database and
        // getting the tree inventory. Once retieved, the tree inventory is
        // displayed in jTextArea1. From here the user can select an inventory
        // item by triple clicking the item.

        String SQLServerIP = jTextField1.getText();        
        String output = controller.getTrees(SQLServerIP);
        
        jTextArea1.setText(output);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // This button gets the selected line of text from the
        // inventory list window jTextArea1. The line of text is parsed and
        // the relevant information is placed in the order area (jTextArea2).

        int beginIndex;                     // Parsing index
        int endIndex;                       // Parsing index
        Float fCost;                        // Item cost
        String productDescription = null;   // Product description
        String productID = null;            // Product ID pnemonic
        String sCost,sTotalCost;            // String order and total cost values
        Boolean IndexNotFound;              // Flag indicating a string index was not found.

        // Initialization
        
        String inventorySelection = null;
        IndexNotFound = false;
        sCost = null;
        sTotalCost = null;
        
        // this is the selected line of text
        inventorySelection =  jTextArea1.getSelectedText();

        // make sure its not blank
        if ( inventorySelection != null )
        {
            // get the product ID
            beginIndex = 0;
            endIndex = inventorySelection.indexOf(" : ",beginIndex);
            if (endIndex < 0 ) {
                IndexNotFound = true;
            } else {
                productID = inventorySelection.substring(beginIndex,endIndex);
            }
    
            if ( !IndexNotFound )
            {
                // get the product description
                beginIndex = endIndex + 3; //skip over " : "
                endIndex = inventorySelection.indexOf(" : ",beginIndex);
                if (endIndex < 0 ) {
                    IndexNotFound = true;
                } else {
                    productDescription = inventorySelection.substring(beginIndex,endIndex);
                }              
            }
            
            // get the string cost value
            if ( !IndexNotFound )
            {
                beginIndex = endIndex + 4; //skip over " : $"
                endIndex = inventorySelection.indexOf(" : ",beginIndex);
                if (endIndex < 0 ) {
                    IndexNotFound = true;
                } else {
                    sCost = inventorySelection.substring(beginIndex,endIndex);
                }
            }
            
            // write the string to the order area
            
            if ( !IndexNotFound )
            {
                jTextArea2.append( productID + " : " + productDescription + " : $"
                    + sCost + "\n");

                // convert the string cost to a float, add it to what is in the
                // cost field (jTextField6), and update the cost field with the
                // new value

                sTotalCost = jTextField6.getText();
                beginIndex = 0;
                beginIndex = sTotalCost.indexOf("$",beginIndex)+1;
                sTotalCost = sTotalCost.substring(beginIndex, sTotalCost.length());
                fCost = Float.parseFloat(sTotalCost) + Float.parseFloat(sCost);
                jTextField6.setText( "$" + fCost.toString());
                
            } else {
                jTextArea3.append("\nNo items selected...\nSELECT ENTIRE INVENTORY LINE TO ADD ITEM TO ORDER\n(TRIPLE CLICK ITEM LINE)");      
            }
        } else {
            jTextArea3.append("\nNo items selected...\nSELECT ENTIRE INVENTORY LINE TO ADD ITEM TO ORDER\n(TRIPLE CLICK ITEM LINE)"); 
        } // Blank string check
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // This is the submit order button. This handler will check to make sure
        // that the customer information is provided, then create an entry in
        // the orderinfo::orders table. It will also create another table where
        // the list of items is stored. This table is also in the orderinfo
        // database as well.
        
        String SQLServerIP = jTextField1.getText();        
        String firstName = jTextField3.getText();
        String lastName = jTextField4.getText();
        String phoneNumber = jTextField5.getText();
        String customerAddress = jTextArea4.getText();
        String sTotalCost = jTextField6.getText();
        String lines = jTextArea2.getText();
        
        String msg = controller.submitOrder(SQLServerIP, firstName, lastName, phoneNumber, customerAddress, sTotalCost, lines);
        
        if (msg.contains("ORDER SUBMITTED")){
            // Clean up the display
            jTextArea1.setText("");
            jTextArea2.setText("");
            jTextArea4.setText("");
            jTextField3.setText("");
            jTextField4.setText("");
            jTextField5.setText("");
            jTextField6.setText("$0");
        }
        
        jTextArea3.setText(msg);
        


    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // jButton2 is responsible for querying the inventory database and
        // getting the seed inventory. Once retieved, the seed inventory is
        // displayed in jTextArea1. From here the user can select an inventory
        // item by triple clicking the item.

        String SQLServerIP = jTextField1.getText();        
        String output = controller.getSeeds(SQLServerIP);
        
        jTextArea1.setText(output);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // jButton3 is responsible for querying the inventory database and
        // getting the shrub inventory. Once retieved, the shrub inventory is
        // displayed in jTextArea1. From here the user can select an inventory
        // item by triple clicking the item.

        String SQLServerIP = jTextField1.getText();        
        String output = controller.getShrubs(SQLServerIP);
        
        jTextArea1.setText(output);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // jButton6 is responsible for querying the leaftech database and
        // getting the culture box inventory. Once retieved, the culture box inventory is
        // displayed in jTextArea1. From here the user can select an inventory
        // item by triple clicking the item.

        // Database parameters
        String SQLServerIP = jTextField1.getText();        
        String output = controller.getCultureBoxes(SQLServerIP);
        
        jTextArea1.setText(output);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // jButton7 is responsible for querying the leaftech database and
        // getting the genomics inventory. Once retieved, the genomics inventory is
        // displayed in jTextArea1. From here the user can select an inventory
        // item by triple clicking the item.

        // Database parameters
        String SQLServerIP = jTextField1.getText();        
        String output = controller.getGenomics(SQLServerIP);
        
        jTextArea1.setText(output);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // jButton8 is responsible for querying the leaftech database and
        // getting the processing inventory. Once retieved, the processing inventory is
        // displayed in jTextArea1. From here the user can select an inventory
        // item by triple clicking the item.

        String SQLServerIP = jTextField1.getText();        
        String output = controller.getProcessing(SQLServerIP);
        
        jTextArea1.setText(output);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // jButton9 is responsible for querying the leaftech database and
        // getting the referencematerials inventory. Once retieved, the referencematerials inventory is
        // displayed in jTextArea1. From here the user can select an inventory
        // item by triple clicking the item.

        String SQLServerIP = jTextField1.getText();        
        String output = controller.getReferenceMaterials(SQLServerIP);
        
        jTextArea1.setText(output);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        
        
        controller.logOut();
                
        
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        controller.logOut();
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables

}