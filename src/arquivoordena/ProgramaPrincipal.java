package arquivoordena;

import java.io.IOException;
import java.util.Scanner;

public class ProgramaPrincipal {

    public static void main(String[] args) throws IOException {

        Arquivo arquivo = new Arquivo();
        Ordenacao ordenar = new Ordenacao();
        int[] arrayDesordenado = new int[65000];
        int[] arrayOrdenado = new int[65000];
        int contador=0;

//        arrayDesordenado = arquivo.lerArquivo("C:\\Users\\Ricardo\\Downloads\\ArquivoOrdena\\database2.txt");
        arrayDesordenado = arquivo.lerArquivo("C:\\Users\\Ricardo\\Downloads\\ArquivoOrdena\\databaseOrdenada.txt");
        if (arrayDesordenado[contador]<= arrayDesordenado[contador+1] && contador < 1000){
        arrayOrdenado = ordenar.insertionSort(arrayDesordenado);
        System.out.println("Utilizando Inserction");
        contador++;
        } else{
        arrayOrdenado = ordenar.quickSort(arrayDesordenado);
        System.out.println("Utilizando QuickSort");
        }
        arquivo.gravarArquivo("C:\\Users\\Ricardo\\Downloads\\ArquivoOrdena\\databaseOrdenada.txt", arrayOrdenado);
    }
}
