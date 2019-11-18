import java.util.List;

public class Paev {
    public String kuupaev;
    public List<Tund> tundideNimekiri;

    @Override
    public String toString() {
        return "kuupaev='" + kuupaev + "\ntundideNimekiri: " + tundideNimekiri
                ;
    }
}
