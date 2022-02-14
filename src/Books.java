public class Books {

    String title;
    String publisherName;
    int edition;

    public static void main(String[] args) {

        Books [] myBooks = new Books[5];
        int x = 0;
        myBooks[0].title = "Fairytale of Mountains";
        myBooks[1].title = "Love you to the moon";
        myBooks[2].title = "Till the mountains melt";
        myBooks[3].title = "Till the rivers run dry";
        myBooks[4].title = "Loving you beyond the sun";

        myBooks[0].publisherName = "John Cannon";
        myBooks[1].publisherName = "Jessica Mensha";
        myBooks[2].publisherName = "Otabil Mensah";
        myBooks[3].publisherName = "Oregun Metabil";
        myBooks[4].publisherName = "Evelyn Kindle";

        myBooks[0].edition = 3;
        myBooks[1].edition = 1;
        myBooks[2].edition = 2;
        myBooks[3].edition = 1;
        myBooks[4].edition = 3;

        while(x < 6){
            System.out.println(myBooks[x].title);
            System.out.println(" by ");
            System.out.println(myBooks[x].publisherName);
            System.out.println("And currently in " + myBooks[x].edition + " edition");

            x+=1;
        }
    }
}
