/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package revisi;
import control.LoginPageController;
import model.HostelryModel;
import view.LoginPageView;
import model.HostelryModel;
import view.LoginPageView;

/**
 *
 * @author ASUS
 */
public class Revisi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LoginPageView LP=new LoginPageView();
        HostelryModel HM=new HostelryModel();
        LoginPageController LPC=new LoginPageController(LP,HM);
        LP.setVisible(true);
    }
    
}
