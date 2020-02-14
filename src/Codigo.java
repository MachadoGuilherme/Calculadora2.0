import java.util.Scanner;

public class Codigo {

    Scanner entrada = new Scanner(System.in);

    private int qntddContas;
    private int soma = 0;
    private int menos = 0;
    private int divide = 0;
    private int vezes = 0;
    private int result;

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
        System.out.println("\n\t≠≠≠ Este Menu Esta em Construção! ≠≠≠");
        /*
        System.out.println("\n\t≥≥ Subtrair ≤≤");
        System.out.print("\nQuantas Contas Quer Subtrair: ");
        qntddContas = entrada.nextInt();
        System.out.println("\n");

        for (int i = 1; i <= qntddContas; i++){
            System.out.print("Digite o " + i + "º Numero: ");
            menos -= entrada.nextInt();
        }
        result = menos;
        System.out.println("\nResultado: " + result);
        menos = 0;
        */
    }
//=====================================================================================================================
    public void contaDivide(){
        System.out.println("\n\t≥≥ Dividir ≤≤");
        System.out.print("\nDigite o 1º Numero: ");
        int divideA = entrada.nextInt();
        System.out.print("Digite o 2º Numero: ");
        int divideB = entrada.nextInt();

        if (divideA < divideB){
            System.out.println("\n\tO Primeiro Numero Deve ser Maior Que o Segundo!");
        }
        else {
            result = divideA / divideB;
            System.out.println("\nResultado: " + result);
        }

        /*
        System.out.print("\nQuantas Contas Quer Dividir: ");
        qntddContas = entrada.nextInt();
        System.out.println("\n");

        for (int i = 1; i <= qntddContas; i++){
            System.out.print("Digite o " + i + "º Numero: ");
            divide /= entrada.nextInt();
        }
        result = divide;
        System.out.println("\nResultado: " + result);
        divide = 0;
         */
    }
//=====================================================================================================================
    public void contaMultiplica(){
        System.out.println("\n\t≥≥ Multiplicar ≤≤");
        System.out.print("\nDigite o 1º Numero: ");
        int multiA = entrada.nextInt();
        System.out.print("Digite o 2º Numero: ");
        int multiB = entrada.nextInt();

        result = multiA * multiB;
        System.out.println("\nResultado: " + result);

        /*
        System.out.print("\nQuantas Contas Quer Mulriplicar: ");
        qntddContas = entrada.nextInt();
        System.out.println("\n");

        for (int i = 1; i <= qntddContas; i++){
            System.out.print("Digite o " + i + "º Numero: ");
            vezes *= entrada.nextInt();
        }
        result = vezes;
        System.out.println("\nResultado: " + result);
        vezes = 0;
         */
    }
//=====================================================================================================================
}
