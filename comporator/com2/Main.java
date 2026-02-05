package comporator.com2;

import java.util.*;

public class Main {
    public static void main(String[] args){
        List<Book> library = new ArrayList<>();
        library.add(new Book("roman","Medina",123));
        library.add(new Book("art","Sandu",432));
        library.add(new Book("car","Akmaral",567));

        Collections.sort(library,(b1,b2)->b1.pages - b2.pages);
        System.out.println("сортировка по странце "+ library);

        Collections.sort(library,(b1,b2)->b1.author.compareTo(b2.author));
        System.out.println("Сортировка по имени автора "+library);

        Collections.sort(library,(b1,b2)->b2.title.compareTo(b1.title));
        System.out.println("Сортировка по имени автора наобарот "+library);

    }
}
