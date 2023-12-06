import java.util.Scanner;
public class Adventure
{
    private String charName;
    private String culprit;
    private String opt1;
    private String opt2;
    private int option;
    private int health;
    private static int questionCount=0;
    Scanner scan = new Scanner (System.in);

    //default constructor yessir
    public Adventure()
    {
        charName = "";
        culprit = "none";
        health = 25;
    }//end default constructor

    //constructor con parameters
    public Adventure (String name)
    {
        charName = name;
        culprit = "none";
        health = 25;
    }

    public String options(String opt1, String opt2)
    {
        this.opt1 = opt1;
        this.opt2 = opt2;
        return "1." + opt1 + "            2." + opt2;

    }
    public String ChooseOption(int option)
    {
        questionCount++;
        while (option == 1|| option == 2) {
            if (questionCount == 1)//waffles and pancakes {
                if (option == 1) {
                    System.out.println("You chose " + opt1);
                    health += 5;
                    return "\n Your health went up :D!\n";
                } else if (option == 2) {
                    System.out.println("You chose " + opt2);
                    health -= 5;
                    return "\n your health went down :(\n";
                }
            if (questionCount == 2) //pick up phone or not
            {
                if (option == 1) {
                    System.out.println("You chose " + opt1);
                    return "\nyou pick up the telephone, pressing the cold metal to your face\n";
                } else if (option == 2) {
                    System.out.println("You chose " + opt2);
                    return "\n You tried to ignore it, but the second the ringing stopped, it started right back up again," +
                            "And so despite being in a hurry you go to pick up the phone.\n";
                }
            }
        }
            {
                System.out.println("PLEASE enter a valid option");
                return "lmao" ;

            }

        //return "Please choose an actual option or smth idk what would go here lols...";

    }

    //setters or whateva

    //getters
    public String getName()
    {
        return charName;
    }
    public String getCulprit()
    {
        return culprit;
    }
    public int getHealth()
    {
        return health;
    }

    public String toString()
    {
        return "Your name: " + charName + "\nYour current main suspect: " + culprit +
                "\nyour current health: " + health;
    }

}
