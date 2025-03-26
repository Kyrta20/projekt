package org;

import org.Characters.Oval;
import org.Characters.Rectangle;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.HeadlessException;

public class GameGraphics extends JFrame{
    GameLogic logic;
    Draw draw;

    public GameGraphics(GameLogic logic) throws HeadlessException{
        this.logic = logic;
        this.draw = new Draw();
        this.add(this.draw);
        this.setSize(800, 600);
        this.setLocationRelativeTo((Component) null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public void render(GameLogic logic) {
        this.logic = logic;
        this.repaint();
    }
    private class Draw extends JPanel{
        private Draw(){

        }
        public void paintComponent(Graphics g){
            for(Oval rectangle : GameGraphics.this.logic.ovals) {
                g.setColor(rectangle.color);
                g.fillRect(rectangle.coord.x, rectangle.coord.y, rectangle.width, rectangle.height);
            }
            for(Rectangle oval : GameGraphics.this.logic.rectangles) {
                g.setColor(oval.color);
                g.fillRect(oval.coord.x, oval.coord.y, oval.width, oval.height);
            }
        }
    }
}
