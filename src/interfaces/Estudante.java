package interfaces;

// Interface Estudante que herda de Usuario
public interface Estudante extends Usuario {
    String getMatricula();

    void setMatricula(String matricula);

    void estudar(String materia);

    // Implementação da interface Estudante
    class EstuImpl implements Estudante {
        private String nome;
        private int idade;
        private String matricula;

        public EstuImpl(String nome, int idade, String matricula) {
            this.nome = nome;
            this.idade = idade;
            this.matricula = matricula;
        }

        // Métodos da interface Usuario
        @Override
        public String getNome() {
            return nome;
        }

        @Override
        public void setNome(String nome) {
            this.nome = nome;
        }

        @Override
        public int getIdade() {
            return idade;
        }

        @Override
        public void setIdade(int idade) {
            this.idade = idade;
        }

        // Métodos da interface Estudante
        @Override
        public String getMatricula() {
            return matricula;
        }

        @Override
        public void setMatricula(String matricula) {
            this.matricula = matricula;
        }

        @Override
        public void estudar(String materia) {
            System.out.println(nome + " está estudando " + materia);
        }

        @Override
        public String toString() {
            return "Estudante{" +
                    "nome='" + nome + '\'' +
                    ", idade=" + idade +
                    ", matricula='" + matricula + '\'' +
                    '}';
        }
    }
}
