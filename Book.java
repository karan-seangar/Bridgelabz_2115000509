class Book{
    String title;
    String author;
    float price;

    Book(String title,String author,float price){
	this.title = title;
	this.author = author;
	this.price = price;
    }

    void show(){
	System.out.println(this.title);
	System.out.println(this.author);
	System.out.println(this.price);
    }


    public static void main(String[] args){
	Book book1 = new Book("Balidan","Swapnil Pandey",450);
	book1.show();
    }

}
