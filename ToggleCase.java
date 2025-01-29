public class ToggleCase {
    public static void main(String[] args) {
        String str = "Hello World!";
        StringBuilder toggledStr = new StringBuilder();
        
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                toggledStr.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                toggledStr.append(Character.toUpperCase(ch));
            } else {
                toggledStr.append(ch);
            }
        }
        
        System.out.println("Toggled case string: " + toggledStr);
    }
}
