package jn.aizLab5;

public class Main {

    public static void main(String[] args) {
    Sortowanie mojeSortowanie = new Sortowanie();

    mojeSortowanie.wypelnij(10,100);
    mojeSortowanie.wypisz();

   // mojeSortowanie.selectionsort(false);
        mojeSortowanie.insertsort(true);
        System.out.println("Poniżej posortowane malejąco");
    mojeSortowanie.wypisz();
    }
}
