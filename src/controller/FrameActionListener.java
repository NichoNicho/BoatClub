/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Boat;
import model.Member;
import model.WorkShopException;
import service.CRUDService;
import view.MainForm;

public class FrameActionListener implements ActionListener {

    MainForm mainForm;
    CRUDService cruds = new CRUDService();

    public FrameActionListener(MainForm mainForm) {
        this.mainForm = mainForm;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("ADD MEMBER")) {
            try {
                Member member = new Member();
                member.setMemberId(member.getNewMemberId());
                member.setName(mainForm.getMemberNameTextField().getText());
                mainForm.getMemberNameTextField().setText("");
                member.setPersonalNumber(Integer.valueOf(mainForm.getMemberPersonalNumberTextField().getText()));
                mainForm.getMemberPersonalNumberTextField().setText("");
                cruds.addMember(member);
            } catch (WorkShopException ex) {
                Logger.getLogger(FrameActionListener.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(FrameActionListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (e.getActionCommand().equals("SHOW MEMBER")) {
            try {
                mainForm.getInfoTextArea().setText("");
                Member member = cruds.searchMemberByPersonalNumber(Integer.valueOf(mainForm.getMemberPersonalNumberShowTextField().getText()));
                if (member != null) {
                    String verboseInfo = "name : " + member.getName() + " personal number: " + member.getPersonalNumber() + " member id: " + member.getMemberId() + " boats info: \n";
                    for (Boat boat : member.getBoats()) {
                        verboseInfo += "boat name: " + boat.getId() + " boat size: " + boat.getSize() + " boat type: " + boat.getType() + "\n";
                    }
                    mainForm.getInfoTextArea().setText(verboseInfo);
                }
            } catch (WorkShopException ex) {
                Logger.getLogger(FrameActionListener.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(FrameActionListener.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (e.getActionCommand().equals("SHOW COMPACT")) {
            try {
                mainForm.getInfoTextArea().setText("");
                List<String> infos = cruds.getMembersCompactList();
                String infoStr = "";
                for (String str : infos) {
                    infoStr += str + "\n";
                }
                mainForm.getInfoTextArea().setText(infoStr);
            } catch (WorkShopException ex) {
                Logger.getLogger(FrameActionListener.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(FrameActionListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (e.getActionCommand().equals("SHOW VERBOSE")) {
            try {
                mainForm.getInfoTextArea().setText("");
                List<String> infos = cruds.getMembersVerboseList();
                String infoStr = "";
                for (String str : infos) {
                    infoStr += str + "\n";
                }
                mainForm.getInfoTextArea().setText(infoStr);
            } catch (WorkShopException ex) {
                Logger.getLogger(FrameActionListener.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(FrameActionListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (e.getActionCommand().equals("DELETE PERSONAL")) {
            try {
                Member member = cruds.searchMemberByPersonalNumber(Integer.valueOf(mainForm.getMemberPersonalNumberDeleteTextField().getText()));
                if (member != null) {
                    cruds.deleteMember(member);
                    mainForm.getMemberPersonalNumberDeleteTextField().setText("");
                }
            } catch (WorkShopException ex) {
                Logger.getLogger(FrameActionListener.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(FrameActionListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (e.getActionCommand().equals("DELETE ID")) {
            try {
                Member member = cruds.searchMemberByMemberId(Long.valueOf(mainForm.getMemberIdDeleteTextField().getText()));
                if (member != null) {
                    cruds.deleteMember(member);
                    mainForm.getMemberIdDeleteTextField().setText("");
                }
            } catch (WorkShopException ex) {
                Logger.getLogger(FrameActionListener.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(FrameActionListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (e.getActionCommand().equals("SHOW UPDATE MEMBER")) {
            try {
                mainForm.getMemberNameUpdateTextField().setText("");
                mainForm.getMemberPersonalNumberUpdateNewTextField().setText("");
                Member member = cruds.searchMemberByPersonalNumber(Integer.valueOf(mainForm.getMemberPersonalNumberUpdateTextField().getText()));
                mainForm.getMemberNameUpdateTextField().setText(member.getName());
                mainForm.getMemberPersonalNumberUpdateNewTextField().setText(member.getPersonalNumber().toString());
                mainForm.getMemberPersonalNumberUpdateTextField().setEditable(false);
            } catch (WorkShopException ex) {
                Logger.getLogger(FrameActionListener.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(FrameActionListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (e.getActionCommand().equals("CANCEL UPDATE MEMBER")) {
            try {
                mainForm.getMemberNameUpdateTextField().setText("");
                mainForm.getMemberPersonalNumberUpdateNewTextField().setText("");
                mainForm.getMemberPersonalNumberUpdateTextField().setText("");
                mainForm.getMemberPersonalNumberUpdateTextField().setEditable(true);
            } catch (Exception ex) {
                Logger.getLogger(FrameActionListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (e.getActionCommand().equals("UPDATE MEMBER")) {
            try {
                Member member = cruds.searchMemberByPersonalNumber(Integer.valueOf(mainForm.getMemberPersonalNumberUpdateTextField().getText()));
                member.setName(mainForm.getMemberNameUpdateTextField().getText());
                member.setPersonalNumber(Integer.valueOf(mainForm.getMemberPersonalNumberUpdateNewTextField().getText()));
                cruds.updateMember(member);
                mainForm.getMemberNameUpdateTextField().setText("");
                mainForm.getMemberPersonalNumberUpdateNewTextField().setText("");
                mainForm.getMemberPersonalNumberUpdateTextField().setText("");
                mainForm.getMemberPersonalNumberUpdateTextField().setEditable(true);
            } catch (WorkShopException ex) {
                Logger.getLogger(FrameActionListener.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(FrameActionListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (e.getActionCommand().equals("ADD BOAT")) {
            try {
                Member member = cruds.searchMemberByPersonalNumber(Integer.valueOf(mainForm.getBoatMemberPersonalNumberTextField().getText()));
                Boat boat = new Boat();
                boat.setId(boat.getNewId());
                boat.setSize(Long.valueOf(mainForm.getBoatSizeTextField().getText()));
                boat.setType(Boat.Type.valueOf(mainForm.getBoatTypeComboBox().getSelectedItem().toString()));
                cruds.addBoat(member, boat);
                mainForm.getBoatMemberPersonalNumberTextField().setText("");
                mainForm.getBoatSizeTextField().setText("");

            } catch (WorkShopException ex) {
                Logger.getLogger(FrameActionListener.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(FrameActionListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (e.getActionCommand().equals("DELETE BOAT")) {
            try {
                Boat boat = cruds.searchBoatById(Long.valueOf(mainForm.getBoatIdDeleteTextField().getText()));
                if (boat != null) {
                    cruds.deleteBoat(boat);
                    mainForm.getBoatIdDeleteTextField().setText("");
                }
            } catch (WorkShopException ex) {
                Logger.getLogger(FrameActionListener.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(FrameActionListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (e.getActionCommand().equals("SHOW UPDATE BOAT")) {
            try {
                mainForm.getBoatSizeUpdateTextField().setText("");
                mainForm.getBoatMemberPersonalNumberUpdateTextField().setText("");
                Boat boat = cruds.searchBoatById(Long.valueOf(mainForm.getBoatIdUpdateTextField().getText()));
                if (boat != null) {
                    mainForm.getBoatSizeUpdateTextField().setText(boat.getSize().toString());
                    mainForm.getBoatMemberPersonalNumberUpdateTextField().setText(boat.getMember().getPersonalNumber().toString());
                    mainForm.getBoatTypeUpdateComboBox().setSelectedItem(boat.getType().toString());
                    mainForm.getBoatIdUpdateTextField().setEditable(false);
                }
            } catch (WorkShopException ex) {
                Logger.getLogger(FrameActionListener.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(FrameActionListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (e.getActionCommand().equals("CANCEL UPDATE BOAT")) {
            try {
                mainForm.getBoatSizeUpdateTextField().setText("");
                mainForm.getBoatMemberPersonalNumberUpdateTextField().setText("");
                mainForm.getBoatIdUpdateTextField().setEditable(true);
            } catch (Exception ex) {
                Logger.getLogger(FrameActionListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (e.getActionCommand().equals("UPDATE BOAT")) {
            try {
                Boat boat = cruds.searchBoatById(Long.valueOf(mainForm.getBoatIdUpdateTextField().getText()));
                Member member = cruds.searchMemberByPersonalNumber(Integer.valueOf(mainForm.getBoatMemberPersonalNumberUpdateTextField().getText()));
                if (member != null && boat != null) {
                    boat.setSize(Long.valueOf(mainForm.getBoatSizeUpdateTextField().getText()));
                    boat.setType(Boat.Type.valueOf(mainForm.getBoatTypeUpdateComboBox().getSelectedItem().toString()));
                    cruds.updateBoat(boat,member);
                    mainForm.getBoatSizeUpdateTextField().setText("");
                    mainForm.getBoatMemberPersonalNumberUpdateTextField().setText("");
                    mainForm.getBoatIdUpdateTextField().setText("");
                    mainForm.getBoatIdUpdateTextField().setEditable(true);
                }

            } catch (WorkShopException ex) {
                Logger.getLogger(FrameActionListener.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(FrameActionListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
