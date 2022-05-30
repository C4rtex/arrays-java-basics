import java.util.HashMap;
import java.util.Map;

public class Ajedrez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] tablero= new String[]{".FF...F.",".F....F.",".F....F.",".F....F.",".F....F.",".F....F.",".F....F.",".F.F.FF."};
		System.out.println(fichasBlancas(tablero));
	}
	
	
	public static int fichasBlancas(String[] tablero) {
		int contador;
		int contador2=1;
		Map<String,Integer> miMap= new HashMap<>();
		miMap.put("F", 0);
		for(int i=0;i<tablero.length;i++) {
			char[] fila=tablero[i].toCharArray();
			char[] filaClear= new char[fila.length];
				if(i%2==0) {
					contador=0;	
					for(int x=0;x<fila.length;x++) {				
					if(contador%2==0 && miMap.containsKey(String.valueOf(fila[x]))) {
						miMap.put(String.valueOf(fila[x]), miMap.get(String.valueOf(fila[x]))+1);
					}
					contador++;
					}
					fila=filaClear;
					}else {
					contador=2;
					for(int x=0;x<fila.length;x++) {
					if(contador%2!=0 && miMap.containsKey(String.valueOf(fila[x]))) {
						miMap.put(String.valueOf(fila[x]), miMap.get(String.valueOf(fila[x]))+1);
					}
					contador++;
					}
					fila=filaClear;
					}
				}
		return miMap.get("F");
	}
}
