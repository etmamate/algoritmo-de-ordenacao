public class App {
    public static void main(String[] args) throws Exception {
        int[] vetor = new int[10];

        System.out.println("Vetor Desordenado: ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
            System.out.print(vetor[i]);
        }
        System.out.println("");

        insertionSort(vetor);
        
        System.out.println("");
        System.out.println("Vetor Ordenado:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]);
        }


        
    }

    public static void bubbleSort(int[] vetor){

        double inicio = System.currentTimeMillis();
        
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
        double fim = System.currentTimeMillis();

        System.out.println("\nTempo de ordenação:" + (fim - inicio));
    }

    public static void insertionSort(int[] vetor){
        int aux, j;
        for(int i = 1; i < vetor.length;i++){
            aux = vetor[i];
            j = i-1;
            while (j >= 0 && vetor[j] > aux) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j+1] = aux;
        }
    }
}
