
package UI;
import Education.EducationMainJPanel;
import Employment.EmployementMainJPanel;
import Entertainment.EntertainmentMainJPanel;
import Healtcare.HealthcareMainJPanel;
import java.sql.Connection;
/**
 *
 * @author Ruthvik Garlapati
 */
public class UserLandingJPanel extends javax.swing.JPanel {
    Connection connection;
    String user;
       private static final int MIN_ZOOM = 0;
 private static final int MAX_ZOOM = 21;
 private static int zoomValue = 5;
    public UserLandingJPanel(Connection connection,String user) {
        initComponents();
        this.connection = connection;
        this.user = user;
        UsernameLbl.setText(user);
        TabbedPane.add("Profile",new UserProfileJPanel());
        TabbedPane.add("Analytics",new UserAnalyticsDashboard());
       TabbedPane.add("Education",new EducationMainJPanel());
       TabbedPane.add("Employment",new EmployementMainJPanel());
       TabbedPane.add("Entertainment",new EntertainmentMainJPanel(connection,user));
       TabbedPane.add("Healthcare",new HealthcareMainJPanel());
    }

    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TabbedPane = new javax.swing.JTabbedPane();
        LogoutLbl = new javax.swing.JLabel();
        UsernameLbl = new javax.swing.JLabel();
        hilbl = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1080, 650));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TabbedPane.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        add(TabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1200, 630));

        LogoutLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-logout-rounded-50.png"))); // NOI18N
        add(LogoutLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 10, -1, -1));

        UsernameLbl.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        add(UsernameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 260, -1));

        hilbl.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        hilbl.setText("Hi..");
        add(hilbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LogoutLbl;
    private javax.swing.JTabbedPane TabbedPane;
    private javax.swing.JLabel UsernameLbl;
    private javax.swing.JLabel hilbl;
    // End of variables declaration//GEN-END:variables
}
