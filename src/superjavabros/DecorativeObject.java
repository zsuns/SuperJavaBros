
package superjavabros;

import java.awt.Image;
import javax.swing.ImageIcon;

public class DecorativeObject 
    {
    public int x;
    public int y;
    public int dx;
    public int dy;
    
    public static ImageIcon big_hill       = new ImageIcon ("C:\\Users\\suns1\\OneDrive\\Desktop\\big_hill.png");
    public static ImageIcon little_hill    = new ImageIcon ("C:\\Users\\suns1\\OneDrive\\Desktop\\little_hill.png");
    public static ImageIcon big_bush       = new ImageIcon ("C:\\Users\\suns1\\OneDrive\\Desktop\\big_bush.png");
    public static ImageIcon mid_bush       = new ImageIcon ("C:\\Users\\suns1\\OneDrive\\Desktop\\mid_bush.png");
    public static ImageIcon little_bush    = new ImageIcon ("C:\\Users\\suns1\\OneDrive\\Desktop\\little_bush.png");
    public static ImageIcon big_cloud      = new ImageIcon ("C:\\Users\\suns1\\OneDrive\\Desktop\\big_cloud.png");
    public static ImageIcon mid_cloud      = new ImageIcon ("C:\\Users\\suns1\\OneDrive\\Desktop\\mid_cloud.png");
    public static ImageIcon little_cloud   = new ImageIcon ("C:\\Users\\suns1\\OneDrive\\Desktop\\little_cloud.png");
    public static ImageIcon castle         = new ImageIcon ("C:\\Users\\suns1\\OneDrive\\Desktop\\castle.png");
    public static ImageIcon flag_pole      = new ImageIcon ("C:\\Users\\suns1\\OneDrive\\Desktop\\flag_pole.png");
    public static ImageIcon flag_pole_flag = new ImageIcon ("C:\\Users\\suns1\\OneDrive\\Desktop\\flag_pole_flag.png");
    
    public void set_x (int x)
        {
        this.x = x;
        }
    public void set_y (int y)
        {
        this.y = y;
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
    
    public static Image get_decorative_image (int image)
        {
        if (image == 1)
            return big_hill.getImage ();
        else if (image == 2)
            return little_hill.getImage ();
        else if (image == 3)
            return big_bush.getImage ();
        else if (image == 4)
            return mid_bush.getImage ();
        else if (image == 5)
            return little_bush.getImage ();
        else if (image == 6)
            return big_cloud.getImage ();
        else if (image == 7)
            return mid_cloud.getImage ();
        else if (image == 8)
            return little_cloud.getImage ();
        else if (image == 9)
            return castle.getImage ();
        else if (image == 10)
            return flag_pole.getImage ();
        else if (image == 11)
            return flag_pole_flag.getImage ();
        else
            return null;
        }
    }
