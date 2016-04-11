package ua.od.pindus;

/*Написать программу, которая получает 2 числа из командной строки как параметры,
и выводит результат. Программу нужно запаковать в jar и запустить из командной строки.
jar cf program.jar <main_class_file> - создание jar файла
java -jar <имя_файла> <параметры> - запуск программы*/

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a, b;
        a=Integer.parseInt(args[0]);
        b=Integer.parseInt(args[1]);

        System.out.println("The result of multiplication is "+ a*b);
    }
}
