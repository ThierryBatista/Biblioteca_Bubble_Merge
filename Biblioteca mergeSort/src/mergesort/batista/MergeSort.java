package mergesort.batista;

public class MergeSort 
{
 public MergeSort()
 {
  super(); 
 }
 
 public int[] Merge(int[] vet, int inicio, int fim)
 {
	if (inicio < fim)
	{
	int meio = (fim + inicio)/ 2;
	Merge(vet, inicio, meio);
	Merge(vet, meio + 1, fim);
	Intercala(vet, inicio, meio, fim);
	}
  return vet;
 }

 
 private void Intercala(int []vet, int inicio, int meio, int fim)
 {
 int[] novovet = new int[vet.length];
 for (int i = inicio; i <= fim; i++)
  {
	 novovet[i] = vet[i];
  }
    int esquerda = inicio;
    int direita = meio + 1;
    
    for (int cta = inicio; cta <= fim; cta++)
    {
      if (esquerda > meio)
      {
       vet[cta] = novovet[direita];
       direita++;
      }  
      else if (direita > fim)
      {
       vet[cta] = novovet[esquerda];
       esquerda++;  
      }
      else if (novovet[esquerda] < novovet[direita]) 
      {
       vet[cta] = novovet[esquerda];
       esquerda++;
      } 
      else
      {
       vet[cta] = novovet[direita];
       direita++;  
      }  
    }
 }

}
