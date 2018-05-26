
/**
 * Write a description of class Factura here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Factura
{
   private int nFiscalEmitente;
   
   private String emitente;
   
   private GregorianCalendar data;//mudar
   
   private int nFiscalCliente;
   
   private String descricao;
   
   private ArrayList<String> naturezaDespeza;
   
   private double valorDespeza;
   
   private boolean validada;
   
   public Factura()
   {
       this.nFiscalEmitente = 0;
       this.emitente = " ";
       this.data = 0;
       this.nFiscalCliente = 0;
       this.descricao = " ";
       this.naturezaDespeza = null; //DUVIDA
       this.valorDespeza = 0;
       this.validada = false;
   }
   
   public Factura(int nFiscalEmitente, String emitente, int data, int nFiscalCliente, String descricao, ArrayList<String> naturezaDespeza, double valorDespeza)
   {
       this.nFiscalEmitente = nFiscalEmitente;
       this.emitente = emitente;
       this.data = data;
       this.nFiscalCliente = nFiscalCliente;
       this.descricao = descricao;
       this.naturezaDespeza = naturezaDespeza;
       this.valorDespeza = valorDespeza * getDeducao();
       if(this.naturezaDespeza.size() <= 1)
            this.validada = true;
       else this.validada = false;     
   }
   
   public Factura(Factura umaF) { 
       this.nFiscalEmitente = umaF.get_nFiscalEmitente(); 
       this.emitente = umaF.get_emitente(); 
       this.data = umaF.get_data();
       this.nFiscalCliente = umaF.get_nFiscalCliente();
       this.descricao = umaF.get_descricao();
       this.naturezaDespeza = umaF.get_naturezaDespeza();
       this.valorDespeza = umaF.get_valorDespeza();
       this.validada = umaF.get_validada();
    }
   
   public int get_nFiscalEmitente(){
       return nFiscalEmitente;
   }
   
   public void set_nFiscalEmitente(int nFiscalEmitente){
       this.nFiscalEmitente = nFiscalEmitente;
   }
   
   
   public String get_emitente(){
       return emitente;
   }
   
   public void set_emitente(String set_emitente){
       this.emitente = emitente;
   }
   
   
   public GregorianCalendar get_data(){
       return data;
   }
   
   public void set_data(GregorianCalendar data){
       this.data = data;
   }
   
   
   public int get_nFiscalCliente(){
       return nFiscalCliente;
   }
   
   public void set_nFiscalCliente(int nFiscalCliente){
       this.nFiscalCliente = nFiscalCliente;
   }
   
   
   public String get_descricao(){
       return this.descricao;
   }
   
   public void set_descricao(int tipoDespeza){
       this.descricao = descricao;
   }
   
   
   public ArrayList<String> get_naturezaDespeza(){
       return naturezaDespeza;
   }
   
   public void set_naturezaDespeza(ArrayList<String> naturezaDespeza){
       this.naturezaDespeza = naturezaDespeza;
   }
   
   
   public double get_valorDespeza(){
       return valorDespeza;
   }
   
   public void set_valorDespeza(int valorDespeza){
       this.valorDespeza = valorDespeza;
   }
   
   public boolean get_validada(){
       return this.validada;
   }
   
   public void set_validada(boolean validada){
       this.validada = validada;
   }
   
   public double getDeducao(){
       int i = 0;
       if(this.naturezaDespeza.size() <= 1){      
       
           while(i < this.naturezaDespeza.size()){
               if(this.naturezaDespeza.get(i) == "EDUCACAO"){
                   return 1.3;
                }
               if(this.naturezaDespeza.get(i) == "SAUDE"){
                    return 1.1;
               }
               if(this.naturezaDespeza.get(i) == "COMUNICACAO"){
                    return 1.7;
               }
               if(this.naturezaDespeza.get(i) == "ALIMENTACAO"){
                    return 1.2;
               }
               if(this.naturezaDespeza.get(i) == "ESSENCIAIS"){
                   return 0;
               }
               i++;
           }
           return 1.5;
       }
       return 1;
   }
   
   public void valNatureza(ArrayList<String> nat){
       set_naturezaDespeza(nat);
       set_validada(true);
   }
   
   public Factura clone(){
       return new Factura(this);
   }
   
}