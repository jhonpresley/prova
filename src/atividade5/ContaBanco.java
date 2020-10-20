package atividade5;
public class ContaBanco {
    //Atributos
    public int numConta ;
    protected String tipo;
    private String dono;
    private int saldo;
    private boolean status;
    
    //metodos
    public void abrirConta(){
        setStatus(true);
        if(tipo == "cc"){
            saldo = 50;
        } else if(tipo == "cp") {
            saldo = 150;
        }
    }
    public void fecharConta(){
       if(saldo >= 0){
           setStatus(false);
       } else {
           System.out.println("Impossivel de realizar a operação.");
    }
    }
    public void depositar(int d){
        if(getStatus()){
            saldo+= d;
        } else{
            System.out.println("ERROR");
        }
    }
    public void sacar(int s){
        if(s <= saldo && getStatus()){
            saldo -= s;
            System.out.println("Você sacou: " + s + "R$");
            System.out.println("  ");
        } else{
            System.out.println("ERROR");
            System.out.println(" ");
        }
    }
    public void pagarMensal(){
        if(status == true && saldo > 0 && tipo == "cc" ){
            saldo -= 15;
        } else if(status == true && saldo > 0 && tipo == "cp"){
            saldo -= 20;
        } else {
            System.out.println("ERROR");
        }
    }
   //MÃ©todos Especiais
    public void ContaBanco() {
    this.setStatus(false);
    this.setSaldo(0);
   
}
   public void setNumConta(int n){
       this.numConta = n;
   }
   public int getNumConta(){
      return this.numConta;
   }
   public void setTipo(String t){
       if(t == "cc" || t == "cp" ){
           this.tipo = t;
       } else{
           System.out.println("ERROR");
       }
   }
   public String getTipo(){
       return this.tipo;
   }
   public void setDono(String dd){
       this.dono = dd;
   }
   public String getDono(){
       return this.dono;
   }
   public void setSaldo(int ss){
       this.saldo = ss;
   }
   public int getSaldo(){
       return this.saldo;
   }
   private void setStatus(boolean st){
       this.status = st;
   }
   public boolean getStatus(){
       return this.status;
   }
   public void Status(){
       System.out.println("O dono da conta: " + this.dono);
       System.out.println("O numero da conta: " + this.numConta);
       System.out.println("Tipo da conta: " + this.tipo);
       System.out.println("Possui o saldo de: " + this.saldo + "R$");
       System.out.println("A conta esta aberta?: " + this.status);
   }
}

