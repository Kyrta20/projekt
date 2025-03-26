package org.Characters;

import java.awt.*;

public class Oval extends Tree{
    public Oval(int x, int y, int width, int height, Color color) {
        super(x, y, width, height, color);
    }

    public void getAllCoordinates() {
        for(int i = this.coord.x; i < this.coord.x + this.width; ++i) {
            for(int j = this.coord.y; j < this.coord.y + this.height; ++j) {
            }
        }

    }
}

