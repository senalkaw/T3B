import shapes.Rectangle;
import shapes.Square;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Drawing extends Canvas {

    private Frame f;
    private Circle c;
    private shapes.Rectangle r;
    private Square s ;
    private Point p;
    private Color c2;

    public Drawing() {
        f = new Frame("My window"); // Instantiates the Frame

        Point p=new Point(100,100);
        Color c2=new Color(0x992266);// The RGB number comprises three bytes: red, green and blue
        c = new Circle (p,c2,250);
        p.x = p.x +10;
        r = new Rectangle(p,c2,150,175);
        s=new Square(p,c2,50);



        f.add(this); // Adds the Canvas to the Frame
        f.setLayout(null); // Stops the frame from trying to layout contents
        f.setSize(400, 400); // Sets the dimensions of the frame
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {    // Closes the frame if close window clicked
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
        setBackground(Color.WHITE); // Sets the Canvas background
        setSize(400, 400); // Sets the Canvas size to be the same as the frame


    }

    public void paint(Graphics g) { // A method that draws the object in g

c.draw(g);
r.draw(g);

    }
}

