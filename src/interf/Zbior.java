package interf;

//interface to tak jakby jakas umowa, ktora zawiera metody ktore musz byc uzyte (zaimplementowane) w innej klasie. Te metody nizej nie maja zadnej implemntacji, one po prostu mowia co trzeba zrobic

public interface Zbior{

    //jest to metoda co zwraca boolean (true lub false) i ma nazwe nalezy, i posiada argumenty typu int o nazwie item, cyzli aby ja wywolac te metode potem
    //trzeba dac w argumencie jakis int np. System.out.println("Czy w zbiorze jest słowo o długości 3? " + zbiorDlugosci.nalezy(3)); w nawiasie masz int.
    boolean nalezy(int item);
    //void nic nie zwraca, ale dajemy int,c czyli liczba
    void dodaj(int item);
    //metoda ile zwraca jakas liczbe
    int ile();
    void wyswietl();

}