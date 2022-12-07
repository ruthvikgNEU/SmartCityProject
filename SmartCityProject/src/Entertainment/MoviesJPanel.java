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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jLabel2.setText("Welcome to Movies Dashboard.............!!");

        TheatreDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        TheatreDropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TheatreDropDownActionPerformed(evt);
            }
        });

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

        jLabel1.setText("My Bookings :");

        MoviesDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", " " }));
        MoviesDropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoviesDropDownActionPerformed(evt);
            }
        });

        ShowsDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Theatre :");

        jLabel4.setText("Movie :");

        jLabel5.setText("Show :");

        jLabel6.setText("Date :");

        TicketsDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));
        TicketsDropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TicketsDropDownActionPerformed(evt);
            }
        });

        jLabel7.setText("Tickets :");

        bookButton.setText("Book");
        bookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookButtonActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Book a Ticket");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(234, 234, 234))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(155, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TheatreDropDown, 0, 147, Short.MAX_VALUE)
                                .addComponent(MoviesDropDown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ShowsDropDown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TicketsDropDown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bookButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(dateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 649, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(155, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TheatreDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(MoviesDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TicketsDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ShowsDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(20, 20, 20)
                        .addComponent(bookButton))
                    .addComponent(dateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(89, Short.MAX_VALUE))
        );

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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
