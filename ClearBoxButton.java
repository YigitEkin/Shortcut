import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ClearBoxButton extends JButton implements ActionListener, WorkingView
{
    // properties
    Profile p;

    // constructors
    public ClearBoxButton( Profile p)
    {
        super( "CLEAR BOX");
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
        if ( p.getBoxes() != null )
        {
            p.getBox().getBox().clear();
        }

        p.update();
    }

    public void updateView()
    {
        setEnabled( p.getBoxes().size() != 0);
    }
}
