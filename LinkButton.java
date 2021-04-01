import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class LinkButton extends JButton implements ActionListener
{
    //properties
    Shortcut opener;
    //constructor
    public LinkButton(Shortcut opener )
    {
        super(opener.getName());
        this.opener = opener;

        setBackground( new Color( 51, 255, 153));
        setOpaque(true);
        setBorder( BorderFactory.createLineBorder( Color.BLACK) );

        addActionListener(this);
    }

    //methods
    public void actionPerformed(ActionEvent e)
    {
        opener.run();
    }
}
