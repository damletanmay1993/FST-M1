package activities;
import org.apache.commons.io.FileUtils;

import java.io.*;

public class Activity14 {

    public static void main(String[] args) throws IOException {


        File file = null;
        boolean fStatus = false;
        try {
            file = new File("newfile.txt");
            fStatus = file.createNewFile();

        } catch (IOException e) {
            e.printStackTrace();
        }

        if (fStatus) {
            System.out.println("File created");
        } else {
            System.out.println("File already exists");
        }

        File fileUtil = FileUtils.getFile("newfile.txt");
        System.out.println("Data in file: " + FileUtils.readFileToString(fileUtil, "UTF8"));

        File destDir = new File("resources");

        FileUtils.copyFileToDirectory(file, destDir);
        File newFile = FileUtils.getFile(destDir,"newfile.txt");
        System.out.println("Data in file: " + FileUtils.readFileToString(newFile, "UTF8"));


    }
}
