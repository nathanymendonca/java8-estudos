import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {
public static void main(String[] args) {
	
	List<String> palavras = new ArrayList<>();
	palavras.add("alura online");
	palavras.add("casa do código");
	palavras.add("caelum");
	
	
	//usando o metodo reference
	palavras.sort(Comparator.comparing(String::length)); // invoca um métodos simples, já indica que pega o lenght da string
	
	// o mesmo código com lambida
	//palavras.sort(Comparator.comparing(s -> s.length()));
	
//	// o mesmo código explicado em 3 linhas
	
//	Function<String, Integer> funcao = s -> s.length();
//	Comparator<String> comparador = Comparator.comparing(funcao);
//	palavras.sort(comparador);
	
	System.out.println(palavras);
//	
//	for (String p : palavras) {
//		System.out.println(p);
//	}
	
	
	Consumer<String> impressor = System.out::println;
	palavras.forEach(impressor);
	palavras.forEach(System.out::println);	
	
    }
}



class ComparadorDeStringPorTamanho implements Comparator<String> {
    public int compare(String s1, String s2) {
        if(s1.length() < s2.length()) 
            return -1;
        if(s1.length() > s2.length()) 
            return 1;
        return 0;
    }
    
    class ConsumidorDeString implements Consumer<String> {
        public void accept(String s) {
            System.out.println(s);
        }
    }
}