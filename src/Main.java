//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println("Ф. И. О. сотрудника - " + fullName);

        fullName = fullName.toUpperCase();
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчёта - " + fullName);

        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Ф. И. О. сотрудника - " + fullName);


    }
}