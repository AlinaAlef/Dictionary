package com.epam.lab2.com.epam.lab2.sentence;

import com.epam.lab2.dictionary.Dictionary;
import com.epam.lab2.sentenceobjects.SentenceObject;
import com.epam.lab2.sentenceobjects.Word;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * The {@code com.epam.lab2.com.epam.lab2.sentence.SentenceParser} class holds a text as a list of sentences, provides methods to read the
 * text and create a dictionary of the words met in the text.
 * 
 * @author Alina Alef
 * @version 1.0 Build 12.15.2015
 */
public class SentenceParser {
	/**The value is used for holding distinct words in lexicographical order */
	private Dictionary dictionary;

	/**The value is used for saving list of sentences*/
	private List<Sentence> text;
	
	public SentenceParser() {
		dictionary = new Dictionary();
		text = new ArrayList<Sentence>();
	}
	
	/**
	 * Reads the text sentence-by-sentence from scanner.
	 * @param scanner the source of input data
	 */
	public void parse(Scanner scanner) {
		Sentence temp = null;
		
		// read all sentences
		while (scanner.hasNext()) {
			temp = new Sentence();
			temp.read(scanner);
			text.add(temp);
		}
	}
	
	/**
	 * Generates dictionary from the given list of sentences.
	 * @return the dictionary created from the sentences
	 */
	public Dictionary createDictionary() {
		for (Sentence sentence : text) {
			
			// loop through all sentences
			for (SentenceObject token : sentence) {
				
				// loop through all tokens in the sentence
				if (token instanceof Word) {
					
					// add word to vocabulary
					dictionary.addWord((Word) token);
				}
			}
		}
		
		return dictionary;
	}
	
	public Dictionary getDictionary() {
		return dictionary;
	}

}
