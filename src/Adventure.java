import java.util.Scanner;
public class Adventure
{
    private String charName;
    private String culprit;
    private String opt1;
    private String opt2;
    private int health;
    private int susness;
    private static int questionCount=0;
    //Scanner scan = new Scanner (System.in);

    //default constructor yessir
    public Adventure()
    {
        charName = "";
        culprit = "none";
        health = 25;
        susness = 0;
    }//end default constructor

    //constructor con parameters
    public Adventure (String name)
    {
        charName = name;
        culprit = "none";
        health = 25;
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
    //BRAINNNN METHODSSSS RAGHHHH

    public String toString()
    {
        return "Your name: " + charName + "\nYour current main suspect: " + culprit +
                "\nyour current health: " + health;
    }

    public String options(String opt1, String opt2)
    {
        this.opt1 = opt1;
        this.opt2 = opt2;
        return ( "1." + opt1 + "            2." + opt2);


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
                if (option == 1)
                {
                    System.out.println("You chose " + opt1);
                    return "\nyou pick up the telephone, pressing the cold metal to your face\n";
                } else if (option == 2)
                {
                    System.out.println("You chose " + opt2);
                    return "\n You tried to ignore it, but the second the ringing stopped, it started right back up again," +
                            "And so despite being in a hurry you go to pick up the phone.\n";
                }
            }
            if (questionCount == 3)//fiance dead vs ...
            {
                if (option == 1)
                {
                    return "You can practically hear the venue owner jump";
                }
                if (option == 2)
                {
                    susness++;
                    return "\nYou can here the venue owner sigh through the phone.";
                }
            }
            if (questionCount == 4)//WHAT WHY vs I can see why
            {
                if (option == 1)
                {
                    susness++;
                    return("\n\t'Well you know, your...would be husband, is- was very rich," +
                            "\n\tand everybody knows the trope of the gold digger...and now everybody " +
                            "and like I mean everybody thinks you killed him, even your own parents.'");
                }
                if (option == 2)
                {
                    return ("\n\t'I- I know you wouldn't " + charName + " but everybody, even your own " +
                            "parents think you killed him.'");
                }
            }
            if (questionCount == 5)//parents vs friend
                if(option == 1)
                {
                    return "\n\tOui oui, it will be good to consult your parents!";
                }
                if(option == 2)
                {
                    return "\n\tOf course madame, friends are important, but for help or suspicion? i suppose we will see.";
                }
            if (questionCount == 6)//PARENTS
            {
                if (option == 1)
                {

                    return "Oh of course sweetheart, you know I'm here for you. Here come inside and sit down.";
                }
                if (option == 2)
                {
                    return "Well I mean, can you blame me? It is a little strange...your rich fiance dying just before" +
                            " you two got married. I mean, you know you're bank account is overflowing right now right?" +
                            "but that doesn't matter, I know you wouldn't kill him. How about we sit down for a talk?";
                }
            }
        }
        return ":3";
    }
}
