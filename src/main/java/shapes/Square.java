package shapes;

import shapes.Rectangle;

import java.awt.*;

public class Square extends Rectangle {
    private int w; // Fields
    private int h;

    public Square(Point initPos, Color col,int side){
        super(initPos, col,side,side); // The constructor

    }

    @Override
    public void draw(Graphics g) { // A method that draws the object in g
        g.setColor(col);


    }

}
