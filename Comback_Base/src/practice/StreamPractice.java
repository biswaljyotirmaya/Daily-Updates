package practice;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamPractice {

	public static void main(String[] args) {

		List<Employee> list = EmployeeAdder.addDetails();

		// ------------------------------------------------------------

		// 1. Filter Employees by Gender:
		// Retrieve a list of all female employees.
		// list.stream().filter(e ->
		// e.getGender().equalsIgnoreCase("female")).forEach(System.out::println);

		System.out.println("\n--------------------------------------------\n");

		// 2. Filter Employees by Age:
		// Get a list of employees older than 30 years.
		// list.stream().filter(e -> e.getAge() > 30).forEach(System.out::println);

		System.out.println("\n--------------------------------------------\n");

		// 3. Filter Employees by Salary:
		// Find employees with a salary greater than $50,000.
		// list.stream().filter(e -> e.getSalary() >
		// 50000).forEach(System.out::println);

		System.out.println("\n--------------------------------------------\n");

		// 4. Map Employee Names:
		// Create a list of employee names (Strings).
		// list.stream().map(Employee::getName).forEach(System.out::println);

		System.out.println("\n--------------------------------------------\n");

		// 5. Calculate Average Salary:
		// Calculate the average salary of all employees.
		Double averageSalary = list.stream().mapToDouble(Employee::getSalary).average().orElse(0.0);
		// System.out.println("Average Salary : " + averageSalary);

		System.out.println("\n--------------------------------------------\n");

		// 6. Find Maximum Salary:
		// Find the employee with the highest salary.
		Double maxSalary = list.stream().mapToDouble(Employee::getSalary).max().orElse(0.0);
//		System.out.println("The maximum salary among the employees is: " + maxSalary);

		System.out.println("\n--------------------------------------------\n");

		// 7. Group Employees by Gender:
		// Group employees by gender and return a map.
//		list.stream().collect(Collectors.groupingBy(Employee::getGender)).forEach((gender, genderList) -> {
//			System.out.println("gender->" + gender);
//			genderList.forEach(System.out::println);
//		});

		// 8. Count Male Employees:
		// Count the number of male employees.
		Long maleConut = list.stream().filter(e -> e.getGender().equalsIgnoreCase("male")).count();
//		System.out.println("The male employee count is: " + maleConut);

		// 9. Sum of All Salaries:
		// Calculate the total sum of salaries.
		Double totalSalary = list.stream().mapToDouble(Employee::getSalary).sum();
//		System.out.println("The total salary of all the employees is: " + totalSalary);

		// 10. Sort Employees by Name:
		// Sort employees alphabetically by name.
//		list.stream().map(Employee::getName).sorted(String.CASE_INSENSITIVE_ORDER).forEach(System.out::println);

		// 11. Sort Employees by Age:
		// Sort employees by age in ascending order.
//		list.stream().sorted(Comparator.comparingInt(Employee::getAge)).forEach(System.out::println);

		// 12. Sort Employees by Salary:
		// Sort employees by salary in descending order.
//		list.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).forEach(System.out::println);

		// 13. Find Oldest Employee:
		// Find the oldest employee.
//		list.stream().max(Comparator.comparingInt(Employee::getAge)).ifPresent(System.out::println);

		// 14. Group Employees by Age Range:
		// Group employees into age groups (20–30, 31–40, etc.).
//		list.stream().sorted(Comparator.comparingInt(Employee::getAge)).collect(Collectors.groupingBy(e -> {
//			int age = e.getAge();
//
//			if (age > 10 && age <= 20)
//				return "10 - 20";
//			else if (age > 20 && age <= 30)
//				return "20 - 30";
//			else if (age > 30 && age <= 40)
//				return "30 - 40";
//			else if (age > 40 && age <= 50)
//				return "40 - 50";
//			else
//				return "More than 50";
//		}, LinkedHashMap::new, Collectors.toList())).forEach((ageRange, employeeList) -> {
//			System.out.println("\nAge range: " + ageRange);
//			employeeList.forEach(System.out::println);
//		});
//		list.stream().collect(Collectors.groupingBy(e -> {
//			int bucket = e.getAge() / 10;
//			return (bucket * 10) + " - " + (bucket * 10 + 9);
//		}, LinkedHashMap::new, Collectors.toList())).forEach((ageRange, employeeList) -> {
//			System.out.println("\nAge range: " + ageRange);
//			employeeList.forEach(System.out::println);
//		});

		// 15. Find Employees with Specific Age:
		// Find employees who are exactly 35 years old.
//		list.stream().filter(e -> e.getAge() == 35).forEach(System.out::println);

		// 16. Calculate Salary Sum by Gender:
		// Calculate total salary per gender.
//		list.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.summingDouble(Employee::getSalary)))
//				.forEach((gender, toalSalary) -> {
//					System.out.println("Toatal salary of " + gender + " employees is: " + totalSalary);
//				});
		// 17. Find Employees with Names Starting with "E":
		// Retrieve employees whose names start with 'E'.
//		list.stream().filter(emp -> emp.getName().toUpperCase().startsWith("A")).forEach(System.out::println);

		// 18. Average Salary by Gender:
		// Calculate average salary for male and female employees.
//		list.stream()
//				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)))
//				.forEach((gender, avgSalary) -> System.out
//						.println("Average salary of " + gender + " employees is: " + avgSalary));

		// 19. Top N Highest Paid Employees:
		// Find top N highest paid employees.

//		list.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);

		// 20. Retrieve Distinct Ages:
		// Get a list of distinct employee ages.
//		list.stream().map(Employee::getAge).collect(Collectors.toSet()).forEach(System.out::println);

		// 21. Three Lowest Paid Employees:
		// Find three employees with the lowest salaries.
//		list.stream().sorted(Comparator.comparing(Employee::getSalary)).limit(3).forEach(System.out::println);

		// 22. Sort Employees by Name Length:
		// Sort employees by name length (shortest to longest).
//		list.stream().sorted((o1, o2) -> o1.getName().length() - o2.getName().length()).map(emp -> emp.getName())
//				.forEach(System.out::println);

		// 23. Group Employees by Custom Age Range:
		// Group employees into ranges like 20–29, 30–39.
//		list.stream().collect(Collectors.groupingBy(emp -> {
//			int age = emp.getAge();
//
//			if (age >= 20 && age < 30) {
//				return "20 - 29";
//			} else if (age >= 30 && age < 40) {
//				return "30 - 39";
//			} else if (age >= 40 && age < 50) {
//				return "40 - 49";
//			} else {
//				return "Not in age range";
//			}
//		}, LinkedHashMap::new, Collectors.toList())).forEach((ageGrup, empList) -> {
//			System.out.println(ageGrup);
//			empList.forEach(System.out::println);
//		});

		// 24. Average Salary of Employees ≤ 30:
//		// Calculate average salary of employees aged 30 or below.
//		Double averageSalaryBelow30 = list.stream().filter(emp -> emp.getAge() <= 30).mapToDouble(Employee::getSalary)
//				.average().orElse(0.0);
//		System.out.println("The average salary of employee having age below 30 is: " + averageSalaryBelow30);

		// 25. Male Employees with Salary > 60k:
		// Retrieve names of male employees earning more than $60,000.
//		list.stream().filter(emp -> emp.getGender().equalsIgnoreCase("male") && emp.getSalary() > 60000)
//				.forEach(System.out::println);

		// 26. Youngest Female Employee:
		// Find the youngest female employee.
//		list.stream().filter(emp -> emp.getGender().equalsIgnoreCase("female"))
//				.min(Comparator.comparingInt(Employee::getAge)).ifPresent(System.out::println);

		// 27. Reverse Employee Names:
		// Retrieve employee names in reverse order.
//		list.stream().map(emp -> new StringBuilder(emp.getName()).reverse().toString()).forEach(System.out::println);

		// 28. Highest Salary Among Female Employees:
		// Find the highest paid female employee.
//		list.stream().filter(emp -> emp.getGender().equalsIgnoreCase("female")).mapToDouble(Employee::getSalary).max()
//				.ifPresent(System.out::println);
//		list.stream().filter(emp -> emp.getGender().equalsIgnoreCase("female"))
//				.max(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::println);

		// 29. Group Employees by Age and Gender:
		// Create a nested map grouped by gender and age.

//		list.stream()
//				.collect(Collectors.groupingBy(Employee::getGender, LinkedHashMap::new, Collectors.groupingBy(emp -> {
//					int age = emp.getAge();
//					if (age >= 20 && age < 30) {
//						return "20 to 29";
//					} else if (age >= 30 && age < 40) {
//						return "30 to 39";
//					} else if (age >= 40 && age < 50) {
//						return "40 to 49";
//					} else {
//						return "Age limit exceed";
//					}
//				}, LinkedHashMap::new, Collectors.toList()))).forEach((gender, empList) -> {
//					System.out.println("\nGender: " + gender + "-> ");
//					empList.forEach((x, y) -> {
//						System.out.println(x);
//						y.forEach(System.out::println);
//					});
//				});

		// 30. Salary Sum for Names Containing "Smith":
		// Calculate total salary of employees with "Smith" in name.
//		Double salarySum = list.stream().filter(emp -> emp.getName().toLowerCase().contains("smith"))
//				.mapToDouble(Employee::getSalary).sum();
//		System.out.println("The sum of salary of employees having name \"Smith\" is " + salarySum);

		// 31. Employees Aged 30–40 with Salary 50k–70k:
		// Retrieve matching employee names.
//		list.stream().filter(
//				emp -> emp.getAge() > 30 && emp.getAge() < 40 && emp.getSalary() > 50000 && emp.getSalary() <= 70000)
//				.forEach(System.out::println);

		// 32. Total Employee Count:
		// Find total number of employees.
//		Long totalCount = list.stream().count();
//		System.out.println("The total count of employess is: " + totalCount);

		// 33. Most Common Age:
		// Find the most frequently occurring age.
//		int commonAge = list.stream().collect(Collectors.groupingBy(Employee::getAge, Collectors.counting())).entrySet()
//				.stream().max(Map.Entry.comparingByValue()).map(Entry::getKey).orElse(0);
//		System.out.println("The most common age is: " + commonAge);

		// 34. Median Salary:
		// Calculate median salary of employees.
//		double median = list.stream().map(Employee::getSalary).sorted().collect(Collectors.collectingAndThen(
//				Collectors.toList(),
//				s -> s.size() % 2 == 0 ? (s.get(s.size() / 2 - 1) + s.get(s.size() / 2)) / 2.0 : s.get(s.size() / 2)));
//
//		System.out.println("The median of all the employees salary is: " + median);

		// 35. Group Employees by Age and Count:
		// Count employees in each age group.
//		list.stream().collect(Collectors.groupingBy(Employee::getAge, Collectors.counting())).forEach((age, count) -> {
//			System.out.print("Age: " + age + " ");
//			System.out.println("Count: " + count);
//		});

//		list.stream().collect(Collectors.groupingBy(Employee::getAge)).forEach((age, empList) -> {
//			System.out.println("Age: " + age);
//			empList.forEach(System.out::println);
//			System.out.println("Total employees of the age " + age + " is: " + empList.size());
//		});

		// 36. Employee with Longest Name:
		// Find employee whose name is longest.

//		list.stream().max(Comparator.comparingInt(e -> e.getName().length())).ifPresent(System.out::println);

		// 37. Salary Sum per Age:
		// Calculate total salary for each age.
//		list.stream().collect(Collectors.groupingBy(Employee::getAge, Collectors.summingDouble(Employee::getSalary)))
//				.forEach((age, salary) -> {
//					System.out.print("Age:" + age + "-> ");
//					System.out.println(salary);
//				});

		// 38. Sort by Age then Salary:
		// Sort employees by age asc, salary desc.
//		list.stream()
//				.sorted(Comparator.comparing(Employee::getAge)
//						.thenComparing(Comparator.comparing(Employee::getSalary).reversed()))
//				.forEach(System.out::println);

		// 39. Names with Multiple Words:
		// Find employees whose names have more than one word.
//		list.stream().filter(emp -> emp.getName().split("\\s+").length > 1).forEach(System.out::println);

		// 40. Two Highest Paid Female Employees:
		// Find top 2 highest paid female employees.
//		list.stream().filter(emp -> emp.getGender().equalsIgnoreCase("female"))
//				.sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(2).forEach(System.out::println);

		// 41. Highest Salary per Gender:
		// Find highest paid employee per gender.
//		list.stream().collect(
//				Collectors.groupingBy(Employee::getGender, Collectors.maxBy(Comparator.comparing(Employee::getSalary))))
//				.forEach((gender, l) -> {
//					System.out.println("\nThe maximum salary from " + gender + " is: ");
//					System.out.println(l);
//				});

		// 42. Unique Employee Names:
		// Retrieve employees with unique names.
//		list.stream().map(Employee::getName).distinct().forEach(System.out::println);

		// 43. Names in Uppercase:
		// Find employees whose names are fully uppercase.
//		list.stream().filter(emp -> emp.getName().equals(emp.getName().toUpperCase())).forEach(System.out::println);

		// 44. Salary Range per Age:
		// Find min & max salary per age group.
//		Map<Integer, DoubleSummaryStatistics> collect = list.stream()
//				.collect(Collectors.groupingBy(Employee::getAge, Collectors.summarizingDouble(Employee::getSalary)));
//		collect.forEach((x, y) -> {
//			System.out.println(x + " max " + y.getMax() + " min " + y.getMin() + " " + y.getSum());
//		});
//		System.out.println((collect));

		// list.stream().collect(Collectors.groupingBy(Employee::getAge,Collectors.toMap(x->Collectors.maxBy(x->x.getSalary()),x->Collectors.minBy(x->x.getSalary()))));

		// 45. Filter by First Name Initial:
		// Retrieve employees whose names start with a specific letter.
//		list.stream().filter(emp -> emp.getName().startsWith("A")).forEach(System.out::println);

		// 46. Unique Salaries per Age:
		// Group employees by age with unique salaries.
//		list.stream().collect(
//				Collectors.groupingBy(Employee::getAge, Collectors.mapping(Employee::getSalary, Collectors.toSet())))
//				.forEach((emp, emps) -> {
//					System.out.println(emp + "-> ");
//					emps.forEach(System.out::println);
//				});

		// 47. Employees with Same Salary:
		// Identify employees sharing the same salary.
//		List<Employee> collect = list.stream().collect(Collectors.groupingBy(Employee::getSalary)).entrySet().stream()
//				.filter(e -> e.getValue().size() > 1).flatMap(e -> e.getValue().stream()).collect(Collectors.toList());
//
//		if (collect.isEmpty()) {
//			System.out.println("Tehre is no employees with same salaries.");
//		} else {
//			collect.forEach(System.out::println);
//		}
		// 48. Shortest Name Among Males:
		// Find male employee with shortest name.
//		String sortestName = list.stream().map(Employee::getName).min(Comparator.comparing(e -> e.toString().length()))
//				.orElse("Nothing");
//		System.out.println(sortestName);

		// 49. Most Common Salary:
		// Find salary occurring most frequently.

//		Optional<Map.Entry<Double, List<Employee>>> maxGroup = list.stream()
//				.collect(Collectors.groupingBy(Employee::getSalary)).entrySet().stream()
//				.max(Comparator.comparing(e -> e.getValue().size()));
//
//		maxGroup.ifPresent(entry -> {
//			System.out.println("Salary: " + entry.getKey());
//			entry.getValue().forEach(System.out::println);
//		});

		// 50. Oldest Employee with Lowest Salary:
		// Find the oldest employee having the lowest salary.
//		Employee employee = list.stream()
//				.min(Comparator.comparingInt(Employee::getAge).reversed().thenComparingDouble(Employee::getSalary))
//				.orElseThrow();
//
//		System.out.println("Oldest Employee with Lowest Salary is: " + employee);
		// ------------------------------------------------------------

		// 51. Filter Employees by Gender:
		// Retrieve a list of all female employees.
//		list.stream().filter(emp -> emp.getGender().equalsIgnoreCase("female")).forEach(System.out::println);

		// ------------------------------------------------------------

		// 52. Filter Employees by Age:
		// Get a list of employees older than 30 years.
//		list.stream().filter(emp -> emp.getAge() > 30).forEach(System.out::println);
		// ------------------------------------------------------------

		// 53. Filter Employees by Salary:
		// Find employees with a salary greater than $50,000.
//		list.stream().filter(emp -> emp.getSalary() > 50_000).forEach(System.out::println);
		// ------------------------------------------------------------

		// 54. Map Employee Names:
		// Create a list of employee names (Strings).
//		list.stream().map(Employee::getName).collect(Collectors.toList()).forEach(System.out::println);
		// ------------------------------------------------------------

		// 55. Calculate Average Salary:
		// Calculate the average salary of all employees.
//		OptionalDouble average = list.stream().mapToDouble(Employee::getSalary).average();
//		System.out.println("The average of all the employees are: " + average.getAsDouble());
		// ------------------------------------------------------------

		// 56. Find Maximum Salary:
		// Find the employee with the highest salary.
//		double maxSal = list.stream().mapToDouble(Employee::getSalary).max().getAsDouble();
//		System.out.println("The maximum salary from all the employees is: " + maxSal);
		// ------------------------------------------------------------

		// 57. Group Employees by Gender:
		// Group employees by gender and return a map
		// with gender as the key and list of employees as the value.
//		list.stream().collect(Collectors.groupingBy(Employee::getGender)).forEach((gender, emplist) -> {
//			System.out.println("\n" + gender + "-> ");
//			emplist.forEach(System.out::println);
//		});
		// ------------------------------------------------------------

		// 58. Count Male and Female Employees:
		// Count the number of male and female employees separately.
//		list.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()))
//				.forEach((gender, count) -> {
//					System.out.println("Thre are " + count + " " + gender + " employees.");
//				});

		// ------------------------------------------------------------

		// 59. Sum of All Salaries:
		// Calculate the total sum of salaries for all employees.
//		System.out.println(
//				"The total salary of all the empployees is: " + list.stream().mapToDouble(Employee::getSalary).sum());

		// ------------------------------------------------------------

		// 60. Sort Employees by Name:
		// Sort the employees by their names in alphabetical order.
//		list.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);

		// ------------------------------------------------------------

		// 61. Highest Salary per Gender:
		// Find the employee with the highest salary for each gender.
//		list.stream().collect(
//				Collectors.groupingBy(Employee::getGender, Collectors.maxBy(Comparator.comparing(Employee::getSalary))))
//				.forEach((gender, maxSal) -> {
//					System.out.println(gender);
//					System.out.println(maxSal.get());
//				});

		// ------------------------------------------------------------

		// 62. Retrieve Employees with Unique Names:
		// Find employees whose names are unique (no duplicates).
//		list.stream().collect(Collectors.groupingBy(Employee::getName)).values().stream()
//				.filter(group -> group.size() == 1).flatMap(List::stream).forEach(System.out::println);

		// ------------------------------------------------------------

		// 63. Names in Uppercase:
		// Retrieve employees whose names are entirely in uppercase.
//		list.stream().filter(emp -> emp.getName().toUpperCase().equals(emp.getName())).forEach(System.out::println);
		// ------------------------------------------------------------

		// 64. Salary Range per Age Group:
		// Calculate min and max salary for each age group.
//		list.stream().collect(Collectors.groupingBy(emp -> {
//			int age = emp.getAge();
//			if (age <= 20)
//				return "Below 20";
//			return (age / 10) * 10 + "-" + ((age / 10) * 10 + 9);
//		}, Collectors.summarizingDouble(Employee::getSalary))).forEach((group, stats) -> {
//			System.out.println(group);
//			System.out.println("Min salary: " + stats.getMin() + ", Max salary: " + stats.getMax());
//		});

		// ------------------------------------------------------------

		// 65. Filter by First Name Initial:
		// Retrieve employees whose names start with a specific letter.
//		list.stream().filter(e -> e.getName().startsWith("A")).forEach(System.out::println);
		// ------------------------------------------------------------

		// 66. Unique Salaries per Age:
		// Group employees by age and list only unique salaries.
//		list.stream().collect(Collectors.groupingBy(emp -> {
//			int age = emp.getAge();
//			if (age <= 20)
//				return "Below 20";
//			return (age / 10) * 10 + " - " + ((age / 10) * 10 + 9);
//		}, Collectors.mapping(Employee::getSalary, Collectors.toSet()))).forEach((ageGroup, salaries) -> {
//			System.out.println(ageGroup);
//			System.out.println(salaries);
//		});
		// ------------------------------------------------------------

		// 67. Employees with Same Salary:
		// Identify employees who share the same salary.
//		list.stream().collect(Collectors.groupingBy(Employee::getSalary)).forEach((salary, emps) -> {
//			System.out.println("Salary: " + salary + "->");
//			emps.forEach(System.out::println);
//		});

		// ------------------------------------------------------------

		// 68. Shortest Name Among Male Employees:
		// Find the male employee with the shortest name.
//		list.stream().filter(emp -> emp.getGender().equalsIgnoreCase("male"))
//				.min(Comparator.comparing(emp -> emp.getName().length())).ifPresent(System.out::println);
		// ------------------------------------------------------------

		// 69. Most Common Salary:
		// Determine the salary value that appears most frequently.
//		list.stream().collect(Collectors.groupingBy(Employee::getSalary, Collectors.counting())).entrySet().stream()
//				.max(Map.Entry.comparingByValue()).ifPresent(entry -> System.out.println("The most common salay is: "
//						+ entry.getKey() + " and it is shared by, " + entry.getValue() + " person"));

		// ------------------------------------------------------------

		// 70. Oldest Employee with Lowest Salary:
		// Find the oldest employee having the lowest salary.
//		list.stream()
//				.max(Comparator.comparing(Employee::getAge)
//						.thenComparing(Comparator.comparing(Employee::getSalary).reversed()))
//				.ifPresent(System.out::println);
		// ------------------------------------------------------------

		// 71. Most Common Age:
		// Determine the age that occurs most frequently.
//		list.stream().collect(Collectors.groupingBy(Employee::getSalary, Collectors.counting())).entrySet().stream()
//				.max(Map.Entry.comparingByValue()).ifPresent(System.out::println);
		// ------------------------------------------------------------

		// 72. Employee with Longest Name:
		// Find the employee whose name has the maximum length.
		list.stream().max((o1, o2) -> o1.getName().length() - o2.getName().length()).ifPresent(System.out::println);
		// ------------------------------------------------------------

		// 73. Palindromic Employee Names:
		// Retrieve employees whose names are palindromes.

		// ------------------------------------------------------------

		// 74. Sum of Salaries for Odd-Aged Employees:
		// Calculate total salary of employees whose age is odd.

		// ------------------------------------------------------------

		// 75. Highest Paid Employee with Name Containing "Smith":
		// Find the highest salary employee whose name contains "Smith".

		// ------------------------------------------------------------

		// 76. Group Employees by First Letter of Name:
		// Group employees by the first character of their names.

		// ------------------------------------------------------------

		// 77. Employee with Shortest Name:
		// Find the employee whose name length is minimum.

		// ------------------------------------------------------------

		// 78. Average Salary of Names Starting with "E":
		// Calculate average salary of employees whose names start with 'E'.

		// ------------------------------------------------------------

		// 79. Filter Employees by Custom Age Range:
		// Retrieve employees whose age lies between 25 and 35.

		// ------------------------------------------------------------

		// 80. Group Employees by First Two Letters of Name:
		// Group employees using the first two characters of names.

		// ------------------------------------------------------------

		// 81. Longest Name with Salary Below $70,000:
		// Find employee with longest name and salary below 70k.

		// ------------------------------------------------------------

		// 82. Average Salary of Names Ending with "son":
		// Calculate average salary of employees whose names end with "son".

		// ------------------------------------------------------------

		// 83. Group Employees by Word Count in Name:
		// Group employees based on number of words in their names.

		// ------------------------------------------------------------

		// 84. Average Salary of Names Containing Both 'A' and 'E':
		// Calculate average salary of employees whose names contain both A and E.

		// ------------------------------------------------------------

	}
}
