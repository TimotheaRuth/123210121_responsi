/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.HostelryModel;
import view.LoginPageView;
import view.RenterDataView;
import view.RoomListView;
import view.AdminPageView;

public class LoginPageController {
    LoginPageView LP;
    HostelryModel HM;

    public LoginPageController(LoginPageView LP, HostelryModel HM) {
        this.LP = LP;
        this.HM = HM;
        LP.blogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(HM.checkLogin(LP.getUsername(), LP.getPassword()).equals("admin")){
                    AdminPageView APV=new AdminPageView();
                    AdminPageController APC=new AdminPageController(APV,HM);
                    LP.dispose();
                }
                else if(HM.checkLogin(LP.getUsername(), LP.getPassword()).equals("renter")){
                    RoomListView RDV=new RoomListView();
                    RoomListController RDC=new RoomListController(RDV,HM);
                    LP.dispose();
                }
                else{
                    JOptionPane.showMessageDialog(null,"Wrong username/password!");
                }
            }
        });
    }
    
}
