package game;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;



public class Apple extends Polygon implements ApplesInt {
  int count;
  Color color;
  Random random = new Random();

  public Apple(Point[] inShape, Point inPosition, double inRotation, int count) {
	  super(inShape, inPosition, inRotation);
	  this.count = count;
	  this.color = Color.RED;
  }
  public static Point spawn() {
	  Random random = new Random(); 
		 double xpos = random.nextInt(800);
		 double ypos = random.nextInt(800);
		 Point pos = new Point(xpos, ypos);
		 return pos;
  }
  
  public static Point respawn() {
	  i
  }
  public static void eaten() {
	  if (collides()) {
		  
	  }
  }
  /**
   * 
   * @param brush
   * get the points of the apple object from the inShape array and uses it to 
   * paint a apple on the board
   */
  void paint(Graphics brush) {
	Point[] apple = getPoints();
	
	int[] xCoord = new int[apple.length];
	int[] yCoord = new int[apple.length];
	
	for(int i = 0; i < apple.length; i++) {
		xCoord[i] =  (int) apple[i].getX();
		yCoord[i] = (int) apple[i].getY();
	}
	brush.setColor(Color.RED);
	brush.fillPolygon(xCoord, yCoord, apple.length);
  }
  
    
}
  
