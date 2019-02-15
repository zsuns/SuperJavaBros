
package superjavabros;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.Timer;

public class Koopa extends Enemy
    {
    public static ImageIcon koopa1 = new ImageIcon ("C:\\Users\\suns1\\OneDrive\\Desktop\\koopa1.png");
    public static ImageIcon koopa2 = new ImageIcon ("C:\\Users\\suns1\\OneDrive\\Desktop\\koopa2.png");
    public static ImageIcon koopa1_flipped = new ImageIcon ("C:\\Users\\suns1\\OneDrive\\Desktop\\koopa1_flipped.png");
    public static ImageIcon koopa2_flipped = new ImageIcon ("C:\\Users\\suns1\\OneDrive\\Desktop\\koopa2_flipped.png");
    public static ImageIcon koopa_squished = new ImageIcon ("C:\\Users\\suns1\\OneDrive\\Desktop\\koopa_squished.png");
    
    public boolean left  = true;
    public boolean right = false;
    public boolean pause = false;
    public boolean flipped = false;
    
    public boolean squish = false;
    public boolean squish_done = false;
    
    public int dead_y = 0;
    
    public boolean did_kill = false;

    public boolean moving_left = true;
    
    public boolean started = false;
    
    ArrayList <ImageIcon> images = new ArrayList <> ();
    
    Timer walk = new Timer (150, new ActionListener ()
        {        
        @Override
        public void actionPerformed (ActionEvent ae)
            {
            started = true;
            
            if (Mario.dead_y != 0 && did_kill)
                {
                dx = 0;
                left = false;
                right = false;
                squish = true;
                squish_done = true;
                pause = true;
                walk.stop ();
                }
            
            if (moving_left)
                dx = -2;
            else
                dx = 2;
            
            if (squish)
                {
                left = false;
                right = false;
                dx = 0;
                walk.stop ();
                }
            
            
            if (get_enemy_image ().toString ().equals (images.get (0).toString ()))
                {
                left = false;
                right = true;
                }
            else if (get_enemy_image ().toString ().equals (images.get (1).toString ()))
                {
                left = true;
                right = false;
                }
            
            else if (get_enemy_image ().toString ().equals (images.get (2).toString ()))
                {
                left = false;
                right = true;
                }
            else if (get_enemy_image ().toString ().equals (images.get (3).toString ()))
                {
                left = true;
                right = false;
                }
            }
        });
    
    public Koopa ()
        {
        images.add (koopa1);
        images.add (koopa2);
        images.add (koopa1_flipped);
        images.add (koopa2_flipped);
        images.add (koopa_squished);
        }
    
    @Override
    public ImageIcon get_enemy_image ()
        {
        if (flipped)
            {
            if (left)
                return images.get (2);
            else if (right)
                return images.get (3);
            else if (squish_done && squish && pause)
                return images.get (1);
            else if (squish)
                return images.get (4);
            else
                return images.get (0);
            }
        else
            {
            if (left)
                return images.get (0);
            else if (right)
                return images.get (1);
            else if (squish_done && squish && pause)
                return images.get (1);
            else if (squish)
                return images.get (4);
            else
                return images.get (0);
            }
        }
    }
