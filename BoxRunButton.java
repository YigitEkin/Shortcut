import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class BoxRunButton extends JButton implements ActionListener, WorkingView
{
    // properties
    Profile p;

    // constructors
    public BoxRunButton( Profile p)
    {
        super( "OPEN THE WHOLE COLLECTION");
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
        p.getBox().runAll();
    }

    public void updateView()
    {
        setEnabled( p.getBox() != null && p.getBox().getBox().size() != 0);
    }
}
