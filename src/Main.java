import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] firstMass = new int[3];
        firstMass[0] = 1;
        firstMass[1] = 2;
        firstMass[2] = 3;
        float [] secondMass = {(float) 1.57, (float) 7.654, (float) 9.986};
        int [] thirdMass = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        System.out.println("/////////////////////////////////////////////////////////////////////////////////");
        System.out.println(firstMass[0] + ", " + firstMass[1] + ", " + firstMass[2]);
        System.out.println(secondMass[0] + ", " + secondMass[1] + ", " + secondMass[2]);
        for (int i = 0; i < 11; i++) {
            System.out.print(thirdMass[i] + ", ");
        }
            System.out.println(thirdMass[11]);
            System.out.println("/////////////////////////////////////////////////////////////////////////////////");
            System.out.println(firstMass[2] + ", " + firstMass[1] + ", " + firstMass[0]);
            System.out.println(secondMass[2] + ", " + secondMass[1] + ", " + secondMass[0]);
            for (int i = 11; i > 0; i--) {
                System.out.print(thirdMass[i] + ", ");
            }
            System.out.println(thirdMass[0]);
            System.out.println("/////////////////////////////////////////////////////////////////////////////////");
                for (int f = 0; f < 3; f++) {
                if (firstMass[f] % 2 != 0){
                    firstMass[f] += 1;
                    System.out.println(f);
                }


            }









            System.out.println("Hello world!");














    }
}