# Proyecto-Urgencias
Pequeño proyecto para dar paso a los pacientes al servicio de urgencias. Trabajo con arrays, listas y conjuntos.


### Clase Hora
Una clase Hora que permita representar la hora (hora y minutos) en un día. Para ello, la clase incluirá dos propiedades de tipo entero (int) para representar hora y minuto, incluyendo:
a) Un constructor que cree objetos de tipo Hora, a partir de dos argumentos de tipo entero, controlando que el primero represente una hora, entre 0 y 23, y el segundo un minuto, entre 0 y 59.
b) Métodos de consulta para conocer la hora y el minuto.
c) Una noción de igualdad por la que dos objetos Hora son iguales cuando coinciden en hora y minuto.
d)Un criterio de ordenación natural, que compare primero por hora y en caso de coincidencia por minuto.
e) Un método int diferenciaMinutos(Hora hora) que devuelva la diferencia en minutos entre el objeto que recibe el mensaje y la hora que se pasa como argumento. No se tendrá en cuenta si el receptor es menor o mayor que el argumento. Es decir, el entero que se devuelve siempre será positivo.
f) Una representación textual del tipo: [hora:minuto].

### Clase Ingreso
Una clase Ingreso que almacene información sobre los datos relativos a cada paciente tratado en un servicio (por ejemplo, el de urgencias). La información a tener en cuenta es la siguiente: hora de ingreso y hora de alta (ambos de tipo Hora), identificación de la seguridad social (de tipo String), código del médico que trató la urgencia (de tipo String), grado de la urgencia (con valores: LEVE, MODERADO y GRAVE). La clase deberá incluir:
a) Un constructor que cree ingresos a partir de objetos adecuados:
Ingreso(Hora,Hora,String,String,String)
b) Métodos de consulta para cada una de las propiedades mencionadas.
c) Un criterio de igualdad que determine que dos objetos de tipo Ingreso son iguales si coinciden en hora de ingreso y número de la seguridad social.
d) Un orden natural que ordene por hora de ingreso y, en caso de igualdad, por número de la seguridad social.
e) Una representación textual del tipo: {hora de ingreso – número de la SS}

### Clase Urgencias
Una clase Urgencias que represente los ingresos en un día determinado de distintas unidades de urgencias de un mismo Centro de Salud. Esta case, debe incluir propiedades que permitan representar el día del mes (de tipo entero), el mes (de tipo entero) y una colección de ingresos. La clase Urgencias debe incluir:
a) Un constructor que cree un objeto de la clase a partir del día del mes y el mes que se pasan como argumentos, con la colección de ingresos inicialmente vacía. Debe controlarse que la fecha sea consistente (sin tener en cuenta si el año es bisiesto o no).
b) Un método void agregaServicio(Collection<Ingreso> colección) que incorpore a la colección de ingresos los ingresos que se pasan en el argumento. Esta collection puede ser un array o una List o Sort. Lo que vosotros elijáis.
c) Un método int urgenciasAtendidas() que devuelve el número de servicios realizados.
d) Un método Collection<String> pacientesPorMedico(int código_medico), que devuelve una ( lista o array o conjunto) con todos los pacientes que han sido atendidos por ese médico.
e) Un método SortedSet<Ingreso> ingresosPorTiempoDeAtencion(), que devuelve un conjunto de ingresos ordenado según el tiempo de atención (diferencia entre la hora de ingreso y la hora de salida o alta).

  

