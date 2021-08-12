import java.io.*;
import java.util.*;

public class FileHandling {
    public static void main(String[] args) throws Exception {
        CreateFile createFile = new CreateFile();
        DeleteFile deleteFile = new DeleteFile();
        ReadFile readFile = new ReadFile();
        WriteFile writeFile = new WriteFile();
        FileInfo fileInfo = new FileInfo();

        File file = createFile.createTxtFile("demo");
        writeFile.overWrite("demo", "This is a First line of code............");

        System.out.println();
        readFile.read("demo");

        System.out.println();
        fileInfo.getFileInfo("demo");

//        deleteFile.deleteTxtFile("demo");

    }
}

class CreateFile {
    public File createTxtFile(String fileName) throws Exception {
        File file = new File(fileName+".txt");
        if (file.createNewFile())
            System.out.println("File is created : " + file.getName());
        else
            System.out.println("File is already exists.\nTry to create file with different name.");
        return file;
    }
}
class DeleteFile {
    public void deleteTxtFile(String fileName) {
        File file = new File(fileName+".txt");
        if (file.exists()){
            file.delete();
            System.out.println("File " + file.getName() + " was deleted.");
        }else{
            System.out.println("File " + file.getName() + " doesn't exists :(\nTry to delete Existing file(s)...");
        }

    }
}
class ReadFile {
    public void read(String fileName) throws Exception {
        File file = new File(fileName+".txt");
        Scanner fileReader = new Scanner(file);
        int i=1;
        while (fileReader.hasNextLine()){
            System.out.println(i++ +") " + fileReader.nextLine());
        }
        fileReader.close();
    }
}
class WriteFile {
    public void overWrite(String fileName, String text) throws Exception{
        File file = new File(fileName+".txt");
        if (file.exists()){
            FileWriter fileWrite = new FileWriter(fileName+".txt");
            fileWrite.write(text);
            fileWrite.close();
            System.out.println("Text, Successfully wrote to the file.");
        }else{
            System.out.println("File " + file.getName() + " doesn't exists :(\nTry to write in Existing file(s)...");
        }
    }
    public void writeAppend(String fileName, String text) throws Exception {
        File file = new File(fileName+".txt");
        if (file.exists()){
            FileWriter fileWrite = new FileWriter(fileName+".txt", true);
            fileWrite.append(text);
            fileWrite.close();
            System.out.println("Text, Successfully wrote to the file.");
        }else{
            System.out.println("File " + file.getName() + " doesn't exists :(\nTry to write in Existing file(s)...");
        }
    }
    public void writeNewLine(String fileName, String text) throws Exception {
        File file = new File(fileName+".txt");
        if (file.exists()){
            FileWriter fileWrite = new FileWriter(fileName+".txt", true);
            fileWrite.write("\n"+text);
            fileWrite.close();
            System.out.println("\nText, Successfully wrote to the file.");
        }else{
            System.out.println("File " + file.getName() + " doesn't exists :(\nTry to write in Existing file(s)...");
        }
    }
}
class FileInfo {
    public void getFileInfo(String fileName) {
        File file = new File(fileName+".txt");
        if (file.exists()){
            System.out.println("File Name : " + file.getName());
            System.out.println("Absolute Path : " + file.getAbsolutePath());
            System.out.println("Writeable : " + file.canWrite());
            System.out.println("Readable : " + file.canRead());
            System.out.println("Total Space : " + file.getTotalSpace());
            System.out.println("Remaining Space : " + file.getFreeSpace());
        }else {
            System.out.println("File " + file.getName() + " doesn't exixts :(\nTry to open Existing file(s)...");
        }
    }
}