import javax.swing.JOptionPane;

public class Contato {
    private String nome, endereco, telefone, email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Contato(){

    }

    public Contato(String nome, String endereco, String telefone, String email){
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setTelefone(telefone);
        this.setEmail(email);
    }

    public void imprime() {
        JOptionPane.showMessageDialog(null,
            "Nome: " + this.getNome() + 
            "\nEndereço: " + this.getEndereco() +
            "\nTelefone: " + this.getTelefone() +
            "\nEmail: " + this.getEmail(),
            "Informações do Objeto", 
            JOptionPane.INFORMATION_MESSAGE
            );
    }
}
