
package superjavabros;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.Timer;

public class Enemy 
    {
    public int x;
    public int y;
    public int dx;
    public int dy;

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
    
    public ImageIcon get_enemy_image ()
        {
        return null;
        }
    }
