import java.util.Scanner;

public class TypeOfParts {

    FindTotal findTotal = new FindTotal();
    Scanner sc = new Scanner(System.in);
    public void typesOfHead()
    {
        System.out.println("\t"+"available types of head are :");
        System.out.println("\t"+"1. with Standard vision");
        System.out.println("\t"+"2. with Infrared vision");
        System.out.println("\t"+"3. with Night vision");
        System.out.print("\t"+"please select your choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1 -> {
                System.out.println("\n"+"\t" + "Head with Standard vision is selected");
                findTotal.costRobot("1.1");
            }
            case 2 -> {
                System.out.println("\n"+"\t" + "Head with Infrared vision is selected");
                findTotal.costRobot("1.2");
            }
            case 3 -> {
                System.out.println("\n"+"\t" + "Head with Night vision is selected");
                findTotal.costRobot("1.3");
            }
            default -> {
                System.out.println("\n"+"\t" + "please select correct choice");
                typesOfHead();
            }
        }
    }
    public void typesOfBody()
    {
        System.out.println("\t"+"available types of body are :");
        System.out.println("\t"+"1. Square");
        System.out.println("\t"+"2. Round");
        System.out.println("\t"+"3. Triangular");
        System.out.println("\t"+"4. Rectangular");
        System.out.print("\t"+"please select your choice: ");
        int choice = sc.nextInt();
        switch (choice)
        {
            case 1 -> {
                System.out.println("\n"+"\t"+"Body with Square is selected");
                findTotal.costRobot("2.1");
            }
            case 2 -> {
                System.out.println("\n"+"\t"+"Body with Round is selected");
                findTotal.costRobot("2.2");
            }
            case 3 -> {
                System.out.println("\n"+"\t"+"Body with Triangular is selected");
                findTotal.costRobot("2.3");
            }
            case 4 -> {
                System.out.println("\n"+"\t"+"Body with Rectangular is selected");
                findTotal.costRobot("2.4");
            }
            default -> {
                System.out.println("\n"+"\t"+"please select correct choice");
                typesOfHead();
            }
        }
    }
    public void typesOfArm()
    {
        System.out.println("\t"+"available types of arms are :");
        System.out.println("\t"+"1. with Hands");
        System.out.println("\t"+"2. with Pinchers");
        System.out.println("\t"+"3. with Hand gloves");
        System.out.print("\t"+"please select your choice: ");
        int choice = sc.nextInt();
        switch (choice)
        {
            case 1 -> {
                System.out.println("\n"+"\t"+"Arms with Hands is selected");
                findTotal.costRobot("3.1");
            }
            case 2 -> {
                System.out.println("\n"+"\t"+"Arms with Pinchers is selected");
                findTotal.costRobot("3.2");
            }
            case 3 -> {
                System.out.println("\n"+"\t"+"Arms with Hand Gloves is selected");
                findTotal.costRobot("3.3");
            }
            default -> {
                System.out.println("\n"+"\t"+"please select correct choice");
                typesOfArm();
            }
        }
    }

    public void typesOfMoment()
    {
        System.out.println("\t"+"available types of moments are :");
        System.out.println("\t"+"1. with Wheels");
        System.out.println("\t"+"2. with Legs");
        System.out.println("\t"+"3. with Tracks");
        System.out.print("\t"+"please select your choice: ");
        int choice = sc.nextInt();
        switch (choice)
        {
            case 1 -> {
                System.out.println("\n"+"\t"+"Moments with Wheels is selected");
                findTotal.costRobot("4.1");
            }
            case 2 -> {
                System.out.println("\n"+"\t"+"Moments with Legs is selected");
                findTotal.costRobot("4.2");
            }
            case 3 -> {
                System.out.println("\n"+"\t"+"Moments with Tracks is selected");
                findTotal.costRobot("4.3");
            }
            default -> {
                System.out.println("\n"+"\t"+"please select correct choice");
                typesOfMoment();
            }
        }
    }

    public void typesOfPower()
    {
        System.out.println("\t"+"available types of power are :");
        System.out.println("\t"+"1. Solar");
        System.out.println("\t"+"2. Rechargeable Battery");
        System.out.println("\t"+"3. Biomass");
        System.out.print("\t"+"please select your choice: ");
        int choice = sc.nextInt();
        switch (choice)
        {
            case 1 -> {
                System.out.println("\n"+"\t"+"Power with Solar is selected");
                findTotal.costRobot("5.1");
            }
            case 2 -> {
                System.out.println("\n"+"\t"+"Power with Battery is selected");
                findTotal.costRobot("5.2");
            }
            case 3 -> {
                System.out.println("\n"+"\t"+"Power with Biomass is selected");
                findTotal.costRobot("5.3");
            }
            default -> {
                System.out.println("\n"+"\t"+"please select correct choice");
                typesOfPower();
            }
        }
    }
}
