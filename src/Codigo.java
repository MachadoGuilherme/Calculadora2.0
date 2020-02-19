import java.util.Scanner;

public class Codigo {

    Scanner entrada = new Scanner(System.in);

    private int qntddContas;
    private int soma;
    private int menos;
    private int result;
    private double numA;
    private double numB;
    private double resultado;

//=====================================================================================================================
    public Codigo(){

    }
//=====================================================================================================================
    public void contaSoma(){
        System.out.println("\n\t≥≥ Somar ≤≤");
        System.out.print("\nQuantas Contas Quer Somar: ");
        qntddContas = entrada.nextInt();
        System.out.println("\n");

        for (int i = 1; i <= qntddContas; i++){
            System.out.print("Digite o " + i + "º Numero: ");
            soma += entrada.nextInt();
        }

        result = soma;
        System.out.println("\nResultado: " + result);
        soma = 0;
    }
//=====================================================================================================================
    public void contaDiminui(){

        System.out.println("\n\t≥≥ Subtrair ≤≤");
        System.out.print("\nQuantas Contas Quer Subtrair: ");
        qntddContas = entrada.nextInt();
        System.out.println("\n");

        System.out.print("Digite o 1º Numero: ");
        result = entrada.nextInt();

        for (int i = 2; i <= qntddContas; i++){
            System.out.print("Digite o " + i + "º Numero: ");
            menos = entrada.nextInt();

            result = result - menos;
        }

        System.out.println("\nResultado: " + result);

    }
//=====================================================================================================================
    public void contaDivide(){
        System.out.println("\n\t≥≥ Dividir ≤≤");
        do{
            System.out.print("\nDigite o 1º Numero: ");
            numA = entrada.nextDouble();
            System.out.print("Digite o 2º Numero: ");
            numB = entrada.nextDouble();

            if (numA < numB){
                System.out.println("\n\tO Primeiro Numero Deve ser Maior Que o Segundo!");
            }
            else {
                resultado = numA / numB;
                System.out.println("\nResultado: " + resultado);
            }

        }while (numA < numB);
    }
//=====================================================================================================================
    public void contaMultiplica(){
        System.out.println("\n\t≥≥ Multiplicar ≤≤");
        System.out.print("\nDigite o 1º Numero: ");
        numA = entrada.nextInt();
        System.out.print("Digite o 2º Numero: ");
        numB = entrada.nextInt();

        resultado = numA * numB;
        System.out.println("\nResultado: " + resultado);
    }
//=====================================================================================================================
}
