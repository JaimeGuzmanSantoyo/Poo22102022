/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaejemplo;

/**
 *
 * @author josej
 */
public class Cuentahabiente {
    
    private String NombreCliente;
    private int ide;
    private int balance;

    public Cuentahabiente() {
    }

    public Cuentahabiente(String NombreCliente, int ide, int balance) {
        this.NombreCliente = NombreCliente;
        this.ide = ide;
        this.balance = balance;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public int getIde() {
        return ide;
    }

    public void setIde(int ide) {
        this.ide = ide;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Cuentahabiente{" + "NombreCliente=" + NombreCliente + ", ide=" + ide + ", balance=" + balance + '}';
    }
 
    
  public void retirarDinero( float monto ){
          
          System.out.println("el balance totoal es de : " );
                 System.out.println(this.balance - 10000); ;
          if(balance < 50000){
              System.out.println("cliente regular y el nombre del usuario es : " + this.NombreCliente);
          }else{
              System.out.println("cliente premium y su nombre es "+ this.NombreCliente);
              
              
          }
         // System.out.println("el nombre del cliente premium es es  "+this.NombreCliente);
      
       
      
      
  }
      
  }

  
    
    
    
//}
