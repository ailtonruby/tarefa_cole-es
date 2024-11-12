import java.util.*;

public class SeparadorPorSexo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Character, List<String>> pessoasPorSexo = new HashMap<>();

        // Inicializar as listas para 'M' e 'F'
        pessoasPorSexo.put('M', new ArrayList<>());
        pessoasPorSexo.put('F', new ArrayList<>());

        System.out.println("Digite os nomes e sexos (ex: João-M, Maria-F). Digite 'fim' para parar.");
        String entrada;
        while (!(entrada = scanner.nextLine()).equals("fim")) {
            String[] dados = entrada.split("-");
            String nome = dados[0];
            char sexo = dados[1].charAt(0);

            pessoasPorSexo.get(sexo).add(nome);
        }

        // Imprimir os resultados
        System.out.println("\nGrupos por sexo:");
        for (Map.Entry<Character, List<String>> entry : pessoasPorSexo.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}