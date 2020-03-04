package Home_Task_6;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        MyCustom<Integer> list = new MyCustom<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(list);
        System.out.println("Enter element you want to get:");
        int x = sc.nextInt();
        System.out.println("Element " + x + " is at position: " + list.get(x - 1));
        System.out.println("Enter element you want to remove:");
        int remove = sc.nextInt();
        list.remove(remove);
        System.out.println("After removing " + remove );
        System.out.println(list);
    }
}
