package br.com.dio.desafio.dominio;

// classe abstrata não pode ser instanciada
public abstract class Conteudo {

    // static significa que essa constante XP_PADRAO pode ser acessada fora da classe Conteudo
        protected static final double XP_PADRAO = 10d;

        private String titulo;
        private String descricao;

        public abstract double calcularXp();

        // GETTERS and SETTERS --------------------------------------------------------------
        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public String getDescricao() {
            return descricao;
        }

        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }

        // ----------------------------------------------------------------------------------
}
