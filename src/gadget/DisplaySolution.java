/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gadget;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import util.Node;

/**
 *
 * @author Suthasoma
 */
public class DisplaySolution extends javax.swing.JFrame {
    
    private JFrame parent;

    /**
     * Creates new form DisplaySolution
     */
    public DisplaySolution(Node solution, int timeElapsed, int nVisited, javax.swing.JFrame parent) {
        
        initComponents();
        
        this.setIconImage(new ImageIcon("src/icon.image/controller.png").getImage());
        
        this.parent = parent;
        
        int len = solution.length();
        
        int pathlen = len > 0 ? len - 1 : 0;
        
        JLabel npathLabel = new JLabel("Panjang lintasan: "+pathlen);
        JLabel timeLabel = new JLabel(timeElapsed + " ms");
        JLabel nodeVisited = new JLabel(nVisited + " node dikunjungi");
        
        timeLabel.setForeground(Color.white);
        nodeVisited.setForeground(Color.white);
        npathLabel.setForeground(Color.white);
        
        JLabel dummy = new JLabel("   ");
                
        jPanel1.setLayout(new GridBagLayout());
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        
        jPanel1.add(npathLabel, gbc);
        
        gbc.gridy = 1;
        jPanel1.add(timeLabel, gbc);
        
        int width = 60 * solution.getValue().length();
        
        gbc.gridy = 2;
        jPanel1.add(nodeVisited,gbc);
        
        gbc.gridy = 3;
        jPanel1.add(dummy, gbc);
        
        boolean[][] match = getMatch(solution);
        boolean[][] change = getChange(solution);
        boolean[][] diff = getDiff(solution);
        
        
        String path[] = new String[len];
        
        for (int i = 0; i < len; i++) {
            path[len-i-1] = solution.getValue();
            solution = solution.getParent();
        }
        
        int con = 0;
        
        while (con < len) {
            gbc.gridy = con + 4;
            jPanel1.add(new LineContainer(path[con],match[con], change[con], diff[con]), gbc);
            con ++;
        }
        
        jPanel1.setSize(new Dimension(width, (2+con)*60));
        
        this.setSize(jPanel1.getSize());
    }
    
    private static boolean[][] getMatch(Node solution) {
        
        int length = solution.length();
        boolean[][] val = new boolean[length][solution.getValue().length()];
        
        String[] path = new String[length];
        
        for (int i = 0; i < length; i++) {
            path[length-1-i] = solution.getValue();
            solution = solution.getParent();
        }
        
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < path[i].length(); j++) {
                if (path[i].charAt(j) == path[length-1].charAt(j)) {
                    val[i][j] = true;
                }
            }
        }
        
        return val;
    }
    
    private static boolean[][] getChange(Node solution) {
        
        int length = solution.length();
        boolean[][] val = new boolean[length][solution.getValue().length()];
        
        String[] path = new String[length];
        
        for (int i = 0; i < length; i++) {
            path[length-1-i] = solution.getValue();
            solution = solution.getParent();
        }
        
        for (int i = 0; i < length-1; i++) {
            for (int j = 0; j < path[i].length(); j++) {
                if (path[i].charAt(j) != path[i+1].charAt(j)) {
                    val[i][j] = true;
                    break;
                }
            }
        }
        
        return val;
    }
    
    private static boolean[][] getDiff(Node solution) {
        
        int length = solution.length();
        boolean[][] val = new boolean[length][solution.getValue().length()];
        
        String[] path = new String[length];
        
        for (int i = 0; i < length; i++) {
            path[length-1-i] = solution.getValue();
            solution = solution.getParent();
        }
        
        for (int i = 1; i < length; i++) {
            for (int j = 0; j < path[i].length(); j++) {
                if (path[i].charAt(j) != path[i-1].charAt(j)) {
                    val[i][j] = true;
                }
            }
        }
        
        return val;
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

        setTitle("Solusi ");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(0, 51, 51));
        setIconImages(null);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        parent.setEnabled(true);
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
