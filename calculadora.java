import java.util.Scanner;
public class calculadora {
    public static void main(String[] args){
        try{
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        num = sc.nextInt();
        System.out.println("O número é: "+num);
        sc.close();
        }catch (Exception e){
            System.out.println("Exceção"+e);
            System.out.println("Digite apenas numeros(sem letras ou caracteres especiais)");
            
        }
    }
}