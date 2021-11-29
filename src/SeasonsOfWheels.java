import wheelsunh.users.AnimationTimer;
import wheelsunh.users.Frame;

/**
 * main driver method to run Changes class
 */
public class SeasonsOfWheels {

    public static void main(String[] args) {
        //declare new display frame
        Frame frame = new Frame();

        //declare new Changes object
        Changes change = new Changes();
        AnimationTimer timer1 = new AnimationTimer(1000,change);
        timer1.start();
        //declare new tree object
        tree tree = new tree();
        AnimationTimer timer = new AnimationTimer(1000, tree);
        timer.start();
        //declare new sky object
        sky sky = new sky();
        AnimationTimer timer2 = new AnimationTimer(1000, sky);
        timer2.start();


    }
}