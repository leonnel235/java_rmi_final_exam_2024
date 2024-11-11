
package VIEW;

import MODEL.BookingModel;
import SERVICE.BookingSERVICE;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.text.MessageFormat;
import java.util.List;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.OrientationRequested;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class BookingJFrame extends javax.swing.JFrame {
    

    public BookingJFrame() {
        initComponents();
        
    }

  

    

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jBack = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jTextStatus = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jInsert = new javax.swing.JButton();
        jEdit = new javax.swing.JButton();
        jErase = new javax.swing.JButton();
        jCheck = new javax.swing.JButton();
        jTextSearch = new javax.swing.JTextField();
        jReset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableClient = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextbooking_Id = new javax.swing.JTextField();
        jPrint = new javax.swing.JButton();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jTextPrice = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText(" BOOKING_DASHBOARD");

        jBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBack.setText(" BACK");
        jBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 406, Short.MAX_VALUE)
                .addComponent(jBack)
                .addGap(62, 62, 62))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 550));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jTextStatus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextStatus.setText(" ");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText(" SERVICE STATUS");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText(" BOOKING_DATE");

        jInsert.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jInsert.setText(" Register");
        jInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jInsertActionPerformed(evt);
            }
        });

        jEdit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jEdit.setText(" Update");
        jEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEditActionPerformed(evt);
            }
        });

        jErase.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jErase.setText(" Delete");
        jErase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEraseActionPerformed(evt);
            }
        });

        jCheck.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCheck.setText(" Search");
        jCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckActionPerformed(evt);
            }
        });

        jTextSearch.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextSearch.setText(" ");

        jReset.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jReset.setText(" Refresh");
        jReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jResetActionPerformed(evt);
            }
        });

        jTableClient.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTableClient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableClient);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText(" Search_Client_By_ID");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText(" BOOKING_ID");

        jTextbooking_Id.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextbooking_Id.setText(" ");

        jPrint.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPrint.setText(" PRINT_PDF");
        jPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPrintActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText(" VEHICLE_PRICE");

        jTextPrice.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextPrice.setText(" ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jTextSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)
                                .addComponent(jCheck)
                                .addGap(149, 149, 149)
                                .addComponent(jReset)))
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jInsert)
                            .addComponent(jTextbooking_Id))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jEdit))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(134, 134, 134)
                                .addComponent(jLabel1)
                                .addGap(147, 147, 147))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jErase)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPrint))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(62, 62, 62)
                                        .addComponent(jTextStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(80, 80, 80))))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1039, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextbooking_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(53, 53, 53)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jInsert)
                    .addComponent(jEdit)
                    .addComponent(jPrint)
                    .addComponent(jErase))
                .addGap(32, 32, 32)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheck)
                    .addComponent(jReset))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 1120, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jInsertActionPerformed
     try {
        // Validate if any of the fields are empty
        if (jDateChooser.getDate() == null || jTextStatus.getText().trim().isEmpty()
            || jTextPrice.getText().trim().isEmpty() || jTextbooking_Id.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all fields");
            return;
        }

        // Attempt to connect to the registry and lookup the booking service
        Registry registry = LocateRegistry.getRegistry("127.0.0.1", 6000);
        BookingSERVICE service = (BookingSERVICE) registry.lookup("booking");

        // Create the BookingModel object and set its properties
        BookingModel theBooking = new BookingModel();
        theBooking.setBookingdate(jDateChooser.getDate());
        theBooking.setPrice(jTextPrice.getText());
        theBooking.setService(jTextStatus.getText());

        try {
            // Parse and set the booking ID
            int bookingId = Integer.parseInt(jTextbooking_Id.getText().trim());
            theBooking.setBookingId(bookingId);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid booking ID");
            return;
        }

        // Call the service to save the booking
        BookingModel bookingObj = service.SveBooking(theBooking);
        if (bookingObj != null) {
            JOptionPane.showMessageDialog(this, "Booking registered successfull");
        } else {
            JOptionPane.showMessageDialog(this, "Booking not registered");
        }
    } catch (RemoteException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Failed to connect to the booking service: " + e.getMessage());
    } catch (NotBoundException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Booking service not found: " + e.getMessage());
    } catch (Exception ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "An error occurred: " + ex.getMessage());
    }
    }//GEN-LAST:event_jInsertActionPerformed

    private void jEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEditActionPerformed
         try {
        // Validate if any of the fields are empty
        if (jDateChooser.getDate() == null || jTextStatus.getText().trim().isEmpty()
            || jTextPrice.getText().trim().isEmpty() || jTextbooking_Id.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all fields");
            return;
        }

        // Attempt to connect to the registry and lookup the booking service
        Registry registry = LocateRegistry.getRegistry("127.0.0.1", 6000);
        BookingSERVICE service = (BookingSERVICE) registry.lookup("booking");

        // Create the BookingModel object and set its properties
        BookingModel theBooking = new BookingModel();
        theBooking.setBookingdate(jDateChooser.getDate());
        theBooking.setPrice(jTextPrice.getText());
        theBooking.setService(jTextStatus.getText());

        try {
            // Parse and set the booking ID
            int bookingId = Integer.parseInt(jTextbooking_Id.getText().trim());
            theBooking.setBookingId(bookingId);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid booking ID");
            return;
        }

        // Call the service to update the booking
        BookingModel bookingObj = service.EditBooking(theBooking);
        if (bookingObj != null) {
            JOptionPane.showMessageDialog(this, "Booking updated successfull");
        } else {
            JOptionPane.showMessageDialog(this, "Booking not updated");
        }
    } catch (RemoteException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Failed to connect to the booking service: " + e.getMessage());
    } catch (NotBoundException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Booking service not found: " + e.getMessage());
    } catch (Exception ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "An error occurred: " + ex.getMessage());
    }  
    }//GEN-LAST:event_jEditActionPerformed

    private void jEraseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEraseActionPerformed
     try {
        // Validate if the booking ID field is empty
        if (jTextbooking_Id.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a booking ID");
            return;
        }

        // Attempt to connect to the registry and lookup the booking service
        Registry registry = LocateRegistry.getRegistry("127.0.0.1", 6000);
        BookingSERVICE service = (BookingSERVICE) registry.lookup("booking");

        int bookingId;
        try {
            // Parse and set the booking ID
            bookingId = Integer.parseInt(jTextbooking_Id.getText().trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid booking ID");
            return;
        }

        BookingModel theClient = new BookingModel();
        theClient.setBookingId(bookingId); 
        BookingModel deletedClient = service.Eraseooking(theClient); // Assuming Eraseooking is the correct method

        if (deletedClient != null) {
            JOptionPane.showMessageDialog(this, "Booking deleted successfull");
        } else {
            JOptionPane.showMessageDialog(this, "Failed to delete Booking");
        }
    } catch (RemoteException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Failed to connect to the booking service: " + e.getMessage());
    } catch (NotBoundException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Booking service not found: " + e.getMessage());
    } catch (Exception ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "An error occurred: " + ex.getMessage());
    }
    }//GEN-LAST:event_jEraseActionPerformed

    private void jCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckActionPerformed
     try {
        // Validate if the booking ID field is empty
        if (jTextSearch.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a booking ID");
            return;
        }

        // Attempt to connect to the registry and lookup the booking service
        Registry registry = LocateRegistry.getRegistry("127.0.0.1", 6000);
        BookingSERVICE service = (BookingSERVICE) registry.lookup("booking");

        int bookingId;
        try {
            // Parse and set the booking ID
       
            bookingId = Integer.parseInt(jTextSearch.getText().trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid booking ID");
            return;
        }

        // Call the service to search for the booking
        BookingModel theClient = new BookingModel();
        theClient.setBookingId(bookingId); 
        BookingModel bookingObj = service.SearchBooking(theClient); // Assuming getBooking is the correct method
        if (bookingObj != null) {
            jTextbooking_Id.setText(String.valueOf(bookingObj .getBookingId()));
            jDateChooser.setDate(bookingObj.getBookingdate());
            jTextPrice.setText(bookingObj.getPrice());
            jTextStatus.setText(bookingObj.getService());
            JOptionPane.showMessageDialog(this, "Booking found");
        } else {
            JOptionPane.showMessageDialog(this, "Booking not found");
        }
    } catch (RemoteException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Failed to connect to the booking service: " + e.getMessage());
    } catch (NotBoundException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Booking service not found: " + e.getMessage());
    } catch (Exception ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "An error occurred: " + ex.getMessage());
    }         
    }//GEN-LAST:event_jCheckActionPerformed

    private void jResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jResetActionPerformed
     try {
            // Get the list of clients from the service
           // Attempt to connect to the registry and lookup the booking service
        Registry registry = LocateRegistry.getRegistry("127.0.0.1", 6000);
        BookingSERVICE service = (BookingSERVICE) registry.lookup("booking");
            List<BookingModel > clients = service.Listbooking(); 
            

            // Create a DefaultTableModel with the column names
            String[] columnNames = {"Booking_ID", "Booking_Date", "Price", "Service_Status"};
            DefaultTableModel model = new DefaultTableModel(columnNames, 0);

            // Add each client to the table model
            for (BookingModel  client : clients) {
                Object[] rowData = {client.getBookingId(), client.getBookingdate(), client.getPrice(), client.getService()};
                model.addRow(rowData);
            }

            // Set the table model to the jTable
            jTableClient.setModel(model);
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error refreshing table: " + ex.getMessage());
        }        
      
    }//GEN-LAST:event_jResetActionPerformed

    private void jBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBackActionPerformed
        
         this.dispose();
             DashbordJFrame LG = new DashbordJFrame();
            LG.setVisible(true);
    }//GEN-LAST:event_jBackActionPerformed

    private void jPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPrintActionPerformed
     // TODO add your handling code here:
            // TODO add your handling code here:
        MessageFormat header = new MessageFormat("Receipt,Form Online_Booking_Management_System");
        MessageFormat footer = new MessageFormat("Footer");
        try {
            PrintRequestAttributeSet set = new HashPrintRequestAttributeSet();
            set.add(OrientationRequested.PORTRAIT);
       jTableClient.print(JTable.PrintMode.FIT_WIDTH, header, footer, true, set, true);
                     
        } catch (Exception e) {
            e.printStackTrace();
        }        
    }//GEN-LAST:event_jPrintActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BookingJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookingJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookingJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookingJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookingJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBack;
    private javax.swing.JButton jCheck;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JButton jEdit;
    private javax.swing.JButton jErase;
    private javax.swing.JButton jInsert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jPrint;
    private javax.swing.JButton jReset;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableClient;
    private javax.swing.JTextField jTextPrice;
    private javax.swing.JTextField jTextSearch;
    private javax.swing.JTextField jTextStatus;
    private javax.swing.JTextField jTextbooking_Id;
    // End of variables declaration//GEN-END:variables
}
