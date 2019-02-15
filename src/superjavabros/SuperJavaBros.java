package superjavabros;

import javax.swing.JFrame;


public class SuperJavaBros
    {
    public static JFrame main_frame;
    public SuperJavaBros ()
        {
        main_frame = new JFrame ();
        
        main_frame.add (new MainPanel ());
        main_frame.setTitle ("Super Java Bros.");
        main_frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        main_frame.setSize (1200, 861);
        main_frame.setVisible (true);
        main_frame.setResizable (false);
        main_frame.setLocationRelativeTo (null);
        }
    
    public static void main(String[] args) 
        {
        new SuperJavaBros ();
        }

    }
