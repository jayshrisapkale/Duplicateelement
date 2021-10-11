import java.util.*;
import java.util.stream.Collectors;

public class Duplicateelement {

	public static void main(String[] args) {
List<Integer> list = Arrays.asList(2,4,5,3,9,8,5,7);
Set<Integer> result = findDuplicateSetAdd(list);
result.forEach(System.out::println);
	}
	

	public static <T> Set<T> findDuplicateSetAdd(List<T> list)
	{
		Set<T> items = new HashSet<>();
		return list.stream().filter(n -> !items.add(n))
				.collect(Collectors.toSet());
	}
}
