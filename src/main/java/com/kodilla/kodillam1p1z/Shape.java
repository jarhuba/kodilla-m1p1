package com.kodilla.kodillam1p1z;

public interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("I'm drawing a circle for you!");
    }
}

class ShapeDrawer {

    private Shape shape;

    public ShapeDrawer(Shape shape) {
        this.shape = shape;
    }

    public void process() {
        System.out.println("Starting to draw the chosen shape...");
        this.shape.draw();
        System.out.println("Shape has been drawn.");
    }
}

class App {
    public static void main(String[] args) throws java.lang.Exception {
        ShapeDrawer drawer = new ShapeDrawer(new Circle());

        drawer.process();
    }
}
