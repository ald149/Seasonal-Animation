import wheelsunh.users.Animator;
import wheelsunh.users.Ellipse;
import wheelsunh.users.Line;

import java.awt.*;

/**
 * Changes class contains methods that change 3 objects for each of 4 seasons and
 * animation method to call each season in succession
 * @author ald149@psu.edu
 * M9 Assignment
 */
public class Changes implements Animator, Seasonal {


    //declare variables for flower object
    private Line stem;
    private Ellipse petals;
    private Ellipse leaf;
    private Ellipse flowerCenter;

    int count = 0;      //count variable used in for animate method to iterate through seasons


    /**
     * constructor
     */
    public Changes() {

    }

    /**
     * function that defines object in winter mode
     */
    @Override
    public void winter() {


        //flower parts
        this.stem = new Line();
        this.stem.setPoints(100, 175, 100, 100);
        this.stem.setThickness(5);
        this.stem.setColor(Color.ORANGE);

        this.flowerCenter = new Ellipse();
        this.flowerCenter.setLocation(92, 75);
        this.flowerCenter.setSize(15, 15);
        this.flowerCenter.setColor(Color.WHITE);

        this.leaf = new Ellipse();
        this.leaf.setLocation(72, 120);
        this.leaf.setSize(25, 10);
        this.leaf.setColor(Color.yellow);

        this.leaf = new Ellipse();
        this.leaf.setLocation(100, 120);
        this.leaf.setSize(25, 10);
        this.leaf.setColor(Color.yellow);

        this.petals = new Ellipse();
        this.petals.setColor(Color.WHITE);
        this.petals.setSize(20, 20);
        this.petals.setLocation(80, 85);

        this.petals = new Ellipse();
        this.petals.setColor(Color.WHITE);
        this.petals.setSize(20, 20);
        this.petals.setLocation(80, 60);

        this.petals = new Ellipse();
        this.petals.setColor(Color.WHITE);
        this.petals.setSize(20, 20);
        this.petals.setLocation(100, 60);

        this.petals = new Ellipse();
        this.petals.setColor(Color.WHITE);
        this.petals.setSize(20, 20);
        this.petals.setLocation(100, 85);

    }
        /**
         * method that makes changes into spring
         */
        @Override
        public void spring () {


            //flower parts
            this.leaf = new Ellipse();
            this.leaf.setLocation(72, 120);
            this.leaf.setSize(25, 10);
            this.leaf.setColor(Color.GREEN);

            this.leaf = new Ellipse();
            this.leaf.setLocation(100, 120);
            this.leaf.setSize(25, 10);
            this.leaf.setColor(Color.GREEN);

            this.petals = new Ellipse();
            this.petals.setColor(Color.PINK);
            this.petals.setSize(20, 20);
            this.petals.setLocation(80, 85);

            this.petals = new Ellipse();
            this.petals.setColor(Color.PINK);
            this.petals.setSize(20, 20);
            this.petals.setLocation(80, 60);

            this.petals = new Ellipse();
            this.petals.setColor(Color.PINK);
            this.petals.setSize(20, 20);
            this.petals.setLocation(100, 60);

            this.petals = new Ellipse();
            this.petals.setColor(Color.PINK);
            this.petals.setSize(20, 20);
            this.petals.setLocation(100, 85);

            this.stem.setColor(Color.GREEN);
            this.flowerCenter.setColor(Color.ORANGE);

        }

        /**
         * function to makes changes into summer
         */
        @Override
        public void summer () {


            //flower parts
            this.flowerCenter.setColor(Color.GREEN);

            this.petals = new Ellipse();
            this.petals.setColor(Color.RED);
            this.petals.setSize(20, 20);
            this.petals.setLocation(80, 85);

            this.petals = new Ellipse();
            this.petals.setColor(Color.RED);
            this.petals.setSize(20, 20);
            this.petals.setLocation(80, 60);

            this.petals = new Ellipse();
            this.petals.setColor(Color.RED);
            this.petals.setSize(20, 20);
            this.petals.setLocation(100, 60);

            this.petals = new Ellipse();
            this.petals.setColor(Color.RED);
            this.petals.setSize(20, 20);
            this.petals.setLocation(100, 85);


        }

        /**
         * function to make changes to fall
         */
        @Override
        public void fall () {

            // flower parts
            this.stem.setColor(Color.GRAY);
            this.flowerCenter.setColor(Color.RED);

            this.petals = new Ellipse();
            this.petals.setColor(Color.YELLOW);
            this.petals.setSize(20, 20);
            this.petals.setLocation(80, 85);

            this.petals = new Ellipse();
            this.petals.setColor(Color.YELLOW);
            this.petals.setSize(20, 20);
            this.petals.setLocation(80, 60);

            this.petals = new Ellipse();
            this.petals.setColor(Color.YELLOW);
            this.petals.setSize(20, 20);
            this.petals.setLocation(100, 60);

            this.petals = new Ellipse();
            this.petals.setColor(Color.YELLOW);
            this.petals.setSize(20, 20);
            this.petals.setLocation(100, 85);
        }

        /**
         * method that calls each season in succession to create animation
         */
        @Override
        public void animate () {

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




