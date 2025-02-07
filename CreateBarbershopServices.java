import java.util.Scanner;

public class CreateBarbershopServices {
    public static void main (String [] args) {

        //3 objects:
        BarbershopService firstService = new BarbershopService();
        BarbershopService secondService = new BarbershopService();
        Scanner keyboard = new Scanner(System.in); //this is given since kailangan si scanner

        //asks the user what is their service and price and stores it into the object
        System.out.print("Please type your desired service: ");
        firstService.setServiceDescription(keyboard.nextLine());
        System.out.print("Please type your desired price: ");
        firstService.setPrice(keyboard.nextDouble());

        //second service
        keyboard.nextLine();

        //asks the user and stores data
        System.out.print("\nPlease type your desired service: ");
        secondService.setServiceDescription(keyboard.nextLine());
        System.out.print("Please type your desired price: ");
        secondService.setPrice(keyboard.nextDouble());

        //prints the values given by the user by calling the method
        System.out.println("\nService: " + firstService.getServiceDescription());
        System.out.println("Price: " + firstService.getPrice());
        System.out.println("Service: " + secondService.getServiceDescription());
        System.out.println("Price: " + secondService.getPrice());
    }
}
