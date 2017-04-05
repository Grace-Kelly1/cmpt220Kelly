import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Count {
	public static void main(String[] args) {
		//12.13
		//Length
        if (args.length != 1) {
            System.out.println("Invalid arguments.");
            System.out.println("Usage: java Chapter_12.Exercise_13 filename");
            System.exit(1);
        }
        //Create File
        File filename = new File(args[0]);
        if (!filename.exists()) {
            System.out.println(filename + " does not exist.");
            System.exit(2);
        }

        int characters = 0;
        int words = 0;
        int lines = 0;
        //Try
        try {
            Scanner input = new Scanner(filename);
            while (input.hasNext()) {
                String s = input.nextLine();
                lines++;
                characters += s.length();
                String[] split = s.split(" ");
                for (String word : split) {
                    words++;
                }
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        //Display
        System.out.println("Characters: " + characters);
        System.out.println("Words: " + words);
        System.out.println("Lines: " + lines);


    }
}
