public class EmployeeBook {

    private Employee[] employees = new Employee[10];


    public void printAll() {
        for (Employee employee : employees) {
            if (employee == null) { // проверка на Null
                continue;           // проверка на Null
            }
            System.out.println(employee);
        }
    }


    public double sum() {
        double sum = 0.0;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            sum += employee.getSalary();
        }
        return sum;
    }

    // Мин зп сотрудника
    public Employee min() {
        Employee minEmployee = null;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (minEmployee == null || employee.getSalary() < minEmployee.getSalary()) {
                minEmployee = employee;
            }
        }
        return minEmployee;
    }

    // Макс зп сотрудника
    public Employee max() {
        Employee maxEmployee = null;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (maxEmployee == null || employee.getSalary() > maxEmployee.getSalary()) {
                maxEmployee = employee;
            }
        }
        return maxEmployee;
    }

    // Среднее значение зп
    public double average() {
        int count = 0;
        double sum = 0.0;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            sum += employee.getSalary();
            count++;


        }

        if (count == 0) {
            return -1;
        }

        return sum / count;
    }

    // ФИО сотрудников
    public void fullName() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }

    // Начисляем процент от зп равный 10%
    public void increaseSalaryPercentage(double percent) {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            double accrual = employee.getSalary() / 100 * percent;
            employee.setSalary(employee.getSalary() + accrual);
        }
    }

    // Сумма зп всех сотрудников в отделе
    public double sum(int department) {
        double sum = 0.0;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getDepartment() == department) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public void printAll(int department) {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getDepartment() == department) {
                System.out.println("ФИО " + employee.getFullName() + "Зарплата " + employee.getSalary());
            }
        }
    }

    public void printAllNames() {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            System.out.println(employee.getFullName());
        }
    }

    public void printAllNames(int department) {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getDepartment() == department) {
                System.out.println(employee.getFullName());
            }
        }
    }


    // Поиск сотрудника по отделу с минимальной зп
    public Employee min(int department) {
        Employee minEmployee = null;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
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

    public Employee max(int department) {
        Employee maxEmployee = null;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getDepartment() != department) {
                continue;  // Ищем нужный отдел

            }

            if (maxEmployee == null || employee.getSalary() > maxEmployee.getSalary()) {
                maxEmployee = employee; // Проверка сотрудника с макс зп
            }
        }
        return maxEmployee;
    }

    // добавление процента к зп
    public void increaseSalaryPercentage(double percent, int departmnent) {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getDepartment() != departmnent) {
                continue;
            }
            double accrual = employee.getSalary() / 100 * percent;
            employee.setSalary(employee.getSalary() + accrual);
        }
    }
    // Сотрудники с зп < 40000
    public void employeeWithSalaryLess (double salary) {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getSalary() < salary) {
                System.out.println("ФИО: " + employee.getFullName() + ", Зарплата: " + employee.getSalary() + ", ID: " + employee.getId());
            }
        }
    }

    // Сотрудники с зп > 50000
    public void employeeWithSalaryMore (double salary) {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getSalary() >= salary) {
                System.out.println("ФИО: " + employee.getFullName() + ", Зарплата: " + employee.getSalary() + ", ID: " + employee.getId());
            }
        }
    }

    public void addEmployee (Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                break;
            }
        }
    }
    // удалить сотрудника
    public void removeEmployee (String fullName) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;

            }

            if (employees[i].getFullName().equalsIgnoreCase(fullName)){
                employees[i] = null;
                break;
            }
        }
    }

    // изменить зп сотруднику
    public void changeEmployeeSalary (String fullName, double changeSalary) {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;

            }

            if (employee.getFullName().equalsIgnoreCase(fullName)) {
                employee.setSalary(changeSalary);
                break;
            }
        }
    }

    // поменять отдел сотруднику
    public void changeEmployeeDepartment (String fullName, int changeDepartment) {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;

            }

            if (employee.getFullName().equalsIgnoreCase(fullName)) {
                employee.setDepartment(changeDepartment);
                break;
            }
        }
    }
    // вывод сотрудников по отделам
    public void printEmployeesByDepartment () {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Сотрудник(и) по отделу №" +i);
            printAllNames(i);
            
        }
    }
}

