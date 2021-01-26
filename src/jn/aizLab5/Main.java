package jn.aizLab5;

public class Main {

    public static void main(String[] args) {
    Sortowanie mojeSortowanie = new Sortowanie();

    mojeSortowanie.wypelnij(10,100);
    mojeSortowanie.wypisz();

        // mojeSortowanie.selectionsort(false);
        // mojeSortowanie.insertsort(false);
        //mojeSortowanie.quicksort(true);
        mojeSortowanie.countsort(false);

        System.out.println("Poniżej posortowane:");
    mojeSortowanie.wypisz();
    }
}
