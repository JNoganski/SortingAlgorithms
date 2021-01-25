package jn.aizLab5;

public class Main {

    public static void main(String[] args) {
    Sortowanie mojeSortowanie = new Sortowanie();

    mojeSortowanie.wypelnij(10,100);
    mojeSortowanie.wypisz();

    mojeSortowanie.selectionsort(false);
        System.out.println("Poniżej posortowane ziooooom");
    mojeSortowanie.wypisz();
    }
}
