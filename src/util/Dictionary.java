package util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;

public class Dictionary {
    public static HashSet<String> getDictionary() throws Exception {
        
        HashSet<String> dictionary = new HashSet<>();

        String inputFile = "src/util/dictionary.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                dictionary.add(line);
            }
            System.out.println("Berhasil memuat kamus data.");
            return dictionary;
            
        } catch (Exception e) {
            throw e;
        }
    }
}
