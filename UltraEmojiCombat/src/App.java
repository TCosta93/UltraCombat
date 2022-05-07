public class App {

    public static void main(String[] args) throws Exception {
       

        Lutador lutador[]= new Lutador[8];
        lutador[0] = new Lutador("Kevin Holland","França","M",31,11,2,1,1.75f,68.9f);
        lutador[1] = new Lutador("Valentina Shevchenko","Brasil","F",29,14,2,3,1.68f,57.8f);
        lutador[2] = new Lutador("Charles do Bronx","EUA","M",35,12,2,1,1.65f,81.6f);
        lutador[3] = new Lutador("Israel Adesanya","Australia","M",28,13,0,2,1.93f,81.9f);
        lutador[4] = new Lutador("Glover Teixeira","Brasil","M",37,15,4,2,1.75f,119.3f);
        lutador[5] = new Lutador("Brandon Moreno","EUA","M",30,12,4,3,1.75f,105.7f);        
        lutador[6] = new Lutador("Jessica Andrade","Brasil","F",27,13,4,2,1.70f,60.0f);
        lutador[7] = new Lutador("Angela Lee","EUA","F",30,10,4,3,1.75f,63.0f);        
       
        Luta UEC01 = new Luta();
        UEC01.marcarluta(lutador[1], lutador[7]);
        UEC01.lutar();
    }
     

}

