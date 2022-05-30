public class EjercicioStringArray {

	public static void main(String[] args) {
		System.out.println(cambiarPalabra("lolera",5,6));
	}
	
	
	//ENTRADA PATO-2
	//TPAO
	//ENTRADA PATO-3
	//PTAO
	static String cambiarPalabra(String palabra,int ind,int desp) {
		String[] letras = palabra.split("");
		int sp=0;
		int cont=0;
		String result="";
		boolean sale=false;
		for(int i=0;i<=desp;i++) {
			if(sale) {
				break;
			}
			if(ind>=i || sp>=i) {
				if(sp>ind) {
					for(int x=sp;x>=i;x--) {
						if(ind>letras.length) {
							ind=letras.length-1;
							sp=ind+1;
						}
						String aux=letras[ind];
						letras[ind]=letras[ind-1];
						letras[ind-1]=aux;
						ind=ind-1;
						cont++;
						if(cont==desp) {
							sale=true;
							break;
						}
						if(sp>=0) {
							sp++;
						}
						if(ind==0 && i!=0) {
							sp=0;
						}
					}
				}else {
				for(int x=ind;x>i;x--) {
					if(ind>letras.length) {
						ind=letras.length-1;
						sp=ind+1;
					}
					String aux=letras[ind];
					letras[ind]=letras[ind-1];
					letras[ind-1]=aux;
					ind=ind-1;
					cont++;
					if(cont==desp) {
						sale=true;
						break;
					}
					if(sp>0) {
						sp++;
					}
					if(ind==0 && i!=0) {
						sp=0;
					}
				}
				}
			}else {
				for(int j=ind;j<i;j++) {
					String aux=letras[j];
					letras[j]=letras[j+1];
					letras[j+1]=aux;
					ind=ind+1;
					cont++;
					if(cont==desp) {
						sale=true;
						break;
					}
					if(ind==letras.length-1) {
						ind=i+2;
					}
					if(ind>=i) {
						break;
					}
				}
			}
		}
		for(String s:letras) {
			result+=s;
		}
		return result;
		}

}
