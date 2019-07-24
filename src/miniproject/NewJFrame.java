
package miniproject;

import java.awt.Frame;
import javax.swing.JFrame;


public class NewJFrame extends javax.swing.JInternalFrame {

   FrmAddUser frmUser;
   FrmAddEmployee frmEmp;
   FrmReport frmReport;
   
   public MainMenu(){
      initComponents();
       this.setExtendedState(JFrame.MAXIMIZED_BOTH);
  }
   
    public NewJFrame() {
        initComponents();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        dpShow = new javax.swing.JDesktopPane();
        menuStudent = new javax.swing.JMenuBar();
        menuUser = new javax.swing.JMenu();
        menuEmployee = new javax.swing.JMenu();
        menuReport = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Created by Asmat Saleah");

        javax.swing.GroupLayout dpShowLayout = new javax.swing.GroupLayout(dpShow);
        dpShow.setLayout(dpShowLayout);
        dpShowLayout.setHorizontalGroup(
            dpShowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        dpShowLayout.setVerticalGroup(
            dpShowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 333, Short.MAX_VALUE)
        );

        menuStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuStudentMouseClicked(evt);
            }
        });

        menuUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniproject/icon/a.png"))); // NOI18N
        menuUser.setText("Add User");
        menuUser.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        menuUser.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuUser.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menuUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuUserMouseClicked(evt);
            }
        });
        menuStudent.add(menuUser);

        menuEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniproject/icon/b.png"))); // NOI18N
        menuEmployee.setText("Add Employee");
        menuEmployee.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        menuEmployee.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuEmployee.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menuEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuEmployeeMouseClicked(evt);
            }
        });
        menuStudent.add(menuEmployee);

        menuReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniproject/icon/c.png"))); // NOI18N
        menuReport.setText("Report");
        menuReport.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        menuReport.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuReport.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menuReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuReportMouseClicked(evt);
            }
        });
        menuStudent.add(menuReport);

        setJMenuBar(menuStudent);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpShow)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dpShow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuStudentMouseClicked
      // TODO add your handling code here:
        
    }//GEN-LAST:event_menuStudentMouseClicked

    private void menuUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuUserMouseClicked
        // TODO add your handling code here:
        frmUser = new FrmAddUser();
        this.dpShow.add(frmUser);
        frmUser.setVisible(true);
        frmUser.setSize(this.getSize());
               
    }//GEN-LAST:event_menuUserMouseClicked

    private void menuEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuEmployeeMouseClicked
        // TODO add your handling code here:
        frmEmp = new FrmAddEmployee();
        this.dpShow.add(frmEmp);
        frmEmp.setVisible(true);
        frmEmp.setSize(this.getSize());
    }//GEN-LAST:event_menuEmployeeMouseClicked

    private void menuReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuReportMouseClicked
        // TODO add your handling code here:
        frmReport = new FrmReport();
        this.dpShow.add(frmReport);
        frmReport.setVisible(true);
        frmReport.setSize(this.getSize());
    }//GEN-LAST:event_menuReportMouseClicked

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dpShow;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenu menuEmployee;
    private javax.swing.JMenu menuReport;
    private javax.swing.JMenuBar menuStudent;
    private javax.swing.JMenu menuUser;
    // End of variables declaration//GEN-END:variables

    private static class NewFrame {

        public NewFrame() {
        }

        private void setVisible(boolean b) {
            
        }
    }
}
