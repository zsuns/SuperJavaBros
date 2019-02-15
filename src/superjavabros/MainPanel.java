package superjavabros;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MainPanel extends JPanel implements ActionListener
    {
    Mario mario;
    Timer time;
    
    Floor floor_partition1, floor_partition2, floor_partition3, floor_partition4, floor_space1, floor_space2, floor_space3;
    
    DecorativeObject big_hill1,     big_hill2,     big_hill3,     big_hill4,     big_hill5,     big_hill6;
    DecorativeObject little_cloud1, little_cloud2, little_cloud3, little_cloud4, little_cloud5, little_cloud6, little_cloud7, little_cloud8, little_cloud9, little_cloud10;
    DecorativeObject big_bush1,     big_bush2,     big_bush3,     big_bush4,     big_bush5,     big_bush6;
    DecorativeObject little_bush1,  little_bush2,  little_bush3,  little_bush4,  little_bush5,  little_bush6;
    DecorativeObject little_hill1,  little_hill2,  little_hill3,  little_hill4,  little_hill5,  little_hill6;
    DecorativeObject big_cloud1,    big_cloud2,    big_cloud3,    big_cloud4,    big_cloud5,    big_cloud6;
    DecorativeObject mid_cloud1,    mid_cloud2,    mid_cloud3,    mid_cloud4,    mid_cloud5,    mid_cloud6;
    DecorativeObject mid_bush1,     mid_bush2,     mid_bush3,     mid_bush4,     mid_bush5,     mid_bush56;
    DecorativeObject castle,        flag_pole,     flag_pole_flag;
    
    QuestionBlock question_block1, question_block2, question_block3, question_block4, question_block5, question_block6,
                  question_block7, question_block8, question_block9, question_block10, question_block11, question_block12,
                  question_block13;
    
    RegularBlock regular_block1,  regular_block2,  regular_block3,  regular_block4,  regular_block5,  regular_block6,  regular_block7,  regular_block8,
                 regular_block9,  regular_block10, regular_block11, regular_block12, regular_block13, regular_block14, regular_block15, regular_block16,
                 regular_block17, regular_block18, regular_block19, regular_block20, regular_block21, regular_block22, regular_block23, regular_block24,
                 regular_block25, regular_block26, regular_block27, regular_block28, regular_block29, regular_block30, regular_block31;
    
    WarpPipe little_pipe1, mid_pipe1, big_pipe1, big_pipe2, little_pipe2, little_pipe3;
    
    Stairs left_stairs, right_stairs1, double_stairs, right_stairs2, end_level_stairs;
    Stairs left_stairs_test, right_stairs1_test, double_stairs_test, right_stairs2_test, end_level_stairs_test;
    
    Goomba goomba1, goomba2, goomba3, goomba4, goomba5, goomba6, goomba7, goomba8, goomba9, goomba10, goomba11, goomba12, goomba13, goomba14;
    
    Koopa koopa;
    
    Rectangle floor_object1, floor_object2, floor_object3, floor_object4;
    Rectangle floor_space_object1, floor_space_object2, floor_space_object3;
    
    Rectangle question_block_object1, question_block_object2, question_block_object3, question_block_object4,  question_block_object5,  question_block_object6;
    Rectangle question_block_object7, question_block_object8, question_block_object9, question_block_object10, question_block_object11, question_block_object12;
    Rectangle question_block_object13;
    
    Rectangle regular_block_object1, regular_block_object2, regular_block_object3, regular_block_object4, regular_block_object5, regular_block_object6;
    Rectangle regular_block_object7, regular_block_object8, regular_block_object9, regular_block_object10, regular_block_object11, regular_block_object12;
    Rectangle regular_block_object13, regular_block_object14, regular_block_object15, regular_block_object16, regular_block_object17, regular_block_object18;
    Rectangle regular_block_object19, regular_block_object20, regular_block_object21, regular_block_object22, regular_block_object23, regular_block_object24;
    Rectangle regular_block_object25, regular_block_object26, regular_block_object27, regular_block_object28, regular_block_object29;
    
    ArrayList <DecorativeObject> sprites          = new ArrayList <> ();
    ArrayList <Floor>            floor_partitions = new ArrayList <> ();
    ArrayList <QuestionBlock>    question_blocks  = new ArrayList <> ();
    ArrayList <RegularBlock>     regular_blocks   = new ArrayList <> ();
    ArrayList <Block>            all_blocks       = new ArrayList <> ();
    ArrayList <WarpPipe>         warp_pipes       = new ArrayList <> ();
    ArrayList <Stairs>           stairs           = new ArrayList <> ();
    ArrayList <Goomba>           goombas          = new ArrayList <> ();
    ArrayList <Koopa>            koopas           = new ArrayList <> ();
    ArrayList <Enemy>            all_enemies      = new ArrayList <> ();
    
    boolean end_execution = false;
    
    int    right_boundry    = 400;
    int    left_boundry     = 10;
    int    mario_y_axis_pad = 54;
    
    double mario_scale_rate      = 1.4;
    double goomba_scale_rate     = 3.5;
    double floor_scale_rate      = 2.21;
    int    decoration_scale_rate = 3;
    double block_scale_rate      = 8;
    double warp_pipe_scale_rate  = 3.43;
    double stairs_scale_rate     = 1.85;
    double coin_scale_rate       = 3.37;
    double koopa_scale_rate      = 21;
    
    int    big_hill_y    = 660;
    int    low_cloud_y   = 260;
    int    bush_y        = 717;
    int    little_hill_y = 708;
    int    high_cloud_y  = 210;
    int    little_pipe_y = 691;
    int    mid_pipe_y    = 618;
    int    big_pipe_y    = 583;
    int    low_stairs_y  = 568;
    int    high_stairs_y  = 370;
    int    coin_index     = 1;
    
    public static int    block_low                  = 571;
    public static int    block_high                 = 362;
    public static int    mario_resting_low_block_y  = 472;
    public static int    mario_resting_high_block_y = 264;
    
    public static int    mario_resting_low_pipe_y  = 593;
    public static int    mario_resting_mid_pipe_y  = 519;
    public static int    mario_resting_high_pipe_y = 484;
    
    public static int    mario_resting_stair1 = 619;
    public static int    mario_resting_stair2 = 569;
    public static int    mario_resting_stair3 = 519;
    public static int    mario_resting_stair4 = 469;
    public static int    mario_resting_stair5 = 419;
    public static int    mario_resting_stair6 = 369;
    public static int    mario_resting_stair7 = 319;
    public static int    mario_resting_stair8 = 269;
    
    AL key = new AL ();
    
    boolean mario_is_touching_side_block;
    boolean mario_is_touching_top_pipe;
    
    Timer flag_to_bottom = new Timer (1, new ActionListener ()
        {
        @Override
        public void actionPerformed (ActionEvent ae)
            {
            if (flag_pole_flag.get_y () < mario_resting_stair1 + 22)
                flag_pole_flag.dy = 5;
            else if (flag_pole_flag.get_y () >= mario_resting_stair1 + 22)
                {
                flag_pole_flag.dy = 0;
                flag_pole_flag.y = mario_resting_stair1 + 22;
                flag_to_bottom.stop ();
                }
            }
        });
    
    public MainPanel ()
        {
        init_floors ();
        init_decorations ();
        init_regular_blocks ();
        init_question_blocks ();
        init_rectangles ();
        init_warp_pipes ();
        init_stairs ();
        init_goomba ();
        init_koopa ();
        
        mario = new Mario ();
        
        addKeyListener (key);
        setFocusable (true);
        
        time = new Timer (10, this);
        time.start();        
        }
    
    public void paint (Graphics g)
        {
        super.paintComponent (g);
        Graphics2D graphics = (Graphics2D) g;
        this.setBackground (new Color (92, 148, 252));
        
        init_rectangles ();

        Rectangle mario_object = new Rectangle (mario.get_x (), mario.get_y () + mario_y_axis_pad, (int) (mario.neutral_mario.getIconWidth () / 1.4), (int) (mario.neutral_mario.getIconHeight () / 1.4));
        draw_graphics (graphics);
        graphics.drawImage (mario.get_mario_image ().getImage (), mario.get_x (), mario.get_y () + mario_y_axis_pad, (int) (mario.neutral_mario.getIconWidth () / mario_scale_rate), (int) (mario.neutral_mario.getIconHeight () / mario_scale_rate), null);
        
        move_floors ();
        
        check_block_collision (mario_object, graphics);
        check_warp_pipe_collision (mario_object);
        check_stairs_collision (mario_object);
        check_flag_collision (mario_object);
        check_goomba_collision (mario_object);
        check_koopa_collision (mario_object);
      
        if (mario_object.intersects (floor_space_object1) || mario_object.intersects (floor_space_object2) || mario_object.intersects (floor_space_object3))
            {
            mario.dy += 2;
            }
        
        for (Goomba goomba : goombas)
            {
            Rectangle goomba_rect = new Rectangle (goomba.get_x (), goomba.get_y (), (int)(goomba.get_enemy_image ().getImage ().getWidth (null) / goomba_scale_rate), (int)(goomba.get_enemy_image ().getImage ().getHeight (null) / goomba_scale_rate));
            
            if (goomba_rect.intersects (floor_space_object1) || goomba_rect.intersects (floor_space_object2) || goomba_rect.intersects (floor_space_object3))
                {
                goomba.dy += 1;
                }
            }
        
        for (Koopa koopa : koopas)
            {
            Rectangle koopa_rect = new Rectangle (koopa.get_x (), koopa.get_y (), (int)(koopa.get_enemy_image ().getImage ().getWidth (null) / koopa_scale_rate), (int)(koopa.get_enemy_image ().getImage ().getHeight (null) / koopa_scale_rate));
            
            if (koopa_rect.intersects (floor_space_object1) || koopa_rect.intersects (floor_space_object2) || koopa_rect.intersects (floor_space_object3))
                {
                koopa.dy += 1;
                }
            }
        }

    @Override
    public void actionPerformed (ActionEvent ae)
        {
        for (Stairs s : stairs)
            s.move ();
        
        for (DecorativeObject s : sprites)
            s.move ();
        
        for (Floor f : floor_partitions)
            f.move ();
        
        for (QuestionBlock q : question_blocks)
            {
            q.move ();
            
            if (q.get_has_coin ())
                q.get_coin ().move ();
            }

        for (RegularBlock r : regular_blocks)
            {
            r.move ();
            
            if (r.multiple_coins)
                {
                for (Coin c : r.coins)
                    c.move ();
                }
            }
        
        for (WarpPipe w : warp_pipes)
            w.move ();
        
        for (Goomba g : goombas)
            g.move ();
        
        for (Koopa k : koopas)
            k.move ();
        
        mario.move ();
        repaint ();
        }
    
    public void init_floors ()
        {
        floor_partition1 = new Floor ();
        floor_partition1.set_x (0);
        
        floor_partition2 = new Floor ();
        floor_partition2.set_x ((int)(Floor.get_floor_image (1).getWidth (null) / floor_scale_rate) + 120);
        
        floor_partition3 = new Floor ();
        floor_partition3.set_x (((int)(Floor.get_floor_image (1).getWidth (null) / floor_scale_rate) + 120) + 
                               ((int)(Floor.get_floor_image (2).getWidth (null) / floor_scale_rate) + 160));
        
        floor_partition4 = new Floor ();
        floor_partition4.set_x (((int)(Floor.get_floor_image (1).getWidth (null) / floor_scale_rate) + 120) + 
                                ((int)(Floor.get_floor_image (2).getWidth (null) / floor_scale_rate) + 160) +
                                ((int)(Floor.get_floor_image (3).getWidth (null) / floor_scale_rate) + 120));
        
        floor_space1 = new Floor ();
        floor_space1.set_x ((int)(Floor.get_floor_image (1).getWidth (null) / floor_scale_rate) + 33);
        
        floor_space2 = new Floor ();
        floor_space2.set_x ((int)(Floor.get_floor_image (1).getWidth (null) / floor_scale_rate) + 33 + 
                           (int)(Floor.get_floor_image (2).getWidth (null) / floor_scale_rate) + 123);
        
        floor_space3 = new Floor ();
        floor_space3.set_x ((int)(Floor.get_floor_image (1).getWidth (null) / floor_scale_rate) + 33 + 
                           (int)(Floor.get_floor_image (2).getWidth (null) / floor_scale_rate) + 123 + 
                            (int)(Floor.get_floor_image (3).getWidth (null) / floor_scale_rate) + 160);
        
        
        floor_partitions.add (floor_partition1); floor_partitions.add (floor_partition2); floor_partitions.add (floor_partition3); floor_partitions.add (floor_partition4);
        floor_partitions.add (floor_space1); floor_partitions.add (floor_space2); floor_partitions.add (floor_space3);
        }
    
    public void init_decorations ()
        {
        big_hill1 = new DecorativeObject ();
        big_hill1.set_x (0);
        big_hill1.set_y (big_hill_y);
        
        little_cloud1 = new DecorativeObject ();
        little_cloud1.set_x (408);
        little_cloud1.set_y (low_cloud_y);
        
        big_bush1 = new DecorativeObject ();
        big_bush1.set_x (550);
        big_bush1.set_y (bush_y);
        
        little_hill1 = new DecorativeObject ();
        little_hill1.set_x (767);
        little_hill1.set_y (little_hill_y);
        
        little_cloud2 = new DecorativeObject ();
        little_cloud2.set_x (949);
        little_cloud2.set_y (high_cloud_y);
        
        little_bush1 = new DecorativeObject ();
        little_bush1.set_x (1126);
        little_bush1.set_y (bush_y);
        
        big_cloud1 = new DecorativeObject ();
        big_cloud1.set_x (1318);
        big_cloud1.set_y (low_cloud_y);
        
        mid_cloud1 = new DecorativeObject ();
        mid_cloud1.set_x (1747);
        mid_cloud1.set_y (high_cloud_y);
        
        mid_bush1 = new DecorativeObject ();
        mid_bush1.set_x (1990);
        mid_bush1.set_y (bush_y);
        
        big_hill2 = new DecorativeObject ();
        big_hill2.set_x (2300);
        big_hill2.set_y (big_hill_y);
        
        little_cloud3 = new DecorativeObject ();
        little_cloud3.set_x (2708);
        little_cloud3.set_y (low_cloud_y);
        
        big_bush2 = new DecorativeObject ();
        big_bush2.set_x (2854);
        big_bush2.set_y (bush_y);
        
        little_hill2 = new DecorativeObject ();
        little_hill2.set_x (3070);
        little_hill2.set_y (little_hill_y);
        
        little_cloud4 = new DecorativeObject ();
        little_cloud4.set_x (3239);
        little_cloud4.set_y (high_cloud_y);
        
        little_bush2 = new DecorativeObject ();
        little_bush2.set_x (3430);
        little_bush2.set_y (bush_y);
        
        big_cloud2 = new DecorativeObject ();
        big_cloud2.set_x (3621);
        big_cloud2.set_y (low_cloud_y);
        
        mid_cloud2 = new DecorativeObject ();
        mid_cloud2.set_x (4055);
        mid_cloud2.set_y (high_cloud_y);
        
        mid_bush2 = new DecorativeObject ();
        mid_bush2.set_x (4294);
        mid_bush2.set_y (bush_y);
        
        big_hill3 = new DecorativeObject ();
        big_hill3.set_x (4607);
        big_hill3.set_y (big_hill_y);
        
        little_cloud5 = new DecorativeObject ();
        little_cloud5.set_x (5017);
        little_cloud5.set_y (low_cloud_y);
        
        big_bush3 = new DecorativeObject ();
        big_bush3.set_x (5158);
        big_bush3.set_y (bush_y);
        
        little_hill3 = new DecorativeObject ();
        little_hill3.set_x (5372);
        little_hill3.set_y (little_hill_y);
        
        little_cloud6 = new DecorativeObject ();
        little_cloud6.set_x (5540);
        little_cloud6.set_y (high_cloud_y);
        
        little_bush3 = new DecorativeObject ();
        little_bush3.set_x (5733);
        little_bush3.set_y (bush_y);
        
        big_cloud3 = new DecorativeObject ();
        big_cloud3.set_x (5928);
        big_cloud3.set_y (low_cloud_y);
        
        mid_cloud3 = new DecorativeObject ();
        mid_cloud3.set_x (6359);
        mid_cloud3.set_y (high_cloud_y);
        
        mid_bush3 = new DecorativeObject ();
        mid_bush3.set_x (6602);
        mid_bush3.set_y (bush_y);
        
        big_hill4 = new DecorativeObject ();
        big_hill4.set_x (6912);
        big_hill4.set_y (big_hill_y);
        
        little_cloud7 = new DecorativeObject ();
        little_cloud7.set_x (7317);
        little_cloud7.set_y (low_cloud_y);
        
        little_hill4 = new DecorativeObject ();
        little_hill4.set_x (7678);
        little_hill4.set_y (little_hill_y);
        
        little_cloud8 = new DecorativeObject ();
        little_cloud8.set_x (7847);
        little_cloud8.set_y (high_cloud_y);
        
        little_bush4 = new DecorativeObject ();
        little_bush4.set_x (8040);
        little_bush4.set_y (bush_y);
        
        big_cloud4 = new DecorativeObject ();
        big_cloud4.set_x (8231);
        big_cloud4.set_y (low_cloud_y);
        
        mid_cloud4 = new DecorativeObject ();
        mid_cloud4.set_x (8865);
        mid_cloud4.set_y (high_cloud_y);
        
        big_hill5 = new DecorativeObject ();
        big_hill5.set_x (9214);
        big_hill5.set_y (big_hill_y);
        
        little_cloud9 = new DecorativeObject ();
        little_cloud9.set_x (9624);
        little_cloud9.set_y (low_cloud_y);
        
        little_hill5 = new DecorativeObject ();
        little_hill5.set_x (9982);
        little_hill5.set_y (little_hill_y);
        
        castle = new DecorativeObject ();
        castle.set_x (9694);
        castle.set_y (482);
        
        flag_pole = new DecorativeObject ();
        flag_pole.set_x (9503);
        flag_pole.set_y (259);
        
        flag_pole_flag = new DecorativeObject ();
        flag_pole_flag.set_x (9503);
        flag_pole_flag.set_y (259);
        
        sprites.add (big_hill1);     sprites.add (little_cloud1); sprites.add (big_bush1);     sprites.add (little_hill1);  sprites.add (little_cloud2);
        sprites.add (little_bush1);  sprites.add (big_cloud1);    sprites.add (mid_cloud1);    sprites.add (mid_bush1);     sprites.add (big_hill2);
        sprites.add (little_cloud3); sprites.add (big_bush2);     sprites.add (little_hill2);  sprites.add (little_cloud4); sprites.add (little_bush2);
        sprites.add (big_cloud2);    sprites.add (mid_cloud2);    sprites.add (mid_bush2);     sprites.add (big_hill3);     sprites.add (little_cloud5);
        sprites.add (big_bush3);     sprites.add (little_hill3);  sprites.add (little_cloud6); sprites.add (little_bush3);  sprites.add (big_cloud3);
        sprites.add (mid_cloud3);    sprites.add (mid_bush3);     sprites.add (big_hill4);     sprites.add (little_cloud7); sprites.add (little_hill4);
        sprites.add (little_cloud8); sprites.add (little_bush4);  sprites.add (big_cloud4);    sprites.add (mid_cloud4);    sprites.add (big_hill5);
        sprites.add (little_cloud9); sprites.add (little_hill5);  sprites.add (castle);        sprites.add (flag_pole);     sprites.add (flag_pole_flag);
        }
    
    public void init_question_blocks ()
        {
        question_block1 = new QuestionBlock ();
        question_block1.set_x (767);
        question_block1.set_y (block_low);
        question_block1.set_has_coin (true);
        
        question_block2 = new QuestionBlock ();
        question_block2.set_x (1009);
        question_block2.set_y (block_low);
        
        question_block3 = new QuestionBlock ();
        question_block3.set_x (1059);
        question_block3.set_y (block_high);
        question_block3.set_has_coin (true);
        
        question_block4 = new QuestionBlock ();
        question_block4.set_x (1109);
        question_block4.set_y (block_low);
        question_block4.set_has_coin (true);
        
        question_block5 = new QuestionBlock ();
        question_block5.set_x (3745);
        question_block5.set_y (block_low);
        
        question_block6 = new QuestionBlock ();
        question_block6.set_x (4518);
        question_block6.set_y (block_high);
        question_block6.set_has_coin (true);
        
        question_block7 = new QuestionBlock ();
        question_block7.set_x (5087);
        question_block7.set_y (block_low);
        question_block7.set_has_coin (true);
        
        question_block8 = new QuestionBlock ();
        question_block8.set_x (5230);
        question_block8.set_y (block_high);
        
        question_block9 = new QuestionBlock ();
        question_block9.set_x (5230);
        question_block9.set_y (block_low);
        question_block9.set_has_coin (true);
        
        question_block10 = new QuestionBlock ();
        question_block10.set_x (5375);
        question_block10.set_y (block_low);
        question_block10.set_has_coin (true);
        
        question_block11 = new QuestionBlock ();
        question_block11.set_x (6192);
        question_block11.set_y (block_high);
        question_block11.set_has_coin (true);
        
        question_block12 = new QuestionBlock ();
        question_block12.set_x (6242);
        question_block12.set_y (block_high);
        question_block12.set_has_coin (true);
        
        question_block13 = new QuestionBlock ();
        question_block13.set_x (8162);
        question_block13.set_y (block_low);
        question_block13.set_has_coin (true);
        
        question_blocks.add (question_block1); 
        question_blocks.add (question_block2); 
        question_blocks.add (question_block3); 
        question_blocks.add (question_block4);
        question_blocks.add (question_block5); 
        question_blocks.add (question_block6); 
        question_blocks.add (question_block7); 
        question_blocks.add (question_block8);
        question_blocks.add (question_block9); 
        question_blocks.add (question_block10); 
        question_blocks.add (question_block11); 
        question_blocks.add (question_block12);
        question_blocks.add (question_block13);
        
        all_blocks.addAll (question_blocks);
        }
    
    public void init_regular_blocks ()
        {
        regular_block1 = new RegularBlock ();
        regular_block1.set_x (959);
        regular_block1.set_y (block_low);
        
        regular_block2 = new RegularBlock ();
        regular_block2.set_x (1059);
        regular_block2.set_y (block_low);
        
        regular_block3 = new RegularBlock ();
        regular_block3.set_x (1159);
        regular_block3.set_y (block_low);
        
        regular_block4 = new RegularBlock ();
        regular_block4.set_x (3695);
        regular_block4.set_y (block_low);
        
        regular_block5 = new RegularBlock ();
        regular_block5.set_x (3795);
        regular_block5.set_y (block_low);
        
        regular_block6 = new RegularBlock ();
        regular_block6.set_x (3845);
        regular_block6.set_y (block_high);
        
        regular_block7 = new RegularBlock ();
        regular_block7.set_x (3895);
        regular_block7.set_y (block_high);
        
        regular_block8 = new RegularBlock ();
        regular_block8.set_x (3945);
        regular_block8.set_y (block_high);
        
        regular_block9 = new RegularBlock ();
        regular_block9.set_x (3995);
        regular_block9.set_y (block_high);
        
        regular_block10 = new RegularBlock ();
        regular_block10.set_x (4045);
        regular_block10.set_y (block_high);
        
        regular_block11 = new RegularBlock ();
        regular_block11.set_x (4095);
        regular_block11.set_y (block_high);
        
        regular_block12 = new RegularBlock ();
        regular_block12.set_x (4145);
        regular_block12.set_y (block_high);
        
        regular_block13 = new RegularBlock ();
        regular_block13.set_x (4195);
        regular_block13.set_y (block_high);
        
        regular_block14 = new RegularBlock ();
        regular_block14.set_x (4368);
        regular_block14.set_y (block_high);
        
        regular_block15 = new RegularBlock ();
        regular_block15.set_x (4418);
        regular_block15.set_y (block_high);
        
        regular_block16 = new RegularBlock ();
        regular_block16.set_x (4468);
        regular_block16.set_y (block_high);
        
        regular_block17 = new RegularBlock ();
        regular_block17.set_x (4518);
        regular_block17.set_y (block_low);
        regular_block17.set_multiple_coins (true);
        regular_block17.set_has_coin (true);
        
        regular_block18 = new RegularBlock ();
        regular_block18.set_x (4800);
        regular_block18.set_y (block_low);
        
        regular_block19 = new RegularBlock ();
        regular_block19.set_x (5662);
        regular_block19.set_y (block_low);
        
        regular_block20 = new RegularBlock ();
        regular_block20.set_x (5806);
        regular_block20.set_y (block_high);
        
        regular_block21 = new RegularBlock ();
        regular_block21.set_x (5856);
        regular_block21.set_y (block_high);
        
        regular_block22 = new RegularBlock ();
        regular_block22.set_x (5906);
        regular_block22.set_y (block_high);
        
        regular_block23 = new RegularBlock ();
        regular_block23.set_x (6142);
        regular_block23.set_y (block_high);
        
        regular_block24 = new RegularBlock ();
        regular_block24.set_x (6192);
        regular_block24.set_y (block_low);
        
        regular_block25 = new RegularBlock ();
        regular_block25.set_x (6242);
        regular_block25.set_y (block_low);
        
        regular_block26 = new RegularBlock ();
        regular_block26.set_x (6292);
        regular_block26.set_y (block_high);
        
        regular_block27 = new RegularBlock ();
        regular_block27.set_x (8062);
        regular_block27.set_y (block_low);
        
        regular_block28 = new RegularBlock ();
        regular_block28.set_x (8112);
        regular_block28.set_y (block_low);
        
        regular_block29 = new RegularBlock ();
        regular_block29.set_x (8212);
        regular_block29.set_y (block_low);
        
        regular_blocks.add (regular_block1); regular_blocks.add (regular_block2); regular_blocks.add (regular_block3); regular_blocks.add (regular_block4);
        regular_blocks.add (regular_block5); regular_blocks.add (regular_block6); regular_blocks.add (regular_block7); regular_blocks.add (regular_block8);
        regular_blocks.add (regular_block9); regular_blocks.add (regular_block10); regular_blocks.add (regular_block11); regular_blocks.add (regular_block12);
        regular_blocks.add (regular_block13); regular_blocks.add (regular_block14); regular_blocks.add (regular_block15); regular_blocks.add (regular_block16);
        regular_blocks.add (regular_block17); regular_blocks.add (regular_block18); regular_blocks.add (regular_block19); regular_blocks.add (regular_block20);
        regular_blocks.add (regular_block21); regular_blocks.add (regular_block22); regular_blocks.add (regular_block23); regular_blocks.add (regular_block24);
        regular_blocks.add (regular_block25); regular_blocks.add (regular_block26); regular_blocks.add (regular_block27); regular_blocks.add (regular_block28);
        regular_blocks.add (regular_block29);
        
        all_blocks.addAll (regular_blocks);
        }
    
    public void init_rectangles ()
        {
        floor_object1 = new Rectangle (floor_partition1.get_x (), floor_partition1.get_y (), (int)(floor_partition1.get_floor_image (1).getWidth (null) / floor_scale_rate), (int)(floor_partition1.get_floor_image (1).getHeight (null) / floor_scale_rate));
        floor_object2 = new Rectangle (floor_partition2.get_x (), floor_partition2.get_y (), (int)(floor_partition2.get_floor_image (2).getWidth (null) / floor_scale_rate), (int)(floor_partition2.get_floor_image (2).getHeight (null) / floor_scale_rate));
        floor_object3 = new Rectangle (floor_partition3.get_x (), floor_partition3.get_y (), (int)(floor_partition3.get_floor_image (3).getWidth (null) / floor_scale_rate), (int)(floor_partition3.get_floor_image (3).getHeight (null) / floor_scale_rate));
        floor_object4 = new Rectangle (floor_partition4.get_x (), floor_partition4.get_y (), (int)(floor_partition4.get_floor_image (4).getWidth (null) / floor_scale_rate), (int)(floor_partition4.get_floor_image (4).getHeight (null) / floor_scale_rate));
        
        floor_space_object1 = new Rectangle (floor_space1.get_x (), floor_space1.get_y (), 55, 80);
        floor_space_object2 = new Rectangle (floor_space2.get_x (), floor_space2.get_y (), 88, 80);
        floor_space_object3 = new Rectangle (floor_space3.get_x (), floor_space3.get_y (), 49, 80);
        }
    
    public void init_warp_pipes ()
        {
        little_pipe1 = new WarpPipe (0);
        little_pipe1.set_x (1343);
        little_pipe1.set_y (little_pipe_y);
        
        mid_pipe1 = new WarpPipe (1);
        mid_pipe1.set_x (1823);
        mid_pipe1.set_y (mid_pipe_y);
        
        big_pipe1 = new WarpPipe (2);
        big_pipe1.set_x (2207);
        big_pipe1.set_y (big_pipe_y);
        
        big_pipe2 = new WarpPipe (2);
        big_pipe2.set_x (2735);
        big_pipe2.set_y (big_pipe_y);
        
        little_pipe2 = new WarpPipe (0);
        little_pipe2.set_x (7823);
        little_pipe2.set_y (little_pipe_y);
        
        little_pipe3 = new WarpPipe (0);
        little_pipe3.set_x (8591);
        little_pipe3.set_y (little_pipe_y);
        
        warp_pipes.add (little_pipe1); 
        warp_pipes.add (mid_pipe1); 
        warp_pipes.add (big_pipe1); 
        warp_pipes.add (big_pipe2); 
        warp_pipes.add (little_pipe2); 
        warp_pipes.add (little_pipe3); 
        }
    
    public void init_stairs ()
        {
        left_stairs = new Stairs (0);
        left_stairs.set_x (6430);
        left_stairs.set_y (low_stairs_y);
        
        right_stairs1 = new Stairs (1);
        right_stairs1.set_x (6720);
        right_stairs1.set_y (low_stairs_y);
        
        double_stairs = new Stairs (2);
        double_stairs.set_x (floor_partition3.get_x () + (int)floor_object3.getWidth () - (int)(double_stairs.get_stairs_image (2).getImage ().getWidth (null) / stairs_scale_rate) + 2);
        double_stairs.set_y (low_stairs_y);
        
        right_stairs2 = new Stairs (1);
        right_stairs2.set_x (floor_partition4.get_x ());
        right_stairs2.set_y (low_stairs_y);
        
        end_level_stairs = new Stairs (3);
        end_level_stairs.set_x (little_pipe3.get_x () + (int)(little_pipe1.get_pipe_image (0).getImage ().getWidth (null) / warp_pipe_scale_rate) + 3);
        end_level_stairs.set_y (high_stairs_y);
        
        stairs.add (left_stairs); stairs.add (right_stairs1); stairs.add (double_stairs); stairs.add (right_stairs2); stairs.add (end_level_stairs);
        }
    
    public void init_goomba ()
        {
        goomba1 = new Goomba ();
        goomba1.set_x (987);
        goomba1.set_y (721);
        
        goomba2 = new Goomba ();
        goomba2.set_x (1990);
        goomba2.set_y (721);
        
        goomba3 = new Goomba ();
        goomba3.set_x (2520);
        goomba3.set_y (721);
        
        goomba4 = new Goomba ();
        goomba4.set_x (2595);
        goomba4.set_y (721);
        
        goomba5 = new Goomba ();
        goomba5.set_x (4060);
        goomba5.set_y (200);
        
        goomba6 = new Goomba ();
        goomba6.set_x (4135);
        goomba6.set_y (200);
        
        goomba7 = new Goomba ();
        goomba7.set_x (4600);
        goomba7.set_y (721);
        
        goomba8 = new Goomba ();
        goomba8.set_x (4675);
        goomba8.set_y (721);
        
        goomba9 = new Goomba ();
        goomba9.set_x (6000);
        goomba9.set_y (721);
        
        goomba10 = new Goomba ();
        goomba10.set_x (6075);
        goomba10.set_y (721);
        
        goomba11 = new Goomba ();
        goomba11.set_x (6200);
        goomba11.set_y (721);
        
        goomba12 = new Goomba ();
        goomba12.set_x (6275);
        goomba12.set_y (721);
        
        goomba13 = new Goomba ();
        goomba13.set_x (8317);
        goomba13.set_y (721);
        
        goomba14 = new Goomba ();
        goomba14.set_x (8400);
        goomba14.set_y (721);
        
        goombas.add (goomba1); goombas.add (goomba2); goombas.add (goomba3); goombas.add (goomba4); goombas.add (goomba5); goombas.add (goomba6); 
        goombas.add (goomba7); goombas.add (goomba8); goombas.add (goomba9); goombas.add (goomba10); goombas.add (goomba11);
        goombas.add (goomba12); goombas.add (goomba13); goombas.add (goomba14);
        all_enemies.addAll (goombas);
        }
    
    public void init_koopa ()
        {
        koopa = new Koopa ();
        koopa.set_x (5500);
        koopa.set_y (709);
        
        koopas.add (koopa);
        all_enemies.addAll (koopas);
        }
    
    public void draw_graphics (Graphics2D graphics)
        {
        if (floor_partition1.get_x () <= 1250 && floor_partition1.get_x () >= -(int)(floor_partition1.get_floor_image (1).getWidth (null) / floor_scale_rate))
            graphics.drawImage (floor_partition1.get_floor_image (1), floor_partition1.get_x (), floor_partition1.get_y (), (int)(floor_partition1.get_floor_image (1).getWidth (null) / floor_scale_rate), (int)(floor_partition1.get_floor_image (1).getHeight (null) / floor_scale_rate), null);
        
        if (floor_partition2.get_x () <= 1250 && floor_partition2.get_x () >= -(int)(floor_partition2.get_floor_image (2).getWidth (null) / floor_scale_rate))
            graphics.drawImage (floor_partition2.get_floor_image (2), floor_partition2.get_x (), floor_partition2.get_y (), (int)(floor_partition2.get_floor_image (2).getWidth (null) / floor_scale_rate), (int)(floor_partition2.get_floor_image (2).getHeight (null) / floor_scale_rate), null);
        
        if (floor_partition3.get_x () <= 1250 && floor_partition3.get_x () >= -(int)(floor_partition3.get_floor_image (3).getWidth (null) / floor_scale_rate))
            graphics.drawImage (floor_partition3.get_floor_image (3), floor_partition3.get_x (), floor_partition3.get_y (), (int)(floor_partition3.get_floor_image (3).getWidth (null) / floor_scale_rate), (int)(floor_partition3.get_floor_image (3).getHeight (null) / floor_scale_rate), null);
        
        if (floor_partition4.get_x () <= 1250 && floor_partition4.get_x () >= -(int)(floor_partition4.get_floor_image (4).getWidth (null) / floor_scale_rate));
            graphics.drawImage (floor_partition4.get_floor_image (4), floor_partition4.get_x (), floor_partition4.get_y (), (int)(floor_partition4.get_floor_image (4).getWidth (null) / floor_scale_rate), (int)(floor_partition4.get_floor_image (4).getHeight (null) / floor_scale_rate), null);
        
        if (big_hill1.get_x () <= 1250 && big_hill1.get_x () >= -big_hill1.get_decorative_image (1).getWidth (null) * decoration_scale_rate)
            graphics.drawImage (big_hill1.get_decorative_image     (1), big_hill1.get_x (),      big_hill1.get_y (),     big_hill1.get_decorative_image     (1).getWidth (null) * decoration_scale_rate, big_hill1.get_decorative_image     (1).getHeight (null) * decoration_scale_rate, null);
        
        if (little_cloud1.get_x () <= 1250 && little_cloud1.get_x () >= -little_cloud1.get_decorative_image (8).getWidth (null) * decoration_scale_rate)
            graphics.drawImage (little_cloud1.get_decorative_image (8), little_cloud1.get_x (),  little_cloud1.get_y (), little_cloud1.get_decorative_image (8).getWidth (null) * decoration_scale_rate, little_cloud1.get_decorative_image (8).getHeight (null) * decoration_scale_rate, null);
        
        if (big_bush1.get_x () <= 1250 && big_bush1.get_x () >= -big_bush1.get_decorative_image (3).getWidth (null) * decoration_scale_rate)
            graphics.drawImage (big_bush1.get_decorative_image     (3), big_bush1.get_x (),      big_bush1.get_y (),     big_bush1.get_decorative_image     (3).getWidth (null) * decoration_scale_rate, big_bush1.get_decorative_image     (3).getHeight (null) * decoration_scale_rate, null);
        
        if (little_hill1.get_x () <= 1250 && little_hill1.get_x () >= -little_hill1.get_decorative_image (2).getWidth (null) * decoration_scale_rate)
            graphics.drawImage (little_hill1.get_decorative_image  (2), little_hill1.get_x (),   little_hill1.get_y (),  little_hill1.get_decorative_image  (2).getWidth (null) * decoration_scale_rate, little_hill1.get_decorative_image  (2).getHeight (null) * decoration_scale_rate, null);
        
        if (little_cloud2.get_x () <= 1250 && little_cloud2.get_x () >= -little_cloud2.get_decorative_image (8).getWidth (null) * decoration_scale_rate)
            graphics.drawImage (little_cloud2.get_decorative_image (8), little_cloud2.get_x (),  little_cloud2.get_y (), little_cloud2.get_decorative_image (8).getWidth (null) * decoration_scale_rate, little_cloud2.get_decorative_image (8).getHeight (null) * decoration_scale_rate, null);
        
        if (little_bush1.get_x () <= 1250 && little_bush1.get_x () >= -little_bush1.get_decorative_image (5).getWidth (null) * decoration_scale_rate)
            graphics.drawImage (little_bush1.get_decorative_image  (5), little_bush1.get_x (),   little_bush1.get_y (),  little_bush1.get_decorative_image  (5).getWidth (null) * decoration_scale_rate, little_bush1.get_decorative_image  (5).getHeight (null) * decoration_scale_rate, null);
        
        if (big_cloud1.get_x () <= 1250 && big_cloud1.get_x () >= -big_cloud1.get_decorative_image (6).getWidth (null) * decoration_scale_rate)
            graphics.drawImage (big_cloud1.get_decorative_image    (6), big_cloud1.get_x (),     big_cloud1.get_y (),    big_cloud1.get_decorative_image    (6).getWidth (null) * decoration_scale_rate, big_cloud1.get_decorative_image    (6).getHeight (null) * decoration_scale_rate, null);
        
        if (mid_cloud1.get_x () <= 1250 && mid_cloud1.get_x () >= -mid_cloud1.get_decorative_image (7).getWidth (null) * decoration_scale_rate)
            graphics.drawImage (mid_cloud1.get_decorative_image    (7), mid_cloud1.get_x (),     mid_cloud1.get_y (),    mid_cloud1.get_decorative_image    (7).getWidth (null) * decoration_scale_rate, mid_cloud1.get_decorative_image    (7).getHeight (null) * decoration_scale_rate, null);
        
        if (mid_bush1.get_x () <= 1250 && mid_bush1.get_x () >= -mid_bush1.get_decorative_image (4).getWidth (null) * decoration_scale_rate)
            graphics.drawImage (mid_bush1.get_decorative_image     (4), mid_bush1.get_x (),      mid_bush1.get_y (),     mid_cloud1.get_decorative_image    (4).getWidth (null) * decoration_scale_rate, mid_bush1.get_decorative_image     (4).getHeight (null) * decoration_scale_rate, null);
        
        if (big_hill2.get_x () <= 1250 && big_hill2.get_x () >= -big_hill2.get_decorative_image (1).getWidth (null) * decoration_scale_rate)
            graphics.drawImage (big_hill2.get_decorative_image     (1), big_hill2.get_x (),      big_hill2.get_y (),     big_hill2.get_decorative_image     (1).getWidth (null) * decoration_scale_rate, big_hill2.get_decorative_image     (1).getHeight (null) * decoration_scale_rate, null);
        
        if (little_cloud3.get_x () <= 1250 && little_cloud3.get_x () >= -little_cloud3.get_decorative_image (8).getWidth (null) * decoration_scale_rate)
            graphics.drawImage (little_cloud3.get_decorative_image (8), little_cloud3.get_x (),  little_cloud3.get_y (), little_cloud3.get_decorative_image (8).getWidth (null) * decoration_scale_rate, little_cloud3.get_decorative_image (8).getHeight (null) * decoration_scale_rate, null);
        
        if (big_bush2.get_x () <= 1250 && big_bush2.get_x () >= -big_bush2.get_decorative_image (3).getWidth (null) * decoration_scale_rate)
            graphics.drawImage (big_bush2.get_decorative_image     (3), big_bush2.get_x (),      big_bush2.get_y (),     big_bush2.get_decorative_image     (3).getWidth (null) * decoration_scale_rate, big_bush2.get_decorative_image     (3).getHeight (null) * decoration_scale_rate, null);
        
        if (little_hill2.get_x () <= 1250 && little_hill2.get_x () >= -little_hill2.get_decorative_image (2).getWidth (null) * decoration_scale_rate)
            graphics.drawImage (little_hill2.get_decorative_image  (2), little_hill2.get_x (),   little_hill2.get_y (),  little_hill2.get_decorative_image  (2).getWidth (null) * decoration_scale_rate, little_hill2.get_decorative_image  (2).getHeight (null) * decoration_scale_rate, null);
        
        if (little_cloud4.get_x () <= 1250 && little_cloud4.get_x () >= -little_cloud4.get_decorative_image (8).getWidth (null) * decoration_scale_rate)
            graphics.drawImage (little_cloud4.get_decorative_image (8), little_cloud4.get_x (),  little_cloud4.get_y (), little_cloud4.get_decorative_image (8).getWidth (null) * decoration_scale_rate, little_cloud4.get_decorative_image (8).getHeight (null) * decoration_scale_rate, null);
        
        if (little_bush2.get_x () <= 1250 && little_bush2.get_x () >= -little_bush2.get_decorative_image (5).getWidth (null) * decoration_scale_rate)
            graphics.drawImage (little_bush2.get_decorative_image  (5), little_bush2.get_x (),   little_bush2.get_y (),  little_bush2.get_decorative_image  (5).getWidth (null) * decoration_scale_rate, little_bush2.get_decorative_image  (5).getHeight (null) * decoration_scale_rate, null);
        
        if (big_cloud2.get_x () <= 1250 && big_cloud2.get_x () >= -big_cloud2.get_decorative_image (6).getWidth (null) * decoration_scale_rate)
            graphics.drawImage (big_cloud2.get_decorative_image    (6), big_cloud2.get_x (),     big_cloud2.get_y (),    big_cloud2.get_decorative_image    (6).getWidth (null) * decoration_scale_rate, big_cloud2.get_decorative_image    (6).getHeight (null) * decoration_scale_rate, null);
        
        if (mid_cloud2.get_x () <= 1250 && mid_cloud2.get_x () >= -mid_cloud2.get_decorative_image (7).getWidth (null) * decoration_scale_rate)
            graphics.drawImage (mid_cloud2.get_decorative_image    (7), mid_cloud2.get_x (),     mid_cloud2.get_y (),    mid_cloud2.get_decorative_image    (7).getWidth (null) * decoration_scale_rate, mid_cloud2.get_decorative_image    (7).getHeight (null) * decoration_scale_rate, null);
        
        if (mid_bush2.get_x () <= 1250 && mid_bush2.get_x () >= -mid_bush2.get_decorative_image (4).getWidth (null) * decoration_scale_rate)
            graphics.drawImage (mid_bush2.get_decorative_image     (4), mid_bush2.get_x (),      mid_bush2.get_y (),     mid_cloud2.get_decorative_image    (4).getWidth (null) * decoration_scale_rate, mid_bush2.get_decorative_image     (4).getHeight (null) * decoration_scale_rate, null);
        
        if (big_hill3.get_x () <= 1250 && big_hill3.get_x () >= -big_hill3.get_decorative_image (1).getWidth (null) * decoration_scale_rate)
            graphics.drawImage (big_hill3.get_decorative_image     (1), big_hill3.get_x (),      big_hill3.get_y (),     big_hill3.get_decorative_image     (1).getWidth (null) * decoration_scale_rate, big_hill3.get_decorative_image     (1).getHeight (null) * decoration_scale_rate, null);
        
        if (little_cloud5.get_x () <= 1250 && little_cloud5.get_x () >= -little_cloud5.get_decorative_image (8).getWidth (null) * decoration_scale_rate)
            graphics.drawImage (little_cloud5.get_decorative_image (8), little_cloud5.get_x (),  little_cloud5.get_y (), little_cloud5.get_decorative_image (8).getWidth (null) * decoration_scale_rate, little_cloud5.get_decorative_image (8).getHeight (null) * decoration_scale_rate, null);
        
        if (big_bush3.get_x () <= 1250 && big_bush3.get_x () >= -big_bush3.get_decorative_image (3).getWidth (null) * decoration_scale_rate)
            graphics.drawImage (big_bush3.get_decorative_image     (3), big_bush3.get_x (),      big_bush3.get_y (),     big_bush3.get_decorative_image     (3).getWidth (null) * decoration_scale_rate, big_bush3.get_decorative_image     (3).getHeight (null) * decoration_scale_rate, null);
        
        if (little_hill3.get_x () <= 1250 && little_hill3.get_x () >= -little_hill3.get_decorative_image (2).getWidth (null) * decoration_scale_rate)
            graphics.drawImage (little_hill3.get_decorative_image  (2), little_hill3.get_x (),   little_hill3.get_y (),  little_hill3.get_decorative_image  (2).getWidth (null) * decoration_scale_rate, little_hill3.get_decorative_image  (2).getHeight (null) * decoration_scale_rate, null);
        
        if (little_cloud6.get_x () <= 1250 && little_cloud6.get_x () >= -little_cloud6.get_decorative_image (8).getWidth (null) * decoration_scale_rate)
            graphics.drawImage (little_cloud6.get_decorative_image (8), little_cloud6.get_x (),  little_cloud6.get_y (), little_cloud6.get_decorative_image (8).getWidth (null) * decoration_scale_rate, little_cloud6.get_decorative_image (8).getHeight (null) * decoration_scale_rate, null);
        
        if (little_bush3.get_x () <= 1250 && little_bush3.get_x () >= -little_bush3.get_decorative_image (5).getWidth (null) * decoration_scale_rate)
            graphics.drawImage (little_bush3.get_decorative_image  (5), little_bush3.get_x (),   little_bush3.get_y (),  little_bush3.get_decorative_image  (5).getWidth (null) * decoration_scale_rate, little_bush3.get_decorative_image  (5).getHeight (null) * decoration_scale_rate, null);
        
        if (big_cloud3.get_x () <= 1250 && big_cloud3.get_x () >= -big_cloud3.get_decorative_image (6).getWidth (null) * decoration_scale_rate)
            graphics.drawImage (big_cloud3.get_decorative_image    (6), big_cloud3.get_x (),     big_cloud3.get_y (),    big_cloud3.get_decorative_image    (6).getWidth (null) * decoration_scale_rate, big_cloud3.get_decorative_image    (6).getHeight (null) * decoration_scale_rate, null);
        
        if (mid_cloud3.get_x () <= 1250 && mid_cloud3.get_x () >= -mid_cloud3.get_decorative_image (7).getWidth (null) * decoration_scale_rate)
            graphics.drawImage (mid_cloud3.get_decorative_image    (7), mid_cloud3.get_x (),     mid_cloud3.get_y (),    mid_cloud3.get_decorative_image    (7).getWidth (null) * decoration_scale_rate, mid_cloud3.get_decorative_image    (7).getHeight (null) * decoration_scale_rate, null);
        
        if (mid_bush3.get_x () <= 1250 && mid_bush3.get_x () >= -mid_bush3.get_decorative_image (4).getWidth (null) * decoration_scale_rate)
            graphics.drawImage (mid_bush3.get_decorative_image     (4), mid_bush3.get_x (),      mid_bush3.get_y (),     mid_cloud2.get_decorative_image    (4).getWidth (null) * decoration_scale_rate, mid_bush3.get_decorative_image     (4).getHeight (null) * decoration_scale_rate, null);
        
        if (big_hill4.get_x () <= 1250 && big_hill4.get_x () >= -big_hill4.get_decorative_image (1).getWidth (null) * decoration_scale_rate)
            graphics.drawImage (big_hill4.get_decorative_image     (1), big_hill4.get_x (),      big_hill4.get_y (),     big_hill4.get_decorative_image     (1).getWidth (null) * decoration_scale_rate, big_hill4.get_decorative_image     (1).getHeight (null) * decoration_scale_rate, null);
        
        if (little_cloud7.get_x () <= 1250 && little_cloud7.get_x () >= -little_cloud7.get_decorative_image (8).getWidth (null) * decoration_scale_rate)
            graphics.drawImage (little_cloud7.get_decorative_image (8), little_cloud7.get_x (),  little_cloud7.get_y (), little_cloud7.get_decorative_image (8).getWidth (null) * decoration_scale_rate, little_cloud7.get_decorative_image (8).getHeight (null) * decoration_scale_rate, null);
        
        if (little_hill4.get_x () <= 1250 && little_hill4.get_x () >= -little_hill4.get_decorative_image (2).getWidth (null) * decoration_scale_rate)
            graphics.drawImage (little_hill4.get_decorative_image  (2), little_hill4.get_x (),   little_hill4.get_y (),  little_hill4.get_decorative_image  (2).getWidth (null) * decoration_scale_rate, little_hill4.get_decorative_image  (2).getHeight (null) * decoration_scale_rate, null);
        
        if (little_cloud8.get_x () <= 1250 && little_cloud8.get_x () >= -little_cloud8.get_decorative_image (8).getWidth (null) * decoration_scale_rate)
            graphics.drawImage (little_cloud8.get_decorative_image (8), little_cloud8.get_x (),  little_cloud8.get_y (), little_cloud8.get_decorative_image (8).getWidth (null) * decoration_scale_rate, little_cloud8.get_decorative_image (8).getHeight (null) * decoration_scale_rate, null);
        
        if (little_bush4.get_x () <= 1250 && little_bush4.get_x () >= -little_bush4.get_decorative_image (5).getWidth (null) * decoration_scale_rate)
            graphics.drawImage (little_bush4.get_decorative_image  (5), little_bush4.get_x (),   little_bush4.get_y (),  little_bush4.get_decorative_image  (5).getWidth (null) * decoration_scale_rate, little_bush4.get_decorative_image  (5).getHeight (null) * decoration_scale_rate, null);
        
        if (big_cloud4.get_x () <= 1250 && big_cloud4.get_x () >= -big_cloud4.get_decorative_image (6).getWidth (null) * decoration_scale_rate)
            graphics.drawImage (big_cloud4.get_decorative_image    (6), big_cloud4.get_x (),     big_cloud4.get_y (),    big_cloud4.get_decorative_image    (6).getWidth (null) * decoration_scale_rate, big_cloud4.get_decorative_image    (6).getHeight (null) * decoration_scale_rate, null);
        
        if (mid_cloud4.get_x () <= 1250 && mid_cloud4.get_x () >= -mid_cloud4.get_decorative_image (7).getWidth (null) * decoration_scale_rate)
            graphics.drawImage (mid_cloud4.get_decorative_image    (7), mid_cloud4.get_x (),     mid_cloud4.get_y (),    mid_cloud4.get_decorative_image    (7).getWidth (null) * decoration_scale_rate, mid_cloud4.get_decorative_image    (7).getHeight (null) * decoration_scale_rate, null);
        
        if (big_hill5.get_x () <= 1250 && big_hill5.get_x () >= -big_hill5.get_decorative_image (1).getWidth (null) * decoration_scale_rate)
            graphics.drawImage (big_hill5.get_decorative_image     (1), big_hill5.get_x (),      big_hill5.get_y (),     big_hill5.get_decorative_image     (1).getWidth (null) * decoration_scale_rate, big_hill5.get_decorative_image     (1).getHeight (null) * decoration_scale_rate, null);
        
        if (little_cloud9.get_x () <= 1250 && little_cloud9.get_x () >= -little_cloud9.get_decorative_image (8).getWidth (null) * decoration_scale_rate)
            graphics.drawImage (little_cloud9.get_decorative_image (8), little_cloud9.get_x (),  little_cloud9.get_y (), little_cloud9.get_decorative_image (8).getWidth (null) * decoration_scale_rate, little_cloud9.get_decorative_image (8).getHeight (null) * decoration_scale_rate, null);
        
        if (little_hill5.get_x () <= 1250 && little_hill5.get_x () >= -little_hill5.get_decorative_image (2).getWidth (null) * decoration_scale_rate)
            graphics.drawImage (little_hill5.get_decorative_image  (2), little_hill5.get_x (),   little_hill5.get_y (),  little_hill5.get_decorative_image  (2).getWidth (null) * decoration_scale_rate, little_hill5.get_decorative_image  (2).getHeight (null) * decoration_scale_rate, null);
        
        
        
        

        if (question_block1.get_x () <=1250 && question_block1.get_x () >= -(int)(question_block1.get_block_image ().getImage ().getWidth (null) / block_scale_rate))
            graphics.drawImage (question_block1.get_block_image ().getImage  (), question_block1.get_x (), question_block1.get_y (), (int)(question_block1.get_block_image ().getImage ().getWidth (null) / block_scale_rate), (int)(question_block1.get_block_image ().getImage ().getHeight (null) / block_scale_rate), null);
        
        if (question_block2.get_x () <=1250 && question_block2.get_x () >= -(int)(question_block2.get_block_image ().getImage ().getWidth (null) / block_scale_rate))
            graphics.drawImage (question_block2.get_block_image ().getImage  (), question_block2.get_x (), question_block2.get_y (), (int)(question_block2.get_block_image ().getImage ().getWidth (null) / block_scale_rate), (int)(question_block2.get_block_image ().getImage ().getHeight (null) / block_scale_rate), null);
        
        if (question_block3.get_x () <=1250 && question_block3.get_x () >= -(int)(question_block3.get_block_image ().getImage ().getWidth (null) / block_scale_rate))
             graphics.drawImage (question_block3.get_block_image ().getImage  (), question_block3.get_x (), question_block3.get_y (), (int)(question_block3.get_block_image ().getImage ().getWidth (null) / block_scale_rate), (int)(question_block3.get_block_image ().getImage ().getHeight (null) / block_scale_rate), null);
        
        if (question_block4.get_x () <=1250 && question_block4.get_x () >= -(int)(question_block4.get_block_image ().getImage ().getWidth (null) / block_scale_rate))
             graphics.drawImage (question_block4.get_block_image ().getImage  (), question_block4.get_x (), question_block4.get_y (), (int)(question_block4.get_block_image ().getImage ().getWidth (null) / block_scale_rate), (int)(question_block4.get_block_image ().getImage ().getHeight (null) / block_scale_rate), null);
        
        if (question_block5.get_x () <=1250 && question_block5.get_x () >= -(int)(question_block5.get_block_image ().getImage ().getWidth (null) / block_scale_rate))
             graphics.drawImage (question_block5.get_block_image ().getImage  (), question_block5.get_x (), question_block5.get_y (), (int)(question_block5.get_block_image ().getImage ().getWidth (null) / block_scale_rate), (int)(question_block5.get_block_image ().getImage ().getHeight (null) / block_scale_rate), null);
        
        if (question_block6.get_x () <=1250 && question_block6.get_x () >= -(int)(question_block6.get_block_image ().getImage ().getWidth (null) / block_scale_rate))
             graphics.drawImage (question_block6.get_block_image ().getImage  (), question_block6.get_x (), question_block6.get_y (), (int)(question_block6.get_block_image ().getImage ().getWidth (null) / block_scale_rate), (int)(question_block6.get_block_image ().getImage ().getHeight (null) / block_scale_rate), null);
        
        if (question_block7.get_x () <=1250 && question_block7.get_x () >= -(int)(question_block7.get_block_image ().getImage ().getWidth (null) / block_scale_rate))
             graphics.drawImage (question_block7.get_block_image ().getImage  (), question_block7.get_x (), question_block7.get_y (), (int)(question_block7.get_block_image ().getImage ().getWidth (null) / block_scale_rate), (int)(question_block7.get_block_image ().getImage ().getHeight (null) / block_scale_rate), null);
        
        if (question_block8.get_x () <=1250 && question_block8.get_x () >= -(int)(question_block8.get_block_image ().getImage ().getWidth (null) / block_scale_rate))
             graphics.drawImage (question_block8.get_block_image ().getImage  (), question_block8.get_x (), question_block8.get_y (), (int)(question_block8.get_block_image ().getImage ().getWidth (null) / block_scale_rate), (int)(question_block8.get_block_image ().getImage ().getHeight (null) / block_scale_rate), null);
        
        if (question_block9.get_x () <=1250 && question_block9.get_x () >= -(int)(question_block9.get_block_image ().getImage ().getWidth (null) / block_scale_rate))
             graphics.drawImage (question_block9.get_block_image ().getImage  (), question_block9.get_x (), question_block9.get_y (), (int)(question_block9.get_block_image ().getImage ().getWidth (null) / block_scale_rate), (int)(question_block9.get_block_image ().getImage ().getHeight (null) / block_scale_rate), null);
        
        if (question_block10.get_x () <=1250 && question_block10.get_x () >= -(int)(question_block10.get_block_image ().getImage ().getWidth (null) / block_scale_rate))
             graphics.drawImage (question_block10.get_block_image ().getImage  (), question_block10.get_x (), question_block10.get_y (), (int)(question_block10.get_block_image ().getImage ().getWidth (null) / block_scale_rate), (int)(question_block10.get_block_image ().getImage ().getHeight (null) / block_scale_rate), null);
        
        if (question_block11.get_x () <=1250 && question_block11.get_x () >= -(int)(question_block11.get_block_image ().getImage ().getWidth (null) / block_scale_rate))
             graphics.drawImage (question_block11.get_block_image ().getImage  (), question_block11.get_x (), question_block11.get_y (), (int)(question_block11.get_block_image ().getImage ().getWidth (null) / block_scale_rate), (int)(question_block11.get_block_image ().getImage ().getHeight (null) / block_scale_rate), null);
        
        if (question_block12.get_x () <=1250 && question_block12.get_x () >= -(int)(question_block12.get_block_image ().getImage ().getWidth (null) / block_scale_rate))
            graphics.drawImage (question_block12.get_block_image ().getImage  (), question_block12.get_x (), question_block12.get_y (), (int)(question_block12.get_block_image ().getImage ().getWidth (null) / block_scale_rate), (int)(question_block12.get_block_image ().getImage ().getHeight (null) / block_scale_rate), null);
        
        if (question_block13.get_x () <=1250 && question_block13.get_x () >= -(int)(question_block13.get_block_image ().getImage ().getWidth (null) / block_scale_rate))
             graphics.drawImage (question_block13.get_block_image ().getImage  (), question_block13.get_x (), question_block13.get_y (), (int)(question_block13.get_block_image ().getImage ().getWidth (null) / block_scale_rate), (int)(question_block13.get_block_image ().getImage ().getHeight (null) / block_scale_rate), null);


        
        
        
        if (regular_block1.get_x () <= 1250 && regular_block1.get_x () >= -(int)(regular_block1.get_block_image ().getImage ().getWidth (null) / block_scale_rate))
            graphics.drawImage (regular_block1.get_block_image ().getImage  (), regular_block1.get_x (), regular_block1.get_y (), (int)(regular_block1.get_block_image ().getImage ().getWidth (null) / block_scale_rate), (int)(regular_block1.get_block_image ().getImage ().getHeight (null) / block_scale_rate), null);

        if (regular_block2.get_x () <= 1250 && regular_block2.get_x () >= -(int)(regular_block2.get_block_image ().getImage ().getWidth (null) / block_scale_rate))
            graphics.drawImage (regular_block2.get_block_image ().getImage  (), regular_block2.get_x (), regular_block2.get_y (), (int)(regular_block2.get_block_image ().getImage ().getWidth (null) / block_scale_rate), (int)(regular_block2.get_block_image ().getImage ().getHeight (null) / block_scale_rate), null);

        if (regular_block3.get_x () <= 1250 && regular_block3.get_x () >= -(int)(regular_block3.get_block_image ().getImage ().getWidth (null) / block_scale_rate))
            graphics.drawImage (regular_block3.get_block_image ().getImage  (), regular_block3.get_x (), regular_block3.get_y (), (int)(regular_block3.get_block_image ().getImage ().getWidth (null) / block_scale_rate), (int)(regular_block3.get_block_image ().getImage ().getHeight (null) / block_scale_rate), null);

        if (regular_block4.get_x () <= 1250 && regular_block4.get_x () >= -(int)(regular_block4.get_block_image ().getImage ().getWidth (null) / block_scale_rate))
            graphics.drawImage (regular_block4.get_block_image ().getImage  (), regular_block4.get_x (), regular_block4.get_y (), (int)(regular_block4.get_block_image ().getImage ().getWidth (null) / block_scale_rate), (int)(regular_block4.get_block_image ().getImage ().getHeight (null) / block_scale_rate), null);

        if (regular_block5.get_x () <= 1250 && regular_block5.get_x () >= -(int)(regular_block5.get_block_image ().getImage ().getWidth (null) / block_scale_rate))
            graphics.drawImage (regular_block5.get_block_image ().getImage  (), regular_block5.get_x (), regular_block5.get_y (), (int)(regular_block5.get_block_image ().getImage ().getWidth (null) / block_scale_rate), (int)(regular_block5.get_block_image ().getImage ().getHeight (null) / block_scale_rate), null);

        if (regular_block6.get_x () <= 1250 && regular_block6.get_x () >= -(int)(regular_block6.get_block_image ().getImage ().getWidth (null) / block_scale_rate))
            graphics.drawImage (regular_block6.get_block_image ().getImage  (), regular_block6.get_x (), regular_block6.get_y (), (int)(regular_block6.get_block_image ().getImage ().getWidth (null) / block_scale_rate), (int)(regular_block6.get_block_image ().getImage ().getHeight (null) / block_scale_rate), null);

        if (regular_block7.get_x () <= 1250 && regular_block7.get_x () >= -(int)(regular_block7.get_block_image ().getImage ().getWidth (null) / block_scale_rate))
            graphics.drawImage (regular_block7.get_block_image ().getImage  (), regular_block7.get_x (), regular_block7.get_y (), (int)(regular_block7.get_block_image ().getImage ().getWidth (null) / block_scale_rate), (int)(regular_block7.get_block_image ().getImage ().getHeight (null) / block_scale_rate), null);

        if (regular_block8.get_x () <= 1250 && regular_block8.get_x () >= -(int)(regular_block8.get_block_image ().getImage ().getWidth (null) / block_scale_rate))
            graphics.drawImage (regular_block8.get_block_image ().getImage  (), regular_block8.get_x (), regular_block8.get_y (), (int)(regular_block8.get_block_image ().getImage ().getWidth (null) / block_scale_rate), (int)(regular_block8.get_block_image ().getImage ().getHeight (null) / block_scale_rate), null);

        if (regular_block9.get_x () <= 1250 && regular_block9.get_x () >= -(int)(regular_block9.get_block_image ().getImage ().getWidth (null) / block_scale_rate))
            graphics.drawImage (regular_block9.get_block_image ().getImage  (), regular_block9.get_x (), regular_block9.get_y (), (int)(regular_block9.get_block_image ().getImage ().getWidth (null) / block_scale_rate), (int)(regular_block9.get_block_image ().getImage ().getHeight (null) / block_scale_rate), null);

        if (regular_block10.get_x () <= 1250 && regular_block10.get_x () >= -(int)(regular_block10.get_block_image ().getImage ().getWidth (null) / block_scale_rate))
            graphics.drawImage (regular_block10.get_block_image ().getImage  (), regular_block10.get_x (), regular_block10.get_y (), (int)(regular_block10.get_block_image ().getImage ().getWidth (null) / block_scale_rate), (int)(regular_block10.get_block_image ().getImage ().getHeight (null) / block_scale_rate), null);

        if (regular_block11.get_x () <= 1250 && regular_block11.get_x () >= -(int)(regular_block11.get_block_image ().getImage ().getWidth (null) / block_scale_rate))
            graphics.drawImage (regular_block11.get_block_image ().getImage  (), regular_block11.get_x (), regular_block11.get_y (), (int)(regular_block11.get_block_image ().getImage ().getWidth (null) / block_scale_rate), (int)(regular_block11.get_block_image ().getImage ().getHeight (null) / block_scale_rate), null);

        if (regular_block12.get_x () <= 1250 && regular_block12.get_x () >= -(int)(regular_block12.get_block_image ().getImage ().getWidth (null) / block_scale_rate))
            graphics.drawImage (regular_block12.get_block_image ().getImage  (), regular_block12.get_x (), regular_block12.get_y (), (int)(regular_block12.get_block_image ().getImage ().getWidth (null) / block_scale_rate), (int)(regular_block12.get_block_image ().getImage ().getHeight (null) / block_scale_rate), null);

        if (regular_block13.get_x () <= 1250 && regular_block13.get_x () >= -(int)(regular_block13.get_block_image ().getImage ().getWidth (null) / block_scale_rate))
            graphics.drawImage (regular_block13.get_block_image ().getImage  (), regular_block13.get_x (), regular_block13.get_y (), (int)(regular_block13.get_block_image ().getImage ().getWidth (null) / block_scale_rate), (int)(regular_block13.get_block_image ().getImage ().getHeight (null) / block_scale_rate), null);

        if (regular_block14.get_x () <= 1250 && regular_block14.get_x () >= -(int)(regular_block14.get_block_image ().getImage ().getWidth (null) / block_scale_rate))
            graphics.drawImage (regular_block14.get_block_image ().getImage  (), regular_block14.get_x (), regular_block14.get_y (), (int)(regular_block14.get_block_image ().getImage ().getWidth (null) / block_scale_rate), (int)(regular_block14.get_block_image ().getImage ().getHeight (null) / block_scale_rate), null);

        if (regular_block15.get_x () <= 1250 && regular_block15.get_x () >= -(int)(regular_block15.get_block_image ().getImage ().getWidth (null) / block_scale_rate))
            graphics.drawImage (regular_block15.get_block_image ().getImage  (), regular_block15.get_x (), regular_block15.get_y (), (int)(regular_block15.get_block_image ().getImage ().getWidth (null) / block_scale_rate), (int)(regular_block15.get_block_image ().getImage ().getHeight (null) / block_scale_rate), null);

        if (regular_block16.get_x () <= 1250 && regular_block16.get_x () >= -(int)(regular_block16.get_block_image ().getImage ().getWidth (null) / block_scale_rate))
            graphics.drawImage (regular_block16.get_block_image ().getImage  (), regular_block16.get_x (), regular_block16.get_y (), (int)(regular_block16.get_block_image ().getImage ().getWidth (null) / block_scale_rate), (int)(regular_block16.get_block_image ().getImage ().getHeight (null) / block_scale_rate), null);

        if (regular_block17.get_x () <= 1250 && regular_block17.get_x () >= -(int)(regular_block17.get_block_image ().getImage ().getWidth (null) / block_scale_rate))
            graphics.drawImage (regular_block17.get_block_image ().getImage  (), regular_block17.get_x (), regular_block17.get_y (), (int)(regular_block17.get_block_image ().getImage ().getWidth (null) / block_scale_rate), (int)(regular_block17.get_block_image ().getImage ().getHeight (null) / block_scale_rate), null);

        if (regular_block18.get_x () <= 1250 && regular_block18.get_x () >= -(int)(regular_block18.get_block_image ().getImage ().getWidth (null) / block_scale_rate))
            graphics.drawImage (regular_block18.get_block_image ().getImage  (), regular_block18.get_x (), regular_block18.get_y (), (int)(regular_block18.get_block_image ().getImage ().getWidth (null) / block_scale_rate), (int)(regular_block18.get_block_image ().getImage ().getHeight (null) / block_scale_rate), null);

        if (regular_block19.get_x () <= 1250 && regular_block19.get_x () >= -(int)(regular_block19.get_block_image ().getImage ().getWidth (null) / block_scale_rate))
            graphics.drawImage (regular_block19.get_block_image ().getImage  (), regular_block19.get_x (), regular_block19.get_y (), (int)(regular_block19.get_block_image ().getImage ().getWidth (null) / block_scale_rate), (int)(regular_block19.get_block_image ().getImage ().getHeight (null) / block_scale_rate), null);

        if (regular_block20.get_x () <= 1250 && regular_block20.get_x () >= -(int)(regular_block20.get_block_image ().getImage ().getWidth (null) / block_scale_rate))
            graphics.drawImage (regular_block20.get_block_image ().getImage  (), regular_block20.get_x (), regular_block20.get_y (), (int)(regular_block20.get_block_image ().getImage ().getWidth (null) / block_scale_rate), (int)(regular_block20.get_block_image ().getImage ().getHeight (null) / block_scale_rate), null);

        if (regular_block21.get_x () <= 1250 && regular_block21.get_x () >= -(int)(regular_block21.get_block_image ().getImage ().getWidth (null) / block_scale_rate))
            graphics.drawImage (regular_block21.get_block_image ().getImage  (), regular_block21.get_x (), regular_block21.get_y (), (int)(regular_block21.get_block_image ().getImage ().getWidth (null) / block_scale_rate), (int)(regular_block21.get_block_image ().getImage ().getHeight (null) / block_scale_rate), null);

        if (regular_block22.get_x () <= 1250 && regular_block22.get_x () >= -(int)(regular_block22.get_block_image ().getImage ().getWidth (null) / block_scale_rate))
            graphics.drawImage (regular_block22.get_block_image ().getImage  (), regular_block22.get_x (), regular_block22.get_y (), (int)(regular_block22.get_block_image ().getImage ().getWidth (null) / block_scale_rate), (int)(regular_block22.get_block_image ().getImage ().getHeight (null) / block_scale_rate), null);

        if (regular_block23.get_x () <= 1250 && regular_block23.get_x () >= -(int)(regular_block23.get_block_image ().getImage ().getWidth (null) / block_scale_rate))
            graphics.drawImage (regular_block23.get_block_image ().getImage  (), regular_block23.get_x (), regular_block23.get_y (), (int)(regular_block23.get_block_image ().getImage ().getWidth (null) / block_scale_rate), (int)(regular_block23.get_block_image ().getImage ().getHeight (null) / block_scale_rate), null);

        if (regular_block24.get_x () <= 1250 && regular_block24.get_x () >= -(int)(regular_block24.get_block_image ().getImage ().getWidth (null) / block_scale_rate))
            graphics.drawImage (regular_block24.get_block_image ().getImage  (), regular_block24.get_x (), regular_block24.get_y (), (int)(regular_block24.get_block_image ().getImage ().getWidth (null) / block_scale_rate), (int)(regular_block24.get_block_image ().getImage ().getHeight (null) / block_scale_rate), null);

        if (regular_block25.get_x () <= 1250 && regular_block25.get_x () >= -(int)(regular_block25.get_block_image ().getImage ().getWidth (null) / block_scale_rate))
            graphics.drawImage (regular_block25.get_block_image ().getImage  (), regular_block25.get_x (), regular_block25.get_y (), (int)(regular_block25.get_block_image ().getImage ().getWidth (null) / block_scale_rate), (int)(regular_block25.get_block_image ().getImage ().getHeight (null) / block_scale_rate), null);

        if (regular_block26.get_x () <= 1250 && regular_block26.get_x () >= -(int)(regular_block26.get_block_image ().getImage ().getWidth (null) / block_scale_rate))
            graphics.drawImage (regular_block26.get_block_image ().getImage  (), regular_block26.get_x (), regular_block26.get_y (), (int)(regular_block26.get_block_image ().getImage ().getWidth (null) / block_scale_rate), (int)(regular_block26.get_block_image ().getImage ().getHeight (null) / block_scale_rate), null);

        if (regular_block27.get_x () <= 1250 && regular_block27.get_x () >= -(int)(regular_block27.get_block_image ().getImage ().getWidth (null) / block_scale_rate))
            graphics.drawImage (regular_block27.get_block_image ().getImage  (), regular_block27.get_x (), regular_block27.get_y (), (int)(regular_block27.get_block_image ().getImage ().getWidth (null) / block_scale_rate), (int)(regular_block27.get_block_image ().getImage ().getHeight (null) / block_scale_rate), null);

        if (regular_block28.get_x () <= 1250 && regular_block28.get_x () >= -(int)(regular_block28.get_block_image ().getImage ().getWidth (null) / block_scale_rate))
            graphics.drawImage (regular_block28.get_block_image ().getImage  (), regular_block28.get_x (), regular_block28.get_y (), (int)(regular_block28.get_block_image ().getImage ().getWidth (null) / block_scale_rate), (int)(regular_block28.get_block_image ().getImage ().getHeight (null) / block_scale_rate), null);

        if (regular_block29.get_x () <= 1250 && regular_block29.get_x () >= -(int)(regular_block29.get_block_image ().getImage ().getWidth (null) / block_scale_rate))
            graphics.drawImage (regular_block29.get_block_image ().getImage  (), regular_block29.get_x (), regular_block29.get_y (), (int)(regular_block29.get_block_image ().getImage ().getWidth (null) / block_scale_rate), (int)(regular_block29.get_block_image ().getImage ().getHeight (null) / block_scale_rate), null);

        
//        if (little_pipe1.get_x () <= 1250 && little_pipe1.get_x () >= -(int) (little_pipe1.get_pipe_image (0).getImage ().getWidth (null) / warp_pipe_scale_rate))
            graphics.drawImage (little_pipe1.get_pipe_image (0).getImage (), little_pipe1.get_x (), little_pipe1.get_y (), (int) (little_pipe1.get_pipe_image (0).getImage ().getWidth (null) / warp_pipe_scale_rate), (int) (little_pipe1.get_pipe_image (0).getImage ().getHeight (null) / warp_pipe_scale_rate), null);
        
//        if (mid_pipe1.get_x () <= 1250 && mid_pipe1.get_x () >= -(int) (mid_pipe1.get_pipe_image (1).getImage ().getWidth (null) / warp_pipe_scale_rate))
            graphics.drawImage (mid_pipe1.get_pipe_image (1).getImage (), mid_pipe1.get_x (), mid_pipe1.get_y (), (int) (mid_pipe1.get_pipe_image (1).getImage ().getWidth (null) / warp_pipe_scale_rate), (int) (mid_pipe1.get_pipe_image (1).getImage ().getHeight (null) / warp_pipe_scale_rate), null);
        
//        if (big_pipe1.get_x () <= 1250 && big_pipe1.get_x () >= -(int) (big_pipe1.get_pipe_image (2).getImage ().getWidth (null) / warp_pipe_scale_rate))
            graphics.drawImage (big_pipe1.get_pipe_image (2).getImage (), big_pipe1.get_x (), big_pipe1.get_y (), (int) (big_pipe1.get_pipe_image (2).getImage ().getWidth (null) / warp_pipe_scale_rate), (int) (big_pipe1.get_pipe_image (2).getImage ().getHeight (null) / warp_pipe_scale_rate), null);
        
//        if (big_pipe2.get_x () <= 1250 && big_pipe2.get_x () >= -(int) (big_pipe2.get_pipe_image (2).getImage ().getWidth (null) / warp_pipe_scale_rate))
            graphics.drawImage (big_pipe2.get_pipe_image (2).getImage (), big_pipe2.get_x (), big_pipe2.get_y (), (int) (big_pipe2.get_pipe_image (2).getImage ().getWidth (null) / warp_pipe_scale_rate), (int) (big_pipe2.get_pipe_image (2).getImage ().getHeight (null) / warp_pipe_scale_rate), null);
        
//        if (little_pipe2.get_x () <= 1250 && little_pipe2.get_x () >= -(int) (little_pipe2.get_pipe_image (0).getImage ().getWidth (null) / warp_pipe_scale_rate))
            graphics.drawImage (little_pipe2.get_pipe_image (0).getImage (), little_pipe2.get_x (), little_pipe2.get_y (), (int) (little_pipe2.get_pipe_image (0).getImage ().getWidth (null) / warp_pipe_scale_rate), (int) (little_pipe2.get_pipe_image (0).getImage ().getHeight (null) / warp_pipe_scale_rate), null);
       
//        if (little_pipe3.get_x () <= 1250 && little_pipe3.get_x () >= -(int) (little_pipe3.get_pipe_image (0).getImage ().getWidth (null) / warp_pipe_scale_rate))
            graphics.drawImage (little_pipe3.get_pipe_image (0).getImage (), little_pipe3.get_x (), little_pipe3.get_y (), (int) (little_pipe3.get_pipe_image (0).getImage ().getWidth (null) / warp_pipe_scale_rate), (int) (little_pipe3.get_pipe_image (0).getImage ().getHeight (null) / warp_pipe_scale_rate), null);
        
        
        
        if (left_stairs.get_x () <= 1250 && left_stairs.get_x () >= -(int)(left_stairs.get_stairs_image (0).getImage ().getWidth (null)))
            graphics.drawImage (left_stairs.get_stairs_image (0).getImage (), left_stairs.get_x (), left_stairs.get_y (), (int)(left_stairs.get_stairs_image (0).getImage ().getWidth (null) / stairs_scale_rate), (int)(left_stairs.get_stairs_image (0).getImage ().getHeight (null) / stairs_scale_rate), null);
        
        if (right_stairs1.get_x () <= 1250 && right_stairs1.get_x () >= -(int)(right_stairs1.get_stairs_image (1).getImage ().getWidth (null)))
            graphics.drawImage (right_stairs1.get_stairs_image (1).getImage (), right_stairs1.get_x (), right_stairs1.get_y (), (int)(right_stairs1.get_stairs_image (1).getImage ().getWidth (null) / stairs_scale_rate), (int)(right_stairs1.get_stairs_image (1).getImage ().getHeight (null) / stairs_scale_rate), null);
        
        if (double_stairs.get_x () <= 1250 && double_stairs.get_x () >= -(int)(double_stairs.get_stairs_image (2).getImage ().getWidth (null)))
            graphics.drawImage (double_stairs.get_stairs_image (2).getImage (), double_stairs.get_x (), double_stairs.get_y (), (int)(double_stairs.get_stairs_image (2).getImage ().getWidth (null) / stairs_scale_rate), (int)(double_stairs.get_stairs_image (2).getImage ().getHeight (null) / stairs_scale_rate), null);
            
        if (right_stairs2.get_x () <= 1250 && right_stairs2.get_x () >= -(int)(right_stairs2.get_stairs_image (1).getImage ().getWidth (null)))
            graphics.drawImage (right_stairs2.get_stairs_image (1).getImage (), right_stairs2.get_x (), right_stairs2.get_y (), (int)(right_stairs2.get_stairs_image (1).getImage ().getWidth (null) / stairs_scale_rate), (int)(right_stairs2.get_stairs_image (1).getImage ().getHeight (null) / stairs_scale_rate), null);
        
        if (end_level_stairs.get_x () <= 1250 && end_level_stairs.get_x () >= -(int)(end_level_stairs.get_stairs_image (3).getImage ().getWidth (null)))
            graphics.drawImage (end_level_stairs.get_stairs_image (3).getImage (), end_level_stairs.get_x (), end_level_stairs.get_y (), (int)(end_level_stairs.get_stairs_image (3).getImage ().getWidth (null) / stairs_scale_rate), (int)(end_level_stairs.get_stairs_image (3).getImage ().getHeight (null) / stairs_scale_rate), null);
        

        
        if (castle.get_x () <= 1250 && castle.get_x () >= -(int)(castle.get_decorative_image (9).getWidth (null)))
            graphics.drawImage (castle.get_decorative_image (9), castle.get_x (), castle.get_y (), (int)(castle.get_decorative_image (9).getWidth (null)), (int)(castle.get_decorative_image (9).getHeight (null)), null);
        
        if (flag_pole.get_x () <= 1250 && flag_pole.get_x () >= -(int)(flag_pole.get_decorative_image (10).getWidth (null)))
            graphics.drawImage (flag_pole.get_decorative_image (10), flag_pole.get_x (), flag_pole.get_y (), (int)(flag_pole.get_decorative_image (10).getWidth (null)), (int)(flag_pole.get_decorative_image (10).getHeight (null)), null);
        
        if (flag_pole_flag.get_x () <= 1250 && flag_pole_flag.get_x () >= -(int)(flag_pole_flag.get_decorative_image (11).getWidth (null)))
            graphics.drawImage (flag_pole_flag.get_decorative_image (11), flag_pole_flag.get_x (), flag_pole_flag.get_y (), (int)(flag_pole_flag.get_decorative_image (11).getWidth (null)), (int)(flag_pole_flag.get_decorative_image (11).getHeight (null)), null);
        
        
        
        
        
        if (goomba1.get_x () <= 1250 && goomba1.get_x () >= -(int)(goomba1.get_enemy_image ().getImage ().getWidth (null) / goomba_scale_rate))
            {
            if (!goomba1.walk.isRunning ())
                goomba1.walk.start ();

            graphics.drawImage (goomba1.get_enemy_image ().getImage (), goomba1.get_x (), goomba1.get_y (), (int)(goomba1.get_enemy_image ().getImage ().getWidth (null) / goomba_scale_rate), (int)(goomba1.get_enemy_image ().getImage ().getHeight (null) / goomba_scale_rate), null);
            }

        if (goomba2.get_x () <= 1250 && goomba2.get_x () >= -(int)(goomba2.get_enemy_image ().getImage ().getWidth (null) / goomba_scale_rate))
            {
            if (!goomba2.walk.isRunning ())
                goomba2.walk.start ();
    
            graphics.drawImage (goomba2.get_enemy_image ().getImage (), goomba2.get_x (), goomba2.get_y (), (int)(goomba2.get_enemy_image ().getImage ().getWidth (null) / goomba_scale_rate), (int)(goomba2.get_enemy_image ().getImage ().getHeight (null) / goomba_scale_rate), null);
            }
        else
            {
            goomba2.moving_left = true;
            }
        
        if (goomba3.get_x () <= 1250 && goomba3.get_x () >= -(int)(goomba3.get_enemy_image ().getImage ().getWidth (null) / goomba_scale_rate))
            {
            if (!goomba3.walk.isRunning ())
                goomba3.walk.start ();

            graphics.drawImage (goomba3.get_enemy_image ().getImage (), goomba3.get_x (), goomba3.get_y (), (int)(goomba3.get_enemy_image ().getImage ().getWidth (null) / goomba_scale_rate), (int)(goomba3.get_enemy_image ().getImage ().getHeight (null) / goomba_scale_rate), null);
            }
        else
            {
            goomba3.moving_left = true;
            }

        if (goomba4.get_x () <= 1250 && goomba4.get_x () >= -(int)(goomba4.get_enemy_image ().getImage ().getWidth (null) / goomba_scale_rate))
            {
            if (!goomba4.walk.isRunning ())
                goomba4.walk.start ();

            graphics.drawImage (goomba4.get_enemy_image ().getImage (), goomba4.get_x (), goomba4.get_y (), (int)(goomba4.get_enemy_image ().getImage ().getWidth (null) / goomba_scale_rate), (int)(goomba4.get_enemy_image ().getImage ().getHeight (null) / goomba_scale_rate), null);
            }
        else
            {
            goomba4.moving_left = true;
            }
        
        if (goomba5.get_x () <= 1250 && goomba5.get_x () >= -(int)(goomba5.get_enemy_image ().getImage ().getWidth (null) / goomba_scale_rate))
            {
            if (!goomba5.walk.isRunning ())
                goomba5.walk.start ();

            graphics.drawImage (goomba5.get_enemy_image ().getImage (), goomba5.get_x (), goomba5.get_y (), (int)(goomba5.get_enemy_image ().getImage ().getWidth (null) / goomba_scale_rate), (int)(goomba5.get_enemy_image ().getImage ().getHeight (null) / goomba_scale_rate), null);
            }
        else
            {
            goomba5.moving_left = true;
            }
        
        if (goomba6.get_x () <= 1250 && goomba6.get_x () >= -(int)(goomba6.get_enemy_image ().getImage ().getWidth (null) / goomba_scale_rate))
            {
            if (!goomba6.walk.isRunning ())
                goomba6.walk.start ();

            graphics.drawImage (goomba6.get_enemy_image ().getImage (), goomba6.get_x (), goomba6.get_y (), (int)(goomba6.get_enemy_image ().getImage ().getWidth (null) / goomba_scale_rate), (int)(goomba6.get_enemy_image ().getImage ().getHeight (null) / goomba_scale_rate), null);
            }
        else
            {
            goomba6.moving_left = true;
            }
        
        if (goomba7.get_x () <= 1250 && goomba7.get_x () >= -(int)(goomba7.get_enemy_image ().getImage ().getWidth (null) / goomba_scale_rate))
            {
            if (!goomba7.walk.isRunning ())
                goomba7.walk.start ();

            graphics.drawImage (goomba7.get_enemy_image ().getImage (), goomba7.get_x (), goomba7.get_y (), (int)(goomba7.get_enemy_image ().getImage ().getWidth (null) / goomba_scale_rate), (int)(goomba7.get_enemy_image ().getImage ().getHeight (null) / goomba_scale_rate), null);
            }
        else
            {
            goomba7.moving_left = true;
            }
        
        if (goomba8.get_x () <= 1250 && goomba8.get_x () >= -(int)(goomba8.get_enemy_image ().getImage ().getWidth (null) / goomba_scale_rate))
            {
            if (!goomba8.walk.isRunning ())
                goomba8.walk.start ();

            graphics.drawImage (goomba8.get_enemy_image ().getImage (), goomba8.get_x (), goomba8.get_y (), (int)(goomba8.get_enemy_image ().getImage ().getWidth (null) / goomba_scale_rate), (int)(goomba8.get_enemy_image ().getImage ().getHeight (null) / goomba_scale_rate), null);
            }
        else
            {
            goomba8.moving_left = true;
            }
        
        if (goomba9.get_x () <= 1250 && goomba9.get_x () >= -(int)(goomba9.get_enemy_image ().getImage ().getWidth (null) / goomba_scale_rate))
            {
            if (!goomba9.walk.isRunning ())
                goomba9.walk.start ();

            graphics.drawImage (goomba9.get_enemy_image ().getImage (), goomba9.get_x (), goomba9.get_y (), (int)(goomba9.get_enemy_image ().getImage ().getWidth (null) / goomba_scale_rate), (int)(goomba9.get_enemy_image ().getImage ().getHeight (null) / goomba_scale_rate), null);
            }
        else
            {
            goomba9.moving_left = true;
            }
        
        if (goomba10.get_x () <= 1250 && goomba10.get_x () >= -(int)(goomba10.get_enemy_image ().getImage ().getWidth (null) / goomba_scale_rate))
            {
            if (!goomba10.walk.isRunning ())
                goomba10.walk.start ();

            graphics.drawImage (goomba10.get_enemy_image ().getImage (), goomba10.get_x (), goomba10.get_y (), (int)(goomba10.get_enemy_image ().getImage ().getWidth (null) / goomba_scale_rate), (int)(goomba10.get_enemy_image ().getImage ().getHeight (null) / goomba_scale_rate), null);
            }
        else
            {
            goomba10.moving_left = true;
            }
        
        if (goomba11.get_x () <= 1250 && goomba11.get_x () >= -(int)(goomba11.get_enemy_image ().getImage ().getWidth (null) / goomba_scale_rate))
            {
            if (!goomba11.walk.isRunning ())
                goomba11.walk.start ();

            graphics.drawImage (goomba11.get_enemy_image ().getImage (), goomba11.get_x (), goomba11.get_y (), (int)(goomba11.get_enemy_image ().getImage ().getWidth (null) / goomba_scale_rate), (int)(goomba11.get_enemy_image ().getImage ().getHeight (null) / goomba_scale_rate), null);
            }
        else
            {
            goomba11.moving_left = true;
            }
        
        if (goomba12.get_x () <= 1250 && goomba12.get_x () >= -(int)(goomba12.get_enemy_image ().getImage ().getWidth (null) / goomba_scale_rate))
            {
            if (!goomba12.walk.isRunning ())
                goomba12.walk.start ();

            graphics.drawImage (goomba12.get_enemy_image ().getImage (), goomba12.get_x (), goomba12.get_y (), (int)(goomba12.get_enemy_image ().getImage ().getWidth (null) / goomba_scale_rate), (int)(goomba12.get_enemy_image ().getImage ().getHeight (null) / goomba_scale_rate), null);
            }
        else
            {
            goomba12.moving_left = true;
            }
        
        if (goomba13.get_x () <= 1250 && goomba13.get_x () >= -(int)(goomba13.get_enemy_image ().getImage ().getWidth (null) / goomba_scale_rate))
            {
            if (!goomba13.walk.isRunning ())
                goomba13.walk.start ();

            graphics.drawImage (goomba13.get_enemy_image ().getImage (), goomba13.get_x (), goomba13.get_y (), (int)(goomba13.get_enemy_image ().getImage ().getWidth (null) / goomba_scale_rate), (int)(goomba13.get_enemy_image ().getImage ().getHeight (null) / goomba_scale_rate), null);
            }
        else
            {
            goomba13.moving_left = true;
            }
        
        if (goomba14.get_x () <= 1250 && goomba14.get_x () >= -(int)(goomba14.get_enemy_image ().getImage ().getWidth (null) / goomba_scale_rate))
            {
            if (!goomba14.walk.isRunning ())
                goomba14.walk.start ();

            graphics.drawImage (goomba14.get_enemy_image ().getImage (), goomba14.get_x (), goomba14.get_y (), (int)(goomba14.get_enemy_image ().getImage ().getWidth (null) / goomba_scale_rate), (int)(goomba14.get_enemy_image ().getImage ().getHeight (null) / goomba_scale_rate), null);
            }
        else
            {
            goomba14.moving_left = true;
            }        
        
        if (goomba14.get_x () <= 1250 && goomba14.get_x () >= -(int)(goomba14.get_enemy_image ().getImage ().getWidth (null) / goomba_scale_rate))
            {
            if (!goomba14.walk.isRunning ())
                goomba14.walk.start ();

            graphics.drawImage (goomba14.get_enemy_image ().getImage (), goomba14.get_x (), goomba14.get_y (), (int)(goomba14.get_enemy_image ().getImage ().getWidth (null) / goomba_scale_rate), (int)(goomba14.get_enemy_image ().getImage ().getHeight (null) / goomba_scale_rate), null);
            }
        else
            {
            goomba14.moving_left = true;
            }
        
        if (koopa.get_x () <= 1250 && koopa.get_x () >= -(int)(koopa.get_enemy_image ().getImage ().getWidth (null) / koopa_scale_rate))
            {
            if (!koopa.walk.isRunning ())
                koopa.walk.start ();
                        
            graphics.drawImage (koopa.get_enemy_image ().getImage (), koopa.get_x (), koopa.get_y (), (int)(koopa.get_enemy_image ().getImage ().getWidth (null) / koopa_scale_rate), (int)(koopa.get_enemy_image ().getImage ().getHeight (null) / koopa_scale_rate), null);
            }
        else
            {
            koopa.moving_left = true;
            }
        }
    
    public void move_floors ()
        {
        if (mario.get_x () >= right_boundry && floor_partition4.get_x () < -1508)
            {
            for (DecorativeObject s : sprites)
                s.dx = 0;

            for (Floor f : floor_partitions)
                f.dx = 0;

            for (QuestionBlock q : question_blocks)
                {
                q.dx = 0;
                
                if (q.get_has_coin ())
                    q.get_coin ().dx = 0;
                }

            for (RegularBlock r : regular_blocks)
                {
                r.dx = 0;
                if (r.multiple_coins)
                    {
                    for (Coin c : r.coins)
                        c.dx = 0;
                    }
                }

            for (WarpPipe w : warp_pipes)
                w.dx = 0;

            for (Stairs s : stairs)
                s.dx = 0;
            }
        // if mario touches certain part of the screen, start moving floor to the left
        else if (mario.get_x () >= right_boundry && floor_partition4.get_x () >= -1508)
            {
            mario.x = right_boundry;
            
            // if mario is touching the boundry while running
            if (mario.get_right_press () && !mario.jump.isRunning ())
                {
                // do boost speed if mario is boosting
                if (mario.get_z_press ())
                    {
                    for (DecorativeObject s : sprites)
                        s.dx = -Mario.speed_boost;
                    
                    for (Floor f : floor_partitions)
                        f.dx = -Mario.speed_boost;
                    
                    for (QuestionBlock q : question_blocks)
                        {
                        q.dx = -Mario.speed_boost;
                        
                        if (q.get_has_coin ())
                            q.get_coin ().dx = -Mario.speed_boost;
                        }
                    
                    for (RegularBlock r : regular_blocks)
                        {
                        r.dx = -Mario.speed_boost;
                        
                        if (r.multiple_coins)
                            {
                            for (Coin c : r.coins)
                                c.dx = -Mario.speed_boost;
                            }
                        }
                        
                    
                    for (WarpPipe w : warp_pipes)
                        w.dx = -Mario.speed_boost;
                    
                    for (Stairs s : stairs)
                        s.dx = -Mario.speed_boost;
                    
                    for (Goomba g : goombas)
                        {
                        if (g.moving_left && !g.squish && g.started)
                            g.dx = -Mario.speed_boost - 2;
                        else if (!g.moving_left && !g.squish && g.started)
                            g.dx = -Mario.speed_boost + 2;
                        else if (g.squish || !g.started)
                            g.dx = -Mario.speed_boost;
                        }
                    
                    for (Koopa g : koopas)
                        {
                        if (g.moving_left && !g.squish && g.started)
                            g.dx = -Mario.speed_boost - 2;
                        else if (!g.moving_left && !g.squish && g.started)
                            g.dx = -Mario.speed_boost + 2;
                        else if (g.squish || !g.started)
                            g.dx = -Mario.speed_boost;
                        }
                    }
                else
                    {
                    for (DecorativeObject s : sprites)
                        s.dx = -Mario.speed;
                    
                    for (Floor f : floor_partitions)
                        f.dx = -Mario.speed;
                    
                    for (QuestionBlock q : question_blocks)
                        {
                        q.dx = -Mario.speed;
                        
                        if (q.get_has_coin ())
                            q.get_coin ().dx = -Mario.speed;
                        }
                    
                    for (RegularBlock r : regular_blocks)
                        {
                        r.dx = -Mario.speed;
                        
                        if (r.multiple_coins)
                            {
                            for (Coin c : r.coins)
                                c.dx = -Mario.speed;
                            }
                        }
                    
                    for (WarpPipe w : warp_pipes)
                        w.dx = -Mario.speed;
                    
                    for (Stairs s : stairs)
                        s.dx = -Mario.speed;
                    
                    for (Goomba g : goombas)
                        {
                        if (g.moving_left && !g.squish && g.started)
                            g.dx = -Mario.speed - 2;
                        else if (!g.moving_left && !g.squish && g.started)
                            g.dx = -Mario.speed + 2;
                        else if (g.squish || !g.started)
                            g.dx = -Mario.speed;
                        }
                    
                    for (Koopa g : koopas)
                        {
                        if (g.moving_left && !g.squish && g.started)
                            g.dx = -Mario.speed - 2;
                        else if (!g.moving_left && !g.squish && g.started)
                            g.dx = -Mario.speed + 2;
                        else if (g.squish || !g.started)
                            g.dx = -Mario.speed;
                        }
                    //otherwise, normal speed
                    }
                }
            // is mario is jumping when touching the boundry
            else if (mario.jump.isRunning () && !mario_is_touching_side_block)
                {
                // this prevents the floor from moving if mario just jumps straight up
                if (!mario.get_straight_jump ())
                    {
                    if (mario.get_boost_jump ())
                        {
                        for (DecorativeObject s : sprites)
                            s.dx = -Mario.speed_boost;
                        
                        for (Floor f : floor_partitions)
                            f.dx = -Mario.speed_boost;

                        for (QuestionBlock q : question_blocks)
                            {
                            q.dx = -Mario.speed_boost;
                        
                            if (q.get_has_coin ())
                                q.get_coin ().dx = -Mario.speed_boost;
                            }

                        for (RegularBlock r : regular_blocks)
                            {
                            r.dx = -Mario.speed_boost;
                            
                            if (r.multiple_coins)
                                {
                                for (Coin c : r.coins)
                                    c.dx = -Mario.speed_boost;
                                }
                            }

                        for (WarpPipe w : warp_pipes)
                            w.dx = -Mario.speed_boost;
                        
                        for (Stairs s : stairs)
                            s.dx = -Mario.speed_boost;
                        
                        for (Goomba g : goombas)
                            {
                            if (g.moving_left && !g.squish && g.started)
                                g.dx = -Mario.speed_boost - 2;
                            else if (!g.moving_left && !g.squish && g.started)
                                g.dx = -Mario.speed_boost + 2;
                            else if (g.squish || !g.started)
                                g.dx = -Mario.speed_boost;
                            }
                        
                        for (Koopa g : koopas)
                            {
                            if (g.moving_left && !g.squish && g.started)
                                g.dx = -Mario.speed_boost - 2;
                            else if (!g.moving_left && !g.squish && g.started)
                                g.dx = -Mario.speed_boost + 2;
                            else if (g.squish || !g.started)
                                g.dx = -Mario.speed_boost;
                            }
                        }
                    else
                        {
                        for (DecorativeObject s : sprites)
                            s.dx = -Mario.speed;
                        
                        for (Floor f : floor_partitions)
                            f.dx = -Mario.speed;
                        
                        for (QuestionBlock q : question_blocks)
                            {
                            q.dx = -Mario.speed;
                            
                            if (q.get_has_coin ())
                                q.get_coin ().dx = -Mario.speed;
                            }

                        for (RegularBlock r : regular_blocks)
                            {
                            r.dx = -Mario.speed;
                            
                            if (r.multiple_coins)
                                {
                                for (Coin c : r.coins)
                                    c.dx = -Mario.speed;
                                }
                            }
                        
                        for (WarpPipe w : warp_pipes)
                            w.dx = -Mario.speed;
                        
                        for (Stairs s : stairs)
                            s.dx = -Mario.speed;
                        
                        for (Goomba g : goombas)
                            {
                            if (g.moving_left && !g.squish && g.started)
                                g.dx = -Mario.speed - 2;
                            else if (!g.moving_left && !g.squish && g.started)
                                 g.dx = -Mario.speed + 2;
                            else if (g.squish || !g.started)
                                 g.dx = -Mario.speed;
                            }
                        
                        for (Koopa g : koopas)
                            {
                            if (g.moving_left && !g.squish && g.started)
                                g.dx = -Mario.speed - 2;
                            else if (!g.moving_left && !g.squish && g.started)
                                 g.dx = -Mario.speed + 2;
                            else if (g.squish || !g.started)
                                 g.dx = -Mario.speed;
                            }
                        }
                    }
                else if (mario.get_straight_jump () && mario.get_right_press ())
                    {
                    if (mario.get_boost_jump ())
                        {
                        for (DecorativeObject s : sprites)
                            s.dx = -Mario.speed_boost;
                        
                        for (Floor f : floor_partitions)
                            f.dx = -Mario.speed_boost;

                        for (QuestionBlock q : question_blocks)
                            {
                            q.dx = -Mario.speed_boost;
                            
                            if (q.get_has_coin ())
                                q.get_coin ().dx = -Mario.speed_boost;
                            }

                        for (RegularBlock r : regular_blocks)
                            {
                            r.dx = -Mario.speed_boost;
                            
                            if (r.multiple_coins)
                                {
                                for (Coin c : r.coins)
                                    c.dx = -Mario.speed_boost;
                                }
                            }
                        
                        for (WarpPipe w : warp_pipes)
                            w.dx = -Mario.speed_boost;
                        
                        for (Stairs s : stairs)
                            s.dx = -Mario.speed_boost;
                        
                        for (Goomba g : goombas)
                            {
                            if (g.moving_left && !g.squish && g.started)
                                g.dx = -Mario.speed_boost - 2;
                            else if (!g.moving_left && !g.squish && g.started)
                                g.dx = -Mario.speed_boost + 2;
                            else if (g.squish || !g.started)
                                g.dx = -Mario.speed_boost;
                            }
                        
                        for (Koopa g : koopas)
                            {
                            if (g.moving_left && !g.squish && g.started)
                                g.dx = -Mario.speed_boost - 2;
                            else if (!g.moving_left && !g.squish && g.started)
                                g.dx = -Mario.speed_boost + 2;
                            else if (g.squish || !g.started)
                                g.dx = -Mario.speed_boost;
                            }
                        }
                    else
                        {
                        for (DecorativeObject s : sprites)
                            s.dx = -Mario.speed;
                        
                        for (Floor f : floor_partitions)
                            f.dx = -Mario.speed;
                        
                        for (QuestionBlock q : question_blocks)
                            {
                            q.dx = -Mario.speed;
                            
                            if (q.get_has_coin ())
                                q.get_coin ().dx = -Mario.speed;
                            }

                        for (RegularBlock r : regular_blocks)
                            {
                            r.dx = -Mario.speed;

                            if (r.multiple_coins)
                                {
                                for (Coin c : r.coins)
                                    c.dx = -Mario.speed;
                                }
                            }
                        
                        for (WarpPipe w : warp_pipes)
                            w.dx = -Mario.speed;
                        
                        for (Stairs s : stairs)
                            s.dx = -Mario.speed;
                        
                        for (Goomba g : goombas)
                            {
                            if (g.moving_left && !g.squish && g.started)
                                g.dx = -Mario.speed - 2;
                            else if (!g.moving_left && !g.squish && g.started)
                                g.dx = -Mario.speed + 2;
                            else if (g.squish || !g.started)
                                g.dx = -Mario.speed;
                            }
                        
                        for (Koopa g : koopas)
                            {
                            if (g.moving_left && !g.squish && g.started)
                                g.dx = -Mario.speed - 2;
                            else if (!g.moving_left && !g.squish && g.started)
                                g.dx = -Mario.speed + 2;
                            else if (g.squish || !g.started)
                                g.dx = -Mario.speed;
                            }
                        }
                    }
                else
                    {
                    // handles error of goombas being moved weirldy
                    for (Goomba g : goombas)
                        {
                        if (g.moving_left && !g.squish && g.started)
                            g.dx = floor_partition1.dx - 2;
                        else if (!g.moving_left && !g.squish && g.started)
                            g.dx = floor_partition1.dx + 2;
                        else if (g.squish || !g.started)
                            g.dx = floor_partition1.dx;
                        }
                    
                    for (Koopa g : koopas)
                        {
                        if (g.moving_left && !g.squish && g.started)
                            g.dx = floor_partition1.dx - 2;
                        else if (!g.moving_left && !g.squish && g.started)
                            g.dx = floor_partition1.dx + 2;
                        else if (g.squish || !g.started)
                            g.dx = floor_partition1.dx;
                        }
                    }
                }
            else if (mario.run_slowdown.isRunning () || mario.skid.isRunning ())
                {
                for (DecorativeObject s : sprites)
                    s.dx = -mario.get_dx ();
                
                for (Floor f : floor_partitions)
                    f.dx = -mario.get_dx ();
                
                for (QuestionBlock q : question_blocks)
                    {
                    q.dx = -mario.get_dx ();
                    
                    if (q.get_has_coin ())
                        q.get_coin ().dx = -mario.get_dx ();
                    }

                for (RegularBlock r : regular_blocks)
                    {
                    r.dx = -mario.get_dx ();
                    
                    if (r.multiple_coins)
                        {
                        for (Coin c : r.coins)
                            c.dx = -mario.get_dx ();
                        }
                    }
                
                for (WarpPipe w : warp_pipes)
                    w.dx = -mario.get_dx ();
                
                for (Stairs s : stairs)
                    s.dx = -mario.get_dx ();
                
                for (Goomba g : goombas)
                    {
                    if (g.moving_left && !g.squish && g.started)
                        g.dx = -mario.get_dx () - 2;
                    else if (!g.moving_left && !g.squish && g.started)
                        g.dx = -mario.get_dx () + 2;
                    else if (g.squish || !g.started)
                        g.dx = -mario.get_dx ();
                    }
                
                for (Koopa g : koopas)
                    {
                    if (g.moving_left && !g.squish && g.started)
                        g.dx = -mario.get_dx () - 2;
                    else if (!g.moving_left && !g.squish && g.started)
                        g.dx = -mario.get_dx () + 2;
                    else if (g.squish || !g.started)
                        g.dx = -mario.get_dx ();
                    }
                }
            else
                {
                //if mario is touching the boundry but not moving to the right
                for (DecorativeObject s : sprites)
                    s.dx = 0;
                
                for (Floor f : floor_partitions)
                    f.dx = 0;
                
                for (QuestionBlock q : question_blocks)
                    {
                    q.dx = 0;
                    
                    if (q.get_has_coin ())
                        q.get_coin ().dx = 0;
                    }

                for (RegularBlock r : regular_blocks)
                    {
                    r.dx = 0;
                    
                    if (r.multiple_coins)
                        {
                        for (Coin c : r.coins)
                            c.dx = 0;
                        }
                    }
                
                for (WarpPipe w : warp_pipes)
                    w.dx = 0;
                
                for (Stairs s : stairs)
                    s.dx = 0;
                
                for (Goomba g : goombas)
                    {
                    if (g.moving_left && !g.squish && g.started)
                        g.dx = -2;
                    else if (!g.moving_left && !g.squish && g.started)
                        g.dx = 2;
                    else if (g.squish || !g.started)
                        g.dx = 0;
                    }
                
                for (Koopa g : koopas)
                    {
                    if (g.moving_left && !g.squish && g.started)
                        g.dx = -2;
                    else if (!g.moving_left && !g.squish && g.started)
                        g.dx = 2;
                    else if (g.squish || !g.started)
                        g.dx = 0;
                    }
                }
            }
        
        //if mario has not encountered the right boundry, dont move the floor
        if (mario.get_x () < right_boundry)
            {
            for (DecorativeObject s : sprites)
                s.dx = 0;
            
            for (Floor f : floor_partitions)
                f.dx = 0;
            
            for (QuestionBlock q : question_blocks)
                {
                q.dx = 0;
                
                if (q.get_has_coin ())
                    q.get_coin ().dx = 0;
                }

            for (RegularBlock r : regular_blocks)
                {
                r.dx = 0;
                
                if (r.multiple_coins)
                    {
                    for (Coin c : r.coins)
                        c.dx = 0;
                    }
                }
            
            for (WarpPipe w : warp_pipes)
                w.dx = 0;
            
            for (Stairs s : stairs)
                s.dx = 0;
            
            for (Goomba g : goombas)
                {
                if (g.moving_left && !g.squish && g.started)
                    g.dx = -2;
                else if (!g.moving_left && !g.squish && g.started)
                    g.dx = 2;
                else if (g.squish || !g.started)
                    g.dx = 0;
                }
            
            for (Koopa g : koopas)
                {
                if (g.moving_left && !g.squish && g.started)
                    g.dx = -2;
                else if (!g.moving_left && !g.squish && g.started)
                    g.dx = 2;
                else if (g.squish || !g.started)
                    g.dx = 0;
                }
            }
        
//        // if mario touches the left boundry
        if (mario.get_x () <= left_boundry)
            {
//            //keep mario in same position, keep his dx still
            mario.x = left_boundry;
            }
        }
    
    public void check_block_collision (Rectangle mario_object, Graphics2D graphics)
        {
        Rectangle mario_left_side  = new Rectangle (mario.get_x (), mario.get_y () + mario_y_axis_pad, (int) (mario.neutral_mario.getIconWidth () / 8.4), (int) (mario.neutral_mario.getIconHeight () / 1.4));
        Rectangle mario_right_side = new Rectangle (mario.get_x () + (int)mario_object.getWidth (), mario.get_y () + mario_y_axis_pad, (int) (mario.neutral_mario.getIconWidth () / 8.4), (int) (mario.neutral_mario.getIconHeight () / 1.4));
        Rectangle mario_top_side   = new Rectangle (mario.get_x (), mario.get_y () + mario_y_axis_pad, (int) (mario.neutral_mario.getIconWidth () / 1.4), (int) (mario.neutral_mario.getIconHeight () / 10.4));
        Rectangle mario_bot_side   = new Rectangle (mario.get_x (), mario.get_y () + mario_y_axis_pad + (int)mario_object.getHeight () - 5, (int) (mario.neutral_mario.getIconWidth () / 1.4), (int) (mario.neutral_mario.getIconHeight () / 11.4));

        for (Block block : all_blocks)
            {
            if (block.get_x () >=1250 || block.get_x () <= -(int)(block.get_block_image ().getImage ().getWidth (null) / block_scale_rate))
                {
                continue;
                }
            int question_block_width  = (int)(block.get_block_image ().getImage ().getWidth (null) / block_scale_rate);
            int question_block_height = (int)(block.get_block_image ().getImage ().getHeight (null) / block_scale_rate);
            
            Rectangle block_left_side  = new Rectangle (block.get_x (), block.get_y () + 3, (int)(block.get_block_image ().getImage ().getWidth (null) / block_scale_rate / 11), (int)(block.get_block_image ().getImage ().getHeight (null) / block_scale_rate) - 3);
            Rectangle block_right_side = new Rectangle (block.get_x () + question_block_width - 2, block.get_y () + 3, (int)(block.get_block_image ().getImage ().getWidth (null) / block_scale_rate / 11), (int)(block.get_block_image ().getImage ().getHeight (null) / block_scale_rate) - 3);
            Rectangle block_top_side   = new Rectangle (block.get_x (), block.get_y (), (int)(block.get_block_image ().getImage ().getWidth (null) / block_scale_rate), (int)(block.get_block_image ().getImage ().getHeight (null) / block_scale_rate / 11));
            Rectangle block_bot_side   = new Rectangle (block.get_x (), block.get_y () + question_block_height - 1, (int)(block.get_block_image ().getImage ().getWidth (null) / block_scale_rate), (int)(block.get_block_image ().getImage ().getHeight (null) / block_scale_rate / 11));
        
            if (mario_right_side.intersects (block_left_side))
                {
                mario_is_touching_side_block = true;
                mario.dx = 0;
                
                mario.x  = block.get_x () - 38;
                }
            else if (mario_left_side.intersects (block_right_side))
                {
                mario_is_touching_side_block = true;
                mario.dx = 0;
                
                mario.x  = (int) block.get_x () + 51;
                }
            else if (mario_bot_side.intersects (block_top_side))
                {
                mario.end_jump (false);
                if (block.low_block)
                    mario.y = mario_resting_low_block_y;
                else
                    mario.y = mario_resting_high_block_y;
                }
            else if (mario_top_side.intersects (block_bot_side))
                {
                mario.end_jump (true);
                
                if (!block.get_block_hit () && !block.hit_count_limit_done)
                    {
                    block.set_block_hit (true);
                    
                    block.block_hit_animate.start ();
                    
                    if (block.get_has_coin () && block instanceof QuestionBlock)
                        {
                        block.get_coin ().set_x (block.get_x () + 20);
                        block.get_coin ().set_y (block.get_y () - 60);
                        block.get_coin ().coin_animate.start ();
                        block.get_coin ().coin_move_animate.start ();
                        }
                    else if (block.multiple_coins && block instanceof RegularBlock)
                        {
                        if (!block.hit_count_limit.isRunning ())
                            block.hit_count_limit.start ();
                        
                        if (!block.coins.get (coin_index).coin_move_animate.isRunning () && !block.coins.get (coin_index).coin_move_reverse_animate.isRunning ())
                            {
                            coin_index ++;
                            block.coins.get (coin_index).set_x (block.get_x () + 20);
                            block.coins.get (coin_index).set_y (block.get_y () - 60);
                            block.coins.get (coin_index).coin_animate.start ();
                            block.coins.get (coin_index).coin_move_animate.start ();
                            }
                        else if (block.coins.get (coin_index).coin_move_reverse_animate.isRunning () && !block.coins.get (coin_index + 1).coin_move_animate.isRunning ()
                                && !block.coins.get (coin_index + 1).coin_move_reverse_animate.isRunning ())
                            {
                            coin_index ++;
                            block.coins.get (coin_index).set_x (block.get_x () + 20);
                            block.coins.get (coin_index).set_y (block.get_y () - 60);
                            block.coins.get (coin_index).coin_animate.start ();
                            block.coins.get (coin_index).coin_move_animate.start ();
                            }
                        }
                    }
                }
            else if (!mario.jump.isRunning () && !mario_bot_side.intersects (block_top_side) && mario.y < Mario.floor_border && !mario_is_touching_top_pipe && !Mario.pole_slide && !Mario.pole_slide_left && !Mario.pole_slide_finished)
                {
                mario.back_to_ground.start ();
                }

            if (!mario_right_side.intersects (block_left_side) && !mario_left_side.intersects (block_right_side) && mario_is_touching_side_block)
                {
                mario_is_touching_side_block = false;
                }
                
            
            if (block.get_has_coin () && block instanceof QuestionBlock)
                {
                if (block.get_coin ().coin_move_animate.isRunning () || block.get_coin ().coin_move_reverse_animate.isRunning ())
                    graphics.drawImage (block.get_coin ().get_coin_image ().getImage (), block.get_coin ().get_x (), block.get_coin ().get_y (), (int)(block.get_coin ().get_coin_image ().getImage ().getWidth (null) / coin_scale_rate), (int)(block.get_coin ().get_coin_image ().getImage ().getHeight (null) / coin_scale_rate), null);
                }
            else if (block.multiple_coins && block instanceof RegularBlock)
                {
                if (block.coins.get (coin_index).coin_move_animate.isRunning () || block.coins.get (coin_index).coin_move_reverse_animate.isRunning ())
                    {
                    graphics.drawImage (block.coins.get (coin_index).get_coin_image ().getImage (), block.coins.get (coin_index).get_x (), block.coins.get (coin_index).get_y (), (int)(block.coins.get (coin_index).get_coin_image ().getImage ().getWidth (null) / coin_scale_rate), (int)(block.coins.get (coin_index).get_coin_image ().getImage ().getHeight (null) / coin_scale_rate), null);
                    }
                if (block.coins.get (coin_index - 1).coin_move_animate.isRunning () || block.coins.get (coin_index - 1).coin_move_reverse_animate.isRunning ())
                    {
                    graphics.drawImage (block.coins.get (coin_index - 1).get_coin_image ().getImage (), block.coins.get (coin_index - 1).get_x (), block.coins.get (coin_index - 1).get_y (), (int)(block.coins.get (coin_index - 1).get_coin_image ().getImage ().getWidth (null) / coin_scale_rate), (int)(block.coins.get (coin_index - 1).get_coin_image ().getImage ().getHeight (null) / coin_scale_rate), null);
                    }
                }
            }
        }
    
    public void check_warp_pipe_collision (Rectangle mario_object)
        {
        Rectangle mario_left_side  = new Rectangle (mario.get_x (), mario.get_y () + mario_y_axis_pad, (int) (mario.neutral_mario.getIconWidth () / 8.4), (int) (mario.neutral_mario.getIconHeight () / 1.4));
        Rectangle mario_right_side = new Rectangle (mario.get_x () + (int)mario_object.getWidth (), mario.get_y () + mario_y_axis_pad, (int) (mario.neutral_mario.getIconWidth () / 8.4), (int) (mario.neutral_mario.getIconHeight () / 1.4));
        Rectangle mario_top_side   = new Rectangle (mario.get_x (), mario.get_y () + mario_y_axis_pad, (int) (mario.neutral_mario.getIconWidth () / 1.4), (int) (mario.neutral_mario.getIconHeight () / 10.4));
        Rectangle mario_bot_side   = new Rectangle (mario.get_x (), mario.get_y () + mario_y_axis_pad + (int)mario_object.getHeight () - 5, (int) (mario.neutral_mario.getIconWidth () / 1.4), (int) (mario.neutral_mario.getIconHeight () / 11.4));

        for (WarpPipe pipe: warp_pipes)
            {
//            if (pipe.get_x () >=1250 || pipe.get_x () <= -(int) (pipe.get_pipe_image (2).getImage ().getWidth (null) / warp_pipe_scale_rate))
//                {
//                continue;
//                }
            int warp_pipe_width;
            int warp_pipe_height;
            
            Rectangle pipe_left_side = new Rectangle ();
            Rectangle pipe_right_side = new Rectangle ();
            Rectangle pipe_top_side = new Rectangle ();
            
            if (pipe.size == 0)
                {
                warp_pipe_width  = (int)(pipe.get_pipe_image (0).getImage ().getWidth (null) / warp_pipe_scale_rate);
                warp_pipe_height = (int)(pipe.get_pipe_image (0).getImage ().getHeight (null) / warp_pipe_scale_rate);
                
                pipe_left_side  = new Rectangle (pipe.get_x (), pipe.get_y () + 3, (int)(pipe.get_pipe_image (0).getImage ().getWidth (null) / warp_pipe_scale_rate / 11), (int)(pipe.get_pipe_image (0).getImage ().getHeight (null) / warp_pipe_scale_rate) - 3);
                pipe_right_side = new Rectangle (pipe.get_x () + warp_pipe_width - 9, pipe.get_y () + 3, (int)(pipe.get_pipe_image (0).getImage ().getWidth (null) / warp_pipe_scale_rate / 11), (int)(pipe.get_pipe_image (0).getImage ().getHeight (null) / warp_pipe_scale_rate) - 3);
                pipe_top_side   = new Rectangle (pipe.get_x (), pipe.get_y (), (int)(pipe.get_pipe_image (0).getImage ().getWidth (null) / warp_pipe_scale_rate), (int)(pipe.get_pipe_image (0).getImage ().getHeight (null) / warp_pipe_scale_rate / 7));
                }
            else if (pipe.size == 1)
                {
                warp_pipe_width  = (int)(pipe.get_pipe_image (1).getImage ().getWidth (null) / warp_pipe_scale_rate);
                warp_pipe_height = (int)(pipe.get_pipe_image (1).getImage ().getHeight (null) / warp_pipe_scale_rate);  
                
                pipe_left_side  = new Rectangle (pipe.get_x (), pipe.get_y () + 3, (int)(pipe.get_pipe_image (1).getImage ().getWidth (null) / warp_pipe_scale_rate / 11), (int)(pipe.get_pipe_image (1).getImage ().getHeight (null) / warp_pipe_scale_rate) - 3);
                pipe_right_side = new Rectangle (pipe.get_x () + warp_pipe_width - 9, pipe.get_y () + 3, (int)(pipe.get_pipe_image (1).getImage ().getWidth (null) / warp_pipe_scale_rate / 11), (int)(pipe.get_pipe_image (1).getImage ().getHeight (null) / warp_pipe_scale_rate) - 3);
                pipe_top_side   = new Rectangle (pipe.get_x (), pipe.get_y (), (int)(pipe.get_pipe_image (1).getImage ().getWidth (null) / warp_pipe_scale_rate), (int)(pipe.get_pipe_image (1).getImage ().getHeight (null) / warp_pipe_scale_rate / 13));
                }
            else if (pipe.size == 2)
                {
                warp_pipe_width  = (int)(pipe.get_pipe_image (2).getImage ().getWidth (null) / warp_pipe_scale_rate);
                warp_pipe_height = (int)(pipe.get_pipe_image (2).getImage ().getHeight (null) / warp_pipe_scale_rate);
                
                pipe_left_side  = new Rectangle (pipe.get_x (), pipe.get_y () + 3, (int)(pipe.get_pipe_image (2).getImage ().getWidth (null) / warp_pipe_scale_rate / 11), (int)(pipe.get_pipe_image (2).getImage ().getHeight (null) / warp_pipe_scale_rate) - 3);
                pipe_right_side = new Rectangle (pipe.get_x () + warp_pipe_width - 9, pipe.get_y () + 3, (int)(pipe.get_pipe_image (2).getImage ().getWidth (null) / warp_pipe_scale_rate / 11), (int)(pipe.get_pipe_image (2).getImage ().getHeight (null) / warp_pipe_scale_rate) - 3);
                pipe_top_side   = new Rectangle (pipe.get_x (), pipe.get_y (), (int)(pipe.get_pipe_image (2).getImage ().getWidth (null) / warp_pipe_scale_rate), (int)(pipe.get_pipe_image (2).getImage ().getHeight (null) / warp_pipe_scale_rate / 16));
                }
            
            if (mario_right_side.intersects (pipe_left_side))
                {
                mario_is_touching_side_block = true;
                mario.dx = 0;
                
                mario.x  = pipe.get_x () - 38;
                }
            else if (mario_left_side.intersects (pipe_right_side))
                {
                mario_is_touching_side_block = true;
                mario.dx = 0;
                
                mario.x  = (int) pipe.get_x () + 111;
                }
            else if (mario_bot_side.intersects (pipe_top_side))
                {
                mario_is_touching_top_pipe = true;
                mario.end_jump (false);
                
                if (pipe.low_pipe)
                    mario.y = mario_resting_low_pipe_y;
                else if (pipe.mid_pipe)
                    mario.y = mario_resting_mid_pipe_y;
                else if (pipe.big_pipe)
                    mario.y = mario_resting_high_pipe_y;
                }
            else if (!mario.jump.isRunning () && !mario_bot_side.intersects (pipe_top_side) && mario.y < Mario.floor_border && !mario_is_touching_top_pipe && !Mario.pole_slide && !Mario.pole_slide_left && !Mario.pole_slide_finished)
                {
                mario.back_to_ground.start ();
                }
            
            if (!mario_bot_side.intersects (pipe_top_side))
                {
                mario_is_touching_top_pipe = false;
                }
            if (!mario_right_side.intersects (pipe_left_side) && !mario_left_side.intersects (pipe_right_side) && mario_is_touching_side_block)
                {
                mario_is_touching_side_block = false;
                }
            }
        }
    
    public void check_flag_collision (Rectangle mario_object)
        {
        Rectangle mario_left_side  = new Rectangle (mario.get_x (), mario.get_y () + mario_y_axis_pad, (int) (mario.neutral_mario.getIconWidth () / 8.4), (int) (mario.neutral_mario.getIconHeight () / 1.4));
        Rectangle mario_right_side = new Rectangle (mario.get_x () + (int)mario_object.getWidth (), mario.get_y () + mario_y_axis_pad, (int) (mario.neutral_mario.getIconWidth () / 8.4), (int) (mario.neutral_mario.getIconHeight () / 1.4));
        Rectangle mario_top_side   = new Rectangle (mario.get_x (), mario.get_y () + mario_y_axis_pad, (int) (mario.neutral_mario.getIconWidth () / 1.4), (int) (mario.neutral_mario.getIconHeight () / 10.4));
        Rectangle mario_bot_side   = new Rectangle (mario.get_x (), mario.get_y () + mario_y_axis_pad + (int)mario_object.getHeight () - 5, (int) (mario.neutral_mario.getIconWidth () / 1.4), (int) (mario.neutral_mario.getIconHeight () / 11.4));

        Rectangle flag_block_left = new Rectangle (flag_pole.get_x () + 25, flag_pole.get_y () + 457, (int)(flag_pole.get_decorative_image (10).getWidth (null) / 5.5), (int)(flag_pole.get_decorative_image (10).getHeight (null) / 10));
        Rectangle flag_block_top  = new Rectangle (flag_pole.get_x () + 25, flag_pole.get_y () + 457, (int)(flag_pole.get_decorative_image (10).getWidth (null) / 2.6), (int)(flag_pole.get_decorative_image (10).getHeight (null) / 30));
        Rectangle flag_pole_rect  = new Rectangle (flag_pole.get_x () + 50, flag_pole.get_y (), (int)(flag_pole.get_decorative_image (10).getWidth (null) / 3.8), (int)(flag_pole.get_decorative_image (10).getHeight (null) / 1.1));
        
        if (mario_right_side.intersects (flag_block_left))
            {
            mario_is_touching_side_block = true;
            mario.dx = 0;
                
            mario.x  = (int)flag_block_left.getX () - 40;
            }
        else if (Mario.pole_slide_finished)
            {
            if (!mario.pole_slide_walk_away.isRunning ())
                {
                mario.pole_slide_walk_away.setInitialDelay (500);
                mario.pole_slide_walk_away.start ();
                }
            }
        else if ((mario_bot_side.intersects (flag_block_top) || mario_right_side.intersects (flag_pole_rect)) && !Mario.pole_slide && !Mario.pole_slide_left && !Mario.pole_slide_finished)
            {
            removeKeyListener (key);
            Mario.pole_slide = true;
            mario.end_jump (false);
            mario.pole_slide_cleanup ();
            mario_is_touching_top_pipe = true;
            
            mario.x = (int)flag_pole_rect.getX () - 33;
            
            flag_to_bottom.start ();
            }
        else if ((mario_bot_side.intersects (flag_block_top) || mario_right_side.intersects (flag_pole_rect)) && Mario.pole_slide && !Mario.pole_slide_left && !Mario.pole_slide_finished)
            {
            if (!mario.sliding_down.isRunning ())
                {
                mario.sliding_down.setInitialDelay (20);
                mario.sliding_down.start ();
                }
            }
        else if ((mario_bot_side.intersects (flag_block_top) || mario_right_side.intersects (flag_pole_rect)) && !Mario.pole_slide && Mario.pole_slide_left && !Mario.pole_slide_finished)
            {
            mario.dx = 0;
            mario.dy = 0;
            mario.x  = (int)flag_block_left.getX () + 20;
            mario.y = mario_resting_stair1;
            Mario.pole_slide_finished = true;
            }
        }
    
    public void check_stairs_collision (Rectangle mario_object)
        {
        Rectangle mario_left_side  = new Rectangle (mario.get_x (), mario.get_y () + mario_y_axis_pad, (int) (mario.neutral_mario.getIconWidth () / 8.4), (int) (mario.neutral_mario.getIconHeight () / 1.4));
        Rectangle mario_right_side = new Rectangle (mario.get_x () + (int)mario_object.getWidth (), mario.get_y () + mario_y_axis_pad, (int) (mario.neutral_mario.getIconWidth () / 8.4), (int) (mario.neutral_mario.getIconHeight () / 1.4));
        Rectangle mario_top_side   = new Rectangle (mario.get_x (), mario.get_y () + mario_y_axis_pad, (int) (mario.neutral_mario.getIconWidth () / 1.4), (int) (mario.neutral_mario.getIconHeight () / 10.4));
        Rectangle mario_bot_side   = new Rectangle (mario.get_x (), mario.get_y () + mario_y_axis_pad + (int)mario_object.getHeight () - 5, (int) (mario.neutral_mario.getIconWidth () / 1.4), (int) (mario.neutral_mario.getIconHeight () / 11.4));

        for (Stairs stair : stairs)
            {
            if (stair.type == 0)
                {
                Rectangle left_side1 = new Rectangle ();
                Rectangle top_side1  = new Rectangle ();
                Rectangle left_side2 = new Rectangle ();
                Rectangle top_side2  = new Rectangle ();
                Rectangle left_side3 = new Rectangle ();
                Rectangle top_side3  = new Rectangle ();
                Rectangle left_side4 = new Rectangle ();
                Rectangle top_side4  = new Rectangle ();
                Rectangle right_side = new Rectangle ();
                
                left_side1 = new Rectangle (stair.get_x (), stair.get_y () + 149, (int)(stair.get_stairs_image (0).getImage ().getWidth (null) / stairs_scale_rate / 14), (int)(stair.get_stairs_image (0).getImage ().getHeight (null) / warp_pipe_scale_rate / 2.2));
                top_side1  = new Rectangle (stair.get_x (), stair.get_y () + 149, (int)(stair.get_stairs_image (0).getImage ().getWidth (null) / stairs_scale_rate / 4), (int)(stair.get_stairs_image (0).getImage ().getHeight (null) / warp_pipe_scale_rate / 8));
                left_side2 = new Rectangle (stair.get_x () + 50, stair.get_y () + 99, (int)(stair.get_stairs_image (0).getImage ().getWidth (null) / stairs_scale_rate / 14), (int)(stair.get_stairs_image (0).getImage ().getHeight (null) / warp_pipe_scale_rate / 2.2));
                top_side2  = new Rectangle (stair.get_x () + 50, stair.get_y () + 99, (int)(stair.get_stairs_image (0).getImage ().getWidth (null) / stairs_scale_rate / 4), (int)(stair.get_stairs_image (0).getImage ().getHeight (null) / warp_pipe_scale_rate / 8));
                left_side3 = new Rectangle (stair.get_x () + 100, stair.get_y () + 49, (int)(stair.get_stairs_image (0).getImage ().getWidth (null) / stairs_scale_rate / 14), (int)(stair.get_stairs_image (0).getImage ().getHeight (null) / warp_pipe_scale_rate / 2.2));
                top_side3  = new Rectangle (stair.get_x () + 100, stair.get_y () + 49, (int)(stair.get_stairs_image (0).getImage ().getWidth (null) / stairs_scale_rate / 4), (int)(stair.get_stairs_image (0).getImage ().getHeight (null) / warp_pipe_scale_rate / 8));
                left_side4 = new Rectangle (stair.get_x () + 150, stair.get_y () - 1, (int)(stair.get_stairs_image (0).getImage ().getWidth (null) / stairs_scale_rate / 14), (int)(stair.get_stairs_image (0).getImage ().getHeight (null) / warp_pipe_scale_rate / 2.2));
                top_side4  = new Rectangle (stair.get_x () + 150, stair.get_y () - 1, (int)(stair.get_stairs_image (0).getImage ().getWidth (null) / stairs_scale_rate / 4), (int)(stair.get_stairs_image (0).getImage ().getHeight (null) / warp_pipe_scale_rate / 8));
                right_side = new Rectangle (stair.get_x () + (int)(stair.get_stairs_image (0).getImage ().getWidth (null) / stairs_scale_rate) - 15, stair.get_y () - 1, (int)(stair.get_stairs_image (0).getImage ().getWidth (null) / stairs_scale_rate / 14), (int)(stair.get_stairs_image (0).getImage ().getHeight (null) / 1.86));
                
                if (mario_right_side.intersects (left_side1))
                    {
                    mario_is_touching_side_block = true;
                    mario.dx = 0;

                    mario.x  = (int)left_side1.getX () - 40;
                    }
                else if (mario_right_side.intersects (left_side2))
                    {
                    mario_is_touching_side_block = true;
                    mario.dx = 0;

                    mario.x  = (int)left_side2.getX () - 40;
                    }
                else if (mario_right_side.intersects (left_side3))
                    {
                    mario_is_touching_side_block = true;
                    mario.dx = 0;

                    mario.x  = (int)left_side3.getX () - 40;
                    }
                else if (mario_right_side.intersects (left_side4))
                    {
                    mario_is_touching_side_block = true;
                    mario.dx = 0;

                    mario.x  = (int)left_side4.getX () - 40;
                    }
                else if (mario_bot_side.intersects (top_side1))
                    {
                    mario_is_touching_top_pipe = true;
                    mario.end_jump (false);

                    mario.y = mario_resting_stair1;
                    }
                else if (mario_bot_side.intersects (top_side2))
                    {
                    mario_is_touching_top_pipe = true;
                    mario.end_jump (false);

                    mario.y = mario_resting_stair2;
                    }
                else if (mario_bot_side.intersects (top_side3))
                    {
                    mario_is_touching_top_pipe = true;
                    mario.end_jump (false);

                    mario.y = mario_resting_stair3;
                    }
                else if (mario_bot_side.intersects (top_side4))
                    {
                    mario_is_touching_top_pipe = true;
                    mario.end_jump (false);

                    mario.y = mario_resting_stair4;
                    }
                else if (mario_left_side.intersects (right_side))
                    {
                    mario_is_touching_side_block = true;
                    mario.dx = 0;

                    mario.x  = (int) right_side.getX () + 16;
                    }
                else if (!mario.jump.isRunning () && !mario_bot_side.intersects (top_side1) && !mario_bot_side.intersects (top_side2) 
                        && !mario_bot_side.intersects (top_side3) && !mario_bot_side.intersects (top_side4) && mario.y < Mario.floor_border && !mario_is_touching_top_pipe
                        && !Mario.pole_slide && !Mario.pole_slide_left && !Mario.pole_slide_finished)
                    {
                    mario.back_to_ground.start ();
                    }

                if (!mario_bot_side.intersects (top_side1) && !mario_bot_side.intersects (top_side2) && !mario_bot_side.intersects (top_side3) && !mario_bot_side.intersects (top_side4))
                    {
                    mario_is_touching_top_pipe = false;
                    }
                if (!mario_right_side.intersects (left_side1) && !mario_right_side.intersects (left_side2) && !mario_right_side.intersects (left_side3) &&
                    !mario_right_side.intersects (left_side4) && !mario_left_side.intersects (right_side) && mario_is_touching_side_block)
                    {
                    mario_is_touching_side_block = false;
                    }
                }
            else if (stair.type == 1)
                {
                Rectangle right_side1 = new Rectangle ();
                Rectangle top_side1   = new Rectangle ();
                Rectangle right_side2 = new Rectangle ();
                Rectangle top_side2   = new Rectangle ();
                Rectangle right_side3 = new Rectangle ();
                Rectangle top_side3   = new Rectangle ();
                Rectangle right_side4 = new Rectangle ();
                Rectangle top_side4   = new Rectangle ();
                Rectangle left_side   = new Rectangle ();
                
                right_side1 = new Rectangle (stair.get_x () + 186, stair.get_y () + 149, (int)(stair.get_stairs_image (0).getImage ().getWidth (null) / stairs_scale_rate / 14), (int)(stair.get_stairs_image (0).getImage ().getHeight (null) / warp_pipe_scale_rate / 2.2));
                top_side1   = new Rectangle (stair.get_x () + 150, stair.get_y () + 149, (int)(stair.get_stairs_image (0).getImage ().getWidth (null) / stairs_scale_rate / 4), (int)(stair.get_stairs_image (0).getImage ().getHeight (null) / warp_pipe_scale_rate / 8));
                right_side2 = new Rectangle (stair.get_x () + 136, stair.get_y () + 99, (int)(stair.get_stairs_image (0).getImage ().getWidth (null) / stairs_scale_rate / 14), (int)(stair.get_stairs_image (0).getImage ().getHeight (null) / warp_pipe_scale_rate / 2.2));
                top_side2   = new Rectangle (stair.get_x () + 100, stair.get_y () + 99, (int)(stair.get_stairs_image (0).getImage ().getWidth (null) / stairs_scale_rate / 4), (int)(stair.get_stairs_image (0).getImage ().getHeight (null) / warp_pipe_scale_rate / 8));
                right_side3 = new Rectangle (stair.get_x () + 86, stair.get_y () + 49, (int)(stair.get_stairs_image (0).getImage ().getWidth (null) / stairs_scale_rate / 14), (int)(stair.get_stairs_image (0).getImage ().getHeight (null) / warp_pipe_scale_rate / 2.2));
                top_side3   = new Rectangle (stair.get_x () + 50, stair.get_y () + 49, (int)(stair.get_stairs_image (0).getImage ().getWidth (null) / stairs_scale_rate / 4), (int)(stair.get_stairs_image (0).getImage ().getHeight (null) / warp_pipe_scale_rate / 8));
                right_side4 = new Rectangle (stair.get_x () + 36, stair.get_y () - 1, (int)(stair.get_stairs_image (0).getImage ().getWidth (null) / stairs_scale_rate / 14), (int)(stair.get_stairs_image (0).getImage ().getHeight (null) / warp_pipe_scale_rate / 2.2));
                top_side4   = new Rectangle (stair.get_x (), stair.get_y () - 1, (int)(stair.get_stairs_image (0).getImage ().getWidth (null) / stairs_scale_rate / 4), (int)(stair.get_stairs_image (0).getImage ().getHeight (null) / warp_pipe_scale_rate / 8));
                left_side = new Rectangle (stair.get_x (), stair.get_y () - 1, (int)(stair.get_stairs_image (0).getImage ().getWidth (null) / stairs_scale_rate / 14), (int)(stair.get_stairs_image (0).getImage ().getHeight (null) / 1.86));
                
                if (mario_left_side.intersects (right_side1))
                    {
                    mario_is_touching_side_block = true;
                    mario.dx = 0;

                    mario.x  = (int)right_side1.getX () + 16;
                    }
                if (mario_left_side.intersects (right_side2))
                    {
                    mario_is_touching_side_block = true;
                    mario.dx = 0;

                    mario.x  = (int)right_side2.getX () + 16;
                    }
                if (mario_left_side.intersects (right_side3))
                    {
                    mario_is_touching_side_block = true;
                    mario.dx = 0;

                    mario.x  = (int)right_side3.getX () + 16;
                    }
                if (mario_left_side.intersects (right_side4))
                    {
                    mario_is_touching_side_block = true;
                    mario.dx = 0;

                    mario.x  = (int)right_side4.getX () + 16;
                    }
                else if (mario_bot_side.intersects (top_side1))
                    {
                    mario_is_touching_top_pipe = true;
                    mario.end_jump (false);

                    mario.y = mario_resting_stair1;
                    }
                else if (mario_bot_side.intersects (top_side2))
                    {
                    mario_is_touching_top_pipe = true;
                    mario.end_jump (false);

                    mario.y = mario_resting_stair2;
                    }
                else if (mario_bot_side.intersects (top_side3))
                    {
                    mario_is_touching_top_pipe = true;
                    mario.end_jump (false);

                    mario.y = mario_resting_stair3;
                    }
                else if (mario_bot_side.intersects (top_side4))
                    {
                    mario_is_touching_top_pipe = true;
                    mario.end_jump (false);

                    mario.y = mario_resting_stair4;
                    }
                else if (mario_right_side.intersects (left_side))
                    {
                    mario_is_touching_side_block = true;
                    mario.dx = 0;

                    mario.x  = (int) left_side.getX () - 40;
                    }
                else if (!mario.jump.isRunning () && !mario_bot_side.intersects (top_side1) && !mario_bot_side.intersects (top_side2) 
                        && !mario_bot_side.intersects (top_side3) && !mario_bot_side.intersects (top_side4) && mario.y < Mario.floor_border && !mario_is_touching_top_pipe
                        && !Mario.pole_slide && !Mario.pole_slide_left && !Mario.pole_slide_finished)
                    {
                    mario.back_to_ground.start ();
                    }

                if (!mario_bot_side.intersects (top_side1) && !mario_bot_side.intersects (top_side2) && !mario_bot_side.intersects (top_side3) && !mario_bot_side.intersects (top_side4))
                    {
                    mario_is_touching_top_pipe = false;
                    }
                if (!mario_right_side.intersects (right_side1) && !mario_right_side.intersects (right_side2) && !mario_right_side.intersects (right_side3) &&
                    !mario_right_side.intersects (right_side4) && !mario_left_side.intersects (left_side) && mario_is_touching_side_block)
                    {
                    mario_is_touching_side_block = false;
                    }
                }
            else if (stair.type == 2)
                {
                Rectangle left_side1 = new Rectangle ();
                Rectangle top_side1  = new Rectangle ();
                Rectangle left_side2 = new Rectangle ();
                Rectangle top_side2  = new Rectangle ();
                Rectangle left_side3 = new Rectangle ();
                Rectangle top_side3  = new Rectangle ();
                Rectangle left_side4 = new Rectangle ();
                Rectangle top_side4  = new Rectangle ();
                Rectangle right_side = new Rectangle ();
                
                left_side1 = new Rectangle (stair.get_x (), stair.get_y () + 149, (int)(stair.get_stairs_image (0).getImage ().getWidth (null) / stairs_scale_rate / 14), (int)(stair.get_stairs_image (0).getImage ().getHeight (null) / warp_pipe_scale_rate / 2.2));
                top_side1  = new Rectangle (stair.get_x (), stair.get_y () + 149, (int)(stair.get_stairs_image (0).getImage ().getWidth (null) / stairs_scale_rate / 4), (int)(stair.get_stairs_image (0).getImage ().getHeight (null) / warp_pipe_scale_rate / 8));
                left_side2 = new Rectangle (stair.get_x () + 50, stair.get_y () + 99, (int)(stair.get_stairs_image (0).getImage ().getWidth (null) / stairs_scale_rate / 14), (int)(stair.get_stairs_image (0).getImage ().getHeight (null) / warp_pipe_scale_rate / 2.2));
                top_side2  = new Rectangle (stair.get_x () + 50, stair.get_y () + 99, (int)(stair.get_stairs_image (0).getImage ().getWidth (null) / stairs_scale_rate / 4), (int)(stair.get_stairs_image (0).getImage ().getHeight (null) / warp_pipe_scale_rate / 8));
                left_side3 = new Rectangle (stair.get_x () + 100, stair.get_y () + 49, (int)(stair.get_stairs_image (0).getImage ().getWidth (null) / stairs_scale_rate / 14), (int)(stair.get_stairs_image (0).getImage ().getHeight (null) / warp_pipe_scale_rate / 2.2));
                top_side3  = new Rectangle (stair.get_x () + 100, stair.get_y () + 49, (int)(stair.get_stairs_image (0).getImage ().getWidth (null) / stairs_scale_rate / 4), (int)(stair.get_stairs_image (0).getImage ().getHeight (null) / warp_pipe_scale_rate / 8));
                left_side4 = new Rectangle (stair.get_x () + 150, stair.get_y () - 1, (int)(stair.get_stairs_image (0).getImage ().getWidth (null) / stairs_scale_rate / 14), (int)(stair.get_stairs_image (0).getImage ().getHeight (null) / warp_pipe_scale_rate / 2.2));
                top_side4  = new Rectangle (stair.get_x () + 150, stair.get_y () - 1, (int)(stair.get_stairs_image (0).getImage ().getWidth (null) / stairs_scale_rate / 2), (int)(stair.get_stairs_image (0).getImage ().getHeight (null) / warp_pipe_scale_rate / 8));
                right_side = new Rectangle (stair.get_x () + (int)(stair.get_stairs_image (0).getImage ().getWidth (null) / stairs_scale_rate) + 35, stair.get_y () - 1, (int)(stair.get_stairs_image (0).getImage ().getWidth (null) / stairs_scale_rate / 14), (int)(stair.get_stairs_image (0).getImage ().getHeight (null) / 1.86));
                
                if (mario_right_side.intersects (left_side1))
                    {
                    mario_is_touching_side_block = true;
                    mario.dx = 0;

                    mario.x  = (int)left_side1.getX () - 40;
                    }
                else if (mario_right_side.intersects (left_side2))
                    {
                    mario_is_touching_side_block = true;
                    mario.dx = 0;

                    mario.x  = (int)left_side2.getX () - 40;
                    }
                else if (mario_right_side.intersects (left_side3))
                    {
                    mario_is_touching_side_block = true;
                    mario.dx = 0;

                    mario.x  = (int)left_side3.getX () - 40;
                    }
                else if (mario_right_side.intersects (left_side4))
                    {
                    mario_is_touching_side_block = true;
                    mario.dx = 0;

                    mario.x  = (int)left_side4.getX () - 40;
                    }
                else if (mario_bot_side.intersects (top_side1))
                    {
                    mario_is_touching_top_pipe = true;
                    mario.end_jump (false);

                    mario.y = mario_resting_stair1;
                    }
                else if (mario_bot_side.intersects (top_side2))
                    {
                    mario_is_touching_top_pipe = true;
                    mario.end_jump (false);

                    mario.y = mario_resting_stair2;
                    }
                else if (mario_bot_side.intersects (top_side3))
                    {
                    mario_is_touching_top_pipe = true;
                    mario.end_jump (false);

                    mario.y = mario_resting_stair3;
                    }
                else if (mario_bot_side.intersects (top_side4))
                    {
                    mario_is_touching_top_pipe = true;
                    mario.end_jump (false);

                    mario.y = mario_resting_stair4;
                    }
                else if (mario_left_side.intersects (right_side))
                    {
                    mario_is_touching_side_block = true;
                    mario.dx = 0;

                    mario.x  = (int) right_side.getX () + 16;
                    }
                else if (!mario.jump.isRunning () && !mario_bot_side.intersects (top_side1) && !mario_bot_side.intersects (top_side2) 
                        && !mario_bot_side.intersects (top_side3) && !mario_bot_side.intersects (top_side4) && mario.y < Mario.floor_border && !mario_is_touching_top_pipe
                        && !Mario.pole_slide && !Mario.pole_slide_left && !Mario.pole_slide_finished)
                    {
                    mario.back_to_ground.start ();
                    }

                if (!mario_bot_side.intersects (top_side1) && !mario_bot_side.intersects (top_side2) && !mario_bot_side.intersects (top_side3) && !mario_bot_side.intersects (top_side4))
                    {
                    mario_is_touching_top_pipe = false;
                    }
                if (!mario_right_side.intersects (left_side1) && !mario_right_side.intersects (left_side2) && !mario_right_side.intersects (left_side3) &&
                    !mario_right_side.intersects (left_side4) && !mario_left_side.intersects (right_side) && mario_is_touching_side_block)
                    {
                    mario_is_touching_side_block = false;
                    }
                }
            if (stair.type == 3)
                {
                Rectangle left_side1 = new Rectangle ();
                Rectangle top_side1  = new Rectangle ();
                Rectangle left_side2 = new Rectangle ();
                Rectangle top_side2  = new Rectangle ();
                Rectangle left_side3 = new Rectangle ();
                Rectangle top_side3  = new Rectangle ();
                Rectangle left_side4 = new Rectangle ();
                Rectangle top_side4  = new Rectangle ();
                Rectangle left_side5 = new Rectangle ();
                Rectangle top_side5  = new Rectangle ();
                Rectangle left_side6 = new Rectangle ();
                Rectangle top_side6  = new Rectangle ();
                Rectangle left_side7 = new Rectangle ();
                Rectangle top_side7  = new Rectangle ();
                Rectangle left_side8 = new Rectangle ();
                Rectangle top_side8  = new Rectangle ();
                Rectangle right_side = new Rectangle ();
                
                left_side1 = new Rectangle (stair.get_x (), stair.get_y () + 348, (int)(stair.get_stairs_image (0).getImage ().getWidth (null) / stairs_scale_rate / 14), (int)(stair.get_stairs_image (0).getImage ().getHeight (null) / warp_pipe_scale_rate / 2.2));
                top_side1  = new Rectangle (stair.get_x (), stair.get_y () + 348, (int)(stair.get_stairs_image (0).getImage ().getWidth (null) / stairs_scale_rate / 4), (int)(stair.get_stairs_image (0).getImage ().getHeight (null) / warp_pipe_scale_rate / 8));
                left_side2 = new Rectangle (stair.get_x () + 50, stair.get_y () + 298, (int)(stair.get_stairs_image (0).getImage ().getWidth (null) / stairs_scale_rate / 14), (int)(stair.get_stairs_image (0).getImage ().getHeight (null) / warp_pipe_scale_rate / 2.2));
                top_side2  = new Rectangle (stair.get_x () + 50, stair.get_y () + 298, (int)(stair.get_stairs_image (0).getImage ().getWidth (null) / stairs_scale_rate / 4), (int)(stair.get_stairs_image (0).getImage ().getHeight (null) / warp_pipe_scale_rate / 8));
                left_side3 = new Rectangle (stair.get_x () + 100, stair.get_y () + 248, (int)(stair.get_stairs_image (0).getImage ().getWidth (null) / stairs_scale_rate / 14), (int)(stair.get_stairs_image (0).getImage ().getHeight (null) / warp_pipe_scale_rate / 2.2));
                top_side3  = new Rectangle (stair.get_x () + 100, stair.get_y () + 248, (int)(stair.get_stairs_image (0).getImage ().getWidth (null) / stairs_scale_rate / 4), (int)(stair.get_stairs_image (0).getImage ().getHeight (null) / warp_pipe_scale_rate / 8));
                left_side4 = new Rectangle (stair.get_x () + 150, stair.get_y () + 198, (int)(stair.get_stairs_image (0).getImage ().getWidth (null) / stairs_scale_rate / 14), (int)(stair.get_stairs_image (0).getImage ().getHeight (null) / warp_pipe_scale_rate / 2.2));
                top_side4  = new Rectangle (stair.get_x () + 150, stair.get_y () + 198, (int)(stair.get_stairs_image (0).getImage ().getWidth (null) / stairs_scale_rate / 4), (int)(stair.get_stairs_image (0).getImage ().getHeight (null) / warp_pipe_scale_rate / 8));
                left_side5 = new Rectangle (stair.get_x () + 200, stair.get_y () + 148, (int)(stair.get_stairs_image (0).getImage ().getWidth (null) / stairs_scale_rate / 14), (int)(stair.get_stairs_image (0).getImage ().getHeight (null) / warp_pipe_scale_rate / 2.2));
                top_side5  = new Rectangle (stair.get_x () + 200, stair.get_y () + 148, (int)(stair.get_stairs_image (0).getImage ().getWidth (null) / stairs_scale_rate / 4), (int)(stair.get_stairs_image (0).getImage ().getHeight (null) / warp_pipe_scale_rate / 8));
                left_side6 = new Rectangle (stair.get_x () + 250, stair.get_y () + 98, (int)(stair.get_stairs_image (0).getImage ().getWidth (null) / stairs_scale_rate / 14), (int)(stair.get_stairs_image (0).getImage ().getHeight (null) / warp_pipe_scale_rate / 2.2));
                top_side6  = new Rectangle (stair.get_x () + 250, stair.get_y () + 98, (int)(stair.get_stairs_image (0).getImage ().getWidth (null) / stairs_scale_rate / 4), (int)(stair.get_stairs_image (0).getImage ().getHeight (null) / warp_pipe_scale_rate / 8));
                left_side7 = new Rectangle (stair.get_x () + 300, stair.get_y () + 48, (int)(stair.get_stairs_image (0).getImage ().getWidth (null) / stairs_scale_rate / 14), (int)(stair.get_stairs_image (0).getImage ().getHeight (null) / warp_pipe_scale_rate / 2.2));
                top_side7  = new Rectangle (stair.get_x () + 300, stair.get_y () + 48, (int)(stair.get_stairs_image (0).getImage ().getWidth (null) / stairs_scale_rate / 4), (int)(stair.get_stairs_image (0).getImage ().getHeight (null) / warp_pipe_scale_rate / 8));
                left_side8 = new Rectangle (stair.get_x () + 350, stair.get_y () - 2, (int)(stair.get_stairs_image (0).getImage ().getWidth (null) / stairs_scale_rate / 14), (int)(stair.get_stairs_image (0).getImage ().getHeight (null) / warp_pipe_scale_rate / 2.2));
                top_side8  = new Rectangle (stair.get_x () + 350, stair.get_y () - 2, (int)(stair.get_stairs_image (0).getImage ().getWidth (null) / stairs_scale_rate / 2.04), (int)(stair.get_stairs_image (0).getImage ().getHeight (null) / warp_pipe_scale_rate / 8));
                right_side = new Rectangle (stair.get_x () + (int)(stair.get_stairs_image (0).getImage ().getWidth (null) / stairs_scale_rate) + 235, stair.get_y () - 1, (int)(stair.get_stairs_image (0).getImage ().getWidth (null) / stairs_scale_rate / 14), (int)(stair.get_stairs_image (0).getImage ().getHeight (null) / 0.93));
                
                if (mario_right_side.intersects (left_side1))
                    {
                    mario_is_touching_side_block = true;
                    mario.dx = 0;

                    mario.x  = (int)left_side1.getX () - 40;
                    }
                else if (mario_right_side.intersects (left_side2))
                    {
                    mario_is_touching_side_block = true;
                    mario.dx = 0;

                    mario.x  = (int)left_side2.getX () - 40;
                    }
                else if (mario_right_side.intersects (left_side3))
                    {
                    mario_is_touching_side_block = true;
                    mario.dx = 0;

                    mario.x  = (int)left_side3.getX () - 40;
                    }
                else if (mario_right_side.intersects (left_side4))
                    {
                    mario_is_touching_side_block = true;
                    mario.dx = 0;

                    mario.x  = (int)left_side4.getX () - 40;
                    }
                else if (mario_right_side.intersects (left_side5))
                    {
                    mario_is_touching_side_block = true;
                    mario.dx = 0;

                    mario.x  = (int)left_side5.getX () - 40;
                    }
                else if (mario_right_side.intersects (left_side6))
                    {
                    mario_is_touching_side_block = true;
                    mario.dx = 0;

                    mario.x  = (int)left_side6.getX () - 40;
                    }
                else if (mario_right_side.intersects (left_side7))
                    {
                    mario_is_touching_side_block = true;
                    mario.dx = 0;

                    mario.x  = (int)left_side7.getX () - 40;
                    }
                else if (mario_right_side.intersects (left_side8))
                    {
                    mario_is_touching_side_block = true;
                    mario.dx = 0;

                    mario.x  = (int)left_side8.getX () - 40;
                    }
                else if (mario_bot_side.intersects (top_side1))
                    {
                    mario_is_touching_top_pipe = true;
                    mario.end_jump (false);

                    mario.y = mario_resting_stair1;
                    }
                else if (mario_bot_side.intersects (top_side2))
                    {
                    mario_is_touching_top_pipe = true;
                    mario.end_jump (false);

                    mario.y = mario_resting_stair2;
                    }
                else if (mario_bot_side.intersects (top_side3))
                    {
                    mario_is_touching_top_pipe = true;
                    mario.end_jump (false);

                    mario.y = mario_resting_stair3;
                    }
                else if (mario_bot_side.intersects (top_side4))
                    {
                    mario_is_touching_top_pipe = true;
                    mario.end_jump (false);

                    mario.y = mario_resting_stair4;
                    }
                else if (mario_bot_side.intersects (top_side5))
                    {
                    mario_is_touching_top_pipe = true;
                    mario.end_jump (false);

                    mario.y = mario_resting_stair5;
                    }
                else if (mario_bot_side.intersects (top_side6))
                    {
                    mario_is_touching_top_pipe = true;
                    mario.end_jump (false);

                    mario.y = mario_resting_stair6;
                    }
                else if (mario_bot_side.intersects (top_side7))
                    {
                    mario_is_touching_top_pipe = true;
                    mario.end_jump (false);

                    mario.y = mario_resting_stair7;
                    }
                else if (mario_bot_side.intersects (top_side8))
                    {
                    mario_is_touching_top_pipe = true;
                    mario.end_jump (false);

                    mario.y = mario_resting_stair8;
                    }
                else if (mario_left_side.intersects (right_side))
                    {
                    mario_is_touching_side_block = true;
                    mario.dx = 0;

                    mario.x  = (int) right_side.getX () + 16;
                    }
                else if (!mario.jump.isRunning () && !mario_bot_side.intersects (top_side1) && !mario_bot_side.intersects (top_side2) 
                        && !mario_bot_side.intersects (top_side3) && !mario_bot_side.intersects (top_side4) 
                        && !mario_bot_side.intersects (top_side5) && !mario_bot_side.intersects (top_side6) 
                        && !mario_bot_side.intersects (top_side7) && !mario_bot_side.intersects (top_side8) 
                        && mario.y < Mario.floor_border && !mario_is_touching_top_pipe && !Mario.pole_slide && !Mario.pole_slide_left && !Mario.pole_slide_finished)
                    {
                    mario.back_to_ground.start ();
                    }

                if (!mario_bot_side.intersects (top_side1) && !mario_bot_side.intersects (top_side2) && !mario_bot_side.intersects (top_side3) && !mario_bot_side.intersects (top_side4) &&
                    !mario_bot_side.intersects (top_side5) && !mario_bot_side.intersects (top_side6) && !mario_bot_side.intersects (top_side7) && !mario_bot_side.intersects (top_side8))
                    {
                    mario_is_touching_top_pipe = false;
                    }
                if (!mario_right_side.intersects (left_side1) && !mario_right_side.intersects (left_side2) && !mario_right_side.intersects (left_side3) &&
                    !mario_right_side.intersects (left_side4) && !mario_right_side.intersects (left_side5) && 
                    !mario_right_side.intersects (left_side6) && !mario_right_side.intersects (left_side7) && 
                    !mario_right_side.intersects (left_side8) && !mario_left_side.intersects (right_side) && mario_is_touching_side_block)
                    {
                    mario_is_touching_side_block = false;
                    }
                }
            
            }
        }
    
    public void check_goomba_collision (Rectangle mario_object)
        {
        Rectangle mario_left_side  = new Rectangle (mario.get_x (), mario.get_y () + mario_y_axis_pad, (int) (mario.neutral_mario.getIconWidth () / 8.4), (int) (mario.neutral_mario.getIconHeight () / 1.4));
        Rectangle mario_right_side = new Rectangle (mario.get_x () + (int)mario_object.getWidth (), mario.get_y () + mario_y_axis_pad, (int) (mario.neutral_mario.getIconWidth () / 8.4), (int) (mario.neutral_mario.getIconHeight () / 1.4));
        Rectangle mario_top_side   = new Rectangle (mario.get_x (), mario.get_y () + mario_y_axis_pad, (int) (mario.neutral_mario.getIconWidth () / 1.4), (int) (mario.neutral_mario.getIconHeight () / 10.4));
        Rectangle mario_bot_side   = new Rectangle (mario.get_x (), mario.get_y () + mario_y_axis_pad + (int)mario_object.getHeight () - 5, (int) (mario.neutral_mario.getIconWidth () / 1.4), (int) (mario.neutral_mario.getIconHeight () / 11.4));

        for (Goomba enemy : goombas)
            {
            if (enemy.get_x () >=1250 || enemy.get_x () <= -(int)(enemy.get_enemy_image ().getImage ().getWidth (null) / goomba_scale_rate))
                {
                continue;
                }
            Rectangle enemy_left_side  = new Rectangle (enemy.get_x (), enemy.get_y (), (int)(enemy.get_enemy_image ().getImage ().getWidth (null) / goomba_scale_rate / 4), (int)(enemy.get_enemy_image ().getImage ().getHeight (null) / goomba_scale_rate));
            Rectangle enemy_right_side  = new Rectangle (enemy.get_x () + (int)(enemy.get_enemy_image ().getImage ().getWidth (null) / goomba_scale_rate) - 11, enemy.get_y (), (int)(enemy.get_enemy_image ().getImage ().getWidth (null) / goomba_scale_rate / 4), (int)(enemy.get_enemy_image ().getImage ().getHeight (null) / goomba_scale_rate));
            Rectangle enemy_top_side  = new Rectangle (enemy.get_x (), enemy.get_y (), (int)(enemy.get_enemy_image ().getImage ().getWidth (null) / goomba_scale_rate), (int)(enemy.get_enemy_image ().getImage ().getHeight (null) / goomba_scale_rate) / 4);
            Rectangle enemy_bot_side  = new Rectangle (enemy.get_x (), enemy.get_y () + (int)(enemy.get_enemy_image ().getImage ().getHeight (null) / goomba_scale_rate) - 10, (int)(enemy.get_enemy_image ().getImage ().getWidth (null) / goomba_scale_rate), (int)(enemy.get_enemy_image ().getImage ().getHeight (null) / goomba_scale_rate) / 4);

            Rectangle pipe_left_side = new Rectangle ();
            Rectangle pipe_right_side = new Rectangle ();
            Rectangle pipe_top_side = new Rectangle ();
            
            for (WarpPipe pipe: warp_pipes)
                {
                if (pipe.get_x () >=1250 || pipe.get_x () <= -(int) (pipe.get_pipe_image (2).getImage ().getWidth (null) / warp_pipe_scale_rate))
                    {
                    continue;
                    }
                int warp_pipe_width;
                int warp_pipe_height;


                if (pipe.size == 0)
                    {
                    warp_pipe_width  = (int)(pipe.get_pipe_image (0).getImage ().getWidth (null) / warp_pipe_scale_rate);
                    warp_pipe_height = (int)(pipe.get_pipe_image (0).getImage ().getHeight (null) / warp_pipe_scale_rate);

                    pipe_left_side  = new Rectangle (pipe.get_x (), pipe.get_y () + 3, (int)(pipe.get_pipe_image (0).getImage ().getWidth (null) / warp_pipe_scale_rate / 11), (int)(pipe.get_pipe_image (0).getImage ().getHeight (null) / warp_pipe_scale_rate) - 3);
                    pipe_right_side = new Rectangle (pipe.get_x () + warp_pipe_width - 9, pipe.get_y () + 3, (int)(pipe.get_pipe_image (0).getImage ().getWidth (null) / warp_pipe_scale_rate / 11), (int)(pipe.get_pipe_image (0).getImage ().getHeight (null) / warp_pipe_scale_rate) - 3);
                    pipe_top_side   = new Rectangle (pipe.get_x (), pipe.get_y (), (int)(pipe.get_pipe_image (0).getImage ().getWidth (null) / warp_pipe_scale_rate), (int)(pipe.get_pipe_image (0).getImage ().getHeight (null) / warp_pipe_scale_rate / 7));
                    }
                else if (pipe.size == 1)
                    {
                    warp_pipe_width  = (int)(pipe.get_pipe_image (1).getImage ().getWidth (null) / warp_pipe_scale_rate);
                    warp_pipe_height = (int)(pipe.get_pipe_image (1).getImage ().getHeight (null) / warp_pipe_scale_rate);  

                    pipe_left_side  = new Rectangle (pipe.get_x (), pipe.get_y () + 3, (int)(pipe.get_pipe_image (1).getImage ().getWidth (null) / warp_pipe_scale_rate / 11), (int)(pipe.get_pipe_image (1).getImage ().getHeight (null) / warp_pipe_scale_rate) - 3);
                    pipe_right_side = new Rectangle (pipe.get_x () + warp_pipe_width - 9, pipe.get_y () + 3, (int)(pipe.get_pipe_image (1).getImage ().getWidth (null) / warp_pipe_scale_rate / 11), (int)(pipe.get_pipe_image (1).getImage ().getHeight (null) / warp_pipe_scale_rate) - 3);
                    pipe_top_side   = new Rectangle (pipe.get_x (), pipe.get_y (), (int)(pipe.get_pipe_image (1).getImage ().getWidth (null) / warp_pipe_scale_rate), (int)(pipe.get_pipe_image (1).getImage ().getHeight (null) / warp_pipe_scale_rate / 13));
                    }
                else if (pipe.size == 2)
                    {
                    warp_pipe_width  = (int)(pipe.get_pipe_image (2).getImage ().getWidth (null) / warp_pipe_scale_rate);
                    warp_pipe_height = (int)(pipe.get_pipe_image (2).getImage ().getHeight (null) / warp_pipe_scale_rate);

                    pipe_left_side  = new Rectangle (pipe.get_x (), pipe.get_y () + 3, (int)(pipe.get_pipe_image (2).getImage ().getWidth (null) / warp_pipe_scale_rate / 11), (int)(pipe.get_pipe_image (2).getImage ().getHeight (null) / warp_pipe_scale_rate) - 3);
                    pipe_right_side = new Rectangle (pipe.get_x () + warp_pipe_width - 9, pipe.get_y () + 3, (int)(pipe.get_pipe_image (2).getImage ().getWidth (null) / warp_pipe_scale_rate / 11), (int)(pipe.get_pipe_image (2).getImage ().getHeight (null) / warp_pipe_scale_rate) - 3);
                    pipe_top_side   = new Rectangle (pipe.get_x (), pipe.get_y (), (int)(pipe.get_pipe_image (2).getImage ().getWidth (null) / warp_pipe_scale_rate), (int)(pipe.get_pipe_image (2).getImage ().getHeight (null) / warp_pipe_scale_rate / 16));
                    }

                if (enemy_right_side.intersects (pipe_left_side))
                    {
                    enemy.moving_left = true;
                    }
                else if (enemy_left_side.intersects (pipe_right_side))
                    {
                    enemy.moving_left = false;
                    }
                }
            
            for (Stairs stair : stairs)
                {
                if (stair.type == 0)
                    {
                    Rectangle left_side1 = new Rectangle ();
                    left_side1 = new Rectangle (stair.get_x (), stair.get_y () + 149, (int)(stair.get_stairs_image (0).getImage ().getWidth (null) / stairs_scale_rate / 14), (int)(stair.get_stairs_image (0).getImage ().getHeight (null) / warp_pipe_scale_rate / 2.2));
                    
                    if (enemy_right_side.intersects (left_side1))
                        {
                        enemy.moving_left = true;
                        }
                    }
                }
            
            for (Block block : all_blocks)
                {
                if (block.get_x () >=1250 || block.get_x () <= -(int)(block.get_block_image ().getImage ().getWidth (null) / block_scale_rate))
                    {
                    continue;
                    }
                int question_block_width  = (int)(block.get_block_image ().getImage ().getWidth (null) / block_scale_rate);
                int question_block_height = (int)(block.get_block_image ().getImage ().getHeight (null) / block_scale_rate);
                Rectangle block_top_side   = new Rectangle (block.get_x (), block.get_y (), (int)(block.get_block_image ().getImage ().getWidth (null) / block_scale_rate), (int)(block.get_block_image ().getImage ().getHeight (null) / block_scale_rate / 4));
                Rectangle block_bot_side   = new Rectangle (block.get_x (), block.get_y () + question_block_height - 1, (int)(block.get_block_image ().getImage ().getWidth (null) / block_scale_rate), (int)(block.get_block_image ().getImage ().getHeight (null) / block_scale_rate / 11));
                
                if (mario_top_side.intersects (block_bot_side) && enemy_bot_side.intersects (block_top_side))
                    {
                    if (!enemy.hit_from_below)
                        {
                        enemy.flipped = true;
                        enemy.dead_y = enemy.get_y ();
                        enemy.walk.stop ();
                        enemy.goomba_dying_animate.start ();
                        }
                    }
                else
                    {
                    if (enemy_bot_side.intersects (block_top_side))
                        {
                        enemy.dy = 0;
                        if (block.y == 362)
                            {
                            enemy.y = mario_resting_high_block_y + 50;
                            }
                        else if (block.y == 571)
                            {
                            enemy.y = mario_resting_low_block_y + 54;
                            }
                        }
                    
                    if (enemy.flipped && enemy.goomba_dying_reverse_animate.isRunning ())
                        {
                        enemy.dy = 7;
                        }
                    else if (enemy_bot_side.intersects (floor_object1) || enemy_bot_side.intersects (floor_object2)
                        || enemy_bot_side.intersects (floor_object3) || enemy_bot_side.intersects (floor_object4) 
                        && (!enemy.goomba_dying_animate.isRunning () && !enemy.goomba_dying_reverse_animate.isRunning () && !enemy.flipped))
                        {
                        enemy.dy = 0;
                        }
                    else
                        {
                        if (!enemy.goomba_dying_animate.isRunning () && !enemy.squish)
                        enemy.dy = 6;
                        }
                    }
                
                }            
            
                if (mario_bot_side.intersects (enemy_top_side))
                    {
                    if (!enemy.squish)
                        {
                        enemy.set_y (enemy.get_y () + 22);
                        enemy.squish = true;
                        mario.end_jump (false);
                        enemy.dissapear.start ();
                        mario.dy -= 9;
                        }
                    }
                else if (mario_right_side.intersects (enemy_left_side) && !enemy.squish)
                    {
                    enemy.did_kill = true;
                    mario.is_dead = true;
                    mario.x -= 5;
                    removeKeyListener (key);
                    mario.end_jump (false);
                    mario.pole_slide_cleanup ();
                    Mario.dead_y = mario.get_y ();
                    mario.mario_dying_animate.setInitialDelay (600);
                    mario.mario_dying_reverse_animate.setInitialDelay (80);
                    mario.mario_dying_animate.start ();
                    }
                else if (mario_left_side.intersects (enemy_right_side) && !enemy.squish)
                    {
                    enemy.did_kill = true;
                    mario.is_dead = true;
                    mario.x += 5;
                    removeKeyListener (key);
                    mario.end_jump (false);
                    mario.pole_slide_cleanup ();
                    Mario.dead_y = mario.get_y ();
                    mario.mario_dying_animate.setInitialDelay (600);
                    mario.mario_dying_reverse_animate.setInitialDelay (80);
                    mario.mario_dying_animate.start ();
                    }

                
                for (Goomba goomba : goombas)
                    {
                    if (goomba.get_x () >=1250 || goomba.get_x () <= -(int)(goomba.get_enemy_image ().getImage ().getWidth (null) / goomba_scale_rate))
                        {
                        continue;
                        }

                    Rectangle goomba_left_side  = new Rectangle (goomba.get_x (), goomba.get_y (), (int)(goomba.get_enemy_image ().getImage ().getWidth (null) / goomba_scale_rate / 4), (int)(goomba.get_enemy_image ().getImage ().getHeight (null) / goomba_scale_rate));
                    Rectangle goomba_right_side  = new Rectangle (goomba.get_x () + (int)(goomba.get_enemy_image ().getImage ().getWidth (null) / goomba_scale_rate) - 11, goomba.get_y (), (int)(goomba.get_enemy_image ().getImage ().getWidth (null) / goomba_scale_rate / 4), (int)(goomba.get_enemy_image ().getImage ().getHeight (null) / goomba_scale_rate));
                    Rectangle goomba_top_side  = new Rectangle (goomba.get_x (), goomba.get_y (), (int)(goomba.get_enemy_image ().getImage ().getWidth (null) / goomba_scale_rate), (int)(goomba.get_enemy_image ().getImage ().getHeight (null) / goomba_scale_rate) / 4);

                    if (enemy_right_side.intersects (goomba_left_side))
                        {
                        enemy.moving_left = true;
                        goomba.moving_left = false;
                        }
                    else if (enemy_left_side.intersects (goomba_right_side))
                        {
                        enemy.moving_left = false;
                        goomba.moving_left = true;
                        }
                    }
//                graphics.fill (mario_left_side);
//                graphics.fill (mario_right_side);
//                graphics.fill (mario_top_side);
//                graphics.fill (enemy_left_side);
//                graphics.fill (enemy_right_side);
//                graphics.fill (enemy_top_side);
//                graphics.fill (enemy_bot_side);
                
            }
        }
    
    public void check_koopa_collision (Rectangle mario_object)
        {
        Rectangle mario_left_side  = new Rectangle (mario.get_x (), mario.get_y () + mario_y_axis_pad, (int) (mario.neutral_mario.getIconWidth () / 8.4), (int) (mario.neutral_mario.getIconHeight () / 1.4));
        Rectangle mario_right_side = new Rectangle (mario.get_x () + (int)mario_object.getWidth (), mario.get_y () + mario_y_axis_pad, (int) (mario.neutral_mario.getIconWidth () / 8.4), (int) (mario.neutral_mario.getIconHeight () / 1.4));
        Rectangle mario_top_side   = new Rectangle (mario.get_x (), mario.get_y () + mario_y_axis_pad, (int) (mario.neutral_mario.getIconWidth () / 1.4), (int) (mario.neutral_mario.getIconHeight () / 10.4));
        Rectangle mario_bot_side   = new Rectangle (mario.get_x (), mario.get_y () + mario_y_axis_pad + (int)mario_object.getHeight () - 5, (int) (mario.neutral_mario.getIconWidth () / 1.4), (int) (mario.neutral_mario.getIconHeight () / 11.4));

        for (Koopa koopa : koopas)
            {
            if (koopa.get_x () >=1250 || koopa.get_x () <= -(int)(koopa.get_enemy_image ().getImage ().getWidth (null) / goomba_scale_rate))
                {
                continue;
                }
            Rectangle enemy_left_side  = new Rectangle (koopa.get_x (), koopa.get_y (), (int)(koopa.get_enemy_image ().getImage ().getWidth (null) / koopa_scale_rate / 4), (int)(koopa.get_enemy_image ().getImage ().getHeight (null) / koopa_scale_rate));
            Rectangle enemy_right_side  = new Rectangle (koopa.get_x () + (int)(koopa.get_enemy_image ().getImage ().getWidth (null) / koopa_scale_rate) - 11, koopa.get_y (), (int)(koopa.get_enemy_image ().getImage ().getWidth (null) / koopa_scale_rate / 4), (int)(koopa.get_enemy_image ().getImage ().getHeight (null) / koopa_scale_rate));
            Rectangle enemy_top_side  = new Rectangle (koopa.get_x (), koopa.get_y (), (int)(koopa.get_enemy_image ().getImage ().getWidth (null) / koopa_scale_rate), (int)(koopa.get_enemy_image ().getImage ().getHeight (null) / koopa_scale_rate) / 4);
            Rectangle enemy_bot_side  = new Rectangle (koopa.get_x (), koopa.get_y () + (int)(koopa.get_enemy_image ().getImage ().getHeight (null) / koopa_scale_rate) - 10, (int)(koopa.get_enemy_image ().getImage ().getWidth (null) / koopa_scale_rate), (int)(koopa.get_enemy_image ().getImage ().getHeight (null) / koopa_scale_rate) / 4);

            Rectangle pipe_left_side = new Rectangle ();
            Rectangle pipe_right_side = new Rectangle ();
            Rectangle pipe_top_side = new Rectangle ();
            
            for (WarpPipe pipe: warp_pipes)
                {
                if (pipe.get_x () >=1250 || pipe.get_x () <= -(int) (pipe.get_pipe_image (2).getImage ().getWidth (null) / warp_pipe_scale_rate))
                    {
                    continue;
                    }
                int warp_pipe_width;
                int warp_pipe_height;


                if (pipe.size == 0)
                    {
                    warp_pipe_width  = (int)(pipe.get_pipe_image (0).getImage ().getWidth (null) / warp_pipe_scale_rate);
                    warp_pipe_height = (int)(pipe.get_pipe_image (0).getImage ().getHeight (null) / warp_pipe_scale_rate);

                    pipe_left_side  = new Rectangle (pipe.get_x (), pipe.get_y () + 3, (int)(pipe.get_pipe_image (0).getImage ().getWidth (null) / warp_pipe_scale_rate / 11), (int)(pipe.get_pipe_image (0).getImage ().getHeight (null) / warp_pipe_scale_rate) - 3);
                    pipe_right_side = new Rectangle (pipe.get_x () + warp_pipe_width - 9, pipe.get_y () + 3, (int)(pipe.get_pipe_image (0).getImage ().getWidth (null) / warp_pipe_scale_rate / 11), (int)(pipe.get_pipe_image (0).getImage ().getHeight (null) / warp_pipe_scale_rate) - 3);
                    pipe_top_side   = new Rectangle (pipe.get_x (), pipe.get_y (), (int)(pipe.get_pipe_image (0).getImage ().getWidth (null) / warp_pipe_scale_rate), (int)(pipe.get_pipe_image (0).getImage ().getHeight (null) / warp_pipe_scale_rate / 7));
                    }
                else if (pipe.size == 1)
                    {
                    warp_pipe_width  = (int)(pipe.get_pipe_image (1).getImage ().getWidth (null) / warp_pipe_scale_rate);
                    warp_pipe_height = (int)(pipe.get_pipe_image (1).getImage ().getHeight (null) / warp_pipe_scale_rate);  

                    pipe_left_side  = new Rectangle (pipe.get_x (), pipe.get_y () + 3, (int)(pipe.get_pipe_image (1).getImage ().getWidth (null) / warp_pipe_scale_rate / 11), (int)(pipe.get_pipe_image (1).getImage ().getHeight (null) / warp_pipe_scale_rate) - 3);
                    pipe_right_side = new Rectangle (pipe.get_x () + warp_pipe_width - 9, pipe.get_y () + 3, (int)(pipe.get_pipe_image (1).getImage ().getWidth (null) / warp_pipe_scale_rate / 11), (int)(pipe.get_pipe_image (1).getImage ().getHeight (null) / warp_pipe_scale_rate) - 3);
                    pipe_top_side   = new Rectangle (pipe.get_x (), pipe.get_y (), (int)(pipe.get_pipe_image (1).getImage ().getWidth (null) / warp_pipe_scale_rate), (int)(pipe.get_pipe_image (1).getImage ().getHeight (null) / warp_pipe_scale_rate / 13));
                    }
                else if (pipe.size == 2)
                    {
                    warp_pipe_width  = (int)(pipe.get_pipe_image (2).getImage ().getWidth (null) / warp_pipe_scale_rate);
                    warp_pipe_height = (int)(pipe.get_pipe_image (2).getImage ().getHeight (null) / warp_pipe_scale_rate);

                    pipe_left_side  = new Rectangle (pipe.get_x (), pipe.get_y () + 3, (int)(pipe.get_pipe_image (2).getImage ().getWidth (null) / warp_pipe_scale_rate / 11), (int)(pipe.get_pipe_image (2).getImage ().getHeight (null) / warp_pipe_scale_rate) - 3);
                    pipe_right_side = new Rectangle (pipe.get_x () + warp_pipe_width - 9, pipe.get_y () + 3, (int)(pipe.get_pipe_image (2).getImage ().getWidth (null) / warp_pipe_scale_rate / 11), (int)(pipe.get_pipe_image (2).getImage ().getHeight (null) / warp_pipe_scale_rate) - 3);
                    pipe_top_side   = new Rectangle (pipe.get_x (), pipe.get_y (), (int)(pipe.get_pipe_image (2).getImage ().getWidth (null) / warp_pipe_scale_rate), (int)(pipe.get_pipe_image (2).getImage ().getHeight (null) / warp_pipe_scale_rate / 16));
                    }

                if (enemy_right_side.intersects (pipe_left_side))
                    {
                    koopa.moving_left = true;
                    }
                else if (enemy_left_side.intersects (pipe_right_side))
                    {
                    koopa.moving_left = false;
                    }
                }
            
            if (mario_bot_side.intersects (enemy_top_side))
                {
                if (!koopa.squish)
                    {
                    koopa.set_y (koopa.get_y () + 22);
                    koopa.squish = true;
                    mario.end_jump (false);
//                    enemy.dissapear.start ();
                    mario.dy -= 9;
                    }
                }
            else if (mario_right_side.intersects (enemy_left_side) && !koopa.squish)
                {
                koopa.did_kill = true;
                mario.is_dead = true;
                mario.x -= 5;
                removeKeyListener (key);
                mario.end_jump (false);
                mario.pole_slide_cleanup ();
                Mario.dead_y = mario.get_y ();
                mario.mario_dying_animate.setInitialDelay (600);
                mario.mario_dying_reverse_animate.setInitialDelay (80);
                mario.mario_dying_animate.start ();
                }
            else if (mario_left_side.intersects (enemy_right_side) && !koopa.squish)
                {
                koopa.did_kill = true;
                mario.is_dead = true;
                mario.x += 5;
                removeKeyListener (key);
                mario.end_jump (false);
                mario.pole_slide_cleanup ();
                Mario.dead_y = mario.get_y ();
                mario.mario_dying_animate.setInitialDelay (600);
                mario.mario_dying_reverse_animate.setInitialDelay (80);
                mario.mario_dying_animate.start ();
                }


            for (Goomba goomba : goombas)
                {
                if (goomba.get_x () >=1250 || goomba.get_x () <= -(int)(goomba.get_enemy_image ().getImage ().getWidth (null) / goomba_scale_rate))
                    {
                    continue;
                    }

                Rectangle goomba_left_side  = new Rectangle (goomba.get_x (), goomba.get_y (), (int)(goomba.get_enemy_image ().getImage ().getWidth (null) / goomba_scale_rate / 4), (int)(goomba.get_enemy_image ().getImage ().getHeight (null) / goomba_scale_rate));
                Rectangle goomba_right_side  = new Rectangle (goomba.get_x () + (int)(goomba.get_enemy_image ().getImage ().getWidth (null) / goomba_scale_rate) - 11, goomba.get_y (), (int)(goomba.get_enemy_image ().getImage ().getWidth (null) / goomba_scale_rate / 4), (int)(goomba.get_enemy_image ().getImage ().getHeight (null) / goomba_scale_rate));
                Rectangle goomba_top_side  = new Rectangle (goomba.get_x (), goomba.get_y (), (int)(goomba.get_enemy_image ().getImage ().getWidth (null) / goomba_scale_rate), (int)(goomba.get_enemy_image ().getImage ().getHeight (null) / goomba_scale_rate) / 4);

                if (enemy_right_side.intersects (goomba_left_side))
                    {
                    koopa.flipped = false;
                    koopa.moving_left = true;
                    goomba.moving_left = false;
                    }
                else if (enemy_left_side.intersects (goomba_right_side))
                    {
                    koopa.flipped = true;
                    koopa.moving_left = false;
                    goomba.moving_left = true;
                    }
                }
//                graphics.fill (mario_left_side);
//                graphics.fill (mario_right_side);
//                graphics.fill (mario_top_side);
//                graphics.fill (enemy_left_side);
//                graphics.fill (enemy_right_side);
//                graphics.fill (enemy_top_side);
//                graphics.fill (enemy_bot_side);
                
            }
        }
    
    private class AL extends KeyAdapter 
        {
        public void keyReleased (KeyEvent e) 
            {
            mario.keyReleased (e);
            }

        public void keyPressed (KeyEvent e) 
            {
            mario.keyPressed (e);
            }
        }
    }
