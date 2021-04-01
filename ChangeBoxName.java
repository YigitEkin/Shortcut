import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ChangeBoxName extends JButton implements ActionListener, WorkingView
{
    // properties
    Profile p;

    // constructors
    public ChangeBoxName( Profile p)
    {
        super( "CHANGE CURRENT BOX NAME");
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
        String name = JOptionPane.showInputDialog(null, "Please enter name you want to give to this Box");

        p.getBox().setName( name);
        p.update();
    }

    public void updateView()
    {
        setEnabled( p.getBoxes().size() != 0);
    }
}