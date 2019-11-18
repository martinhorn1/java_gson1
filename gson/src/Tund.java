public class Tund {
    public String tund;
    public String algus;
    public String lopp;
    public String aine;
    public String grupp;
    public String opetaja;
    public String ruum;

    @Override
    public String toString() {
        return "Tund: " + tund +
                "\nalgus: " + algus +
                "\nlopp: " + lopp +
                "\naine: " + aine +
                "\ngrupp: " + grupp +
                "\nopetaja: " + opetaja +
                "\nruum: " + ruum
                ;
    }
}