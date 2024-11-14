public class Numeropri{
    public static void main(String[] args) {
        
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                         21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 
                         39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50
        };

        
        for (int numero : numeros) {
            if (esPrimo(numero)) {
                System.out.println(numero + " es un número primo.");
            }
        }
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false; 
        }
        
       
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false; 
            }
        }
        
        return true; 
    }
}
