public class Movie {
    private String title;
    private  String director;
    private int duration, releaseYear;
    private double rating;

    // movie constructor
    public Movie(String title, String director, int duration, int releaseYear, double rating){
        this.title = title ;
        this.director = director;
        this.duration = duration;
        this.releaseYear = releaseYear;
        this.rating = rating;
    }
// set and get methods
    public String getTile(){
        return title;
    }
    public void setTitle(String title){this.title = title;}

    public String getDirector(){
        return director;
    }
    public void setDirector(String director){this.director = director;}

    public int getDuration(){
        return duration;
    }
    public void setDuration(int duration){this.duration = duration;}

    public int getReleaseYear(){return releaseYear;}
    public void setReleaseYear(int releaseYear){this.releaseYear = releaseYear;}

    public double getRating(){return rating;}
    public void setRating(double rating){this.rating = rating;}

    // check ing methods
    public boolean isLongMovie() {
        if ( duration > 120 ) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isHighlyRated() {
        if (rating > 4.0) {
            return true;
        } else {
            return false;
        }
    }

    public static class Main{
        public static void main (String[] movies){

            // creating and setting object class objects
            Movie movie1 = new Movie("Spider-Man","Stan Lee",95,2014,8.5);
            Movie movie2 = new Movie("Bones and All","Stan Lee",110,2019,3.9);
            Movie movie3 = new Movie("Titanic","James Cameron",145,1997,7.9);


            // setting movie details
            //Movie 1
            movie1.setTitle("Spider-Man");
            movie1.setDirector("Stan Lee");
            movie1.setDuration(95);
            movie1.setReleaseYear(2014);
            movie1.setRating(8.5);

            //Movie 2
            movie1.setTitle("Bones and All");
            movie1.setDirector("Stan Lee");
            movie1.setDuration(110);
            movie1.setReleaseYear(2019);
            movie1.setRating(3.9);

            //Movie 3
            movie1.setTitle("Titanic");
            movie1.setDirector("James Cameron");
            movie1.setDuration(145);
            movie1.setReleaseYear(1997);
            movie1.setRating(7.9);

            //displaying movie details

            //Movie 1
            System.out.println("Movie 1"+"\n"+
                    "Title: "+movie1.getTile() +"\n" +
                    "Director: "+movie1.getDirector() +"\n" +
                    "Duration: "+movie1.getDuration()+" mins, Long: "+ movie1.isLongMovie()+"\n" +
                    "Year Released: "+movie1.getReleaseYear() +"\n" +
                    "Rating: "+movie1.getRating() + ", Highly rated: " +movie1.isHighlyRated()+"\n"
            );
            //Movie 2
            System.out.println("Movie 2"+"\n"+
                    "Title: "+movie2.getTile() +"\n" +
                    "Director: "+movie2.getDirector() +"\n" +
                    "Duration: "+movie2.getDuration()+" mins, Long: "+ movie2.isLongMovie()+"\n" +
                    "Year Released: "+movie2.getReleaseYear() +"\n" +
                    "Rating: "+movie2.getRating() +", Highly rated: " + movie2.isHighlyRated()+"\n"
            );
            //Movie 3
            System.out.println("Movie 3"+"\n"+
                    "Title: "+movie3.getTile() +"\n" +
                    "Director: "+movie3.getDirector() +"\n" +
                    "Duration: "+movie3.getDuration()+" mins, Long: "+ movie3.isLongMovie()+"\n" +
                    "Year Released: "+movie3.getReleaseYear() +"\n" +
                    "Rating: "+movie3.getRating() +", Highly rated: " + movie3.isHighlyRated()+"\n"
            );
        }
    }
}
