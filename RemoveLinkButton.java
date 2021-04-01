import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RemoveLinkButton extends JButton implements ActionListener
{
    // properties
    Profile p;
    Shortcut b;

    // constructors
    public RemoveLinkButton( Shortcut b,Profile p)
    {
        super( "REMOVE");
        this.b = b;
        this.p = p;

        setBorder( BorderFactory.createLineBorder( Color.BLACK) );
        setBackground( new Color( 51, 255, 153));
        setOpaque(true);

        addActionListener( this);
    }

    // methods
    public void actionPerformed( ActionEvent e)
    {
        int index = p.getBox().getBox().indexOf( b);

        p.getBox().getBox().remove( b);
        p.update();
    }
}