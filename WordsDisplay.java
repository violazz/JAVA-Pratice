/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSE105;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Yilin.Zhao 1405254
 */
public class WordsDisplay {

    //Display all words  and meaning in alphabetical order from the text file.
    public static void readAllWordsInAlphabeticalOrder() {
        String[] keyword = fileRead("Dictionary.txt");
        Arrays.sort(keyword);//sort the array in alphabetical order.
        for (int i = 0; i < keyword.length; i++) {
            System.out.print(keyword[i] + "\r\n");
        }
    }

    // Display all words starting with particular letter or letters.
    public static void displayWordsStartingWithParticularLetters() throws FileNotFoundException, IOException {
        System.out.println("Enter the starting letter or letters of word:");
        String input = (new Scanner(System.in)).next(); //switch user input into string content.
        File file = new File("Dictionary.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));// read content from file.
        String line = "";
        while ((line = reader.readLine()) != null) {
            String part = line.substring(0,input.length()); //intercept between the first letter of word and the pointed position of word.
            if (part.equals(input)) { //find the line whose pointed position is same as user input.
                System.out.println(line);
            }          
        }
    }

    //Read the file and convert string content to an arraylist.
    public static String[] fileRead(String path) {
        List<String> tmp = new ArrayList<String>();
        File file = new File(path);
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) { //traverse file and add all string lines into the list one by one.
                tmp.add(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return convertStringArray(tmp);
    }

    //List convert to String[].
    public static String[] convertStringArray(List<String> list) {
        String[] strArray = new String[list.size()]; // creare the string array with the size of list.
        int i = 0;
        for (String s : list) { //switch the list to string array.
            strArray[i++] = s;
        }
        return strArray;
    }
}
