import java.util.Scanner;

public class Telas {

    Scanner entrada = new Scanner(System.in);
    Codigo cod = new Codigo();
    int menuInicial = 0;

    public Telas(){

    }
//=====================================================================================================================
    public void telaInicial(){
        System.out.println("\n\t∞∞ Calculadora 2.0 ∞∞");
        do {
            System.out.println("\n\t•• Menu Inicial ••\n");
            System.out.println("0 - Sair");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Dividir");
            System.out.println("4 - Multiplicar");
            System.out.print("\nEscolha uma Das Opções: ");
            menuInicial = entrada.nextInt();

            if (menuInicial <0 || menuInicial >4){
                System.out.println("\n\tOpção Invalida!!");
            }
            else {
                if (menuInicial == 1){
                    cod.contaSoma();
                }
                if (menuInicial == 2){
                    cod.contaDiminui();
                }
                if (menuInicial == 3){
                    cod.contaDivide();
                }
                if (menuInicial == 4){
                    cod.contaMultiplica();
                }
            }

        }while (menuInicial != 0);
        System.out.println("\n\tAté a Proxima!");
    }
//=====================================================================================================================
}
