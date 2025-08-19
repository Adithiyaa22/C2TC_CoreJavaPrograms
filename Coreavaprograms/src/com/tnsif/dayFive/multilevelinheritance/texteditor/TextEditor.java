package com.tnsif.dayFive.multilevelinheritance.texteditor;

public class TextEditor {

	public static void main(String[] args) {
		Word word = new Word();

		word.write("This is Core Java Mutliple Inheritance ");
		word.formatText(true);
		word.write("Example Program!");
		word.displayContent();

		word.spellCheck();

		System.out.println("Is text in Wordpad bold? " + word.isBold());
		System.out.println("Disabling spell check in Word.");
		word.enableSpellCheck(false);
		word.spellCheck();
	}

}
