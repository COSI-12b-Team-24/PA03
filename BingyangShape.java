package pa03;

public class BingyangShape extends CircleShape {
  public java.awt.Color borderColor;

  public BingyangShape(){
    super();
    this.color = new java.awt.Color(100,100,100,100);
    this.borderColor = new java.awt.Color(100*(int)Math.random() + 50*(int)Math.random(), 100*(int)Math.random() + 50*(int)Math.random(), 100*(int)Math.random() + 50*(int)Math.random(), 100*(int)Math.random() + 50*(int)Math.random());
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
