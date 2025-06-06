import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        File file = new File("E:\\AB.txt");
        BufferedInputStream bis = null;
        FileInputStream fis = null;

        try{
            fis = new FileInputStream(file);
            bis = new BufferedInputStream(fis);

            while(bis.available() > 0){
                System.out.println((char)bis.read());
            }
        }
        catch(FileNotFoundException fnfe){
            System.out.println("file not Found" + fnfe);
        }
        catch(IOException e){
            System.out.println(e);
        }
        finally
        {
            try{
                if(bis != null && fis!=null)
                {
                    fis.close();
                    bis.close();
                }
            }catch(IOException ioe)
            {
                System.out.println("Error in InputStream close(): " + ioe);
            }
        }
    }
}