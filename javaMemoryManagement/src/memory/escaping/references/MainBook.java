package memory.escaping.references;

public class MainBook {
    public static void main(String[] args) {

        BookCollection bc = new BookCollection();
//        bc.printAllBooks();
        //get price of book called Tom Jones in EUR
        System.out.println(bc.findBookByName("Tom Jones").getPrice().convert("EUR"));
        System.out.println(bc.findBookByName("Tom Jones").getPrice().convert("EUR"));
        System.out.println(bc.findBookByName("Tom Jones").getPrice().convert("EUR"));

        // Without fixing the convert method all three above sentences print different price.



//        bc.printAllBooks();
    }
}
