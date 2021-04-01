import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BoxContentShower extends JPanel implements WorkingView
{
    //properties
    Profile p;

    //constructor
    public BoxContentShower( Profile p)
    {
        this.p = p;
        p.getViews().add( this);

        setBackground( new Color( 153, 255,255));
        setOpaque( true);
        setBorder( BorderFactory.createLineBorder( Color.BLACK) );

        createComponents();
    }

    //methods
    public void updateView()
    {
        removeAll();
        createComponents();
        revalidate();
        repaint();
    }

    /**
     * this method adds necessary components to this panel and sets its layouts
     * @param none
     * @return none
     */
    private void createComponents()
    {
        if ( p.getBox() != null && p.getBox().getBox().size() != 0)
        {
            this.setLayout( new GridLayout( p.getBox().getBox().size(), 1));

            for ( int i = 0; i < p.getBox().getBox().size(); i++)
            {
                this.add( new ShortcutShowingPanel( p.getBox().getBox().get( i), p));
            }
        }

        else if ( p.getBox() != null && p.getBox().getBox().size() == 0)
        {
            add( new JLabel( "The Current Box named " + p.getBox().getName() + " is empty"));
        }

        else if ( p.getBox() == null )
        {
            add( new JLabel( "Your Collection is currently empty start by creating a box"));
        }
    }
}
