
/**
 * Write a description of class Variaveis here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
import java.lang.String;

public class Utilizador extends JavaFactura
{
    private int user; //0 se admin, 1 se individual, 2 se coletivo.
    
    private int NIF;
    
    private String email;
    
    private String nome;
    
    private String morada;
    
    private String password;
    
    private int nDependentes;
    
    private int nFiscais;
    
    private int coefFiscal;
    
    private int ativEconomica;
    
   public Utilizador()
   {
       this.user = 0;
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
   
   public Utilizador(int user, int NIF, String email, String nome, String morada, String password)
   {
       this.user = user;
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
   
   public int get_user(){
        return user;
   }
    
   public void set_user(int user){
       this.user = user;
   }
   
   public int get_NIF(){
        return NIF;
   }
    
   public void set_NIF(int NIF){
       this.NIF = NIF;
   }
    
   public String get_email(){
       return email;
   }
    
   public void set_email(String email){
       this.email = email;
   }
    
   public String get_nome(){
       return nome;
   }
    
   public void set_nome(String nome){
      this.nome = nome;
   }
    
   public String get_morada(){
       return morada;
   }
    
   public void set_morada(String morada){
       this.morada = morada;
   }
    
   public String get_password(){
       return morada;
   }
    
   public void set_password(String password){
       this.password = password;
   }
   
   public int get_nDependentes(){
        return nDependentes;
   }
    
   public void set_nDependentes(int nDependentes){
       this.nDependentes = nDependentes;
   }
   
   public int get_nFiscais(){
        return nFiscais;
   }
    
   public void set_nFiscais(int nFiscais){
       this.nFiscais = nFiscais;
   }
   
   public int get_coefFiscal(){
        return coefFiscal;
   }
    
   public void set_coefFiscal(int coefFiscal){
       this.coefFiscal = coefFiscal;
   }
   
   public int get_ativEconomica(){
        return ativEconomica;
   }
    
   public void set_ativEconomica(int ativEconomica){
       this.ativEconomica = ativEconomica;
   }
}

