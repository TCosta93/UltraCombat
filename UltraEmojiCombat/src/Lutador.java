public class Lutador {
       //Atributos

       private String nome, nacionalidade, categoria,sexo;
       private int idade, vitorias, derrotas, empates;
       private float altura,peso;
   
       //Metodos publicos
   
       public void apresentar(){
        System.out.println("------------------------------------------------------------");
        System.out.println("Chegou a Hora! Apresentamos o Lutador: "+this.getNome());
        System.out.println("Diretamente de "+this.getNacionalidade());
        System.out.println("Com "+this.getIdade()+" anos e "+this.getAltura()+" metros");
        System.out.println("Pesando: "+this.getPeso()+" Kg");
        System.out.println("Sexo: "+this.getSexo());
        System.out.println(this.getVitorias()+" Vitorias");
        System.out.println(this.getDerrotas()+" Derrotas");
        System.out.println(this.getEmpates()+" Empates");
       }

       public void status(){
        System.out.println(this.getNome()+ " é um peso "+this.getCategoria());
        System.out.println("Ganhou "+this.getVitorias()+" vezes.");
        System.out.println("Empatou "+this.getEmpates()+" vezes.");
        System.out.println("Perdeu "+this.getDerrotas()+" vezes.");
       }
   
       public void ganharLuta(){
           this.setVitorias(this.getVitorias()+1);
   
       }
   
       public void perderLuta(){
           this.setDerrotas(this.getDerrotas()+1);
   
       }
       public void empatarLuta(){
           this.setEmpates(this.getEmpates()+1);
   
       }
   
       //Metodos especiais

       //Crio o Construtor
       public Lutador(String nome, String nacionalidade, String sexo, int idade, int vitorias, int derrotas,
       int empates, float altura, float peso) {
            this.nome = nome;
            this.nacionalidade = nacionalidade;
            this.sexo = sexo;
            this.idade = idade;
            this.vitorias = vitorias;
            this.derrotas = derrotas;
            this.empates = empates;
            this.altura = altura;
            this.setPeso(peso);
        }

       public String getNome() {
           return nome;
       }
       
        public void setNome(String nome) {
            this.nome = nome;
        }
        public String getNacionalidade() {
            return nacionalidade;
        }
        public void setNacionalidade(String nacionalidade) {
            this.nacionalidade = nacionalidade;
        }
        public String getCategoria() {
            return categoria;
        }

    
    //compara a categoria do lutador de acordo com o Peso.
    private void setCategoria() {
                   
        if(this.peso<52.2){
            this.categoria = "Inválido";
        } else if (this.peso<=70.3){
            this.categoria="Leve";
        } else if (this.peso<=83.90){
            this.categoria="Médio";
        } else if(this.peso<=120){
            this.categoria ="Pesado";
        } else{
            this.categoria="Invalido";
        }
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vitorias) {
        this.vitorias= vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    

}
