import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BufferedWriter br = null;



        try{
            String content = "ABNB";

            File file = new File("E:\\AB.txt");
            if(!file.exists()){
                file.createNewFile();
            }

            FileWriter fr = new FileWriter(file);
            br = new BufferedWriter(fr);
            br.write(content);
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
        finally
        {
            try{
                if(br!=null)
                    br.close();
            }catch(Exception ex){
                System.out.println("Error in closing the BufferedWriter"+ex);
            }
        }


    }
}