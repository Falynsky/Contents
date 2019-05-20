public class Leaf implements Component {

    private String chapterTitle;

    Leaf(String chapterTitle){
        this.chapterTitle = chapterTitle;
    }

    @Override
    public void print() {
        System.out.println(chapterTitle);
    }
}
