package metodo_4;

public class ejemplo_3 {
	public static void main(String[] args) {
		int resul;
		resul=restar(3,5,8);
		imprimir(resul);
		}
	public static int restar(int a, int b, int c){
		int resta=a-b;
		return resta;
	}
	public static void imprimir(int z){
		System.out.println("La resta es: "+z);

	}


}


