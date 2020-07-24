
/**
 * Escreva a descrição da classe UtilizadorColetivo aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class UtilizadorColetivo
{
   private int NIF;
    
   private String email;
    
   private String nome;
    
   private String morada;
    
   private String password;
    
   private int factorFiscal;
    
   private int ativEconomica;
    
   public UtilizadorColetivo()
   {
       this.NIF = 0;
       this.email = " ";
       this.nome = " ";
       this.morada = " ";
       this.password = " ";
       this.factorFiscal = 0;
       this.ativEconomica = 0;
   }
   
   public UtilizadorColetivo(int type, int NIF, String email, String nome, String morada, String password, int factorFiscal, int ativEconomica)
   {
       this.NIF = NIF;
       this.email = email;
       this.nome = nome;
       this.morada = morada;
       this.password = password;
       this.factorFiscal = factorFiscal;
       this.ativEconomica = ativEconomica;
   }
   
   public UtilizadorColetivo(UtilizadorColetivo umU) { 
       this.NIF = umU.get_NIF(); 
       this.email = umU.get_email(); 
       this.nome = umU.get_nome();
       this.morada = umU.get_morada();
       this.password = umU.get_password();;
       this.factorFiscal = umU.get_factorFiscal();
       this.ativEconomica = umU.get_ativEconomica(); 
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
   
   public int get_factorFiscal(){
        return factorFiscal;
   }
    
   public void set_factorFiscal(int factorFiscal){
       this.factorFiscal = factorFiscal;
   }
   
   public int get_ativEconomica(){
        return ativEconomica;
   }
    
   public void set_ativEconomica(int ativEconomica){
       this.ativEconomica = ativEconomica;
   }
   
   public UtilizadorColetivo clone(){
       return new UtilizadorColetivo(this);
   }
}
