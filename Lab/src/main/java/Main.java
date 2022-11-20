import com.human.Human;
import com.car.Car;
import com.car.Ford;
import com.classes.FirstClass;
import com.classes.SecondClass;
import com.classes.ThirdClass;
import com.classes.FourthClass;

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

    public void _1() {
        System.out.println("Hello World!");
    }

    public void _2() {
        Human human = new Human(18);
        System.out.println(human.getAge());
        human.birthday();
        System.out.println(human.getAge());
    }

    public void _3() {
        Ford ford = new Ford(2018, true);
        System.out.println(ford.getYearOfIssue());
        System.out.println(ford.getBustle());
    }

    public void _4() {
        int temporary = 0;
        Scanner console = new Scanner(System.in);
        temporary = console.nextInt();
        System.out.printf("temporary = %d\n", temporary);
    }

    public void printNOS(Car car) {
        System.out.println(car.getNumberOfSeats());
    }

    public void _5(Main main) {
        Car car = new Ford(2018, false);
        main.printNOS(car);
    }

    public void _6() {
        FirstClass fc = new FirstClass();
        fc.Method();
    }

    public void _7() {
        SecondClass first_sc = new SecondClass(5);
        SecondClass second_sc = new SecondClass(5);
        System.out.println(first_sc.getVAR());
        System.out.println(second_sc.getVAR());
        first_sc.setVAR(2);
        System.out.println(first_sc.getVAR());
        System.out.println(second_sc.getVAR());
    }

    public void _8() {
        ThirdClass.m(3, 1, 2, 3); // because static
        System.out.println(ThirdClass.n(3));
    }

    public static void main(String[] args) {
        Main main = new Main();
        FourthClass fc = new FourthClass(3);
        fc.FourthClass(5);
        /*main._1();
        main._2();
        main._3();
        main._4();
        main._5(main);
        main._6();
        main._7();
        main._8();*/

    }
}