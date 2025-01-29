public class SubstringCounter {
    public static int countOccurrences(String str, String sub) {
        if (str == null || sub == null || sub.isEmpty()) {
            return 0;
        }
        int count = 0;
        int index = 0;
        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length(); // Move index forward
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "hello world, hello everyone. hello!";
        String sub = "hello";
        int occurrences = countOccurrences(str, sub);
        System.out.println("The substring '" + sub + "' appears " + occurrences + " times in the string.");
    }
}
