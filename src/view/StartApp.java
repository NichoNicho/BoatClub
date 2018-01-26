package view;

import model.Boat;
import model.Member;
import model.WorkShopException;
import service.FileService;

import java.util.ArrayList;
import java.util.List;

public class StartApp {

    private static List<Member> members = new ArrayList<Member>();
    private static List<Boat> boats = new ArrayList<Boat>();

    public StartApp() {
        try {
            try {
                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
            } catch (ClassNotFoundException ex) {
                java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }

            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new MainForm().setVisible(true);
                }
            });

            setMembers(FileService.readMembers());
            setBoats(FileService.readBoats());
        } catch (WorkShopException e) {
            e.printStackTrace();
        }

    }

    public static void main(String args[]) {
        StartApp app = new StartApp();
    }

    public static List<Member> getMembers() {
        return members;
    }

    public static void setMembers(List<Member> members) {
        StartApp.members = members;
    }

    public static List<Boat> getBoats() {
        return boats;
    }

    public static void setBoats(List<Boat> boats) {
        StartApp.boats = boats;
    }
}
