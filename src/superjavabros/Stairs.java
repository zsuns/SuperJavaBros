
package superjavabros;

import javax.swing.ImageIcon;

public class Stairs 
    {
    public int x;
    public int y;
    public int dx;
    public int dy;
    
    public int type;
    
    public static ImageIcon steps_4321_left   = new ImageIcon ("C:\\Users\\suns1\\OneDrive\\Desktop\\steps_4321_left.png");
    public static ImageIcon steps_4321_right  = new ImageIcon ("C:\\Users\\suns1\\OneDrive\\Desktop\\steps_4321_right.png");
    public static ImageIcon steps_44321       = new ImageIcon ("C:\\Users\\suns1\\OneDrive\\Desktop\\steps_44321.png");
    public static ImageIcon end_level_steps   = new ImageIcon ("C:\\Users\\suns1\\OneDrive\\Desktop\\end_level_steps.png");
    
    public Stairs (int type)
        {
        this.type = type;
        }
    
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
    
    public ImageIcon get_stairs_image (int type)
        {
        if (type == 0)
            return steps_4321_left;
        else if (type == 1)
            return steps_4321_right;
        else if (type == 2)
            return steps_44321;
        else if (type == 3)
            return end_level_steps;
        else
            return end_level_steps;
        }
    }
