package urgencias;

/*Defínase una clase Ingreso que almacene información sobre los datos relativos a cada paciente tratado en un servicio (por ejemplo, el de urgencias). 
 * La información a tener en cuenta es la siguiente: hora de ingreso y hora de alta (ambos de tipo Hora), identificación de la seguridad social 
 * (de tipo String), código del médico que trató la urgencia (de tipo String), grado de la urgencia (con valores: LEVE, MODERADO y GRAVE). La clase deberá incluir:*/

public class IngresoP implements Comparable<IngresoP> {

	private HoraP hora_ingreso;
	private HoraP hora_alta;
	private String ss;
	private String codigo_medico;
	private String grado_urgencia;

	/*
	 * a) Un constructor que cree ingresos a partir de objetos adecuados:
	 * Ingreso(Hora,Hora,String,String,String)
	 */

	public IngresoP(HoraP hora_ingreso, HoraP hora_alta, String ss, String codigo_medico, String grado_urgencia) {
		this.hora_ingreso = hora_ingreso;
		this.hora_alta = hora_alta;
		this.ss = ss;
		this.codigo_medico = codigo_medico;
		this.grado_urgencia = grado_urgencia;
	}
	// b) Métodos de consulta para cada una de las propiedades mencionadas.*/

	public HoraP getHora_ingreso() {
		return hora_ingreso;
	}

	public HoraP getHora_alta() {
		return hora_alta;
	}

	public String getSs() {
		return ss;
	}

	public String getCodigo_medico() {
		return codigo_medico;
	}

	public String getGrado_urgencia() {
		return grado_urgencia;
	}

	// c) Un criterio de igualdad que determine que dos objetos de tipo Ingreso son
	// iguales si coinciden en hora de ingreso y número de la seguridad social.

	public boolean equals(Object o) {
		boolean res = o instanceof IngresoP;
		IngresoP obj = res ? (IngresoP) o : null;
		return res && hora_ingreso.equals(obj.hora_ingreso) && ss.equals(obj.ss);
	}

	public int hashCode() {
		return hora_ingreso.hashCode() + ss.hashCode();
	}

	// d) Un orden natural que ordene por hora de ingreso y, en caso de igualdad,
	// por número de la seguridad social.

	public int compareTo(IngresoP o) {
		int resu = hora_ingreso.compareTo(o.getHora_ingreso());
		if (resu == 0) {
			resu = ss.compareTo(o.ss);
		}
		return resu;
	}

	// e) Una representación textual del tipo: {hora de ingreso – número de la SS}

	public String toString() {
		return "{" + hora_ingreso + " - " + ss + "}";
	}

}
