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
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import java.awt.Dimension;

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
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        startLabel = new javax.swing.JLabel();
        endLabel = new javax.swing.JLabel();
        inputStart = new wordladder.InputGrow();
        inputEnd = new wordladder.InputGrow();
        jPanel3 = new javax.swing.JPanel();
        searchButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        labelTypeSearch = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        searchType = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        warningLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Word Ladder");
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

        mainPanel.setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon.image/logo.png"))); // NOI18N
        jLabel3.setPreferredSize(new java.awt.Dimension(620, 90));
        jPanel1.add(jLabel3);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        startLabel.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        startLabel.setForeground(new java.awt.Color(255, 255, 255));
        startLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        startLabel.setText("S t a r t");
        startLabel.setToolTipText("");
        startLabel.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        endLabel.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        endLabel.setForeground(new java.awt.Color(255, 255, 255));
        endLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        endLabel.setText(" E n d");

        inputStart.setNextFocusableComponent(inputEnd);
        inputStart.setOpaque(false);
        inputStart.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                inputStartComponentAdded(evt);
            }
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                inputStartComponentRemoved(evt);
            }
        });
        inputStart.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputStartFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputStartFocusLost(evt);
            }
        });
        inputStart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inputStartMouseClicked(evt);
            }
        });
        inputStart.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputStartKeyTyped(evt);
            }
        });

        inputEnd.setNextFocusableComponent(searchButton);
        inputEnd.setOpaque(false);
        inputEnd.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                inputEndComponentAdded(evt);
            }
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                inputEndComponentRemoved(evt);
            }
        });
        inputEnd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputEndFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputEndFocusLost(evt);
            }
        });
        inputEnd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inputEndMouseClicked(evt);
            }
        });
        inputEnd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputEndKeyTyped(evt);
            }
        });

        jPanel3.setOpaque(false);

        searchButton.setBackground(new java.awt.Color(0, 51, 51));
        searchButton.setFont(new java.awt.Font("STXinwei", 1, 12)); // NOI18N
        searchButton.setForeground(new java.awt.Color(255, 255, 255));
        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon.image/Search.png"))); // NOI18N
        searchButton.setText("Search");
        searchButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchButton.setPreferredSize(new java.awt.Dimension(100, 35));
        searchButton.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
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
        jPanel3.add(searchButton);

        jPanel4.setOpaque(false);

        labelTypeSearch.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        labelTypeSearch.setForeground(new java.awt.Color(255, 255, 255));
        labelTypeSearch.setText("Please select the type of algorithm used");
        jPanel4.add(labelTypeSearch);

        jPanel5.setOpaque(false);

        searchType.setBackground(new java.awt.Color(0, 0, 0));
        searchType.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        searchType.setForeground(new java.awt.Color(255, 255, 255));
        searchType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Uniform Cost Search (UCS)", "Greedy Best First Search", "A* (A Star)" }));
        searchType.setNextFocusableComponent(inputStart);
        searchType.setOpaque(true);
        searchType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTypeActionPerformed(evt);
            }
        });
        jPanel5.add(searchType);

        jPanel6.setOpaque(false);
        jPanel6.add(warningLabel);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputEnd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(startLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(endLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6)))
                .addGap(336, 336, 336))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(startLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputStart, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(endLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 728, Short.MAX_VALUE)
                .addGap(7, 7, 7))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(757, 516));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
        
        String type;
        
        Search solution;
        if (searchType.getSelectedIndex() == 0) {
            solution = new UCSearch(inputStart.getText().toLowerCase(), inputEnd.getText().toLowerCase());
            startTime = System.currentTimeMillis();
            solution.search();
            endTime = System.currentTimeMillis();
            type = "Uniform Cost Search";
        } else if (searchType.getSelectedIndex() == 1) {
            solution = new BestFirstSearch(inputStart.getText().toLowerCase(), inputEnd.getText().toLowerCase());
            startTime = System.currentTimeMillis();
            solution.search();
            endTime = System.currentTimeMillis();
            type = "Greedy Best First Search";
        } else {
            solution = new AStartSearch(inputStart.getText().toLowerCase(), inputEnd.getText().toLowerCase());
            startTime = System.currentTimeMillis();
            solution.search();
            endTime = System.currentTimeMillis();
            type = "A* Star";
        }
        
        long elapsed = endTime - startTime;
        
        if (solution.getSolution() == null) {
            JOptionPane.showMessageDialog(rootPane, "Solusi tidak ditemukan", "Solutions not found", JOptionPane.PLAIN_MESSAGE);
        } else {
            DisplaySolution disp = new DisplaySolution(solution.getSolution(), (int) elapsed, solution.getCounterNode(), type);
            disp.setVisible(true);
            disp.setLocationRelativeTo(this);
        }
    }
    
    private void validateInput() {
        String start = inputStart.getText().toLowerCase();
        String end = inputEnd.getText().toLowerCase();
                
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

    private void inputStartKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputStartKeyTyped
        // TODO add your handling code here:
        inputStart.typing(evt.getKeyChar());
    }//GEN-LAST:event_inputStartKeyTyped

    private void inputEndKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputEndKeyTyped
        // TODO add your handling code here:
        inputEnd.typing(evt.getKeyChar());
    }//GEN-LAST:event_inputEndKeyTyped

    private void inputStartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputStartMouseClicked
        // TODO add your handling code here:
        inputStart.requestFocus();
    }//GEN-LAST:event_inputStartMouseClicked

    private void inputEndMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputEndMouseClicked
        // TODO add your handling code here:
        inputEnd.requestFocus();
    }//GEN-LAST:event_inputEndMouseClicked

    private void inputStartFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputStartFocusGained
        // TODO add your handling code here:
        inputStart.setBorder(new LineBorder(new Color(51,141,248), 1, true));
    }//GEN-LAST:event_inputStartFocusGained

    private void inputStartFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputStartFocusLost
        // TODO add your handling code here:
        inputStart.setBorder(null);
    }//GEN-LAST:event_inputStartFocusLost

    private void inputEndFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputEndFocusGained
        // TODO add your handling code here:
        inputEnd.setBorder(new LineBorder(new Color(51,141,248), 1, true));
    }//GEN-LAST:event_inputEndFocusGained

    private void inputEndFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputEndFocusLost
        // TODO add your handling code here:
        inputEnd.setBorder(null);
    }//GEN-LAST:event_inputEndFocusLost

    private void inputStartComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_inputStartComponentAdded
        // TODO add your handling code here:
        validateInput();
    }//GEN-LAST:event_inputStartComponentAdded

    private void inputEndComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_inputEndComponentAdded
        // TODO add your handling code here:
        validateInput();
    }//GEN-LAST:event_inputEndComponentAdded

    private void inputStartComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_inputStartComponentRemoved
        // TODO add your handling code here:
        validateInput();
    }//GEN-LAST:event_inputStartComponentRemoved

    private void inputEndComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_inputEndComponentRemoved
        // TODO add your handling code here:
        validateInput();
    }//GEN-LAST:event_inputEndComponentRemoved
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
    private wordladder.InputGrow inputEnd;
    private wordladder.InputGrow inputStart;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel labelTypeSearch;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton searchButton;
    private javax.swing.JComboBox<String> searchType;
    private javax.swing.JLabel startLabel;
    private javax.swing.JLabel warningLabel;
    // End of variables declaration//GEN-END:variables
}
