public class WordReplacer {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog.";
        String wordToReplace = "fox";
        String replacementWord = "cat";
        
        sentence = sentence.replaceAll("\\b" + wordToReplace + "\\b", replacementWord);
        
        System.out.println("Modified Sentence: " + sentence);
    }
}
