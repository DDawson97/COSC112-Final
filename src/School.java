import java.awt.image.BufferedImage;
import java.awt.Graphics;
public class School extends Enemy{
    public School(int health, Pair position, Pair velocity, Pair acceleration, Pair collider, BufferedImage image, Classifier c){
        super(health, position, velocity, acceleration, collider, image, c);
    }
    public School(int health, Pair position, Pair collider, BufferedImage image, Classifier c){
        super(health, position, new Pair(), new Pair(), collider, image, c);
    }
    public School(){
        super();
       
    }
    
}
