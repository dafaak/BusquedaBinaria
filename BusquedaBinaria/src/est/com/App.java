package est.com;

public class App {

	public static void main(String[] args) {
		int vector[]={1,4,6,11,25,33,45,100};
		int clave=123;
		System.out.println("Vector: "+toString(vector)+"\n");
		if(busquedaBinaria(vector,clave)>=0){
			System.out.println("La clave "+clave+" se encuentra en la posición "+busquedaBinaria(vector,clave));
		}
		else{System.out.println("La clave "+clave+" no se encuentra en la lista");}
	}

public static int busquedaBinaria(int vector[],int clave){
int centro,linferior,lsuperior;
int valorcentral;

linferior=0;
lsuperior=vector.length-1;
while(linferior<=lsuperior){
	
	centro=(linferior+lsuperior)/2;
	valorcentral=vector[centro];
	if(clave==valorcentral){return centro;}
	else{if (clave <valorcentral){ 
		lsuperior= centro-1;}
	else {linferior=centro+1;}
	 }
	
	
	
   }
return -1;}

private static String toString(int[] vector) {
	String salida="";	
	for (int i=0;i<vector.length;i++){
			salida+=vector[i]+" ";
		}
return salida;	
}


}
