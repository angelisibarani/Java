/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyek_pbo;
import proyek_pbo.*;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author kylex
 */
public class Keasramaan_Home extends javax.swing.JFrame {
    DbHandler a = new DbHandler();
    Keasramaan_Add addd = new Keasramaan_Add();
    List<Keasramaan> keasramaan = new ArrayList<Keasramaan>();
    int max = 0 ;
    int idx = 0 ;

    /**
     * Creates new form Keasramaan_Home
     */
    public Keasramaan_Home() {
        initComponents();
        refresh();
        reset();
        
        addd.setDefaultCloseOperation(HIDE_ON_CLOSE);
    }

    
    public void refresh(){
        a.connect("localhost", "db_asrama", "pbo", "pbo");
        this.keasramaan = a.getallkemahas();
        this.max = a.counter;
        a.disconnect();
        
        
        
    }
    
    public void reset(){
        if(this.max > 0){
            this.idx = 0;
            this.label_nama.setText("Nama : " + keasramaan.get(0).getNama());
            this.label_nik.setText("NIK : " + keasramaan.get(0).getNik());
            this.label_hp.setText("No Hp : " + keasramaan.get(0).getHp());
            this.label_sex.setText("Jenis Kelamin : " + keasramaan.get(0).getJenis_kelamin());
        }else{
            this.label_nama.setText("Nama : " );
            this.label_nik.setText("NIK : " );
            this.label_hp.setText("No Hp : " );
            this.label_sex.setText("Jenis Kelamin : " );
        
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        label_nama = new javax.swing.JLabel();
        label_nik = new javax.swing.JLabel();
        label_hp = new javax.swing.JLabel();
        label_sex = new javax.swing.JLabel();
        nextButton = new javax.swing.JButton();
        prevButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Data Keasramaan");

        label_nama.setText("Nama : ");

        label_nik.setText("NIK : ");

        label_hp.setText("No Hp :");

        label_sex.setText("Jenis Kelamin :");

        nextButton.setText("Next");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        prevButton.setText("Prev");
        prevButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jLabel1)
                .addGap(0, 148, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_nama)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(prevButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nextButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(addButton)))
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(label_sex)
                            .addComponent(label_hp)
                            .addComponent(label_nik))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(label_nama)
                .addGap(18, 18, 18)
                .addComponent(label_nik)
                .addGap(18, 18, 18)
                .addComponent(label_hp)
                .addGap(18, 18, 18)
                .addComponent(label_sex)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextButton)
                    .addComponent(prevButton))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prevButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevButtonActionPerformed
        // TODO add your handling code here:
        refresh();
        if(this.max > 0){
        this.idx = (idx + (max-1)) % max;
        this.label_nama.setText("Nama : " + keasramaan.get(idx).getNama());
        this.label_nik.setText("NIK : " + keasramaan.get(idx).getNik());
        this.label_hp.setText("No Hp : " + keasramaan.get(idx).getHp());
        this.label_sex.setText("Jenis Kelamin : " + keasramaan.get(idx).getJenis_kelamin());
        }
        
        
    }//GEN-LAST:event_prevButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        addd.setVisible(true);
    }//GEN-LAST:event_addButtonActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        // TODO add your handling code here:
        refresh();
        if(this.max > 0){
        idx = (idx + 1) % max;
        this.label_nama.setText("Nama : " + keasramaan.get(idx).getNama());
        this.label_nik.setText("NIK : " + keasramaan.get(idx).getNik());
        this.label_hp.setText("No Hp : " + keasramaan.get(idx).getHp());
        this.label_sex.setText("Jenis Kelamin : " + keasramaan.get(idx).getJenis_kelamin());
        }
    }//GEN-LAST:event_nextButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        refresh();
        reset();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         a.connect("localhost", "db_asrama", "pbo", "pbo");
        a.delpembina(this.label_nik.getText().substring(6));
        a.disconnect();
        refresh();
        reset();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Keasramaan_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Keasramaan_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Keasramaan_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Keasramaan_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Keasramaan_Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel label_hp;
    private javax.swing.JLabel label_nama;
    private javax.swing.JLabel label_nik;
    private javax.swing.JLabel label_sex;
    private javax.swing.JButton nextButton;
    private javax.swing.JButton prevButton;
    // End of variables declaration//GEN-END:variables
}
