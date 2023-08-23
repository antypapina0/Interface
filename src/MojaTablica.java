import interf.Zbior;
// implements zbior to zaimplementowanie metod z tamtego interfacu, wszystkie musza byc tutaj zawarte jak uzywamy implements
//MojaTablica to nazwa klasy

public class MojaTablica implements Zbior {
    //prywatna zmienna int o nazwie mojeElementy, jest tablica poniewaz ma [], cyzli moze miec wiele liczb uzytywych
    private int[] mojeElementy;
    //to jest zmienna typu int o nazwie pozycja
    private int pozycja;

    //konstruktor
    public MojaTablica(int rozmiar){
        this.mojeElementy = new int[rozmiar];
        this.pozycja = 0;
    }

    //metoda do sprawdzenie czy item jest w tablicy
    @Override
    public boolean nalezy(int item) {
        //
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
