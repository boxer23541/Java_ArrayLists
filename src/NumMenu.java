import java.util.ArrayList;
import java.util.Scanner;

public class NumMenu
{
    static ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args)
    {
        final int OPEN = 1;
        final int LOAD = 2;
        final int VIEW = 3;
        final int SAVE = 4;
        final int QUIT = 5;
        final String MENU = "1) Open\n2) Load\n3) View\n4) Save\n5) Quit\n";

        final int FIRST_CMD = 1;
        final int LAST_CMD = 5;

        Scanner in = new Scanner(System.in);
        int cmd = 0;

        boolean done = false;

        do
        {
            //get the user cmd
            displayList();
            cmd = SafeInput.getRangedInt(in, MENU, FIRST_CMD, LAST_CMD);

            //execute it

            switch (cmd)
            {
                case OPEN:

                    break;
                case LOAD:

                    break;
                case VIEW:

                    break;
                case SAVE:

                    break;
                case QUIT:
                    System.out.println("Thanks for running the code!");
                    System.exit(0);
                    break;
            }
        }while(!done);
    }

    private static void displayList()
    {
        if (list.size() == 0)
        {
            System.out.println("The list is currently empty...");
        }
        else
        {
            for (String l : list)
            {
                System.out.println(l);
            }
        }
    }
}
