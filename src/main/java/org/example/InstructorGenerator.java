package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class InstructorGenerator {

    private static final List<String> cengLecturers = Arrays.asList("Fadi YILMAZ","Fatih Vehbi CELEBI", "Remzi YILDIRIM", "Mustafa YENIAD", "Shafqat ur REHMAN", "Osman Serdar GEDIK","Yusuf Evren AYKAC","Fatih NAR");
    private static final List<String> eeeLecturers= Arrays.asList("Ahmet KARAASLAN", "Asaf Behzat SAHIN", "Serafettin EREL", "Huseyin CANBOLAT", "Ilyas CANKAYA","Serdar OZYURT","Sinan KIVRAK","Thamar Al MASHHDDANI");
    private static final List<String> ieLecturers = Arrays.asList("Mete GUNDOGAN", "Ergun ERASLAN", "Babek ERDEBELLI", "Ibrahim YILMAZ", "Alper SEKER","Gercek BUDAK","Abdullah YILDIZBASI","Emine Nur ACAR");
    private static final List<String> meLecturers = Arrays.asList("Mehmet SUNAR", "Ahmet PINARBASI", "Sadettin ORHAN", "Adem CICEK", "Unal CAMDALI","Erol ARCAKLIOGLU","Veli CELIK","Hasan OZCAN","Yasin SARIKAVAK","Mete BAKIR");
    private static final List<String> ceLecturers = Arrays.asList("Lutfullah TURANLI", "Taha TASKIRAN", "Mehmet BARAN", "Mahmut Cem YILMAZ", "Salah Haj ISMAIL","Abdullah DILSIZ","Arzu OZKAYA","Can BIYIK","Hasanburak YUCEL");
    private static final List<String> eseLecturers = Arrays.asList("Abdullah YILDIZ", "Bülent YESILATA", "Fahrettin GOKTAS", "Metin AKTAS", "Mukerrem SAHIN","Nuray CELEBI","Aycan ATLI","Mehmet Zahid EREL","Gülbahar BILGIC");
    private static Random rand = new Random();

    public static String getRandomCengLecturer() {
        int index = rand.nextInt(cengLecturers.size());
        return cengLecturers.get(index);
    }
    public static String getRandomEeeLecturer() {
        int index = rand.nextInt(eeeLecturers.size());
        return eeeLecturers.get(index);
    }
    public static String getRandomIeLecturer() {
        int index = rand.nextInt(ieLecturers.size());
        return ieLecturers.get(index);
    }
    public static String getRandomMeLecturer() {
        int index = rand.nextInt(meLecturers.size());
        return meLecturers.get(index);
    }
    public static String getRandomCeLecturer() {
        int index = rand.nextInt(ceLecturers.size());
        return ceLecturers.get(index);
    }
    public static String getRandomEseLecturer() {
        int index = rand.nextInt(eseLecturers.size());
        return eseLecturers.get(index);
    }

    public static List<String> getCengLecturers() {
        return cengLecturers;
    }

    public static List<String> getEeeLecturers() {
        return eeeLecturers;
    }
    public static List<String> getIeLecturers() {
        return ieLecturers;
    }

    public static List<String> getMeLecturers() {
        return meLecturers;
    }
    public static List<String> getCeLecturers() {
        return ceLecturers;
    }public static List<String> getEseLecturers() {
        return eseLecturers;
    }

}
