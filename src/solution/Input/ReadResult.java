package solution.Input;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadResult {
    public static <T> T getToFile(String fileName){
        T obj = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("testFile"))){
            obj = (T)ois.readObject();
        } catch (ClassNotFoundException e){
            System.out.println("Чтение постороннего класса");
        } catch (IOException e){
            System.out.println("Файл не найден");
        }

        return obj;
    }
}
