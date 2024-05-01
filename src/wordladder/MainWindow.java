/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package wordladder;

import util.*;
import gadget.DisplaySolution;
import java.awt.Color;
import java.awt.Point;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.UIManager;

/**
 *
 * @author Suthasoma
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
        Node.initDictionary();
        setIconImage(new ImageIcon("src/icon.image/icon.png").getImage());
        warningLabel.setForeground(Color.RED);
        warningLabel.setText("");
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
        textStart = new javax.swing.JTextField();
        startLabel = new javax.swing.JLabel();
        textEnd = new javax.swing.JTextField();
        endLabel = new javax.swing.JLabel();
        searchType = new javax.swing.JComboBox<>();
        labelTypeSearch = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        warningLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Word Ladder");
        setUndecorated(true);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        mainPanel.setBackground(new java.awt.Color(0, 51, 51));

        textStart.setBackground(new java.awt.Color(0, 0, 0));
        textStart.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        textStart.setForeground(new java.awt.Color(255, 255, 255));
        textStart.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                textStartCaretUpdate(evt);
            }
        });
        textStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textStartActionPerformed(evt);
            }
        });

        startLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        startLabel.setForeground(new java.awt.Color(255, 255, 255));
        startLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon.image/Start.png"))); // NOI18N
        startLabel.setLabelFor(textStart);
        startLabel.setText("Start");
        startLabel.setToolTipText("");
        startLabel.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        textEnd.setBackground(new java.awt.Color(0, 0, 0));
        textEnd.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        textEnd.setForeground(new java.awt.Color(255, 255, 255));
        textEnd.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                textEndCaretUpdate(evt);
            }
        });
        textEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textEndActionPerformed(evt);
            }
        });

        endLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        endLabel.setForeground(new java.awt.Color(255, 255, 255));
        endLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon.image/Stop_2.png"))); // NOI18N
        endLabel.setText(" End");

        searchType.setBackground(new java.awt.Color(0, 0, 0));
        searchType.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        searchType.setForeground(new java.awt.Color(255, 255, 255));
        searchType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Uniform Cost Search (UCS)", "Greedy Best First Search", "A* (A Star)" }));
        searchType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTypeActionPerformed(evt);
            }
        });

        labelTypeSearch.setForeground(new java.awt.Color(255, 255, 255));
        labelTypeSearch.setText("Silahkan pilih algoritma yang digunakan  ");

        searchButton.setBackground(new java.awt.Color(0, 0, 0));
        searchButton.setForeground(new java.awt.Color(255, 255, 255));
        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon.image/Search.png"))); // NOI18N
        searchButton.setText("Search");
        searchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchButtonMouseClicked(evt);
            }
        });
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        searchButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchButtonKeyPressed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon.image/ABC.png"))); // NOI18N

        jLabel2.setBackground(new Color(30,30,30));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon.image/Close.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel2.setHorizontalAlignment(JLabel.CENTER);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 255));
        jLabel3.setText("WORD LADDER");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(startLabel)
                            .addComponent(endLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textStart, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                            .addComponent(textEnd))
                        .addGap(17, 17, 17)))
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(warningLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(labelTypeSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(searchType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startLabel)
                    .addComponent(textStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(endLabel)
                    .addComponent(textEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(labelTypeSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(warningLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(517, 331));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textStartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textStartActionPerformed

    private void textEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textEndActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textEndActionPerformed

    private void searchTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTypeActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchButtonActionPerformed

    private void searchButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButtonMouseClicked
        // TODO add your handling code here:
        searchButton.setEnabled(false);
        search();
        searchButton.setEnabled(true);
    }//GEN-LAST:event_searchButtonMouseClicked

    private void search() {
        
        long startTime;
        long endTime;
        
        Search solution;
        if (searchType.getSelectedIndex() == 0) {
            solution = new UCSearch(textStart.getText().toLowerCase(), textEnd.getText().toLowerCase());
            startTime = System.currentTimeMillis();
            solution.search();
            endTime = System.currentTimeMillis();
        } else if (searchType.getSelectedIndex() == 1) {
            solution = new BestFirstSearch(textStart.getText().toLowerCase(), textEnd.getText().toLowerCase());
            startTime = System.currentTimeMillis();
            solution.search();
            endTime = System.currentTimeMillis();
        } else {
            solution = new AStartSearch(textStart.getText().toLowerCase(), textEnd.getText().toLowerCase());
            startTime = System.currentTimeMillis();
            solution.search();
            endTime = System.currentTimeMillis();
        }
        
        long elapsed = endTime - startTime;
        
        if (solution.getSolution() == null) {
            JOptionPane.showMessageDialog(rootPane, "Solusi tidak ditemukan", "Solutions not found", JOptionPane.PLAIN_MESSAGE);
        } else {
            DisplaySolution disp = new DisplaySolution(solution.getSolution(), (int) elapsed, solution.getCounterNode());
            disp.setVisible(true);
            disp.setLocationRelativeTo(this);
        }
    }
    
    private void textStartCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_textStartCaretUpdate
        // TODO add your handling code here:
        validateInput();
    }//GEN-LAST:event_textStartCaretUpdate

    private void textEndCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_textEndCaretUpdate
        // TODO add your handling code here:
        validateInput();
    }//GEN-LAST:event_textEndCaretUpdate

    private void validateInput() {
        String start = textStart.getText().toLowerCase();
        String end = textEnd.getText().toLowerCase();
                
        if (!Node.dictionary.contains(start) || !Node.dictionary.contains(end)) {
            warningLabel.setText("Kata yang dimasukkan tidak ada dalam kamus.");
        } else {
            warningLabel.setText("");
        }
    }
    
    private void searchButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchButtonKeyPressed
        // TODO add your handling code here:
        search();
    }//GEN-LAST:event_searchButtonKeyPressed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
        mouseCoordinate = evt.getPoint();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
        Point currCoordinate = evt.getLocationOnScreen();
        this.setLocation(currCoordinate.x - mouseCoordinate.x, currCoordinate.y - mouseCoordinate.y);
    }//GEN-LAST:event_formMouseDragged

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        // TODO add your handling code here:
        jLabel2.setBackground(new Color(50,50,50));
        jLabel2.setOpaque(true);
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        // TODO add your handling code here:
        jLabel2.setOpaque(false);
        jLabel2.setBackground(new Color(30,30,30));
    }
    
    //GEN-LAST:event_jLabel2MouseExited
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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
                String currentDir = System.getProperty("user.dir");
                System.out.println(currentDir);
                try {
                    javax.swing.JFrame.setDefaultLookAndFeelDecorated(true);
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
                } catch (Exception e) {
                }
            }
        });
    }
    
    private Point mouseCoordinate;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel endLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labelTypeSearch;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton searchButton;
    private javax.swing.JComboBox<String> searchType;
    private javax.swing.JLabel startLabel;
    private javax.swing.JTextField textEnd;
    private javax.swing.JTextField textStart;
    private javax.swing.JLabel warningLabel;
    // End of variables declaration//GEN-END:variables
}
