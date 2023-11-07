public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");

        boolean fimDeSemana = true;
        boolean fazendoSol = false;
        boolean vamosAPraia = fimDeSemana || fazendoSol;

        System.out.println(vamosAPraia);

        /* if */
        String mensagem = fimDeSemana ? "É fim de semana" : "Não é fim de semana";
        System.out.println(mensagem);
    }
}





     