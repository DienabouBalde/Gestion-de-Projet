/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyFrames.MyPanels;

import GestionBancaire.ConnectionBD;
import MyFrames.FrameClient;
import gestionbancaire3.MainFrame;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author asus pro
 */
public class ModificationAgencePanel extends javax.swing.JPanel {

    /**
     * Creates new form ModificationAgencePanel
     */
    public ModificationAgencePanel() {
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
        code_field = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        nom_field = new javax.swing.JTextField();
        btnModifier = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        date_field = new javax.swing.JTextField();
        ville_field = new javax.swing.JTextField();
        adresse_field = new javax.swing.JTextField();

        jLabel1.setText("code:");

        code_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                code_fieldActionPerformed(evt);
            }
        });

        jButton1.setText("Rechercher");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Nom:");

        nom_field.setEnabled(false);

        btnModifier.setText("Modifier");
        btnModifier.setEnabled(false);
        btnModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifierActionPerformed(evt);
            }
        });

        jLabel3.setText("Date création:");

        jLabel4.setText("Adresse:");

        jLabel5.setText("Ville:");

        date_field.setEnabled(false);

        ville_field.setEnabled(false);

        adresse_field.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnModifier, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                                    .addComponent(code_field))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(35, 35, 35))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(adresse_field, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                    .addComponent(ville_field, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nom_field, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(date_field, javax.swing.GroupLayout.Alignment.LEADING))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(code_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nom_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(date_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(ville_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(adresse_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(btnModifier)
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void code_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_code_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_code_fieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int code = Integer.parseInt(code_field.getText());
        
        try{
            ConnectionBD conn = new ConnectionBD();
            String sql = "select * from agences where code_agence=?;";
            ResultSet rs = conn.initRequetePreparee(sql, true, code).executeQuery();
            if(rs.next())
            {
                nom_field.setEnabled(true);
                btnModifier.setEnabled(true);
                ville_field.setEnabled(true);
                adresse_field.setEnabled(true);
                nom_field.setText(rs.getString("nom_agence"));
                ville_field.setText(rs.getString("ville"));
                adresse_field.setText(rs.getString("adresse"));
                DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
                date_field.setText(df.format(rs.getDate("date_creation")));
            }
            else JOptionPane.showMessageDialog(null, "code inéxistant");
         
            conn.disconnect();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifierActionPerformed
        String nom = nom_field.getText();
        int code = Integer.parseInt(code_field.getText());
        String ville= ville_field.getText();
        String adresse = adresse_field.getText();
        
        try{
            ConnectionBD conn= new ConnectionBD();
            String sql = "update agences set nom_agence=? , ville = ?,  adresse = ? where code_agence=?";
            conn.initRequetePreparee(sql, true, nom,ville,adresse,code).executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Agence modifier");
            nom_field.setEnabled(false);
            btnModifier.setEnabled(false);
            ville_field.setEnabled(false);
            adresse_field.setEnabled(false);
            
           //mettre a jour la liste de agences
            String requete = "select * from agences";
            try {

                ResultSet rs = conn.Select(requete);

                FrameClient.nouveauClientPanel.getListe_agences().removeAllItems();
                FrameClient.visionnerClientPanel.getListe_agence().removeAllItems();
                FrameClient.modificationClientPanel.getListe_agences().removeAllItems();
                while (rs.next()) {
                    FrameClient.nouveauClientPanel.getListe_agences().addItem(rs.getString("nom_agence"));
                    FrameClient.visionnerClientPanel.getListe_agence().addItem(rs.getString("nom_agence"));
                    FrameClient.modificationClientPanel.getListe_agences().addItem(rs.getString("nom_agence"));
                }

                conn.disconnect();
            } catch (Exception e) {
                System.err.println(e);
            }
            
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnModifierActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adresse_field;
    private javax.swing.JButton btnModifier;
    private javax.swing.JTextField code_field;
    private javax.swing.JTextField date_field;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nom_field;
    private javax.swing.JTextField ville_field;
    // End of variables declaration//GEN-END:variables
}