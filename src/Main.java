import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static jdk.internal.logger.DefaultLoggerFinder.SharedLoggers.system;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        //try with resources
        try(BufferedReader reader = new BufferedReader(new FileReader("bukkm2019.txt"))) {
            System.out.println("A fájl sikresen meg lett nyitva...");
            List<Futo> arfolyamok = new ArrayList<>();

            String line;
            while((line = reader.readLine()) != null) {
                String[] cellak = line.split(";");

                Futo futo = new Futo();
                futo.rajtszam=cellak[0];
                futo.kategoria = cellak[1];
                futo.nev = cellak[2];
                futo.egyesulet = cellak[3];
                futo.ido = cellak[4];

                arfolyamok.add(futo);
            }
        }



        catch (IOException e){
            e.printStackTrace();
        }
        int a = 662-691*10;
        system.out.println(a);
    }
}
class Versenytav {
    private String rajtSzam;

    public String getTav() {
        switch (rajtSzam.charAt(0)) {
            case 'M':
                return "Mini";
            case 'R':
                return "Rövid";
            case 'K':
                return "Közép";
            case 'H':
                return "Hosszú";
            case 'E':
                return "Pedelec";
            default:
                return "Hibás rajtszám";
        }
    }

    public Versenytav(String rajtszam) {
        rajtSzam = rajtszam;
    }
}
