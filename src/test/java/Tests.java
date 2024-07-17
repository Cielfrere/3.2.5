import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.BoundaryService;
import org.junit.jupiter.api.Test;

class Tests {
    BoundaryService boundaryService = new BoundaryService();


    @Test

    public void testFindMinSingleElement() {
        int[] marks = {5};
        assertEquals(5, boundaryService.findMin(marks));
    }

    @Test

    public void testFindMinGeneralCase() {
        int[] marks = {10, 5, 8, 3, 12};
        assertEquals(-4, boundaryService.findMin(marks));
    }
}