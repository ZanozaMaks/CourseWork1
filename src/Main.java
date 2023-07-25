public class Main {
    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Буряков Михаил Анатольевич", 1, 45000);
        employees[1] = new Employee("Сладков Никита Михайлович", 1, 40000);
        employees[2] = new Employee("Шестюков Антон Денисович", 5, 30000);
        employees[3] = new Employee("Байкальская Анастасия Павловна", 4, 74000);
        employees[4] = new Employee("Фоменко Антон Максимович", 5, 25000);
        employees[5] = new Employee("Ченская Галина Денисовна", 4, 88000);
        employees[6] = new Employee("Заноза Максим Юрьевич", 2, 113000);
        employees[7] = new Employee("Солохин Вадим Николаевич", 2, 67000);
        employees[8] = new Employee("Бычыхин Руслан Семёнович", 3, 29000);
        employees[9] = new Employee("Сладкова Ольга Михайловна", 3, 44000);

//        printAll();
//        System.out.println(sum());
//        System.out.println(min());
//        System.out.println(max());
//        System.out.println(average());
//        fullName();

        increaseSalaryPercentage(10);
        printAll();
        System.out.println(sum(1));
        System.out.println(min(3));
        System.out.println(max(3));
        System.out.println(average(3));
        employeeWithSalaryLess(40_000);
        System.out.println();
        employeeWithSalaryMore(50_000);
        System.out.println();



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

    // Начисляем процент от зп равный 10%
    private static void increaseSalaryPercentage(double percent) {
        for (Employee employee : employees) {
            double accrual = employee.getSalary() / 100 * percent;
            employee.setSalary(employee.getSalary() + accrual);
        }
    }

    // Сумма зп всех сотрудников в отделе
    private static double sum(int department) {
        double sum = 0.0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    private static void printAll(int department) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                System.out.println("ФИО " + employee.getFullName() + "Зарплата " + employee.getSalary());
            }
        }
    }


    // Поиск сотрудника по отделу с минимальной зп
    private static Employee min(int department) {
        Employee minEmployee = null;
        for (Employee employee : employees) {
            if (employee.getDepartment() != department) {
                continue;  // Ищем нужный отдел
            }

            if (minEmployee == null || employee.getSalary() < minEmployee.getSalary()) {
                minEmployee = employee; // Проверка сотрудника с мин зп
            }
        }
        return minEmployee;
    }

    // Поиск сотрудника по отделу с максимальной зп

    private static Employee max(int department) {
        Employee maxEmployee = null;
        for (Employee employee : employees) {
            if (employee.getDepartment() != department) {
                continue;  // Ищем нужный отдел

            }

            if (maxEmployee == null || employee.getSalary() > maxEmployee.getSalary()) {
                maxEmployee = employee; // Проверка сотрудника с макс зп
            }
        }
        return maxEmployee;
    }

    private static double average(int department) {
        int count = 0;
        double sum = 0.0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                sum += employee.getSalary();
                count++;

            }
            if (count == 0) {
                return 0;
            }
        }
        return sum / count;
    }

    private static void increaseSalaryPercentage(double percent, int departmnent) {
        for (Employee employee : employees) {
            if (employee.getDepartment() != departmnent) {
                continue;
            }
            double accrual = employee.getSalary() / 100 * percent;
            employee.setSalary(employee.getSalary() + accrual);
        }
    }
    // Сотрудники с зп < 40000
    private static void employeeWithSalaryLess (double salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() < salary) {
                System.out.println("ФИО: " + employee.getFullName() + ", Зарплата: " + employee.getSalary() + ", ID: " + employee.getId());
            }
        }
    }

    // Сотрудники с зп > 50000
    private static void employeeWithSalaryMore (double salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() >= salary) {
                System.out.println("ФИО: " + employee.getFullName() + ", Зарплата: " + employee.getSalary() + ", ID: " + employee.getId());
            }
        }
    }
}


