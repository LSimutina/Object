public class Sauce {
    String name;
    private Spice spice;

    public Sauce(String name, Spice spice) {
        this.name = name;
        this.spice = spice;
    }

    @Override
    public String toString() {
        return "Соус {" +
                "название: " + name +
                ", острота:" + spice +
                '}';
    }
}
