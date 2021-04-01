import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.File;
import java.net.URI;
public class EditShortcutPathButton extends JButton implements ActionListener
{
    // properties
    Profile p;
    Shortcut b;

    // constructors
    public EditShortcutPathButton( Shortcut b,Profile p)
    {
        super( "CHANGE PATH");
        this.b = b;
        this.p = p;

        setBackground( new Color( 51, 255, 153));
        setOpaque(true);
        setBorder( BorderFactory.createLineBorder( Color.BLACK) );

        addActionListener( this);
    }

    // methods
    public void actionPerformed( ActionEvent e)
    {
        {
            int result = JOptionPane.showConfirmDialog(null, "Click yes if you want to change the path into an application, Click no if you want to change it into a website");

            switch (result)
            {
                case JOptionPane.YES_OPTION:
                {
                    JFileChooser fc=new JFileChooser();
                    int i=fc.showOpenDialog(this);

                    if(i == JFileChooser.APPROVE_OPTION)
                    {
                        File f;
                        f = fc.getSelectedFile();
                        int index;
                        index = p.getBox().getBox().indexOf( b);

                        p.getBox().getBox().set( index, new AppOpener( b.getName(), f));
                        p.update();

                        break;
                    }
                    break;
                }
                case JOptionPane.NO_OPTION:
                {
                    String url;
                    url = JOptionPane.showInputDialog(null, "Please enter the url of the website you want to add here");
                    try
                    {
                        int index;
                        index = p.getBox().getBox().indexOf( b);

                        p.getBox().getBox().set( index, new WebPageOpener( b.getName(), url));
                    }

                    catch ( Exception ex)
                    {
                        JOptionPane.showMessageDialog( null, "We cannot found a url that matches your input. Please try again ","WRONG URL", JOptionPane.WARNING_MESSAGE);
                    }

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
    }
}