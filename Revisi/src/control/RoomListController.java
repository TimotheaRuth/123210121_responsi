/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.HostelryModel;
import view.LoginPageView;
import view.RenterDataView;
import view.RoomListView;

public class RoomListController {
    RoomListView RLV;
    HostelryModel HM;
    String[][] data;
    int row;
    public RoomListController(RoomListView RLV, HostelryModel HM) {
        this.RLV = RLV;
        this.HM = HM;
        showData();
        RLV.tabel.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                row=RLV.tabel.getSelectedRow();
                if(data[row][3].equals("empty"))
                {
                    RenterDataView RDV=new RenterDataView();
                    RenterDataController RDC=new RenterDataController(RDV,HM,data[row][0]);
                    RLV.window.dispose();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Room is occupied!");
                }
            }
        });
        RLV.bcancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                LoginPageView LPV=new LoginPageView();
                LoginPageController LPC=new LoginPageController(LPV,HM);
                RLV.window.dispose();
            }
        });
    }
    void showData(){
        data=HM.readRoom();
        String[] columnName={"Name","Size","Price","Status"};
        DefaultTableModel tableModel=new DefaultTableModel(data,columnName){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        RLV.tabel.setModel(tableModel);
    }
}
