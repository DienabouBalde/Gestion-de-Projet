/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyFrames.MyPanels;

import GestionBancaire.ConnectionBD;
import static MyFrames.MyPanels.VisionnerClientPanel.fillTable;
import static MyFrames.MyPanels.VisionnerClientPanel.model;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author asus pro
 */
public class SuppressionClientPanel extends javax.swing.JPanel {

    /**
     * Creates new form SuppressionClientPanel
     */
    public SuppressionClientPanel() {
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

        jLabel1 = new javax.swing.JLabel();
        cin_field = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jLabel1.setText("CIN:");

        jButton1.setText("Supprimer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel1)
                .addGap(72, 72, 72)
                .addComponent(cin_field, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jButton1)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cin_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(218, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
         String cin = cin_field.getText();
        
         try {
            ConnectionBD conn = new ConnectionBD();
            String sql = "select * from clients where cin_client=?";
            PreparedStatement preparedstm = conn.initRequetePreparee(sql, true, cin);
            ResultSet rs = preparedstm.executeQuery();
            
            if (rs.next()) {
                int dialogButton = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog(null, "cin: " + rs.getString("cin_client") + "\nNom: " + rs.getString("nom_client") + "\nPrenom: " + rs.getString("prenom_client") ,"Warning",dialogButton);
                if(dialogResult == JOptionPane.YES_OPTION){
                        
                        //calcul?? nombre compte client
                        sql ="select count(*) as nbcompte from comptes where id_client = ?";
                        preparedstm = conn.initRequetePreparee(sql, true, rs.getInt("id_client"));
                        rs = preparedstm.executeQuery();
                        if(rs.next())
                        {
                            //si le client n'as pas de compte
                            if(rs.getInt("nbcompte") == 0)
                            {
                                //suppression effective
                                sql = "delete from clients where cin_client=?";
                                preparedstm = conn.initRequetePreparee(sql, true, cin);
                                preparedstm.executeUpdate();
                                JOptionPane.showMessageDialog(null, "Client supprimer");
                            }
                            else{
                                //set client inactif
                                
                                sql = "update clients set inactif=1 where cin_client=?";
                                preparedstm = conn.initRequetePreparee(sql, true, cin);
                                preparedstm.executeUpdate();
                                JOptionPane.showMessageDialog(null, "set Client inactif");
                            }
                        
                        
                            //actualiser la table des clients
                            VisionnerClientPanel.model.setRowCount(0);
                            
                            
                                
                        }
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "cin inexistant");
            }
            
            conn.disconnect();
        } catch (Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cin_field;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
