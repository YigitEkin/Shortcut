import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ShortcutShowingPanel extends JPanel
{
    //properties
    Shortcut shortcut;
    Profile p;

    public ShortcutShowingPanel( Shortcut shortcut, Profile p)
    {
        this.shortcut = shortcut;
        this.p = p;

        setBackground( Color.CYAN);
        setBorder( BorderFactory.createLineBorder( Color.CYAN) );
        setLayout( new GridLayout( 1, 4));

        this.add( new JLabel( shortcut.getName()));
        this.add( new ShortcutRunButton( shortcut));
        this.add( new RemoveLinkButton( shortcut, p));
        this.add( new CopyShortcutButton( shortcut, p));
        this.add( new EditShortcutNameButton(shortcut, p));
        this.add( new EditShortcutPathButton(shortcut, p));
    }
}

