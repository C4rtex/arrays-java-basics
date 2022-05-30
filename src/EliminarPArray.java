import java.util.Scanner;

public class EliminarPArray {

	public static void main(String[] args) {
		int[] numeros= new int[] {1,2,3,4,5};
		Scanner s=new Scanner(System.in);
		for(int i=0;i<numeros.length;i++) {
			System.out.println(numeros[i]);
		}
		System.out.println("Posicion a eliminar");
		int p = s.nextInt()-1;
		
		for(int i=p;i<numeros.length-1;i++) {
			numeros[i]=numeros[i+1];
		}
		
		for(int i=0;i<numeros.length-1;i++) {
			System.out.println(numeros[i]);
		}

	}

}
