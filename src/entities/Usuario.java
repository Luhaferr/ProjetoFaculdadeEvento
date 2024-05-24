package entities;

public class Usuario {
        private String nome;
        private String email;
        private String endereco;
        private int idade;

        public Usuario(String nome, String email, String endereco, int idade) {
                this.nome = nome;
                this.email = email;
                this.endereco = endereco;
                this.idade = idade;
        }

        public String getNome() {
                return nome;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public String getEndereco() {
                return endereco;
        }

        public void setEndereco(String endereco) {
                this.endereco = endereco;
        }

        public int getIdade() {
                return idade;
        }

        public void setIdade(int idade) {
                this.idade = idade;
        }

        public void status(){
                System.out.println(nome + email + endereco + idade);
        }
}
