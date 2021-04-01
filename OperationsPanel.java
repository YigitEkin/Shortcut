import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class OperationsPanel extends JPanel
{
    Profile p;

    public OperationsPanel( Profile p)
    {
        this.p = p;

        setBackground( new Color( 153, 255,255));
        setLayout( new GridLayout( 6,1));
        setBorder( BorderFactory.createLineBorder( Color.BLACK) );

        add( new AddBoxButton( p));
        add( new RemoveBoxButton( p));
        add( new AddShortcutButton( p));
        add( new ClearBoxButton( p));
        add( new AddCopyButton( p));
        add( new ChangeBoxName(p));
    }
}
