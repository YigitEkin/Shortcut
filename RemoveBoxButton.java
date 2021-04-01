import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RemoveBoxButton extends JButton implements ActionListener, WorkingView
{
    // properties
    Profile p;

    // constructors
    public RemoveBoxButton( Profile p)
    {
        super( "REMOVE BOX");
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
        if ( p.getBoxes() != null && p.getBoxes().size() > 1 )
        {
            int index = p.getBoxes().indexOf( p.getBox());

            p.getBoxes().remove( index);
            p.setBox( p.getBoxes().get( 0));
            p.update();
        }

        else if ( p.getBoxes() != null && p.getBoxes().size() == 1)
        {
            p.setBox( null);
            p.getBoxes().remove( 0);
            p.update();
        }
    }

    public void updateView()
    {
        setEnabled( p.getBoxes().size() != 0);
    }
}