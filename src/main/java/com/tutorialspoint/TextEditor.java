package com.tutorialspoint;

/**
 * Created by gannyee on 2017/2/18.
 */
public class TextEditor {
    private SpellChecker spellChecker;

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void setSpellChecker(SpellChecker spellChecker) {
        System.out.println("Inside setSpellchecker");
        this.spellChecker = spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
