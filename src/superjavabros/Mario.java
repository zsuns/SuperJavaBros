
package superjavabros;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.Timer;

public class Mario 
    {
    public static int x;
    public int y;
    public static int dx;
    public int dy;
    public int jump_takeoff;
    public int jump_height_limit = 169;
    public static int jump_speed = 8;
    public static int speed = 3;
    public static int speed_boost = 5;
    public static int floor_border = 667;
    int jump_raise_count = 0;
    int floating_count = 0;
    
    boolean accel        = false;
    boolean flipped_left = false;
    boolean right_press  = false;
    boolean right_jump   = false;
    boolean left_jump    = false;
    boolean left_press   = false;
    boolean z_press      = false;
    boolean space_press  = false;
    boolean boost_jump   = false;
    boolean straight_jump = false;
    boolean jump_speed_boost = false;
    boolean skidding = false;
    boolean slowing_down_right = false;
    boolean slowing_down_left  = false;
    
    boolean neutral  = false;
    boolean jumping  = false;
    boolean running1 = false;
    boolean running2 = false;
    public static boolean pole_slide = false;
    public static boolean pole_slide_left = false;
    public static boolean pole_slide_finished = false;
    boolean nullify = false;
    boolean is_dead = false;
    
    public ArrayList <ImageIcon> images = new ArrayList <> ();
    public static int dead_y;
    
    public ImageIcon neutral_mario  = new ImageIcon ("C:\\Users\\suns1\\OneDrive\\Desktop\\neutral_mario.png");
    public ImageIcon mario_jumping  = new ImageIcon ("C:\\Users\\suns1\\OneDrive\\Desktop\\mario_jumping.png");
    public ImageIcon mario_running1 = new ImageIcon ("C:\\Users\\suns1\\OneDrive\\Desktop\\mario_running1.png");
    public ImageIcon mario_running2 = new ImageIcon ("C:\\Users\\suns1\\OneDrive\\Desktop\\mario_running2.png");
    public ImageIcon mario_skidding = new ImageIcon ("C:\\Users\\suns1\\OneDrive\\Desktop\\mario_skidding.png");
    
    public ImageIcon neutral_mario_left  = new ImageIcon ("C:\\Users\\suns1\\OneDrive\\Desktop\\neutral_mario_left.png");
    public ImageIcon mario_jumping_left  = new ImageIcon ("C:\\Users\\suns1\\OneDrive\\Desktop\\mario_jumping_left.png");
    public ImageIcon mario_running1_left = new ImageIcon ("C:\\Users\\suns1\\OneDrive\\Desktop\\mario_running1_left.png");
    public ImageIcon mario_running2_left = new ImageIcon ("C:\\Users\\suns1\\OneDrive\\Desktop\\mario_running2_left.png");
    public ImageIcon mario_skidding_left = new ImageIcon ("C:\\Users\\suns1\\OneDrive\\Desktop\\mario_skidding_left.png");
    
    public ImageIcon mario_sliding_pole = new ImageIcon ("C:\\Users\\suns1\\OneDrive\\Desktop\\mario_sliding_pole.png");
    public ImageIcon mario_sliding_pole_left = new ImageIcon ("C:\\Users\\suns1\\OneDrive\\Desktop\\mario_sliding_pole_left.png");
    public ImageIcon null_mario     = new ImageIcon ("C:\\Users\\suns1\\OneDrive\\Desktop\\null_mario.png");
    public ImageIcon dead_mario     = new ImageIcon ("C:\\Users\\suns1\\OneDrive\\Desktop\\dead_mario.png");
    
    Timer run = new Timer (50, new ActionListener ()
        {        
        @Override
        public void actionPerformed (ActionEvent ae)
            {
            if (is_dead)
                {
                neutral = false;
                running1 = false;
                running2 = false;
                run.stop ();
                }
            // if the current mario image is nuetral, mario begins running, anmation one
            if (get_mario_image ().toString ().equals (images.get (0).toString ()) || get_mario_image ().toString ().equals (images.get (4).toString ()))
                {
                neutral = false;
                running1 = true;
                running2 = false;
                }
            // if the current mario image is nuetral, mario keeps running, anmation two
            else if (get_mario_image ().toString ().equals (images.get (1).toString ()) || get_mario_image ().toString ().equals (images.get (5).toString ()))
                {
                neutral = false;
                running1 = false;
                running2 = true;
                }
            // if the current mario image is nuetral, mario stands still
            else if (get_mario_image ().toString ().equals (images.get (2).toString ()) || get_mario_image ().toString ().equals (images.get (6).toString ()))
                {
                neutral = true;
                running1 = false;
                running2 = false;
                }
            }
        });
    
    Timer run_slowdown = new Timer (70, new ActionListener ()
        {
        @Override
        public void actionPerformed (ActionEvent ae)
            {
            if (dx != 0)
                {
                // if the current mario image is nuetral, mario begins running, anmation one
                if (get_mario_image ().toString ().equals (images.get (0).toString ()) || get_mario_image ().toString ().equals (images.get (4).toString ()))
                    {
                    neutral = false;
                    running1 = true;
                    running2 = false;
                    }
                // if the current mario image is nuetral, mario keeps running, anmation two
                else if (get_mario_image ().toString ().equals (images.get (1).toString ()) || get_mario_image ().toString ().equals (images.get (5).toString ()))
                    {
                    neutral = false;
                    running1 = false;
                    running2 = true;
                    }
                // if the current mario image is nuetral, mario stands still
                else if (get_mario_image ().toString ().equals (images.get (2).toString ()) || get_mario_image ().toString ().equals (images.get (6).toString ()))
                    {
                    neutral = true;
                    running1 = false;
                    running2 = false;
                    }
                // slow mario down in opposite direction he was running
                if (!flipped_left)
                    {
                    dx -= 1;
                    }
                else if (flipped_left)
                    {
                    dx += 1;
                    }
                }
            else if (dx == 0)
                {
                // return neutral to true to return marios image to regaulr
                neutral = true;
                run_slowdown.stop ();
                }
            }});
    
    Timer skid = new Timer (70, new ActionListener ()
        {
        @Override
        public void actionPerformed (ActionEvent ae)
            {
            if (dx != 0)
                {
                neutral  = false;
                running1 = false;
                running2 = false;
                skidding = true;
                // slow mario down in opposite direction he was running
                if (!flipped_left)
                    {
                    dx += 1;
                    }
                else if (flipped_left)
                    {
                    dx -= 1;
                    }
                }
            else if (dx == 0)
                {
                // return neutral to true to return marios image to regaulr
                neutral = true;
                skidding = false;
                skid.stop ();
                }
            }});

    Timer smoothing_jump = new Timer (1, new ActionListener ()
        {
        @Override
        public void actionPerformed (ActionEvent ae)
            {
            if (accel)
                {
                if (jump_raise_count >= 0 && jump_raise_count <= 2)
                    dy = -jump_speed + 1;
                if (jump_raise_count >= 2 && jump_raise_count <= 4)
                    dy = -jump_speed + 2;
                if (jump_raise_count >= 4 && jump_raise_count <= 6)
                    dy = -jump_speed + 4;
                if (jump_raise_count >= 6 && jump_raise_count <= 8)
                    dy = -jump_speed + 5;
                if (jump_raise_count >= 8 && jump_raise_count <= 10)
                    dy = -jump_speed + 6;
                if (jump_raise_count >= 10 && jump_raise_count <= 11)
                    dy = -jump_speed + 7;
                if (jump_raise_count == 12)
                    dy = 0;
                
                jump_raise_count ++;
                }
            else
                {
                jump_raise_count = 0;
                smoothing_jump.stop ();
                }
            }});
    
    Timer floating = new Timer (50, new ActionListener ()
        {
        @Override
        public void actionPerformed (ActionEvent ae)
            {
            // the dx comparison at the end prevents mario from floating at a rate faster than his
            if (floating_count <= 7 && (dx >= -5 && dx <= 5))
                {
                // if straight jump, ability to float left and right should only be half that of normal
                if (straight_jump)
                    {
                    if (floating_count % 2 == 0)
                        {
                        if (left_press)
                            {
                            dx -= 1;
                            }
                        else if (right_press)
                            {
                            dx += 1;
                            }
                        else if (right_press && left_press)
                            {
                            dx = dx;
                            }
                        else
                            {
                            dx = dx;
                            }
                        }
                    }
                else
                    {
                    if (left_jump && right_press)
                        {
                        dx += 1;
                        }
                    else if (right_jump && left_press)
                        {
                        dx -= 1;
                        }
                    else if (left_press)
                        {
                        dx -= 1;
                        }
                    else if (right_press)
                        {
                        dx += 1;
                        }
                    else if (right_press && left_press)
                        {
                        dx = dx;
                        }
                    else
                        {
                        dx = dx;
                        }
                    }
                
                floating_count ++;
                }
            else
                {
                floating_count = 0;
                floating.stop ();
                }
            }});
    
    Timer reverse_smoothing_jump = new Timer (1, new ActionListener ()
        {
        @Override
        public void actionPerformed (ActionEvent ae)
            {
            if (jump_raise_count >= 0 && jump_raise_count <= 3)
                dy = 0;
            if (jump_raise_count >= 3 && jump_raise_count <= 5)
                dy = jump_speed - 7;
            if (jump_raise_count >= 5 && jump_raise_count <= 8)
                dy = jump_speed - 7;
            if (jump_raise_count >= 8 && jump_raise_count <= 10)
                dy = jump_speed - 6;
            if (jump_raise_count >= 10 && jump_raise_count <= 12)
                dy = jump_speed - 5;
            if (jump_raise_count >= 10 && jump_raise_count <= 12)
                dy = jump_speed - 3;
            if (jump_raise_count >= 12 && jump_raise_count <= 14)
                dy = jump_speed - 1;
            jump_raise_count ++;
            }});
        
    int peak = 0;
    Timer jump = new Timer (1, new ActionListener ()
        {
        @Override
        public void actionPerformed (ActionEvent ae)
            {
            // if mario is still accellerating while max height is reached (pressing space bar, keep moving him up
            if (get_y () >= jump_takeoff - jump_height_limit && space_press && accel)
                {
                if (((right_jump && left_press) || (left_jump && right_press) || (straight_jump && (left_press || right_press))) && !floating.isRunning ())
                    floating.start ();
                
                dy = -jump_speed;
                }
            // this reaches if max accel reached or just stopped pressing space before max accel
            else if ((get_y () <= (jump_takeoff - jump_height_limit) - 1 && accel) || (!space_press && accel))
                {
                dy = 0;
                
                if (!smoothing_jump.isRunning ())
                    {
                    smoothing_jump.start ();
                    }
                    
                //once mario y is peaked, turn accelerating to false, so first condition isnt met, and breaks out of that loop
                if (jump_raise_count == 12)
                    {
                    if (((right_jump && left_press) || (left_jump && right_press) || (straight_jump && (left_press || right_press))) && !floating.isRunning ())
                        floating.start ();
                    
                    peak = get_y ();
                    accel = false;
                    }
                }
            // else statement to start descend. its same functionality for full and mid jump, but one condition will be met for either one.
            // descend is true only from the midjump, but !descend and !accel is only true for the full jump.
            else if (!accel && !smoothing_jump.isRunning ())
                {
                if (((right_jump && left_press) || (left_jump && right_press) || (straight_jump && (left_press || right_press))) && !floating.isRunning ())
                        floating.start ();
                
                if (!reverse_smoothing_jump.isRunning ())
                    {
                    reverse_smoothing_jump.start ();
                    }
                
                //45 is how high the jump smoothing takes mario, so if his position is within that peak and not accelerating, start reverse smoothing
                if (get_y () >= peak + 45)
                    {
                    reverse_smoothing_jump.stop ();
                    dy = jump_speed;
                    jump_raise_count = 0;
                    }
                // if mario hits the floor
                if (get_y () >= floor_border)
                    {
                    floating.stop ();
                    dy = 0;
                    
                    //stops mario from moving once he hits the floor, unless he is still rpessing a left/right arrow, then will keep him moving
                    if (!left_press && !right_press)
                        dx = 0;
                    else if (left_press && z_press)
                        dx = -speed_boost;
                    else if (right_press && z_press)
                        dx = speed_boost;
                    else if (right_press && !z_press)
                        dx = speed;
                    else if (left_press && !z_press)
                        dx = -speed;
                    
                    
                    if (right_press && !left_press)
                        flipped_left = false;
                    else if (!right_press && left_press)
                        flipped_left = true;
                    else if (right_press && left_press)
                        flipped_left = flipped_left;
                    
                    // returns all jump booleans to false
                    jumping          = false;
                    boost_jump       = false;
                    straight_jump    = false;
                    jump_speed_boost = false;
                    right_jump       = false;
                    left_jump        = false;
                    skidding         = false;
                    
                    jump.stop ();
                    }
                }
            }
        });

    Timer back_to_ground = new Timer (1, new ActionListener ()
        {
        @Override
        public void actionPerformed (ActionEvent ae)
            {
            if (get_y () < floor_border)
                {
                dy += 1;
                }
            else if (get_y () >= floor_border)
                {
                dy = 0;
                y = floor_border;
                back_to_ground.stop ();
                }
            }
        });
    
    Timer sliding_down = new Timer (1, new ActionListener ()
        {
        @Override
        public void actionPerformed (ActionEvent ae)
            {
            if (get_y () < MainPanel.mario_resting_stair1)
                {
                dy = 5;
                }
            else if (get_y () >= MainPanel.mario_resting_stair1)
                {
                dy = 0;
                y = MainPanel.mario_resting_stair1;
                pole_slide = false;
                pole_slide_left = true;
                sliding_down.stop ();
                }
            }
        });
    Timer pole_slide_walk_away = new Timer (1, new ActionListener ()
        {
        @Override
        public void actionPerformed (ActionEvent ae)
            {
            pole_slide_left = false;
            run.start ();
            dx = 3;
            
            if (!back_to_ground.isRunning ())
                back_to_ground.start ();
            
            if (x >= 825)
                {
                dx = 0;
                run.stop ();
                pole_slide_cleanup ();
                pole_slide = false;
                pole_slide_left = false;
                pole_slide_finished = false;
                nullify = true;
                pole_slide_walk_away.stop ();
                }
            }
        });
    
    Timer mario_dying_animate = new Timer (10, new ActionListener ()
        {        
        @Override
        public void actionPerformed (ActionEvent ae)
            {
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
                mario_dying_animate.stop ();
                mario_dying_reverse_animate.start ();
                }
            }
        });
    Timer mario_dying_reverse_animate = new Timer (10, new ActionListener ()
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
    
    public void end_jump (boolean ground)
        {
        jump.stop ();
        reverse_smoothing_jump.stop ();
        smoothing_jump.stop ();
        floating.stop ();
        
        if (ground)
            dy = 1;
        else
            {
            dy = 0;
            }
        
        jump_raise_count = 0;
        accel = false;

        //stops mario from moving once he hits the floor, unless he is still rpessing a left/right arrow, then will keep him moving
        if (!left_press && !right_press)
            dx = 0;
        else if (left_press && z_press)
            dx = -speed_boost;
        else if (right_press && z_press)
            dx = speed_boost;
        else if (right_press && !z_press)
            dx = speed;
        else if (left_press && !z_press)
            dx = -speed;



        if (right_press && !left_press)
            flipped_left = false;
        else if (!right_press && left_press)
            flipped_left = true;
        else if (right_press && left_press)
            flipped_left = flipped_left;

        // returns all jump booleans to false
        jumping          = false;
        boost_jump       = false;
        straight_jump    = false;
        jump_speed_boost = false;
        right_jump       = false;
        left_jump        = false;
        skidding         = false;
        
        if (ground)
            neutral = true;
        
        if (!back_to_ground.isRunning () && ground)
            back_to_ground.start ();
        }
    
    public void pole_slide_cleanup ()
        {
        run.stop ();
        run_slowdown.stop ();
        skid.stop ();
        back_to_ground.stop ();
        
        accel        = false;
        flipped_left = false;
        right_press  = false;
        right_jump   = false;
        left_jump    = false;
        left_press   = false;
        z_press      = false;
        space_press  = false;
        boost_jump   = false;
        straight_jump = false;
        jump_speed_boost = false;
        skidding = false;
        slowing_down_right = false;
        slowing_down_left  = false;

        neutral  = false;
        jumping  = false;
        running1 = false;
        running2 = false;
        
        dx = 0;
        dy = 0;
        
        pole_slide = true;
        }
    
    public Mario ()
        {
        x = 10;
        y = floor_border;
        
        images.add (neutral_mario);
        images.add (mario_running1);
        images.add (mario_running2);
        images.add (mario_jumping);
        images.add (neutral_mario_left);
        images.add (mario_running1_left);
        images.add (mario_running2_left);
        images.add (mario_jumping_left);
        images.add (mario_skidding);
        images.add (mario_skidding_left);
        }
    
    public void move ()
        {
        x = x + dx;
        y = y + dy;
        }
    public void move_x ()
        {
        x = x + dx;
        }
    
    public int get_x ()
        {
        return x;
        }
    
    public int get_y ()
        {
        return y;
        }
    
    public boolean get_right_press ()
        {
        return right_press;
        }
    
    public boolean get_left_press ()
        {
        return left_press;
        }
    
    public boolean get_z_press ()
        {
        return z_press;
        }
    
    public boolean get_boost_jump ()
        {
        return boost_jump;
        }
    
    public boolean get_straight_jump ()
        {
        return straight_jump;
        }
    
    public int get_dx ()
        {
        return dx;
        }
    
    public ImageIcon get_mario_image ()
        {
        if (is_dead)
            return dead_mario;
        else
            {
            // returns an image based on which boolean is true, iterates through like flipbook
            if (flipped_left)
                {
                if (jump.isRunning ())
                    {
                    return (images.get (7));
                    }
                else
                    {
                    if (neutral)
                        {
                        return images.get (4);
                        }
                    else if (running1)
                        {
                        return images.get (5);
                        }
                    else if (running2)
                        {
                        return images.get (6);
                        }
                    else if (jumping)
                        {
                        return images.get (7);
                        }
                    else if (skidding)
                        {
                        return images.get (9);
                        }
                    else if (pole_slide)
                        {
                        return mario_sliding_pole;
                        }
                    else if (pole_slide_left)
                        {
                        return mario_sliding_pole_left;
                        }
                    else if (pole_slide_finished)
                        {
                        return neutral_mario;
                        }
                    else if (nullify)
                        {
                        return null_mario;
                        }
                    else
                        {
                        return neutral_mario_left;
                        }
                    }
                }
            else
                {
                if (jump.isRunning ())
                    {
                    return (images.get (3));
                    }
                else
                    {
                    if (neutral)
                        {
                        return images.get (0);
                        }
                    else if (running1)
                        {
                        return images.get (1);
                        }
                    else if (running2)
                        {
                        return images.get (2);
                        }
                    else if (jumping)
                        {
                        return images.get (3);
                        }
                    else if (skidding)
                        {
                        return images.get (8);
                        }
                    else if (pole_slide)
                        {
                        return mario_sliding_pole;
                        }
                    else if (pole_slide_left)
                        {
                        return mario_sliding_pole_left;
                        }
                    else if (pole_slide_finished)
                        {
                        return neutral_mario;
                        }
                    else if (nullify)
                        {
                        return null_mario;
                        }
                    else
                        {
                        return neutral_mario;
                        }
                    }
                }
            }
        }
    
    public void keyPressed (KeyEvent e)
        {
        int key = e.getKeyCode();
        
        if (key == KeyEvent.VK_LEFT)
            {
            // change the flags based on the currently pressed button
            left_press = true;
            
            //prevents orientation flip mario mid air
            if (!jump.isRunning ())
                flipped_left = true;
            
            if (!jump.isRunning () && !run_slowdown.isRunning () && !skid.isRunning ())
                {
                // if boosting, increases speed. use "-" because moving backwards to the left
                if (z_press)
                    dx = -speed_boost;
                else    
                    dx = -speed;
                }
            //solves the issue of, while skidding to the left, pressing right while left is held down
            else if (!run_slowdown.isRunning () && skid.isRunning ())
                {
                skid.stop ();
                skidding = false;
                }
            else if (run_slowdown.isRunning ())
                {
                run_slowdown.stop ();
                
                if (!slowing_down_left)
                    skid.start ();
                else
                    {
                    if (z_press)
                        dx = -speed_boost;
                    else    
                        dx = -speed;
                    }
                }
            
            // start running animation
            run.start ();
            }
        
        if (key == KeyEvent.VK_RIGHT)
            {
            right_press = true;
            
            //prevents orientation flip mario mid air
            if (!jump.isRunning ())
                flipped_left = false;
            
            if (!jump.isRunning () && !run_slowdown.isRunning () && !skid.isRunning ())
                {
                if (z_press)
                    dx = speed_boost;
                else
                    dx = speed;
                }
            //solves the issue of, while skidding to the left, pressing right while left is held down
            else if (!run_slowdown.isRunning () && skid.isRunning ())
                {
                skid.stop ();
                skidding = false;
                }
            else if (run_slowdown.isRunning ())
                {
                run_slowdown.stop ();
                
                if (!slowing_down_right)
                    skid.start ();
                else
                    {
                    if (z_press)
                        dx = speed_boost;
                    else
                        dx = speed;
                    }
                }
            
            run.start ();
            }
        
        if (key == KeyEvent.VK_Z)
            {
            z_press = true;
            
            // if currently pressing the right or left button while z is then pressed, increase speed, and not in mid jump
            if (!jump.isRunning ())
                {
                if (right_press)
                    {
                    dx = speed_boost;
                    }
                else if (left_press)
                    {
                    dx = -speed_boost;
                    }
                }
            }

        if (key == KeyEvent.VK_SPACE)
            {
            jumping = true;
            if (!jump.isRunning ())
                {
                if (right_press)
                    {
                    right_jump = true;
                    left_jump  = false;
                    }
                if (left_press)
                    {
                    left_jump = true;
                    right_jump  = false;
                    }
                
                }
            
            if (!jump.isRunning ())
                space_press = true;
            
            if (!jump.isRunning ())
                jump_takeoff = get_y ();
            
            if (z_press)
                {
                boost_jump = true;
                jump_speed_boost = true;
                }
            
            if (!right_press && !left_press && !run_slowdown.isRunning () && !jump.isRunning ())
                straight_jump = true;
            
            // prevents jump while already in mid jump, also stops any nimations due to running from continuing
            if (!jump.isRunning () && get_y () >= floor_border)
                {
                neutral = true;
                accel = true;
                run.stop ();
                skid.stop ();
                run_slowdown.stop ();
                jump.start ();
                }
            // handles jumping from a low block
            else if (!jump.isRunning () && (get_y () == MainPanel.mario_resting_low_block_y)   ||
                    (!jump.isRunning () && (get_y () == MainPanel.mario_resting_high_block_y)) ||
                    (!jump.isRunning () && (get_y () == MainPanel.mario_resting_low_pipe_y))   ||
                    (!jump.isRunning () && (get_y () == MainPanel.mario_resting_mid_pipe_y))   ||
                    (!jump.isRunning () && (get_y () == MainPanel.mario_resting_high_pipe_y))  ||
                    (!jump.isRunning () && (get_y () == MainPanel.mario_resting_stair1))       ||
                    (!jump.isRunning () && (get_y () == MainPanel.mario_resting_stair2))       ||
                    (!jump.isRunning () && (get_y () == MainPanel.mario_resting_stair3))       ||
                    (!jump.isRunning () && (get_y () == MainPanel.mario_resting_stair4))       ||
                    (!jump.isRunning () && (get_y () == MainPanel.mario_resting_stair5))       ||
                    (!jump.isRunning () && (get_y () == MainPanel.mario_resting_stair6))       ||
                    (!jump.isRunning () && (get_y () == MainPanel.mario_resting_stair7))       ||
                    (!jump.isRunning () && (get_y () == MainPanel.mario_resting_stair8)))
                {
                neutral = true;
                accel = true;
                run.stop ();
                skid.stop ();
                run_slowdown.stop ();
                jump.start ();
                }
            }
            
        }
 
    public void keyReleased (KeyEvent e) 
        {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT)
            {
            // if letting go of the left button, and the right button ismt clicked, stop the run animation. otherwise. run animation will continue in other direction
            if (!right_press)
                run.stop ();
            
            // only display neutral mario image if not mid jump
            if (!jumping)
                neutral = true;
            else
                neutral = false;
            
            // change the running animation booleans to false
            running1 = false;
            running2 = false;
            left_press = false;
            
            if (!jump.isRunning ())
                {
                // handles marios orientation, if pressing right while left is released, hes not flipped left
                if (right_press)
                    {
                    flipped_left = false;
                    }
                //if the user lets go of the left button but is pressing the right button, and pressing z, immediately move mario back to the right wihtout slowing down
                if (right_press && z_press)
                    {
                    dx = speed_boost;
                    }
                //same, but if not pressing z
                else if (right_press)
                    {
                    dx = speed;
                    }
                //otherwise, stop moving mario.
                else
                    {
                    run_slowdown.start ();
                    slowing_down_left = true;
                    slowing_down_right = false;
                    }
                }
            }
        
        if (key == KeyEvent.VK_RIGHT)
            {
            if (!left_press)
                run.stop ();
            
            if (!jumping)
                neutral = true;
            else
                neutral = false;
            
            running1 = false;
            running2 = false;
            right_press = false;
            
            if (!jump.isRunning ())
                {
                // handles marios orientation, if pressing left while right is released, hes  flipped left
                if (left_press)
                    {
                    flipped_left = true;
                    }
                
                if (left_press && z_press)
                    {
                    dx = -speed_boost;
                    }
                else if (left_press)
                    {
                    dx = -speed;
                    }
                else
                    {
                    run_slowdown.start ();
                    slowing_down_right = true;
                    slowing_down_left = false;
                    }
                }
            }
        
        if (key == KeyEvent.VK_Z)
            {
            z_press = false;
            
            // only change the speed of mario if not already in run slowdown or jumping
            if (!jump.isRunning ())
                {
                // if let go of z, but still pressing right or left, doesnt stutter movement
                if (right_press)
                    dx = speed;
                else if (left_press)
                    dx = -speed;
                else
                    {
                    if (run_slowdown.isRunning () || skid.isRunning ())
                        dx = dx;
                    else
                        dx = 0;
                    }
                }
            }
        
        // start the run animation if let go of jump, but still pressing right (only happens once jumping animatio has stopped)
        if (key == KeyEvent.VK_SPACE)
            {
            space_press = false;
            
            if (right_press || left_press)
                run.start ();
            
            if (!jump.isRunning ())
                accel = false;
            }
        }
    }
