public class MainOfRobotFactory {
    public static void main(String[] args) {
        BodyParts bodyParts = new BodyParts();
        System.out.println();
        System.out.println();
        System.out.print("\t\t\t\t\t\t\t\t\t\t\t");
        System.out.println("**** WELCOME to ROBOT FACTORY ****");
        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t");
        System.out.println("-------------------------"+"\n");
        System.out.println("Creation of the Robot has started....");
        System.out.println("---> CREATING HEAD..");
        bodyParts.headOfRobot();
        System.out.println("---> CREATING BODY..");
        bodyParts.bodyOfRobot();
        System.out.println("---> CREATING ARMS..");
        bodyParts.armsOfRobot();
        System.out.println("---> CREATING MOMENTS..");
        bodyParts.momentOfRobot();
        System.out.println("---> CREATING POWER..");
        bodyParts.powerOfRobot();
    }
}


