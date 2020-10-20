package atividade4;
public class ProjetoPessoas {
    public static void main(String[] args) {
    	
    	
        //Programa Principal
  
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
       

        p2.setNome("Maria");
        p3.setNome("João");
        p4.setNome("Fabiana");
        
        p2.setSexo("Feminino");
        p3.setSexo("Masculino");
        p4.setSexo("Feminino");

        p2.setIdade(20);
        p3.setIdade(18);
        p4.setIdade(27);

        p2.setCurso("Informatica");
        p2.setMatr(15647);
        
        p3.setSalario(2500.75f);
        p3.setEspecialidade("Doutorado");
        p4.setSetor("Estoque");
        
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        
    }
    
}
