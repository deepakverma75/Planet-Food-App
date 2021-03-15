
package planetfood.gui;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import planetfood.pojo.UserProfile;

/**
 *
 * @author HP
 */
public class PlanetFoodAdmin extends javax.swing.JFrame {

    /**
     * Creates new form PlanetFoodAdmin
     */
    public PlanetFoodAdmin() {
        initComponents();
        setLocationRelativeTo(null);
        lblUsername.setText("Hello "+UserProfile.getUsername());
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup5 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jrAddEmp = new javax.swing.JRadioButton();
        jrViewEmp = new javax.swing.JRadioButton();
        jrRemEmp = new javax.swing.JRadioButton();
        jrEditEmp = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jrAddCat = new javax.swing.JRadioButton();
        jrEditCat = new javax.swing.JRadioButton();
        jrViewCat = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jrRemCash = new javax.swing.JRadioButton();
        jrRegCash = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        jrAddPrd = new javax.swing.JRadioButton();
        jrViewPrd = new javax.swing.JRadioButton();
        jrRemPrd = new javax.swing.JRadioButton();
        jrEditPrd = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        jrViewOrd = new javax.swing.JRadioButton();
        jrViewDate = new javax.swing.JRadioButton();
        btnDoTask = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Planet Food Admin Panel");

        jLabel2.setBackground(new java.awt.Color(0, 102, 102));
        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Make A Choice");

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Emp Option ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Eras Demi ITC", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        jrAddEmp.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup5.add(jrAddEmp);
        jrAddEmp.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        jrAddEmp.setForeground(new java.awt.Color(255, 255, 255));
        jrAddEmp.setText("Add Emp");

        jrViewEmp.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup5.add(jrViewEmp);
        jrViewEmp.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        jrViewEmp.setForeground(new java.awt.Color(255, 255, 255));
        jrViewEmp.setText("View Emp");

        jrRemEmp.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup5.add(jrRemEmp);
        jrRemEmp.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        jrRemEmp.setForeground(new java.awt.Color(255, 255, 255));
        jrRemEmp.setText("Remove Emp");

        jrEditEmp.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup5.add(jrEditEmp);
        jrEditEmp.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        jrEditEmp.setForeground(new java.awt.Color(255, 255, 255));
        jrEditEmp.setText("Edit Emp");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jrRemEmp, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(jrEditEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jrViewEmp, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(jrAddEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(223, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jrAddEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrViewEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrEditEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrRemEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "  Category Option ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Eras Demi ITC", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        jrAddCat.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup5.add(jrAddCat);
        jrAddCat.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        jrAddCat.setForeground(new java.awt.Color(255, 255, 255));
        jrAddCat.setText("Add Category");

        jrEditCat.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup5.add(jrEditCat);
        jrEditCat.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        jrEditCat.setForeground(new java.awt.Color(255, 255, 255));
        jrEditCat.setText("Edit Category");

        jrViewCat.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup5.add(jrViewCat);
        jrViewCat.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        jrViewCat.setForeground(new java.awt.Color(255, 255, 255));
        jrViewCat.setText("View Category");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jrAddCat, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                        .addGap(225, 225, 225))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jrEditCat, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jrViewCat, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jrAddCat, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrEditCat, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrViewCat, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Cashier Option ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Eras Demi ITC", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        jrRemCash.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup5.add(jrRemCash);
        jrRemCash.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        jrRemCash.setForeground(new java.awt.Color(255, 255, 255));
        jrRemCash.setText("Remove Cashier");

        jrRegCash.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup5.add(jrRegCash);
        jrRegCash.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        jrRegCash.setForeground(new java.awt.Color(255, 255, 255));
        jrRegCash.setText("Register Cashier");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrRemCash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jrRegCash, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jrRegCash, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jrRemCash, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Product Option", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Eras Demi ITC", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        jrAddPrd.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup5.add(jrAddPrd);
        jrAddPrd.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        jrAddPrd.setForeground(new java.awt.Color(255, 255, 255));
        jrAddPrd.setText("Add Product");

        jrViewPrd.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup5.add(jrViewPrd);
        jrViewPrd.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        jrViewPrd.setForeground(new java.awt.Color(255, 255, 255));
        jrViewPrd.setText("View Product");

        jrRemPrd.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup5.add(jrRemPrd);
        jrRemPrd.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        jrRemPrd.setForeground(new java.awt.Color(255, 255, 255));
        jrRemPrd.setText("Remove Product");

        jrEditPrd.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup5.add(jrEditPrd);
        jrEditPrd.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        jrEditPrd.setForeground(new java.awt.Color(255, 255, 255));
        jrEditPrd.setText("Edit Product");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrEditPrd, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrRemPrd, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrAddPrd, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrViewPrd, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(170, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jrAddPrd, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrViewPrd, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrEditPrd, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrRemPrd, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(0, 102, 102));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Report Option ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Eras Demi ITC", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));

        jrViewOrd.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup5.add(jrViewOrd);
        jrViewOrd.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        jrViewOrd.setForeground(new java.awt.Color(255, 255, 255));
        jrViewOrd.setText("View Order");

        jrViewDate.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup5.add(jrViewDate);
        jrViewDate.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        jrViewDate.setForeground(new java.awt.Color(255, 255, 255));
        jrViewDate.setText("DateWise Order");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrViewDate, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrViewOrd, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jrViewOrd, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jrViewDate, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        btnDoTask.setFont(new java.awt.Font("Eras Demi ITC", 1, 24)); // NOI18N
        btnDoTask.setForeground(new java.awt.Color(50, 50, 50));
        btnDoTask.setText("Do Task");
        btnDoTask.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.gray, java.awt.Color.darkGray));
        btnDoTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoTaskActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Eras Demi ITC", 1, 24)); // NOI18N
        btnBack.setForeground(new java.awt.Color(50, 50, 50));
        btnBack.setText("Back");
        btnBack.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.gray, java.awt.Color.darkGray));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblLogout.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblLogout.setForeground(new java.awt.Color(255, 0, 0));
        lblLogout.setText("Logout");
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLogoutMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblLogoutMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLogoutMouseEntered(evt);
            }
        });

        lblUsername.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(btnDoTask, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(211, 211, 211)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(228, 228, 228)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDoTask, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseEntered
        // TODO add your handling code here:
        lblLogout.setForeground(Color.yellow);
        
    }//GEN-LAST:event_lblLogoutMouseEntered

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        // TODO add your handling code here:
        Login log= new Login();
        log.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void lblLogoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblLogoutMousePressed

    private void lblLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseExited
        // TODO add your handling code here:
        lblLogout.setForeground(Color.white);
        
    }//GEN-LAST:event_lblLogoutMouseExited

   

    
    
    private void btnDoTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoTaskActionPerformed
           String task=getOption();
           System.out.println(task);
        if(task==null){
            JOptionPane.showMessageDialog(null, "Please Choose An Option","Error!",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        JFrame jf=null;
        if(task.equalsIgnoreCase("Add Product"))
              jf=new addProductFrame();
        else if(task.equalsIgnoreCase("Edit Product"))
        {
            jf=new EditProductFrame();
        }
        else if(task.equalsIgnoreCase("Remove Product"))
        {
            jf=new RemoveProductFrame();
        }
        
        else if(task.equalsIgnoreCase("View Product"))
        {
            jf=new ViewProductFrame();
        }
        
        else if(task.equalsIgnoreCase("Register Cashier"))
        {
            jf=new RegisterCashier();
        }
        else if(task.equalsIgnoreCase("Remove Cashier"))
        {
            jf=new RemoveCashierFrame();
        }
        else if(task.equalsIgnoreCase("View Order"))
        {
            jf=new ViewOrderFrame();
        }
        else if(task.equalsIgnoreCase("DateWise Order"))
        {
            jf=new ViewAllDateOrdersFrame();
        }
        else if(task.equalsIgnoreCase("Add Category"))
        {
            jf=new AddCategoryFrame();
        }
        else if(task.equalsIgnoreCase("Edit Category"))
        {
            jf=new EditCategoryFrame();
        }
        else if(task.equalsIgnoreCase("View Category"))
        {
            jf=new ViewAllCategoriesFrame();
        }
        else if(task.equalsIgnoreCase("Add Emp"))
        {
            System.out.println("Addd Emp Called");
            jf=new AddNewEmployee();
        }
        else if(task.equalsIgnoreCase("Edit Emp"))
        {
            jf=new EditEmpFrame();
        }
        else if(task.equalsIgnoreCase("Remove Emp"))
        {
            jf=new RemoveEmpFrame();
        }
        else if(task.equals("View Emp"))
        {
            jf=new SingleEmployeeDetail();
        }
        else
        {
            System.out.println("No match");
        }
        
      
        jf.setVisible(true);
        this.dispose();


            
    }//GEN-LAST:event_btnDoTaskActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        Login log= new Login();
        log.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnBackActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PlanetFoodAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlanetFoodAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlanetFoodAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlanetFoodAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlanetFoodAdmin().setVisible(true);
            }
      
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDoTask;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jrAddCat;
    private javax.swing.JRadioButton jrAddEmp;
    private javax.swing.JRadioButton jrAddPrd;
    private javax.swing.JRadioButton jrEditCat;
    private javax.swing.JRadioButton jrEditEmp;
    private javax.swing.JRadioButton jrEditPrd;
    private javax.swing.JRadioButton jrRegCash;
    private javax.swing.JRadioButton jrRemCash;
    private javax.swing.JRadioButton jrRemEmp;
    private javax.swing.JRadioButton jrRemPrd;
    private javax.swing.JRadioButton jrViewCat;
    private javax.swing.JRadioButton jrViewDate;
    private javax.swing.JRadioButton jrViewEmp;
    private javax.swing.JRadioButton jrViewOrd;
    private javax.swing.JRadioButton jrViewPrd;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblUsername;
    // End of variables declaration//GEN-END:variables

     
    private String getOption()
    {
        if(jrAddEmp.isSelected())
            return jrAddEmp.getText();
        else if(jrEditEmp.isSelected())
            return jrEditEmp.getText();
        else if(jrRemEmp.isSelected())
            return jrRemEmp.getText();
        else if(jrViewEmp.isSelected())
            return jrViewEmp.getText();
        else if(jrViewOrd.isSelected())
            return jrViewOrd.getText();
        else if(jrRegCash.isSelected())
            return jrRegCash.getText();
        else if(jrRemCash.isSelected())
             return jrRemCash.getText();
        else if(jrViewDate.isSelected())
            return jrViewDate.getText();
        else if(jrViewOrd.isSelected())
             return jrViewOrd.getText();
        else if(jrAddCat.isSelected())
             return jrAddCat.getText();
        else if(jrEditCat.isSelected())
            return jrEditCat.getText();
         else if(jrViewCat.isSelected())
            return jrViewCat.getText();
         else if(jrAddPrd.isSelected())
            return jrAddPrd.getText();
        else if(jrEditPrd.isSelected())
            return jrEditPrd.getText();
         else if(jrRemPrd.isSelected())
            return jrRemPrd.getText();
        else if(jrViewPrd.isSelected())
             return jrViewPrd.getText();
            return null;

        
    }


}
