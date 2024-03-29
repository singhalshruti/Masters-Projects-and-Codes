/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import profile.Person;
import javax.swing.JOptionPane;
/**
 *
 * @author Rakesh
 */
public class CreateJPanel extends javax.swing.JPanel {
    
    private Person person;

    /**
     * Creates new form CreateJPanel
     */
    public CreateJPanel(Person person) {
        initComponents();
        this.person=person;
        
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
        jLabel4 = new javax.swing.JLabel();
        firstNameField = new javax.swing.JTextField();
        lastNameField = new javax.swing.JTextField();
        middleNameField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        dateOfBirthField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        streetAddressField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        townField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        zipCodeField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        occupationField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        emailAddressField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        areaCodeField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        phoneNumberField = new javax.swing.JTextField();
        createPerson = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Create Profile");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 75, -1));

        jLabel2.setText("First Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jLabel3.setText("Last Name");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 31, -1, -1));

        jLabel4.setText("Middle Name");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 31, -1, -1));
        add(firstNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 51, 100, 30));

        lastNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameFieldActionPerformed(evt);
            }
        });
        add(lastNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 51, 100, 30));

        middleNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                middleNameFieldActionPerformed(evt);
            }
        });
        add(middleNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 51, 120, 30));

        jLabel5.setText("Date Of Birth (YYYY/MM/DD)");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 160, 30));

        dateOfBirthField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateOfBirthFieldActionPerformed(evt);
            }
        });
        add(dateOfBirthField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 170, 30));

        jLabel6.setText("Street Address");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 81, 30));
        add(streetAddressField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 260, 30));

        jLabel7.setText("Town");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 34, 30));
        add(townField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 113, 30));

        jLabel8.setText("Zip Code");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 50, 30));
        add(zipCodeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 110, 30));

        jLabel9.setText("Occupation");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 70, 30));
        add(occupationField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 160, 30));

        jLabel10.setText("Email Address");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 100, 30));

        emailAddressField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailAddressFieldActionPerformed(evt);
            }
        });
        add(emailAddressField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 210, 30));

        jLabel11.setText("Area Code of Phone Number");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 150, 20));

        areaCodeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaCodeFieldActionPerformed(evt);
            }
        });
        add(areaCodeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 70, 30));

        jLabel12.setText("Phone Number");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 99, -1));

        phoneNumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumberFieldActionPerformed(evt);
            }
        });
        add(phoneNumberField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 170, 30));

        createPerson.setText("Create");
        createPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPersonActionPerformed(evt);
            }
        });
        add(createPerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void middleNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_middleNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_middleNameFieldActionPerformed

    private void lastNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameFieldActionPerformed

    private void emailAddressFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailAddressFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailAddressFieldActionPerformed

    private void phoneNumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumberFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNumberFieldActionPerformed

    private void createPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPersonActionPerformed
        if 
            (firstNameField.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Value has not been entered ", "Error",JOptionPane.PLAIN_MESSAGE);
        }
        else {
            person.setFirstName(firstNameField.getText());
       
            if (lastNameField.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Value has not been entered ", "Error",JOptionPane.PLAIN_MESSAGE);
            }
            else
            {
                person.setLastName(lastNameField.getText());
            if (middleNameField.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Value has not been entered ", "Error",JOptionPane.PLAIN_MESSAGE);
            }
            else{
                person.setMiddleName(middleNameField.getText());
            if(dateOfBirthField.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Value has not been entered ", "Error",JOptionPane.PLAIN_MESSAGE);
            }
            else{
                person.setDateOfBirth(dateOfBirthField.getText());
                if(streetAddressField.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Value has not been entered ", "Error",JOptionPane.PLAIN_MESSAGE);
                }
                else{
                     person.setStreetAddress(streetAddressField.getText());
                     if(townField.getText().equals(""))
                     {
                         JOptionPane.showMessageDialog(null, "Value has not been entered ", "Error",JOptionPane.PLAIN_MESSAGE);
                     }
                        else
                     {
                        person.setTown(townField.getText());
                     if(zipCodeField.getText().equals(""))
                     {
                         JOptionPane.showMessageDialog(null, "Value has not been entered ", "Error",JOptionPane.PLAIN_MESSAGE);
                     }
                     else
                     {
                      person.setZipCode(zipCodeField.getText());
                      if(occupationField.getText().equals(""))
                      {
                          JOptionPane.showMessageDialog(null, "Value has not been entered ", "Error",JOptionPane.PLAIN_MESSAGE);
                      }
                      else{
                          person.setOccupation(occupationField.getText());
                      if(emailAddressField.getText().equals(""))
                      {
                          JOptionPane.showMessageDialog(null, "Value has not been entered ", "Error",JOptionPane.PLAIN_MESSAGE);
                      }
                      else{
                          person.setEmailAddress(emailAddressField.getText());
                      if(areaCodeField.getText().equals(""))
                      {
                          JOptionPane.showMessageDialog(null, "Value has not been entered ", "Error",JOptionPane.PLAIN_MESSAGE);
                      }
                      else{
                          person.setAreaCode(areaCodeField.getText());
                      if(phoneNumberField.getText().equals(""))
                      {
                          JOptionPane.showMessageDialog(null, "Value has not been entered ", "Error",JOptionPane.PLAIN_MESSAGE);
                      } else
                      { 
                          person.setPhoneNumber(phoneNumberField.getText());
                                
        JOptionPane.showMessageDialog(null, "This product has been created successfully ", "Success",JOptionPane.PLAIN_MESSAGE);
// TODO add your handling code here:
    }//GEN-LAST:event_createPersonActionPerformed
    }
                      }
                     }
                     }
                }
            }
            }
            }
        }
    }
}

    private void areaCodeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaCodeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_areaCodeFieldActionPerformed

    private void dateOfBirthFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateOfBirthFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateOfBirthFieldActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField areaCodeField;
    private javax.swing.JButton createPerson;
    private javax.swing.JTextField dateOfBirthField;
    private javax.swing.JTextField emailAddressField;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JTextField middleNameField;
    private javax.swing.JTextField occupationField;
    private javax.swing.JTextField phoneNumberField;
    private javax.swing.JTextField streetAddressField;
    private javax.swing.JTextField townField;
    private javax.swing.JTextField zipCodeField;
    // End of variables declaration//GEN-END:variables
}
