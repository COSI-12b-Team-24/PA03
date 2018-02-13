<<<<<<< HEAD
package pa03;

||||||| merged common ancestors
=======
package pa03;
import java.awt.Color;

>>>>>>> 9ed0c852389ccee75e3e891816522b398c366276
public class BingyangShape extends CircleShape {
<<<<<<< HEAD
  public java.awt.Color borderColor;
||||||| merged common ancestors
  public double borderColor;
=======
  public Color borderColor;
>>>>>>> 9ed0c852389ccee75e3e891816522b398c366276

<<<<<<< HEAD
  public BingyangShape(){
    super();
    this.color = new java.awt.Color(100,100,100,100);
    this.borderColor = new java.awt.Color(100*(int)Math.random() + 50*(int)Math.random(), 100*(int)Math.random() + 50*(int)Math.random(), 100*(int)Math.random() + 50*(int)Math.random(), 100*(int)Math.random() + 50*(int)Math.random());
||||||| merged common ancestors
  public BingyangShape( double x, double y, int radius){
    super(x, y, radius);
    this.color = new Color(100,100,100,100);
    this.borderColor = new Color(100*Math.random() + 50*Math.random, 100*Math.random() + 50*Math.random, 100*Math.random() + 50*Math.random, 100*Math.random() + 50*Math.random);//generate random color for the border
=======
  public BingyangShape( double x, double y, int radius){
    super(x, y, radius);
    this.color = new Color(100,100,100,100);
    this.borderColor = new Color((int)(100*Math.random() + 50*Math.random()), (int)(100*Math.random() + 50*Math.random()), (int)(100*Math.random() + 50*Math.random()), (int)(100*Math.random() + 50*Math.random()));//generate random color for the border
>>>>>>> 9ed0c852389ccee75e3e891816522b398c366276
  }

  public void keepOnBoard(){
    if (this.x < this.radius) {
      // it went off the left edge! do something!
      this.vx = 0;
      this.x = this.radius;

    }else if (this.x > CircleShape.boardWidth-this.radius) {
      // it went off the right edge! do something!
      this.vx = 0;
      this.x = CircleShape.boardWidth-this.radius;
    }

    if (this.y < this.radius){
      // it went above the top edge!
      this.vy = 0;
      this.y = this.radius;

    } else if (this.y > CircleShape.boardHeight-this.radius) {
      // it went below the bottom edge!
      this.vy = 0;
      this.y = CircleShape.boardHeight-this.radius;
    }
    super.keepOnBoard();
  }


}
