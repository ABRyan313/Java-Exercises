import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        FileOutputStream fos = null;
        File file;
        String content = "AB RYAN";

        try{
            file = new File("E:\\me.txt");
            fos = new FileOutputStream(file);

            if(!file.exists()){
                file.createNewFile();
            }

            byte [] bytesArray = content.getBytes();
            fos.write(bytesArray);
            fos.flush();
            System.out.println("File Written Successfully");
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
        finally {
            try {
                if (fos != null)
                {
                    fos.close();
                }
            }
            catch (IOException ioe) {
                System.out.println("Error in closing the Stream");
            }
        }

    }
}