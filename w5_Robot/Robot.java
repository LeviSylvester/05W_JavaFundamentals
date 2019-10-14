package w5_Robot;

/*5. A class Robot contains:
● One instance variable 'x' (of type int) representing the position of robot;
● One default constructor which initialize the value to 1;
● One change(int k) method which add to the current robot x value to k (as long as k >=
1);
● One toString() method which returns the position of robot;
Write a class which models the class Robot. Write a class TestRobot which test Robot class.*/

public class Robot {
    private int x; //position

    public Robot() {
        this.x = 1;
    }

    public void changePosition(int k) {
        if (k >= 1) {
            this.x += k;
        }
    }

    @Override
    public String toString() {
        return "robot's position x: " + this.x;
    }

}
