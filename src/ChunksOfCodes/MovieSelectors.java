package ChunksOfCodes;

public class MovieSelectors {
    String movieTitle;
    String movieGenre;
    int movieYear;
    String movieProducer;
    int movieRating;

    void playIt() {
        System.out.println("Playing the movie");
    }


        public static void main(String[] args) {
            MovieSelectors one = new MovieSelectors();

            one.movieTitle = "Gone with the Stock";
            one.movieGenre = "Epic";
            one.movieRating = 2;

            MovieSelectors two = new MovieSelectors();
            two.movieTitle = "Lost in Cubicle Space";
            two.movieGenre = "Comedy";
            two.movieRating = 5;
            two.playIt();

            MovieSelectors three = new MovieSelectors();
            three.movieProducer = "Disneyland";
            three.playIt();
            three.movieRating = 6;
            three.movieYear = 2022;
        }
    }



