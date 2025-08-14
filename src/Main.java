import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int opcao;

        String breakline = "=".repeat(30);

        String menu = """
                [1] - Bubble Sort
                [2] - Insertion Sort
                [3] - Selection Sort
                [4] - Merge Sort - Ainda não implementado
                [5] - Quick Sort - Ainda não implementado
                [6] - Heap Sort - Ainda não implementado
                [0] - Sair
                => """;

        do {
            System.out.println(breakline);
            System.out.print("Vetor Desordenado: ");
            // System.out.println(breakline);
            int[] vetor = new int[10];

            for (int i = 0; i < vetor.length; i++) {
                vetor[i] = (int) (Math.random() * vetor.length);
                System.out.print(vetor[i]);
            }
            System.out.println(" ");

            System.out.println(breakline);
            System.out.print(menu);

            opcao = scn.nextInt();

            switch (opcao) {

                case 1:
                    bubbleSort(vetor);
                case 2:
                    insertionSort(vetor);
                case 3:
                    selectionSort(vetor);

            }

        } while (opcao != 0);

    }

    public static void bubbleSort(int[] vetor) {

        long inicio = System.currentTimeMillis();

        // bubble sort
        int aux;
        for (int i = 0; i < vetor.length; i++) {
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[i] > vetor[j]) {
                    aux = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = aux;
                }
            }
        }
        long fim = System.currentTimeMillis();

        System.out.println("\nTempo de ordenação:" + (fim - inicio));
    }

    public static void insertionSort(int[] vetor) {
        int aux, j;
        for (int i = 1; i < vetor.length; i++) {
            aux = vetor[i];
            j = i - 1;
            while (j >= 0 && vetor[j] > aux) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = aux;
        }
    }

    public static void selectionSort(int[] vetor) {
        int menor_posicao;
        int aux;
        for (int i = 0; i < vetor.length; i++) {
            menor_posicao = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[menor_posicao]) {
                    menor_posicao = j;
                }
            }
            aux = vetor[menor_posicao];
            vetor[menor_posicao] = vetor[i];
            vetor[i] = aux;
        }
    }
}
