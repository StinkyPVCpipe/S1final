import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name1, name2;
        int option;
        int route=0;
        Scanner scan = new Scanner(System.in);

        System.out.println("\nHello Welcome to Murder at the Discount Wedding Venue");
        System.out.println("You will discover the culprit of a murder trial by choosing your own adventure");
        System.out.println("When presented with options, please press the number of the option you would like");
        System.out.println("And also remember that every choice you make could impact how suspicious you appear!!");
        System.out.println("\nPlease enter your name");
        name1 = scan.nextLine();
        Adventure player = new Adventure(name1);
        System.out.println(player.toString());
        System.out.println("You wake up after a good nights" +
                " rest and begin your descent to the kitchen" +
                " to decide what you will eat for breakfast.");
        //System.out.println("1.Waffles          2.Pancakes");
        System.out.println(player.options("Waffles", "Pancakes"));
        option = scan.nextInt();
        checkInput(option, player, scan);
        System.out.println("You finish your breakfast and leave your house to finish arrangements for your wedding" +
                "\nyou assume that your fiance is already out and about taking care of his things" +
                "\nThe phone rings, pick it up?");
        System.out.println(player.options("yes", "no"));
        option = scan.nextInt();
        checkInput(option, player, scan);
        System.out.println("A faintly recognizable voice enters your ears, its the owner of the your wedding venue:" +
                "\n\n\t'Hello, yes, this is " + player.getName() + " right? Okay good, I uhm, have some rather" +
                "\n\tunfortunate news. Your fiance was found dead this morning, just outside the venue.'" +
                "\n\nYour voice began to fade into nothing, and from a somewhere outside your hotel room you " +
                "hear a laughing record begin to play." +
                "\n\n\t'" + player.getName() + "? Is everything Alright?'");
        System.out.println("\nHow do you respond?");
        System.out.println(player.options("'what do you mean is everything alright? My fiance is DEAD!'", "'...'"));
        option = scan.nextInt();
        checkInput(option, player, scan);
        System.out.println("\n\t'I know this is hard news to hear, but you probably also want to know that, " +
                "\n\t everybody thinks you killed him.'");
        System.out.println("How do you respond?");
        System.out.println(player.options("...what. I- why?", "I suppose he was rich but...I would never!"));
        option = scan.nextInt();
        checkInput(option, player, scan);
        System.out.println("\tFear not " + player.getName() + ", I have detective on the case, and he'll be able to help " +
                "you. His name is...lets see here... ");
//        System.out.println("\n(Please enter the sexiest name you can think of)");
//        name2 = scan.nextLine();
//        Adventure detective = new Adventure(name2);
//        System.out.println(detective.toString());//GURL WHATTTTT
        System.out.println("\n\t'Ah right, his name is Alejandro, hes great, and he should be over soon" +
                "\n\tI really do wish you the best of luck" + player.getName() + ". And make sure to get that check in!'" +
                "\n\nThe phone hangs up and you hear a knock at the door. Against your better judgement, you go to open" +
                "\nthe door, and find yourself face to face with one of the handsomest man you've ever seen." +
                "\n\n\t'Bonjour, My lady. I am here to prove your innocence! Baguette! Who do you wish to talk to first?'" +
                "\n\nHow do you respond?");
        System.out.println(player.options("My parents!!", "My best friend, I need to see her."));
        option = scan.nextInt();
        checkInput(option, player, scan);
        if (option == 1) {
            visitParents(option, scan, player, route);
        } else {
            visitFriend();
        }

    }

    public static void checkInput(int option, Adventure player, Scanner scan) {
        while (option > 2) {
            //System.out.println(player.options("Waffles", "Pancakes"));
            System.out.println("Please enter a number that corresponds with your options.");
            option = scan.nextInt();
        }
        System.out.println(player.ChooseOption(option));
    }


    public static void visitParents(int option, Scanner scan, Adventure player, int route)
    {
        route++;
        Adventure mom = new Adventure("mom");
        System.out.println("\nYou and the hot detective set off towards where your parents are staying in the hotel" +
                "\nWith each step you take, your mind continues to wonder why your parents think you would kill your" +
                "\nown fiance. It doesn't matter if he was rich...you loved him." +
                "\nYou reach your parents hotel room and Alejandro gives a firm knock on the door. And your mom" +
                " soon answers it" +
                "\n\n\t 'Hello-uh who are you- oh- "+ player.getName()+" Im so sorry about what happened, I- yeah.'" +
                "\n\nHow do you respond?");
        System.out.println(player.options("Yeah its hard, but can we talk to you?", "I know you think I killed him."));
        option = scan.nextInt();
        checkInput(option, player, scan);
        System.out.println("\n\nYou and Alejandro take your moms offer and step inside the room to sit on the couch, where" +
                "\nyour dad is already resting with his head in his hands. But when you step inside he looks up." +
                "\n\n\t'Sweetheart' your dad spoke up, 'I know you didn't kill your fiance. How could you have when your fiance was dressed" +
                "up like you when he died.'" +
                "\n\nYou look at your dad with a loss for words, so many questions ringing in your mind, 'why would he be" +
                "dressed up like me?' and also why didn't the venue owner inform you of this when he called you?" +
                "\n\n\t'oh you know-' your mom started, 'I bet it was HIS parents! Oh i know they never liked you honey" +
                " and they must've mistaken him for you." +
                "\n\nAlejandro coughs, causing everyone to look at him. " +
                "\n\n\t'Right, well buenos gracias para tu tiempo, Mr. and Mrs. " + player.getName()+
                ".'\n\nThe two of you leave the room, unfortunately with more questions than answers.");

        if (route <= 1)
        {
            System.out.println("\n\n\t'Madamoiselle, would you take interest in hablaring to tu amiga now?" +
                    "\n\nHow do you respond?");
            System.out.println(player.options("Lets go talk to her", "Alejandro, I think my parents killed my fiance."));
            option = scan.nextInt();
        } else
        {//504 plan core >_<
            System.out.println("\n\tMadamoiselle, what do you wish to do now?" +
                    "\n\nHow do you respond?");
            System.out.println(player.options("I think my parents killed my fiance", "I think my friend killed my fiance"));

        }

    }

    public static void visitFriend()
    {
        System.out.println("\nYou and the hot detective set off towards where your friend is staying at the hotel" +
                "giving a knock on her door, and when she opens it, your instantly relieved ");


    }
}