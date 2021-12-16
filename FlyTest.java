/*
* This program is the FlyTest program.
*
* @author  Hussein Mansour
* @version 1.0
* @since   2021-12-07
*/

/**
* This is the FlyTest class program.
*/
final class FlyTest {

    /**
    * BiplaneSpeed.
    */
    public static final int BISPEED = 212;

    /**
    * BoeingSpeed.
    */
    public static final int BOSPEED = 422;

    /**
    * Five Thousand.
    */
    public static final int FIVEO = 5000;

    /**
    *  Four.
    */
    public static final int FOUR = 4;

    /**
    * Prevent instantiation
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private FlyTest() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * Starting... the main method
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {

        final Airplane biplane = new Airplane();
        biplane.setSpeed(BISPEED);
        System.out.println(biplane.getSpeed());

        final Jet boeing = new Jet();
        boeing.setSpeed(BOSPEED);
        System.out.println(boeing.getSpeed());

        final int counter = 0;
        while (x < FOUR) {
            boeing.accelerate();
            System.out.println(boeing.getSpeed());

            if (boeing.getSpeed() > FIVEO) {
                biplane.setSpeed(biplane.getSpeed() * 2);
            } else {
                boeing.accelerate();
            }
            counter++;
        }
        System.out.println(biplane.getSpeed());
    }
}
