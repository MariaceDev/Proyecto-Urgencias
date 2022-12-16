package urgencias;


	/*
	 * Defínase una clase Hora que permita representar la hora (hora y minutos) en
	 * un día. Para ello, la clase incluirá dos propiedades de tipo entero (int)
	 * para representar hora y minuto, incluyendo:
	 */

	public class HoraP implements Comparable<HoraP> {

		private int hora;
		private int minutos;
		/*
		 * a) Un constructor que cree objetos de tipo Hora, a partir de dos argumentos
		 * de tipo entero, controlando que el primero represente una hora, entre 0 y 23,
		 * y el segundo un minuto, entre 0 y 59.
		 */

		public HoraP(int hora, int minutos) {
			this.hora = ((hora >= 0 && hora <= 23) ? hora : null);
			this.minutos = ((minutos >= 0 && minutos <= 59) ? minutos : null);
		}
		// Con los operadores ? y : obtenemos una solución abreviada de if-else.

		/* b) Métodos de consulta para conocer la hora y el minuto. */

		public int getHora() {
			return hora;
		}

		public int getMinutos() {
			return minutos;
		}

		/*
		 * c) Una noción de igualdad por la que dos objetos Hora son iguales cuando
		 * coinciden en hora y minuto.
		 */

		public boolean equals(Object o) {
			boolean res = o instanceof HoraP;
			HoraP obj = res ? (HoraP) o : null;
			return res && hora == obj.hora && minutos == obj.minutos;
		}

		public int hashCode() {
			return hora + minutos;
		}

		/*
		 * d) Un criterio de ordenación natural, que compare primero por hora y en caso
		 * de coincidencia por minuto.
		 */

		public int compareTo(HoraP obj) {
			int resu = Integer.compare(hora, obj.hora);
			if (resu == 0) {
				resu = Integer.compare(minutos, obj.minutos);
			}
			return resu;
		}

		/*
		 * e) Un método int diferenciaMinutos (Hora hora) que devuelva la diferencia en
		 * minutos entre el objeto que recibe el mensaje y la hora que se pasa como
		 * argumento. No se tendrá en cuenta si el receptor es menor o mayor que el
		 * argumento.Es decir, el entero que se devuelve siempre será positivo.
		 */

		public int diferenciaMinutos(HoraP hora) {
			int a; // Atributo que recibe
			int b; // Atributo que se pasa como argumento

			a = this.getHora() * 60 + this.getMinutos();
			b = hora.hora * 60 + hora.minutos;

			return (Math.abs(a - b)); // devolvemos el valor absoluto de la diferencia de los atributos
		}

		/* f) Una representación textual del tipo: [hora:minuto]. */

		public String toString() {
			return "[" + hora + ":" + minutos + "]";
		}

}




