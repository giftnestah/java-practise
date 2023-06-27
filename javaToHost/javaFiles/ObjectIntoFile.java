package javaFiles;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * ObjectOutputStream writes objects into a file
 * including hashmaps and arraylist objects
 * BufferedWriter and FileWriter class also writes into file object
 * import java.io.File,
 * import java.io.FileWriter,
 * import java.io.BufferedWriter
 */
class UserInfo {
    private HashMap<String,String> dataTable = new HashMap<String,String>();

    public void setDataTable()
    {
        Scanner in = new Scanner(System.in);
        String name,lang;
        for(int count = 0;count <= 4;count++)
        {
            System.out.println("Enter your two names:");
            name = in.nextLine();
            System.out.println("Enter your best programming language:");
            lang = in.nextLine();
            this.dataTable.put(name,lang);
        }
        System.out.println("Info added to Data Table successfully");
    }

    public void setDataTable(HashMap<String, String> dataTable)
    {
        this.dataTable = dataTable;
    }

    public HashMap<String, String> getDataTable()
    {
        return this.dataTable;
    }
    public void printInfo()
    {
        HashMap<String,String> map = new HashMap<String,String>();
        map = this.getDataTable();
        int i = 1;
        for(Map.Entry elem : map.entrySet())
        {
            System.out.println(i+". "+elem.getKey()+" : "+elem.getValue());
            i++;
        }
    }
}

public class ObjectIntoFile {
    public static void mapToFile(HashMap<String,String> map,String filepath)
    {
        File out = new File(filepath);
        BufferedWriter buff = null;

        try{
            if(out.createNewFile())
            {
                System.out.println("File created successfully: "+filepath);
            }
            else System.out.println("File already exists...");

            buff = new BufferedWriter(new FileWriter(out));

            for (Map.Entry<String,String> entry : map.entrySet())
            {
                buff.write(entry.getKey() + ":" + entry.getValue());
                buff.newLine();
            }
            buff.flush();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally {
            try{
                buff.close();
            }
            catch (Exception e){
            }
        }

    }
    public static void mapObjectToFile(HashMap<String,String> map,String filePath)
    {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try{
            fos = new FileOutputStream(filePath);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(map);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static HashMap<String, String> mapObjectFromFile(String filePath)
    {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        HashMap<String,String> map = new HashMap<String,String>();
        try{
            fis = new FileInputStream(filePath);
            ois = new ObjectInputStream(fis);
            map = (HashMap<String, String>) ois.readObject();
            int i = 1;
            for(Map.Entry elem : map.entrySet())
            {
                System.out.println(i+". "+elem.getKey()+" : "+elem.getValue());
                i++;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return map;
    }
    public static HashMap<String,String> createMap()
    {
        HashMap<String,String> newMap = new HashMap<String,String>();
        Scanner in = new Scanner(System.in);
        String name,lang;
        for(int count = 0;count <= 4;count++)
        {
            System.out.println((count + 1)+"Enter your two names:");
            name = in.nextLine();
            System.out.println("Enter your best programming language:");
            lang = in.nextLine();
            newMap.put(name,lang);
        }
        System.out.println("Info added to HashMap successfully");
        return newMap;
    }
    public static void main(String[] args)
    {
        /**
         * UserInfo devInfo = new UserInfo();
         * devInfo.setDataTable();
         * mapObjectToFile(devInfo.getDataTable(),"userDataObject.txt");
         * System.out.println("Object written to file\nNow reading object from file...");
         */
        mapObjectToFile(createMap(),"userDataObject.txt");
        mapObjectFromFile("userDataObject.txt");
    }
}
