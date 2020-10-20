package atividade1;

public class Atividade1 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
         
        c1.destampar();
        c1.cor = "azul";
        c1.ponta = 0.5f;
        c1.carga = 100;
        c1.modelo = "BIC";
        c1.rabiscar();
        c1.status();
        
        System.out.println("  ");
        
        Caneta c2 = new Caneta();
        c2.tampar();
        c2.modelo = "Naruto";
        c2.cor = "Verde";
        c2.ponta = 0.7f;
        c2.carga = 77;
        c2.rabiscar();
        c2.status();
    }
    
}
