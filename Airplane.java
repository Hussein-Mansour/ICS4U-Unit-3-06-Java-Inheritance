/*
* This is the Airplane class.
*
* @author  Hsen Mansour
* @version 1.0
* @since   2021-12-14
*/

/**
* This is the Vehicle class program.
*/

public class Airplane {

    /**
    * Speed.
    */
    private int speed;

    /**
    * Airplane Method.
    */
    public Airplane() {
        this.speed = 0;
    }

    /**
    * Getter for speed.
    *
    * @return speed
    */
    public int getSpeed() {
        return speed;
    }

    /**
    * Setter for speed.
    *
    * @param newSpeed new speed.
    */
    public void setSpeed(int newSpeed) {
        this.speed = newSpeed;
    }
}
