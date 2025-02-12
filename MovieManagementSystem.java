class Movie{

    private MovieNode head;
    private MovieNode tail;
    private int size;

    class MovieNode{
        String title;
        String director;
        int yearOfRelease;
        double rating;
        MovieNode next;
        MovieNode prev;

        public MovieNode(String title, String director, int yearOfRelease, double rating){
            this.title = title;
            this.director = director;
            this.yearOfRelease = yearOfRelease;
            this.rating = rating;
            this.prev = null;
            this.next = null;
        }
    }

    public void addMovieAtFirst(String title, String director, int yearOfRelease, double rating){
        MovieNode newMovie = new MovieNode(title, director, yearOfRelease, rating);
        if(head == null){
            head = newMovie;
            tail = newMovie;
        }
        else{
            newMovie.next = head;
            head.prev = newMovie;
            head = newMovie;
        }
        size++;
    }

    public void addMovieAtLast(String title, String director, int yearOfRelease, double rating){
        MovieNode newMovie = new MovieNode(title, director, yearOfRelease, rating);
        if(head == null){
            head = newMovie;
            tail = newMovie;
        }
        else{
            tail.next = newMovie;
            newMovie.prev = tail;
            tail = newMovie;
        }
        size++;
    }

    public void addMovieAtPosition(String title, String director, int yearOfRelease, double rating, int position){
        if(position == 0){
            addMovieAtFirst(title, director, yearOfRelease, rating);
        }
        else if(position == size){
            addMovieAtLast(title, director, yearOfRelease, rating);
        }
        else{
            MovieNode newMovie = new MovieNode(title, director, yearOfRelease, rating);
            MovieNode prevNode = getMovieNodeAtPosition(position - 1);
            MovieNode nextNode = prevNode.next;
            prevNode.next = newMovie;
            newMovie.prev = prevNode;
            newMovie.next = nextNode;
            nextNode.prev = newMovie;
            size++;
        }
    }

    public void deleteMovie(String title){
        MovieNode current = head;
        while(current != null){
            if(current.title.equals(title)){
                if(current == head){
                    head = head.next;
                    head.prev = null;
                }
                else if(current == tail){
                    tail = tail.prev;
                    tail.next = null;
                }
                else{
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                size--;
            }
            current = current.next;
        }
    }

    public MovieNode getMovieNodeAtPosition(int position){
        MovieNode current = head;
        int currentPosition = 0;
        while(current != null && currentPosition < position){
            current = current.next;
            currentPosition++;
        }
        return current;
    }

    public void updateMovieRating(String title, double rating){
        MovieNode current = head;
        while(current != null){
            if(current.title.equals(title)){
                current.rating = rating;
            }
            current = current.next;
        }
    }

    public void searchMovie(String director, double rating){
        MovieNode current = head;
        while(current != null){
            if(current.director.equals(director) || current.rating == rating){
                System.out.println("Movie Title: " + current.title);
                System.out.println("Movie Diractor: " + current.director);
                System.out.println("Movie Year of Release: " + current.yearOfRelease);
                System.out.println("Movie Rating: " + current.rating);
                System.out.println();
            }
            current = current.next;
        }
    }

    public void displayMovieDetailsInForward(){
        MovieNode current = head;
        while(current != null){
            System.out.println("Movie Title: " + current.title);
            System.out.println("Movie Diractor: " + current.director);
            System.out.println("Movie Year of Release: " + current.yearOfRelease);
            System.out.println("Movie Rating: " + current.rating);
            System.out.println();
            current = current.next;
        }
    }

    public void displayMovieDetailsInBackward(){
        MovieNode current = tail;
        while(current != null){
            System.out.println("Movie Title: " + current.title);
            System.out.println("Movie Diractor: " + current.director);
            System.out.println("Movie Year of Release: " + current.yearOfRelease);
            System.out.println("Movie Rating: " + current.rating);
            System.out.println();
            current = current.prev;
        }
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }
}

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie();
        
        movie.addMovieAtFirst("3 Idiots", "Rajkumar Hirani", 2009, 8.4);
        movie.addMovieAtLast("Sholay", "Ramesh Sippy", 1975, 8.2);
        movie.addMovieAtPosition("Dangal", "Nitesh Tiwari", 2016, 8.3, 1);

        System.out.println("Movies in forward direction:");
        movie.displayMovieDetailsInForward();

        System.out.println("Movies in backward direction:");
        movie.displayMovieDetailsInBackward();

        
        movie.updateMovieRating("3 Idiots", 8.6);

        
        System.out.println("Search results for director 'Rajkumar Hirani':");
        movie.searchMovie("Rajkumar Hirani", 0);

        
        System.out.println("Search results for rating 8.2:");
        movie.searchMovie("", 8.2);

        
        movie.deleteMovie("Sholay");

        System.out.println("Movies after deletion:");
        movie.displayMovieDetailsInForward();

        
        System.out.println("Is the movie list empty? " + movie.isEmpty());

        
        System.out.println("Size of the movie list: " + movie.size());
    }
}
