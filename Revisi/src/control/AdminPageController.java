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
import view.AdminPageView;

public class AdminPageController {
    AdminPageView APV;
    HostelryModel HM;
    String[][] data;
    int row;
    public AdminPageController(AdminPageView APV, HostelryModel HM) {
        this.APV = APV;
        this.HM = HM;
        showData();
        APV.blogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                LoginPageView LPV=new LoginPageView();
                LoginPageController LPC=new LoginPageController(LPV,HM);
                APV.window.dispose();
            }
        });
        APV.tabel.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                row=APV.tabel.getSelectedRow();
                if(data[row][5].equals("notPaid"))
                {
                    int input=JOptionPane.showConfirmDialog(null,"Update booking status of renter '"+data[row][0]+"' to 'Paid'?","Option",JOptionPane.YES_NO_OPTION);
                    if(input==0){
                        HM.updateStatus(data[row][0], data[row][1], data[row][6]);
                        showData();
                    }
                }
                else{
                    int input=JOptionPane.showConfirmDialog(null,"Delete booking of room '"+data[row][6]+"'?","Option",JOptionPane.YES_NO_OPTION);
                    if(input==0){
                        HM.deleteRent(data[row][1],data[row][6]);
                        showData();
                    }
                }
            }
        });
    }
    void showData(){
        data=HM.readRenter();
        String[] columnName={"Name","ID","Contact","Duration","Bill","Status","Room"};
        DefaultTableModel tableModel=new DefaultTableModel(data,columnName){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        APV.tabel.setModel(tableModel);
    }
}
