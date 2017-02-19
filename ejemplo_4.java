package metodo_4;

public class ejemplo_4 {
	public static void main(String[] args) {
		int resul;
		resul = division (12,2);
		imprimir(resul);
		}
	public static int division(int a, int b){
		int divi=a/b;
		return divi;
	}
	public static void imprimir(int z){
		System.out.println("el reultado es: "+z);
	}

}

