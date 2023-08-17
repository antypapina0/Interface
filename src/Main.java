import interf.Zbior;

public class Main {
    public static void main(String[] args) {
        MojaTablica tablica = new MojaTablica(5);
        tablica.dodaj(10);
        tablica.dodaj(20);
        tablica.dodaj(30);
        tablica.ile();
        tablica.wyswietl();
        System.out.println(tablica.nalezy(15));
        System.out.println(tablica.ile());
    }
}