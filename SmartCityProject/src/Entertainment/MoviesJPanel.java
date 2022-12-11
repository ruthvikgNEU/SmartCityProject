/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Entertainment;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Image;
import java.sql.*;
import java.sql.Connection;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MoviesJPanel extends javax.swing.JPanel {
    //establishing connection
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

        jPanel2 = new javax.swing.JPanel(){
            public void paintComponent(Graphics g)
            {

                ImageIcon im = new ImageIcon("movies.jpeg");
                Image i = im.getImage();

                g.drawImage(i, 0, 0, this.getSize().width, this.getSize().height, this);

            }
        };
        jLabel2 = new javax.swing.JLabel();
        TheatreDropDown = new javax.swing.JComboBox<>();
        BookingTable = new javax.swing.JScrollPane();
        bookingTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        MoviesDropDown = new javax.swing.JComboBox<>();
        ShowsDropDown = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dateTxt = new com.toedter.calendar.JDateChooser();
        TicketsDropDown = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        bookButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        viewButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        jPanel2.setPreferredSize(new java.awt.Dimension(1200, 620));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Welcome to Movies Dashboard");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(491, 4, -1, -1));

        TheatreDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        TheatreDropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TheatreDropDownActionPerformed(evt);
            }
        });
        jPanel2.add(TheatreDropDown, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 314, 147, -1));

        bookingTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Theatre", "Movie", "Show", "Date", "No_of_Seats"
            }
        ));
        BookingTable.setViewportView(bookingTable);

        jPanel2.add(BookingTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 88, 780, 168));

        jLabel1.setText("My Bookings :");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 59, -1, -1));

        MoviesDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", " " }));
        MoviesDropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoviesDropDownActionPerformed(evt);
            }
        });
        jPanel2.add(MoviesDropDown, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 355, 147, -1));

        ShowsDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        jPanel2.add(ShowsDropDown, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 435, 147, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Theatre :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 317, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Movie :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 358, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Show :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 435, -1, -1));
        jPanel2.add(dateTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 470, 147, -1));

        TicketsDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));
        TicketsDropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TicketsDropDownActionPerformed(evt);
            }
        });
        jPanel2.add(TicketsDropDown, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 394, 147, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tickets :");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 397, -1, -1));

        bookButton.setText("Book");
        bookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookButtonActionPerformed(evt);
            }
        });
        jPanel2.add(bookButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 511, 147, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Book a Ticket");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 274, -1, -1));

        viewButton.setText("View Bookings");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });
        jPanel2.add(viewButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 511, -1, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Date");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, 50, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TheatreDropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TheatreDropDownActionPerformed
        //removing items from movies drop down box
        MoviesDropDown.removeAllItems();
        //get the items in the theatredropdown box and set the value to theatre
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

        // TODO add your handling code here:
    }//GEN-LAST:event_TheatreDropDownActionPerformed

    private void MoviesDropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoviesDropDownActionPerformed
        
        //remove items from ShowsDropDown 
        ShowsDropDown.removeAllItems();
        //get the items in the moviesdropdown box and set the value to theatre
        String movie = String.valueOf(MoviesDropDown.getSelectedItem());
        try {
            PreparedStatement st = (PreparedStatement)c.prepareStatement("select show_id,show_time from shows s, movies  m where m.movie_id = s.movie_id and m.name = ?");
            st.setString(1, movie);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                ShowsDropDown.addItem(rs.getString(2));
            }
        } catch (HeadlessException | SQLException sqlException) {
            sqlException.printStackTrace();
        }
        // TODO add your handling code here:
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
            sqlException.printStackTrace();
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
            sqlException.printStackTrace();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_bookButtonActionPerformed

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        // TODO add your handling code here:
        bookingTable.removeAll();
        String sql = "select t.name,m.name,b.show_time,b.booked_date,b.no_of_tickets_booked from theatres t,movies m,bookings b,users u where t.theatre_id = m.theatre_id and m.movie_id = b.movie_id and u.user_id = b.user_id and u.username = ?";
        try {
            PreparedStatement st = (PreparedStatement)c.prepareStatement(sql);
            st.setString(1,user);
            ResultSet rs = st.executeQuery();
            DefaultTableModel model = (DefaultTableModel) bookingTable.getModel();
            while(rs.next()){
                model.addRow(new String[] {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)});
            }
        } catch (HeadlessException | SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }//GEN-LAST:event_viewButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane BookingTable;
    private javax.swing.JComboBox<String> MoviesDropDown;
    private javax.swing.JComboBox<String> ShowsDropDown;
    private javax.swing.JComboBox<String> TheatreDropDown;
    private javax.swing.JComboBox<String> TicketsDropDown;
    private javax.swing.JButton bookButton;
    private javax.swing.JTable bookingTable;
    private com.toedter.calendar.JDateChooser dateTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables
}
