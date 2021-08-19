import java.util.Scanner;

public class DecisaoRepeticao {
    public static void main(String[] args) {
        System.out.println("Contagem de 150 a 300: ");
        for (int x = 150; x <= 300; x++) {
            System.out.print(x + " ");
        }
        System.out.println(" ");
        System.out.println("========================");
        System.out.print("A soma dos números de 1 a 100: ");
        int a = 0;    
        for (int y = 1; y <= 100; y++) {
            a += y;
        }
        System.out.println(a);
        System.out.println("========================");
        System.out.println("Todos os múltiplos de 3, 1 a 100: ");
        for (int z=1; z<=100; z++){
            if (z%3 == 0){
                System.out.print(z + " ");
            }
        }
        System.out.println("\n");
        System.out.println("========================");
        System.out.print("Fatorial de 10: ");
        int b = 1;
        for (int f=10; f>=1; f--){
            b *= f;
        }
        System.out.println(b);
        System.out.println("========================");
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int w = input.nextInt();
        if (w%2 == 0){
            w = w/2;}
        else{
            w = w*3+1;}
        System.out.println(w);
    }
}

