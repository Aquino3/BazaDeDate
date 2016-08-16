package md.convertit.classes.test;

import md.convertit.classes.model.Student;
import md.convertit.classes.utils.StringUtil;

public class UtilTests {
	public static void main(String[] args) {

		StringUtil figura = new StringUtil();
		boolean result = figura.beginsWith("Paralelipiped", "Par");
		System.out.println("rezultatul este: " + result);
		Student st1 = new Student();

		st1.nume = "Filimon";
		System.out.println("Numele studentului este: " + st1.nume);

		StringUtil fig2 = new StringUtil();
		boolean result2 = fig2.beginsWith(st1.nume, "fi");
		System.out.println("rezultatul este: " + result2);
		
		StringUtil su = new StringUtil();
		System.out.println(su.beginsWith("Paralelipiped", "Par"));
		//apelam metoda static sayHello folosind numele clasei (nu un obiect)
		su.sayHello();
		StringUtil.sayHello();

	}

}
