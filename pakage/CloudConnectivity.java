import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class content {
	
	String word="" ; 
	int val=0;
    while(!word.matches("quit"))
    {
        System.out.println("Enter the word to be searched for");
        Scanner input = new Scanner(System.in);
        word = input.next();
        Scanner file = new Scanner(new File("newFile.txt"));

        while(file.hasNextLine())           
        {
            String line = file.nextLine();
            if(line.indexOf(word) != -1)
            {
                System.out.println("Word EXISTS in the file");
                val = 1;
                break;
            }
            else
            {
                val = 0;
                continue;
            }
        }
        if(val == 0)
        {
            System.out.println("Word does not exist");
        }
        System.out.println("-------continue or quit--- enter continue or quit");
        word = input.next();        
    }   
}
}
