package com.epam.lab2.sentenceobjects;

/**
 * The {@code com.epam.lab2.sentenceobjects.Word} class represents  a word, provides method to compare 2 words by their
 * lexicographical order.
 * 
 * @author Alina Alef
 * @see     java.lang.Object#toString()
 * @see     java.lang.StringBuilder
 * @since   JDK1.0
 */
public class Word implements Comparable<Word>, SentenceObject {
	/** The value is used for one unique word storage. */
	private String word;

	/**
	 * Initializes a newly created {@code com.epam.lab2.sentenceobjects.Word} object so that it represents
	 * the same word as the argument; in other words, the
	 * newly created string is a copy of the argument string.
	 *
	 * @param  word
	 *         A {@code com.epam.lab2.sentenceobjects.Word}
	 */
	public Word(String word) {
		this.word = word;
	}
	
	public void setWord(String word) {
		this.word = word;
	}
	
	public String getWord() {
		return word;
	}

	public void makeInitialLetter() {
		StringBuilder sb = new StringBuilder();
		sb.append(Character.toUpperCase(word.charAt(0)));
		sb.append(word, 1, (word.length()));
		word = sb.toString();
	}

	@Override
	public int compareTo(Word anotherWord) {
		return word.compareToIgnoreCase(anotherWord.getWord());
	}
}