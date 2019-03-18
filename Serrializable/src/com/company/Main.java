package com.company;
import java.io.*;

public class Main implements Serializable {
    public static void main(String[] args) {
        Device obj = new Device();

        obj.id = 0;
        obj.name = "Macbook";
        obj.hdd = 1024;
        obj.ssd = 128;
        obj.cpu = new CPU("intel", 2000, 4, "cabylake");

        try{
            writeToFile(obj);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try{
            readFile();
        } catch (ClassNotFoundException ex) {

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public static void writeToFile(Device d) throws IOException {


        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("device.bin"));

        objectOutputStream.writeObject(d);
    }
    public static void readFile() throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("device.bin"));

        Device d = (Device) objectInputStream.readObject();

        System.out.println(d);
    }
}
