/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.mokpo.my_project_fin;

import java.sql.SQLException;

/**
 *
 * @author MNU
 */
public class MemberJoinForm extends javax.swing.JFrame {

    /**
     * Creates new form MemberJoinForm
     */
    public MemberJoinForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_id = new javax.swing.JLabel();
        lbl_password = new javax.swing.JLabel();
        lbl_name = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        txt_password = new javax.swing.JTextField();
        btn_memberJoin = new javax.swing.JButton();
        btn_main = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_id.setText("id");

        lbl_password.setText("password");

        lbl_name.setText("name");

        txt_id.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        txt_name.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        txt_password.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        btn_memberJoin.setText("회원가입");
        btn_memberJoin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_memberJoinMouseClicked(evt);
            }
        });

        btn_main.setText("Main");
        btn_main.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MainOpen(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_name)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbl_password)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                        .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbl_id)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(79, 79, 79))
            .addGroup(layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(btn_memberJoin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(btn_main)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btn_main)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_id)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_password)
                    .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_name)
                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(btn_memberJoin)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_memberJoinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_memberJoinMouseClicked
        // TODO add your handling code here:
        MemberDTO dto = new MemberDTO();
        dto.setId(txt_id.getText());
        dto.setPassword(txt_password.getText());
        dto.setName(txt_name.getText());
        
        boolean id_test;
        Ctl_inputCheck checkObj = new Ctl_inputCheck();
        id_test = checkObj.idCheck(dto.getId());
        System.out.println("+++ TEST +++" + id_test);
        if (id_test) {
            MemberDAO dao = new MemberDAO();
            try { dao.insert(dto);
            } catch (SQLException ex) { System.out.println("Err"); }
        }
        
        ResultJoinForm resultJoinForm = new ResultJoinForm();
        resultJoinForm.lblSetting(dto, id_test);
        
        this.setVisible(false);
        resultJoinForm.setVisible(true);
    }//GEN-LAST:event_btn_memberJoinMouseClicked

    private void MainOpen(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainOpen
        // TODO add your handling code here:
        MainForm mainForm = new MainForm();
        
        this.setVisible(false);
        mainForm.setVisible(true);
    }//GEN-LAST:event_MainOpen

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MemberJoinForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MemberJoinForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MemberJoinForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MemberJoinForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MemberJoinForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_main;
    private javax.swing.JButton btn_memberJoin;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_password;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_password;
    // End of variables declaration//GEN-END:variables

    public boolean idCheck(String id) {
    if (id == null || id.isEmpty()) return false;

    int minLength = 5;
    int maxLength = 20;
    if (id.length() < minLength || id.length() > maxLength) return false;

    for (int i = 0; i < id.length(); i++) {
        char c = id.charAt(i);
        if (!Character.isLetterOrDigit(c)) return false;
    }

    return true;      
    }
}