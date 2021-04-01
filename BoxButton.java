import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BoxButton extends JButton implements ActionListener
{
    // properties
    Box box;
    Profile p;

    // constructors
    public BoxButton( Box box, Profile p)
    {
        super( box.getName());
        this.box = box;
        this.p = p;

        setBackground( new Color( 51, 255, 153));
        setOpaque(true);
        setBorder( BorderFactory.createLineBorder( Color.BLACK) );

        addActionListener( this);
    }

    // methods
    public void actionPerformed( ActionEvent e)
    {
        p.setBox( box);
        p.update();
    }
}