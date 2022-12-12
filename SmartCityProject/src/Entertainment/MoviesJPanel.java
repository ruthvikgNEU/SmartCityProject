/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Entertainment;
import java.awt.HeadlessException;
import java.sql.*;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class MoviesJPanel extends javax.swing.JPanel {
    Connection c;
    String user;
    public MoviesJPanel(Connection c,String user) {
        initComponents();
        this.c = c;
        this.user = user;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        TheatreDropDown = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        MoviesDropDown = new javax.swing.JComboBox<>();
        ShowsDropDown = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TicketsDropDown = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        bookButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        dateTxt = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 65)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 51, 255));
        jLabel2.setText("Welcome to the Movies Dashboard! ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1030, -1));

        TheatreDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        TheatreDropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TheatreDropDownActionPerformed(evt);
            }
        });
        jPanel1.add(TheatreDropDown, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 150, 30));

        jTable1.setBackground(new java.awt.Color(204, 204, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Theatre", "Movie", "Show", "Date", "No_of_Seats"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 660, 210));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 255));
        jLabel1.setText("Your Bookings :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, -1, -1));

        MoviesDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", " " }));
        MoviesDropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoviesDropDownActionPerformed(evt);
            }
        });
        jPanel1.add(MoviesDropDown, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 147, 30));

        ShowsDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        jPanel1.add(ShowsDropDown, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 147, 30));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 102, 255));
        jLabel3.setText("Theatre :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 90, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 153, 255));
        jLabel4.setText("Movie :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 153, 255));
        jLabel5.setText("Show :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 70, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 153, 255));
        jLabel6.setText("Date :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 60, -1));

        TicketsDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));
        TicketsDropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TicketsDropDownActionPerformed(evt);
            }
        });
        jPanel1.add(TicketsDropDown, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 147, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 153, 255));
        jLabel7.setText("Tickets :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 360, 80, -1));

        bookButton.setBackground(new java.awt.Color(255, 153, 255));
        bookButton.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        bookButton.setText("Book");
        bookButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookButtonActionPerformed(evt);
            }
        });
        jPanel1.add(bookButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, 147, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 153, 255));
        jLabel8.setText("Book a Ticket");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 150, 40));
        jPanel1.add(dateTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, 150, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/movi1.jpg"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 630));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TheatreDropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TheatreDropDownActionPerformed
        MoviesDropDown.removeAllItems();
        String theatre = String.valueOf(TheatreDropDown.getSelectedItem());
        try {
            PreparedStatement st = (PreparedStatement)c.prepareStatement("select movie_id,m.name from movies m, theatres t where m.theatre_id = t.theatre_id and t.name = ?");
            st.setString(1, theatre);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                MoviesDropDown.addItem(rs.getString(2));
            }
        } catch (HeadlessException | SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }//GEN-LAST:event_TheatreDropDownActionPerformed

    private void MoviesDropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoviesDropDownActionPerformed
        ShowsDropDown.removeAllItems();
        String movie = String.valueOf(MoviesDropDown.getSelectedItem());
        try {
            PreparedStatement st = (PreparedStatement)c.prepareStatement("select show_id,show_time from shows s, movies  m where m.movie_id = s.movie_id and m.name = ?");
            st.setString(1, movie);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                ShowsDropDown.addItem(rs.getString(2));
            }
        } catch (HeadlessException | SQLException sqlException) {
        }
    }//GEN-LAST:event_MoviesDropDownActionPerformed

    private void TicketsDropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TicketsDropDownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TicketsDropDownActionPerformed

    private void bookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookButtonActionPerformed
        double lat = 42.3410701;
        double lon = -71.0882683;
        int noft = Integer.parseInt(String.valueOf(TicketsDropDown.getSelectedItem()));
        String stime = (String)ShowsDropDown.getSelectedItem();
        String theatre = String.valueOf(TheatreDropDown.getSelectedItem());
        String date = String.valueOf(dateTxt.getDate());
        String movie = String.valueOf(MoviesDropDown.getSelectedItem());
        String movie_id = "";
        String user_id = "";
        try {
            PreparedStatement st2 = (PreparedStatement)c.prepareStatement("select user_id from users where username = ?");
            st2.setString(1, user);
            ResultSet rs2 = st2.executeQuery();
            if(rs2.next())
            user_id += rs2.getString(1);
            PreparedStatement st = (PreparedStatement)c.prepareStatement("select movie_id from movies m, theatres t where m.theatre_id = t.theatre_id and t.name = ? and m.name = ?");
            st.setString(1, theatre);
            st.setString(2, movie);
            ResultSet rs = st.executeQuery();
            if(rs.next())
            movie_id += rs.getString(1);

        } catch (HeadlessException | SQLException sqlException) {
            System.out.println(sqlException);
        }
        try {
            PreparedStatement st3 = (PreparedStatement)c.prepareStatement("insert into bookings(user_id,enterprize,movie_id,show_time,no_of_tickets_booked,booked_date,lat,lon) values (?,?,?,?,?,?,?,?)");
            st3.setString(1, user_id);
            st3.setString(2,"Movies");
            st3.setString(3, movie_id);
            st3.setString(4, stime);
            st3.setString(5,""+noft);

            st3.setString(6, date);
            st3.setString(7,""+lat);
            st3.setString(8,""+lon);
            st3.executeUpdate();
            JOptionPane.showMessageDialog(this, "Tickets Booked");

        } catch (HeadlessException | SQLException sqlException) {
            System.out.println(sqlException);
        }
    }//GEN-LAST:event_bookButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> MoviesDropDown;
    private javax.swing.JComboBox<String> ShowsDropDown;
    private javax.swing.JComboBox<String> TheatreDropDown;
    private javax.swing.JComboBox<String> TicketsDropDown;
    private javax.swing.JButton bookButton;
    private com.toedter.calendar.JDateChooser dateTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
