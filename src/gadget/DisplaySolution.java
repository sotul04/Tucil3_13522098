/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gadget;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import util.Node;

/**
 *
 * @author Suthasoma
 */
public class DisplaySolution extends javax.swing.JFrame {

    /**
     * Creates new form DisplaySolution
     */
    public DisplaySolution(Node solution, int timeElapsed, int nVisited) {
        
        initComponents();
        
        this.setIconImage(new ImageIcon("src/icon.image/controller.png").getImage());
        
        JFrame.setDefaultLookAndFeelDecorated(true);
        
        int len = solution.length();
        
        int pathlen = len > 0 ? len - 1 : 0;
        
        JLabel npathLabel = new JLabel("Panjang lintasan: "+pathlen);
        JLabel timeLabel = new JLabel(timeElapsed + " ms");
        JLabel nodeVisited = new JLabel(nVisited + " node dikunjungi");
        
        timeLabel.setForeground(Color.white);
        nodeVisited.setForeground(Color.white);
        npathLabel.setForeground(Color.white);
        
        jPanel1.setLayout(new GridBagLayout());
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(0, 2, 0, 2);
        
        JLabel dummy = new JLabel("   ");
        JLabel dummy1 = new JLabel("   ");
        JLabel dummy2 = new JLabel("   ");
        
        gbc.gridx = 0;
        
        gbc.gridy = 0;
        jPanel1.add(dummy1, gbc);
        
        gbc.gridy = 1;
        jPanel1.add(npathLabel, gbc);
        
        gbc.gridy = 2;
        jPanel1.add(timeLabel, gbc);
        
        int width = solution.getValue().length() > 24 ? 1800 : solution.getValue().length() * 75;
        
        int height = len > 10 ? 12 * 60 : (len + 1) * 60;
        
        gbc.gridy = 3;
        jPanel1.add(nodeVisited, gbc);
        
        gbc.gridy = 4;
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
            gbc.gridy = con + 5;
            jPanel1.add(new LineContainer(path[con],match[con], change[con], diff[con]), gbc);
            con ++;
        }
        
        gbc.gridy = con+5;
        jPanel1.add(dummy2, gbc);
        
        jPanel1.setSize(new Dimension(width, (len+1)*60));
        
        jScrollPane1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jScrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        
        jScrollPane1.setSize(new Dimension(width, height));
        
        
        this.setSize(jScrollPane1.getSize());
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();

        setTitle("Solusi ");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(0, 51, 51));
        setIconImages(null);
        setResizable(false);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 406, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 365, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
