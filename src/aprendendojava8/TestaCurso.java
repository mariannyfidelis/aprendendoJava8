package aprendendojava8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestaCurso {

    public static void main(String[] args) {

        List<Curso> lista = new ArrayList<>();

        lista.add(new Curso("Python", 55));
        lista.add(new Curso("Javascript", 150));
        lista.add(new Curso("Java8", 113));
        lista.add(new Curso("C", 55));

        lista.sort(Comparator.comparing(c -> c.getAlunos()));

        lista.forEach(curso -> System.err.println("\n [ Curso - " + curso.getNome() + " qtd alunos --> " + curso.getAlunos() + " ]"));

        lista.stream().filter(c -> c.getAlunos() > 50).forEach(curso -> System.err.println("\n [ Curso - " + curso.getNome() + " ]"));

        lista.stream().filter(c -> c.getAlunos() > 50).map(c -> c.getNome());

        lista.stream().filter(c -> c.getAlunos() > 50).findFirst();

        lista.stream().mapToInt(c -> c.getAlunos()).average();

        List<Curso> l = lista.stream().collect(Collectors.toList());
    }

}
