
public class Main {
    public static void main(String[] args) {
        System.out.println("MojaTablica: ");
        MojaTablica tablica = new MojaTablica(5);
        tablica.dodaj(10);
        tablica.dodaj(20);
        tablica.dodaj(30);
        tablica.dodaj(33);
        System.out.print("Elementy tablicy: ");
        tablica.wyswietl();
        System.out.println("Ilosc elementow tablicy: " + tablica.ile());
        System.out.println(tablica.nalezy(15));

        System.out.println();
        System.out.println("StrinParzystosci: ");
        ZbiorDlugosciSlow zbiorDlugosci = new ZbiorDlugosciSlow();

        zbiorDlugosci.dodaj(3);
        zbiorDlugosci.dodaj(5);

        System.out.println("ZbiórDługościSłów zawiera:");
        zbiorDlugosci.wyswietl();
        zbiorDlugosci.ile();

        System.out.println("Czy w zbiorze jest słowo o długości 3? " + zbiorDlugosci.nalezy(3));
        System.out.println("Czy w zbiorze jest słowo o długości 4? " + zbiorDlugosci.nalezy(4));

    }
}