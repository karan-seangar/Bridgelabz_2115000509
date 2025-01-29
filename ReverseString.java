class ReverseString{
    public static void main(String[] args){
	String text = "BridgeLabs";
	String resultText = "";
	for(int i=text.length()-1;i>=0;i--){
	    resultText += text.charAt(i);
	}
	System.out.println("Original text is " + text);
	System.out.println("Reverse text is " + resultText);
    }
}
