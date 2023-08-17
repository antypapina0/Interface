import interf.Zbior;

class ZbiorDlugosciSlow implements Zbior {
    private  String[] slowa = new String[10];
    private int index = 0;

    @Override
    public boolean nalezy(int item) {
        for (String slowo : slowa) {
            if (slowo != null && slowo.length() == item) return true;
        }
        return false;
    }

    @Override
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
    public int ile() {
        return index;
    }

    @Override
    public void wyswietl() {
        for (String s : slowa) {
            if (s != null) {
                System.out.print(s + ", ");
            }
        }
        System.out.println();
    }
}