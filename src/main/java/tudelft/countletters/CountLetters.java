package tudelft.countletters;

import org.jetbrains.annotations.NotNull;

public class CountLetters {

    public int count(@NotNull String str) {
        int words = 0;
        char last = ' ';
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isLetter(str.charAt(i)) && (last == 's' || last == 'r')) {
                words++;
            }
            last = str.charAt(i);
        }
        if(last == 's' || last == 'r') {
            words++;
        }
        return words;
    }
}