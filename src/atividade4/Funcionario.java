package atividade4;

public class Funcionario extends Pessoa {
	
    //Atributos
    private String setor;

    
    public String getSetor(){
        return setor;
    }
    public void setSetor(String setor){
        this.setor = setor;       
}
    
    @Override
	public String toString() {
		return "Funcionario  ----- >" + 
				"Setor: " + getSetor() +
				" nome: " + getNome() + 
				" idade: " + getIdade() + 
				" sexo: " + getSexo();
	}
    
	
    
}

