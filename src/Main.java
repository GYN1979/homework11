public class Main {
    public static void main(String[] args) {
// Task1
        String firstName = " Ivan ";
        String middleName = " Ivanovich ";
        String lastName = " Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println(" ФИО сотрудника - " + fullName);
//Task2
        String fullName1 = fullName.toUpperCase();
        System.out.println(" Данные ФИО сотрудника - для заполнения отчета " + fullName1);
//Task3
        String fullName2 = " Иванов Семён Семёныч ";
        String fullName3 = " Иванов Семён Семёныч ".replace("ё", "е");
        System.out.println(" Данные ФИО сотрудника - " + fullName3);
}
}
