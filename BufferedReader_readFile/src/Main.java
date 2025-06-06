import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        FileReader fr = null;
        BufferedReader br = null;

        try {

             fr = new FileReader("E:\\AB.txt");
             br = new BufferedReader(fr);

            String contentLine = br.readLine();
            while(contentLine != null){
                System.out.println(contentLine);
                contentLine = br.readLine();
            }
        }
        catch(FileNotFoundException f){
            System.out.println("Not found");
        }
        catch(IOException e){
            System.out.println(e);
        }

        finally{
            try{
                if(br != null){
                    br.close();
                }
            }
            catch(IOException e)
            {
                System.out.println("Error in closing the BufferedReader");
            }
        }
    }
}