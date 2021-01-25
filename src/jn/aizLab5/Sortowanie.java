package jn.aizLab5;

import java.util.Random;

public class Sortowanie extends SortZ {

    @Override
    public int losuj(int w_max) {
        Random random = new Random();
        return random.nextInt(w_max - 0) + 0;
    }

    @Override
    public void wypelnij(int n, int wartosc_maksymalna) {
        ile =n;
    tab = new int[ile];
    for(int i=0;i<n;i++){
        tab[i] = losuj(wartosc_maksymalna);
    }
    }

    @Override
    public void wypisz() {

        for(int i=0;i<ile;i++){
            System.out.println(tab[i]);
        }
    }

    @Override
    public boolean compare(int a, int b, boolean rosnaco) {
        return false;
    }

    @Override
    protected void selectionsort(boolean rosnaco) {

    }

    @Override
    protected void insertsort(boolean rosnaco) {

    }

    @Override
    protected void quicksort(boolean rosnaco) {

    }

    @Override
    protected void countsort(boolean rosnaco) {

    }

    @Override
    public void sortuj(boolean rosnaco, SortMethod metoda){

    }
}
