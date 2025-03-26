package org;
import org.Characters.Oval;
import org.Characters.Rectangle;
import org.Characters.Tree;

import java.awt.*;
import java.util.ArrayList;

public class GameLogic {
    public int oval;
    public Tree rectangle2;
    public Tree oval2;
    ArrayList<Rectangle>rectangles;
    ArrayList<Oval>ovals;
    public GameLogic() {
        this.rectangles = new ArrayList<>();
        Rectangle rectangle1 = new Rectangle(50, 150,30,100, Color.ORANGE);
        Rectangle rectangle2 = new Rectangle(590, 500,60,40, Color.BLACK);
        this.ovals = new ArrayList<>();
        Oval oval1 = new Oval(20,75,100,100, Color.GREEN);
        Oval oval2 = new Oval(570,470,30,30, Color.BLACK);
        this.rectangles.add(rectangle1);
        this.rectangles.add(rectangle2);
        this.ovals.add(oval1);
        this.ovals.add(oval2);
    }
}
