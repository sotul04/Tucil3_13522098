/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gadget;

/**
 *
 * @author Suthasoma
 */
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import static java.awt.Component.CENTER_ALIGNMENT;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.AbstractBorder;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicBorders;

public class Atom extends  JPanel{

    /**
     * @return the roundTopLeft
     */
    public int getRoundTopLeft() {
        return roundTopLeft;
    }

    /**
     * @param roundTopLeft the roundTopLeft to set
     */
    public void setRoundTopLeft(int roundTopLeft) {
        this.roundTopLeft = roundTopLeft;
        repaint();
    }

    /**
     * @return the roundTopRight
     */
    public int getRoundTopRight() {
        return roundTopRight;
    }

    /**
     * @param roundTopRight the roundTopRight to set
     */
    public void setRoundTopRight(int roundTopRight) {
        this.roundTopRight = roundTopRight;
        repaint();
    }

    /**
     * @return the roundBottomLeft
     */
    public int getRoundBottomLeft() {
        return roundBottomLeft;
    }

    /**
     * @param roundBottomLeft the roundBottomLeft to set
     */
    public void setRoundBottomLeft(int roundBottomLeft) {
        this.roundBottomLeft = roundBottomLeft;
        repaint();
    }

    /**
     * @return the roundBottomRight
     */
    public int getRoundBottomRight() {
        return roundBottomRight;
    }

    /**
     * @param roundBottomRight the roundBottomRight to set
     */
    public void setRoundBottomRight(int roundBottomRight) {
        this.roundBottomRight = roundBottomRight;
        repaint();
    }
    
    private boolean isChange;
    private boolean isDiff;
    private boolean isMatch;
    private int roundTopLeft = 30;
    private int roundTopRight = 30;
    private int roundBottomLeft = 30;
    private int roundBottomRight = 30;
    
    private JLabel infoLabel;
    
    public Atom (String info, boolean isMatch, boolean isChange, boolean isDiff) {
        infoLabel = new JLabel();
        setOpaque(false);
        infoLabel.setText(info);
        infoLabel.setHorizontalAlignment(SwingConstants.CENTER);
        infoLabel.setVerticalAlignment(JLabel.CENTER);
        infoLabel.setPreferredSize(new Dimension(33,33));
        infoLabel.setForeground(Color.WHITE);
        this.isChange = isChange;
        this.isDiff = isDiff;
        this.isMatch = isMatch;
        this.setAlignmentX(CENTER_ALIGNMENT);
        if (isDiff && isMatch) {
            this.setBackground(new Color(120,229,70));
        } else {
            if (isDiff) {
                this.setBackground(new Color(80,0,90));
            } else if (isMatch) {
                this.setBackground(new Color(0,128,48));
            } else {
                this.setBackground(new Color(10,12,50));
            }
        }
        this.setPreferredSize(new Dimension(40, 40));
        this.add(infoLabel);
    }
    
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        if (isChange) {
            g2d.setPaint(Color.RED);
            int[] xpoint = {14,20,27};
            int[] ypoint = {32, 39, 32};
            g2d.fillPolygon(xpoint, ypoint, 3);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        Area area = new Area(createRoundTopLeft());
        if (roundTopRight > 0) {
            area.intersect(new Area(createRoundTopRight()));
        } 
        if (roundBottomLeft > 0) {
            area.intersect(new Area(createRoundBottomLeft()));
        }
        if (roundBottomRight > 0) {
            area.intersect(new Area(createRoundBottomRight()));
        }
        g2.fill(area);
        g2.dispose();
//        if (isMatch && isDiff) {
//            g2 = (Graphics2D) g.create();
//            g2.setClip(area);
//            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//            g2.setColor(Color.YELLOW);
//            g2.drawRoundRect(0, 0, 38, 38, 30, 30);
//            g2.drawRoundRect(1, 1, 37, 37, 29, 29);
//            g2.drawRoundRect(1, 0, 37, 37, 29, 29);
//            g2.drawRoundRect(0, 1, 37, 37, 29, 29);
//            g2.drawRoundRect(1, 1, 37, 37, 29, 29);
//            g2.drawRoundRect(2, 2, 36, 36, 28, 28);
//            g2.drawRoundRect(1, 2, 36, 36, 28, 28);
//            g2.drawRoundRect(2, 1, 36, 36, 28, 28);
//            g2.drawRoundRect(1, 1, 36, 36, 28, 28);
//            g.dispose();
//        }
    }
        
    private Shape createRoundTopRight() {
        int width = getWidth();
        int height = getHeight();
        int roundX = Math.min(width, roundTopRight);
        int roundY = Math.min(height, roundTopRight);
        Area area = new Area(new RoundRectangle2D.Double(0,0,width, height, roundX, roundY));
        area.add(new Area(new Rectangle2D.Double(0, 0, width - roundX / 2, height)));
        area.add(new Area(new Rectangle2D.Double(0, roundY / 2, width, height - roundY / 2)));
        return area;
    }
    
    private Shape createRoundTopLeft() {
        int width = getWidth();
        int height = getHeight();
        int roundX = Math.min(width, roundTopLeft);
        int roundY = Math.min(height, roundTopLeft);
        Area area = new Area(new RoundRectangle2D.Double(0,0,width, height, roundX, roundY));
        area.add(new Area(new Rectangle2D.Double(roundX / 2, 0, width - roundX / 2, height)));
        area.add(new Area(new Rectangle2D.Double(0, roundY / 2, width, height - roundY / 2)));
        return area;
    }
    
    private Shape createRoundBottomRight() {
        int width = getWidth();
        int height = getHeight();
        int roundX = Math.min(width, roundBottomRight);
        int roundY = Math.min(height, roundBottomRight);
        Area area = new Area(new RoundRectangle2D.Double(0,0,width, height, roundX, roundY));
        area.add(new Area(new Rectangle2D.Double(0, 0, width - roundX / 2, height)));
        area.add(new Area(new Rectangle2D.Double(0, 0, width, height - roundY / 2)));
        return area;
    }
    
    private Shape createRoundBottomLeft() {
        int width = getWidth();
        int height = getHeight();
        int roundX = Math.min(width, roundBottomLeft);
        int roundY = Math.min(height, roundBottomLeft);
        Area area = new Area(new RoundRectangle2D.Double(0,0,width, height, roundX, roundY));
        area.add(new Area(new Rectangle2D.Double(roundX / 2, 0, width - roundX / 2, height)));
        area.add(new Area(new Rectangle2D.Double(0, 0, width, height - roundY / 2)));
        return area;
    }
}

