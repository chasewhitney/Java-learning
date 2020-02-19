public class Goose extends Honker{

    public Goose(String color) {
        super(color);
    }

    @Override
    public void honk() {
        System.out.println("Honk!");
    }

}
