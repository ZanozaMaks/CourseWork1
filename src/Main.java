public class Main {
    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Буряков Михаил Анатольевич", "1", 45000);
        employees[1] = new Employee("Сладков Никита Михайлович", "1", 40000);
        employees[2] = new Employee("Шестюков Антон Денисович", "5", 30000);
        employees[3] = new Employee("Байкальская Анастасия Павловна", "4", 74000);
        employees[4] = new Employee("Фоменко Антон Максимович", "5", 25000);
        employees[5] = new Employee("Ченская Галина Денисовна", "4", 88000);
        employees[6] = new Employee("Заноза Максим Юрьевич", "2", 113000);
        employees[7] = new Employee("Солохин Вадим Николаевич", "2", 67000);
        employees[8] = new Employee("Бычыхин Руслан Семёнович", "3", 29000);
        employees[9] = new Employee("Сладкова Ольга Михайловна", "3", 44000);

        printAll();
        System.out.println(sum());
        System.out.println(min());
        System.out.println(max());
        System.out.println(average());
        fullName();
    }


    // Вывод всех сотрудников
    private static void printAll() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }


    // Сумма зп всех сотрудников
    private static double sum() {
        double sum = 0.0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    // Мин зп сотрудника
    private static Employee min() {
        Employee minEmployee = null;
        for (Employee employee : employees) {
            if (minEmployee == null || employee.getSalary() < minEmployee.getSalary()) {
                minEmployee = employee;
            }
        }
        return minEmployee;
    }

    // Макс зп сотрудника
    private static Employee max() {
        Employee maxEmployee = null;
        for (Employee employee : employees) {
            if (maxEmployee == null || employee.getSalary() > maxEmployee.getSalary()) {
                maxEmployee = employee;
            }
        }
        return maxEmployee;
    }

    // Среднее значение зп
    private static double average() {
        return sum() / employees.length;
    }

    // ФИО сотрудников

    private static void fullName() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }
}