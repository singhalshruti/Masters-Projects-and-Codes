/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CustomerService;

import Business.Business;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Language;
import Business.Organization.CustomerServiceOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.CustomerServiceRequest;
import Business.WorkQueue.WorkRequest;
import java.text.SimpleDateFormat;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class ManageRequestsJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private Business business;
    private UserAccount userAccount;
    private Organization organization;

    /**
     * Creates new form ManageRequestsJPanel
     */
    public ManageRequestsJPanel(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, Business business) {

        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.organization = organization;
        this.business = business;
        this.enterprise = enterprise;

        loadScreen();
        populateTable();

    }

    private void loadScreen() {

        cmbRequestStatus.removeAllItems();
        cmbRequestType.removeAllItems();
        cmbRequestStatus.addItem(WorkRequest.OrderStatus.Processing);
        cmbRequestStatus.addItem(WorkRequest.OrderStatus.Review);
        cmbRequestStatus.addItem(WorkRequest.OrderStatus.Approved);
        cmbRequestType.addItem("All");
        cmbRequestType.addItem(CustomerServiceRequest.CustomerServiceCategory.CancelRequest);
        cmbRequestType.addItem(CustomerServiceRequest.CustomerServiceCategory.OtherRequests);

    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblRequests.getModel();
        model.setRowCount(0);
        try {
            for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
                if (o instanceof CustomerServiceOrganization) {
                    for (WorkRequest wr : o.getWorkQueue().getWorkRequestList()) {
                        if (wr instanceof CustomerServiceRequest) {
                            if (String.valueOf(cmbRequestType.getSelectedItem()).equalsIgnoreCase("All")
                                    || ((CustomerServiceRequest) wr).getRequestType().equalsIgnoreCase(String.valueOf(cmbRequestType.getSelectedItem()))) {
                                if (wr.getStatus().equalsIgnoreCase(String.valueOf(cmbRequestStatus.getSelectedItem()))) {
                                    Object[] row = new Object[5];
                                    row[0] = wr;
                                    row[1] = wr.getSender();
                                    row[2] = ((wr.getReceiver() == null) ? " " : wr.getReceiver());
                                    row[3] = ((CustomerServiceRequest) wr).getRequest();
                                    row[4] = wr.getComments();
                                    model.addRow(row);
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, Language.fail);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblManagePatients = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRequests = new javax.swing.JTable();
        lblCategory1 = new javax.swing.JLabel();
        cmbRequestStatus = new javax.swing.JComboBox();
        btnRespond = new javax.swing.JButton();
        lblCategory2 = new javax.swing.JLabel();
        cmbRequestType = new javax.swing.JComboBox();
        btnAssign = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        lblManagePatients.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lblManagePatients.setText("Manage Customer Service Requests");

        tblRequests.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        tblRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request ID", "Customer", "Assigned To", "Description", "Comments"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRequests.setSelectionBackground(new java.awt.Color(204, 204, 204));
        tblRequests.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tblRequests);

        lblCategory1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lblCategory1.setText("Request Status");

        cmbRequestStatus.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        cmbRequestStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Processing" }));
        cmbRequestStatus.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbRequestStatusItemStateChanged(evt);
            }
        });
        cmbRequestStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRequestStatus(evt);
            }
        });

        btnRespond.setBackground(new java.awt.Color(255, 255, 255));
        btnRespond.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        btnRespond.setText("Respond");
        btnRespond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRespondActionPerformed(evt);
            }
        });

        lblCategory2.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lblCategory2.setText("Request Type");

        cmbRequestType.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        cmbRequestType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cancel Requests", "Others" }));
        cmbRequestType.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbRequestTypeItemStateChanged(evt);
            }
        });
        cmbRequestType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRequestType(evt);
            }
        });

        btnAssign.setBackground(new java.awt.Color(255, 255, 255));
        btnAssign.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        btnAssign.setText("Assign to me");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblManagePatients)
                .addGap(0, 655, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 992, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCategory2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbRequestType, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCategory1)
                                .addGap(33, 33, 33)
                                .addComponent(cmbRequestStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAssign)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRespond)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblManagePatients)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCategory1)
                    .addComponent(cmbRequestStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCategory2)
                    .addComponent(cmbRequestType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAssign)
                    .addComponent(btnRespond))
                .addContainerGap(224, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void populateFareRequestTable() {

    }


    private void jXDatePicker1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXDatePicker1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jXDatePicker1ActionPerformed

    private void cmbRequestStatus(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRequestStatus
        // TODO add your handling code here:
        populateTable();

    }//GEN-LAST:event_cmbRequestStatus

    private void showControls() {
        btnAssign.setEnabled(true);
        btnRespond.setEnabled(true);
    }

    private void hideControls() {
        btnAssign.setEnabled(false);
        btnRespond.setEnabled(false);
    }

    private void sendEmail(String request, String response, String email) {
        // TODO add your handling code here:

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");

        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
                    public PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication("shrutisinghal.nmims@gmail.com", "irok10790");
                    }
                });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("shrutisinghal.nmims@gmail.com"));

            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email));
            message.setSubject("OneAir Customer Support");
            //String emailMessage = jTextArea1.getText();
            message.setText("Thank you for contacting one air customer support.\nYour Request:" + request + "\nResponse:"
                    + response + "\n\nPlease contact OneAir customer suppport if you need additional information.");
            Transport.send(message);
            JOptionPane.showMessageDialog(null, "Customer has been notified with your response.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return;
        }
    }

    private void btnRespondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRespondActionPerformed
        // TODO add your handling code here:
        try {
            int selectedRow = tblRequests.getSelectedRow();
            if (selectedRow >= 0) {
                String comments = String.valueOf(tblRequests.getValueAt(selectedRow, 4)).trim();
                if (comments.length() <= 0) {
                    JOptionPane.showMessageDialog(null, "Please enter valid comments");
                    return;
                }

                CustomerServiceRequest fr = (CustomerServiceRequest) tblRequests.getValueAt(selectedRow, 0);
                fr.setComments(comments);
                fr.setReceiver(userAccount);
                fr.setStatus(WorkRequest.OrderStatus.Approved.getValue());
                JOptionPane.showMessageDialog(null, "Record updated successfully.");
                populateTable();
                String em = fr.getSender().getCustomer().getPerson().getContactDetails().getEmail();
                sendEmail(fr.getRequest(), comments, em);
            } else {
                JOptionPane.showMessageDialog(null, "Please select an entry from the table");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, Language.selectEntry);
        }

    }//GEN-LAST:event_btnRespondActionPerformed


    private void cmbRequestType(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRequestType
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_cmbRequestType

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        int selectedRow = tblRequests.getSelectedRow();
        if (selectedRow >= 0) {
            CustomerServiceRequest csr = (CustomerServiceRequest) tblRequests.getValueAt(selectedRow, 0);
            csr.setReceiver(userAccount);
            csr.setStatus((WorkRequest.OrderStatus.Review.getValue()));
            populateTable();
        } else {
            JOptionPane.showMessageDialog(null, "Unable to assign");
        }
    }//GEN-LAST:event_btnAssignActionPerformed

    private void cmbRequestTypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbRequestTypeItemStateChanged
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_cmbRequestTypeItemStateChanged

    private void cmbRequestStatusItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbRequestStatusItemStateChanged
        // TODO add your handling code here:
        if (String.valueOf(cmbRequestStatus.getSelectedItem()).equalsIgnoreCase("Approved")) {
            hideControls();
        } else {
            showControls();
        }
        populateTable();

    }//GEN-LAST:event_cmbRequestStatusItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnRespond;
    private javax.swing.JComboBox cmbRequestStatus;
    private javax.swing.JComboBox cmbRequestType;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCategory1;
    private javax.swing.JLabel lblCategory2;
    private javax.swing.JLabel lblManagePatients;
    private javax.swing.JTable tblRequests;
    // End of variables declaration//GEN-END:variables
}
