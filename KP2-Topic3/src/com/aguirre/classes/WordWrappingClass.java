package com.aguirre.classes;

import java.util.ArrayList;
import java.util.List;

public class WordWrappingClass {

	private static WordWrappingClass instance = null;
	
	private WordWrappingClass() {
	}
	
	public static WordWrappingClass getInstance() {
		if (instance == null) {
			instance = new WordWrappingClass();}
		return instance;
	}

	public List<String> wordWrapping(String word, int lenght) {
		if((word == null) || (word.equals("")) || (lenght < 0)) {
			return null;}
		
		List<String> result = new ArrayList<String>();
		if (word.length() <= lenght) {
			result.add(word);
			return result;}
		
		//list of individual words
		List<String> words = separatedWords(word);
		
		int pos = 0;
		
		while (pos < (words.size() - 1)) {
			String current = words.get(pos);
			//the word has the exact size
			if (current.length() == lenght) {
				result.add(current);
				pos++;}
			//the word has a length less than indicated
			else if (current.length() < lenght) {
					//the word can merge with the following
					if ((current.length() + 1 + words.get(pos + 1).length()) <= lenght) {
						String newWord = current + " " + words.get(pos + 1);
						words.set(pos + 1, newWord);}
					else {
						result.add(current);}
					pos++;}
				//the word should be separated
				else {
					String s1 = current.substring(0,lenght);
					String s2 = current.substring(lenght,current.length());
					result.add(s1);
					words.set(pos, s2);}}
		
		String last = words.get(pos); 
		if(last.length() <= lenght) {
			result.add(last);}
		else {
			String s1 = last.substring(0,lenght);
			String s2 = last.substring(lenght,last.length());
			result.add(s1);
			result.add(s2);}	
		return result;
	}
	/*
	private void wrappWord(String word, int lenght, List<String> result) {
		int pos = 0;
		String aux; int count;
		while (pos < word.length()) {
			count = 0;
			aux = "";
			while ((pos < word.length()) && (count < lenght)) {
				aux += word.charAt(pos);pos++;count++;}
			result.add(aux);}
		
	}*/

	private List<String> separatedWords(String word) {
		List<String> words = new ArrayList<String>();
		int pos = 0;String aux;
		while (pos < word.length()) {
			aux = "";
			while ((pos < word.length()) && (word.charAt(pos) != ' ')) {
				aux += word.charAt(pos++);}
			while ((pos < word.length()) && (word.charAt(pos) == ' ')) {
				pos++;}
			words.add(aux);}
		return words;
	}
	
}
