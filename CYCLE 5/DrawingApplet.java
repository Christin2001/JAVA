import java.applet.Applet;
import java.awt.*;

public class DrawingApplet extends Applet {
    public void paint(Graphics g) {
       
        g.setColor(Color.red);
        g.fillOval(50, 50, 100, 100);

    
        g.setColor(Color.green);
        g.fillRect(200, 50, 150, 100);

      
        g.setColor(Color.blue);
        g.drawLine(400, 100, 500, 200);
    }
}
 /*<applet code="DrawingApplet.class" width="600" height="300"></applet>*/
