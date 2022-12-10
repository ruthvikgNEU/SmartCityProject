/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Entertainment;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.sql.Connection;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author rajkumarkumaravelu
 */
public class TourismJPanel extends javax.swing.JPanel {

    Connection c;
    String user;
    public TourismJPanel(Connection c,String user) {
        initComponents();
        this.c = c;
        this.user = user;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel(){

            public void paintComponent(Graphics g)
            {

                ImageIcon im = new ImageIcon("tourism.jpeg");
                Image i = im.getImage();

                g.drawImage(i, 0, 0, this.getSize().width, this.getSize().height, this);

            }

        };
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bookTicketsButton = new javax.swing.JButton();
        viewBookingsButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        locationComboBox = new javax.swing.JComboBox<>();
        placesComboBox = new javax.swing.JComboBox<>();
        daysComboBox = new javax.swing.JComboBox<>();
        openTimingComboBox = new javax.swing.JComboBox<>();
        numOfTicketsComboBox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 630));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jLabel2.setText("Welcome to Tourism ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 26, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 74, 668, 150));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Location");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 104, 30));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Places");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 104, 30));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Days");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 104, 30));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Open Timing");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 104, -1));

        bookTicketsButton.setText("Book Tickets");
        jPanel1.add(bookTicketsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 549, -1, -1));

        viewBookingsButton.setText("View Bookings");
        jPanel1.add(viewBookingsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 549, -1, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Number of tickets");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, -1, -1));

        locationComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(locationComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 100, -1));

        placesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        placesComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placesComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(placesComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 100, -1));

        daysComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(daysComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 100, -1));

        openTimingComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(openTimingComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 100, -1));

        numOfTicketsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(numOfTicketsComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, 100, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon("/Users/rajkumarkumaravelu/NetBeansProjects/AED-final project-smartcity/SmartCityProject/SmartCityProject/tourism.jpeg"));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void placesComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placesComboBoxActionPerformed
        // TODO add your handling code here:
        
        placesComboBox.removeAllItems();
        
    }//GEN-LAST:event_placesComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookTicketsButton;
    private javax.swing.JComboBox<String> daysComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> locationComboBox;
    private javax.swing.JComboBox<String> numOfTicketsComboBox;
    private javax.swing.JComboBox<String> openTimingComboBox;
    private javax.swing.JComboBox<String> placesComboBox;
    private javax.swing.JButton viewBookingsButton;
    // End of variables declaration//GEN-END:variables
}
