import java.util.Scanner;
import java.io.IOException;

//Crie um programinha em java que leia 
//3 valores que representam os lados de um triângulo;
//Verifique se é um 
//triângulo equilatero (três lados iguais), 
//isósceles (dois lados iguais) 
//escaleno (três lados diferentes). 

//IF
//AND (&&)
//OR (||)
//IGUAL ==
//DIFERENTE !=


class Console {
  
    public static void clear(String... arg) throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
}

class DescobrirTriangulo {
  
	public static void main(String args[]) throws IOException, InterruptedException{  
   
    Scanner teclado = new Scanner(System.in);       
    Console console = new Console();    
    
    int x = 2;
    int y = 4;
    int z = 3;
    
    String tipo       = "Isosceles";
    
    int continuar;   
    
    if(x == y && x == z){
      tipo = "Equilatero"; 
    }
    
    if(x != y && x != z){
      tipo = "Escaleno";
    }
    
    console.clear();
    
    System.out.printf("triangulo %s\n\n\n\n\n (: \n\n\n", tipo);
   
    System.out.printf("Deseja inserir outro triangulo? ( 1 - Para sim | 2 - para nao)\n");
    
    continuar = teclado.nextInt();
    
    if(continuar == 1){
      main(null);
    }
    
    console.clear();
    System.exit(0);

	}

}
