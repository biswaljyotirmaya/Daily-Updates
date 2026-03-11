package string;

public class JavaStringsQuiz {
	public static void main(String[] args) {
		/*
		 * String name = "JavaConceptOfTheDay".substring(4); System.out.println(name);
		 */

		/*
		 * String s = "1".repeat(5); System.out.println(s);
		 */

		/* System.out.println("1".concat("2").repeat(5).charAt(7)); */

		/*
		 * String string = "string".replace('i', '0');
		 * System.out.println(string.substring(2, 5));
		 */

		/* System.out.println("Java" == new String("Java")); */

		/*
		 * String str = "  Java\tConcept\tOf\tThe\tDay     ".strip();
		 * System.out.println(str);
		 */

		/*
		 * if ("string".toUpperCase() == "STRING") { System.out.println(true); } else {
		 * System.out.println(false); }
		 */

		/*
		 * String str1 = "Java"; String str2 = "Java"; System.out.println(str1 == str2);
		 * System.out.println(str1.equals(str2)); System.out.println(str1.hashCode() ==
		 * str2.hashCode());
		 */

		/*
		 * String str1 = "Java"; String str2 = new String("Java");
		 * System.out.println(str1 == str2); System.out.println(str1.equals(str2));
		 * System.out.println(str1.hashCode() == str2.hashCode());
		 */

		/*
		 * String str1 = new String("Java"); String str2 = new String("Java");
		 * System.out.println(str1 == str2); System.out.println(str1.equals(str2));
		 * System.out.println(str1.hashCode() == str2.hashCode());
		 */

		/*
		 * String str1 = "Java"; String str2 = str1.intern(); System.out.println(str1 ==
		 * str2); System.out.println(str1.equals(str2));
		 * System.out.println(str1.hashCode() == str2.hashCode());
		 */

		/*
		 * String str1 = "Java"; String str2 = str1.intern(); String str3 = new
		 * String("Java"); System.out.println(str1 == str2); System.out.println(str2 ==
		 * str3); System.out.println(str3 == str1);
		 */

		/*
		 * String str1 = "1"; String str2 = "22"; String str3 = "333";
		 * System.out.println(str1.concat(str2).concat(str3).repeat(3));
		 */

		/*
		 * String s1 = "ONE"; s1.concat("TWO"); s1.concat("THREE");
		 * System.out.println(s1);
		 */

		/*
		 * String s1 = "1"; System.out.println(s1.concat("2").concat("3"));
		 */

		/* System.out.println("Java" + 1000 + 2000 + 3000); */

		/* System.out.println(1000 + 2000 + 3000 + "Java"); */

		/* System.out.println(7.7 + 3.3 + "Java" + 3.3 + 7.7); */

		/* System.out.println("ONE" + 2 + 3 + 4 + "FIVE"); */

		/* System.out.println("JAVAJ2EE".substring(2, 5).substring(1).charAt(2)); */

		/*
		 * String s1 = new String("JAVA"); String s2 = new String("JAVA");
		 * System.out.println(s1 == s2); System.out.println(s1.equals(s2));
		 * System.out.println(s1 == s2.intern()); System.out.println(s1.intern() ==
		 * s2.intern()); System.out.println(s1.intern() == s2);
		 */

		/*
		 * System.out.print("0".indent(0)); System.out.print("1".indent(1));
		 * System.out.print("2".indent(2)); System.out.print("3".indent(3));
		 * System.out.print("4".indent(4)); System.out.print("5".indent(5));
		 */

		/*
		 * int n = 5; String stars = " *".repeat(n); System.out.println((stars +
		 * "\n").repeat(n));
		 */

		/* System.out.println("Java Concept Of The Day".substring(8, 4)); */

	}
}