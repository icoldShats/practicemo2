import java.util.ArrayList;

public class WithoutGenerics {
    public static void main(String[] args) {
        // Создаём список без generics
        ArrayList stringList = new ArrayList();
        stringList.add("abc"); // добавляем строку
        stringList.add("def"); // добавляем ещё строку
        stringList.add(1);     // добавляем число

        // Пытаемся вывести все элементы как строки
        for (Object o : stringList) {
            try {
                String s = (String) o; // приведение типа
                System.out.println(s);
            } catch (ClassCastException e) {
                System.out.println("Ошибка приведения типа: " + o);
            }
        }
    }
}
