
package view;
import controller.FrameActionListener;

public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        memberNameLabel = new javax.swing.JLabel();
        memberPersonalNumberLabel = new javax.swing.JLabel();
        memberNameTextField = new javax.swing.JTextField();
        memberPersonalNumberTextField = new javax.swing.JTextField();
        addMemberButton = new javax.swing.JButton();
        delimeterLabel1 = new java.awt.Label();
        showMembersLabel = new java.awt.Label();
        compactShowLastMembersButton = new javax.swing.JButton();
        verboseShowLastMembersButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        infoTextArea = new javax.swing.JTextArea();
        delimeterLabel2 = new java.awt.Label();
        memberPersonalNumberDeleteTextField = new javax.swing.JTextField();
        memberPersonalNumberDeleteLabel = new javax.swing.JLabel();
        deleteMemberByPeronalNumberButton = new javax.swing.JButton();
        memberIdDeleteLabel = new javax.swing.JLabel();
        memberIdDeleteTextField = new javax.swing.JTextField();
        deleteMemberByMemberIdButton = new javax.swing.JButton();
        showMembersLabel1 = new java.awt.Label();
        memberPersonalNumberShowTextField = new javax.swing.JTextField();
        showMemberByPeronalNumberButton = new javax.swing.JButton();
        delimeterLabel5 = new java.awt.Label();
        memberPersonalNumberUpdateTextField = new javax.swing.JTextField();
        memberPersonalNumberUpdateLabel = new javax.swing.JLabel();
        updateMemberByPeronalNumberShowButton = new javax.swing.JButton();
        memberNameUpdateLabel = new javax.swing.JLabel();
        memberNameUpdateTextField = new javax.swing.JTextField();
        memberPersonalNumberUpdateNewLabel = new javax.swing.JLabel();
        memberPersonalNumberUpdateNewTextField = new javax.swing.JTextField();
        updateMemberButton = new javax.swing.JButton();
        cancelUpdateMemberButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        boatSizeTextField = new javax.swing.JTextField();
        boatSizeLabel = new javax.swing.JLabel();
        boatTypeLabel = new javax.swing.JLabel();
        boatTypeComboBox = new javax.swing.JComboBox();
        boatMemberPersonalNumberTextField = new javax.swing.JTextField();
        boatMemberPersonalNumberLabel = new javax.swing.JLabel();
        addBoatButton = new javax.swing.JButton();
        delimeterLabel3 = new java.awt.Label();
        boatIdDeleteLabel = new javax.swing.JLabel();
        boatIdDeleteTextField = new javax.swing.JTextField();
        deleteBoatByIdButton = new javax.swing.JButton();
        delimeterLabel4 = new java.awt.Label();
        boatIdUpdateLabel = new javax.swing.JLabel();
        updateBoatShowButton = new javax.swing.JButton();
        boatSizeUpdateLabel = new javax.swing.JLabel();
        boatSizeUpdateTextField = new javax.swing.JTextField();
        boatTypeUpdateLabel = new javax.swing.JLabel();
        boatTypeUpdateComboBox = new javax.swing.JComboBox();
        boatMemberPersonalNumberUpdateLabel = new javax.swing.JLabel();
        updateBoatButton = new javax.swing.JButton();
        boatMemberPersonalNumberUpdateTextField = new javax.swing.JTextField();
        cancelUpdateBoatButton = new javax.swing.JButton();
        boatIdUpdateTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        memberNameLabel.setText("Name: ");

        memberPersonalNumberLabel.setText("Personal Number: ");

        addMemberButton.setText("ADD MEMBER");

        delimeterLabel1.setText("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

        showMembersLabel.setText("show specific Member's info(by personal number)");

        compactShowLastMembersButton.setText("SHOW COMPACT");

        verboseShowLastMembersButton.setText("SHOW VERBOSE");

        infoTextArea.setColumns(20);
        infoTextArea.setRows(5);
        jScrollPane1.setViewportView(infoTextArea);

        delimeterLabel2.setText("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

        memberPersonalNumberDeleteLabel.setText("Personal Number: ");

        deleteMemberByPeronalNumberButton.setText("DELETE");
        deleteMemberByPeronalNumberButton.setActionCommand("DELETE PERSONAL");

        memberIdDeleteLabel.setText("member Id:");

        deleteMemberByMemberIdButton.setText("DELETE");
        deleteMemberByMemberIdButton.setActionCommand("DELETE ID");

        showMembersLabel1.setText("show last updated Members");

        showMemberByPeronalNumberButton.setText("SHOW MEMBER");

        delimeterLabel5.setText("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

        memberPersonalNumberUpdateLabel.setText("Personal Number: ");

        updateMemberByPeronalNumberShowButton.setText("SHOW");
        updateMemberByPeronalNumberShowButton.setActionCommand("SHOW UPDATE MEMBER");

        memberNameUpdateLabel.setText("Name: ");

        memberPersonalNumberUpdateNewLabel.setText("New Personal Number: ");

        updateMemberButton.setText("UPDATE");
        updateMemberButton.setActionCommand("UPDATE MEMBER");

        cancelUpdateMemberButton.setText("CANCEL");
        cancelUpdateMemberButton.setActionCommand("CANCEL UPDATE MEMBER");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(memberNameLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(memberNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(memberPersonalNumberLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(memberPersonalNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(91, 91, 91)
                                .addComponent(addMemberButton))
                            .addComponent(delimeterLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(delimeterLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(memberPersonalNumberDeleteLabel)
                                .addGap(30, 30, 30)
                                .addComponent(memberPersonalNumberDeleteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(deleteMemberByPeronalNumberButton))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(memberIdDeleteLabel)
                                .addGap(63, 63, 63)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(memberIdDeleteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(209, 209, 209)
                                        .addComponent(deleteMemberByMemberIdButton))))
                            .addComponent(delimeterLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(showMembersLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(127, 127, 127)
                                    .addComponent(compactShowLastMembersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(39, 39, 39)
                                    .addComponent(verboseShowLastMembersButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(memberNameUpdateLabel)
                                    .addComponent(memberPersonalNumberUpdateNewLabel)
                                    .addComponent(memberPersonalNumberUpdateLabel))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(memberPersonalNumberUpdateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(memberPersonalNumberUpdateNewTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(memberNameUpdateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(updateMemberButton)
                                        .addGap(44, 44, 44)
                                        .addComponent(cancelUpdateMemberButton))
                                    .addComponent(updateMemberByPeronalNumberShowButton))))
                        .addContainerGap(53, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(showMembersLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(memberPersonalNumberShowTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(showMemberByPeronalNumberButton)
                        .addGap(73, 73, 73))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(memberNameLabel)
                    .addComponent(memberNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(memberPersonalNumberLabel)
                            .addComponent(memberPersonalNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(addMemberButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(delimeterLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(showMemberByPeronalNumberButton, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(memberPersonalNumberShowTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(showMembersLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(showMembersLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(verboseShowLastMembersButton)
                        .addComponent(compactShowLastMembersButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(delimeterLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(memberPersonalNumberDeleteLabel)
                    .addComponent(memberPersonalNumberDeleteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteMemberByPeronalNumberButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(memberIdDeleteLabel)
                    .addComponent(memberIdDeleteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteMemberByMemberIdButton))
                .addGap(2, 2, 2)
                .addComponent(delimeterLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(memberPersonalNumberUpdateLabel)
                    .addComponent(memberPersonalNumberUpdateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateMemberByPeronalNumberShowButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(memberNameUpdateLabel)
                    .addComponent(memberNameUpdateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(memberPersonalNumberUpdateNewLabel)
                            .addComponent(memberPersonalNumberUpdateNewTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(updateMemberButton)
                            .addComponent(cancelUpdateMemberButton))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        addMemberButton.addActionListener(new FrameActionListener(this));
        showMembersLabel.getAccessibleContext().setAccessibleName("");
        compactShowLastMembersButton.addActionListener(new FrameActionListener(this));
        verboseShowLastMembersButton.addActionListener(new FrameActionListener(this));
        deleteMemberByPeronalNumberButton.addActionListener(new FrameActionListener(this));
        deleteMemberByMemberIdButton.addActionListener(new FrameActionListener(this));
        showMemberByPeronalNumberButton.addActionListener(new FrameActionListener(this));
        updateMemberByPeronalNumberShowButton.addActionListener(new FrameActionListener(this));
        updateMemberButton.addActionListener(new FrameActionListener(this));
        cancelUpdateMemberButton.addActionListener(new FrameActionListener(this));

        jTabbedPane1.addTab("Members", jPanel1);

        boatSizeLabel.setText("length: ");

        boatTypeLabel.setText("type: ");

        boatTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sailboat", "Motorsailer", "kayak_Canoe", "Other" }));

        boatMemberPersonalNumberLabel.setText("member Personal Number: ");

        addBoatButton.setText("ADD BOAT");

        delimeterLabel3.setText("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

        boatIdDeleteLabel.setText("boat id: ");

        deleteBoatByIdButton.setText("DELETE");
        deleteBoatByIdButton.setActionCommand("DELETE BOAT");

        delimeterLabel4.setText("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

        boatIdUpdateLabel.setText("boat id: ");

        updateBoatShowButton.setText("SHOW");
        updateBoatShowButton.setActionCommand("SHOW UPDATE BOAT");

        boatSizeUpdateLabel.setText("length: ");

        boatTypeUpdateLabel.setText("type: ");

        boatTypeUpdateComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sailboat", "Motorsailer", "kayak_Canoe", "Other" }));

        boatMemberPersonalNumberUpdateLabel.setText("member Personal Number: ");

        updateBoatButton.setText("UPDATE");
        updateBoatButton.setActionCommand("UPDATE BOAT");

        cancelUpdateBoatButton.setText("CANCEL");
        cancelUpdateBoatButton.setActionCommand("CANCEL UPDATE BOAT");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(delimeterLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boatSizeLabel)
                            .addComponent(boatTypeLabel))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boatSizeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boatTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(boatMemberPersonalNumberLabel)
                                .addGap(44, 44, 44)
                                .addComponent(boatMemberPersonalNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(addBoatButton)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(boatIdDeleteLabel)
                        .addGap(30, 30, 30)
                        .addComponent(boatIdDeleteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(deleteBoatByIdButton))
                    .addComponent(delimeterLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boatSizeUpdateLabel)
                            .addComponent(boatTypeUpdateLabel)
                            .addComponent(boatIdUpdateLabel))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(boatIdUpdateTextField)
                            .addComponent(boatSizeUpdateTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                            .addComponent(boatTypeUpdateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(boatMemberPersonalNumberUpdateLabel)
                                        .addGap(44, 44, 44)
                                        .addComponent(boatMemberPersonalNumberUpdateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(updateBoatButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cancelUpdateBoatButton))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(updateBoatShowButton)))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boatSizeLabel)
                    .addComponent(boatSizeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boatMemberPersonalNumberLabel)
                    .addComponent(boatMemberPersonalNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boatTypeLabel)
                    .addComponent(boatTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addBoatButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(delimeterLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boatIdDeleteLabel)
                    .addComponent(boatIdDeleteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBoatByIdButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(delimeterLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boatIdUpdateLabel)
                    .addComponent(updateBoatShowButton)
                    .addComponent(boatIdUpdateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boatSizeUpdateLabel)
                    .addComponent(boatSizeUpdateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boatMemberPersonalNumberUpdateLabel)
                    .addComponent(boatMemberPersonalNumberUpdateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boatTypeUpdateLabel)
                    .addComponent(boatTypeUpdateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateBoatButton)
                    .addComponent(cancelUpdateBoatButton))
                .addContainerGap(224, Short.MAX_VALUE))
        );

        addBoatButton.addActionListener(new FrameActionListener(this));
        deleteBoatByIdButton.addActionListener(new FrameActionListener(this));
        updateBoatShowButton.addActionListener(new FrameActionListener(this));
        updateBoatButton.addActionListener(new FrameActionListener(this));
        cancelUpdateBoatButton.addActionListener(new FrameActionListener(this));

        jTabbedPane1.addTab("Boats", jPanel2);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBoatButton;
    private javax.swing.JButton addMemberButton;
    private javax.swing.JLabel boatIdDeleteLabel;
    private javax.swing.JTextField boatIdDeleteTextField;
    private javax.swing.JLabel boatIdUpdateLabel;
    private javax.swing.JTextField boatIdUpdateTextField;
    private javax.swing.JLabel boatMemberPersonalNumberLabel;
    private javax.swing.JTextField boatMemberPersonalNumberTextField;
    private javax.swing.JLabel boatMemberPersonalNumberUpdateLabel;
    private javax.swing.JTextField boatMemberPersonalNumberUpdateTextField;
    private javax.swing.JLabel boatSizeLabel;
    private javax.swing.JTextField boatSizeTextField;
    private javax.swing.JLabel boatSizeUpdateLabel;
    private javax.swing.JTextField boatSizeUpdateTextField;
    private javax.swing.JComboBox boatTypeComboBox;
    private javax.swing.JLabel boatTypeLabel;
    private javax.swing.JComboBox boatTypeUpdateComboBox;
    private javax.swing.JLabel boatTypeUpdateLabel;
    private javax.swing.JButton cancelUpdateBoatButton;
    private javax.swing.JButton cancelUpdateMemberButton;
    private javax.swing.JButton compactShowLastMembersButton;
    private javax.swing.JButton deleteBoatByIdButton;
    private javax.swing.JButton deleteMemberByMemberIdButton;
    private javax.swing.JButton deleteMemberByPeronalNumberButton;
    private java.awt.Label delimeterLabel1;
    private java.awt.Label delimeterLabel2;
    private java.awt.Label delimeterLabel3;
    private java.awt.Label delimeterLabel4;
    private java.awt.Label delimeterLabel5;
    private javax.swing.JTextArea infoTextArea;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel memberIdDeleteLabel;
    private javax.swing.JTextField memberIdDeleteTextField;
    private javax.swing.JLabel memberNameLabel;
    private javax.swing.JTextField memberNameTextField;
    private javax.swing.JLabel memberNameUpdateLabel;
    private javax.swing.JTextField memberNameUpdateTextField;
    private javax.swing.JLabel memberPersonalNumberDeleteLabel;
    private javax.swing.JTextField memberPersonalNumberDeleteTextField;
    private javax.swing.JLabel memberPersonalNumberLabel;
    public javax.swing.JTextField memberPersonalNumberShowTextField;
    private javax.swing.JTextField memberPersonalNumberTextField;
    private javax.swing.JLabel memberPersonalNumberUpdateLabel;
    private javax.swing.JLabel memberPersonalNumberUpdateNewLabel;
    private javax.swing.JTextField memberPersonalNumberUpdateNewTextField;
    private javax.swing.JTextField memberPersonalNumberUpdateTextField;
    private javax.swing.JButton showMemberByPeronalNumberButton;
    private java.awt.Label showMembersLabel;
    private java.awt.Label showMembersLabel1;
    private javax.swing.JButton updateBoatButton;
    private javax.swing.JButton updateBoatShowButton;
    private javax.swing.JButton updateMemberButton;
    private javax.swing.JButton updateMemberByPeronalNumberShowButton;
    private javax.swing.JButton verboseShowLastMembersButton;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the addBoatButton
     */
    public javax.swing.JButton getAddBoatButton() {
        return addBoatButton;
    }

    /**
     * @param addBoatButton the addBoatButton to set
     */
    public void setAddBoatButton(javax.swing.JButton addBoatButton) {
        this.addBoatButton = addBoatButton;
    }

    /**
     * @return the addMemberButton
     */
    public javax.swing.JButton getAddMemberButton() {
        return addMemberButton;
    }

    /**
     * @param addMemberButton the addMemberButton to set
     */
    public void setAddMemberButton(javax.swing.JButton addMemberButton) {
        this.addMemberButton = addMemberButton;
    }

    /**
     * @return the boatIdDeleteLabel
     */
    public javax.swing.JLabel getBoatIdDeleteLabel() {
        return boatIdDeleteLabel;
    }

    /**
     * @param boatIdDeleteLabel the boatIdDeleteLabel to set
     */
    public void setBoatIdDeleteLabel(javax.swing.JLabel boatIdDeleteLabel) {
        this.boatIdDeleteLabel = boatIdDeleteLabel;
    }

    /**
     * @return the boatIdDeleteTextField
     */
    public javax.swing.JTextField getBoatIdDeleteTextField() {
        return boatIdDeleteTextField;
    }

    /**
     * @param boatIdDeleteTextField the boatIdDeleteTextField to set
     */
    public void setBoatIdDeleteTextField(javax.swing.JTextField boatIdDeleteTextField) {
        this.boatIdDeleteTextField = boatIdDeleteTextField;
    }

    /**
     * @return the boatIdDeleteTextField1
     */
    public javax.swing.JTextField getBoatIdDeleteTextField1() {
        return getBoatIdUpdateTextField();
    }

    /**
     * @param boatIdDeleteTextField1 the boatIdDeleteTextField1 to set
     */
    public void setBoatIdDeleteTextField1(javax.swing.JTextField boatIdDeleteTextField1) {
        this.setBoatIdUpdateTextField(boatIdDeleteTextField1);
    }

    /**
     * @return the boatIdUpdateLabel
     */
    public javax.swing.JLabel getBoatIdUpdateLabel() {
        return boatIdUpdateLabel;
    }

    /**
     * @param boatIdUpdateLabel the boatIdUpdateLabel to set
     */
    public void setBoatIdUpdateLabel(javax.swing.JLabel boatIdUpdateLabel) {
        this.boatIdUpdateLabel = boatIdUpdateLabel;
    }

    /**
     * @return the boatMemberPersonalNumberLabel
     */
    public javax.swing.JLabel getBoatMemberPersonalNumberLabel() {
        return boatMemberPersonalNumberLabel;
    }

    /**
     * @param boatMemberPersonalNumberLabel the boatMemberPersonalNumberLabel to set
     */
    public void setBoatMemberPersonalNumberLabel(javax.swing.JLabel boatMemberPersonalNumberLabel) {
        this.boatMemberPersonalNumberLabel = boatMemberPersonalNumberLabel;
    }

    /**
     * @return the boatMemberPersonalNumberTextField
     */
    public javax.swing.JTextField getBoatMemberPersonalNumberTextField() {
        return boatMemberPersonalNumberTextField;
    }

    /**
     * @param boatMemberPersonalNumberTextField the boatMemberPersonalNumberTextField to set
     */
    public void setBoatMemberPersonalNumberTextField(javax.swing.JTextField boatMemberPersonalNumberTextField) {
        this.boatMemberPersonalNumberTextField = boatMemberPersonalNumberTextField;
    }

    /**
     * @return the boatMemberPersonalNumberUpdateLabel
     */
    public javax.swing.JLabel getBoatMemberPersonalNumberUpdateLabel() {
        return boatMemberPersonalNumberUpdateLabel;
    }

    /**
     * @param boatMemberPersonalNumberUpdateLabel the boatMemberPersonalNumberUpdateLabel to set
     */
    public void setBoatMemberPersonalNumberUpdateLabel(javax.swing.JLabel boatMemberPersonalNumberUpdateLabel) {
        this.boatMemberPersonalNumberUpdateLabel = boatMemberPersonalNumberUpdateLabel;
    }

    /**
     * @return the boatMemberPersonalNumberUpdateTextField
     */
    public javax.swing.JTextField getBoatMemberPersonalNumberUpdateTextField() {
        return boatMemberPersonalNumberUpdateTextField;
    }

    /**
     * @param boatMemberPersonalNumberUpdateTextField the boatMemberPersonalNumberUpdateTextField to set
     */
    public void setBoatMemberPersonalNumberUpdateTextField(javax.swing.JTextField boatMemberPersonalNumberUpdateTextField) {
        this.boatMemberPersonalNumberUpdateTextField = boatMemberPersonalNumberUpdateTextField;
    }

    /**
     * @return the boatSizeLabel
     */
    public javax.swing.JLabel getBoatSizeLabel() {
        return boatSizeLabel;
    }

    /**
     * @param boatSizeLabel the boatSizeLabel to set
     */
    public void setBoatSizeLabel(javax.swing.JLabel boatSizeLabel) {
        this.boatSizeLabel = boatSizeLabel;
    }

    /**
     * @return the boatSizeTextField
     */
    public javax.swing.JTextField getBoatSizeTextField() {
        return boatSizeTextField;
    }

    /**
     * @param boatSizeTextField the boatSizeTextField to set
     */
    public void setBoatSizeTextField(javax.swing.JTextField boatSizeTextField) {
        this.boatSizeTextField = boatSizeTextField;
    }

    /**
     * @return the boatSizeUpdateLabel
     */
    public javax.swing.JLabel getBoatSizeUpdateLabel() {
        return boatSizeUpdateLabel;
    }

    /**
     * @param boatSizeUpdateLabel the boatSizeUpdateLabel to set
     */
    public void setBoatSizeUpdateLabel(javax.swing.JLabel boatSizeUpdateLabel) {
        this.boatSizeUpdateLabel = boatSizeUpdateLabel;
    }

    /**
     * @return the boatSizeUpdateTextField
     */
    public javax.swing.JTextField getBoatSizeUpdateTextField() {
        return boatSizeUpdateTextField;
    }

    /**
     * @param boatSizeUpdateTextField the boatSizeUpdateTextField to set
     */
    public void setBoatSizeUpdateTextField(javax.swing.JTextField boatSizeUpdateTextField) {
        this.boatSizeUpdateTextField = boatSizeUpdateTextField;
    }

    /**
     * @return the boatTypeComboBox
     */
    public javax.swing.JComboBox getBoatTypeComboBox() {
        return boatTypeComboBox;
    }

    /**
     * @param boatTypeComboBox the boatTypeComboBox to set
     */
    public void setBoatTypeComboBox(javax.swing.JComboBox boatTypeComboBox) {
        this.boatTypeComboBox = boatTypeComboBox;
    }

    /**
     * @return the boatTypeLabel
     */
    public javax.swing.JLabel getBoatTypeLabel() {
        return boatTypeLabel;
    }

    /**
     * @param boatTypeLabel the boatTypeLabel to set
     */
    public void setBoatTypeLabel(javax.swing.JLabel boatTypeLabel) {
        this.boatTypeLabel = boatTypeLabel;
    }

    /**
     * @return the boatTypeUpdateComboBox
     */
    public javax.swing.JComboBox getBoatTypeUpdateComboBox() {
        return boatTypeUpdateComboBox;
    }

    /**
     * @param boatTypeUpdateComboBox the boatTypeUpdateComboBox to set
     */
    public void setBoatTypeUpdateComboBox(javax.swing.JComboBox boatTypeUpdateComboBox) {
        this.boatTypeUpdateComboBox = boatTypeUpdateComboBox;
    }

    /**
     * @return the boatTypeUpdateLabel
     */
    public javax.swing.JLabel getBoatTypeUpdateLabel() {
        return boatTypeUpdateLabel;
    }

    /**
     * @param boatTypeUpdateLabel the boatTypeUpdateLabel to set
     */
    public void setBoatTypeUpdateLabel(javax.swing.JLabel boatTypeUpdateLabel) {
        this.boatTypeUpdateLabel = boatTypeUpdateLabel;
    }

    /**
     * @return the compactShowLastMembersButton
     */
    public javax.swing.JButton getCompactShowLastMembersButton() {
        return compactShowLastMembersButton;
    }

    /**
     * @param compactShowLastMembersButton the compactShowLastMembersButton to set
     */
    public void setCompactShowLastMembersButton(javax.swing.JButton compactShowLastMembersButton) {
        this.compactShowLastMembersButton = compactShowLastMembersButton;
    }

    /**
     * @return the deleteBoatByIdButton
     */
    public javax.swing.JButton getDeleteBoatByIdButton() {
        return deleteBoatByIdButton;
    }

    /**
     * @param deleteBoatByIdButton the deleteBoatByIdButton to set
     */
    public void setDeleteBoatByIdButton(javax.swing.JButton deleteBoatByIdButton) {
        this.deleteBoatByIdButton = deleteBoatByIdButton;
    }

    /**
     * @return the deleteMemberByMemberIdButton
     */
    public javax.swing.JButton getDeleteMemberByMemberIdButton() {
        return deleteMemberByMemberIdButton;
    }

    /**
     * @param deleteMemberByMemberIdButton the deleteMemberByMemberIdButton to set
     */
    public void setDeleteMemberByMemberIdButton(javax.swing.JButton deleteMemberByMemberIdButton) {
        this.deleteMemberByMemberIdButton = deleteMemberByMemberIdButton;
    }

    /**
     * @return the deleteMemberByPeronalNumberButton
     */
    public javax.swing.JButton getDeleteMemberByPeronalNumberButton() {
        return deleteMemberByPeronalNumberButton;
    }

    /**
     * @param deleteMemberByPeronalNumberButton the deleteMemberByPeronalNumberButton to set
     */
    public void setDeleteMemberByPeronalNumberButton(javax.swing.JButton deleteMemberByPeronalNumberButton) {
        this.deleteMemberByPeronalNumberButton = deleteMemberByPeronalNumberButton;
    }

    /**
     * @return the delimeterLabel1
     */
    public java.awt.Label getDelimeterLabel1() {
        return delimeterLabel1;
    }

    /**
     * @param delimeterLabel1 the delimeterLabel1 to set
     */
    public void setDelimeterLabel1(java.awt.Label delimeterLabel1) {
        this.delimeterLabel1 = delimeterLabel1;
    }

    /**
     * @return the delimeterLabel2
     */
    public java.awt.Label getDelimeterLabel2() {
        return delimeterLabel2;
    }

    /**
     * @param delimeterLabel2 the delimeterLabel2 to set
     */
    public void setDelimeterLabel2(java.awt.Label delimeterLabel2) {
        this.delimeterLabel2 = delimeterLabel2;
    }

    /**
     * @return the delimeterLabel3
     */
    public java.awt.Label getDelimeterLabel3() {
        return delimeterLabel3;
    }

    /**
     * @param delimeterLabel3 the delimeterLabel3 to set
     */
    public void setDelimeterLabel3(java.awt.Label delimeterLabel3) {
        this.delimeterLabel3 = delimeterLabel3;
    }

    /**
     * @return the delimeterLabel4
     */
    public java.awt.Label getDelimeterLabel4() {
        return delimeterLabel4;
    }

    /**
     * @param delimeterLabel4 the delimeterLabel4 to set
     */
    public void setDelimeterLabel4(java.awt.Label delimeterLabel4) {
        this.delimeterLabel4 = delimeterLabel4;
    }

    /**
     * @return the delimeterLabel5
     */
    public java.awt.Label getDelimeterLabel5() {
        return delimeterLabel5;
    }

    /**
     * @param delimeterLabel5 the delimeterLabel5 to set
     */
    public void setDelimeterLabel5(java.awt.Label delimeterLabel5) {
        this.delimeterLabel5 = delimeterLabel5;
    }

    /**
     * @return the jPanel1
     */
    public javax.swing.JPanel getjPanel1() {
        return jPanel1;
    }

    /**
     * @param jPanel1 the jPanel1 to set
     */
    public void setjPanel1(javax.swing.JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    /**
     * @return the jPanel2
     */
    public javax.swing.JPanel getjPanel2() {
        return jPanel2;
    }

    /**
     * @param jPanel2 the jPanel2 to set
     */
    public void setjPanel2(javax.swing.JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }

    /**
     * @return the jScrollPane1
     */
    public javax.swing.JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    /**
     * @param jScrollPane1 the jScrollPane1 to set
     */
    public void setjScrollPane1(javax.swing.JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    /**
     * @return the jTabbedPane1
     */
    public javax.swing.JTabbedPane getjTabbedPane1() {
        return jTabbedPane1;
    }

    /**
     * @param jTabbedPane1 the jTabbedPane1 to set
     */
    public void setjTabbedPane1(javax.swing.JTabbedPane jTabbedPane1) {
        this.jTabbedPane1 = jTabbedPane1;
    }

    /**
     * @return the jTextArea1
     */
    public javax.swing.JTextArea getjTextArea1() {
        return getInfoTextArea();
    }

    /**
     * @param jTextArea1 the jTextArea1 to set
     */
    public void setjTextArea1(javax.swing.JTextArea jTextArea1) {
        this.setInfoTextArea(jTextArea1);
    }

    /**
     * @return the memberIdDeleteLabel
     */
    public javax.swing.JLabel getMemberIdDeleteLabel() {
        return memberIdDeleteLabel;
    }

    /**
     * @param memberIdDeleteLabel the memberIdDeleteLabel to set
     */
    public void setMemberIdDeleteLabel(javax.swing.JLabel memberIdDeleteLabel) {
        this.memberIdDeleteLabel = memberIdDeleteLabel;
    }

    /**
     * @return the memberIdDeleteTextField
     */
    public javax.swing.JTextField getMemberIdDeleteTextField() {
        return memberIdDeleteTextField;
    }

    /**
     * @param memberIdDeleteTextField the memberIdDeleteTextField to set
     */
    public void setMemberIdDeleteTextField(javax.swing.JTextField memberIdDeleteTextField) {
        this.memberIdDeleteTextField = memberIdDeleteTextField;
    }

    /**
     * @return the memberNameLabel
     */
    public javax.swing.JLabel getMemberNameLabel() {
        return memberNameLabel;
    }

    /**
     * @param memberNameLabel the memberNameLabel to set
     */
    public void setMemberNameLabel(javax.swing.JLabel memberNameLabel) {
        this.memberNameLabel = memberNameLabel;
    }

    /**
     * @return the memberNameTextField
     */
    public javax.swing.JTextField getMemberNameTextField() {
        return memberNameTextField;
    }

    /**
     * @param memberNameTextField the memberNameTextField to set
     */
    public void setMemberNameTextField(javax.swing.JTextField memberNameTextField) {
        this.memberNameTextField = memberNameTextField;
    }

    /**
     * @return the memberNameUpdateLabel
     */
    public javax.swing.JLabel getMemberNameUpdateLabel() {
        return memberNameUpdateLabel;
    }

    /**
     * @param memberNameUpdateLabel the memberNameUpdateLabel to set
     */
    public void setMemberNameUpdateLabel(javax.swing.JLabel memberNameUpdateLabel) {
        this.memberNameUpdateLabel = memberNameUpdateLabel;
    }

    /**
     * @return the memberNameUpdateTextField
     */
    public javax.swing.JTextField getMemberNameUpdateTextField() {
        return memberNameUpdateTextField;
    }

    /**
     * @param memberNameUpdateTextField the memberNameUpdateTextField to set
     */
    public void setMemberNameUpdateTextField(javax.swing.JTextField memberNameUpdateTextField) {
        this.memberNameUpdateTextField = memberNameUpdateTextField;
    }

    /**
     * @return the memberPersonalNumberDeleteLabel
     */
    public javax.swing.JLabel getMemberPersonalNumberDeleteLabel() {
        return memberPersonalNumberDeleteLabel;
    }

    /**
     * @param memberPersonalNumberDeleteLabel the memberPersonalNumberDeleteLabel to set
     */
    public void setMemberPersonalNumberDeleteLabel(javax.swing.JLabel memberPersonalNumberDeleteLabel) {
        this.memberPersonalNumberDeleteLabel = memberPersonalNumberDeleteLabel;
    }

    /**
     * @return the memberPersonalNumberDeleteTextField
     */
    public javax.swing.JTextField getMemberPersonalNumberDeleteTextField() {
        return memberPersonalNumberDeleteTextField;
    }

    /**
     * @param memberPersonalNumberDeleteTextField the memberPersonalNumberDeleteTextField to set
     */
    public void setMemberPersonalNumberDeleteTextField(javax.swing.JTextField memberPersonalNumberDeleteTextField) {
        this.memberPersonalNumberDeleteTextField = memberPersonalNumberDeleteTextField;
    }

    /**
     * @return the memberPersonalNumberLabel
     */
    public javax.swing.JLabel getMemberPersonalNumberLabel() {
        return memberPersonalNumberLabel;
    }

    /**
     * @param memberPersonalNumberLabel the memberPersonalNumberLabel to set
     */
    public void setMemberPersonalNumberLabel(javax.swing.JLabel memberPersonalNumberLabel) {
        this.memberPersonalNumberLabel = memberPersonalNumberLabel;
    }

    /**
     * @return the memberPersonalNumberShowTextField
     */
    public javax.swing.JTextField getMemberPersonalNumberShowTextField() {
        return memberPersonalNumberShowTextField;
    }

    /**
     * @param memberPersonalNumberShowTextField the memberPersonalNumberShowTextField to set
     */
    public void setMemberPersonalNumberShowTextField(javax.swing.JTextField memberPersonalNumberShowTextField) {
        this.memberPersonalNumberShowTextField = memberPersonalNumberShowTextField;
    }

    /**
     * @return the memberPersonalNumberTextField
     */
    public javax.swing.JTextField getMemberPersonalNumberTextField() {
        return memberPersonalNumberTextField;
    }

    /**
     * @param memberPersonalNumberTextField the memberPersonalNumberTextField to set
     */
    public void setMemberPersonalNumberTextField(javax.swing.JTextField memberPersonalNumberTextField) {
        this.memberPersonalNumberTextField = memberPersonalNumberTextField;
    }

    /**
     * @return the memberPersonalNumberUpdateLabel
     */
    public javax.swing.JLabel getMemberPersonalNumberUpdateLabel() {
        return memberPersonalNumberUpdateLabel;
    }

    /**
     * @param memberPersonalNumberUpdateLabel the memberPersonalNumberUpdateLabel to set
     */
    public void setMemberPersonalNumberUpdateLabel(javax.swing.JLabel memberPersonalNumberUpdateLabel) {
        this.memberPersonalNumberUpdateLabel = memberPersonalNumberUpdateLabel;
    }

    /**
     * @return the memberPersonalNumberUpdateNewLabel
     */
    public javax.swing.JLabel getMemberPersonalNumberUpdateNewLabel() {
        return memberPersonalNumberUpdateNewLabel;
    }

    /**
     * @param memberPersonalNumberUpdateNewLabel the memberPersonalNumberUpdateNewLabel to set
     */
    public void setMemberPersonalNumberUpdateNewLabel(javax.swing.JLabel memberPersonalNumberUpdateNewLabel) {
        this.memberPersonalNumberUpdateNewLabel = memberPersonalNumberUpdateNewLabel;
    }

    /**
     * @return the memberPersonalNumberUpdateNewTextField
     */
    public javax.swing.JTextField getMemberPersonalNumberUpdateNewTextField() {
        return memberPersonalNumberUpdateNewTextField;
    }

    /**
     * @param memberPersonalNumberUpdateNewTextField the memberPersonalNumberUpdateNewTextField to set
     */
    public void setMemberPersonalNumberUpdateNewTextField(javax.swing.JTextField memberPersonalNumberUpdateNewTextField) {
        this.memberPersonalNumberUpdateNewTextField = memberPersonalNumberUpdateNewTextField;
    }

    /**
     * @return the memberPersonalNumberUpdateTextField
     */
    public javax.swing.JTextField getMemberPersonalNumberUpdateTextField() {
        return memberPersonalNumberUpdateTextField;
    }

    /**
     * @param memberPersonalNumberUpdateTextField the memberPersonalNumberUpdateTextField to set
     */
    public void setMemberPersonalNumberUpdateTextField(javax.swing.JTextField memberPersonalNumberUpdateTextField) {
        this.memberPersonalNumberUpdateTextField = memberPersonalNumberUpdateTextField;
    }

    /**
     * @return the showMemberByPeronalNumberButton
     */
    public javax.swing.JButton getShowMemberByPeronalNumberButton() {
        return showMemberByPeronalNumberButton;
    }

    /**
     * @param showMemberByPeronalNumberButton the showMemberByPeronalNumberButton to set
     */
    public void setShowMemberByPeronalNumberButton(javax.swing.JButton showMemberByPeronalNumberButton) {
        this.showMemberByPeronalNumberButton = showMemberByPeronalNumberButton;
    }

    /**
     * @return the showMembersLabel
     */
    public java.awt.Label getShowMembersLabel() {
        return showMembersLabel;
    }

    /**
     * @param showMembersLabel the showMembersLabel to set
     */
    public void setShowMembersLabel(java.awt.Label showMembersLabel) {
        this.showMembersLabel = showMembersLabel;
    }

    /**
     * @return the showMembersLabel1
     */
    public java.awt.Label getShowMembersLabel1() {
        return showMembersLabel1;
    }

    /**
     * @param showMembersLabel1 the showMembersLabel1 to set
     */
    public void setShowMembersLabel1(java.awt.Label showMembersLabel1) {
        this.showMembersLabel1 = showMembersLabel1;
    }

    /**
     * @return the updateBoatButton
     */
    public javax.swing.JButton getUpdateBoatButton() {
        return updateBoatButton;
    }

    /**
     * @param updateBoatButton the updateBoatButton to set
     */
    public void setUpdateBoatButton(javax.swing.JButton updateBoatButton) {
        this.updateBoatButton = updateBoatButton;
    }

    /**
     * @return the updateBoatShowButton
     */
    public javax.swing.JButton getUpdateBoatShowButton() {
        return updateBoatShowButton;
    }

    /**
     * @param updateBoatShowButton the updateBoatShowButton to set
     */
    public void setUpdateBoatShowButton(javax.swing.JButton updateBoatShowButton) {
        this.updateBoatShowButton = updateBoatShowButton;
    }

    /**
     * @return the updateMemberButton
     */
    public javax.swing.JButton getUpdateMemberButton() {
        return updateMemberButton;
    }

    /**
     * @param updateMemberButton the updateMemberButton to set
     */
    public void setUpdateMemberButton(javax.swing.JButton updateMemberButton) {
        this.updateMemberButton = updateMemberButton;
    }

    /**
     * @return the updateMemberByPeronalNumberShowButton
     */
    public javax.swing.JButton getUpdateMemberByPeronalNumberShowButton() {
        return updateMemberByPeronalNumberShowButton;
    }

    /**
     * @param updateMemberByPeronalNumberShowButton the updateMemberByPeronalNumberShowButton to set
     */
    public void setUpdateMemberByPeronalNumberShowButton(javax.swing.JButton updateMemberByPeronalNumberShowButton) {
        this.updateMemberByPeronalNumberShowButton = updateMemberByPeronalNumberShowButton;
    }

    /**
     * @return the verboseShowLastMembersButton
     */
    public javax.swing.JButton getVerboseShowLastMembersButton() {
        return verboseShowLastMembersButton;
    }

    /**
     * @param verboseShowLastMembersButton the verboseShowLastMembersButton to set
     */
    public void setVerboseShowLastMembersButton(javax.swing.JButton verboseShowLastMembersButton) {
        this.verboseShowLastMembersButton = verboseShowLastMembersButton;
    }

    /**
     * @return the infoTextArea
     */
    public javax.swing.JTextArea getInfoTextArea() {
        return infoTextArea;
    }

    /**
     * @param infoTextArea the infoTextArea to set
     */
    public void setInfoTextArea(javax.swing.JTextArea infoTextArea) {
        this.infoTextArea = infoTextArea;
    }

    /**
     * @return the boatIdUpdateTextField
     */
    public javax.swing.JTextField getBoatIdUpdateTextField() {
        return boatIdUpdateTextField;
    }

    /**
     * @param boatIdUpdateTextField the boatIdUpdateTextField to set
     */
    public void setBoatIdUpdateTextField(javax.swing.JTextField boatIdUpdateTextField) {
        this.boatIdUpdateTextField = boatIdUpdateTextField;
    }
}
