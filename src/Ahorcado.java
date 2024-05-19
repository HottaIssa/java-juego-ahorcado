import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        char[] letrasAdivinadas 
        = new char[palabraSecreta.length()];

        for(int i = 0; i < palabraSecreta.length() ;i++){
            letrasAdivinadas[i] = '_';
        }

        while(!palabraAdivinada && intentos < intentosMaximos ){

            System.out.println("Palabra a adivinar: "+ String.valueOf(letrasAdivinadas) + " (12 letras");
            System.out.println("Introduzca una letra");
            char letra = Character.toLowerCase(sc.next().charAt(0));
            boolean letraCorrecta = false;

            for(int i = 0; i < palabraSecreta.length(); i++){
                if(letra == palabraSecreta.charAt(i)){
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }

            if(letraCorrecta == false){
                System.out.println("Ingresasté una letra incorrecta, te quedan " + (intentosMaximos - intentos) + " intentos");
                intentos++;
            }

            System.out.println("-------------------------------------------");

            if(palabraSecreta.equals(String.valueOf(letrasAdivinadas))){
                palabraAdivinada = true;
            }            

        }

        System.out.println("La palabra correcta era: " + palabraSecreta);

        if(palabraAdivinada == true){
            System.out.println("Adivinaste la palabra");
        }else {
            System.out.println("No adivinaste, suerte en la proxima");
        }

        sc.close();
    }
    
}
