package md.convertit.classes.test;

import md.convertit.classes.model.Mobile;
import md.convertit.classes.model.Student;

public class ObjectsTests {
public static void main(String[] args) {
	
	/*
	 * declaram si initializam un obiect de tip student
	 */
	Student st1 = new Student();
	System.out.println("campul an studii din obiectul st1 are valoarea: " + st1.anStudii);
	//afisam la consola campul "nume" din obiecte st1
	System.out.println("campul nume din obiectl st1 are valoarea: " + st1.nume);
	//atribuim o valoare cimpului nume din obiectul st1
	st1.nume = "Ionel";
	System.out.println("dupa aribuirea valoarei, obiectul st1 are valoarea: " + st1.nume);
	st1.anStudii = 4;
	Student st4;
	st4 = st1;
	System.out.println("st4 an de studii are valoarea " + st4.anStudii);
	//st4 are aceeasi locatie ca si st1
	
	Mobile mb1 = new Mobile();
	mb1.model = "Samsung";
	System.out.println("dupa atribuirea valoarei, mb1 are valoarea: " + mb1.model);
	Mobile mb2 = new Mobile();
	mb2.model = "Nokia";
	System.out.println("modelul mb2 este: " + mb2.model);
	Mobile mb3 = new Mobile();
	mb3.model = "iPhone";
	System.out.println("model mb3 este: " + mb3.model);
	mb1 = new Mobile();
	
}
}

