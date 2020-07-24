
/**
 * Escreva a descrição da classe aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */

import java.io.*;
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
        int nDependentes = 0;
        int nFiscais = 0;
        int coefFiscal = 0;
        int ativEconomica = 0;

        String password = " ";
        String email = " ";
        String nome = " ";
        String morada = " ";
        
        
        
        
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
                    System.out.println("carregue em 1 se for um utilizador individual.");
                    System.out.println("carregue em 2 se for um utilizador coletivo.");
                    System.out.println("carregue em 4 para voltar atrás.");
                    n = sc.nextInt();
                    if(n == 1){
                         System.out.println("----------------REGISTER---------------");
                         System.out.println("Introduza o NIF");
                         nif = sc.nextInt();
                         System.out.println("Introduza a password.");
                         password = sc.next();
                         System.out.println("Introduza o seu nome.");
                         nome = sc.next();
                         System.out.println("Introduza o seu email.");
                         email = sc.next();
                         System.out.println("Introduza a sua morada.");
                         morada = sc.next();
                         System.out.println("Introduza o seu numero de dependentes do agregado familiar.");
                         nDependentes = sc.nextInt();
                         System.out.println("Introduza os numeros ficais do agregado familiar.");
                         nFiscais = sc.nextInt();
                         System.out.println("Introduza o coeficiente fiscal(0 a 100).");
                         coefFiscal = sc.nextInt();
                         System.out.println("Introduza o numero que representa a sua atividade economica.");
                         ativEconomica = sc.nextInt();
                         
                         System.out.println("A guardar informaçao.");
                         try{
                             File utilizadoresInd = new File("/home/tiago/Desktop/ProjetoPO/UtilizadoresIndividuais.txt");
                             FileOutputStream is = new FileOutputStream(utilizadoresInd);
                             OutputStreamWriter osw = new OutputStreamWriter(is);
                             Writer w = new BufferedWriter(osw);
                             w.write(" " + nif + password + nome + email + morada + nDependentes + nFiscais + coefFiscal + ativEconomica + "\n");
                             w.close();
                             
                            }catch(IOException e){
                                System.err.println("Problem writing to the file");
                            }
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
                        password = sc.next();
                    
                        if(existe_utilizadorIndividual(this.ui, nif, password) == true){
                            n = 4;
                            i = 1;
                        }
                        
                        if(existe_utilizadorColetivo(this.uc, nif, password) == true){
                            n = 4;
                            i = 2;
                        }
                        
                        if(existe_admin(this.admin, nif, password) == true){
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
    
    public double verificaDespInd(UtilizadorIndividual utilizador, ArrayList<Factura> fac){
        int nif = utilizador.get_NIF();
        int coef = utilizador.get_coefFiscal();
        int n = 0;
        double soma = 0;
        while(fac != null)
        {
            if((fac.get(n)).get_nFiscalEmitente() == nif)
            {
                 soma = (fac.get(n)).get_valorDespeza() + soma;
            }
            n++;
        }
        
        soma = soma/((utilizador.get_coefFiscal())/100);
        
        return soma;
    }
    
    
    
    public Factura modificaAtividade(ArrayList<Factura> fac, int nifCliente, int nifEmitente, GregorianCalendar data, String novaAtiv){
        
        for(Factura a: fac)
        {
            if(a.get_nFiscalEmitente() == nifEmitente && a.get_data() == data && a.get_nFiscalEmitente() == nifEmitente)
            {
                 a.get_naturezaDespeza().removeAll(a.get_naturezaDespeza());
                 a.get_naturezaDespeza().add(novaAtiv);
                 a.set_validada(true);
                 
            }
        }
        
        return null;
    }
    
    public ArrayList<Factura> ordenaFacturasTempo(ArrayList<Factura> fac, int nif){
        ArrayList<Factura> temp = new ArrayList<Factura>();
        
        
        for(Factura a: fac){
            if(a.get_nFiscalEmitente() == nif){
                temp.add(a);
            }
        }
        
        ArrayList<Factura> ord = new ArrayList<Factura>();
        Factura n = new Factura();
        for(Factura f: temp){
            for(Factura o: temp){
                if (o.get_data().compareTo(n.get_data()) > 0){
                    n = o;
                }
                
            }
            ord.add(n);
            temp.remove(n);
        }
        return ord;
    }
    
    public ArrayList<Factura> ordenaFacturasValor(ArrayList<Factura> fac, int nif){
        ArrayList<Factura> temp = new ArrayList<Factura>();
        
        
        for(Factura a: fac){
            if(a.get_nFiscalEmitente() == nif){
                temp.add(a);
            }
        }
        
        ArrayList<Factura> ord = new ArrayList<Factura>();
        Factura n = new Factura();
        for(Factura f: temp){
            for(Factura o: temp){
                if (o.get_valorDespeza() > n.get_valorDespeza()){
                    n = o;
                }
                
            }
            ord.add(n);
            temp.remove(n);
        }
        return ord;
    }
    
    public ArrayList<Factura> ordenaFacturasContribuintes(ArrayList<UtilizadorColetivo> empresas, ArrayList<Factura> fac, GregorianCalendar start, GregorianCalendar finish)
    {
        ArrayList<Factura> cont = new ArrayList<Factura>();
        for(UtilizadorColetivo u: empresas){
            for(Factura a: fac){
                if(u.get_NIF() == a.get_nFiscalEmitente()){
                    if(a.get_data().compareTo(start) > 0 && a.get_data().compareTo(finish) < 0){
                        cont.add(a);
                    }
                }
            }
        }
        return cont;
    }
}
