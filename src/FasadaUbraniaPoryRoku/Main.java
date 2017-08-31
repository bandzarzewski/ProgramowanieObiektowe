package FasadaUbraniaPoryRoku;

/**
 * Created by RENT on 2017-08-31.
 */
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
