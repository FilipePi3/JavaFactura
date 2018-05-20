
/**
 * Write a description of class Variaveis here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
import java.lang.String;
import java.lang.Object;

public class UtilizadorIndividual 
{   
    private int NIF;
    
    private String email;
    
    private String nome;
    
    private String morada;
    
    private String password;
    
    private int nDependentes;
    
    private int nFiscais;
    
    private int coefFiscal;
    
    private int ativEconomica;
    
   public UtilizadorIndividual()
   {
       this.NIF = 0;
       this.email = " ";
       this.nome = " ";
       this.morada = " ";
       this.password = " ";
       this.nDependentes = 0;
       this.nFiscais = 0;
       this.coefFiscal = 0;
       this.ativEconomica = 0;
   }
   
   public UtilizadorIndividual(int type, int NIF, String email, String nome, String morada, String password,int nDependentes, int nFiscais, int coefFiscal, int ativEconomica)
   {
       this.NIF = NIF;
       this.email = email;
       this.nome = nome;
       this.morada = morada;
       this.password = password;
       this.nDependentes = nDependentes;
       this.nFiscais = nFiscais;
       this.coefFiscal = coefFiscal;
       this.ativEconomica = ativEconomica;
   }
   
   public UtilizadorIndividual(UtilizadorIndividual umU) { 
       this.NIF = umU.get_NIF(); 
       this.email = umU.get_email(); 
       this.nome = umU.get_nome();
       this.morada = umU.get_morada();
       this.password = umU.get_password();
       this.nDependentes = umU.get_nDependentes();
       this.nFiscais = umU.get_nFiscais();
       this.coefFiscal = umU.get_coefFiscal();
       this.ativEconomica = umU.get_ativEconomica(); 
    }
   
   public int get_NIF(){
        return this.NIF;
   }
    
   public void set_NIF(int NIF){
       this.NIF = NIF;
   }
    
   public String get_email(){
       return this.email;
   }
    
   public void set_email(String email){
       this.email = email;
   }
    
   public String get_nome(){
       return this.nome;
   }
    
   public void set_nome(String nome){
      this.nome = nome;
   }
    
   public String get_morada(){
       return this.morada;
   }
    
   public void set_morada(String morada){
       this.morada = morada;
   }
    
   public String get_password(){
       return this.password;
   }
    
   public void set_password(String password){
       this.password = password;
   }
   
   public int get_nDependentes(){
        return this.nDependentes;
   }
    
   public void set_nDependentes(int nDependentes){
       this.nDependentes = nDependentes;
   }
   
   public int get_nFiscais(){
        return this.nFiscais;
   }
    
   public void set_nFiscais(int nFiscais){
       this.nFiscais = nFiscais;
   }
   
   public int get_coefFiscal(){
        return this.coefFiscal;
   }
    
   public void set_coefFiscal(int coefFiscal){
       this.coefFiscal = coefFiscal;
   }
   
   public int get_ativEconomica(){
        return this.ativEconomica;
   }
    
   public void set_ativEconomica(int ativEconomica){
       this.ativEconomica = ativEconomica;
   }
   
   public UtilizadorIndividual clone(){
       return new UtilizadorIndividual(this);
   }
}

