package com.oop1;

public class Dog {
    private static int dogsCount;
    public static final int PAWS = 4;
    public static final int TAIL = 1;
    private String name;
    private Size size = Size.UNDEFINED;
    private String breed;

    public Dog(){
        dogsCount++;
        System.out.println("Dog's count is " + dogsCount);
    }

    public static int getDogsCount(){
        return dogsCount;
    }

    public Size getSize(){
        return size;
    }

    public void setSize(Size size){
        this.size = size;
//        if (size.equalsIgnoreCase("Big")||
//        size.equalsIgnoreCase("Average")||
//                size.equalsIgnoreCase("Small")){
//            this.size = size;
//            } else {
//            System.out.println("Size should be on of these: Big, Average or Small");
//        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void bark(){
        switch (size){
            case BIG:
                case VERY_BIG: System.out.println("Wof");
            break;
            case AVERAGE: System.out.println("Raf");
            break;
            case SMALL:
                case VERY_SMALL:System.out.println("Tiaf");
            default:
                System.out.println("Dog's size undefined");
        }
    }
    public void bite(){
        if (dogsCount>2){
            System.out.println("Dogs are bitting you");
        } else {
            bark();
        }
    }
}
