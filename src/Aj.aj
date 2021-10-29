
public aspect Aj {
	
	
	pointcut evento() : call(* Pantalla.update*(..));
	
	before() : evento(){
			
		System.out.println("Se cambio color de pantalla");
		}
	}