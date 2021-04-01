import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.net.URI;

public class AddShortcutButton extends JButton implements ActionListener, WorkingView
{
    // properties
    Profile p;

    // constructors
    public AddShortcutButton( Profile p)
    {
        super( "ADD SHORTCUT");
        this.p = p;

        setBackground( new Color( 51, 255, 153));
        setOpaque(true);
        setBorder( BorderFactory.createLineBorder( Color.BLACK) );

        p.getViews().add( this);
        addActionListener( this);
    }

    // methods
    public void actionPerformed( ActionEvent e)
    {
        int result = JOptionPane.showConfirmDialog(null, "Click yes if you want to add an application, Click no if you want to add a website");

        switch (result)
        {
            case JOptionPane.YES_OPTION:
            {
                JFileChooser fc;
                fc = new JFileChooser();
                int i;
                i = fc.showOpenDialog(this);

                if( i == JFileChooser.APPROVE_OPTION )
                {
                    File f;
                    f = fc.getSelectedFile();

                    p.getBox().getBox().add( new AppOpener( f.getName(), f));
                    p.update();

                    break;
                }

                break;
            }

            case JOptionPane.NO_OPTION:
            {
                String name;
                name = JOptionPane.showInputDialog(null, "Please enter name you want to give to this shortcut");
                String url;
                url = JOptionPane.showInputDialog(null, "Please enter the url of the website you want to add here");

                p.getBox().getBox().add( new WebPageOpener( name, url));
                p.update();

                break;
            }

            case JOptionPane.CANCEL_OPTION:
            {
                p.update();
                break;
            }
        }
    }

    public void updateView()
    {
        setEnabled(  p.getBox() != null);
    }
}

