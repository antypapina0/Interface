import interf.Zbior;

public class MojaTablica implements Zbior {
    private int[] mojeElementy;
    private int pozycja;

    //konstruktor
    public MojaTablica(int rozmiar){
        this.mojeElementy = new int[rozmiar];
        this.pozycja = 0;
    }

    //metoda do sprawdzenie czy item jest w tablicy
    @Override
    public boolean nalezy(int item) {
        for (int i = 0; i < pozycja; i++) {
            if (mojeElementy[i] == item) {
                return true;
            }
        }
        return false;
    }
    //dodaniea elementu do tablicy
    @Override
    public void dodaj(int item) {
        if (pozycja < mojeElementy.length && !nalezy(item)) {
            mojeElementy[pozycja] = item;
            pozycja++;
        }
    }
    //zwracanie ile jest elementow
    @Override
    public int ile() {
        System.out.println(pozycja);
        return pozycja;
    }
    //wyswietlanie wszystkich elementow
    @Override
    public void wyswietl() {
        for (int i = 0; i < pozycja; i++) {
            System.out.print(mojeElementy[i] + ", ");
        }
        System.out.println();
    }
}
