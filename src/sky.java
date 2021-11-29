import wheelsunh.users.*;
import wheelsunh.users.Frame;

import java.awt.*;

public class sky implements Animator, Seasonal {

    int count = 0;
    //declare variables for sky object
    private Ellipse cloudPiece;
    private Ellipse precipitation;
    private Ellipse sun;
    private Line lightning;

    public sky() {
    }




    @Override
    public void winter() {
        //sky parts
        this.sun = new Ellipse();
        this.sun.setSize(70, 70);
        this.sun.setLocation(440, 10);
        this.sun.setColor(Color.yellow);

        this.cloudPiece = new Ellipse();
        this.cloudPiece.setColor(Color.GRAY);
        this.cloudPiece.setLocation(400, 20);
        this.cloudPiece.setSize(40, 40);

        this.cloudPiece = new Ellipse();
        this.cloudPiece.setColor(Color.GRAY);
        this.cloudPiece.setLocation(430, 20);
        this.cloudPiece.setSize(40, 40);

        this.cloudPiece = new Ellipse();
        this.cloudPiece.setColor(Color.GRAY);
        this.cloudPiece.setLocation(400, 40);
        this.cloudPiece.setSize(40, 40);

        this.cloudPiece = new Ellipse();
        this.cloudPiece.setColor(Color.GRAY);
        this.cloudPiece.setLocation(430, 40);
        this.cloudPiece.setSize(40, 40);

        this.precipitation = new Ellipse();
        this.precipitation.setColor(Color.LIGHT_GRAY);
        this.precipitation.setLocation(410, 90);
        this.precipitation.setSize(5, 5);

        this.precipitation = new Ellipse();
        this.precipitation.setColor(Color.LIGHT_GRAY);
        this.precipitation.setLocation(450, 90);
        this.precipitation.setSize(5, 5);

        this.precipitation = new Ellipse();
        this.precipitation.setColor(Color.LIGHT_GRAY);
        this.precipitation.setLocation(410, 110);
        this.precipitation.setSize(5, 5);

        this.precipitation = new Ellipse();
        this.precipitation.setColor(Color.LIGHT_GRAY);
        this.precipitation.setLocation(450, 110);
        this.precipitation.setSize(5, 5);

        this.precipitation = new Ellipse();
        this.precipitation.setColor(Color.LIGHT_GRAY);
        this.precipitation.setLocation(430, 110);
        this.precipitation.setSize(5, 5);

        this.precipitation = new Ellipse();
        this.precipitation.setColor(Color.LIGHT_GRAY);
        this.precipitation.setLocation(430, 110);
        this.precipitation.setSize(5, 5);

        this.precipitation = new Ellipse();
        this.precipitation.setColor(Color.LIGHT_GRAY);
        this.precipitation.setLocation(430, 90);
        this.precipitation.setSize(5, 5);

        this.precipitation = new Ellipse();
        this.precipitation.setColor(Color.LIGHT_GRAY);
        this.precipitation.setLocation(430, 90);
        this.precipitation.setSize(5,5);
    }

    @Override
    public void spring() {

        //sky parts
        this.cloudPiece = new Ellipse();
        this.cloudPiece.setColor(Color.lightGray);
        this.cloudPiece.setLocation(400, 20);
        this.cloudPiece.setSize(40, 40);

        this.cloudPiece = new Ellipse();
        this.cloudPiece.setColor(Color.lightGray);
        this.cloudPiece.setLocation(430, 20);
        this.cloudPiece.setSize(40, 40);

        this.cloudPiece = new Ellipse();
        this.cloudPiece.setColor(Color.lightGray);
        this.cloudPiece.setLocation(400, 40);
        this.cloudPiece.setSize(40, 40);

        this.cloudPiece = new Ellipse();
        this.cloudPiece.setColor(Color.lightGray);
        this.cloudPiece.setLocation(430, 40);
        this.cloudPiece.setSize(40, 40);

        this.precipitation = new Ellipse();
        this.precipitation.setColor(Color.BLUE);
        this.precipitation.setLocation(410, 90);
        this.precipitation.setSize(5, 5);

        this.precipitation = new Ellipse();
        this.precipitation.setColor(Color.BLUE);
        this.precipitation.setLocation(450, 90);
        this.precipitation.setSize(5, 5);

        this.precipitation = new Ellipse();
        this.precipitation.setColor(Color.BLUE);
        this.precipitation.setLocation(410, 110);
        this.precipitation.setSize(5, 5);

        this.precipitation = new Ellipse();
        this.precipitation.setColor(Color.BLUE);
        this.precipitation.setLocation(450, 110);
        this.precipitation.setSize(5, 5);

        this.precipitation = new Ellipse();
        this.precipitation.setColor(Color.BLUE);
        this.precipitation.setLocation(430, 110);
        this.precipitation.setSize(5, 5);

        this.precipitation = new Ellipse();
        this.precipitation.setColor(Color.BLUE);
        this.precipitation.setLocation(430, 110);
        this.precipitation.setSize(5, 5);

        this.precipitation = new Ellipse();
        this.precipitation.setColor(Color.BLUE);
        this.precipitation.setLocation(430, 90);
        this.precipitation.setSize(5, 5);

        this.precipitation = new Ellipse();
        this.precipitation.setColor(Color.BLUE);
        this.precipitation.setLocation(430, 90);
        this.precipitation.setSize(5,5);

    }

    @Override
    public void summer() {

        //sky parts
        this.lightning = new Line();
        this.lightning.setPoints(430,60,400,120);
        this.lightning.setThickness(5);
        this.lightning.setColor(Color.yellow);

        this.lightning = new Line();
        this.lightning.setPoints(460,60,430,120);
        this.lightning.setThickness(5);
        this.lightning.setColor(Color.yellow);

        this.cloudPiece = new Ellipse();
        this.cloudPiece.setColor(Color.BLACK);
        this.cloudPiece.setLocation(400, 20);
        this.cloudPiece.setSize(40, 40);

        this.cloudPiece = new Ellipse();
        this.cloudPiece.setColor(Color.BLACK);
        this.cloudPiece.setLocation(430, 20);
        this.cloudPiece.setSize(40, 40);

        this.cloudPiece = new Ellipse();
        this.cloudPiece.setColor(Color.BLACK);
        this.cloudPiece.setLocation(400, 40);
        this.cloudPiece.setSize(40, 40);

        this.cloudPiece = new Ellipse();
        this.cloudPiece.setColor(Color.BLACK);
        this.cloudPiece.setLocation(430, 40);
        this.cloudPiece.setSize(40, 40);

        this.precipitation = new Ellipse();
        this.precipitation.setColor(Color.WHITE);
        this.precipitation.setLocation(410, 90);
        this.precipitation.setSize(5, 5);

        this.precipitation = new Ellipse();
        this.precipitation.setColor(Color.WHITE);
        this.precipitation.setLocation(450, 90);
        this.precipitation.setSize(5, 5);

        this.precipitation = new Ellipse();
        this.precipitation.setColor(Color.WHITE);
        this.precipitation.setLocation(410, 110);
        this.precipitation.setSize(5, 5);

        this.precipitation = new Ellipse();
        this.precipitation.setColor(Color.WHITE);
        this.precipitation.setLocation(450, 110);
        this.precipitation.setSize(5, 5);

        this.precipitation = new Ellipse();
        this.precipitation.setColor(Color.WHITE);
        this.precipitation.setLocation(430, 110);
        this.precipitation.setSize(5, 5);

        this.precipitation = new Ellipse();
        this.precipitation.setColor(Color.WHITE);
        this.precipitation.setLocation(430, 110);
        this.precipitation.setSize(5, 5);

        this.precipitation = new Ellipse();
        this.precipitation.setColor(Color.WHITE);
        this.precipitation.setLocation(430, 90);
        this.precipitation.setSize(5, 5);

        this.precipitation = new Ellipse();
        this.precipitation.setColor(Color.WHITE);
        this.precipitation.setLocation(430, 90);
        this.precipitation.setSize(5,5);

    }

    @Override
    public void fall() {

        //sky parts
        this.lightning = new Line();
        this.lightning.setPoints(460,60,430,120);
        this.lightning.setThickness(5);
        this.lightning.setColor(Color.WHITE);

        this.lightning = new Line();
        this.lightning.setPoints(430,60,400,120);
        this.lightning.setThickness(5);
        this.lightning.setColor(Color.WHITE);

        this.cloudPiece = new Ellipse();
        this.cloudPiece.setColor(Color.lightGray);
        this.cloudPiece.setLocation(400, 20);
        this.cloudPiece.setSize(40, 40);

        this.cloudPiece = new Ellipse();
        this.cloudPiece.setColor(Color.lightGray);
        this.cloudPiece.setLocation(430, 20);
        this.cloudPiece.setSize(40, 40);

        this.cloudPiece = new Ellipse();
        this.cloudPiece.setColor(Color.lightGray);
        this.cloudPiece.setLocation(400, 40);
        this.cloudPiece.setSize(40, 40);

        this.cloudPiece = new Ellipse();
        this.cloudPiece.setColor(Color.lightGray);
        this.cloudPiece.setLocation(430, 40);
        this.cloudPiece.setSize(40, 40);

    }
    @Override
    public void animate() {

        if (count % 4 == 0)
            winter();
        else if (count % 4 == 1)
            spring();
        else if (count % 4 == 2)
            summer();
        else if (count % 4 == 3)
            fall();

        count++;

    }
}