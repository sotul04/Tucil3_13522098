/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gadget;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

/**
 *
 * @author Suthasoma
 */
public class Unit extends javax.swing.JPanel {
    
    private boolean isChange;

    /**
     * Creates new form Unit
     */
    public Unit(String info, boolean isMatch, boolean isChange, boolean isDiff) {
        initComponents();
        infoLabel.setText(info);
        infoLabel.setHorizontalAlignment(SwingConstants.CENTER);
        infoLabel.setVerticalAlignment(JLabel.CENTER);
        this.isChange = isChange;
        this.setAlignmentX(CENTER_ALIGNMENT);
        if (isDiff && isMatch) {
            this.setBackground(new Color(0,128,48));
            LineBorder lineBorder = new LineBorder(Color.yellow, 4, true);
            this.setBorder(lineBorder);
        } else {
            if (isDiff) {
                this.setBackground(Color.LIGHT_GRAY);
            } else if (isMatch) {
                this.setBackground(new Color(0,128,48));
            }
        }
    }
    
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        if (isChange) {
            g2d.setPaint(Color.YELLOW);
            int[] xpoint = {14,20,26};
            int[] ypoint = {33, 39, 33};
            g2d.fillPolygon(xpoint, ypoint, 3);
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

        infoLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));
        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setPreferredSize(new java.awt.Dimension(40, 40));

        infoLabel.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        infoLabel.setForeground(new java.awt.Color(255, 255, 255));
        infoLabel.setAlignmentX(0.5F);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(infoLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(infoLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel infoLabel;
    // End of variables declaration//GEN-END:variables
}
