
public class BusquedaBinaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros= new int[] {1,2,3,4,5,6,7};
		
		int ini=0;
		int fin=numeros.length-1;
		int mitad=(ini+fin)/2;
		int buscado=5;
		
		while(ini<fin && numeros[mitad]!=buscado) {
			if(numeros[mitad]<buscado) {
				ini=mitad+1;
			}else {
				fin=mitad-1;
			}	
			mitad=(ini+fin)/2;
		}
		
		if(numeros[mitad]==buscado) {
			System.out.println("SE ENCONTRO EN LA POSICIÓN "+mitad);
		}else {
			System.out.println("NO SE ENCONTRO");
		}
		
	}

}
