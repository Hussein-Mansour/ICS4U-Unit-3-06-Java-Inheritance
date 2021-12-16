/*
* This is the Jet class.
*
* @author  Hussein Mansour
* @version 1.0
* @since   2021-12-07
*/

/**
* Jet class based off Airplane.
*/
public class Jet extends Airplane {
    /**
    * Multiply by 2.
    */
    private static final int MULTIPLIER = 2;

    /**
    * Speed Multiplier.
    */
    public Jet() {
        super();
    }

    /**
    * Sets the Jet speed.
    *
    * @param speed new speed.
    */
    public void setSpeed(int speed) {
        super.setSpeed(speed * MULTIPLIER);
    }

    /**
    * Accelerates jet speed.
    */
    public void accelerate() {
        super.setSpeed(getSpeed() * MULTIPLIER);
    }
}
