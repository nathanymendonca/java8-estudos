import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class Datas {
	
	public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate olimpiadasRio = LocalDate.of(2016, Month.JUNE, 5);
        
        int anos = olimpiadasRio.getYear() - hoje.getYear();
        System.out.println(anos);
        
        Period periodo = Period.between(hoje, olimpiadasRio);

        LocalDate proximasOlimpiadas = olimpiadasRio.plusYears(4);
        System.out.println(proximasOlimpiadas);
        
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        String valorFormatado = proximasOlimpiadas.format(formatador);
        System.out.println(valorFormatado);
        
        
        DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora.format(formatadorComHoras));
        
        YearMonth anoEMes = YearMonth.of(2015, Month.JANUARY);
        
        LocalTime intervalo = LocalTime.of(12, 30);
        System.out.println(intervalo);
       
       
        
 //        System.out.println(periodo.getYears());
//        System.out.println(periodo.getMonths());
//        System.out.println(periodo.getDays());
    }

}
