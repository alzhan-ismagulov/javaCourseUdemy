package com.innerclasses;

//Создание класса Display
public class Display {

    //Свойства класса
    private final static int DISPLAY_HEIGHT = 1920;
    private final static int DISPLAY_WIDTH = 1080;
    private int x = 0;

    //Создание конструктора класса Display
    public Display() {
        //Создание объекта Pixel в конструкторе класса Display
        Pixel pixel = new Pixel(1,1, Color.RED);
    }

    //Создание внутреннего класса
    private class Pixel{
        //Свойства класса
        private int x;
        private int y;
        private Color color;

        //Создание конструктора внутреннего класса Pixel
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

//        public void testScope(int x){
//            System.out.println("x = " + x);
//            System.out.println("this.x = " + this.x);
//            System.out.println("Display.this.x = " + Display.this.x);
//        }
    }

    //Создание перечисления Color
    public enum Color{
        RED, GREEN, BLUE, CIAN, MAGENTA, YELLOW, BLACK;
    }
}
