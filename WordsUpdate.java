/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSE105;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Yilin.Zhao 1405254
 */
public class WordsUpdate {

    //Add a new word and its meaning to the list.
    public static void addNewWord() throws IOException {
        //find the file.
        FileWriter filename = null; //Creates a character output stream class object which is associated with the existed file.
        PrintWriter writer = null; // format the written data.
        try {
            filename = new FileWriter("Dictionary.txt", true);// Creates output stream and judge if append.
            writer = new PrintWriter(filename);
        } catch (FileNotFoundException e) { //check if the file exists.
            e.printStackTrace();
            System.out.println("PrintWriter error while openning the file" + filename);
            System.exit(0);
        }       
        //user add content and programme writes it in file.
        System.out.println("Enter new word and meaning(three spaces between word and meaning):");
        String line = (new Scanner(System.in)).nextLine(); //switch user input into string line. 
        writer.println("\n" + line);
        writer.close();
        System.out.println("Add new word successfully.Please choose 1 to check.");
    }

    //Remove a word and its meaning from the list.
    public static void removeWord() throws FileNotFoundException, IOException {
        File file = new File("Dictionary.txt");
        System.out.println("Enter the word you want to remove:");
        String wordNeedToRemove = (new Scanner(System.in)).nextLine();//switch user input into string content.
        String rl = null;
        StringBuffer bf = new StringBuffer();
        BufferedReader br = new BufferedReader(new FileReader(file));
        while ((rl = br.readLine()) != null) { //traversal file line by line.
            rl = rl.trim(); // remove useless space.
            if (rl.indexOf(wordNeedToRemove) == -1) { //find the line which contains string of user input string and change it to null.
                bf.append(rl).append("\r\n");
            }
        }
        br.close();
        BufferedWriter out = new BufferedWriter(new FileWriter(file)); // put the removed content in buffer area.
        out.write(bf.toString());
        out.flush();       
        out.close();
        System.out.println("Remove word and its meaning successfully.Please choose 1 to check.");
    }
}
