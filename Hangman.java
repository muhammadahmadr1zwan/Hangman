public class Hangman {
    private String word;
    private StringBuilder currentGuess;
    private int attemptsLeft;

    public Hangman(String word) {
        this.word = word.toLowerCase();
        this.attemptsLeft = 8;
        this.currentGuess = new StringBuilder("_".repeat(word.length()));
    }

    public boolean makeGuess(char letter) {
        boolean isCorrect = false;
        letter = Character.toLowerCase(letter);

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                currentGuess.setCharAt(i, letter);
                isCorrect = true;
            }
        }

        if (!isCorrect) {
            attemptsLeft--;
        }
        return isCorrect;
    }

    public boolean isGameOver() {
        return attemptsLeft <= 0 || currentGuess.toString().equals(word);
    }

    public boolean isGameWon() {
        return currentGuess.toString().equals(word);
    }

    public String getCurrentGuess() {
        return currentGuess.toString();
    }

    public int getAttemptsLeft() {
        return attemptsLeft;
    }
}
