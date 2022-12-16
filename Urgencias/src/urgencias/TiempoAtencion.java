package urgencias;

import java.util.Comparator;

public class TiempoAtencion implements Comparator<IngresoP> {

	public int compare(IngresoP ing1, IngresoP ing2) {
		int i = 0;
		Integer tiempo1 = ing1.getHora_ingreso().diferenciaMinutos(ing1.getHora_alta());
		Integer tiempo2 = ing2.getHora_ingreso().diferenciaMinutos(ing2.getHora_alta());
		i = tiempo1.compareTo(tiempo2);

		return i;
	}

}