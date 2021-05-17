/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.ThongKeSPDAO;
import DTO.ThongKeSPDTO;
import java.util.ArrayList;

/**
 *
 * @author tungk
 */
public class ThongKeSPBUS {
    public ArrayList<ThongKeSPDTO> dsThongKe;
    
    public ThongKeSPBUS() throws Exception{ 
        ThongKeSPDAO dao = new ThongKeSPDAO();
        dsThongKe = dao.xuatThongKe();
    }
}
