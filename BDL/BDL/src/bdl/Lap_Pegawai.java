/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package bdl;

import koneksi.koneksi;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author AINA NUR ILLAH
 */
public class Lap_Pegawai extends javax.swing.JPanel {

    protected void masukTabel() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID PEGAWAI");
        model.addColumn("NAMA PEGAWAI");
        model.addColumn("ALAMAT");
        model.addColumn("NOMOR");

        try {
            String sql = "SELECT * FROM pegawai ORDER BY id_pegawai";
            java.sql.Connection conn = (Connection) koneksi.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);

            while (res.next()) {
                model.addRow(new Object[]{res.getString(1), res.getString(2), res.getString(3), res.getString(4)});
            }
            jTable1.setModel(model);

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    /**
     * Creates new form Form_Barang
     */
    public Lap_Pegawai() {
        initComponents();
        masukTabel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        dataBarang = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldCari = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButtonCetak = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));
        setLayout(new java.awt.CardLayout());

        mainPanel.setBackground(new java.awt.Color(204, 255, 204));
        mainPanel.setLayout(new java.awt.CardLayout());

        dataBarang.setBackground(new java.awt.Color(204, 204, 255));
        dataBarang.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID PEGAWAI", "NAMA PEGAWAI", "ALAMAT", "NOMOR HP"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        dataBarang.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 790, 300));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel1.setText("Data Pegawai");
        dataBarang.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 19, -1, -1));

        jTextFieldCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldCariKeyReleased(evt);
            }
        });
        dataBarang.add(jTextFieldCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 120, 30));

        jLabel11.setText("Cari");
        dataBarang.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Nama", "Nomor", "Alamat" }));
        dataBarang.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, -1, -1));

        jButtonCetak.setText("Cetak");
        jButtonCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCetakActionPerformed(evt);
            }
        });
        dataBarang.add(jButtonCetak, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 475, -1, 50));

        mainPanel.add(dataBarang, "card2");

        add(mainPanel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextFieldCariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCariKeyReleased
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        try {
            Connection conn = (Connection) koneksi.configDB();

            if (jComboBox1.getSelectedIndex() == 0) {
                String sql = "SELECT * FROM pegawai WHERE id_pegawai LIKE '%" + jTextFieldCari.getText() + "%'";
                PreparedStatement stat = conn.prepareStatement(sql);
                ResultSet res = stat.executeQuery();
                while (res.next()) {
                    model.addRow(new Object[]{res.getString(1), res.getString(2), res.getString(3), res.getString(4)});
                }
            } else if (jComboBox1.getSelectedIndex() == 1) {
                String sql = "SELECT * FROM pegawai WHERE LOWER(nama_pegawai) LIKE '%" + jTextFieldCari.getText().toLowerCase() + "%'";
                PreparedStatement stat = conn.prepareStatement(sql);
                ResultSet res = stat.executeQuery();
                while (res.next()) {
                    model.addRow(new Object[]{res.getString(1), res.getString(2), res.getString(3), res.getString(4)});
                }
            } else if (jComboBox1.getSelectedIndex() == 2) {
                String sql = "SELECT * FROM pegawai WHERE no_telp_pegawai LIKE '%" + jTextFieldCari.getText() + "%'";
                PreparedStatement stat = conn.prepareStatement(sql);
                ResultSet res = stat.executeQuery();
                while (res.next()) {
                    model.addRow(new Object[]{res.getString(1), res.getString(2), res.getString(3), res.getString(4)});
                }
            } else if (jComboBox1.getSelectedIndex() == 3){
                String sql = "SELECT * FROM pegawai WHERE LOWER(alamat_pegawai) LIKE '%" + jTextFieldCari.getText().toLowerCase() + "%'";
                PreparedStatement stat = conn.prepareStatement(sql);
                ResultSet res = stat.executeQuery();
                while (res.next()) {
                    model.addRow(new Object[]{res.getString(1), res.getString(2), res.getString(3), res.getString(4)});
                }
            }
            jTable1.setModel(model);
        } catch (SQLException e) {

        }
    }//GEN-LAST:event_jTextFieldCariKeyReleased

    private void jButtonCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCetakActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/UASBDL", "postgres", "11111");
            
            String jrxmlFile = new String("src/laporan/reportPegawai.jrxml");
            JasperReport jr = JasperCompileManager.compileReport(jrxmlFile);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, conn);
            JasperViewer.viewReport(jp, false);
        } catch (JRException ex) {
        
        } catch (SQLException ex) {
            Logger.getLogger(Lap_Barang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonCetakActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel dataBarang;
    private javax.swing.JButton jButtonCetak;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldCari;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
}
