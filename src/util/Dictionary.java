package util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;

public class Dictionary {
    public static HashSet<String> getDictionary(String path) throws Exception {
        
        HashSet<String> dictionary = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                dictionary.add(line);
            }
            System.out.println("Berhasil memuat kamus data. \n" + path);
            return dictionary;
            
        } catch (Exception e) {
            throw e;
        }
    }
}
