package urgencias;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/*3. Defínase una clase Urgencias que represente los ingresos en un día determinado de distintas 
	 * unidades de urgencias de un mismo Centro de Salud. 
	 * Esta case, debe incluir propiedades que permitan representar el día del mes (de tipo entero), 
	 * el mes (de tipo entero) y una colección de ingresos. La clase Urgencias debe incluir:*/

public class UrgenciasP {

	private int dia;
	private int mes;
	private List<IngresoP> ingresosUrgencias;

	/*
	 * a) Un constructor que cree un objeto de la clase a partir del día del mes y
	 * el mes que se pasan como argumentos, con la colección de ingresos
	 * inicialmente vacía. Debe controlarse que la fecha sea consistente (sin tener
	 * en cuenta si el año es bisiesto o no).
	 */

	public UrgenciasP(int dia, int mes) { 
		this.dia = dia;
		this.mes = ((mes == 2 && (dia >= 0 && dia <= 28) || mes == 4 && (dia >= 0 && dia <= 30)
				|| mes == 6 && (dia >= 1 && dia <= 30) || mes == 9 && (dia >= 1 && dia <= 30)
				|| mes == 11 && (dia >= 1 && dia <= 30) || mes == 1 && (dia >= 1 && dia <= 31)
				|| mes == 3 && (dia >= 1 && dia <= 31) || mes == 5 && (dia >= 1 && dia <= 31)
				|| mes == 7 && (dia >= 1 && dia <= 31) || mes == 8 && (dia >= 1 && dia <= 31)
				|| mes == 10 && (dia >= 1 && dia <= 31) || mes == 12 && (dia >= 1 && dia <= 31)) ? mes : null);
		this.ingresosUrgencias = new ArrayList<IngresoP>();
	}

	/*
	 * b) Un método void agregaServicio(Collection<Ingreso> colección) que incorpore
	 * a la colección de ingresos los ingresos que se pasan en el argumento. Esta
	 * collection puede ser un array o una List o Sort. Lo que vosotros elijáis.
	 */

	public void agregaServicio(List<IngresoP> ingresosUrgencias) {
		this.ingresosUrgencias.addAll(ingresosUrgencias);
	}

	// c) Un método int urgenciasAtendidas() que devuelve el número de servicios
	// realizados.

	public int urgenciasAtendidas() {
		return this.ingresosUrgencias.size();
	}

	/*
	 * d) Un método Collection <String> pacientesPorMedico(int código_medico), que
	 * devuelve una ( lista o array o conjunto) con todos los pacientes que han sido
	 * atendidos por ese médico.
	 */

	public List<IngresoP> pacientesPorMedico(String codigo_medico) {
		List<IngresoP> pacientes = new ArrayList<IngresoP>();
		for (IngresoP paciente : this.ingresosUrgencias) {
			if (paciente.getCodigo_medico().equals(codigo_medico)) {
				pacientes.add(paciente);
			}
		}
		return pacientes;
	}

	
	/*
	 * SortedSet es un conjunto cuyo orden es el natural que establecimos en la
	 * clase ingreso Si queremos cambiar ese orde a otro de nuestro criterio,
	 * debemos utilizar una clase nueva implementada con un Comparator cuyo metodo
	 * compare imponga las nuevas condiciones de orden
	 */

	public SortedSet<IngresoP> ingresosPorTiempoDeAtencion() {
		Comparator<IngresoP> compTiempo = new TiempoAtencion();
		SortedSet<IngresoP> ingresos = new TreeSet<IngresoP>(compTiempo);

		ingresos.addAll(ingresosUrgencias);

		return ingresos;
	}

}
