public abstract class Honker {
    private String color;

    public Honker(String color) {
        this.color = color;
    }

    public abstract void honk();

    public String getColor(){
        return this.color;
    }
}
