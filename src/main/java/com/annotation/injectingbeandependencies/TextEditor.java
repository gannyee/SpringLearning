package com.annotation.injectingbeandependencies;

/**
 * Created by gannyee on 2017/2/19.
 */
public class TextEditor {
    private SpellerChecker spellerChecker;

    public TextEditor(SpellerChecker spellerChecker) {
        System.out.println("Inside TextEditor constructor. ");
        this.spellerChecker = spellerChecker;
    }

    public void spellchecker() {
        spellerChecker.checkSpelling();
    }

}
