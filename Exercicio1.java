public class App {
    public static void main(String[] args) throws Exception {
          // Cria um vetor com 10 números inteiros
          int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
          int soma = 0;
          // Calcula a soma dos elementos do vetor
          for (int i = 0; i < vetor.length; i++) {
              soma += vetor[i];
          }
          
          // Imprime a soma
          System.out.println("A soma dos elementos do vetor é: " + soma);
      }
  }
