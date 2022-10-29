import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {


    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        System.out.println("Исходный массив целых чисел: " + intList.toString());

        List<Integer> positive = intList.stream()
                .filter(x -> x > 0).toList();
        System.out.println("Отфильтрованный массив целых положительных чисел: " + positive.toString());

        Stream<Integer> even = positive.stream()
                .filter(x -> x % 2 == 0)
                .sorted(Comparator.naturalOrder());
        Object[] o = even.toArray();
        System.out.println("Отсортированный массив четных положительных чисел: " + Arrays.toString(o));
    }
}
