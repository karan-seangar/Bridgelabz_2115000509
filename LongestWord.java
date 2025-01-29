class LongestWord{
    public static void main(String[] args){
	String text = "the great brown fox jump upon the lazy dog";
	String word = "";
	String longestWord = "";
	for(int i=0;i<text.length();i++){
	    if(text.charAt(i) == ' '){
		if(word.length()>longestWord.length()){
		    longestWord = word;
		}
		word = "";
	    }
	    word += text.charAt(i);
	}
	System.out.println("Original text is: " + text);
	System.out.println("longest word is: " + longestWord);
    }
}
