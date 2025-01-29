class MostFrequentCharacter {
    public static void main(String[] args) {
        String str = "success";
        int[] frequency = new int[256];
        
        for (char ch : str.toCharArray()) {
            frequency[ch]++;
        }
        
        char mostFrequentChar = ' ';
        int maxCount = 0;
        
        for (char ch : str.toCharArray()) {
            if (frequency[ch] > maxCount) {
                maxCount = frequency[ch];
                mostFrequentChar = ch;
            }
        }
        
        System.out.println("Most Frequent Character: '" + mostFrequentChar + "'");
    }
}


