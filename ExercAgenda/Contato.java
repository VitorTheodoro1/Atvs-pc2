package ExercAgenda;








public class Contato {

    private String nome;
    private int numero;
    private String email;


    public Contato(){
        nome = "";
        numero = 0;
        email = "";
    }

    public Contato(int numero, String nome, String email){
        this.nome = nome;
        this.numero = numero;
        this.email = email;
    }

    public void setNome(String valor){
        this.nome = valor;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getNome(){
        return nome;
    }

    public int getNumero(){
        return numero;
    }

    public String getEmail(){
        return email;
    }

    public String imprimir(){

        return "Nome: " + nome + "\nNumero : " + numero + "\nEmail :" + email;

    }

    

    
}
