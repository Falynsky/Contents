/*Książka
        1. Rozdział pierwszy
        2. Rozdział drugi
            2.1 Pierwszy podrozdział
                2.1.1 Kolejny podrozdział
                2.1.2 Jeszcze jeden podrozdział
            2.2 Drugi podrozdział
        3. Zakończenie
 */

public class Main {

    public static void main(String[] args) {

        Composite book = new Composite("Contents in Java");
        book.addChapter(new Leaf("Chapter as Leaf"));
        Composite one = new Composite("First");
        Composite two = new Composite("Second");
        Composite last = new Composite("Last");

        book.addChapter(one);
        book.addChapter(two);

        Composite subOne = new Composite("FirstSubChapter");

        two.addChapter(subOne);

        subOne.addChapter(new Leaf("FirstSubSubChapter"));
        subOne.addChapter(new Leaf("SecondSubSubChapter"));

        two.addChapter(new Leaf("SecondSubChapter"));

        book.addChapter(last);

        book.print();
    }
}