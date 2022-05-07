import java.util.Random;

public class Luta {
    
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

     //Metodos publicos

    public void marcarluta(Lutador lutador1, Lutador lutador2){
        //comparando as categorias de peso
        if(lutador1.getCategoria().equals(lutador2.getCategoria())
        //Verifica se os lutadores são de sexo diferentes
        &&lutador1.getSexo().equals(lutador2.getSexo())
        //Verifica se os lutadores são lutadores diferentes
        && lutador1!=lutador2){
            this.aprovada=true;
            this.desafiado=lutador1;
            this.desafiante=lutador2;
        }else{
            this.aprovada=false;
            this.desafiado=null;
            this.desafiante=null;
        }
    }
    public void lutar(){
        if(this.aprovada){
            System.out.println("");
            System.out.println("###Desafiado###");
            this.desafiado.apresentar();
            System.out.println("");
            System.out.println("###Desafiante###");
            this.desafiante.apresentar();

            //criando o objeto
            Random aleatorio = new Random();
            //gera 3 resultas 0 / 1 ou 2
            int vencedor = aleatorio.nextInt(3);
            System.out.println("==========###Resultado da Luta:###========");
            switch (vencedor) {
                
                case 0:
                //empate 
               
                System.out.println("Empatou!!");
                this.desafiado.empatarLuta();
                this.desafiante.empatarLuta();
        
                    break;
                case 1:
                // Desafiado vence
                
                System.out.println("Vitória do "+desafiado.getNome());
                desafiado.ganharLuta();
                desafiante.perderLuta();             
                             
                    break;
                
                case 2:
                //Desafiante vence
               
                System.out.println("Vitória do "+desafiante.getNome());
                desafiado.perderLuta();
                desafiante.ganharLuta();
                    break;             
                                
                default:
              
                    break;
            }
            System.out.println("========================================");
       }else{
           System.out.println("A luta não pode acontecer!");
       }

    }

    //Metodos especiais
    public Lutador getDesafiado() {
        return desafiado;
    }
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }
    public Lutador getDesafiante() {
        return desafiante;
    }
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
    public int getRounds() {
        return rounds;
    }
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
    public boolean isAprovada() {
        return aprovada;
    }
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
