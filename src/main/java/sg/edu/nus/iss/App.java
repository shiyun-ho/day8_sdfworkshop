package sg.edu.nus.iss;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        // ConcurrentHashMap chme = new ConcurrentHashMap();
        // chme.example();

        //LinkedListExample lle = new LinkedListExample();
        //lle.example();

        // StackExample se = new StackExample();
        // StackExample.example(); 

        String dirPath ="./data";
        String fileName = "data.txt"; 

        //creates a directory
        File newDir = new File(dirPath);
        boolean isDirCreated = newDir.mkdir();

        if(isDirCreated){
            System.out.println("New directory " + dirPath + " created.");
        } else{
            System.out.println("Directory " + dirPath + "already exists");
        }
//create a fie in the directory created above
        File newFile = new File(dirPath + File.separator + fileName);
        boolean isFileCreated = newFile.createNewFile();

        if (isFileCreated){
            System.out.println("New file "+ fileName + " created");
        } else {
            System.out.println("File " + fileName + "already exists");
        }

        //lists files under a directory
        File fileList[] = newDir.listFiles();
        for(File f: fileList){
            System.out.println("File " + f.getPath() + f.getCanonicalFile());
        }

        //using fileoutput stream to  write some integers to file 'data.txt'
        FileOutputStream fos = new FileOutputStream(newFile);

        //text file to file requires character
        for (int i = 0; i<10; i++){
            char str[] = Integer.toString(i).toCharArray();
            //original form accepts byte
            fos.write(str[0]);
            fos.write('\n');
        }

        //testing reading string
        String welcomeMsg = "WElcome to ISS TFIP Prog"; 

        //converts to byte
        byte[] outputData = welcomeMsg.getBytes();
        
//converts string to byte[] array using getBytes()
//writes string in byte array
//one character at a time to the file
        fos.write(outputData);
        fos.flush();
        fos.close();


    }
}
