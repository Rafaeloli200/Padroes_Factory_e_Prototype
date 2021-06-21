package Prototype;


public class Piloto implements Cloneable {
    
    private int id;
    private String nome;
    private String sexo;
    private String formacao;
    private String nacionalidade;

    public Piloto(int id, String nome, String sexo, String formacao, String nacionalidade) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.formacao = formacao;
        this.nacionalidade = nacionalidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    @Override
    public Piloto clone() throws CloneNotSupportedException{ 
        Piloto pilotoClone = (Piloto) super.clone();
        return pilotoClone;
    }
    
    
    @Override
    public String toString() {
        return "Piloto{" + 
                "id=" + id + 
                ", nome=" + nome + 
                ", sexo=" + sexo + 
                ", formacao=" + formacao + 
                ", nacionalidade=" + nacionalidade + '}';
    }
    
    
}
