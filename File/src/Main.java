import java.io.File;
import java.io.IOException;

import static javax.print.attribute.standard.MediaSizeName.C;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        try {
            File file = new File("E:\\ABC.txt");

            boolean ref = file.createNewFile();

            if (ref){
                System.out.println("file has been created");
            }
            else {
                System.out.println("file does not exist");
            }
        }
        catch(IOException e){
            System.out.println("Exception Occurred:");
            e.printStackTrace();
        }

        }
    }
