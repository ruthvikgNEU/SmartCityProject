
package SystemAdmin;


import Directories.UserDirectory;
import java.awt.HeadlessException;
import java.sql.*;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
public class CreateAdminsPanel extends javax.swing.JPanel {


    Connection connection;
    UserDirectory userDir;
    String fname,lname,uname,email,role,pass,cnfpass;
    public CreateAdminsPanel(Connection connection,UserDirectory userDir) {
        initComponents();
        this.connection = connection;
        this.userDir = userDir;
        populateAdmins();
        GreenTick.setVisible(false);
        RedTick.setVisible(false);
        UsernameGreenTick.setVisible(false);
        UsernameRedTick.setVisible(false);
        ConfPasswordListener();
        UsernameListener();
    }
    
    private void populateAdmins(){
         DefaultTableModel model = (DefaultTableModel) UserData.getModel();
          try{
              ResultSet rs = userDir.getAdminsData();
              model.setRowCount(0);
               Object row[] = new Object[6];
      while(rs.next()) {
            row[0] = rs.getString("user_id");
            row[1] = rs.getString("firstname");
            row[2] = rs.getString("lastname");
            row[3] = rs.getString("username");
            row[4] = rs.getString("email");
              row[5] = rs.getString("role");
            model.addRow(row);
            }
          }
          catch(Exception e){
              System.out.println(e);
          }
    }
    
    
     private void UsernameListener(){
    DocumentListener documentListener = new DocumentListener() {
      @Override
      public void changedUpdate(DocumentEvent documentEvent) {
         if(!UsernameExists(UName.getText()) && UName.getText().length() > 8){
            UsernameGreenTick.setVisible(true);
            UsernameRedTick.setVisible(false);
          }else{
              UsernameRedTick.setVisible(true);
              UsernameGreenTick.setVisible(false);
          }
      }
      @Override
      public void insertUpdate(DocumentEvent documentEvent) {
          
          if(!UsernameExists(UName.getText()) && UName.getText().length() > 8){
            UsernameGreenTick.setVisible(true);
            UsernameRedTick.setVisible(false);
          }else{
              UsernameRedTick.setVisible(true);
              UsernameGreenTick.setVisible(false);
          }
      }
      @Override
      public void removeUpdate(DocumentEvent documentEvent) {
           if(!UsernameExists(UName.getText()) && UName.getText().length() > 8){
            UsernameGreenTick.setVisible(true);
            UsernameRedTick.setVisible(false);
          }else{
              UsernameRedTick.setVisible(true);
              UsernameGreenTick.setVisible(false);
          }
      }
    };
    UName.getDocument().addDocumentListener(documentListener);
}
     
     private boolean matchpasswords(){
         String pass = String.valueOf(password.getPassword());
         String cnfpass = String.valueOf(cnfpassword.getPassword());
         return pass.equals(cnfpass);
     }
    private void ConfPasswordListener(){
    DocumentListener documentListener = new DocumentListener() {
      @Override
      public void changedUpdate(DocumentEvent documentEvent) {
         if(matchpasswords()){
            GreenTick.setVisible(true);
            RedTick.setVisible(false);
          }else{
              RedTick.setVisible(true);
              GreenTick.setVisible(false);
          }
      }
      @Override
      public void insertUpdate(DocumentEvent documentEvent) {
          
          if(matchpasswords()){
            GreenTick.setVisible(true);
            RedTick.setVisible(false);
          }else{
              RedTick.setVisible(true);
              GreenTick.setVisible(false);
          }
      }
      @Override
      public void removeUpdate(DocumentEvent documentEvent) {
           if(matchpasswords()){
            GreenTick.setVisible(true);
            RedTick.setVisible(false);
          }else{
              RedTick.setVisible(true);
              GreenTick.setVisible(false);
          }
      }
    };
    cnfpassword.getDocument().addDocumentListener(documentListener);
}
 public boolean UsernameExists(String username){
     try {
                    PreparedStatement st = (PreparedStatement)connection.prepareStatement("Select username from users");
                    ResultSet rs = st.executeQuery();
                    while (rs.next()) {
                        System.out.println(username + "   "+rs.getString(1));
                        if(rs.getString(1).equals(username))
                            return true;
                    }
                } catch (HeadlessException | SQLException sqlException) {
                    sqlException.printStackTrace();
                } 
     return false;
 }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        UserData = new javax.swing.JTable();
        FName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        LName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        UName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        emailfld = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rolefld = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        cnfpassword = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        CreateButton = new javax.swing.JButton();
        GreenTick = new javax.swing.JLabel();
        RedTick = new javax.swing.JLabel();
        UsernameGreenTick = new javax.swing.JLabel();
        UsernameRedTick = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        jLabel2.setText("Create Admins!!");

        UserData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "User Id", "FirstName", "LastName", "Username", "Email", "Role"
            }
        ));
        jScrollPane1.setViewportView(UserData);

        jLabel1.setText("FirstName :");

        jLabel3.setText("LastName :");

        jLabel4.setText("Username :");

        jLabel5.setText("Email :");

        rolefld.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "mcreator", "tcreator", "ucreator", "ccreator", "compcreator", "jobscreator", "gadmin", "censoradmin", "cityadmin", "courseregadmin" }));

        jLabel6.setText("Role :");

        jLabel7.setText("Password :");

        jLabel8.setText("Confirm Password :");

        CreateButton.setText("Create");
        CreateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateButtonActionPerformed(evt);
            }
        });

        GreenTick.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-approval-25.png"))); // NOI18N

        RedTick.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-cross-mark-25.png"))); // NOI18N

        UsernameGreenTick.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-approval-25.png"))); // NOI18N

        UsernameRedTick.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-cross-mark-25.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 940, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(356, 356, 356)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(FName, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(216, 216, 216)
                                    .addComponent(jLabel6))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(LName, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(UName, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(UsernameGreenTick, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(UsernameRedTick)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8)))
                            .addComponent(emailfld, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rolefld, 0, 207, Short.MAX_VALUE)
                            .addComponent(password)
                            .addComponent(cnfpassword)
                            .addComponent(CreateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(GreenTick, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RedTick)))
                .addContainerGap(211, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(rolefld, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(GreenTick, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(cnfpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(RedTick)
                            .addComponent(UsernameGreenTick)))
                    .addComponent(UsernameRedTick))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailfld, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(CreateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(86, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CreateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateButtonActionPerformed

        fname = FName.getText();
        lname = LName.getText();
        uname = UName.getText();
        email = emailfld.getText();
        role = rolefld.getSelectedItem().toString();
        pass = password.getPassword().toString();
        cnfpass = cnfpassword.getPassword().toString();
        userDir.addAdmin(fname, lname, uname, pass, email, role);
        JOptionPane.showMessageDialog(this, "User Added.");
        populateAdmins();
        // TODO add your handling code here:
    }//GEN-LAST:event_CreateButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateButton;
    private javax.swing.JTextField FName;
    private javax.swing.JLabel GreenTick;
    private javax.swing.JTextField LName;
    private javax.swing.JLabel RedTick;
    private javax.swing.JTextField UName;
    private javax.swing.JTable UserData;
    private javax.swing.JLabel UsernameGreenTick;
    private javax.swing.JLabel UsernameRedTick;
    private javax.swing.JPasswordField cnfpassword;
    private javax.swing.JTextField emailfld;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField password;
    private javax.swing.JComboBox<String> rolefld;
    // End of variables declaration//GEN-END:variables
}
