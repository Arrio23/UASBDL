/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package bdl;

import koneksi.koneksi;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author AINA NUR ILLAH
 */
public class Form_Suplier extends javax.swing.JPanel {

    protected void masukTabel() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Nama Suplier");
        model.addColumn("Alamat Suplier");

        try {
            String sql = "SELECT * FROM suplier";
            java.sql.Connection conn = (Connection) koneksi.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);

            while (res.next()) {
                model.addRow(new Object[]{res.getString(1), res.getString(2), res.getString(3)});
            }
            jTable1.setModel(model);

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    protected void clear() {
        jTextFieldID.setText(null);
        jTextFieldNama.setText(null);
        jTextFieldAlamat.setText(null);
    }
    /**
     * Creates new form Form_Jasa
     */
    public Form_Suplier() {
        initComponents();
        masukTabel();
        clear();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paneljasa = new javax.swing.JPanel();
        dataJasa = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        bt_tambah = new javax.swing.JButton();
        jButtonHapus = new javax.swing.JButton();
        jButtonBatal = new javax.swing.JButton();
        jButtonEdit = new javax.swing.JButton();
        jTextFieldCari = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextFieldID = new javax.swing.JTextField();
        jTextFieldNama = new javax.swing.JTextField();
        jTextFieldAlamat = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tambahjasa = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButtonSimpan = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        paneljasa.setLayout(new java.awt.CardLayout());

        dataJasa.setBackground(new java.awt.Color(204, 204, 255));
        dataJasa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID Suplier", "Nama Suplier", "Alamat"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        dataJasa.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 281, 592, 250));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel1.setText("Data Suplier");
        dataJasa.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 19, 219, -1));

        bt_tambah.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        bt_tambah.setText("TAMBAH");
        bt_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_tambahActionPerformed(evt);
            }
        });
        dataJasa.add(bt_tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 72, 100, 40));

        jButtonHapus.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jButtonHapus.setText("HAPUS");
        jButtonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHapusActionPerformed(evt);
            }
        });
        dataJasa.add(jButtonHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 141, 100, 40));

        jButtonBatal.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jButtonBatal.setText("BATAL");
        jButtonBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBatalActionPerformed(evt);
            }
        });
        dataJasa.add(jButtonBatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 100, 40));

        jButtonEdit.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jButtonEdit.setText("EDIT");
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });
        dataJasa.add(jButtonEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 100, 40));

        jTextFieldCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldCariKeyReleased(evt);
            }
        });
        dataJasa.add(jTextFieldCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 71, 100, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Nama", "Alamat" }));
        dataJasa.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, -1, -1));
        dataJasa.add(jTextFieldID, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 234, 131, -1));
        dataJasa.add(jTextFieldNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 234, 131, -1));
        dataJasa.add(jTextFieldAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 234, 131, -1));

        jLabel3.setText("ID Suplier");
        dataJasa.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 201, -1, -1));

        jLabel7.setText("Nama Suplier");
        dataJasa.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 201, -1, -1));

        jLabel8.setText("Alamat");
        dataJasa.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 201, -1, -1));

        paneljasa.add(dataJasa, "card2");

        tambahjasa.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel2.setText("Tambah Data Jasa");

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel4.setText("Id Jasa");

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel5.setText("Nama Jasa");

        jButtonSimpan.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jButtonSimpan.setText("SIMPAN");
        jButtonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSimpanActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jButton5.setText("BATAL");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel6.setText("Harga Jasa");

        javax.swing.GroupLayout tambahjasaLayout = new javax.swing.GroupLayout(tambahjasa);
        tambahjasa.setLayout(tambahjasaLayout);
        tambahjasaLayout.setHorizontalGroup(
            tambahjasaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tambahjasaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tambahjasaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tambahjasaLayout.createSequentialGroup()
                        .addGroup(tambahjasaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(tambahjasaLayout.createSequentialGroup()
                                .addComponent(jButtonSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tambahjasaLayout.createSequentialGroup()
                        .addGroup(tambahjasaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, tambahjasaLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 263, Short.MAX_VALUE))
                            .addComponent(jTextField6))
                        .addContainerGap())))
        );
        tambahjasaLayout.setVerticalGroup(
            tambahjasaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tambahjasaLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addGap(12, 12, 12)
                .addGroup(tambahjasaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(235, Short.MAX_VALUE))
        );

        paneljasa.add(tambahjasa, "card2");

        add(paneljasa, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        paneljasa.removeAll();
        paneljasa.add(dataJasa);
        paneljasa.repaint();
        paneljasa.revalidate();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButtonBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBatalActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_jButtonBatalActionPerformed

    private void jButtonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSimpanActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButtonSimpanActionPerformed

    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
        // TODO add your handling code here:
        String harga = jTextFieldAlamat.getText();
        int hrg = Integer.parseInt(harga);

        try {
            String sql = "UPDATE suplier SET nama_suplier='" + jTextFieldNama.getText() + "', alamat_suplier='" + jTextFieldAlamat.getText()  + "' WHERE id_suplier='" + jTextFieldID.getText() + "'";
//            String sql = "UPDATE barang SET nama_barang='" + jTextFieldNama.getText() + "', jumlah_br_sup= jumlah_br_sup - " + jml + ", harga=" + hrg + " WHERE id_barang='" + jTextFieldID.getText() + "'";

            java.sql.Connection conn = (Connection) koneksi.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Data berhasil diedit!");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        masukTabel();
        clear();
    }//GEN-LAST:event_jButtonEditActionPerformed

    private void jButtonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHapusActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "DELETE FROM suplier WHERE id_suplier = '" + jTextFieldID.getText() + "'";
            java.sql.Connection conn = (Connection) koneksi.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus!");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        masukTabel();
        clear();
    }//GEN-LAST:event_jButtonHapusActionPerformed

    private void jTextFieldCariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCariKeyReleased
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        
        try{
            Connection conn = (Connection) koneksi.configDB();
            
            if(jComboBox1.getSelectedIndex() == 0){
                String sql = "SELECT * FROM suplier WHERE id_suplier LIKE '%" + jTextFieldCari.getText() + "%'";
                PreparedStatement stat = conn.prepareStatement(sql);
                ResultSet res = stat.executeQuery();
                while (res.next()) {
                    model.addRow(new Object[]{res.getString(1), res.getString(2), res.getString(3)});
                }
            } else if(jComboBox1.getSelectedIndex() == 1){
                String sql = "SELECT * FROM suplier WHERE nama_suplier LIKE '%" + jTextFieldCari.getText() + "%'";
                PreparedStatement stat = conn.prepareStatement(sql);
                ResultSet res = stat.executeQuery();
                while (res.next()) {
                    model.addRow(new Object[]{res.getString(1), res.getString(2), res.getString(3)});
                }
            } else if (jComboBox1.getSelectedIndex() == 2) {
                String sql = "SELECT * FROM suplier WHERE alamat_suplier LIKE '%" + jTextFieldCari.getText() +"'%";
                PreparedStatement stat = conn.prepareStatement(sql);
                ResultSet res = stat.executeQuery();
                while (res.next()) {
                    model.addRow(new Object[]{res.getString(1), res.getString(2), res.getString(3)});
                }
            }
            jTable1.setModel(model);
        } catch(SQLException e){
            
        }
    }//GEN-LAST:event_jTextFieldCariKeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int baris = jTable1.rowAtPoint(evt.getPoint());

        String id = jTable1.getValueAt(baris, 0).toString();
        jTextFieldID.setText(id);

        String nama = jTable1.getValueAt(baris, 1).toString();
        jTextFieldNama.setText(nama);

        String harga = jTable1.getValueAt(baris, 2).toString();
        jTextFieldAlamat.setText(harga);
    }//GEN-LAST:event_jTable1MouseClicked

    private void bt_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_tambahActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "INSERT INTO suplier VALUES (?, ?, ?)";
            Connection konn = (Connection)koneksi.configDB();
            PreparedStatement stat = konn.prepareStatement(sql);
            stat.setString(1, jTextFieldID.getText());
            stat.setString(2, jTextFieldNama.getText());
            stat.setString(3, jTextFieldAlamat.getText());
            
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data berhasil disimpan!");
            clear();
            jTextFieldID.requestFocus();
            masukTabel();
        }
        catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_bt_tambahActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_tambah;
    private javax.swing.JPanel dataJasa;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButtonBatal;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonHapus;
    private javax.swing.JButton jButtonSimpan;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextFieldAlamat;
    private javax.swing.JTextField jTextFieldCari;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldNama;
    private javax.swing.JPanel paneljasa;
    private javax.swing.JPanel tambahjasa;
    // End of variables declaration//GEN-END:variables
}
