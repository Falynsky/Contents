import java.util.ArrayList;

class Composite implements Component {

    private ArrayList<Component> chapters = new ArrayList();
    private String title;

    Composite(String title) {
        this.title = title;
    }

    void addChapter(Component j) {
        chapters.add(j);
    }

    private void compositePrint(String text){
        System.out.println(text+". "+title);
        int number = 1;
        text = "\t"+text;
        for (Component j : chapters) {
            if(j instanceof Leaf){
                System.out.print(text+"."+number+". ");
                j.print();
                number++;
            }
            if(j instanceof Composite){
                ((Composite)j).compositePrint(text+"."+number);
                number++;
            }
        }
    }

    @Override
    public void print() {
        System.out.println(title);
        int nr = 1;

        for (Component j : chapters) {
            if(j instanceof Leaf){
                System.out.print(nr+". ");
                j.print();
                nr++;
            }
            if(j instanceof Composite){
                String text = String.valueOf(nr);
                ((Composite)j).compositePrint(text);
                nr++;
            }
        }
    }
}
