class RemoveDuplicateFromString{
    public static void main(String[] args){
	String text = "hello everyone i am karan";
	String result = "";
	for(int i=0;i<text.length();i++){
	    char ch = text.charAt(i);
	    if(result.indexOf(ch) == -1){
		result += ch;
	    }
	}
	System.out.println("Original String is: " + text);
	System.out.println("resultant String is: " + result);
    }
}
