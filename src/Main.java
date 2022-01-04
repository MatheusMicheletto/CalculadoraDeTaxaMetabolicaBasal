import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double peso;
        double altura;
        double idade;
        int soma = 0;
        char sexo;
        ;

        System.out.print("Informe seu sexo M ou F ");
        sexo = sc.next().toUpperCase().charAt(0);
        System.out.println("Sexo informado " + sexo);

        switch (sexo) {
            case 'F':
            case 'M': {
                System.out.print("Informe seu Peso: ");
                peso = sc.nextDouble();
                System.out.println("Seu peso é " + peso);

                System.out.print("Informe sua altura: ");
                altura = sc.nextDouble();
                System.out.println("Sua altura é " + altura + "cm");

                System.out.print("Informe sua idade: ");
                idade = sc.nextDouble();
                System.out.println("Sua idade é " + idade);

                if (sexo == 'F')
                    soma = (int) (655 + (9.6 * peso) + (1.8 * altura) - (4.7 * idade));

                if (sexo == 'M')
                    soma = (int) (66 + (13.7 * peso) + (5 * altura) - (6.8 * idade));

                System.out.println("Sua taxa basal é " + soma);
                break;
            }
            default:
                System.out.println("Indefinido");
                break;
        }

        sc.close();

    }
}