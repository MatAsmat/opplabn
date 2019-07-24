
package miniproject;


public class MainMenu extends javax.swing.JFrame {

   
    public MainMenu() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpShow = new javax.swing.JDesktopPane();
        menuStudent = new javax.swing.JMenuBar();
        menuUser = new javax.swing.JMenu();
        menuEmployee = new javax.swing.JMenu();
        menuReport = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout dpShowLayout = new javax.swing.GroupLayout(dpShow);
        dpShow.setLayout(dpShowLayout);
        dpShowLayout.setHorizontalGroup(
            dpShowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 415, Short.MAX_VALUE)
        );
        dpShowLayout.setVerticalGroup(
            dpShowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 378, Short.MAX_VALUE)
        );

        menuUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniproject/icon/a.png"))); // NOI18N
        menuUser.setText("Add User");
        menuUser.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        menuUser.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuUser.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menuStudent.add(menuUser);

        menuEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniproject/icon/b.png"))); // NOI18N
        menuEmployee.setText("User Employee");
        menuEmployee.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        menuEmployee.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuEmployee.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menuStudent.add(menuEmployee);

        menuReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniproject/icon/c.png"))); // NOI18N
        menuReport.setText("Report");
        menuReport.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        menuReport.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuReport.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
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
            .addComponent(dpShow)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dpShow;
    private javax.swing.JMenu menuEmployee;
    private javax.swing.JMenu menuReport;
    private javax.swing.JMenuBar menuStudent;
    private javax.swing.JMenu menuUser;
    // End of variables declaration//GEN-END:variables
}
