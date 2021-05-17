package GUI;

import BUS.SachBUS;
import BUS.ThongKeBUS;
import BUS.ThongKeSPBUS;
import DTO.ThongKeDTO;
import DTO.ThongKeSPDTO;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class ThongKeGUI extends javax.swing.JPanel {

    private DefaultTableModel model;
    
    public ThongKeGUI() {
        initComponents();
    }
    public ThongKeGUI(int width) {
        initComponents();
        this.setSize(width-210,935);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btThongKePNtheoMaNCC = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txSearchDayMin = new com.toedter.calendar.JDateChooser();
        jLabel16 = new javax.swing.JLabel();
        txSearchDayMax = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        btMaNV = new javax.swing.JButton();
        btTKtheoQuyvaNCC = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPNtheoMaNCC = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbThongKeTheoQuyVaNCC = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableThongKeSP = new javax.swing.JTable();
        btnThongKeSP = new javax.swing.JButton();
        comboNamThongKe = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(51, 255, 51));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("THỐNG KÊ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(508, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(435, 435, 435))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btThongKePNtheoMaNCC.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btThongKePNtheoMaNCC.setText("...");
        btThongKePNtheoMaNCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThongKePNtheoMaNCCActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("NHẬP HÀNG");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("MÃ NHÂN VIÊN:");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setText("TỪ:");

        txSearchDayMin.setDateFormatString("yyyy-MM-dd");
        txSearchDayMin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txSearchDayMin.setMinSelectableDate(new java.util.Date(-62135791089000L));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("ĐẾN:");

        txSearchDayMax.setDateFormatString("yyyy-MM-dd");
        txSearchDayMax.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 51));
        jLabel4.setText("KHOẢNG THỜI GIAN:");

        btMaNV.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btMaNV.setText("...");
        btMaNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMaNVActionPerformed(evt);
            }
        });

        btTKtheoQuyvaNCC.setText("thongke");
        btTKtheoQuyvaNCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTKtheoQuyvaNCCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txSearchDayMax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txSearchDayMin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(82, 82, 82))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(30, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btThongKePNtheoMaNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btTKtheoQuyvaNCC)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btMaNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 0, 0)
                .addComponent(jLabel4)
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txSearchDayMin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txSearchDayMax, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btThongKePNtheoMaNCC)
                    .addComponent(btTKtheoQuyvaNCC))
                .addGap(517, 517, 517))
        );

        tbPNtheoMaNCC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane1.setViewportView(tbPNtheoMaNCC);

        tbThongKeTheoQuyVaNCC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane2.setViewportView(tbThongKeTheoQuyVaNCC);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Thống kê doanh thu sản phẩm theo quý");

        tableThongKeSP.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tableThongKeSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã Sách", "Quý 1", "Quý 2", "Quý 3", "Quý 4"
            }
        ));
        jScrollPane3.setViewportView(tableThongKeSP);

        btnThongKeSP.setText("Thống kê Sản Phẩm");
        btnThongKeSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeSPActionPerformed(evt);
            }
        });

        comboNamThongKe.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        comboNamThongKe.setModel(getComboModel());
        comboNamThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboNamThongKeActionPerformed(evt);
            }
        });

        jLabel6.setText("Năm:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnThongKeSP)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(comboNamThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(81, 81, 81)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboNamThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(16, 16, 16)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnThongKeSP)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btThongKePNtheoMaNCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThongKePNtheoMaNCCActionPerformed
        DefaultTableModel temp =new DefaultTableModel() ;   
        HashMap<String,Object> values =new  HashMap<String,Object>();
        
        try {
            ThongKeBUS bus =new ThongKeBUS();
        if(bus.getTbthongke()==null) bus.ThongKeTienTheoMaNCC();
        values=bus.getTbthongke();
        //set Header
        Vector header = new Vector();
        header.add("MÃ NCC");
        header.add("TỔNG TIỀN ĐÃ NHẬP");
        temp=new DefaultTableModel(header,0);

        //set content table
        temp.setRowCount(0);
        Vector data;
        for (Map.Entry<String,Object> map : values.entrySet()) {
            System.out.println(map.getKey() + " - " + map.getValue());     
            data = new Vector();
            data.add(map.getKey());
            data.add(map.getValue());     
            temp.addRow(data);
        }
        tbPNtheoMaNCC.setModel(temp);

       
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"Không Thể Thống Kê tổng tiền Phiếu Nhập Theo Mã NCC ", "Thông Báo Lỗi",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btThongKePNtheoMaNCCActionPerformed

    private void btMaNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMaNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btMaNVActionPerformed

    private void btTKtheoQuyvaNCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTKtheoQuyvaNCCActionPerformed
         DefaultTableModel temp =new DefaultTableModel() ;   
        ArrayList<ThongKeDTO> values =new  ArrayList<ThongKeDTO>();
        
        try {
            ThongKeBUS bus =new ThongKeBUS();
        if(bus.getTbthongke()==null) bus.ThongKeTienTheoQuyVaMaNCC();
        values=bus.getTbthongketheoQuy();
        //set Header
        Vector header = new Vector();
        header.add("   ");
        header.add("QUÝ 1");
        header.add("QUÝ 2");
        header.add("QUÝ 3");
        header.add("QUÝ 4");
        temp=new DefaultTableModel(header,0);

        //set content table
       
        Vector data;
         temp.setRowCount(0);
        for (ThongKeDTO tk : values) {
            data=new Vector();
            data.add(tk.getMa());
            if(tk.getQuy().equalsIgnoreCase("1")) data.add(tk.getTien()); else data.add(" ");
            if(tk.getQuy().equalsIgnoreCase("2")) data.add(tk.getTien()); else data.add(" ");
            if(tk.getQuy().equalsIgnoreCase("3")) data.add(tk.getTien()); else data.add(" ");
            if(tk.getQuy().equalsIgnoreCase("4")) data.add(tk.getTien()); else data.add(" ");           
            temp.addRow(data);
        }
        tbThongKeTheoQuyVaNCC.setModel(temp);
           } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"Không Thể Thống Kê tổng tiền Phiếu Nhập  Quý và Mã NCC ", "Thông Báo Lỗi",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btTKtheoQuyvaNCCActionPerformed

    private void btnThongKeSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeSPActionPerformed
        // TODO add your handling code here:
        Vector header = new Vector();
        header.add("Mã Sách");
        header.add("Quý 1");
        header.add("Quý 2");
        header.add("Quý 3");
        header.add("Quý 4");
        
        DefaultTableModel model = new DefaultTableModel(header, 0);
        try{
            ThongKeSPBUS bus = new ThongKeSPBUS();
            for(ThongKeSPDTO thongke : bus.dsThongKe){
                Vector row = new Vector();
                row.add(thongke.getMaSach());
                row.add(thongke.getQuy1());
                row.add(thongke.getQuy2());
                row.add(thongke.getQuy3());
                row.add(thongke.getQuy4());
                model.addRow(row);
            }
            tableThongKeSP.setModel(model);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Không thể xuất thống kê lúc này, vui lòng thử lại");
            System.out.println(ex);
        }
    }//GEN-LAST:event_btnThongKeSPActionPerformed

    private ComboBoxModel getComboModel(){
        DefaultComboBoxModel comboModel = new DefaultComboBoxModel();
        int year = Calendar.getInstance().get(Calendar.YEAR);
        for(int i = year -3; i <= year; i++){
            comboModel.addElement(i);
        }
        return comboModel;
    }
    
    private void comboNamThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboNamThongKeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboNamThongKeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btMaNV;
    private javax.swing.JButton btTKtheoQuyvaNCC;
    private javax.swing.JButton btThongKePNtheoMaNCC;
    private javax.swing.JButton btnThongKeSP;
    private javax.swing.JComboBox<String> comboNamThongKe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tableThongKeSP;
    private javax.swing.JTable tbPNtheoMaNCC;
    private javax.swing.JTable tbThongKeTheoQuyVaNCC;
    private com.toedter.calendar.JDateChooser txSearchDayMax;
    private com.toedter.calendar.JDateChooser txSearchDayMin;
    // End of variables declaration//GEN-END:variables
}
