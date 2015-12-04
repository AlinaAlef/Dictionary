package com.epam.lab2.sentenceobjects;

/**
 * This is the abstract class to store and manipulate symbols.
 * 
 * @author Alina Alef
 * @version 1.0 Build 12.15.2015
 *
 */
public abstract class Symbol {
	private char symbol;
	
	/**
	 * Creates new com.epam.lab2.sentenceobjects.Symbol by the given character.
	 * @param symbol the character to be stored
	 */
	protected Symbol(char symbol) {
		this.symbol = symbol;
	}
	
	/**
	 * Returns the stored character.
	 * @return the character representation of the com.epam.lab2.sentenceobjects.Symbol
	 */
	public char getSymbol() {
		return symbol;
	}
}