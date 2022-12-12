
package UI;

import Directories.UserCoordinatesDirectory;
import SystemAdmin.MapsFrame;
import javax.swing.JFrame;
import model.UserCoordinates;

/**
 *
 * @author Ruthvik Garlapati
 */
public class UserProfileJPanel extends javax.swing.JPanel {

 String user;
 UserCoordinatesDirectory cord;
 UserCoordinates newOne;
    public UserProfileJPanel(UserCoordinatesDirectory cord,String  user) {
        initComponents();
        this.cord = cord;
        this.user = user;
        newOne = cord.addNew();
        newOne.setUsername(user);
    }
    
    
    
   

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        Fname = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Lname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        EmailFld = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Phone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        EmailFld2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Gender = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        Address = new javax.swing.JTextField();
        Nationality1 = new javax.swing.JTextField();
        coordinates = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        SetLocation = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel2.setText("Update Profile!!");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 290, -1));
        add(Fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 123, 284, 42));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setText("First Name :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 135, 100, -1));
        add(Lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 183, 284, 42));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("Last Name :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 195, -1, -1));

        EmailFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailFldActionPerformed(evt);
            }
        });
        add(EmailFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 243, 284, 42));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("Email :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 255, -1, -1));

        Phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneActionPerformed(evt);
            }
        });
        add(Phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 363, 284, 42));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setText("Passport :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 315, -1, -1));

        EmailFld2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailFld2ActionPerformed(evt);
            }
        });
        add(EmailFld2, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 303, 284, 42));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setText("Phone :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 375, -1, -1));

        Gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Please Select-", "Male", "Female", "Others" }));
        add(Gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(682, 126, 139, 42));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setText("Gender :");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(594, 138, -1, -1));

        Address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddressActionPerformed(evt);
            }
        });
        add(Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(682, 240, 284, 42));

        Nationality1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nationality1ActionPerformed(evt);
            }
        });
        add(Nationality1, new org.netbeans.lib.awtextra.AbsoluteConstraints(682, 186, 284, 42));

        coordinates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coordinatesActionPerformed(evt);
            }
        });
        add(coordinates, new org.netbeans.lib.awtextra.AbsoluteConstraints(682, 300, 284, 42));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        jLabel8.setText("Nationality :");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(575, 198, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 51));
        jLabel9.setText("Address :");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(589, 252, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 51, 51));
        jLabel10.setText("Co-Ordinates :");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 312, -1, -1));

        SetLocation.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        SetLocation.setText("Set on map");
        SetLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetLocationActionPerformed(evt);
            }
        });
        add(SetLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(682, 360, 140, 40));

        UpdateButton.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        UpdateButton.setText("Update");
        add(UpdateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, 167, 49));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/upd.png"))); // NOI18N
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, -10, 1000, 590));
    }// </editor-fold>//GEN-END:initComponents

    private void EmailFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailFldActionPerformed

    private void PhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneActionPerformed

    private void EmailFld2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailFld2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailFld2ActionPerformed

    private void AddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddressActionPerformed

    private void Nationality1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nationality1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nationality1ActionPerformed

    private void coordinatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coordinatesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coordinatesActionPerformed

    public void setCoordinates(){
     System.out.println("dcsdcas");
    }
    private void SetLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetLocationActionPerformed
MapsFrame frame  = new MapsFrame(newOne);
 frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setVisible(true);
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent){
               coordinates.setText(newOne.getLat()+","+newOne.getLon());
            }
        });
        
        // TODO add your handling code here:
    }//GEN-LAST:event_SetLocationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Address;
    private javax.swing.JTextField EmailFld;
    private javax.swing.JTextField EmailFld2;
    private javax.swing.JTextField Fname;
    private javax.swing.JComboBox<String> Gender;
    private javax.swing.JTextField Lname;
    private javax.swing.JTextField Nationality1;
    private javax.swing.JTextField Phone;
    private javax.swing.JButton SetLocation;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JTextField coordinates;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
