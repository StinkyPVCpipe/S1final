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

    public void setQcount(int qCount)
{
    questionCount = qCount;
}

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

                    //questionCount = qCount;
                    if (questionCount == 6)//PARENTS can we talk vs Ik u think i killed him
                    {
                        if (option == 1) {

                            return "Oh of course sweetheart, you know I'm here for you. Here come inside and sit down.";
                        }
                        if (option == 2) {
                            return "\n\tWell I mean, can you blame me? It is a little strange...your rich fiance dying just before" +
                                    "\n\tyou two got married. I mean, you know you're bank account is overflowing right now right?" +
                                    "\n\tbut that doesn't matter, I know you wouldn't kill him. How about we sit down for a talk?";
                        }
                    }
                    if (questionCount == 7)//talk to friend vs i think my parents killed him
                    {
                        if (option == 1)
                        {
                            return "\n\n\t'Right away mademoiselle, let us set off.'";
                        }
                        if (option == 2) {
                            return "\n\n\t'Are you certain mademoiselle? They did seem rather suspicious, and well...Ill take your word for it.'";
                        }
                    }
                    if (questionCount == 8) { //parents killed vs friend killed
                        if (option == 1) {
                            return "\n\n\t'Of course! Your parents acted so strange, and they said aloud that they never liked your fiance! We'll have them arrested immediately!";
                        }
                        if (option == 2) {
                            return "\n\n\t'Of course! Your friend acted so strange, and she said aloud that she wanted to marry before you! We'll have her arrested immediately!";
                        }
                    }
                    if (questionCount == 9)
                    {
                        if (option == 1)
                        {
                            return "\n\n\t'I don't know much...only that he was found dead this morning! And-'";
                        }
                        if (option == 2);
                        {
                            return "\n\n\t'Can you blame me for being surprised seeing you with another man, so soon after your fiance died...'";
                        }
                    }

        }
        return ":3";
    }
}
