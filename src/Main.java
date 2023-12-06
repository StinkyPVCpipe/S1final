import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name;
       int option;
       // int opt1, opt2, opt3, opt4, opt5, opt6, opt7, opt8;
        Scanner scan = new Scanner (System.in);

        System.out.println("\nHello Welcome to Murder at the Discount Wedding Venue");
        System.out.println("You will discover the culprit of a murder trial by choosing your own adventure");
        System.out.println("When presented with options, please press the number of the option you would like");
        System.out.println("\nPlease enter your name");
        name = scan.nextLine();
        Adventure player = new Adventure(name);
        System.out.println(player.toString());
        System.out.println("You wake up after a good nights" +
                " rest and begin your descent to the kitchen" +
                " to decide what you will eat for breakfast.");
        //System.out.println("1.Waffles          2.Pancakes");
        System.out.println(player.options("Waffles", "Pancakes"));
        option = scan.nextInt();
        while (option > 2)
        {
            System.out.println(player.options("Waffles", "Pancakes"));
            option = scan.nextInt();
        }
        System.out.println(player.ChooseOption(option));
        System.out.println("You finish your breakfast and leave your house to finish arrangements for your wedding" +
                "\nyou assume that your fiance is already out and about taking care of his things"+
                "\nThe phone rings, pick it up?");
        System.out.println(player.options("yes", "no"));
        option = scan.nextInt();
        System.out.println(player.ChooseOption(option));
        System.out.println("A faintly recognizable voice enters your ears, its the owner of the your wedding venue:"+
                            "\n\t'Hello, yes, this is " + player.getName() + " right? Okay good, I uhm, have some rather"+
                            "\n\tunfortunate news. Your fiance was found dead this morning, just outside the venue.'"+
                            "\nYour voice began to fade into nothing, and from a somewhere outside your hotel room you"+
                            "hear a laughing record begin to play."+
                            "\n\t'"+player.getName()+"? Is everything Alright?'");
        System.out.println("How do you respond?");
        System.out.println(player.options("'what do you mean is everything alright? My fiance is DEAD!'", "'...'"));


    }
}
