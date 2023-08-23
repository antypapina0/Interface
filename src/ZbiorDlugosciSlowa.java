import interf.Zbior;

class ZbiorDlugosciSlow implements Zbior {
    // tablica string o dlugosci 10 znakow
    private  String[] slowa = new String[10];
    //int indext o dlugosci 0
    private int index = 0;

    @Override
    //sprawdza czy istnieje slowo o dlugosci item w tablicy, jezeli istnieje zwraca true
    // for (String slowo : slowa) petla for-each, przechodzi przez wszystkie indeksy,
    public boolean nalezy(int item) {
        for (String slowo : slowa) {
            if (slowo != null && slowo.length() == item) return true;
        }
        return false;
    }

    @Override

    // dodaje slowo jezeli gdy jest jeszcze miejsce w tablicy czyli do 10 znakow, nowe slowo sklada sie z dlugosci litera a
    public void dodaj(int item) {
        if (index < 10 && !nalezy(item)) {
            StringBuilder sb = new StringBuilder(item);
            for (int i = 0; i < item; i++) {
                sb.append("a");
            }
            slowa[index++] = sb.toString();
        }
    }

    @Override
    //zwraca ile jest index dlugosc slowa
    public int ile() {
        return index;
    }

    @Override
    //wyswietlanie dla slowa jezeli nie jest null to wyswietla a
    public void wyswietl() {
        for (String s : slowa) {
            if (s != null) {
                System.out.print(s + ", ");
            }
        }
        System.out.println();
    }
}