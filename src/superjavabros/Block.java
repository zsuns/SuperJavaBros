
package superjavabros;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.Timer;

public class Block 
    {
    public int x;
    public int y;
    public int dx;
    public int dy;
    
    public int hit_count = 0;
    
    boolean contains_coin = false;
    boolean multiple_coins = false;
    
    public Coin coin;
    
    public ArrayList <Coin> coins;
    
    boolean low_block = false;
    
    public boolean block_hit = false;
    public boolean hit_finished = false;
    public boolean hit_count_limit_done = false;
    
    public static ImageIcon question_block1  = new ImageIcon ("C:\\Users\\suns1\\OneDrive\\Desktop\\question_block1.png");
    public static ImageIcon question_block2  = new ImageIcon ("C:\\Users\\suns1\\OneDrive\\Desktop\\question_block2.png");
    public static ImageIcon question_block3  = new ImageIcon ("C:\\Users\\suns1\\OneDrive\\Desktop\\question_block3.png");
    public static ImageIcon empty_block      = new ImageIcon ("C:\\Users\\suns1\\OneDrive\\Desktop\\empty_block.png");
    public static ImageIcon regular_block    = new ImageIcon ("C:\\Users\\suns1\\OneDrive\\Desktop\\regular_block.png");
    
    Timer block_hit_animate;
    Timer reverse_block_hit_animate;
    
    public Timer hit_count_limit = new Timer (6000, new ActionListener ()
        {        
        @Override
        public void actionPerformed (ActionEvent ae)
            {
            hit_count_limit_done = true;
            hit_count_limit.stop ();
            }
        });
    
    public void set_x (int x)
        {
        this.x = x;
        }
    public void set_y (int y)
        {
        this.y = y;
        
        if (y == 571)
            low_block = true;
        else
            low_block = false;
        }
    
    public int get_x ()
        {
        return x;
        }
    
    public int get_y ()
        {
        return y;
        }
    
    public void set_hit_finished (boolean hit_finished)
        {
        this.hit_finished = hit_finished;
        }
    
    public void set_multiple_coins (boolean multiple_coins)
        {
        this.multiple_coins = multiple_coins;
        }
    
    public boolean get_multiple_coins ()
        {
        return multiple_coins;
        }
    
    public boolean get_hit_finished ()
        {
        return hit_finished;
        }
    
    public void move ()
        {
        x = x + dx;
        y = y + dy;
        }
    
    public Coin get_coin ()
        {
        return coin;
        }
    
    public void set_has_coin (boolean contains_coin)
        {
        this.contains_coin = contains_coin;
        
        if (contains_coin && !multiple_coins)
            coin = new Coin ();
        else if (multiple_coins)
            {
            coins = new ArrayList <> ();
            for (int i = 0 ; i < 100 ; i++)
                coins.add (new Coin ());
            }
        }
    
    public boolean get_has_coin ()
        {
        return contains_coin;
        }
    
    public void set_block_hit (boolean block_hit)
        {
        this.block_hit = block_hit;
        }
    
    public boolean get_block_hit ()
        {
        return block_hit;
        }
    
    public ImageIcon get_block_image ()
        {
        return regular_block;
        }
    }
