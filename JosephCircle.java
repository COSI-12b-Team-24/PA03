package pa03;
import java.util.ArrayList;
import java.awt.Color;


public class JosephCircle extends CircleShape{

  public static ArrayList<JosephCircle> JSbuffer;

  private static Color DEFAULT_COL= new Color(255,255,70,100);
  private static Color COLLIDE_COL= new Color(85,85,70/3,100);

  private double speed;

  /* New Constructor */

  public JosephCircle()
  {
    super();
    this.color = DEFAULT_COL; // transparent yellow

    if (JSbuffer == null)
      JSbuffer = new ArrayList<JosephCircle>();
    JSbuffer.add(this);

    double maxVel=10;
    vx = (int)(maxVel*2*Math.random()-maxVel);
    vy = (int)(maxVel*2*Math.random()-maxVel);
    speed= Math.sqrt(vx*vx+vy*vy);
  }

  /* override */
  public void update(double dt)
  {
    JosephCircle buffer; //the JosephCircle to compare with (see if this is colliding with)
    double dx, dy; //the distance, in x and y, between the center of the current circle, (this) and the circle comparing with
    double dist; //the distance between the two circles
    double a; //the angle from the comparing-circle to the current circle (this)
    double sign; //the sign (positive, negative, or zero) of the change in x (dx)
                 //in other words, if this circle is to the right (positive) or left (negative) of the circle colliding with

    for(int i=0; i<JSbuffer.size(); i++)
    {
      buffer = JSbuffer.get(i);
      if (buffer != null)
      {
        if (buffer != this)
        {
          dx = x-buffer.x;
          dy = y-buffer.y;
          dist = Math.sqrt(dx*dx + dy*dy);
          a = Math.atan(dy/dx);
          sign = Math.signum(dx);
          if (dist<radius+buffer.radius)
          {
            color = COLLIDE_COL;
            //recalculate velocity
            vx= sign*Math.cos(a)*speed;//*dist;
            vy= sign*Math.sin(a)*speed;//*dist;
            break;
          }
          else
            color = DEFAULT_COL;
        }
      }
    }

    super.update(dt);
  }




  public static void main (String[] args){
    JosephCircle x = new JosephCircle();
    System.out.println(x);
  }

  public String toString(){
    return "JosephCircle"+super.toString();
  }


}
