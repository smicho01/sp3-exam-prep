package paralellexamples;

import java.util.List;
import java.util.stream.Collectors;

public class NameListToUppercase {

    public static void main(String[] args) {
        List<String> names = List.of("Anna", "Tomas", "Ricky", "Chuck");
        System.out.println("Names before uppercase: " + names);

        List<String> uppercaseNames = names.parallelStream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Names after uppercase: " + uppercaseNames);
    }
}
