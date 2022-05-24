public class Main {
    static final int AGE_LIMIT = 40;
    static final int WORKER_ARRAY_SIZE = 5;

    public static void main(String[] args) {

        System.out.println("Работники: ");
        employee[] workers = new employee[WORKER_ARRAY_SIZE];
        workers[0] = new employee("Захаров Илья", "Сис администратор 2 линии", "hd@oboz.com",
                "+7(925)316-00-82", 70000, 24);
        workers[1] = new employee("Никита Румянцев", "Руководитель IT проекта",
                "nrumyansev@oboz.com", "+7(903)789-00-45", 90000, 41);
        workers[2] = new employee("Володин Леонтий", "Сис администратор 1 линии",
                "lvolodin@oboz.com", "+7(917)516-00-04", 40000, 24);
        //Кладем сразу в массив
        workers[3] = new employee("Никонов Павел", "Логист",
                "pnikonov@oboz.com", "+7(912)558-00-12", 60000, 30);
        workers[4] = new employee("Иванов Дмитрий", "Директор IT проекта",
                "divanov@oboz.com", "+7(912)558-00-13", 120000, 40);
        System.out.println();
        for (employee employee : workers) {
            if (employee.getAge() > AGE_LIMIT) {

                System.out.println("Сотрудник старше " + AGE_LIMIT + " лет: " + employee.employeeInfo());
            } else if (employee.getAge() == AGE_LIMIT){
                System.out.println("Сотруднику " + AGE_LIMIT + " лет: " + employee.employeeInfo());
            } else {
                System.out.println("Сотрудник младше " + AGE_LIMIT + " лет: " + employee.employeeInfo());
            }

    }
}
}
