public class Spice {
    String pow;

    public static final Spice VERYSHARP = new Spice("Очень острый");
    public static final Spice SHARP=new Spice("Острый");
    public static final Spice NOTSHARP=new Spice("Не острый");

    public Spice(String pow) {
        this.pow = pow;
    }

    @Override
    public String toString() {
        return pow;
    }
}
