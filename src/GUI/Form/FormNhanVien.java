package GUI.Form;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author PC
 */
public class FormNhanVien extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    public FormNhanVien() {
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

        lbChucvuNV = new javax.swing.JLabel();
        txtNameNV = new javax.swing.JTextField();
        txtChucvuNV = new javax.swing.JTextField();
        txtHoNV = new javax.swing.JTextField();
        lbNameNV = new javax.swing.JLabel();
        lbHoNV = new javax.swing.JLabel();
        lbInfNV = new javax.swing.JLabel();
        txtSĐTNV = new javax.swing.JTextField();
        lbIDNV = new javax.swing.JLabel();
        txtIDNV = new javax.swing.JTextField();
        btnAddNV = new javax.swing.JButton();
        btnFixNCC = new javax.swing.JButton();
        btnDelNV = new javax.swing.JButton();
        btnReloadNV = new javax.swing.JButton();
        btnFindNV = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListNV = new javax.swing.JTable();
        lbSĐTNV = new javax.swing.JLabel();
        lbListNV = new javax.swing.JLabel();
        lbMailNV = new javax.swing.JLabel();
        txtMailNV = new javax.swing.JTextField();
        lbSexNV = new javax.swing.JLabel();
        txtSexNV = new javax.swing.JTextField();
        btnAccount = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnHistory = new javax.swing.JButton();
        lbMailNV1 = new javax.swing.JLabel();
        txtMailNV1 = new javax.swing.JTextField();
        txtMailNV2 = new javax.swing.JTextField();
        lbMailNV2 = new javax.swing.JLabel();

        setLayout(null);

        lbChucvuNV.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbChucvuNV.setText("Mã tài khoản");
        add(lbChucvuNV);
        lbChucvuNV.setBounds(410, 240, 120, 30);

        txtNameNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameNVActionPerformed(evt);
            }
        });
        add(txtNameNV);
        txtNameNV.setBounds(160, 290, 220, 30);

        txtChucvuNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChucvuNVActionPerformed(evt);
            }
        });
        add(txtChucvuNV);
        txtChucvuNV.setBounds(580, 240, 220, 30);

        txtHoNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoNVActionPerformed(evt);
            }
        });
        add(txtHoNV);
        txtHoNV.setBounds(160, 240, 220, 30);

        lbNameNV.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbNameNV.setText("Tên nhân viên");
        add(lbNameNV);
        lbNameNV.setBounds(30, 290, 110, 30);

        lbHoNV.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbHoNV.setText("Họ nhân viên");
        add(lbHoNV);
        lbHoNV.setBounds(30, 240, 110, 30);

        lbInfNV.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbInfNV.setText("Thông tin nhân viên");
        add(lbInfNV);
        lbInfNV.setBounds(340, 110, 230, 30);

        txtSĐTNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSĐTNVActionPerformed(evt);
            }
        });
        add(txtSĐTNV);
        txtSĐTNV.setBounds(160, 340, 220, 30);

        lbIDNV.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbIDNV.setText("Mã nhân viên");
        add(lbIDNV);
        lbIDNV.setBounds(30, 190, 110, 30);

        txtIDNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDNVActionPerformed(evt);
            }
        });
        add(txtIDNV);
        txtIDNV.setBounds(160, 190, 220, 30);

        btnAddNV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAddNV.setText("Thêm");
        add(btnAddNV);
        btnAddNV.setBounds(850, 190, 120, 30);

        btnFixNCC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnFixNCC.setText("Sửa");
        add(btnFixNCC);
        btnFixNCC.setBounds(850, 290, 120, 29);

        btnDelNV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDelNV.setText("Xóa");
        btnDelNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelNVActionPerformed(evt);
            }
        });
        add(btnDelNV);
        btnDelNV.setBounds(850, 340, 120, 29);

        btnReloadNV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnReloadNV.setText("Tải lại");
        add(btnReloadNV);
        btnReloadNV.setBounds(10, 440, 120, 30);

        btnFindNV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnFindNV.setText("Tìm");
        btnFindNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindNVActionPerformed(evt);
            }
        });
        add(btnFindNV);
        btnFindNV.setBounds(850, 240, 120, 29);

        tblListNV.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tblListNV.setForeground(new java.awt.Color(0, 102, 255));
        tblListNV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã NV", "Mã tài khoản", "Họ", "Tên", "Ngày sinh", "SĐT", "Mail", "Giới tính", "Lương"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblListNV.setRowSelectionAllowed(false);
        tblListNV.setSelectionBackground(new java.awt.Color(0, 51, 255));
        jScrollPane1.setViewportView(tblListNV);

        add(jScrollPane1);
        jScrollPane1.setBounds(2, 490, 1000, 330);

        lbSĐTNV.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbSĐTNV.setText("SĐT nhân viên");
        add(lbSĐTNV);
        lbSĐTNV.setBounds(30, 340, 120, 30);

        lbListNV.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbListNV.setText("Danh sách nhân viên");
        add(lbListNV);
        lbListNV.setBounds(160, 440, 200, 30);

        lbMailNV.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbMailNV.setText("Ngày sinh");
        add(lbMailNV);
        lbMailNV.setBounds(30, 390, 130, 30);

        txtMailNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMailNVActionPerformed(evt);
            }
        });
        add(txtMailNV);
        txtMailNV.setBounds(160, 390, 220, 30);

        lbSexNV.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbSexNV.setText("Giới tính nhân viên");
        add(lbSexNV);
        lbSexNV.setBounds(410, 190, 150, 30);

        txtSexNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSexNVActionPerformed(evt);
            }
        });
        add(txtSexNV);
        txtSexNV.setBounds(580, 190, 220, 30);

        btnAccount.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnAccount.setText("TÀI KHOẢN");
        btnAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccountActionPerformed(evt);
            }
        });
        add(btnAccount);
        btnAccount.setBounds(20, 20, 180, 60);

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton2.setText("PHÂN QUYỀN");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(210, 20, 179, 60);

        btnHistory.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnHistory.setText("LỊCH SỬ");
        btnHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoryActionPerformed(evt);
            }
        });
        add(btnHistory);
        btnHistory.setBounds(410, 20, 120, 60);

        lbMailNV1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbMailNV1.setText("Mail nhân viên");
        add(lbMailNV1);
        lbMailNV1.setBounds(410, 290, 130, 30);

        txtMailNV1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMailNV1ActionPerformed(evt);
            }
        });
        add(txtMailNV1);
        txtMailNV1.setBounds(580, 290, 220, 30);

        txtMailNV2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMailNV2ActionPerformed(evt);
            }
        });
        add(txtMailNV2);
        txtMailNV2.setBounds(580, 340, 220, 30);

        lbMailNV2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbMailNV2.setText("Lương");
        add(lbMailNV2);
        lbMailNV2.setBounds(410, 340, 130, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameNVActionPerformed

    private void txtChucvuNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChucvuNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtChucvuNVActionPerformed

    private void txtHoNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoNVActionPerformed

    private void txtSĐTNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSĐTNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSĐTNVActionPerformed

    private void txtIDNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDNVActionPerformed

    private void btnDelNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDelNVActionPerformed

    private void btnFindNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFindNVActionPerformed

    private void txtMailNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMailNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMailNVActionPerformed

    private void txtSexNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSexNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSexNVActionPerformed

    private void btnAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAccountActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHistoryActionPerformed

    private void txtMailNV1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMailNV1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMailNV1ActionPerformed

    private void txtMailNV2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMailNV2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMailNV2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccount;
    private javax.swing.JButton btnAddNV;
    private javax.swing.JButton btnDelNV;
    private javax.swing.JButton btnFindNV;
    private javax.swing.JButton btnFixNCC;
    private javax.swing.JButton btnHistory;
    private javax.swing.JButton btnReloadNV;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbChucvuNV;
    private javax.swing.JLabel lbHoNV;
    private javax.swing.JLabel lbIDNV;
    private javax.swing.JLabel lbInfNV;
    private javax.swing.JLabel lbListNV;
    private javax.swing.JLabel lbMailNV;
    private javax.swing.JLabel lbMailNV1;
    private javax.swing.JLabel lbMailNV2;
    private javax.swing.JLabel lbNameNV;
    private javax.swing.JLabel lbSexNV;
    private javax.swing.JLabel lbSĐTNV;
    private javax.swing.JTable tblListNV;
    private javax.swing.JTextField txtChucvuNV;
    private javax.swing.JTextField txtHoNV;
    private javax.swing.JTextField txtIDNV;
    private javax.swing.JTextField txtMailNV;
    private javax.swing.JTextField txtMailNV1;
    private javax.swing.JTextField txtMailNV2;
    private javax.swing.JTextField txtNameNV;
    private javax.swing.JTextField txtSexNV;
    private javax.swing.JTextField txtSĐTNV;
    // End of variables declaration//GEN-END:variables
}
