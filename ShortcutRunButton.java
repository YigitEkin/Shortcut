import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class ShortcutRunButton extends JButton implements ActionListener
{
    // properties
    Shortcut s;

    // constructors
    public ShortcutRunButton( Shortcut s)
    {
        super( "OPEN");
        this.s = s;

        setBackground( new Color( 51, 255, 153));
        setOpaque(true);
        setBorder( BorderFactory.createLineBorder( Color.BLACK) );

        addActionListener( this);
    }

    // methods
    public void setShortcut( Shortcut s)
    {
        this.s = s;
    }

    public void actionPerformed( ActionEvent e)
    {
        try
        {
            s.run();
        }

        catch ( Exception exception)
        {
            JOptionPane.showMessageDialog( null, "This shortcut's path is wrong!!! Edit it and try running it again","WARNING", JOptionPane.WARNING_MESSAGE);
        }
    }
}