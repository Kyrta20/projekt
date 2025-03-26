package org.Characters;

import java.awt.*;

public class Tree {
    public Coordinates coord;
    public int width;
    public int height;
    public Color color;

    public Tree(int x, int y, int width, int height, Color color) {
        this.coord = new Coordinates(x, y);
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public Tree() {

    }


}
