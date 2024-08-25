package bubblesort.batista;

public class BubbleSort
{
 public BubbleSort()
 {
 super();
 }
 
 public int[] Bubbles(int[]vet)
 {
 int tamanho = vet.length;
 int i = 0;
 

  for (i = 0; i < tamanho - 1; i++)
  {
   for (int j = (i + 1); j < tamanho; j++)
   {
    if (vet[i] > vet[j])
    {
     int aux = vet[i];
     vet[i] = vet[j];
     vet[j] = aux;
    }
   }
  }
 return vet;
 }
}
