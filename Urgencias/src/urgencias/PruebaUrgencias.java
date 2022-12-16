package urgencias;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class PruebaUrgencias {
	
	public static void main(String[] args) throws FileNotFoundException {
		IngresoP[] ingresos = { new IngresoP(new HoraP(9, 15), new HoraP(9, 30), "123415", "MI766", "MODERADO"),
				new IngresoP(new HoraP(9, 15), new HoraP(10, 30), "123543", "MI765", "LEVE"),
				new IngresoP(new HoraP(9, 17), new HoraP(9, 30), "123734", "TR454", "GRAVE"),
				new IngresoP(new HoraP(10, 15), new HoraP(10, 31), "123465", "TR325", "LEVE"),
				new IngresoP(new HoraP(9, 10), new HoraP(9, 20), "123261", "TR325", "LEVE") };

		UrgenciasP urg = new UrgenciasP(12, 7);
		urg.agregaServicio(Arrays.asList(ingresos));
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca el codigo del medico para buscar a los pacientes que ha atendido en urgencias ");
		String codigo = sc.next();
		System.out.println(urg.pacientesPorMedico(codigo));
		System.out.println(urg.ingresosPorTiempoDeAtencion());
		System.out.println(urg.urgenciasAtendidas());

		sc.close();
	}//fIN DEL MAIN
}//fin de la clase


