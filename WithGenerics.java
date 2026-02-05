import java.util.ArrayList;

public class WithGenerics {
    public static void main(String[] args) {
        // Создаём список только для строк
        ArrayList<String> stringList = new ArrayList<String>();
        stringList.add("abc"); // добавляем строку
        stringList.add("def"); // добавляем ещё строку
        // stringList.add(1);  // ❌ Ошибка компиляции!

        // Выводим все элементы
        for (String s : stringList) {
            System.out.println(s);
        }
    }
}
