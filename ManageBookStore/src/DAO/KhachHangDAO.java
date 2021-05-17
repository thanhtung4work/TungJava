/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import javax.swing.JOptionPane;
import DTO.KhachHangDTO;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author tungk
 */
public class KhachHangDAO {
    MySQLConnect conn = new MySQLConnect("localhost", "root", "", "bookstore");
    
    public KhachHangDAO(){
        try{
            //conn.testDriver();
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Lỗi kết nối database");
        }
    }
    
    public ArrayList docDSKH() throws Exception{
        ArrayList<KhachHangDTO> dskh = new ArrayList<>();
            String query = "select * from khachhang";
            ResultSet rs = conn.excuteQuery(query);
            
            while(rs.next()){
                KhachHangDTO kh = new KhachHangDTO();
                int i = 1;
                kh.setId(rs.getString(i++));
                kh.setHo(rs.getString(i++));
                kh.setTen(rs.getString(i++));
                kh.setSdt(rs.getString(i++));
                kh.setEmail(rs.getString(i++));
                kh.setPhai(rs.getBoolean(i++));
                kh.setTct(rs.getInt(i++));
                kh.setNgaySinh(rs.getString(i++));
                kh.setTrangthai(rs.getBoolean("TrangThai"));
                dskh.add(kh);
            }
            
        return dskh;
    }
    
    public void them(KhachHangDTO kh) throws Exception{
        String query = String.format("insert into khachhang values('%s', '%s', '%s', '%s', '%s', %b, %d, '%s', 1)", 
                kh.getId(), kh.getHo(), kh.getTen(), kh.getSdt(), kh.getEmail(), kh.isPhai(), kh.getTct(), kh.getNgaySinh());
            conn.excuteUpdate(query);
    }
    
    public void xoa(KhachHangDTO kh) throws Exception{
        String query = String.format("update khachhang set TrangThai = 0 where MaKH = '%s'", kh.getId());
            conn.excuteUpdate(query);
    }
    
    public void sua(KhachHangDTO kh) throws Exception{
        String query = String.format("update khachhang set Ho='%s', Ten='%s', SDT='%s', Email='%s', Phai=%b, TCT=%d where MaKH = '%s'", 
                kh.getHo(), kh.getTen(), kh.getSdt(), kh.getEmail(), kh.isPhai(), kh.getTct(), kh.getId());
            conn.excuteUpdate(query);
    }
    
}
