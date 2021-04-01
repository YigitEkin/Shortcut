import javax.swing.*;
import java.io.*;
import javax.swing.border.*;
import javax.swing.plaf.DimensionUIResource;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MainPage extends JFrame implements WindowListener {

    private JPanel contentPane;
    Profile p;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Profile p;
                    MainPage frame;

                    // Deserialization
                    try
                    {
                        // Reading the object from a file
                        FileInputStream file = new FileInputStream("DO NOT DELETE!!");
                        ObjectInputStream in = new ObjectInputStream(file);

                        // Method for deserialization of object
                        p = (Profile)in.readObject();
                        frame = new MainPage2( p);
                        frame.setVisible(true);
                        in.close();
                        file.close();
                    }

                    catch(IOException ex)
                    {
                        p = new Profile();
                        frame = new MainPage2( p);
                        frame.setVisible(true);
                    }

                    catch(ClassNotFoundException ex)
                    {
                        System.out.println("ClassNotFoundException is caught");
                    }



                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public MainPage( Profile p) {
        super( "WorkingVironment");
        this.p = p;

        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout( new BorderLayout() );
        pack();
        setVisible(true);

        addWindowListener(this);

        JPanel solPanel = new WBoxPanel( p);
        JPanel üstPanel = new JPanel();
        JPanel sağPanel = new OperationsPanel(p);
        JPanel ortaPanel = new BoxContentShower( p);
        JPanel altPanel = new JPanel( new GridLayout(1,3));

        altPanel.add( new BoxRunButton( p));

        add( altPanel, BorderLayout.SOUTH);
        add( solPanel, BorderLayout.WEST);
        add( sağPanel, BorderLayout.EAST);
        add( ortaPanel, BorderLayout.CENTER);
        add( üstPanel, BorderLayout.NORTH);

        pack();

        p.update();
    }

    @Override
    public void windowActivated(WindowEvent arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void windowClosed(WindowEvent arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void windowClosing(WindowEvent arg0)
    {
        try
        {
            FileOutputStream file = new FileOutputStream("DO NOT DELETE!!");
            ObjectOutputStream out = new ObjectOutputStream(file);

            // Method for serialization of object
            out.writeObject(p);

            out.close();
            file.close();

            System.exit(0);

        }

        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }

    }

    @Override
    public void windowDeactivated(WindowEvent arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void windowDeiconified(WindowEvent arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void windowIconified(WindowEvent arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void windowOpened(WindowEvent arg0) {
        // TODO Auto-generated method stub

    }

}
