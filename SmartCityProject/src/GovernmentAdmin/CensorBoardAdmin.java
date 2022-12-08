package GovernmentAdmin;

import Directories.CensorDirectory;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import smartcityproject.MainJFrame;
import java.sql.Connection;
import javax.swing.JOptionPane;
public class CensorBoardAdmin extends javax.swing.JFrame {
Connection connection;
CensorDirectory cenDir;
    public CensorBoardAdmin(Connection connection,CensorDirectory cenDir) {
        this.connection = connection;
        this.cenDir = cenDir;
        initComponents();
        populateApplications();
        populateNextApplication();
    }

    private CensorBoardAdmin() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void populateApplications(){
         DefaultTableModel model = (DefaultTableModel) ApplicationsTable.getModel();
          try{
              ResultSet rs = cenDir.getAllApplications();
              model.setRowCount(0);
      while(rs.next()) {
            Object row[] = new Object[8];
            row[0] = rs.getString(1);
            row[1] = rs.getString(2);
            row[2] = rs.getString(3);
            row[3] = rs.getString(4);
            row[4] = rs.getString(5);
              row[5] = rs.getString(6);
            row[6] = rs.getString(7);
            row[7] = rs.getString(8);
            model.addRow(row);
        }
          }
          catch(Exception e){
              System.out.println(e);
          }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        LogoutButton = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ApplicationsTable = new javax.swing.JTable();
        PlayMovie = new javax.swing.JButton();
        AppStatusDropDown = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        MovieStatusDropDown = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        NameLbl = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        DirectorLbl = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        StudioLbl = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        AppliedDateLbl = new javax.swing.JLabel();
        ApplicationdLbl = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setText("Censor Board Panel");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, -1, -1));

        LogoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-logout-rounded-70.png"))); // NOI18N
        LogoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutButtonMouseClicked(evt);
            }
        });
        getContentPane().add(LogoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1005, 16, -1, -1));

        ApplicationsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Application Id", "Name", "Director", "Producer/Studio", "Application Status", "Movie Status", "Applied Date", "Url"
            }
        ));
        jScrollPane1.setViewportView(ApplicationsTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 115, 988, 211));

        PlayMovie.setBackground(new java.awt.Color(0, 153, 153));
        PlayMovie.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        PlayMovie.setText("Play Movie");
        PlayMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayMovieActionPerformed(evt);
            }
        });
        getContentPane().add(PlayMovie, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 207, 37));

        AppStatusDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Pending", "Rejected", "Approved" }));
        getContentPane().add(AppStatusDropDown, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 417, 220, 37));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Application Status :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 426, -1, -1));

        jButton3.setText("Update");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, -1, -1));

        MovieStatusDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "In-appropriate Content", "U/A", "Adult(18+)", "Kids" }));
        getContentPane().add(MovieStatusDropDown, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 490, 220, 37));

        jButton4.setText("Update");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 490, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Movie Status :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 499, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Next Application :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 350, 205, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Name :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(821, 436, -1, -1));

        NameLbl.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        NameLbl.setForeground(new java.awt.Color(255, 255, 255));
        NameLbl.setText("N/A");
        getContentPane().add(NameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(881, 436, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Director :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(809, 466, -1, -1));

        DirectorLbl.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        DirectorLbl.setForeground(new java.awt.Color(255, 255, 255));
        DirectorLbl.setText("N/A");
        getContentPane().add(DirectorLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(881, 466, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Studio/Producer :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(761, 499, -1, -1));

        StudioLbl.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        StudioLbl.setForeground(new java.awt.Color(255, 255, 255));
        StudioLbl.setText("N/A");
        getContentPane().add(StudioLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(881, 499, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Applied Date :");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 533, -1, -1));

        AppliedDateLbl.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        AppliedDateLbl.setForeground(new java.awt.Color(255, 255, 255));
        AppliedDateLbl.setText("N/A");
        getContentPane().add(AppliedDateLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(881, 533, -1, -1));

        ApplicationdLbl.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        ApplicationdLbl.setForeground(new java.awt.Color(255, 255, 255));
        ApplicationdLbl.setText("N/A");
        getContentPane().add(ApplicationdLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(881, 406, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Application Id :");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(776, 406, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cinema-come-è-cambiato.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -2, 1100, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutButtonMouseClicked
        MainJFrame frame  = new MainJFrame();
frame.setVisible(true);
dispose();
    }//GEN-LAST:event_LogoutButtonMouseClicked

    private void PlayMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayMovieActionPerformed
int index1 = ApplicationsTable.getSelectedRow();
        if (index1 < 0) {
            JOptionPane.showMessageDialog(this, "Please select a movie to play....!");
            return;
        }
         DefaultTableModel model2 = (DefaultTableModel) ApplicationsTable.getModel();
        String url  = String.valueOf(model2.getValueAt(index1, 7));
        MovieVideoPanel frame = new MovieVideoPanel(url);
        frame.setVisible(true);
    }//GEN-LAST:event_PlayMovieActionPerformed

    private void populateNextApplication(){
         ResultSet rs = cenDir.populateNextApplications();
         try{
         if(rs.next()){
             ApplicationdLbl.setText(rs.getString(1));
             NameLbl.setText(rs.getString(2));
             DirectorLbl.setText(rs.getString(3));
             StudioLbl.setText(rs.getString(4));
             AppliedDateLbl.setText(rs.getString(7));
         }else{
              ApplicationdLbl.setText("N/A");
             NameLbl.setText("N/A");
             DirectorLbl.setText("N/A");
             StudioLbl.setText("N/A");
             AppliedDateLbl.setText("N/A");
         }
         }catch(Exception e){
             
         }
    }
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(() -> {
            new CensorBoardAdmin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AppStatusDropDown;
    private javax.swing.JLabel ApplicationdLbl;
    private javax.swing.JTable ApplicationsTable;
    private javax.swing.JLabel AppliedDateLbl;
    private javax.swing.JLabel DirectorLbl;
    private javax.swing.JLabel LogoutButton;
    private javax.swing.JComboBox<String> MovieStatusDropDown;
    private javax.swing.JLabel NameLbl;
    private javax.swing.JButton PlayMovie;
    private javax.swing.JLabel StudioLbl;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
