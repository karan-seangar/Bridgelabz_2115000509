class RemoveCharacter {
    public static void main(String[] args) {
        String str = "Hello World";  
        char charToRemove = 'l';     
        
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != charToRemove) {
                result.append(str.charAt(i));
            }
        }
        
        String modifiedString = result.toString();
        
        System.out.println("Modified String: " + modifiedString);
    }
}
