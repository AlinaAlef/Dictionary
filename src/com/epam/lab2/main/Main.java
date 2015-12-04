package com.epam.lab2.main;

import com.epam.lab2.com.epam.lab2.sentence.SentenceParser;
import org.omg.PortableInterceptor.INACTIVE;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Creates parser which reads a text from the file to the list of sentences,
 * creates dictionary and prints its content to txt file.
 * 
 * @author Alina Alef
 * @version 1.0 Build 12.15.2015
 *
 */
public class Main {
	/**
	 * Creates parser which reads a text from the file to the list of sentences,
	 * creates dictionary and prints its content to txt file.
	 * @param args command line arguments
	 */
	public static void main(String[] args) {

		SentenceParser parser = new SentenceParser();
		
		try {
			parser.parse(new Scanner(new File("input.txt")));
		} catch (FileNotFoundException e) {
			System.out.println("Can't open the file input.txt");
		}
		
		parser.createDictionary().printToFile("output.txt");
		System.out.println("Result in the output.txt");
	}
}
