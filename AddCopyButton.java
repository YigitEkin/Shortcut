import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AddCopyButton extends JButton implements ActionListener, WorkingView
{
    // properties
    Profile p;

    // constructors
    public AddCopyButton( Profile p)
    {
        super( "ADD COPIED SHORTCUT");
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
        if ( p.getBoxes() != null && p.getCopy() != null )
        {
            p.getBox().getBox().add( p.getCopy());
        }

        else
        {
            JOptionPane.showMessageDialog( null, "There is currently no copied box right now!!!! please copy one and then click this button","WARNING", JOptionPane.WARNING_MESSAGE);
        }

        p.update();
    }

    public void updateView()
    {
        setEnabled( p.getBoxes().size() != 0);
    }
}