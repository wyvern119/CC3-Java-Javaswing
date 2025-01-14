import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class ToDoList {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        List<String> todo = new ArrayList<>();
        int ctr = 0;
        boolean check = true;

        System.out.println("Welcome to HampterList!\nStart by adding your first task!");

        while (check) {
            System.out.print("\nTask " + (ctr+1) + ": ");
            String task = input.next();
            todo.add(task);

            System.out.println("New task created!");

            System.out.println("\nWould you like to \n1. Add 2. Remove 3. Display 4. Stop?");

            String choice = input.next();

            switch(choice) {
                case "1":
                    break;
                case "2":
                    System.out.println("What would you like to remove?");

                    String rmv = input.next();
                    System.out.println(rmv + " removed!");
                    todo.remove(rmv);

                    for(String s: todo) {
                        System.out.println("\nTasks:\n" + s);
                    }
                    break;
                case "3":
                    for(String s: todo) {
                        System.out.println("\nTasks:\n" + s);
                    }
                case "4":
                    for(String s: todo) {
                        System.out.println("\nTasks:\n" + s);
                    }
                    System.out.println("Thank you for using HampterList!");
                    check = false;
                    break;
            }
        }
    }
}