
package superjavabros;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.Timer;

public class QuestionBlock extends Block
    {
    int count = 0;
    
    boolean first  = false;
    boolean second = false;
    boolean third  = false;
    
    ArrayList <ImageIcon> images = new ArrayList <> ();
    
    Timer animate;
    Timer reverse_animate;

    public QuestionBlock ()
        {
        images.add (question_block1);
        images.add (question_block2);
        images.add (question_block3);
        
    animate = new Timer (150, new ActionListener ()
        {        
        @Override
        public void actionPerformed (ActionEvent ae)
            {
            if (get_block_image ().toString ().equals (images.get (0).toString ()))
                {
                first  = false;
                second = true;
                third  = false;
                }
            else if (get_block_image ().toString ().equals (images.get (1).toString ()))
                {
                first  = false;
                second = false;
                third  = true;
                }
            else if (get_block_image ().toString ().equals (images.get (2).toString ()))
                {
                animate.stop ();
                reverse_animate.start ();
                }
            }
        });
        
    reverse_animate = new Timer (150, new ActionListener ()
        {        
        @Override
        public void actionPerformed (ActionEvent ae)
            {
            // if the current mario image is nuetral, mario begins running, anmation one
            if (get_block_image ().toString ().equals (images.get (2).toString ()))
                {
                first  = false;
                second = true;
                third  = false;
                }
            else if (get_block_image ().toString ().equals (images.get (1).toString ()))
                {
                first  = true;
                second = false;
                third  = false;
                }
            else if (get_block_image ().toString ().equals (images.get (0).toString ()))
                {
                animate.start ();
                reverse_animate.stop ();
                }
            }
        });

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
        reverse_animate.setInitialDelay (0);
        animate.setInitialDelay (300);
        animate.start ();
        }
    

    
    @Override
    public ImageIcon get_block_image ()
        {
        if (!block_hit)
            {
            if (first)
                return images.get (0);
            else if (second)
                return images.get (1);
            else if (third)
                return images.get (2);
            else
                return images.get (0);
            }
        else
            {
            if (animate.isRunning ())
                animate.stop ();
            if (reverse_animate.isRunning ())
                reverse_animate.stop ();
            
            return empty_block;
            }
        }
    }
