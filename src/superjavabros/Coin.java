
package superjavabros;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.Timer;

public class Coin 
    {
    public int x;
    public int y;
    public int dx;
    public int dy;
    
    boolean coin1 = false;
    boolean coin2 = false;
    boolean coin3 = false;
    boolean coin4 = true;
    
    public boolean low_coin = false;
    
    public ArrayList <ImageIcon> images = new ArrayList <> ();
    
    public static ImageIcon coin_1 = new ImageIcon ("C:\\Users\\suns1\\OneDrive\\Desktop\\coin_1.png");
    public static ImageIcon coin_2 = new ImageIcon ("C:\\Users\\suns1\\OneDrive\\Desktop\\coin_2.png");
    public static ImageIcon coin_3 = new ImageIcon ("C:\\Users\\suns1\\OneDrive\\Desktop\\coin_3.png");
    public static ImageIcon coin_4 = new ImageIcon ("C:\\Users\\suns1\\OneDrive\\Desktop\\coin_4.png");
    
    Timer coin_animate = new Timer (77, new ActionListener ()
        {        
        @Override
        public void actionPerformed (ActionEvent ae)
            {
            if (get_coin_image ().toString ().equals (images.get (0).toString ()))
                {
                coin1 = false;
                coin2 = true;
                coin3 = false;
                coin4 = false;
                }
            else if (get_coin_image ().toString ().equals (images.get (1).toString ()))
                {
                coin1 = false;
                coin2 = false;
                coin3 = true;
                coin4 = false;
                }
            else if (get_coin_image ().toString ().equals (images.get (2).toString ()))
                {
                coin1 = false;
                coin2 = false;
                coin3 = false;
                coin4 = true;
                }
            else if (get_coin_image ().toString ().equals (images.get (3).toString ()))
                {
                coin1 = true;
                coin2 = false;
                coin3 = false;
                coin4 = false;
                }
            }
        });
    Timer coin_move_animate = new Timer (10, new ActionListener ()
        {        
        @Override
        public void actionPerformed (ActionEvent ae)
            {
            if (low_coin)
                {
                if (get_y () < 520 && get_y () > 480)
                    {
                    dy = -8;
                    }
                else if (get_y () < 459 && get_y () > 440)
                    {
                    dy = -6;
                    }
                else if (get_y () < 439 && get_y () > 425)
                    {
                    dy = -4;
                    }
                else if (get_y () < 424 && get_y () > 418)
                    {
                    dy = -2;
                    }
                else if (get_y () <= 417)
                    {
                    coin_move_animate.stop ();
                    coin_move_reverse_animate.start ();
                    }
                }
            else
                {
                if (get_y () < 311 && get_y () > 271)
                    {
                    dy = -8;
                    }
                else if (get_y () < 250 && get_y () > 231)
                    {
                    dy = -6;
                    }
                else if (get_y () < 230 && get_y () > 216)
                    {
                    dy = -4;
                    }
                else if (get_y () < 215 && get_y () > 209)
                    {
                    dy = -2;
                    }
                else if (get_y () <= 208)
                    {
                    coin_move_animate.stop ();
                    coin_move_reverse_animate.start ();
                    }
                }
            }
        });
    Timer coin_move_reverse_animate = new Timer (10, new ActionListener ()
        {        
        @Override
        public void actionPerformed (ActionEvent ae)
            {
            if (low_coin)
                {
                if (get_y () >= 410 && get_y () < 422)
                    {
                    dy = 2;
                    }
                else if (get_y () > 423 && get_y () < 431)
                    {
                    dy = 4;
                    }
                else if (get_y () > 432 && get_y () < 457)
                    {
                    dy = 6;
                    }
                else if (get_y () > 458 && get_y () < 525)
                    {
                    dy = 8;
                    }
                else if (get_y () > 526)
                    {
                    dy = 0;
                    y = 527;
                    coin_move_reverse_animate.stop ();
                    }
                }
            else
                {
                if (get_y () >= 201 && get_y () < 213)
                    {
                    dy = 2;
                    }
                else if (get_y () > 214 && get_y () < 222)
                    {
                    dy = 4;
                    }
                else if (get_y () > 223 && get_y () < 248)
                    {
                    dy = 6;
                    }
                else if (get_y () > 249 && get_y () < 316)
                    {
                    dy = 8;
                    }
                else if (get_y () > 317)
                    {
                    dy = 0;
                    y = 318;
                    coin_move_reverse_animate.stop ();
                    }
                }

            }
        });
    
    public Coin ()
        {
        images.add (coin_1);
        images.add (coin_2);
        images.add (coin_3);
        images.add (coin_4);
        }
    
    public void set_x (int x)
        {
        this.x = x;
        }
    public void set_y (int y)
        {
        this.y = y;
        
        if (y == 511)
            low_coin = true;
        else
            low_coin = false;
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
    
    public ImageIcon get_coin_image ()
        {
        if (coin1)
            return images.get (0);
        else if (coin2)
            return images.get (1);
        else if (coin3)
            return images.get (2);
        else if (coin4)
            return images.get (3);
        else
            return null;
        }
    }
