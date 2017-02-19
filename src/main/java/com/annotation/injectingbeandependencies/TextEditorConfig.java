package com.annotation.injectingbeandependencies;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by gannyee on 2017/2/19.
 */
@Configuration
public class TextEditorConfig {
    @Bean
    public TextEditor textEditor() {
        return new TextEditor(spellerChecker());
    }

    @Bean
    public SpellerChecker spellerChecker() {
        return new SpellerChecker();
    }
}
