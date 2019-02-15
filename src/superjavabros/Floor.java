
package superjavabros;

import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class Floor 
    {
    public int x;
    public int y;
    public int dx;
    public int dy;
    
    public static ImageIcon floor1 = new ImageIcon ("C:\\Users\\suns1\\OneDrive\\Desktop\\floor1.png");
    public static ImageIcon floor2 = new ImageIcon ("C:\\Users\\suns1\\OneDrive\\Desktop\\floor2.png");
    public static ImageIcon floor3 = new ImageIcon ("C:\\Users\\suns1\\OneDrive\\Desktop\\floor3.png");
    public static ImageIcon floor4 = new ImageIcon ("C:\\Users\\suns1\\OneDrive\\Desktop\\floor4.png");
//    public ImageIcon base_floor = new ImageIcon ("/Users/zach/Desktop/floor1.png");
    
    public Floor ()
        {
        y = 765;
        }
    
    public void set_x (int x)
        {
        this.x = x;
        }
    
    public int get_x ()
        {
        return x;
        }
    
    public int get_y ()
        {
        return y;
        }
    
    public void move ()
        {
        x = x + dx;
        y = y + dy;
        }
    
    public static Image get_floor_image (int partition)
        {
        if (partition == 1)
            return floor1.getImage ();
        else if (partition == 2)
            return floor2.getImage ();
        else if (partition == 3)
            return floor3.getImage ();
        else if (partition == 4)
            return floor4.getImage ();
        else
            return null;
        }

    }
