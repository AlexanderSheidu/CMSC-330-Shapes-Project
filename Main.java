// CMSC 330 Advanced Programming Languages
// Project 1 Skeleton
// UMGC CITE
// August 2021

import java.io.*;
import java.util.*;
import javax.swing.*;

// Declare these, to use these imports

/*
* The first programming project involves extending the Java skeleton program that it is provided in 
* the attached .zip file. That skeleton program displays a scene of graphic images contained in a 
* scene definition file.
*/

/**
* @author Alexander Sheidu
* Project 1
* Date: 5/27/2024
* Course: CMSC 330/6380
*/

// Project 1 main class

class Main {

    // The main method of the whole program, allows the name of the scene definition file to be input on the
    // command line or selected using the file chooser dialog window. It calls the parser to parse the scene
    // definition file and add the graphic objects to the scene.

    public static void main(String[] args) {
        // Declare scanner, and other parts to read file, declare GUI
    	Scanner stdin = new Scanner(System.in);
        String sceneFileName;
        File sceneFile;
        Scene scene;
        JFileChooser choice = new JFileChooser(new File("."));
        int option = choice.showOpenDialog(null);
        // Show GUI
        if (option == JFileChooser.APPROVE_OPTION)
            sceneFile = choice.getSelectedFile();
        // Ask for file name, after closing the chooser menu
        else {
            System.out.print("Enter scene file name or a single space to choose file from window: ");
            sceneFileName = stdin.nextLine();
            if (sceneFileName.trim().isEmpty()) {
                // User entered a single space, open the file chooser dialog
                JFileChooser choice2 = new JFileChooser(new File("."));
                int option2 = choice2.showOpenDialog(null);
                if (option2 == JFileChooser.APPROVE_OPTION) {
                    sceneFile = choice2.getSelectedFile();
                } else {
                    System.out.println("No file selected.");
                    return;
                }
            } else {
                // User entered a file name
                sceneFile = new File(sceneFileName);
                if (!sceneFile.exists()) {
                    System.out.println("File not found. Please check the file name and try again.");
                    return;
                }
            }
        }
        // try block to catch errors
        try {
            Parser parser = new Parser(sceneFile);
            scene = parser.parseScene();
            scene.draw();
        } catch (SyntaxError error) {
            System.out.println(error.getMessage());
        } catch (LexicalError error) {
            System.out.println(error.getMessage());
        } catch (IOException error) {
            System.out.println("IO Error");
        }
    }
}
