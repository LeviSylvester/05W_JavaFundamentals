package w5_Robot;

public class TestRobot {
    public static void main(String[] args) {


        System.out.println(RobotModel.r1);

        RobotModel.r1.changePosition(-1);
        System.out.println(RobotModel.r1);

        RobotModel.r1.changePosition(1);
        System.out.println(RobotModel.r1);

    }
}
