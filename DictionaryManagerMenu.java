/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSE105;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Yilin.Zhao 1405254
 */
public class DictionaryManagerMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {        
        System.out.println("Welcome to Dictionary Manager. Please enter the number of function:");
        mainMenuRun();
    }
    // Run the main menu with all choices.
    public static void mainMenuRun() throws IOException {
        boolean exit = false;
        String select = "";
        while (!exit) {
            System.out.println("0=Exit, 1=Read all words and meanings from file, 2=Display words starting with a particular letter or letters,");
            System.out.println("3=Display a random word with meaning, 4=Enter the word according to the meaning, 5=Add new word, 6=Remove a word");
            select = inputString();
            System.out.println();
            switch (select) {
                case "0":
                    exit = true;
                    break;
                case "1":
                    WordsDisplay.readAllWordsInAlphabeticalOrder();
                    break;
                case "2":
                    WordsDisplay.displayWordsStartingWithParticularLetters();
                    break;
                case "3":
                    WordsRandom.displayWordWithMeaningRandomly();
                    break;
                case "4":
                    WordsRandom.checkWord();
                    break;
                case "5":
                    WordsUpdate.addNewWord();
                    break;
                case "6":
                    WordsUpdate.removeWord();
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
    }
    
    // user input.
    public static String inputString() {
        Scanner kb = new Scanner(System.in);
        return kb.nextLine();
    }   
}
