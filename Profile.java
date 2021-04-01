import java.util.ArrayList;
import java.io.Serializable;

/**
 * A class for Profile object
 * @author Yigit Ekin and Arda Eren
 * @version 1.0
 */
public class Profile implements Serializable
{
    //properties
    private ArrayList<Box> boxes;
    private ArrayList<WorkingView> views;
    private Box mainBox;
    private Shortcut copy;

    //constructor
    public Profile()
    {
        boxes = new ArrayList<Box>();
        views = new ArrayList<WorkingView>();
        mainBox = null;
        copy = null;
    }

    //methods
    /**
     * This method returns the collection of boxes specific to the profile
     * @param none
     * @return boxes the arraylist that includes the collection of boxes
     */
    public ArrayList<Box> getBoxes()
    {
        return boxes;
    }

    /**
     * This method sets copy shortcut as the shortcut given in the parameter
     * @param Shortcut b
     * @return none
     */
    public void setCopy( Shortcut b)
    {
        copy = b;
    }

    /**
     * This method returns the shortcut stored as the copied shortcut
     * @param none
     * @return shortcut stored as the copied shortcut
     */
    public Shortcut getCopy()
    {
        return copy;
    }

    /**
     * This method returns the collection of views specific to the profile
     * @param none
     * @return boxes the arraylist that includes the collection of views
     */
    public ArrayList<WorkingView> getViews()
    {
        return views;
    }

    /**
     * This method updates all views specific to the profile stored in the collection of views
     * @param none
     * @return none
     */
    public void update()
    {
        for ( int i = 0; i < views.size(); i++)
        {
            views.get( i).updateView();
        }
    }

    /**
     * This method sets the mainBox as the box given in the parameter
     * @param Box b
     * @return none
     */
    public void setBox( Box b)
    {
        mainBox = b;
    }

    /**
     * This method returns the box stored as the mainBox of the profile
     * @param none
     * @return shortcut stored as the copied shortcut
     */
    public Box getBox()
    {
        return mainBox;
    }
} // end of class Profile