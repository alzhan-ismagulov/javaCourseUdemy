package com.innerclasses;

public class Display {
    private final static int DISPLAY_HEIGHT = 1920;
    private final static int DISPLAY_WIDTH = 1080;

    public Display() {
        Pixel pixel = new Pixel(1,1, Color.RED);
    }

    private static class Pixel{
        private int x;
        private int y;
        private Color color;

        private Pixel(int x, int y, Color color) {
            if (x>=0 && x<= DISPLAY_WIDTH && y>=0 && y<= DISPLAY_HEIGHT) {
                this.x = x;
                this.y = y;
                this.color = color;
                System.out.println("Creating " + color +" pixel at (" + x + ", " + y + ")");
            } else {
                throw new IllegalArgumentException("Coordinates x and y should be between 0 -" + DISPLAY_WIDTH + " and 0 + " + DISPLAY_HEIGHT);
            }
        }
    }

    public enum Color{
        RED, GREEN, BLUE, CIAN, MAGENTA, YELLOW, BLACK;
    }
}
