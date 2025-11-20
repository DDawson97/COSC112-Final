import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import javax.swing.JPanel;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

// """
//         This class reads a map from the image and converts to 2d array which can later be used 
//         to make physical structures in the game
//         """;

public class TileMap extends JPanel implements Drawable{
    private BufferedImage mapImage;
    private int width;
    private int height;
    private int colorIndex;
    private Tile[][] pixels;
    private boolean left;
    public static double tileSize = 512; // Size of each cell
    // Dictionary of colors on the map
    //HashMap<Integer, Integer> colorCounts = new HashMap<Integer,Integer>();


    public TileMap(){
            // Get the width and height of the image
            width = 200;
            height = 200;
            pixels = new Tile[width][height];
            // Loop through each pixel and store its RGB value in the array

            for (int col = 0; col < width; col++) {
                for (int row = 0; row < height; row++) {
                    pixels[col][row] = new Tile(new Pair(col*tileSize,row*tileSize), tileSize, Figures.mapImage1);
                }
            }
    
    }
   public void draw(Graphics g){
        if (left ){
            for (int row = 0; row < height; row++) {
                for (int col = 0; col < width; col++) {
                    Tile tile = pixels[col][row];
                    if ((tile.getPosition().getX() > Main.hero.getPosition().getX() - Main.SCREEN_WIDTH ) &&
                    (tile.getPosition().getX() < Main.hero.getPosition().getX() + Main.SCREEN_WIDTH ) &&
                    (tile.getPosition().getY() > Main.hero.getPosition().getY() - Main.SCREEN_HEIGHT ) &&
                    (tile.getPosition().getY() < Main.hero.getPosition().getY() + Main.SCREEN_HEIGHT )){
                        tile.setImage(Figures.mapImage1);
                        tile.draw(g);
                    }
                }
            }
        }
        else if (!left){
            for (int row = 0; row < height; row++) {
                for (int col = 0; col < width; col++) {
                    Tile tile = pixels[col][row];
                    if ((tile.getPosition().getX() > Main.hero.getPosition().getX() - Main.SCREEN_WIDTH) &&
                    (tile.getPosition().getX() < Main.hero.getPosition().getX() + Main.SCREEN_WIDTH ) &&
                    (tile.getPosition().getY() > Main.hero.getPosition().getY() - Main.SCREEN_HEIGHT ) &&
                    (tile.getPosition().getY() < Main.hero.getPosition().getY() + Main.SCREEN_HEIGHT )){
                        tile.setImage(Figures.mapImage2);
                        tile.draw(g);
                    }
                }
            }

        }
        if (Main.TIME % 25 == 0){
            this.left = !this.left;
        }
        
       }
    public Tile[][] getPixels(){
        return this.pixels;
    }
   public static void main(String[] args) {
    
   }

    
}
