package comporator.com2;

public class Book {
    String title;
    String author;
    int pages;

    Book(String title,String author,int pages){
        this.title=title;
        this.author=author;
        this.pages=pages;
    }

    public String toString(){
        return title +"( "+author+" ) "+ pages+ " page";
    }
}
