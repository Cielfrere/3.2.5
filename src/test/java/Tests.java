import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.example.BoundaryService;

public class Tests {

    @ParameterizedTest(name = "{index} => marks={0}, expected={1}")
    @MethodSource("ArgumentsForFindMin")
    void testFindMin(int[] marks, int expected) {
        BoundaryService boundaryService = new BoundaryService();
        assertEquals(expected, boundaryService.findMin(marks));
    }

    static Stream<Arguments> ArgumentsForFindMin() {
        return Stream.of(
                new int[] {5},
                new int[] {3, 0, -11, 18, 6}
        ).map(marks -> Arguments.of(marks, Arrays.stream(marks).min().getAsInt()));
    }
}