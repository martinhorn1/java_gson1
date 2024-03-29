import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.*;

public class Katsed {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

        int mondayDay = c.get(Calendar.DAY_OF_MONTH);
        int mondayMonth = c.get(Calendar.MONTH)+1;
        int mondayYear = c.get(Calendar.YEAR);

        Tund esimeneTund = new Tund();
        esimeneTund.tund = "2";
        esimeneTund.algus = "8.30";
        esimeneTund.lopp = "10.00";
        esimeneTund.aine = "Mobiilirakenduse kasutajaliidese loomine";
        esimeneTund.grupp = "VS18";
        esimeneTund.opetaja = "Ly Otsa";
        esimeneTund.ruum = "Kopli 1A - A418 (arvutiklass)";

        Tund teineTund = new Tund();
        teineTund.tund = "3";
        teineTund.algus = "10.15";
        teineTund.lopp = "11.45";
        teineTund.aine = "Mobiilirakenduse kasutajaliidese loomine";
        teineTund.grupp = "VS18";
        teineTund.opetaja = "Ly Otsa";
        teineTund.ruum = "Kopli 1A - A418 (arvutiklass)";

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

        Tund viiesTund = new Tund();
        viiesTund.tund = "6";
        viiesTund.algus = "15.45";
        viiesTund.lopp = "17.15";
        viiesTund.aine = "Java programmeerimine";
        viiesTund.grupp = "VS18";
        viiesTund.opetaja = "Anna Karutina";
        viiesTund.ruum = "Kopli 1A - A411 (arvutiklass)";

//        System.out.println(kolmasTund);
//        System.out.println(neljasTund);


        ArrayList<Tund> tunnid = new ArrayList<Tund>();
        tunnid.add(esimeneTund);
        tunnid.add(teineTund);
        tunnid.add(kolmasTund);
        tunnid.add(neljasTund);
        tunnid.add(viiesTund);

        Tunniplaan vs18 = new Tunniplaan();
//        vs18.nadal = "2019-11-18";
//        vs18.tunnid = new HashMap<String, List<Tund>>();
//        vs18.tunnid.put("2019-11-18", tunnid);

//        System.out.println(vs18);

        Gson g = new Gson();
        String vs18JSON = g.toJson(vs18);

//        System.out.println(vs18JSON);


        try {
            URL url = new URL("https://tkhk.siseveeb.ee/veebilehe_andmed/tunniplaan/tunniplaan?nadal=" + mondayDay + "." + mondayMonth + "." + mondayYear + "&grupp=1282");
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
            String str = "";
            String result = "";
            while (null != (str = br.readLine())) {
                result += str;
            }
            System.out.println(result);
            Gson tunniplaaniJSON = new Gson();
            vs18 = tunniplaaniJSON.fromJson(result, Tunniplaan.class);

            for (Map.Entry<String, List<Tund>> element : vs18.tunnid.entrySet()) {
                System.out.println(element.getKey());
                for (Tund tund : element.getValue()) {
                    System.out.println(tund);
                    System.out.println("-----------------");
                }
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
