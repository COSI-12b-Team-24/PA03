package pa03;
import java.awt.Color;
import java.awt.Graphics;
/**
  StevenCircle is red Circles that will shrink unitl reaching to the radius of 10 
*/
public class StevenCircle extends CircleShape{
  private double vr = 2.0;
  public StevenCircle(){
    super();
    this.color = new java.awt.Color(255,0,0,100);
  }
  public void draw(Graphics g){
    super.draw(g); // Use the draw method from the CircleShape

  }
  public void update(double dt){
    this.radius -= dt*vr;//The radius will shrink over time
    if(this.radius < 15) this.radius = 10;// once the radius reaches a certain radius
                                          //It will make the radius equal to 10
    super.update(dt);
  }
  public static void main(String[] args){
    StevenCircle x = new StevenCircle();
    System.out.println("my circle is "+ x);
  }

  public String toString(){
    return "StevenCircle: "+ super.toString();
  }
}
