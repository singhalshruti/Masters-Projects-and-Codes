/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.OrganizationAdmin;

import Business.Business;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Language;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.EnterpriseAdminRole;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class ManageUserAccountsJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Organization organization;
    private Enterprise enterprise;
    private Business business;

    /**
     * Creates new form ManageEnterpriseAdminJPanel
     */
    public ManageUserAccountsJPanel(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, Business business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.business = business;
        
        populateCombo();
        populateTable();

    }

    public void clearFields() {
        txtP.setText("");
        txtUN.setText("");
        lblAvailable.setVisible(false);
    }

    private void populateCombo() {
        cmbEmployee.removeAllItems();
        for (Employee e : organization.getEmployeeDirectory().getEmployeeList()) {
            cmbEmployee.addItem(e);
        }

        cmbRole.removeAllItems();
        for (Role r : organization.getSupportedRole()) {
            cmbRole.addItem(r);
        }
    }

    private void loadScreen() {
        
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblEA.getModel();
        model.setRowCount(0);
        for (UserAccount userAccount : organization.getUserAccountDirectory().getUserAccountList()) {
            Object[] row = new Object[4];
            row[0] = userAccount;
            row[1] = userAccount.getEmployee();
            row[2] = userAccount.getRole();
            model.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblEA = new javax.swing.JTable();
        lblNetworkName = new javax.swing.JLabel();
        lblEnterpriseName = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        cmbEmployee = new javax.swing.JComboBox();
        cmbRole = new javax.swing.JComboBox();
        txtUN = new javax.swing.JTextField();
        txtP = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        lblManageEnterpriseAdmin = new javax.swing.JLabel();
        lblAddAdmin = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        lblAvailableAdmin = new javax.swing.JLabel();
        lblAvailable = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        tblEA.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        tblEA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Employee Name", "Role"
            }
        ));
        tblEA.setSelectionBackground(new java.awt.Color(204, 204, 204));
        tblEA.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tblEA);

        lblNetworkName.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lblNetworkName.setText("Employee");

        lblEnterpriseName.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lblEnterpriseName.setText("Role");

        lblUserName.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lblUserName.setText("Username");

        lblPassword.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lblPassword.setText("Password");

        cmbEmployee.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        cmbEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEmployeeActionPerformed(evt);
            }
        });

        cmbRole.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        txtUN.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        txtUN.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUNFocusLost(evt);
            }
        });

        txtP.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        btnSave.setBackground(new java.awt.Color(255, 255, 255));
        btnSave.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblManageEnterpriseAdmin.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lblManageEnterpriseAdmin.setText("Manage User Accounts");

        lblAddAdmin.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblAddAdmin.setText("Add User Account");

        btnDelete.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblAvailableAdmin.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblAvailableAdmin.setText("User Accounts");

        lblAvailable.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 853, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(lblManageEnterpriseAdmin))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblUserName)
                                            .addComponent(lblEnterpriseName, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblPassword, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addComponent(lblNetworkName))
                                    .addGap(31, 31, 31)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(cmbRole, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cmbEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtUN, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtP, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lblAvailable))
                                .addComponent(lblAddAdmin)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblAvailableAdmin)
                                        .addGap(778, 778, 778)))))))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblManageEnterpriseAdmin)
                .addGap(30, 30, 30)
                .addComponent(lblAddAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNetworkName)
                    .addComponent(cmbEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEnterpriseName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserName)
                    .addComponent(txtUN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAvailable))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAvailableAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDelete)
                .addContainerGap(60, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:        

        String userName = txtUN.getText().trim();
        String password = txtP.getText().trim();

        if (userName.equals("") || password.equals("")) {
            JOptionPane.showMessageDialog(null, "Please specify valid account details.");
            return;
        }

        if (organization.getUserAccountDirectory().isAccountAvailable(userName, business)) {

            Employee e = (Employee) cmbEmployee.getSelectedItem();
            organization.getUserAccountDirectory().createEmployeeUserAccount(userName, password, e, (Role) cmbRole.getSelectedItem());
            populateTable();
            JOptionPane.showMessageDialog(null, "User account created successfully.");
            clearFields();
        } else {
            JOptionPane.showMessageDialog(null, "User name not available. Please specify a unique user user name.");
        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void cmbEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEmployeeActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_cmbEmployeeActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        try {
            int selectedRow = tblEA.getSelectedRow();
            if (selectedRow >= 0) {
                int dialogResult = JOptionPane.showConfirmDialog(null, Language.confirmDelete, "Warning", JOptionPane.YES_NO_OPTION);
                if (dialogResult == JOptionPane.YES_OPTION) {

                    //Enterprise en = (Enterprise) tblEA.getValueAt(selectedRow, 0);
                    organization.getEmployeeDirectory().deleteEmployee(((UserAccount) tblEA.getValueAt(selectedRow, 0)).getEmployee());
                    organization.getUserAccountDirectory().deleteUserAccount((UserAccount) tblEA.getValueAt(selectedRow, 0));
                    JOptionPane.showMessageDialog(null, Language.successDelete);
                    populateTable();
                }
            } else {
                JOptionPane.showMessageDialog(null, Language.selectEntry);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, Language.fail);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtUNFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUNFocusLost
        // TODO add your handling code here:
        if (txtUN.getText().trim().length() > 0) {
            if (organization.getUserAccountDirectory().isAccountAvailable(txtUN.getText().trim(), business)) {
                lblAvailable.setText("Available");
                lblAvailable.setVisible(true);
                lblAvailable.setForeground(Color.GREEN);
            } else {
                lblAvailable.setText("Not Available");
                lblAvailable.setVisible(true);
                lblAvailable.setForeground(Color.RED);
            }
        }
    }//GEN-LAST:event_txtUNFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox cmbEmployee;
    private javax.swing.JComboBox cmbRole;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddAdmin;
    private javax.swing.JLabel lblAvailable;
    private javax.swing.JLabel lblAvailableAdmin;
    private javax.swing.JLabel lblEnterpriseName;
    private javax.swing.JLabel lblManageEnterpriseAdmin;
    private javax.swing.JLabel lblNetworkName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JTable tblEA;
    private javax.swing.JTextField txtP;
    private javax.swing.JTextField txtUN;
    // End of variables declaration//GEN-END:variables
}