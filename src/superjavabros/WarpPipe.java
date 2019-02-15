
package superjavabros;

import javax.swing.ImageIcon;

public class WarpPipe 
    {
    public int x;
    public int y;
    public int dx;
    public int dy;
    public int size;
    
    public boolean low_pipe = false;
    public boolean mid_pipe = false;
    public boolean big_pipe = false;
    
    public static ImageIcon little_warp_pipe  = new ImageIcon ("C:\\Users\\suns1\\OneDrive\\Desktop\\little_warp_pipe.png");
    public static ImageIcon mid_warp_pipe  = new ImageIcon ("C:\\Users\\suns1\\OneDrive\\Desktop\\mid_warp_pipe.png");
    public static ImageIcon big_warp_pipe  = new ImageIcon ("C:\\Users\\suns1\\OneDrive\\Desktop\\big_warp_pipe.png");
    
    public WarpPipe (int size)
        {
        this.size = size;
        }
    
    public void set_x (int x)
        {
        this.x = x;
        }
    
    public void set_y (int y)
        {
        this.y = y;
        
        if (y == 691)
            {
            low_pipe = true;
            mid_pipe = false;
            big_pipe = false;
            }
        else if (y == 618)
            {
            low_pipe = false;
            mid_pipe = true;
            big_pipe = false;
            }
        else if (y == 583)
            {
            low_pipe = false;
            mid_pipe = false;
            big_pipe = true;
            }
        
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
    
    public ImageIcon get_pipe_image (int size)
        {
        if (size == 0)
            return little_warp_pipe;
        else if (size == 1)
            return mid_warp_pipe;
        else if (size == 2)
            return big_warp_pipe;
        else
            return little_warp_pipe;
        }
    
    }
