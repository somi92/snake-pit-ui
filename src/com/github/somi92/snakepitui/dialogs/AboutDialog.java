/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.snakepitui.dialogs;

/**
 *
 * @author milos
 */
public class AboutDialog extends javax.swing.JDialog {

    /**
     * Creates new form AboutDialog
     */
    public AboutDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        jtxtAbout.setCaretPosition(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtAbout = new javax.swing.JTextArea();
        jbtnOK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("About:");

        jtxtAbout.setEditable(false);
        jtxtAbout.setColumns(20);
        jtxtAbout.setRows(5);
        jtxtAbout.setText("snake-pit-ui\n\nsnake-pit-ui is a project written in Java and Swing that serves as a GUI for both \nsnake-pit and clojure-snake projects.\n\nsnake-pit is a student project written in Clojure to demonstrate application of \ngenetic programming to the snake game. The goal of the project is to evolve \nthe snake game AI.\n\nclojure-snake is a simple implementation of the snake game written in Clojure \nand Swing. It also has the ability to use the AI output of the snake-pit project.\n\nIt presents a convenient interface that enables the user to experiment with GP\nparameters and evolve the AI, run and display the AI in action, as well as starting \nmanual play of the game.\n\nOptions\n\n-Manual play\n\n * Starts the clojure-snake in manual mode with the ability to set the speed of\n  the game.\n\n-Load and run snake AI\n\n * Presents an interface for loading the AI (control routine) produced by snake-pit\n and calls the clojure-snake to display the AI in action. Use ctrl-V to paste the control \n routine or enter it manually. The user can also load a hardcoded demo AI with a click\n of a button. To see how a valid control routine looks like please refer to documentation\n of the snake-pit project.\n\n-Breed snakes\n\n * Presents an interface for working with snake-pit library. The user can set GP parameters\n and run the GP engine. The GP reports back the result and the status of the run. Results\n can be saved to a text file along with the parameters of the associated run. For description\n of the available GP parameters please refer to documentation of the snake-pit project.\n\n-About\n\n * Presents information about the project.\n\nGitHub repositories and documentation\n\n  snake-pit https://github.com/somi92/snake-pit\n  clojure-snake https://github.com/somi92/clojure-snake\n  snake-pit-ui https://github.com/somi92/snake-pit-ui\n\nContact\n\nIf you have some comments, suggestions or noticed some bugs and problems feel free to \ncontact me and contribute.\n\nDeveloped by Milos Stojanovic \nemail: stojanovicmilos31@gmail.com\n\nLicense\n\nCopyright © 2015\n\nDistributed under the Eclipse Public License.");
        jScrollPane1.setViewportView(jtxtAbout);

        jbtnOK.setText("OK");
        jbtnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbtnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jbtnOK)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnOKActionPerformed
        dispose();
    }//GEN-LAST:event_jbtnOKActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnOK;
    private javax.swing.JTextArea jtxtAbout;
    // End of variables declaration//GEN-END:variables
}