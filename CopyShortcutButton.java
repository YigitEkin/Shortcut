import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CopyShortcutButton extends JButton implements ActionListener
{
    // properties
    Profile p;
    Shortcut b;

    // constructors
    public CopyShortcutButton( Shortcut b,Profile p)
    {
        super( "COPY");
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
        p.setCopy( b);
    }
}