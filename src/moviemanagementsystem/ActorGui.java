/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package moviemanagementsystem;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class ActorGui extends javax.swing.JInternalFrame {

    Actor actor = new Actor();
    private DefaultTableModel model;

    /**
     * Creates new form ActorGui
     */
    public ActorGui() {
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

        backBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        fnLbl = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        dateOfBirth = new javax.swing.JTextField();
        miLbl = new javax.swing.JLabel();
        lnLbl = new javax.swing.JLabel();
        qoutes = new javax.swing.JTextField();
        addActorBtn = new javax.swing.JButton();
        updateActorBtn = new javax.swing.JButton();
        deleteActorBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        actorTable = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();

        setClosable(true);

        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moviemanagementsystem/images/back-icon.png"))); // NOI18N
        backBtn.setText("Back");
        backBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        fnLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        fnLbl.setText("First name:");

        name.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 204, 204)));

        dateOfBirth.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 204, 204)));

        miLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        miLbl.setText("Birth Date:");

        lnLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lnLbl.setText("Qoutes:");

        qoutes.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 204, 204)));

        addActorBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moviemanagementsystem/images/add-icon.png"))); // NOI18N
        addActorBtn.setText("ADD");
        addActorBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addActorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActorBtnActionPerformed(evt);
            }
        });

        updateActorBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moviemanagementsystem/images/update-icon.png"))); // NOI18N
        updateActorBtn.setText("UPDATE");
        updateActorBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateActorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActorBtnActionPerformed(evt);
            }
        });

        deleteActorBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moviemanagementsystem/images/delete-icon.png"))); // NOI18N
        deleteActorBtn.setText("DELETE");
        deleteActorBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteActorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActorBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fnLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(miLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lnLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateOfBirth, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                    .addComponent(qoutes)
                    .addComponent(name))
                .addGap(107, 107, 107)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addActorBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updateActorBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                    .addComponent(deleteActorBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fnLbl)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addActorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(miLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateActorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qoutes, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lnLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteActorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        actorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Birth date", "Qoutes"
            }
        ));
        actorTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actorTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(actorTable);

        jLabel8.setText("<html>Click the item inside the <br>table to UPDATE or DELETE</html>");
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backBtn)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void addActorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActorBtnActionPerformed
        String actorName = name.getText();
        String actorBDate = dateOfBirth.getText();
        String actorQoute = qoutes.getText();

        if (actorName.equals("") || actorBDate.equals("") || actorQoute.equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill in all fields!");

        } else {

            actor.addActor(actorName, actorBDate, actorQoute);
            displayTable();

            JOptionPane.showMessageDialog(null, "Added Successfully!");

            //reset field
            clearField();

        }
    }//GEN-LAST:event_addActorBtnActionPerformed

    private void updateActorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActorBtnActionPerformed
        model = (DefaultTableModel) actorTable.getModel();

        if (actorTable.getSelectedRowCount() == 1) {
            String actorId = model.getValueAt(actorTable.getSelectedRow(), 0).toString();
            String actorName = name.getText();
            String actorBDate = dateOfBirth.getText();
            String actorQoute = qoutes.getText();
            //if current id is found, update movie
            if (actor.updateActor(actorId, actorName, actorBDate, actorQoute)) {
                //set updated value on table row
                model.setValueAt(actorId, actorTable.getSelectedRow(), 0);
                model.setValueAt(actorName, actorTable.getSelectedRow(), 1);
                model.setValueAt(actorBDate, actorTable.getSelectedRow(), 2);
                model.setValueAt(actorQoute, actorTable.getSelectedRow(), 3);
                JOptionPane.showMessageDialog(null, "Updated Successfully!");

                //reset field
                clearField();
            } else {

                JOptionPane.showMessageDialog(null, "Update failed!");
            }
        }

    }//GEN-LAST:event_updateActorBtnActionPerformed

    private void deleteActorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActorBtnActionPerformed
       int dialogResult = JOptionPane.showConfirmDialog(null, "Delete movie?", "Confirmation", JOptionPane.YES_NO_OPTION);

        model = (DefaultTableModel) actorTable.getModel();

        if (actorTable.getSelectedRowCount() == 1) {
            if (dialogResult == JOptionPane.YES_OPTION) {
                // User clicked "Yes"
                model.removeRow(actorTable.getSelectedRow());
       
                JOptionPane.showMessageDialog(null, "Deleted successfully!");
            } else {
                // User clicked "No" or closed the dialog
                System.out.println("Movie not deleted");
            }

        } else {
            //if table has no data
            if (actorTable.getSelectedRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Table is empty!");
            //if no row selected
            } else {
                JOptionPane.showMessageDialog(null, "Please select single row to delete!");
            }
        }
    }//GEN-LAST:event_deleteActorBtnActionPerformed

    private void actorTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actorTableMouseClicked
        model = (DefaultTableModel) actorTable.getModel();

        //set data to text field when selected
        String tableName = model.getValueAt(actorTable.getSelectedRow(), 1).toString();
        String tableBirthDate = model.getValueAt(actorTable.getSelectedRow(), 2).toString();
        String tableQoutes = model.getValueAt(actorTable.getSelectedRow(), 3).toString();

        //set to text field
        name.setText(tableName);
        dateOfBirth.setText(tableBirthDate);
        qoutes.setText(tableQoutes);
    }//GEN-LAST:event_actorTableMouseClicked
    private void displayTable() {
        Object[] data = actor.displayActor();
        model = (DefaultTableModel) actorTable.getModel();
        model.addRow(data);
    }

    private void clearField() {
        name.setText("");
        dateOfBirth.setText("");
        qoutes.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable actorTable;
    private javax.swing.JButton addActorBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField dateOfBirth;
    private javax.swing.JButton deleteActorBtn;
    private javax.swing.JLabel fnLbl;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lnLbl;
    private javax.swing.JLabel miLbl;
    private javax.swing.JTextField name;
    private javax.swing.JTextField qoutes;
    private javax.swing.JButton updateActorBtn;
    // End of variables declaration//GEN-END:variables
}
