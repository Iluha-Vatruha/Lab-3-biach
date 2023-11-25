package solution.Output;

import solution.Text.TextSolution;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteResult {
    public static <T> void saveToFile(T value, String fileName){
        try(ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(fileName))
        ){
            oos.writeObject(value);
        } catch (FileNotFoundException e){
            System.out.println("Плохое имя файла");
        } catch (IOException e){
            System.out.println("Ошибка записи");
        }
    }
}
