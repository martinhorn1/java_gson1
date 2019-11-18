public class Katsed {
    public static void main(String[] args) {
        Tund kolmasTund = new Tund();
        kolmasTund.tund = "4";
        kolmasTund.algus = "11.55";
        kolmasTund.lopp = "14.00";
        kolmasTund.aine = "Java programmeerimine";
        kolmasTund.grupp = "VS18";
        kolmasTund.opetaja = "Anna Karutina";
        kolmasTund.ruum = "Kopli 1A - A411 (arvutiklass)";

        Tund neljasTund = new Tund();
        neljasTund.tund = "5";
        neljasTund.algus = "14.10";
        neljasTund.lopp = "15.40";
        neljasTund.aine = "Java programmeerimine";
        neljasTund.grupp = "VS18";
        neljasTund.opetaja = "Anna Karutina";
        neljasTund.ruum = "Kopli 1A - A411 (arvutiklass)";

        System.out.println(kolmasTund);
        System.out.println(neljasTund);
    }
}
