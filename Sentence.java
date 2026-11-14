package base;

public class Sentence {
    private String text;

    public Sentence(String text) {
        this.text = text;
    }

    public String[] words() {
        return this.text.split(" ");
    }

    public String shortestWords() {
        String[] words = words();
        String shortest = text;
        for(int i = 0; i < words.length; ++i) {
            if (words[i].length() < shortest.length()) {
                shortest = words[i];
            }
        }
        return shortest;
    }

    public boolean containsWords(String word) {
        String[] words = words();
        for (int i = 0; i < words.length; ++i) {
            if (words[i].equals(word)) {
                return true;
            }
        }
        return false;
    }
    // Подсчёт гласных букв
    public int countVowels() {
        int count = 0;
        String vowels = "аеёиоуыэюяАЕЁИОУЫЭЮЯ";

        for (int i = 0; i < text.length(); i++) {
            if (vowels.indexOf(text.charAt(i)) != -1) {
                count++;
            }
        }

        return count;
    }

    public boolean isExclamation(){
        return(this.text.charAt(text.length()) == '!');
    }

    @Override
    public String toString(){
        return this.text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || !o.getClass().equals(this.getClass())) {
            return false;
        }
        Sentence sentence = (Sentence)o;
        return text.equals(sentence.text);
    }

    @Override
    public int hashCode() {
        return text.hashCode();
    }
}
