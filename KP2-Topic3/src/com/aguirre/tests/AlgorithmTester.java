package com.aguirre.tests;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.aguirre.classes.WordWrappingClass;

public class AlgorithmTester {
	
	@Test
	public void empty() {
		WordWrappingClass wwc = WordWrappingClass.getInstance();
		List<String> words = wwc.wordWrapping("",5);;
		assertEquals(null,words);
	}

	@Test
	public void oneWord() {
		WordWrappingClass wwc = WordWrappingClass.getInstance();
		List<String> words = wwc.wordWrapping("Excelent",10);
		assertEquals("Excelent",words.get(0));
		words = wwc.wordWrapping("Excelent",5);
		assertEquals("Excel",words.get(0));
		assertEquals("ent",words.get(1));
	}
	
	@Test
	public void twoWords() {
		WordWrappingClass wwc = WordWrappingClass.getInstance();
		List<String> words = wwc.wordWrapping("Hello Word!",20);
		assertEquals("Hello Word!",words.get(0));
		words = wwc.wordWrapping("Hello Word!",7);
		assertEquals("Hello",words.get(0));
		assertEquals("Word!",words.get(1));		
	}
	
	@Test
	public void threeWords() {
		WordWrappingClass wwc = WordWrappingClass.getInstance();
		List<String> words = wwc.wordWrapping("Welcome Amilcar Infante",4);
		assertEquals("Welc",words.get(0));
		assertEquals("ome",words.get(1));
		assertEquals("Amil",words.get(2));
		assertEquals("car",words.get(3));
		assertEquals("Infa",words.get(4));
		assertEquals("nte",words.get(5));
	}
	
	@Test
	public void singleCharacters() {
		WordWrappingClass wwc = WordWrappingClass.getInstance();
		List<String> words = wwc.wordWrapping("a b c d e f",3);
		assertEquals("a b",words.get(0));
		assertEquals("c d",words.get(1));
		assertEquals("e f",words.get(2));		
	}

	
}
