public class T_3_3_12 {
    public static void main(String[] args) {
    }
    }

// тыкал на обум ибо я ебал писать робота ябучего
    public static void moveRobot(Robot robot, int toX, int toY) {

        if ( robot.getY()<toY)
        {
            while (robot.getDirection()!=Direction.UP)
            {robot.turnRight();}
            while (robot.getY()!=toY)
            {robot.stepForward();}
        }
        if ( robot.getY()>toY)
        {
            while (robot.getDirection()!=Direction.DOWN)
            {robot.turnRight();}
            while (robot.getY()!=toY)
            {robot.stepForward();}
        }
        if ( robot.getX()<toX)
        {
            while (robot.getDirection()!=Direction.RIGHT)
            {robot.turnRight();}
            while (robot.getX()!=toX)
            {robot.stepForward();}
        }
        if ( robot.getX()>toX)
        {
            while (robot.getDirection()!=Direction.LEFT)
            {robot.turnRight();}
            while (robot.getX()!=toX)
            {robot.stepForward();}
        }
    }




