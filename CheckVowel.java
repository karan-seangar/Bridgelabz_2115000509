class CheckVowel{
    public static void main(String[] args){
	String text = "how are you my friend";
	int countVowel = 0;
	int countConsonant = 0;
	for(int i=0;i<text.length();i++){
	    if(text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o' || text.charAt(i) == 'u'){
		countVowel++;
	    }
	    else{
		countConsonant++;
	    }
	}
	System.out.println("Original text is " + text);
	System.out.println("vowels in text are " + countVowel);
	System.out.println("consonant in text are " + countConsonant);
    }
}
