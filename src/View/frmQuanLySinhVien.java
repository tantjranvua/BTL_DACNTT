/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import CSDL.tbSinhVien;
import Models.clsSinhVien;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tantanmanh
 */
public class frmQuanLySinhVien extends javax.swing.JFrame {

    /**
     * Creates new form frmQuanLySinhVien
     */
    public frmQuanLySinhVien() {
        initComponents();
        tblDSSinhVien.getColumnModel().getColumn(0).setMaxWidth(65);
        tblDSSinhVien.getColumnModel().getColumn(1).setMaxWidth(180);
        tblDSSinhVien.getColumnModel().getColumn(2).setMaxWidth(150);
        tblDSSinhVien.getColumnModel().getColumn(3).setMaxWidth(100);
        tblDSSinhVien.getColumnModel().getColumn(4).setMaxWidth(340);
        tblDSSinhVien.getColumnModel().getColumn(5).setMaxWidth(90);
        initComboBoxSearch(cbbSearch);
        HienthiDSSinhvien();
    }
    public void initComboBoxSearch(JComboBox cbb){
        Vector<String> ds = new Vector<String>();
        ds.add("MSV");
        ds.add("Họ Tên");
        ds.add("Ngày Sinh");
        ds.add("Giới Tính");
        ds.add("Địa Chỉ");
        ds.add("Lớp");
        DefaultComboBoxModel cbm = new DefaultComboBoxModel(ds);
        
        cbb.setModel(cbm);
        
    }
    public void HienthiDSSinhvien()
    {
        tbSinhVien bangSinhvien = new tbSinhVien();
        Vector<clsSinhVien> dsSinhvien = bangSinhvien.LayDSSinhvien();
        DefaultTableModel dtm = (DefaultTableModel)tblDSSinhVien.getModel();
        dtm.setRowCount(0);//xóa các dòng cũ nếu có
        for(clsSinhVien sv : dsSinhvien)
        {
            String gioitinh = (sv.gioiTinh)?"Nam":"Nữ";
            //lấy tên lớp học trong csdl từ mã lớp
            //tbLophoc bangLophoc = new tbLophoc();
            //String tenlop = bangLophoc.LayTenLop(sv.malop);

         dtm.addRow(new Object[]{sv.Msv,sv.hoTen,sv.ngaySinh,gioitinh,sv.diaChi,sv.idLop});
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDSSinhVien = new javax.swing.JTable();
        btnSua = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        cbbSearch = new javax.swing.JComboBox<>();
        btnSearch = new javax.swing.JButton();
        btnQuanLyLop = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnXemDiem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblDSSinhVien.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        tblDSSinhVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MSV", "Họ Tên", "Ngày Sinh", "Giới Tính", "Địa Chỉ", "Lớp"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblDSSinhVien.setRowHeight(30);
        tblDSSinhVien.setShowGrid(true);
        jScrollPane1.setViewportView(tblDSSinhVien);
        if (tblDSSinhVien.getColumnModel().getColumnCount() > 0) {
            tblDSSinhVien.getColumnModel().getColumn(0).setResizable(false);
            tblDSSinhVien.getColumnModel().getColumn(1).setResizable(false);
            tblDSSinhVien.getColumnModel().getColumn(2).setResizable(false);
            tblDSSinhVien.getColumnModel().getColumn(3).setResizable(false);
            tblDSSinhVien.getColumnModel().getColumn(4).setResizable(false);
            tblDSSinhVien.getColumnModel().getColumn(5).setResizable(false);
        }

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        txtSearch.setToolTipText("");
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
        });

        cbbSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnQuanLyLop.setText("QL Lớp");
        btnQuanLyLop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLyLopActionPerformed(evt);
            }
        });

        jButton6.setText("QL Môn");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("QUẢN LÝ SINH VIÊN");

        btnXemDiem.setText("Xem Điểm");
        btnXemDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemDiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnXemDiem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(cbbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnSearch)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnQuanLyLop)
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addGap(80, 80, 80))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnXemDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnQuanLyLop)
                            .addComponent(jButton6)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        int i = tblDSSinhVien.getSelectedRow();
        if(i<0)
            JOptionPane.showMessageDialog(this, "Chưa chọn sinh viên");
        else
        {
            String Msv = (String)tblDSSinhVien.getModel().getValueAt(i,0);
            tbSinhVien bangSinhvien = new tbSinhVien();
            frmSuaSinhVien formSuaSV = new frmSuaSinhVien();
            formSuaSV.formQuanlySV = this;
            formSuaSV.sinhvien = bangSinhvien.LaySinhvien(Msv);;
            formSuaSV.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String search = txtSearch.getText();        
        int option = cbbSearch.getSelectedIndex();
        String tmp = "";
        if(option==3){
            if(search.equals("Nam")||search.equals("nam"))
                search = "1";
            else{
                if(search.equals("Nữ")||search.equals("nữ"))
                    search = "0";               
                else
                    if(search.equals("N")||search.equals("n")||search.equals(""))
                        search = "";
                    else
                        search = "2";
            }
        }
        tbSinhVien bangSinhvien = new tbSinhVien();
        Vector<clsSinhVien> dsSinhvien = bangSinhvien.LayDSSinhvien(search,option);
        if(dsSinhvien.size()>0)
        {
            DefaultTableModel dtm = (DefaultTableModel)tblDSSinhVien.getModel();
            dtm.setRowCount(0);//xóa các dòng cũ nếu có
            for(clsSinhVien sv : dsSinhvien)
            {
                String gioitinh = (sv.gioiTinh)?"Nam":"Nữ";
                //lấy tên lớp học trong csdl từ mã lớp
                //tbLophoc bangLophoc = new tbLophoc();
                //String tenlop = bangLophoc.LayTenLop(sv.malop);
               
             dtm.addRow(new Object[]{sv.Msv,sv.hoTen,sv.ngaySinh,gioitinh,sv.diaChi,sv.idLop});
            }
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==10){
            btnSearch.doClick();
        }
    }//GEN-LAST:event_txtSearchKeyPressed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        int i = tblDSSinhVien.getSelectedRow();
        if(i<0)
            JOptionPane.showMessageDialog(this, "Chưa chọn sinh viên");
        else
        {
            String id;
            id = (String)tblDSSinhVien.getModel().getValueAt(i,0);
            tbSinhVien bangSinhvien = new tbSinhVien();
            boolean kq = bangSinhvien.XoaSinhvien(id);
            if(kq==true)
            {
                JOptionPane.showMessageDialog(this, "Xóa thành công");
                HienthiDSSinhvien();
            }
            else
                JOptionPane.showMessageDialog(this, "Lỗi xóa sinh viên");
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        frmThemSinhVien formThemSV = new frmThemSinhVien();
        formThemSV.formQuanlySV = this;
        formThemSV.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnQuanLyLopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLyLopActionPerformed
        // TODO add your handling code here:
        frmQuanlyLop formQuanlyLop = new frmQuanlyLop();
        formQuanlyLop.formQuanlySV = this;
        formQuanlyLop.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnQuanLyLopActionPerformed

    private void btnXemDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemDiemActionPerformed
        // TODO add your handling code here:
        int i = tblDSSinhVien.getSelectedRow();
        if(i<0)
            JOptionPane.showMessageDialog(this, "Chưa chọn sinh viên");
        else{
            String id;
            id = (String)tblDSSinhVien.getModel().getValueAt(i,0);
            frmBangDiemSV formBangDiemSV = new frmBangDiemSV();
            formBangDiemSV.Msv = id;
            formBangDiemSV.csQLSV = this;
            formBangDiemSV.setVisible(true);
            this.dispose();
        }
        
    }//GEN-LAST:event_btnXemDiemActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        frmQuanlyMon formQuanlyMon = new frmQuanlyMon();
        formQuanlyMon.formQuanlySV = this;
        formQuanlyMon.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(frmQuanLySinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmQuanLySinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmQuanLySinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmQuanLySinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmQuanLySinhVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQuanLyLop;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXemDiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbbSearch;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDSSinhVien;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
