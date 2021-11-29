import wheelsunh.users.Animator;
import wheelsunh.users.Ellipse;
import wheelsunh.users.Line;

import java.awt.*;

public class tree implements Animator, Seasonal{

    //declare variables for tree object
    private Line trunk;
    private Line branch;
    private Ellipse treeLeaf;
    private Ellipse hollow;
    private Line grass;
    int count = 0;


    public tree() {

    }

    @Override
    public void winter() {
        //tree parts
        this.treeLeaf = new Ellipse();
        this.treeLeaf.setSize(85,85);
        this.treeLeaf.setLocation(5,285);
        this.treeLeaf.setColor(Color.WHITE);

        this.treeLeaf = new Ellipse();
        this.treeLeaf.setSize(85,85);
        this.treeLeaf.setLocation(62,215);
        this.treeLeaf.setColor(Color.WHITE);

        this.treeLeaf = new Ellipse();
        this.treeLeaf.setSize(85,85);
        this.treeLeaf.setLocation(105,285);
        this.treeLeaf.setColor(Color.WHITE);

        this.trunk = new Line();
        this.trunk.setThickness(25);
        this.trunk.setPoints(100,450,100,350);
        this.trunk.setColor(Color.ORANGE);

        this.grass = new Line();
        this.grass.setColor(Color.YELLOW);
        this.grass.setThickness(10);
        this.grass.setPoints(10,460,200,460);

        this.hollow = new Ellipse();
        this.hollow.setColor(Color.BLACK);
        this.hollow.setSize(15,25);
        this.hollow.setLocation(92,380);

        this.branch = new Line();
        this.branch.setThickness(10);
        this.branch.setPoints(45,300,100,350);
        this.branch.setColor(Color.ORANGE);

        this.branch = new Line();
        this.branch.setThickness(10);
        this.branch.setPoints(100,250,100,350);
        this.branch.setColor(Color.ORANGE);

        this.branch = new Line();
        this.branch.setThickness(10);
        this.branch.setPoints(145,300,100,350);
        this.branch.setColor(Color.ORANGE);
    }

    @Override
    public void spring() {
        //tree parts
        this.grass.setColor(Color.GREEN);
        this.treeLeaf = new Ellipse();
        this.treeLeaf.setSize(35,35);
        this.treeLeaf.setLocation(25,285);
        this.treeLeaf.setColor(Color.GREEN);

        this.treeLeaf = new Ellipse();
        this.treeLeaf.setSize(35,35);
        this.treeLeaf.setLocation(82,235);
        this.treeLeaf.setColor(Color.GREEN);

        this.treeLeaf = new Ellipse();
        this.treeLeaf.setSize(35,35);
        this.treeLeaf.setLocation(125,285);
        this.treeLeaf.setColor(Color.GREEN);


    }

    @Override
    public void summer() {
        //tree parts
        this.treeLeaf = new Ellipse();
        this.treeLeaf.setSize(85,85);
        this.treeLeaf.setLocation(5,285);
        this.treeLeaf.setColor(Color.GREEN);

        this.treeLeaf = new Ellipse();
        this.treeLeaf.setSize(85,85);
        this.treeLeaf.setLocation(62,215);
        this.treeLeaf.setColor(Color.GREEN);

        this.treeLeaf = new Ellipse();
        this.treeLeaf.setSize(85,85);
        this.treeLeaf.setLocation(105,285);
        this.treeLeaf.setColor(Color.GREEN);

    }

    @Override
    public void fall() {
        //tree parts
        this.grass.setColor(Color.YELLOW);

        this.treeLeaf = new Ellipse();
        this.treeLeaf.setSize(85,85);
        this.treeLeaf.setLocation(5,285);
        this.treeLeaf.setColor(Color.RED);

        this.treeLeaf = new Ellipse();
        this.treeLeaf.setSize(85,85);
        this.treeLeaf.setLocation(62,215);
        this.treeLeaf.setColor(Color.ORANGE);

        this.treeLeaf = new Ellipse();
        this.treeLeaf.setSize(85,85);
        this.treeLeaf.setLocation(105,285);
        this.treeLeaf.setColor(Color.YELLOW);
        
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
