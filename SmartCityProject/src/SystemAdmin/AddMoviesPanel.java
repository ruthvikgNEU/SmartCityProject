/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package SystemAdmin;

/**
 *
 * @author Ruthvik Garlapati
 */
public class AddMoviesPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddMoviesPanel
     */
    public AddMoviesPanel() {
        initComponents();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        CinemaData = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        SaveButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cinema");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 19, -1, -1));

        CinemaData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Movie Id", "Name", "Theatre"
            }
        ));
        jScrollPane1.setViewportView(CinemaData);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 697, 198));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 309, 242, 43));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Theatre :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 321, -1, -1));

        jTextField1.setText("Name");
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 379, 242, 41));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 390, -1, -1));

        SaveButton.setText("Save");
        add(SaveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 457, 147, 39));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Libraries/20552168.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, -2, 780, 660));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CinemaData;
    private javax.swing.JButton SaveButton;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
