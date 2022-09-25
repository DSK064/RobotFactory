import java.util.Arrays;

public class FindTotal {
    Supplier supplier1 = new Supplier();
    Supplier supplier2 = new Supplier();
    Supplier supplier3 = new Supplier();
    int sum = 0;

    private void purchaseRobot(int[] arr) {
        Arrays.sort(arr);
        System.out.println("\t"+"the supplier with lowest cost "+arr[0]+"$ is purchased.");
        System.out.println("\t"+"-------------------------------------------------------");

        sum += arr[0];
    }

    public void costRobot(String value)
    {
        int[] array1 = new int[3];
        int[] array2 = new int[3];
        int[] array3 = new int[3];
        int[] array4 = new int[3];
        int[] array5 = new int[3];
        switch (value)
        {
            case "1.2" -> {
                array1[0] = supplier1.iVision;
                array1[1] = supplier2.iVision;
                array1[2] = supplier3.iVision;
                for (int i = 0; i < 3; i++)
                    if(array1[i] < 5)
                        array1[i] = 5;
                System.out.println("\t"+"Cost from supplier1 is: "+array1[0]+"$");
                System.out.println("\t"+"Cost from supplier2 is: "+array1[1]+"$");
                System.out.println("\t"+"Cost from supplier3 is: "+array1[2]+"$");

                purchaseRobot(array1);

            }
            case "1.1" -> {
                array1[0] = supplier1.sVision;
                array1[1] = supplier2.sVision;
                array1[2] = supplier3.sVision;
                for (int i = 0; i < 3; i++)
                    if(array1[i] < 5)
                        array1[i] = 5;
                System.out.println("\t"+"Cost from supplier1 is: "+array1[0]+"$");
                System.out.println("\t"+"Cost from supplier2 is: "+array1[1]+"$");
                System.out.println("\t"+"Cost from supplier3 is: "+array1[2]+"$");

                purchaseRobot(array1);
            }
            case "1.3" -> {
                array1[0] = supplier1.nVision;
                array1[1] = supplier2.nVision;
                array1[2] = supplier3.nVision;
                for (int i = 0; i < 3; i++)
                    if(array1[i] < 5)
                        array1[i] = 5;
                System.out.println("\t"+"Cost from supplier1 is: "+array1[0]+"$");
                System.out.println("\t"+"Cost from supplier2 is: "+array1[1]+"$");
                System.out.println("\t"+"Cost from supplier3 is: "+array1[2]+"$");

                purchaseRobot(array1);
            }
        }

        switch (value)
        {
            case "2.1" -> {
                array2[0] = supplier1.square;
                array2[1] = supplier2.square;
                array2[2] = supplier3.square;
                for (int i = 0; i < 3; i++)
                    if(array2[i] < 5)
                        array2[i] = 5;
                System.out.println("\t"+"Cost from supplier1 is: "+array2[0]+"$");
                System.out.println("\t"+"Cost from supplier2 is: "+array2[1]+"$");
                System.out.println("\t"+"Cost from supplier3 is: "+array2[2]+"$");

                purchaseRobot(array2);
            }
            case "2.2" -> {
                array2[0] = supplier1.round;
                array2[1] = supplier2.round;
                array2[2] = supplier3.round;
                for (int i = 0; i < 3; i++)
                    if(array2[i] < 5)
                        array2[i] = 5;
                System.out.println("\t"+"Cost from supplier1 is: "+array2[0]+"$");
                System.out.println("\t"+"Cost from supplier2 is: "+array2[1]+"$");
                System.out.println("\t"+"Cost from supplier3 is: "+array2[2]+"$");

                purchaseRobot(array2);
            }
            case "2.4" -> {
                array2[0] = supplier1.rectangle;
                array2[1] = supplier2.rectangle;
                array2[2] = supplier3.rectangle;
                for (int i = 0; i < 3; i++)
                    if(array2[i] < 5)
                        array2[i] = 5;
                System.out.println("\t"+"Cost from supplier1 is: "+array2[0]+"$");
                System.out.println("\t"+"Cost from supplier2 is: "+array2[1]+"$");
                System.out.println("\t"+"Cost from supplier3 is: "+array2[2]+"$");

                purchaseRobot(array2);
            }
            case "2.3" -> {
                array2[0] = supplier1.triangle;
                array2[1] = supplier2.triangle;
                array2[2] = supplier3.triangle;
                for (int i = 0; i < 3; i++)
                    if(array2[i] < 5)
                        array2[i] = 5;
                System.out.println("\t"+"Cost from supplier1 is: "+array2[0]+"$");
                System.out.println("\t"+"Cost from supplier2 is: "+array2[1]+"$");
                System.out.println("\t"+"Cost from supplier3 is: "+array2[2]+"$");

                purchaseRobot(array2);
            }
        }

        switch (value)
        {
            case "3.1" -> {
                array3[0] = supplier1.hands;
                array3[1] = supplier2.hands;
                array3[2] = supplier3.hands;
                for (int i = 0; i < 3; i++)
                    if(array3[i] < 5)
                        array3[i] = 5;
                System.out.println("\t"+"Cost from supplier1 is: "+array3[0]+"$");
                System.out.println("\t"+"Cost from supplier2 is: "+array3[1]+"$");
                System.out.println("\t"+"Cost from supplier3 is: "+array3[2]+"$");

                purchaseRobot(array3);
            }
            case "3.2" -> {
                array3[0] = supplier1.pinchers;
                array3[1] = supplier2.pinchers;
                array3[2] = supplier3.pinchers;
                for (int i = 0; i < 3; i++)
                    if(array3[i] < 5)
                        array3[i] = 5;
                System.out.println("\t"+"Cost from supplier1 is: "+array3[0]+"$");
                System.out.println("\t"+"Cost from supplier2 is: "+array3[1]+"$");
                System.out.println("\t"+"Cost from supplier3 is: "+array3[2]+"$");

                purchaseRobot(array3);
            }
            case "3.3" -> {
                array3[0] = supplier1.boxingGloves;
                array3[1] = supplier2.boxingGloves;
                array3[2] = supplier3.boxingGloves;
                for (int i = 0; i < 3; i++)
                    if(array3[i] < 5)
                        array3[i] = 5;
                System.out.println("\t"+"Cost from supplier1 is: "+array3[0]+"$");
                System.out.println("\t"+"Cost from supplier2 is: "+array3[1]+"$");
                System.out.println("\t"+"Cost from supplier3 is: "+array3[2]+"$");

                purchaseRobot(array3);
            }
        }

        switch (value)
        {
            case "4.1" -> {
                array4[0] = supplier1.wheels;
                array4[1] = supplier2.wheels;
                array4[2] = supplier3.wheels;
                for (int i = 0; i < 3; i++)
                    if(array4[i] < 5)
                        array4[i] = 5;
                System.out.println("\t"+"Cost from supplier1 is: "+array4[0]+"$");
                System.out.println("\t"+"Cost from supplier2 is: "+array4[1]+"$");
                System.out.println("\t"+"Cost from supplier3 is: "+array4[2]+"$");

                purchaseRobot(array4);
            }
            case "4.2" -> {
                array4[0] = supplier1.legs;
                array4[1] = supplier2.legs;
                array4[2] = supplier3.legs;
                for (int i = 0; i < 3; i++)
                    if(array4[i] < 5)
                        array4[i] = 5;
                System.out.println("\t"+"Cost from supplier1 is: "+array4[0]+"$");
                System.out.println("\t"+"Cost from supplier2 is: "+array4[1]+"$");
                System.out.println("\t"+"Cost from supplier3 is: "+array4[2]+"$");

                purchaseRobot(array4);
            }
            case "4.3" -> {
                array4[0] = supplier1.tracks;
                array4[1] = supplier2.tracks;
                array4[2] = supplier3.tracks;
                for (int i = 0; i < 3; i++)
                    if(array4[i] < 5)
                        array4[i] = 5;
                System.out.println("\t"+"Cost from supplier1 is: "+array4[0]+"$");
                System.out.println("\t"+"Cost from supplier2 is: "+array4[1]+"$");
                System.out.println("\t"+"Cost from supplier3 is: "+array4[2]+"$");

                purchaseRobot(array4);
            }
        }

        switch (value)
        {
            case "5.1" -> {
                array5[0] = supplier1.solar;
                array5[1] = supplier2.solar;
                array5[2] = supplier3.solar;
                for (int i = 0; i < 3; i++)
                    if(array5[i] < 5)
                        array5[i] = 5;
                System.out.println("\t"+"Cost from supplier1 is: "+array5[0]+"$");
                System.out.println("\t"+"Cost from supplier2 is: "+array5[1]+"$");
                System.out.println("\t"+"Cost from supplier3 is: "+array5[2]+"$");

                purchaseRobot(array5);
                System.out.println("Hurray!! Robot has created");
                System.out.println("Total cost for creating the Robot is:"+sum+"$");
            }
            case "5.2" -> {
                array5[0] = supplier1.battery;
                array5[1] = supplier2.battery;
                array5[2] = supplier3.battery;
                for (int i = 0; i < 3; i++)
                    if(array5[i] < 5)
                        array5[i] = 5;
                System.out.println("\t"+"Cost from supplier1 is: "+array5[0]+"$");
                System.out.println("\t"+"Cost from supplier2 is: "+array5[1]+"$");
                System.out.println("\t"+"Cost from supplier3 is: "+array5[2]+"$");

                purchaseRobot(array5);

                System.out.println("Hurray!! Robot has created");
                System.out.println("Total cost for creating the Robot is:"+sum+"$");
            }
            case "5.3" -> {
                array5[0] = supplier1.biomass;
                array5[1] = supplier2.biomass;
                array5[2] = supplier3.biomass;
                for (int i = 0; i < 3; i++)
                    if(array5[i] < 5)
                        array5[i] = 5;
                System.out.println("\t"+"Cost from supplier1 is: "+array5[0]+"$");
                System.out.println("\t"+"Cost from supplier2 is: "+array5[1]+"$");
                System.out.println("\t"+"Cost from supplier3 is: "+array5[2]+"$");

                purchaseRobot(array5);
                System.out.println("Hurray!! Robot has created");
                System.out.println("The total least possible cost for creating the Robot is:"+sum+"$");
            }
        }

    }

}
