
/**
 * Escreva a descrição da classe aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.util.*;
public class Menu
{
    private ArrayList<UtilizadorColetivo> uc;
    private ArrayList<UtilizadorIndividual> ui;
    private ArrayList<Factura> fac;
    private int admin;
    
    public boolean existe_utilizadorIndividual(ArrayList<UtilizadorIndividual> UI, int id, String pass){
        
        
        return false;
    }
    public boolean existe_utilizadorColetivo(ArrayList<UtilizadorColetivo> UC, int id, String pass){
    
        return false;
    }
    public boolean existe_admin(int admin, int id, String pass){
    
        return false;
    }
    
    
    String main(){
        
        int n = 1;
        int i = 4;
        int nif = 0;
        String pass = " ";
        Scanner sc = new Scanner(System.in);
        while(n != 0){
            System.out.println(" ");
            System.out.println("----------------MAIN PAGE---------------");
            System.out.println("carregue em 1 para registar um utilizador.");
            System.out.println("carregue em 2 para fazer o login.");
            System.out.println("carregue em 0 para terminar o programa.");
            n = sc.nextInt();
            
            if(n == 1){
                while(n != 4){
                    System.out.println(" ");
                    System.out.println("----------------REGISTER---------------");
                    System.out.println("carregue em 1 para inserir as suas informações.");
                    System.out.println("carregue em 4 para voltar atrás.");
                    n = sc.nextInt();
                    if(n == 1){
                         
                    }
                }
            }
            
            if(n == 2){
                while(n != 4){
                    System.out.println(" ");
                    System.out.println("----------------LOG IN---------------");
                    System.out.println("carregue em 1 para escrever as credenciais.");
                    System.out.println("carregue em 4 para voltar atrás.");
                    n = sc.nextInt();
                    
                    if(n == 1){
                        System.out.println("inserir NIF:");
                        nif = sc.nextInt();
                        System.out.println("inserir Password:");
                        pass = sc.next();
                    
                        if(existe_utilizadorIndividual(this.ui, nif, pass) == true){
                            n = 4;
                            i = 1;
                        }
                        
                        if(existe_utilizadorColetivo(this.uc, nif, pass) == true){
                            n = 4;
                            i = 2;
                        }
                        
                        if(existe_admin(this.admin, nif, pass) == true){
                            n = 4;
                            i = 3;
                        }
                    
                        if(i >= 4){
                            System.out.println("As credenciais nao existem no sistema.");
                        }
                    }
                
                    if(i == 1){
                        return "conta individual";
                    }
                    if(i == 2){
                        return "conta coletiva";
                    }
                    if(i == 3){
                        return "conta admin";
                    }
                }
            }
        }
        return "program over";
    }   
}
