package shapes;

import shapes.Shape;

import java.awt.*;
public class Rectangle extends Shape {
    private int w; // Fields
    private int h;

    public Rectangle(Point initPos, Color col, int width,int height){
        super(initPos, col); // The constructor
        w = width;
        h  = height;
    }

    @Override
    public void draw(Graphics g) { // A method that draws the object in g
        g.setColor(col);
        g.fillRect(pos.x,pos.y,w,h);

    }
}
