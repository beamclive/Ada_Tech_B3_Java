import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        String nome = "Bia";
        // transforma a string em maiusculo
        System.out.println(nome.toUpperCase());
        // transforma a string em minusculo
        System.out.println(nome.toLowerCase());
        // conta quantidade de caractere
        System.out.println(nome.length());

        String outroNome = "bia";
        // verifica se o conteudo das strings são iguais
        System.out.println(nome.equals(outroNome));
        // verifica se o conteudo das strings são iguais ignorando maiusculo e minusculo
        System.out.println(nome.equalsIgnoreCase(outroNome));

        // atribuindo a data atual na variavel hoje
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        // exibindo o dia da semana sem traduzir
        System.out.println(hoje.getDayOfWeek());
        // criando o local brasil para traduzir o dia da semana
        Locale brasil = new Locale("pt", "BR");
        // exibindo o dia da semana traduzido para olocal criado
        System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL,brasil));

        // atribui o dia da semana na variavel
        String diDaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL,brasil);
        String saudacao;

        // informa a hora atual e armazena na variavel agora
        LocalDateTime agora = LocalDateTime.now();

        System.out.println(agora);

        if (agora.getHour() >= 0 && agora.getHour() < 12){
            saudacao = "Bom dia!";
        } else if (agora.getHour() >= 12 && agora.getHour() < 18) {
            saudacao = "Boa tarde!";
        } else if (agora.getHour() >= 18 && agora.getHour() < 24) {
            saudacao = "Boa noite!";
        } else {
            saudacao = "Olá";
        }

        // %s representa as string e %n a quebra de linha
        System.out.printf("Olá, %s. Hoje é %s, %s.%n", nome, diDaSemana, saudacao);
    }
}



