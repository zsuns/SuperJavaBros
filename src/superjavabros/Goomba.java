
package superjavabros;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.Timer;

public class Goomba extends Enemy
    {
    public static ImageIcon goomba_left_foot  = new ImageIcon ("C:\\Users\\suns1\\OneDrive\\Desktop\\goomba_left_foot.png");
    public static ImageIcon goomba_right_foot = new ImageIcon ("C:\\Users\\suns1\\OneDrive\\Desktop\\goomba_right_foot.png");
    public static ImageIcon goomba_squished   = new ImageIcon ("C:\\Users\\suns1\\OneDrive\\Desktop\\goomba_squished.png");
    public static ImageIcon null_goomba       = new ImageIcon ("C:\\Users\\suns1\\OneDrive\\Desktop\\null_mario.png");
    public static ImageIcon goomba_flipped    = new ImageIcon ("C:\\Users\\suns1\\OneDrive\\Desktop\\goomba_flipped.png");
    
    public boolean left   = true;
    public boolean right  = false;
    public boolean pause = false;
    public boolean flipped = false;
    
    public boolean hit_from_below = false;
    
    public boolean squish = false;
    public boolean squish_done = false;
    
    public boolean did_kill = false;
    
    public int dead_y = 0;

    public boolean moving_left = true;
    
    public boolean started = false;
    
    ArrayList <ImageIcon> images = new ArrayList <> ();
    
    Timer dissapear = new Timer (700, new ActionListener ()
        {        
        @Override
        public void actionPerformed (ActionEvent ae)
            {
            squish_done = true;
            y = -100;
            dissapear.stop ();
            }
        });
    
    Timer walk = new Timer (120, new ActionListener ()
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
            
            if (flipped)
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
            }
        });
    Timer goomba_dying_animate = new Timer (10, new ActionListener ()
        {        
        @Override
        public void actionPerformed (ActionEvent ae)
            {
            hit_from_below = true;
            if (get_y () < dead_y + 20 && get_y () > dead_y - 80)
                {
                dy = -7;
                }
            else if (get_y () < dead_y - 81 && get_y () > dead_y - 115)
                {
                dy = -5;
                }
            else if (get_y () < dead_y - 116 && get_y () > dead_y - 130)
                {
                dy = -3;
                }
            else if (get_y () < dead_y - 131 && get_y () > dead_y - 137)
                {
                dy = -2;
                }
            else if (get_y () <= dead_y - 138)
                {
                goomba_dying_animate.stop ();
                goomba_dying_reverse_animate.start ();
                }
            }
        });
    Timer goomba_dying_reverse_animate = new Timer (10, new ActionListener ()
        {        
        @Override
        public void actionPerformed (ActionEvent ae)
            {
            if (get_y () >= dead_y - 170 && get_y () < dead_y - 138)
                {
                dy = 2;
                }
            else if (get_y () > dead_y - 137 && get_y () < dead_y - 131)
                {
                dy = 4;
                }
            else if (get_y () > dead_y - 130 && get_y () < dead_y - 116)
                {
                dy = 5;
                }
            else if (get_y () > dead_y - 115 && get_y () < dead_y - 81)
                {
                dy = 7;
                }
            }
        });    
    public Goomba ()
        {
        images.add (goomba_left_foot);
        images.add (goomba_right_foot);
        images.add (goomba_squished);
        images.add (null_goomba);
        images.add (goomba_flipped);
        }
    
    @Override
    public ImageIcon get_enemy_image ()
        {
        if (left)
            return images.get (0);
        else if (right)
            return images.get (1);
        else if (squish_done && squish && pause)
            return images.get (1);
        else if (squish && !squish_done)
            return images.get (2);
        else if (squish_done && squish)
            return images.get (3);
        else if (flipped)
            return images.get (4);
        else
            return images.get (0);
        }
    }
