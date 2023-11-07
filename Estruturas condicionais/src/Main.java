public class Main {
    public static void main(String[] args) {
        int nota = 1;
        String graduacao = null;

        if (nota >= 70){
            graduacao = "A";
            System.out.println("Nota " + graduacao);
        } else if (nota < 70 && nota >= 50){
            graduacao = "C";
            System.out.println("Nota " + graduacao);
        } else if (nota < 50 && nota >= 0){
            graduacao = "E";
            System.out.println("Nota " + graduacao);
        } else {
            System.out.println("Nota inválida!");
        }

        switch (graduacao){
            case "A":
                System.out.println("Aluno aprovado!");
                break;
            case "C":
                System.out.println("Aluno em recuperação");
                break;
            case "E":
                System.out.println("Aluno reprovado");
                break;
            default:
                System.out.println("Graduação inválida");
        }




    }
}