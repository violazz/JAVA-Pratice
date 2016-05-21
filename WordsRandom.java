/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSE105;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Yilin.Zhao 1405254
 */
public class WordsRandom {

    // Check if the word that user enter in matches to the correct word of given meaning.
    public static boolean checkWord() throws FileNotFoundException, IOException {
        String line = randomLine();
        String[] strArray = line.split("   "); //switch the string line into a string array and segment the array by three spaces and break into two elements.
        System.out.println(Arrays.asList(strArray[1])); // the second element is meaning of word.
        System.out.println("Please enter the word of this meaning:");
        Scanner scanner = new Scanner(System.in);       
        String word = scanner.next();
        while (true) {
            if (word.equals(strArray[0])) { // check if input word is same as the first element which is the word of the given meaning.
                System.out.println("Spell correctly.");
                return true;
            } else {
                System.out.println("Wrong spelling.Enter again:");
                word = scanner.next();
            }
        }
    }

    // Display the word with meaning which are created randomly.
    public static void displayWordWithMeaningRandomly() throws IOException {
        randomLine();
        System.out.println(randomLine());
    }

    //Create a word with meaning randomly.
    public static String randomLine() throws IOException {
        FileReader a = new FileReader("Dictionary.txt");
        BufferedReader b = new BufferedReader(a);
        int i = 0;
        String byteread;
        do {
            byteread = b.readLine();// traverse file and find lin number.
            i++;
        } while (byteread != null);
        
        // traverse file again to find the pointed line of randomly created line number.
        FileReader af = new FileReader("Dictionary.txt");
        BufferedReader bf = new BufferedReader(af);
        int LineNum = i - 1;
        int LineRead = (int) Math.ceil(1 + Math.random() * (LineNum - 1)); //create a random line number.
        for (int j = 1; j <= LineRead; j++) {
            byteread = bf.readLine();
        }
        return byteread;
    }
}
