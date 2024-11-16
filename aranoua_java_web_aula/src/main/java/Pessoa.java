//package .java_web_aranoua.model;
public class Pessoa {
    private int id;
    private String nome;
    private double telefone;
    private String email;
    
    public Pessoa(int id, String nome, double telefone, String email){
        this.id = id;
        this.nome = "nome";
        this.telefone = telefone;
        this.email = "email";
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public double getTelefone(){
        return telefone;
    }
    public void setTelefone(double telefone){
        this.telefone = telefone;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
}
