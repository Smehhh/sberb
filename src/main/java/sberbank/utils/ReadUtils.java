package sberbank.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadUtils {
    public static String filesReader(int id) {
        StringBuffer sBuffer = new StringBuffer("");
        String str;
        try (
                BufferedReader in = new BufferedReader(new FileReader("src/main/res/" + id + ".txt"))) {

            while ((str = in.readLine()) != null) {
                sBuffer.append(str);
            }
        } catch (IOException e) {
            System.out.println("description loading error");
        }
        return sBuffer.toString();
    }

}
