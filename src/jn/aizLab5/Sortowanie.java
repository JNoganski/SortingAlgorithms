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
        // zwraca wynik por�wanania liczb a <= b lub a >= b
        // w zale�no�ci od parametru rosnaco
        if(rosnaco){
            if(a<=b){
                return true;
            }else {
                return false;
            }
        }else{
            if (b<=a) {
                return true;
            }else {
                return false;
            }
        }
    }
    @Override
    protected void selectionsort(boolean rosnaco) {
        for(int i=0;i<ile-1;i++){
            int min=i;
            for(int j = i+1; j<ile;j++ ){
                if(compare(tab[j],tab[min],rosnaco)){
                    min = j;
                }
            }
            int mmr = tab[min];
            tab[min] = tab[i];
            tab[i]=mmr;
        }
    }
    @Override
    protected void insertsort(boolean rosnaco) {
    for(int i=1;i<ile;i++){
        int wsk = tab[i];
        int j = i-1;
            while(j>=0 && compare(wsk,tab[j],rosnaco )){
                tab[j+1] = tab[j];
                j--;
            }
            tab[j+1] = wsk;
    }
    }
public class SzybkoSort{
    int rozdzielaj(int tablica[],int low, int high, boolean rosnaco ){
        int os = tablica[high];
        int i = low -1;
        for (int j=low;j<high;j++){
            if(rosnaco) {
                if (tablica[j] < os) {
                    i++;
                    int mmr = tablica[i];
                    tablica[i] = tablica[j];
                    tablica[j] = mmr;
                }
            }else {
                if (tablica[j] >= os) {
                    i++;
                    int mmr = tablica[i];
                    tablica[i] = tablica[j];
                    tablica[j] = mmr;
                }
            }
        }
        int mmr = tablica[i+1];
        tablica[i+1] = tablica[high];
        tablica[high] = mmr;

        return  i+1;
    }
    void szybki_sort(int tablica[], int low, int high, boolean rosnaco){
     if(low<high){
         int os = rozdzielaj(tablica,low,high,rosnaco);

         szybki_sort(tablica,low,os-1,rosnaco);
         szybki_sort(tablica,os+1,high,rosnaco);
        }
    }
}
    @Override
    protected void quicksort(boolean rosnaco) {
        SzybkoSort obiekt = new SzybkoSort();
        obiekt.szybki_sort(tab, 0, ile - 1,rosnaco);
    }
    @Override
    protected void countsort(boolean rosnaco) {

    }

    @Override
    public void sortuj(boolean rosnaco, SortMethod metoda){

    }
}
