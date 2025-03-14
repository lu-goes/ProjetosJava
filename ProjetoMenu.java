import java.util.ArrayList;
import java.util.Scanner;

public class ProjetoMenu {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        String nome;
        double compra;
        int op;
        
        System.out.println("Menu\n1 - Adicionar usuario");
        System.out.println("2 - Consultar usuario\n3 - Fazer Compra");
        
        op=validador();
        ArrayList nomes = new ArrayList<>();
       // String nomes [ ]= 
       switch (op) {
            case 1:
            System.out.println("insira o nome");
            nome=e.next();
            nomes.add(nome);
            break;
            
            case 2:
            System.out.println("localizar usuário, insira nome");
            nome=e.next();
            nomes.add(nome);
            if (nomes.isEmpty()) {
                System.out.println("lista vazia");
            }else if (nomes.equals(nome)) {
                System.out.println("Cliente encontrado");
            }
            break;
        
            case 3:
            System.out.println("Insira o valor total dos produtos");
            compra=e.nextDouble();
            double total=0;
            total=total+0.9*compra;
            System.out.println("Valor à pagar " + total);
            break;
       
            default:
            System.out.println("Erro no sistema");
            
       }
       e.close();
    
    }
    

    public static int validador(){
    Scanner e = new Scanner(System.in);
    int op = 0;
    System.out.println("insira as opções");
    op=e.nextInt();
    if(op==1||op==2||op==3){
        return op;
    }else{
        System.out.println("erro, digite a opção correta");
        return validador();
    }
    
    
    };
}