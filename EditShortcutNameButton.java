import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.File;
public class EditShortcutNameButton extends JButton implements ActionListener
{
    // properties
    Profile p;
    Shortcut b;

    // constructors
    public EditShortcutNameButton( Shortcut b,Profile p)
    {
        super( "EDIT NAME");
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
        String name;
        name = JOptionPane.showInputDialog(null, "Please enter the new name for this shortcut");

        b.setName( name);
        p.update();
    }
}