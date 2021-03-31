/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Thomas Chavez
 */
public class FileManager {
 public static boolean createFile(String fileName) {
        boolean created = false;
        try {
            File file = new File(fileName + ".txt");
            if (file.createNewFile()) {
                System.out.println("file was created");

                created = true;
            } else {
                System.out.println("file already exists");
                created = false;

            }
        } catch (IOException ex) {
            ex.printStackTrace();
            created = false;
        }
        return created;
     }
     public static boolean save (String data, String fileName){
         boolean saved = false;
         createFile(fileName);
         
         try {
             FileWriter myWrite= new FileWriter(fileName + ".csv",true);
             myWrite.write(data+System.getProperty("Line.separator"));
             myWrite.close();
             System.out.println(" a new record of" + fileName + "was saved");
             saved = true;
         }catch (IOException ex) {
             ex.printStackTrace();
             saved = false;
         }
         return saved;
    
}

    public static String read(String filetoy) {
        filetoy = null;
        String text = "";
        String document = "C:\\Users\\Thomas Chavez\\Desktop\\ESPE202011-GEO-3285\\EXAMS\\unit 3\\EXAM FP -Toys\\toys.cvs";
        try ( BufferedReader textBr = new BufferedReader(new FileReader(document))) {
            while ((filetoy = textBr.readLine()) != null) {
                text = filetoy + "\n";
            }
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
        return text;
    }

 }
   
