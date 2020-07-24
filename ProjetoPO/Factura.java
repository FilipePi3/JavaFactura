
/**
 * Write a description of class Factura here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
import java.lang.String;

public class Factura extends JavaFactura
{
   private int nFiscalEmitente;
   
   private String emitente;
   
   private int data;//mudar
   
   private int nFiscalCliente;
   
   private int tipoDespesa;
   
   private int naturezaDespesa;
   
   private int valorDespesa;
   
   public Factura()
   {
       this.nFiscalEmitente = 0;
       this.emitente = " ";
       this.data = 0;
       this.nFiscalCliente = 0;
       this.tipoDespesa = 0;
       this.naturezaDespesa = 0;
       this.valorDespesa = 0;
   }
   
   public Factura(int nFiscalEmitente, String emitente, int data, int nFiscalCliente, int tipoDespesa, int naturezaDespesa, int valorDespesa)
   {
       this.nFiscalEmitente = nFiscalEmitente;
       this.emitente = emitente;
       this.data = data;
       this.nFiscalCliente = nFiscalCliente;
       this.tipoDespesa = tipoDespesa;
       this.naturezaDespesa = naturezaDespesa;
       this.valorDespesa = valorDespesa;
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
   
   
   public int get_data(){
       return data;
   }
   
   public void set_data(int data){
       this.data = data;
   }
   
   
   public int get_nFiscalCliente(){
       return nFiscalCliente;
   }
   
   public void set_nFiscalCliente(int nFiscalCliente){
       this.nFiscalCliente = nFiscalCliente;
   }
   
   
   public int get_tipoDespesa(){
       return tipoDespesa;
   }
   
   public void set_tipoDespesa(int tipoDespesa){
       this.tipoDespesa = tipoDespesa;
   }
   
   
   public int get_naturezaDespesa(){
       return naturezaDespesa;
   }
   
   public void set_naturezaDespesa(int naturezaDespesa){
       this.naturezaDespesa = naturezaDespesa;
   }
   
   
   public int get_valorDespesa(){
       return valorDespesa;
   }
   
   public void set_valorDespesa(int valorDespesa){
       this.valorDespesa = valorDespesa;
   }
}
