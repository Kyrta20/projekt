package org;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Game {
    GameLogic logic = new GameLogic();


    public static void main(String[] args) {
        new Game();
    }

    public Game() {
        final GameGraphics graphics = new GameGraphics(logic);
        graphics.render(logic);
        graphics.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_LEFT){
                    logic.rectangle2.coord.x--;
                    graphics.render(logic);
                }
                if (e.getKeyCode() == KeyEvent.VK_UP){
                    logic.oval2.coord.y++;
                    graphics.render(logic);
            }

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        }); {


    }


    }
}