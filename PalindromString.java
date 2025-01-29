
class PalindromString{
    public static void main(String[] args){
	String text = "level";
	int firstPointer = 0;
	int lastPointer = text.length()-1;
	System.out.println("Original String is " + text);
	while(firstPointer != lastPointer){
	    if(text.charAt(firstPointer) != text.charAt(lastPointer)){
		System.out.println("false");
		break;
	    }
	    firstPointer++;
	    lastPointer--;
	}
	System.out.println("True");
    }
}
