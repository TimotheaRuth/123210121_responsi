/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.HostelryModel;
import view.LoginPageView;
import view.RenterDataView;

class RenterDataController {
    RenterDataView RDV;
    HostelryModel HM;
    String room;
    public RenterDataController(RenterDataView RDV, HostelryModel HM, String room) {
        this.RDV = RDV;
        this.HM = HM;
        this.room=room;
        RDV.btnAddPanel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                HM.insertRent(RDV.getName(), RDV.getId(), RDV.getContact(), RDV.getRentTime(), room);
            }
        });
        RDV.btnLogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                LoginPageView LPV=new LoginPageView();
                LoginPageController LPC=new LoginPageController(LPV,HM);
                RDV.window.dispose();
            }
        });
    }
    
}
