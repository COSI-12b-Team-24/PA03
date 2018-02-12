public class BingyangShape extends CircleShape {
  public double borderColor;

  public BingyangShape( double x, double y, int radius){
    super(x, y, radius);
    this.color = new Color(100,100,100,100);
    this.borderColor = new Color(100*Math.random() + 50*Math.random, 100*Math.random() + 50*Math.random, 100*Math.random() + 50*Math.random, 100*Math.random() + 50*Math.random);//generate random color for the border
  }

  public void keepOnBoard(){       //the new keepOnBoard method, the circles would stop once they hit the border of the panel
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
  }


}
