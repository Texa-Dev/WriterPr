package pack;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        String file = "setting.txt";

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file)))
        {
            Settings s = new Settings("Sam", 33, 18);
            oos.writeObject(s);

        }
        catch(Exception e){
            e.printStackTrace();
        }


    }
}