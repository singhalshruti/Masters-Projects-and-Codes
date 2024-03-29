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
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class ManageEmployeeJPanel extends javax.swing.JPanel {

    private Enterprise enterprise;
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Organization organization;
    private Business business;

    /**
     * Creates new form ManageEmployeeJPanel
     */
    public ManageEmployeeJPanel(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, Business business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.organization = organization;
        this.enterprise = enterprise;
        this.business = business;
        
        populateTable();
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblEmployees.getModel();
        model.setRowCount(0);
        String address1;
        String address2;
        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()) {
            Object[] row = new Object[9];
            row[0] = employee;
            row[1] = employee.getId();
            address1 = employee.getContactDetails().getStreetAddressLine1();
            address2 = employee.getContactDetails().getStreetAddressLine2();
            row[2] = ((address1 != null )? address1: "") + " " + ((address2 != null)? address2 :"");
            row[3] = employee.getContactDetails().getCity();
            row[4] = employee.getContactDetails().getState();
            row[5] = employee.getContactDetails().getZip();
            row[6] = employee.getContactDetails().getEmail();
            row[7] = employee.getContactDetails().getCellPhoneNo();
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

        lblManageEmployee = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployees = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        lblManageEmployee.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lblManageEmployee.setText("Manage Employees");

        tblEmployees.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        tblEmployees.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee Name", "Employee ID", "Role", "Address", "City", "State", "Zip", "Email", "Cell Phone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEmployees.setSelectionBackground(new java.awt.Color(204, 204, 204));
        tblEmployees.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tblEmployees);

        btnDelete.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnView.setBackground(new java.awt.Color(255, 255, 255));
        btnView.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(255, 255, 255));
        btnAdd.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lblManageEmployee))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 944, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblManageEmployee)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnAdd)
                    .addComponent(btnView))
                .addContainerGap(224, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        try {
            int selectedRow = tblEmployees.getSelectedRow();
            if (selectedRow >= 0) {
                int dialogResult = JOptionPane.showConfirmDialog(null, Language.confirmDelete, "Warning", JOptionPane.YES_NO_OPTION);
                if (dialogResult == JOptionPane.YES_OPTION) {

                    Employee employee = (Employee) tblEmployees.getValueAt(selectedRow, 0);
                    organization.getEmployeeDirectory().deleteEmployee(employee);
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

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        try {
            int selectedRow = tblEmployees.getSelectedRow();
            if (selectedRow >= 0) {
                ViewEmployeeJPanel viewEmployeeJPanel = new ViewEmployeeJPanel((Employee) tblEmployees.getValueAt(selectedRow, 0), this);
                userProcessContainer.add("viewEmployeeJPanel", viewEmployeeJPanel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            } else {
                JOptionPane.showMessageDialog(null, Language.selectEntry);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Unable to load details.");
        }
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        AddEmployeeJPanel addEmployeeJPanel = new AddEmployeeJPanel(userProcessContainer, userAccount, organization, enterprise, business, this);
        userProcessContainer.add("manageEmployeeJPanel", addEmployeeJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnView;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblManageEmployee;
    private javax.swing.JTable tblEmployees;
    // End of variables declaration//GEN-END:variables
}
