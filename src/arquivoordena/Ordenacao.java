package arquivoordena;

public class Ordenacao {

    public int[] insertionSort(int[] vetor) {
        long tempoinicial = System.currentTimeMillis();
        for (int i = 0; i < vetor.length; i++) {
            int atual = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] >= atual) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = atual;;
        }
        long tempofinal = System.currentTimeMillis();
        long tempototal = tempofinal - tempoinicial;
        System.out.println("Tempo de Processamento de InsertionSort: " + tempototal + "ms");
        return vetor;
    }
    
    public int[] quickSort(int[] array) {
        long tempoinicial = System.currentTimeMillis();
        array = QuickSort.quicksort(array, 0, (array.length - 1));
        long tempofinal = System.currentTimeMillis();
        long tempototal = tempofinal - tempoinicial;
        System.out.println("Tempo de Processamento de QuickSort: " + tempototal + "ms");
        return array;
    }
    
    public void imprimirVetor(int[] array) {
        for (int counter = 0; counter < (array.length - 1); counter++) {
            System.out.println(array[counter]);
        }
    }
}
