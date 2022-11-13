import com.human.Human;
import com.car.Car;
import com.car.Ford;

import java.util.Scanner;

public class Main {
    /*  types
    *   byte b = 0; // 1 byte // integer
    *   short s = 1; // 2 bytes // integer
    *   int i = 2; // 4 bytes // integer
    *   long l = 3; // 8 bytes // integer
    *   float f = 4.5f; // 4 bytes // real
    *   double d = 6.7; // 8 bytes // real
    *   boolean bool = true; // 1 bit // bool
    *   char c = '9'; // 2 bytes // symbols
    */

    void printNOS(Car car) {
        System.out.println(car.getNumberOfSeats());
    }

    public static void main(String[] args) {
        //System.out.println("Hello World!");

        /*Human human = new Human(18);
        System.out.println(human.getAge());
        human.birthday();
        System.out.println(human.getAge());*/

        /*Ford ford = new Ford(2018, true);
        System.out.println(ford.getYearOfIssue());
        System.out.println(ford.getBustle());*/

        /*int temporary = 0;
        Scanner console = new Scanner(System.in);
        temporary = console.nextInt();
        System.out.printf("temporary = %d\n", temporary);*/

        Main main = new Main();
        Car car = new Ford(2018, false);
        main.printNOS(car);
    }
}