
package VIEW;

import MODEL.ClientModel;
import SERVICE.ClientSERVICE;
import java.io.File;
import java.io.FileWriter;
import java.rmi.registry.*;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class ClientJFrame extends javax.swing.JFrame {

    public ClientJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jBack = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jTextName = new javax.swing.JTextField();
        jTextEmail = new javax.swing.JTextField();
        jTextPhone = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
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
        jTexID = new javax.swing.JTextField();
        jPrint = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 51, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(" CLIENT_DASHBOARD");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 396, Short.MAX_VALUE)
                .addComponent(jBack)
                .addGap(62, 62, 62))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 540));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jTextName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextName.setText(" ");

        jTextEmail.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextEmail.setText(" ");

        jTextPhone.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextPhone.setText(" ");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText(" CLIENT_NAME");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText(" CLIENT_EMAIL");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText(" CLIENT_PHONE_NUMBER");

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

        jTableClient.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
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
        jLabel5.setText(" CLIENT_ID");

        jTexID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTexID.setText(" ");

        jPrint.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPrint.setText(" PRINT_ECXEL");
        jPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTexID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jInsert, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jEdit, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextPhone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPrint)
                                        .addComponent(jErase)))
                                .addGap(71, 71, 71))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addContainerGap())))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jTextSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)
                                .addComponent(jCheck)
                                .addGap(149, 149, 149)
                                .addComponent(jReset)))
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTexID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jErase)
                    .addComponent(jEdit)
                    .addComponent(jInsert))
                .addGap(41, 41, 41)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheck)
                            .addComponent(jReset))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jPrint)
                        .addGap(36, 36, 36)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 880, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jInsertActionPerformed
       try {
        // Check if any of the fields are empty
        if (jTexID.getText().trim().isEmpty()
            || jTextName.getText().trim().isEmpty()
            || jTextEmail.getText().trim().isEmpty()
            || jTextPhone.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all fields");
        } else {
            // Parse the client ID
            int clientId = Integer.parseInt(jTexID.getText());

            // Get the registry and lookup the service
            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 6000);
            ClientSERVICE service = (ClientSERVICE) registry.lookup("client");

            // Create the ClientModel object and set its properties
            ClientModel theSignup = new ClientModel();
            theSignup.setClientId(clientId); // Set the client ID
            theSignup.setName(jTextName.getText());
            theSignup.setEmail(jTextEmail.getText());
            theSignup.setPhone_number(jTextPhone.getText());

            // Call the service to save the client
            ClientModel theObj = service.SveClient(theSignup);
            if (theObj != null) {
                JOptionPane.showMessageDialog(this, "Client registered successfull");
            } else {
                JOptionPane.showMessageDialog(this, "Failed to register Client");
            }
        }
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Invalid client ID. Please enter a valid number.");
    } catch (Exception ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "An error occurred: " + ex.getMessage());
    }
    }//GEN-LAST:event_jInsertActionPerformed

    private void jEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEditActionPerformed
         try {
        // Check if any of the fields are empty
        if (jTexID.getText().trim().isEmpty()
            || jTextName.getText().trim().isEmpty()
            || jTextEmail.getText().trim().isEmpty()
            || jTextPhone.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all fields");
        } else {
            // Parse the client ID
            int clientId = Integer.parseInt(jTexID.getText());

            // Get the registry and lookup the service
            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 6000);
            ClientSERVICE service = (ClientSERVICE) registry.lookup("client");

            // Create the ClientModel object and set its properties
            ClientModel theClient = new ClientModel();
            theClient.setClientId(clientId); // Set the client ID
            theClient.setName(jTextName.getText());
            theClient.setEmail(jTextEmail.getText());
            theClient.setPhone_number(jTextPhone.getText());

            // Call the service to update the client
            ClientModel updatedClient = service.EditClient(theClient); // Assuming updateClient is the correct method
            if (updatedClient != null) {
                JOptionPane.showMessageDialog(this, "Client updated successfull");
            } else {
                JOptionPane.showMessageDialog(this, "Failed to update Client");
            }
        }
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Invalid client ID. Please enter a valid number.");
    } catch (Exception ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "An error occurred: " + ex.getMessage());
    }
    }//GEN-LAST:event_jEditActionPerformed

    private void jEraseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEraseActionPerformed
         try {
        // Check if the client ID field is empty
        if (jTexID.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter the client ID");
        } else {
            // Parse the client ID
            int clientId = Integer.parseInt(jTexID.getText());

            // Get the registry and lookup the service
            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 6000);
            ClientSERVICE service = (ClientSERVICE) registry.lookup("client");
            
            ClientModel theClient = new ClientModel();
            theClient.setClientId(clientId); 
             ClientModel deletedClient = service.EraseClient(theClient); // Assuming updateClient is the correct method
            
             if (deletedClient!= null)  {
                JOptionPane.showMessageDialog(this, "Client deleted successfull");
            } else {
                JOptionPane.showMessageDialog(this, "Failed to delete client");
            }
        }
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Invalid client ID. Please enter a valid number.");
    } catch (Exception ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "An error occurred: " + ex.getMessage());
    }
    }//GEN-LAST:event_jEraseActionPerformed

    private void jCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckActionPerformed
         try {
        // Check if the client ID field is empty
        if (jTextSearch.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter the client ID");
        } else {
            // Parse the client ID
            int clientId = Integer.parseInt(jTextSearch.getText());

            // Get the registry and lookup the service
            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 6000);
            ClientSERVICE service = (ClientSERVICE) registry.lookup("client");

            // Call the service to search for the client
            ClientModel theClient = new ClientModel();
            theClient.setClientId(clientId);
            ClientModel searchClient = service.SearchClient(theClient); // Assuming SearchClient is the correct method
            if (searchClient != null) {
                // Populate the text fields with the client's data
                jTexID.setText(String.valueOf(searchClient.getClientId()));
                jTextName.setText(searchClient.getName());
                jTextEmail.setText(searchClient.getEmail());
                jTextPhone.setText(searchClient.getPhone_number());
                JOptionPane.showMessageDialog(this, "Client found successfull");
            } else {
                JOptionPane.showMessageDialog(this, "Client not found");
            }
        }
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Invalid client ID. Please enter a valid number.");
    } catch (Exception ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "An error occurred: " + ex.getMessage());
    }
    }//GEN-LAST:event_jCheckActionPerformed

    private void jResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jResetActionPerformed
        
        try {
            // Get the list of clients from the service
            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 6000);
            ClientSERVICE service = (ClientSERVICE) registry.lookup("client");
            List<ClientModel> clients = service.Listclient(); 
            

            // Create a DefaultTableModel with the column names
            String[] columnNames = {"Client ID", "Name", "Email", "Phone"};
            DefaultTableModel model = new DefaultTableModel(columnNames, 0);

            // Add each client to the table model
            for (ClientModel client : clients) {
                Object[] rowData = {client.getClientId(), client.getName(), client.getEmail(), client.getPhone_number()};
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
         try {
            // Get the list of clients from the service
            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 6000);
            ClientSERVICE service = (ClientSERVICE) registry.lookup("client");
            List<ClientModel> clients = service.Listclient();

            // Create a file chooser
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Save CSV File");
            fileChooser.setSelectedFile(new File("clients.csv"));
            fileChooser.setFileFilter(new FileNameExtensionFilter("CSV Files", "csv"));

            // Show the dialog
            int userSelection = fileChooser.showSaveDialog(this);

            if (userSelection == JFileChooser.APPROVE_OPTION) {
                File fileToSave = fileChooser.getSelectedFile();

                // Ensure the file has the .csv extension
                String filePath = fileToSave.getAbsolutePath();
                if (!filePath.toLowerCase().endsWith(".csv")) {
                    filePath += ".csv";
                    fileToSave = new File(filePath);
                }

                // Create a FileWriter to write to the selected file
                FileWriter csvWriter = new FileWriter(fileToSave);

                // Write headers
                csvWriter.append("Client ID,Name,Email,Phone\n");

                // Write data
                for (ClientModel client : clients) {
                    csvWriter.append(client.getClientId() + ",");
                    csvWriter.append(client.getName() + ",");
                    csvWriter.append(client.getEmail() + ",");
                    csvWriter.append(client.getPhone_number() + "\n");
                }

                // Close the FileWriter
                csvWriter.flush();
                csvWriter.close();

                JOptionPane.showMessageDialog(this, "CSV generated successfull: " + fileToSave.getAbsolutePath());
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error generating CSV: " + ex.getMessage());
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
            java.util.logging.Logger.getLogger(ClientJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBack;
    private javax.swing.JButton jCheck;
    private javax.swing.JButton jEdit;
    private javax.swing.JButton jErase;
    private javax.swing.JButton jInsert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jPrint;
    private javax.swing.JButton jReset;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableClient;
    private javax.swing.JTextField jTexID;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextName;
    private javax.swing.JTextField jTextPhone;
    private javax.swing.JTextField jTextSearch;
    // End of variables declaration//GEN-END:variables
}
