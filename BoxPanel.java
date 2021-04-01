import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class BoxPanel extends JScrollPane implements WorkingView
{
    //properties
    Profile profile;
    JPanel boxCarrier;

    //constructor
    public BoxPanel( Profile profile)
    {
        this.profile = profile;
        profile.getViews().add( this);

        setBackground( new Color( 153, 255,255));
        setBorder( BorderFactory.createLineBorder( Color.BLACK) );
        setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        createComponents();
    }

    //methods
    /**
     * this method adds the necessary components to the panel and gives necessary instructions
     * @param none
     * @return none
     */
    private void createComponents()
    {
        setBackground( Color.GREEN);
        setBorder( BorderFactory.createLineBorder( Color.BLUE) );
        setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        boxCarrier =  new JPanel();
        boxCarrier.setLayout( new GridLayout( profile.getBoxes().size(), 1) );

        for ( int i = 0; i < profile.getBoxes().size(); i++)
        {
            boxCarrier.add( new BoxButton( (Box)profile.getBoxes().get( i), profile));
        }

        this.setViewportView(boxCarrier);
    }

    public void updateView()
    {
        createComponents();
        revalidate();
        repaint();
    }
}
