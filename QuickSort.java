package estructurass;

	import java.util.Arrays;
	import java.util.Random;

	public class QuickSort {
		
		public void quicksort(int[]a) {
			quicksort(a, 0 , a.length-1);
		}

		private void quicksort(int [] a, int menor, int mayor) {
			if(menor<mayor+1) {
				int pivote = particion(a, menor , mayor);
				quicksort(a,menor,pivote-1);
				quicksort(a,pivote+1,mayor);
			}
		}
		private void mezcla (int[] a, int indice1,int indice2) {
			int temp = a[indice1];
			a[indice1] = a[indice2];
			a[indice2] = temp;
		}
		private int recibirPivote(int menor, int mayor) {
			Random rnd = new Random();
			return rnd.nextInt((mayor-menor)+1)+menor;
		}
		private int particion(int[] a,int menor,int mayor) {
			mezcla(a,menor,recibirPivote(menor,mayor));
			int borde = menor+1;
			for (int i = borde; i <= mayor; i++) {
				if(a[i]<a[menor]) {
					mezcla(a,i,borde++);
				}
			}
			mezcla(a,menor,borde-1);
			return borde-1;
		}
		
		public static void main(String[] args) {
			QuickSort qs = new QuickSort();
			int [] a = new int[100];
			Random rnd = new Random();

			for (int i = 0; i < a.length; i++) {
				a[i]=rnd.nextInt(500);
			}
			for (int i = 0; i < 30; i++) {
				long tiempoDeinicio= System.nanoTime();
				
				
				qs.quicksort(a);
				

				long tiempoFinal=System.nanoTime();

				double fin =  ((tiempoFinal-tiempoDeinicio)*Math.pow(10, -9));

				System.out.println(fin);
				
			}

			/*System.out.println(Arrays.toString(a));
			qs.quicksort(a);
			System.out.println(Arrays.toString(a));*/
			
		}


	}


