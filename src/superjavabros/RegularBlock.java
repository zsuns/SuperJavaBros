
package superjavabros;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.Timer;

public class RegularBlock extends Block
    {
    public boolean block_hit = false;
    
    public RegularBlock ()
        {
        block_hit_animate = new Timer (10, new ActionListener ()
            {        
            @Override
            public void actionPerformed (ActionEvent ae)
                {
                if (low_block)
                    {
                    if (get_y () > 555)
                        {
                        dy -= 1;
                        }
                    else if (get_y () <= 554)
                        {
                        reverse_block_hit_animate.start ();
                        block_hit_animate.stop ();
                        }
                    }
                else if (!low_block)
                    {
                    if (get_y () > 345)
                        {
                        dy -= 1;
                        }
                    else if (get_y () <= 344)
                        {
                        reverse_block_hit_animate.start ();
                        block_hit_animate.stop ();
                        }
                    }
                }
            });

        reverse_block_hit_animate = new Timer (10, new ActionListener ()
            {        
            @Override
            public void actionPerformed (ActionEvent ae)
                {
                if (low_block)
                    {
                    if (get_y () < 570)
                        {
                        dy += 1;
                        }
                    else if (get_y () > 570)
                        {
                        dy = 0;
                        y = 571;
                        reverse_block_hit_animate.stop ();
                        }
                    }
                else if (!low_block)
                    {
                    if (get_y () < 361)
                        {
                        dy += 1;
                        }
                    else if (get_y () > 361)
                        {
                        dy = 0;
                        y = 362;
                        reverse_block_hit_animate.stop ();
                        }
                    }
                }
            });
    
        block_hit_animate.setInitialDelay (0);
        reverse_block_hit_animate.setInitialDelay (0);
        }
    
    @Override
    public void set_block_hit (boolean block_hit)
        {
        if (!hit_count_limit_done)
            this.block_hit = false;
        else
            this.block_hit = true;
        }
    
    @Override
    public boolean get_block_hit ()
        {
        return this.block_hit;
        }
    @Override
    public ImageIcon get_block_image ()
        {
        if (!hit_count_limit_done)
            {
            return regular_block;
            }
        else
            {
            return empty_block;
            }
        }
    }
