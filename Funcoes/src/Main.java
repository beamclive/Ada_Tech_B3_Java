public class Main {
    public static void main(String[] args) {

        String nome = "Bia";
        saudacao(nome);

        int resultado = soma(2,3);
        System.out.println(resultado);
    }
    
    // função de saudação
    public static void saudacao(String nomeParametro){
        System.out.println("Olá, " + nomeParametro);
    }

    // função de soma
    public  static int soma(int a, int b){
        return a + b;
    }
}