import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        String phone = "+ 906 415 75 37";
        phone = phone.replace("-", "");
        phone = phone.replace("+", "");
        phone = phone.replace(" ", "");
        if (phone.length() == 10) {
//        phone = '7' + phone;
        } else if (phone.length() > 11) {
            throw new RuntimeException("Телефон слишком длинный");
        } else if (phone.length() < 10) {
            throw new RuntimeException("Телефон слишком короткий");
        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
            throw new RuntimeException("Среди нас посторонний");
        }
        System.out.println("phone = " + phone);
        String expectedPhone = "79064157537";
        if (phone.equals(expectedPhone)) {
            System.out.println("Успех");
        } else {
            System.out.println("Неудача");
        }

        // Task 1

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName +" " + firstName + " " + middleName ;
        System.out.println("ФИО сотрудника — " + fullName);

        //Task 2

        String small = "fullName";
        System.out.println(fullName.toUpperCase());

        // Task 3
        String firstName1 = "Семён";
        String middleName1 = "Семёныч";
        String lastName1 = "Иванов";
        String fullName1 = lastName1 +" " + firstName1 + " " + middleName1 ;
        fullName1 = fullName1.replace("ё", "е");
        System.out.println("ФИО сотрудника — " + fullName1);
    }
}