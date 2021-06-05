import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Curso {
    private String nome;
    private int alunos;

    public Curso(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public int getAlunos() {
        return alunos;
    }
}


public class ExemploCursos{
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		cursos.sort(Comparator.comparingInt(Curso::getAlunos));
		
		
//		Stream<Curso> streamDeCurso = cursos.stream().filter(c -> c.getAlunos() > 100);
//		cursos.forEach(c -> System.out.println(c.getNome()));
//		
//		int sum = cursos.stream()
//				   .filter(c -> c.getAlunos() > 100)
//				   .mapToInt(Curso::getAlunos)
//				   .sum();
		
		 cursos.stream() 
				.filter(c -> c.getAlunos() > 100) 
				.collect(Collectors.toMap(c -> c.getNome(), c -> c.getAlunos()))
		        .forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos "));
		
//		cursos.stream()
//		      .filter(c -> c.getAlunos() > 100) 
//		      .findAny()
//		      .ifPresent(c -> System.out.println(c.getNome()));
//		      
	}
}

//Em uma �nica linha de c�digo, pegamos todos os cursos,
//filtramos os que tem mais de 100 e somamos todos os alunos.
//H� tamb�m vers�es para double e long de Streams primitivos.
//At� mesmo o Comparator.comparing possui vers�es como Comparator.comparingInt, 
//que recebe uma IntFunction e n�o necessita do boxing. Em outras palavras, 
//todas as interfaces funcionais do novo pacote java.util.functions possuem 
//vers�es desses tipos primitivos.

//Stream n�o � uma List, n�o � uma Collection. E se quisermos obter
//uma cole��o depois do processamento de um Stream? � o que veremos no pr�ximo cap�tulo.
