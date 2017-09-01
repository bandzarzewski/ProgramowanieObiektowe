package UbraniaPoryRokuWzorzecFasada;

public class Main {
    public static void main(String[] args) {


        Sandaly sandaly = new Sandaly();
        Skarpetki skarpetki = new Skarpetki();

        FasadaLetniegoUbioru flu = new FasadaLetniegoUbioru(sandaly, skarpetki);
        StrategiaUbioru su = new StrategiaUbioru(flu); // tu podajmy jedna z fasad
        su.rozbierzSie();
        System.out.println();
        su.ubieramySie();
//        FasadaZimowegoUbioru fzu =new FasadaZimowegoUbioru(sandaly,skarpetki);
//        su.setPoryRoku(fzu);

    }
}
