import java.io.Serializable;

/**
 * Abstract class for shortcut
 * @author Yigit Ekin and Arda Eren
 * @version 1.0
 */
abstract class Shortcut implements Serializable
{
    /*
     * abstract method for opening the shortcut object
     * @param none
     * @return none
     */
    abstract void run();

    /*
     * abstract method for getting the name of the shortcut object
     * @param none
     * @return string name of the shortcut object
     */
    abstract String getName();

    /*
     * abstract method for setting the name of the shortcut object
     * @param none
     * @return none
     */
    abstract void setName(String name);
}