import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AddBoxButton extends JButton implements ActionListener
{
    // properties
    Profile p;

    // constructors
    public AddBoxButton( Profile p)
    {
        super( "ADD BOX");
        this.p = p;

        setBackground( new Color( 51, 255, 153));
        setOpaque(true);
        setBorder( BorderFactory.createLineBorder( Color.BLACK) );

        addActionListener( this);
    }

    // methods
    public void actionPerformed( ActionEvent e)
    {
        String name =JOptionPane.showInputDialog(" Enter the name of the box you want to add");

        if ( name != null)
        {
            Box temp;
            temp = new Box( name);

            p.getBoxes().add( temp);
            p.setBox( temp);

            p.update();
        }
    }
}