public class Manga {
    String mangaName;
    String company;
    double price;
    public Manga(String mangaName, String company, double price) {
        this.mangaName = mangaName;
        this.company = company;
        this.price = price;
    }
    public static void main(String[] args) {
        Manga book1 = new Manga("One Piece", "Shonen Jump", 14.99);
        Manga book2 = new Manga("Naruto", "Shonen Jump", 10.79);

        SLList mangaList = new SLList();

        mangaList.listAdd(book1);
        mangaList.listAdd(book1);
        mangaList.listAdd(book2);
        mangaList.listAdd(book1);


        System.out.println(mangaList.toString());

        // Removing a book from the AList
        mangaList.listRemove(1);

        // Displaying the updated AList

        System.out.println(mangaList.toString());
    }
}
