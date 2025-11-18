package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file full path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            Map<String, Integer> urn = new LinkedHashMap<>();

            String line = br.readLine();
            while (line != null) {

                String[] fields = line.split(",");
                String name = fields[0];
                int vote = Integer.parseInt(fields[1]);

                urn.put(name, urn.getOrDefault(name,0) + vote);

                line = br.readLine();

            }

            for (String candidate : urn.keySet()){
                System.out.println(candidate + ": " + urn.get(candidate));
            }


        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}