package ejercicio1;

public class Curso {
	private int codigo;
	private String programa;
	private Asignatura asignatura;
	private Docente docente;
	private Estudiante[] listaCurso;
	/**
	 * @param codigo
	 * @param programa
	 * @param asignatura
	 * @param docente
	 */
	public Curso(int codigo, String programa, Asignatura asignatura, Docente docente, int nEstudiante) {
		super();
		this.codigo = codigo;
		this.programa = programa;
		this.asignatura = asignatura;
		this.docente = docente;
		this.listaCurso =new Estudiante[nEstudiante];
	}
	/**
	 * Método asigna un objeto (instancia) de la clase estudiante al array de estudiantes
	 * @param estudiante
	 * @return
	 */
	public boolean agregarEstudiante(Estudiante estudiante) {
		boolean salir=false;
		for (int i = 0; i < listaCurso.length; i++) {
			if(listaCurso[i] == null) {
				listaCurso[i] = estudiante;
				salir=true;
				break;
			}
		}
		return salir;
	}
	/**
	 * 
	 */
	public void notasCurso() {
		System.out.println("Lista del Curso ");
		System.out.println("Asignatura " + this.asignatura);
		System.out.println("Docente "+ this.docente);
		for (int i = 0; i < listaCurso.length; i++) {
			System.out.println(listaCurso[i]);
			
		}
	}
	/**
	 * Método para mostrar la snotas de los estduiante para el rango 4.0 a 5.0
	 */
	public void notasRango( ) {
		System.out.println("Lista del Curso ");
		System.out.println("Asignatura " + this.asignatura);
		System.out.println("Docente "+ this.docente);
		
		for (int i = 0; i < listaCurso.length; i++) {
			
			if(listaCurso[i].getNotaFinal()>=4.0 && listaCurso[i].getNotaFinal()<=5.0) {
				System.out.println(listaCurso[i].getId()+" "+listaCurso[i].getNombre()+" "+listaCurso[i].getNotaFinal());
			}
		}
		
	}
	

}
