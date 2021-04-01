import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class WBoxPanel extends JPanel implements WorkingView
{
    //properties
    Profile profile;
    BoxPanel middle;

    //constructor
    public WBoxPanel( Profile profile)
    {
        this.profile = profile;
        profile.getViews().add( this);
        middle = new BoxPanel( profile);

        setBorder( BorderFactory.createLineBorder( Color.BLACK) );
        setBackground( new Color( 153, 255,255));
        setLayout( new BorderLayout());

        add( middle, BorderLayout.CENTER);
    }

    //methods
    /**
     * this method adds the necessary components to the panel and gives necessary instructions
     * @param none
     * @return none
     */
    private void createComponents()
    {
        for ( int i = 0; i < profile.getBoxes().size(); i++)
        {
            middle.add( new BoxButton( (Box)profile.getBoxes().get( i), profile) );
        }
    }

    public void updateView()
    {
        createComponents();
        revalidate();
        repaint();
    }
}
