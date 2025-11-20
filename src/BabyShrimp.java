import java.awt.image.BufferedImage;
public class BabyShrimp extends Enemy{
    public BabyShrimp(int health, Pair position, Pair velocity, Pair acceleration, Pair collider, BufferedImage image, Classifier c){
        super(health, position, velocity, acceleration, collider, image, c);
    }
    public BabyShrimp(int health, Pair position, Pair collider, BufferedImage image, Classifier c){
        super(health, position, new Pair(), new Pair(), collider, image, c);
    }
    public BabyShrimp(){
        super();
       
    }
    public void follow(MainCharacter hero){
        super.follow(hero);
    }
}
