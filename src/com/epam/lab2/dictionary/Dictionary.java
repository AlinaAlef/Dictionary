package com.epam.lab2.dictionary;

import com.epam.lab2.sentenceobjects.Word;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeSet;

/**
 * 
 * This class holds distinct words in lexicographical order, provides methods to
 * add new words and print the content to a given txt file.
 *
 * @author Alina Alef
 * @version 1.0 Build 12.15.2015
 */
public class Dictionary {
	private TreeSet<Word> words;
	
	public Dictionary() {
		words = new TreeSet<Word>();
	}

	/**
	 * Adds new word to the dictionary in case it is unique.
	 * @param word the word to be added to the vocabulary
	 * @return true if the word was successfully added, false - otherwise
	 */
	public boolean addWord(Word word) {
		return words.add(word);
	}
	
	/**
	 * Prints the content of the dictionary in lexicographical order to the
	 * html file. For each first letter in the word highlights the first word
	 * in the list with indent.
	 * @param filename the name of the txt file to be created (including extension)
	 */
	public void printToFile(String filename) {
		BufferedWriter out = null;
		char currentLetter = ' ';
		boolean newLetter = false;
		String currentWord = null;
		
		try {
			out = new BufferedWriter(new FileWriter(filename));
			out.newLine();
			
			for (Word word : words) {
				
				// write each word to the file
				word.makeInitialLetter();
				currentWord = word.getWord();

				
				if (Character.toLowerCase(currentWord.charAt(0)) != currentLetter) {
					
					/* we met new letter so the first word should be highlighted
					 * with indent.
					*/
					newLetter = true;
					currentLetter = Character.toLowerCase(currentWord.charAt(0));
				}

				
				if (newLetter) {
					out.write(" ");
					newLetter = false;
				}

				out.write(currentWord);
				out.newLine();
			}
			out.newLine();
			out.close();
		} catch (IOException e) {
			System.out.println("Can't write to the file " + filename);
		}
	}
}