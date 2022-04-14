
import java.util.ArrayList;

/**
 * @author Steven Dao
 * @version 1.0
 *
 * Date: October 5, 2021
 * Purpose: To test the results received from the StudentSolver class.
 */
public class Main {

    /**
     * Tests the StudentSolver function using the provided test cases.
     * To add additional test cases, add to the provided containers as necessary.
     *
     * @param args the command-line arguments of the application
     */
    public static void main(String[] args) {

        int numOfTests = 0;
        int numOfTestsPassed = 0;
        ArrayList<ArrayList<Pair<Integer, Integer>>> inputLists = new ArrayList<>();
        ArrayList<ArrayList<ArrayList<Pair<Integer, Integer>>>> expectedLists = new ArrayList<>();


        // test case 1 -------------------------------------------------------------------------------------------------
        ++numOfTests;
        inputLists.add(new ArrayList<>() {
            {
                add(new Pair<>(1, 2));
                add(new Pair<>(2, 1));
                add(new Pair<>(2, 4));
                add(new Pair<>(4, 2));
            }
        });
        expectedLists.add(new ArrayList<>() {
            {
                add(new ArrayList<>() {{  add(new Pair<>(2, 1));  add(new Pair<>(1, 2));  add(new Pair<>(4, 2));  add(new Pair<>(2, 4));  }});
                add(new ArrayList<>() {{  add(new Pair<>(1, 2));  add(new Pair<>(2, 1));  add(new Pair<>(2, 4));  add(new Pair<>(4, 2));  }});
            }
        });

        // test case 2 -------------------------------------------------------------------------------------------------
        ++numOfTests;
        inputLists.add(new ArrayList<>() {
            {
                add(new Pair<>(1, 4));
                add(new Pair<>(2, 3));
                add(new Pair<>(1, 3));
                add(new Pair<>(5, 2));
                add(new Pair<>(3, 2));
            }
        });
        expectedLists.add(new ArrayList<>() {
            {
                add(new ArrayList<>() {{  add(new Pair<>(3, 2));  add(new Pair<>(5, 2));  add(new Pair<>(1, 3));  add(new Pair<>(2, 3));  add(new Pair<>(1, 4));  }});
                add(new ArrayList<>() {{  add(new Pair<>(1, 3));  add(new Pair<>(1, 4));  add(new Pair<>(2, 3));  add(new Pair<>(3, 2));  add(new Pair<>(5, 2));  }});
                add(new ArrayList<>() {{  add(new Pair<>(1, 3));  add(new Pair<>(3, 2));  add(new Pair<>(2, 3));  add(new Pair<>(1, 4));  add(new Pair<>(5, 2));  }});
                add(new ArrayList<>() {{  add(new Pair<>(3, 2));  add(new Pair<>(1, 3));  add(new Pair<>(2, 3));  add(new Pair<>(5, 2));  add(new Pair<>(1, 4));  }});
                add(new ArrayList<>() {{  add(new Pair<>(3, 2));  add(new Pair<>(1, 3));  add(new Pair<>(5, 2));  add(new Pair<>(2, 3));  add(new Pair<>(1, 4));  }});
            }
        });

        // test case 3 -------------------------------------------------------------------------------------------------
        ++numOfTests;
        inputLists.add(new ArrayList<>() {
            {
                add(new Pair<>(4, 2));
                add(new Pair<>(10, 4));
                add(new Pair<>(8, 1));
                add(new Pair<>(1, 1));
                add(new Pair<>(9, 10));
                add(new Pair<>(10, 9));
                add(new Pair<>(3, 2));
                add(new Pair<>(3, 9));
                add(new Pair<>(3, 10));
                add(new Pair<>(4, 5));
            }
        });
        expectedLists.add(new ArrayList<>() {
            {
                {
                    add(new ArrayList<>() {{  add(new Pair<>(1, 1));  add(new Pair<>(3, 2));  add(new Pair<>(3, 9));  add(new Pair<>(3, 10));  add(new Pair<>(4, 2));  add(new Pair<>(4, 5));  add(new Pair<>(8, 1));  add(new Pair<>(9, 10));  add(new Pair<>(10, 4));  add(new Pair<>(10, 9));  }});
                    add(new ArrayList<>() {{  add(new Pair<>(1, 1));  add(new Pair<>(3, 2));  add(new Pair<>(4, 2));  add(new Pair<>(8, 1));  add(new Pair<>(4, 5));  add(new Pair<>(10, 4));  add(new Pair<>(3, 9));  add(new Pair<>(3, 10));  add(new Pair<>(10, 9));  add(new Pair<>(9, 10));  }});
                    add(new ArrayList<>() {{  add(new Pair<>(1, 1));  add(new Pair<>(3, 2));  add(new Pair<>(8, 1));  add(new Pair<>(4, 2));  add(new Pair<>(4, 5));  add(new Pair<>(10, 4));  add(new Pair<>(3, 9));  add(new Pair<>(3, 10));  add(new Pair<>(10, 9));  add(new Pair<>(9, 10));  }});
                    add(new ArrayList<>() {{  add(new Pair<>(1, 1));  add(new Pair<>(8, 1));  add(new Pair<>(3, 2));  add(new Pair<>(4, 2));  add(new Pair<>(4, 5));  add(new Pair<>(10, 4));  add(new Pair<>(3, 9));  add(new Pair<>(3, 10));  add(new Pair<>(10, 9));  add(new Pair<>(9, 10));  }});
                    add(new ArrayList<>() {{  add(new Pair<>(1, 1));  add(new Pair<>(8, 1));  add(new Pair<>(3, 2));  add(new Pair<>(4, 2));  add(new Pair<>(10, 4));  add(new Pair<>(4, 5));  add(new Pair<>(3, 9));  add(new Pair<>(3, 10));  add(new Pair<>(10, 9));  add(new Pair<>(9, 10));  }});
                    add(new ArrayList<>() {{  add(new Pair<>(1, 1));  add(new Pair<>(8, 1));  add(new Pair<>(3, 2));  add(new Pair<>(4, 2));  add(new Pair<>(10, 4));  add(new Pair<>(4, 5));  add(new Pair<>(3, 9));  add(new Pair<>(10, 9));  add(new Pair<>(3, 10));  add(new Pair<>(9, 10));  }});
                    add(new ArrayList<>() {{  add(new Pair<>(1, 1));  add(new Pair<>(3, 2));  add(new Pair<>(4, 2));  add(new Pair<>(4, 5));  add(new Pair<>(3, 9));  add(new Pair<>(3, 10));  add(new Pair<>(8, 1));  add(new Pair<>(10, 4));  add(new Pair<>(9, 10));  add(new Pair<>(10, 9));  }});
                    add(new ArrayList<>() {{  add(new Pair<>(1, 1));  add(new Pair<>(3, 2));  add(new Pair<>(4, 2));  add(new Pair<>(4, 5));  add(new Pair<>(8, 1));  add(new Pair<>(3, 9));  add(new Pair<>(3, 10));  add(new Pair<>(10, 4));  add(new Pair<>(9, 10));  add(new Pair<>(10, 9));  }});
                    add(new ArrayList<>() {{  add(new Pair<>(1, 1));  add(new Pair<>(3, 2));  add(new Pair<>(4, 2));  add(new Pair<>(8, 1));  add(new Pair<>(4, 5));  add(new Pair<>(3, 9));  add(new Pair<>(10, 4));  add(new Pair<>(3, 10));  add(new Pair<>(10, 9));  add(new Pair<>(9, 10));  }});
                    add(new ArrayList<>() {{  add(new Pair<>(1, 1));  add(new Pair<>(3, 2));  add(new Pair<>(4, 2));  add(new Pair<>(3, 9));  add(new Pair<>(4, 5));  add(new Pair<>(3, 10));  add(new Pair<>(8, 1));  add(new Pair<>(10, 4));  add(new Pair<>(9, 10));  add(new Pair<>(10, 9));  }});
                    add(new ArrayList<>() {{  add(new Pair<>(1, 1));  add(new Pair<>(3, 2));  add(new Pair<>(4, 2));  add(new Pair<>(4, 5));  add(new Pair<>(3, 9));  add(new Pair<>(8, 1));  add(new Pair<>(3, 10));  add(new Pair<>(10, 4));  add(new Pair<>(9, 10));  add(new Pair<>(10, 9));  }});
                    add(new ArrayList<>() {{  add(new Pair<>(1, 1));  add(new Pair<>(3, 2));  add(new Pair<>(4, 2));  add(new Pair<>(3, 9));  add(new Pair<>(3, 10));  add(new Pair<>(4, 5));  add(new Pair<>(8, 1));  add(new Pair<>(10, 4));  add(new Pair<>(9, 10));  add(new Pair<>(10, 9));  }});
                    add(new ArrayList<>() {{  add(new Pair<>(1, 1));  add(new Pair<>(3, 2));  add(new Pair<>(4, 2));  add(new Pair<>(8, 1));  add(new Pair<>(4, 5));  add(new Pair<>(3, 9));  add(new Pair<>(3, 10));  add(new Pair<>(10, 4));  add(new Pair<>(10, 9));  add(new Pair<>(9, 10));  }});
                    add(new ArrayList<>() {{  add(new Pair<>(1, 1));  add(new Pair<>(3, 2));  add(new Pair<>(4, 2));  add(new Pair<>(3, 9));  add(new Pair<>(3, 10));  add(new Pair<>(4, 5));  add(new Pair<>(8, 1));  add(new Pair<>(9, 10));  add(new Pair<>(10, 4));  add(new Pair<>(10, 9));  }});
                    add(new ArrayList<>() {{  add(new Pair<>(1, 1));  add(new Pair<>(3, 2));  add(new Pair<>(3, 9));  add(new Pair<>(4, 2));  add(new Pair<>(3, 10));  add(new Pair<>(4, 5));  add(new Pair<>(8, 1));  add(new Pair<>(9, 10));  add(new Pair<>(10, 4));  add(new Pair<>(10, 9));  }});
                }
            }
        });

        // test case 4 -------------------------------------------------------------------------------------------------
        ++numOfTests;
        inputLists.add(new ArrayList<>() {
            {
                add(new Pair<>(9, 13));
                add(new Pair<>(10, 1));
                add(new Pair<>(8, 3));
                add(new Pair<>(11, 2));
                add(new Pair<>(2, 5));
                add(new Pair<>(10, 5));
                add(new Pair<>(2, 15));
                add(new Pair<>(15, 1));
                add(new Pair<>(4, 3));
                add(new Pair<>(12, 8));
                add(new Pair<>(6, 8));
                add(new Pair<>(1, 14));
                add(new Pair<>(9, 14));
                add(new Pair<>(5, 11));
                add(new Pair<>(7, 5));
            }
        });
        expectedLists.add(new ArrayList<>() {
            {
                add(new ArrayList<>() {{  add(new Pair<>(1, 14));  add(new Pair<>(2, 5));  add(new Pair<>(2, 15));  add(new Pair<>(4, 3));  add(new Pair<>(5, 11));  add(new Pair<>(6, 8));  add(new Pair<>(7, 5));  add(new Pair<>(8, 3));  add(new Pair<>(9, 13));  add(new Pair<>(9, 14));  add(new Pair<>(10, 1));  add(new Pair<>(10, 5));  add(new Pair<>(11, 2));  add(new Pair<>(12, 8));  add(new Pair<>(15, 1));  }});
                add(new ArrayList<>() {{  add(new Pair<>(4, 3));  add(new Pair<>(2, 5));  add(new Pair<>(10, 1));  add(new Pair<>(8, 3));  add(new Pair<>(11, 2));  add(new Pair<>(7, 5));  add(new Pair<>(15, 1));  add(new Pair<>(10, 5));  add(new Pair<>(6, 8));  add(new Pair<>(5, 11));  add(new Pair<>(12, 8));  add(new Pair<>(1, 14));  add(new Pair<>(2, 15));  add(new Pair<>(9, 13));  add(new Pair<>(9, 14));  }});
                add(new ArrayList<>() {{  add(new Pair<>(4, 3));  add(new Pair<>(10, 1));  add(new Pair<>(2, 5));  add(new Pair<>(8, 3));  add(new Pair<>(11, 2));  add(new Pair<>(15, 1));  add(new Pair<>(7, 5));  add(new Pair<>(10, 5));  add(new Pair<>(6, 8));  add(new Pair<>(12, 8));  add(new Pair<>(5, 11));  add(new Pair<>(1, 14));  add(new Pair<>(2, 15));  add(new Pair<>(9, 13));  add(new Pair<>(9, 14));  }});
                add(new ArrayList<>() {{  add(new Pair<>(10, 1));  add(new Pair<>(4, 3));  add(new Pair<>(11, 2));  add(new Pair<>(15, 1));  add(new Pair<>(8, 3));  add(new Pair<>(2, 5));  add(new Pair<>(7, 5));  add(new Pair<>(10, 5));  add(new Pair<>(6, 8));  add(new Pair<>(12, 8));  add(new Pair<>(5, 11));  add(new Pair<>(1, 14));  add(new Pair<>(9, 13));  add(new Pair<>(2, 15));  add(new Pair<>(9, 14));  }});
                add(new ArrayList<>() {{  add(new Pair<>(10, 1));  add(new Pair<>(4, 3));  add(new Pair<>(15, 1));  add(new Pair<>(11, 2));  add(new Pair<>(8, 3));  add(new Pair<>(2, 5));  add(new Pair<>(7, 5));  add(new Pair<>(10, 5));  add(new Pair<>(6, 8));  add(new Pair<>(12, 8));  add(new Pair<>(5, 11));  add(new Pair<>(1, 14));  add(new Pair<>(9, 13));  add(new Pair<>(2, 15));  add(new Pair<>(9, 14));  }});
                add(new ArrayList<>() {{  add(new Pair<>(10, 1));  add(new Pair<>(15, 1));  add(new Pair<>(4, 3));  add(new Pair<>(11, 2));  add(new Pair<>(8, 3));  add(new Pair<>(2, 5));  add(new Pair<>(7, 5));  add(new Pair<>(10, 5));  add(new Pair<>(6, 8));  add(new Pair<>(12, 8));  add(new Pair<>(5, 11));  add(new Pair<>(1, 14));  add(new Pair<>(9, 13));  add(new Pair<>(2, 15));  add(new Pair<>(9, 14));  }});
                add(new ArrayList<>() {{  add(new Pair<>(10, 1));  add(new Pair<>(15, 1));  add(new Pair<>(11, 2));  add(new Pair<>(4, 3));  add(new Pair<>(8, 3));  add(new Pair<>(2, 5));  add(new Pair<>(7, 5));  add(new Pair<>(10, 5));  add(new Pair<>(6, 8));  add(new Pair<>(12, 8));  add(new Pair<>(5, 11));  add(new Pair<>(1, 14));  add(new Pair<>(9, 13));  add(new Pair<>(9, 14));  add(new Pair<>(2, 15));  }});
                add(new ArrayList<>() {{  add(new Pair<>(2, 5));  add(new Pair<>(4, 3));  add(new Pair<>(1, 14));  add(new Pair<>(8, 3));  add(new Pair<>(7, 5));  add(new Pair<>(2, 15));  add(new Pair<>(6, 8));  add(new Pair<>(10, 1));  add(new Pair<>(5, 11));  add(new Pair<>(11, 2));  add(new Pair<>(10, 5));  add(new Pair<>(15, 1));  add(new Pair<>(9, 13));  add(new Pair<>(12, 8));  add(new Pair<>(9, 14));  }});
                add(new ArrayList<>() {{  add(new Pair<>(4, 3));  add(new Pair<>(2, 5));  add(new Pair<>(10, 1));  add(new Pair<>(8, 3));  add(new Pair<>(11, 2));  add(new Pair<>(7, 5));  add(new Pair<>(15, 1));  add(new Pair<>(10, 5));  add(new Pair<>(6, 8));  add(new Pair<>(5, 11));  add(new Pair<>(1, 14));  add(new Pair<>(12, 8));  add(new Pair<>(2, 15));  add(new Pair<>(9, 13));  add(new Pair<>(9, 14));  }});
                add(new ArrayList<>() {{  add(new Pair<>(10, 1));  add(new Pair<>(4, 3));  add(new Pair<>(11, 2));  add(new Pair<>(8, 3));  add(new Pair<>(15, 1));  add(new Pair<>(2, 5));  add(new Pair<>(7, 5));  add(new Pair<>(10, 5));  add(new Pair<>(6, 8));  add(new Pair<>(12, 8));  add(new Pair<>(5, 11));  add(new Pair<>(1, 14));  add(new Pair<>(2, 15));  add(new Pair<>(9, 13));  add(new Pair<>(9, 14));  }});
                add(new ArrayList<>() {{  add(new Pair<>(2, 5));  add(new Pair<>(4, 3));  add(new Pair<>(1, 14));  add(new Pair<>(2, 15));  add(new Pair<>(7, 5));  add(new Pair<>(6, 8));  add(new Pair<>(5, 11));  add(new Pair<>(8, 3));  add(new Pair<>(10, 1));  add(new Pair<>(11, 2));  add(new Pair<>(10, 5));  add(new Pair<>(9, 13));  add(new Pair<>(9, 14));  add(new Pair<>(12, 8));  add(new Pair<>(15, 1));  }});
                add(new ArrayList<>() {{  add(new Pair<>(2, 5));  add(new Pair<>(4, 3));  add(new Pair<>(8, 3));  add(new Pair<>(7, 5));  add(new Pair<>(1, 14));  add(new Pair<>(10, 1));  add(new Pair<>(6, 8));  add(new Pair<>(2, 15));  add(new Pair<>(11, 2));  add(new Pair<>(5, 11));  add(new Pair<>(10, 5));  add(new Pair<>(15, 1));  add(new Pair<>(12, 8));  add(new Pair<>(9, 13));  add(new Pair<>(9, 14));  }});
                add(new ArrayList<>() {{  add(new Pair<>(4, 3));  add(new Pair<>(2, 5));  add(new Pair<>(10, 1));  add(new Pair<>(8, 3));  add(new Pair<>(7, 5));  add(new Pair<>(11, 2));  add(new Pair<>(15, 1));  add(new Pair<>(6, 8));  add(new Pair<>(10, 5));  add(new Pair<>(1, 14));  add(new Pair<>(5, 11));  add(new Pair<>(2, 15));  add(new Pair<>(12, 8));  add(new Pair<>(9, 13));  add(new Pair<>(9, 14));  }});
                add(new ArrayList<>() {{  add(new Pair<>(4, 3));  add(new Pair<>(10, 1));  add(new Pair<>(2, 5));  add(new Pair<>(8, 3));  add(new Pair<>(11, 2));  add(new Pair<>(15, 1));  add(new Pair<>(7, 5));  add(new Pair<>(10, 5));  add(new Pair<>(6, 8));  add(new Pair<>(5, 11));  add(new Pair<>(12, 8));  add(new Pair<>(1, 14));  add(new Pair<>(2, 15));  add(new Pair<>(9, 13));  add(new Pair<>(9, 14));  }});
                add(new ArrayList<>() {{  add(new Pair<>(2, 5));  add(new Pair<>(1, 14));  add(new Pair<>(4, 3));  add(new Pair<>(2, 15));  add(new Pair<>(5, 11));  add(new Pair<>(6, 8));  add(new Pair<>(7, 5));  add(new Pair<>(8, 3));  add(new Pair<>(10, 1));  add(new Pair<>(10, 5));  add(new Pair<>(11, 2));  add(new Pair<>(9, 13));  add(new Pair<>(9, 14));  add(new Pair<>(12, 8));  add(new Pair<>(15, 1));  }});
                add(new ArrayList<>() {{  add(new Pair<>(2, 5));  add(new Pair<>(4, 3));  add(new Pair<>(8, 3));  add(new Pair<>(10, 1));  add(new Pair<>(7, 5));  add(new Pair<>(1, 14));  add(new Pair<>(6, 8));  add(new Pair<>(11, 2));  add(new Pair<>(5, 11));  add(new Pair<>(2, 15));  add(new Pair<>(10, 5));  add(new Pair<>(15, 1));  add(new Pair<>(12, 8));  add(new Pair<>(9, 13));  add(new Pair<>(9, 14));  }});
                add(new ArrayList<>() {{  add(new Pair<>(4, 3));  add(new Pair<>(2, 5));  add(new Pair<>(10, 1));  add(new Pair<>(8, 3));  add(new Pair<>(7, 5));  add(new Pair<>(11, 2));  add(new Pair<>(6, 8));  add(new Pair<>(10, 5));  add(new Pair<>(15, 1));  add(new Pair<>(1, 14));  add(new Pair<>(5, 11));  add(new Pair<>(2, 15));  add(new Pair<>(12, 8));  add(new Pair<>(9, 13));  add(new Pair<>(9, 14));  }});
                add(new ArrayList<>() {{  add(new Pair<>(10, 1));  add(new Pair<>(4, 3));  add(new Pair<>(11, 2));  add(new Pair<>(8, 3));  add(new Pair<>(2, 5));  add(new Pair<>(15, 1));  add(new Pair<>(7, 5));  add(new Pair<>(10, 5));  add(new Pair<>(6, 8));  add(new Pair<>(12, 8));  add(new Pair<>(5, 11));  add(new Pair<>(1, 14));  add(new Pair<>(2, 15));  add(new Pair<>(9, 13));  add(new Pair<>(9, 14));  }});
                add(new ArrayList<>() {{  add(new Pair<>(2, 5));  add(new Pair<>(4, 3));  add(new Pair<>(1, 14));  add(new Pair<>(2, 15));  add(new Pair<>(7, 5));  add(new Pair<>(8, 3));  add(new Pair<>(6, 8));  add(new Pair<>(5, 11));  add(new Pair<>(10, 1));  add(new Pair<>(11, 2));  add(new Pair<>(10, 5));  add(new Pair<>(9, 13));  add(new Pair<>(9, 14));  add(new Pair<>(12, 8));  add(new Pair<>(15, 1));  }});
                add(new ArrayList<>() {{  add(new Pair<>(2, 5));  add(new Pair<>(4, 3));  add(new Pair<>(1, 14));  add(new Pair<>(8, 3));  add(new Pair<>(7, 5));  add(new Pair<>(10, 1));  add(new Pair<>(6, 8));  add(new Pair<>(2, 15));  add(new Pair<>(5, 11));  add(new Pair<>(11, 2));  add(new Pair<>(10, 5));  add(new Pair<>(15, 1));  add(new Pair<>(12, 8));  add(new Pair<>(9, 13));  add(new Pair<>(9, 14));  }});
                add(new ArrayList<>() {{  add(new Pair<>(2, 5));  add(new Pair<>(4, 3));  add(new Pair<>(8, 3));  add(new Pair<>(10, 1));  add(new Pair<>(7, 5));  add(new Pair<>(1, 14));  add(new Pair<>(6, 8));  add(new Pair<>(11, 2));  add(new Pair<>(5, 11));  add(new Pair<>(10, 5));  add(new Pair<>(2, 15));  add(new Pair<>(15, 1));  add(new Pair<>(12, 8));  add(new Pair<>(9, 13));  add(new Pair<>(9, 14));  }});
                add(new ArrayList<>() {{  add(new Pair<>(4, 3));  add(new Pair<>(2, 5));  add(new Pair<>(10, 1));  add(new Pair<>(8, 3));  add(new Pair<>(11, 2));  add(new Pair<>(7, 5));  add(new Pair<>(15, 1));  add(new Pair<>(10, 5));  add(new Pair<>(6, 8));  add(new Pair<>(5, 11));  add(new Pair<>(1, 14));  add(new Pair<>(2, 15));  add(new Pair<>(12, 8));  add(new Pair<>(9, 13));  add(new Pair<>(9, 14));  }});
                add(new ArrayList<>() {{  add(new Pair<>(2, 5));  add(new Pair<>(1, 14));  add(new Pair<>(4, 3));  add(new Pair<>(2, 15));  add(new Pair<>(5, 11));  add(new Pair<>(6, 8));  add(new Pair<>(7, 5));  add(new Pair<>(8, 3));  add(new Pair<>(10, 1));  add(new Pair<>(10, 5));  add(new Pair<>(9, 13));  add(new Pair<>(11, 2));  add(new Pair<>(9, 14));  add(new Pair<>(12, 8));  add(new Pair<>(15, 1));  }});
                add(new ArrayList<>() {{  add(new Pair<>(2, 5));  add(new Pair<>(4, 3));  add(new Pair<>(8, 3));  add(new Pair<>(10, 1));  add(new Pair<>(7, 5));  add(new Pair<>(11, 2));  add(new Pair<>(6, 8));  add(new Pair<>(1, 14));  add(new Pair<>(10, 5));  add(new Pair<>(5, 11));  add(new Pair<>(2, 15));  add(new Pair<>(15, 1));  add(new Pair<>(12, 8));  add(new Pair<>(9, 13));  add(new Pair<>(9, 14));  }});
                add(new ArrayList<>() {{  add(new Pair<>(2, 5));  add(new Pair<>(1, 14));  add(new Pair<>(2, 15));  add(new Pair<>(4, 3));  add(new Pair<>(5, 11));  add(new Pair<>(6, 8));  add(new Pair<>(7, 5));  add(new Pair<>(8, 3));  add(new Pair<>(10, 1));  add(new Pair<>(10, 5));  add(new Pair<>(9, 13));  add(new Pair<>(9, 14));  add(new Pair<>(11, 2));  add(new Pair<>(12, 8));  add(new Pair<>(15, 1));  }});
                add(new ArrayList<>() {{  add(new Pair<>(2, 5));  add(new Pair<>(4, 3));  add(new Pair<>(1, 14));  add(new Pair<>(2, 15));  add(new Pair<>(5, 11));  add(new Pair<>(6, 8));  add(new Pair<>(7, 5));  add(new Pair<>(8, 3));  add(new Pair<>(10, 1));  add(new Pair<>(10, 5));  add(new Pair<>(11, 2));  add(new Pair<>(9, 13));  add(new Pair<>(9, 14));  add(new Pair<>(12, 8));  add(new Pair<>(15, 1));  }});
                add(new ArrayList<>() {{  add(new Pair<>(2, 5));  add(new Pair<>(4, 3));  add(new Pair<>(1, 14));  add(new Pair<>(2, 15));  add(new Pair<>(7, 5));  add(new Pair<>(8, 3));  add(new Pair<>(6, 8));  add(new Pair<>(5, 11));  add(new Pair<>(10, 1));  add(new Pair<>(11, 2));  add(new Pair<>(10, 5));  add(new Pair<>(9, 13));  add(new Pair<>(9, 14));  add(new Pair<>(15, 1));  add(new Pair<>(12, 8));  }});
                add(new ArrayList<>() {{  add(new Pair<>(2, 5));  add(new Pair<>(4, 3));  add(new Pair<>(1, 14));  add(new Pair<>(8, 3));  add(new Pair<>(7, 5));  add(new Pair<>(10, 1));  add(new Pair<>(6, 8));  add(new Pair<>(2, 15));  add(new Pair<>(5, 11));  add(new Pair<>(11, 2));  add(new Pair<>(10, 5));  add(new Pair<>(15, 1));  add(new Pair<>(9, 13));  add(new Pair<>(12, 8));  add(new Pair<>(9, 14));  }});
                add(new ArrayList<>() {{  add(new Pair<>(2, 5));  add(new Pair<>(4, 3));  add(new Pair<>(8, 3));  add(new Pair<>(7, 5));  add(new Pair<>(10, 1));  add(new Pair<>(1, 14));  add(new Pair<>(6, 8));  add(new Pair<>(11, 2));  add(new Pair<>(2, 15));  add(new Pair<>(5, 11));  add(new Pair<>(10, 5));  add(new Pair<>(15, 1));  add(new Pair<>(12, 8));  add(new Pair<>(9, 13));  add(new Pair<>(9, 14));  }});
                add(new ArrayList<>() {{  add(new Pair<>(4, 3));  add(new Pair<>(2, 5));  add(new Pair<>(10, 1));  add(new Pair<>(8, 3));  add(new Pair<>(7, 5));  add(new Pair<>(11, 2));  add(new Pair<>(6, 8));  add(new Pair<>(15, 1));  add(new Pair<>(10, 5));  add(new Pair<>(1, 14));  add(new Pair<>(5, 11));  add(new Pair<>(2, 15));  add(new Pair<>(12, 8));  add(new Pair<>(9, 13));  add(new Pair<>(9, 14));  }});
                add(new ArrayList<>() {{  add(new Pair<>(2, 5));  add(new Pair<>(4, 3));  add(new Pair<>(1, 14));  add(new Pair<>(2, 15));  add(new Pair<>(7, 5));  add(new Pair<>(6, 8));  add(new Pair<>(8, 3));  add(new Pair<>(5, 11));  add(new Pair<>(10, 1));  add(new Pair<>(11, 2));  add(new Pair<>(10, 5));  add(new Pair<>(9, 13));  add(new Pair<>(9, 14));  add(new Pair<>(12, 8));  add(new Pair<>(15, 1));  }});
                add(new ArrayList<>() {{  add(new Pair<>(2, 5));  add(new Pair<>(1, 14));  add(new Pair<>(2, 15));  add(new Pair<>(4, 3));  add(new Pair<>(5, 11));  add(new Pair<>(6, 8));  add(new Pair<>(7, 5));  add(new Pair<>(8, 3));  add(new Pair<>(10, 1));  add(new Pair<>(9, 13));  add(new Pair<>(10, 5));  add(new Pair<>(9, 14));  add(new Pair<>(11, 2));  add(new Pair<>(12, 8));  add(new Pair<>(15, 1));  }});
                add(new ArrayList<>() {{  add(new Pair<>(1, 14));  add(new Pair<>(2, 5));  add(new Pair<>(2, 15));  add(new Pair<>(4, 3));  add(new Pair<>(5, 11));  add(new Pair<>(6, 8));  add(new Pair<>(7, 5));  add(new Pair<>(8, 3));  add(new Pair<>(10, 1));  add(new Pair<>(9, 13));  add(new Pair<>(9, 14));  add(new Pair<>(10, 5));  add(new Pair<>(11, 2));  add(new Pair<>(12, 8));  add(new Pair<>(15, 1));  }});
                add(new ArrayList<>() {{  add(new Pair<>(2, 5));  add(new Pair<>(4, 3));  add(new Pair<>(8, 3));  add(new Pair<>(1, 14));  add(new Pair<>(7, 5));  add(new Pair<>(10, 1));  add(new Pair<>(6, 8));  add(new Pair<>(2, 15));  add(new Pair<>(5, 11));  add(new Pair<>(11, 2));  add(new Pair<>(10, 5));  add(new Pair<>(15, 1));  add(new Pair<>(12, 8));  add(new Pair<>(9, 13));  add(new Pair<>(9, 14));  }});
                add(new ArrayList<>() {{  add(new Pair<>(1, 14));  add(new Pair<>(2, 5));  add(new Pair<>(2, 15));  add(new Pair<>(4, 3));  add(new Pair<>(5, 11));  add(new Pair<>(6, 8));  add(new Pair<>(7, 5));  add(new Pair<>(8, 3));  add(new Pair<>(9, 13));  add(new Pair<>(10, 1));  add(new Pair<>(9, 14));  add(new Pair<>(10, 5));  add(new Pair<>(11, 2));  add(new Pair<>(12, 8));  add(new Pair<>(15, 1));  }});
                add(new ArrayList<>() {{  add(new Pair<>(2, 5));  add(new Pair<>(4, 3));  add(new Pair<>(1, 14));  add(new Pair<>(2, 15));  add(new Pair<>(7, 5));  add(new Pair<>(8, 3));  add(new Pair<>(6, 8));  add(new Pair<>(5, 11));  add(new Pair<>(10, 1));  add(new Pair<>(11, 2));  add(new Pair<>(10, 5));  add(new Pair<>(9, 13));  add(new Pair<>(15, 1));  add(new Pair<>(9, 14));  add(new Pair<>(12, 8));  }});
                add(new ArrayList<>() {{  add(new Pair<>(4, 3));  add(new Pair<>(2, 5));  add(new Pair<>(10, 1));  add(new Pair<>(8, 3));  add(new Pair<>(7, 5));  add(new Pair<>(11, 2));  add(new Pair<>(6, 8));  add(new Pair<>(10, 5));  add(new Pair<>(1, 14));  add(new Pair<>(15, 1));  add(new Pair<>(5, 11));  add(new Pair<>(2, 15));  add(new Pair<>(12, 8));  add(new Pair<>(9, 13));  add(new Pair<>(9, 14));  }});
                add(new ArrayList<>() {{  add(new Pair<>(2, 5));  add(new Pair<>(4, 3));  add(new Pair<>(8, 3));  add(new Pair<>(10, 1));  add(new Pair<>(7, 5));  add(new Pair<>(11, 2));  add(new Pair<>(6, 8));  add(new Pair<>(1, 14));  add(new Pair<>(10, 5));  add(new Pair<>(5, 11));  add(new Pair<>(15, 1));  add(new Pair<>(2, 15));  add(new Pair<>(12, 8));  add(new Pair<>(9, 13));  add(new Pair<>(9, 14));  }});
                add(new ArrayList<>() {{  add(new Pair<>(10, 1));  add(new Pair<>(15, 1));  add(new Pair<>(11, 2));  add(new Pair<>(4, 3));  add(new Pair<>(8, 3));  add(new Pair<>(2, 5));  add(new Pair<>(7, 5));  add(new Pair<>(10, 5));  add(new Pair<>(6, 8));  add(new Pair<>(12, 8));  add(new Pair<>(5, 11));  add(new Pair<>(9, 13));  add(new Pair<>(1, 14));  add(new Pair<>(9, 14));  add(new Pair<>(2, 15));  }});
            }
        });

        // test case 5 -------------------------------------------------------------------------------------------------
        ++numOfTests;
        inputLists.add(new ArrayList<>() {
            {
                add(new Pair<>(19, 20));
                add(new Pair<>(16, 4));
                add(new Pair<>(5, 19));
                add(new Pair<>(12, 17));
                add(new Pair<>(16, 7));
                add(new Pair<>(18, 12));
                add(new Pair<>(17, 11));
                add(new Pair<>(8, 17));
                add(new Pair<>(17, 14));
                add(new Pair<>(15, 3));
                add(new Pair<>(12, 20));
                add(new Pair<>(11, 18));
                add(new Pair<>(19, 13));
                add(new Pair<>(19, 9));
                add(new Pair<>(13, 15));
                add(new Pair<>(3, 4));
                add(new Pair<>(1, 7));
                add(new Pair<>(20, 11));
                add(new Pair<>(20, 19));
                add(new Pair<>(9, 9));
            }
        });
        expectedLists.add(new ArrayList<>() {
            {
                add(new ArrayList<>() {{  add(new Pair<>(1, 7));  add(new Pair<>(3, 4));  add(new Pair<>(5, 19));  add(new Pair<>(8, 17));  add(new Pair<>(9, 9));  add(new Pair<>(11, 18));  add(new Pair<>(12, 17));  add(new Pair<>(12, 20));  add(new Pair<>(13, 15));  add(new Pair<>(15, 3));  add(new Pair<>(16, 4));  add(new Pair<>(16, 7));  add(new Pair<>(17, 11));  add(new Pair<>(17, 14));  add(new Pair<>(18, 12));  add(new Pair<>(19, 9));  add(new Pair<>(19, 13));  add(new Pair<>(19, 20));  add(new Pair<>(20, 11));  add(new Pair<>(20, 19));  }});
                add(new ArrayList<>() {{  add(new Pair<>(3, 4));  add(new Pair<>(1, 7));  add(new Pair<>(15, 3));  add(new Pair<>(16, 4));  add(new Pair<>(9, 9));  add(new Pair<>(16, 7));  add(new Pair<>(19, 9));  add(new Pair<>(17, 11));  add(new Pair<>(8, 17));  add(new Pair<>(18, 12));  add(new Pair<>(20, 11));  add(new Pair<>(5, 19));  add(new Pair<>(13, 15));  add(new Pair<>(17, 14));  add(new Pair<>(19, 13));  add(new Pair<>(12, 17));  add(new Pair<>(11, 18));  add(new Pair<>(12, 20));  add(new Pair<>(20, 19));  add(new Pair<>(19, 20));  }});
                add(new ArrayList<>() {{  add(new Pair<>(3, 4));  add(new Pair<>(1, 7));  add(new Pair<>(15, 3));  add(new Pair<>(16, 4));  add(new Pair<>(9, 9));  add(new Pair<>(16, 7));  add(new Pair<>(19, 9));  add(new Pair<>(17, 11));  add(new Pair<>(20, 11));  add(new Pair<>(18, 12));  add(new Pair<>(13, 15));  add(new Pair<>(19, 13));  add(new Pair<>(8, 17));  add(new Pair<>(17, 14));  add(new Pair<>(5, 19));  add(new Pair<>(12, 17));  add(new Pair<>(11, 18));  add(new Pair<>(12, 20));  add(new Pair<>(20, 19));  add(new Pair<>(19, 20));  }});
                add(new ArrayList<>() {{  add(new Pair<>(3, 4));  add(new Pair<>(15, 3));  add(new Pair<>(1, 7));  add(new Pair<>(16, 4));  add(new Pair<>(16, 7));  add(new Pair<>(9, 9));  add(new Pair<>(19, 9));  add(new Pair<>(17, 11));  add(new Pair<>(20, 11));  add(new Pair<>(18, 12));  add(new Pair<>(19, 13));  add(new Pair<>(13, 15));  add(new Pair<>(17, 14));  add(new Pair<>(8, 17));  add(new Pair<>(12, 17));  add(new Pair<>(5, 19));  add(new Pair<>(11, 18));  add(new Pair<>(12, 20));  add(new Pair<>(20, 19));  add(new Pair<>(19, 20));  }});
                add(new ArrayList<>() {{  add(new Pair<>(3, 4));  add(new Pair<>(15, 3));  add(new Pair<>(1, 7));  add(new Pair<>(16, 4));  add(new Pair<>(16, 7));  add(new Pair<>(9, 9));  add(new Pair<>(19, 9));  add(new Pair<>(17, 11));  add(new Pair<>(20, 11));  add(new Pair<>(18, 12));  add(new Pair<>(19, 13));  add(new Pair<>(17, 14));  add(new Pair<>(13, 15));  add(new Pair<>(8, 17));  add(new Pair<>(12, 17));  add(new Pair<>(5, 19));  add(new Pair<>(11, 18));  add(new Pair<>(12, 20));  add(new Pair<>(20, 19));  add(new Pair<>(19, 20));  }});
                add(new ArrayList<>() {{  add(new Pair<>(3, 4));  add(new Pair<>(15, 3));  add(new Pair<>(16, 4));  add(new Pair<>(1, 7));  add(new Pair<>(16, 7));  add(new Pair<>(9, 9));  add(new Pair<>(19, 9));  add(new Pair<>(17, 11));  add(new Pair<>(20, 11));  add(new Pair<>(18, 12));  add(new Pair<>(19, 13));  add(new Pair<>(17, 14));  add(new Pair<>(13, 15));  add(new Pair<>(8, 17));  add(new Pair<>(12, 17));  add(new Pair<>(5, 19));  add(new Pair<>(11, 18));  add(new Pair<>(12, 20));  add(new Pair<>(20, 19));  add(new Pair<>(19, 20));  }});
                add(new ArrayList<>() {{  add(new Pair<>(3, 4));  add(new Pair<>(15, 3));  add(new Pair<>(16, 4));  add(new Pair<>(1, 7));  add(new Pair<>(16, 7));  add(new Pair<>(9, 9));  add(new Pair<>(19, 9));  add(new Pair<>(17, 11));  add(new Pair<>(20, 11));  add(new Pair<>(18, 12));  add(new Pair<>(19, 13));  add(new Pair<>(17, 14));  add(new Pair<>(13, 15));  add(new Pair<>(8, 17));  add(new Pair<>(12, 17));  add(new Pair<>(11, 18));  add(new Pair<>(5, 19));  add(new Pair<>(12, 20));  add(new Pair<>(20, 19));  add(new Pair<>(19, 20));  }});
                add(new ArrayList<>() {{  add(new Pair<>(3, 4));  add(new Pair<>(15, 3));  add(new Pair<>(16, 4));  add(new Pair<>(1, 7));  add(new Pair<>(16, 7));  add(new Pair<>(9, 9));  add(new Pair<>(19, 9));  add(new Pair<>(17, 11));  add(new Pair<>(20, 11));  add(new Pair<>(18, 12));  add(new Pair<>(19, 13));  add(new Pair<>(17, 14));  add(new Pair<>(13, 15));  add(new Pair<>(8, 17));  add(new Pair<>(12, 17));  add(new Pair<>(11, 18));  add(new Pair<>(5, 19));  add(new Pair<>(20, 19));  add(new Pair<>(12, 20));  add(new Pair<>(19, 20));  }});
                add(new ArrayList<>() {{  add(new Pair<>(1, 7));  add(new Pair<>(3, 4));  add(new Pair<>(9, 9));  add(new Pair<>(5, 19));  add(new Pair<>(15, 3));  add(new Pair<>(8, 17));  add(new Pair<>(16, 4));  add(new Pair<>(16, 7));  add(new Pair<>(11, 18));  add(new Pair<>(13, 15));  add(new Pair<>(12, 17));  add(new Pair<>(12, 20));  add(new Pair<>(17, 11));  add(new Pair<>(19, 9));  add(new Pair<>(18, 12));  add(new Pair<>(17, 14));  add(new Pair<>(20, 11));  add(new Pair<>(19, 13));  add(new Pair<>(19, 20));  add(new Pair<>(20, 19));  }});
                add(new ArrayList<>() {{  add(new Pair<>(3, 4));  add(new Pair<>(1, 7));  add(new Pair<>(15, 3));  add(new Pair<>(16, 4));  add(new Pair<>(9, 9));  add(new Pair<>(16, 7));  add(new Pair<>(19, 9));  add(new Pair<>(5, 19));  add(new Pair<>(8, 17));  add(new Pair<>(17, 11));  add(new Pair<>(13, 15));  add(new Pair<>(18, 12));  add(new Pair<>(20, 11));  add(new Pair<>(12, 17));  add(new Pair<>(11, 18));  add(new Pair<>(17, 14));  add(new Pair<>(19, 13));  add(new Pair<>(12, 20));  add(new Pair<>(20, 19));  add(new Pair<>(19, 20));  }});
                add(new ArrayList<>() {{  add(new Pair<>(3, 4));  add(new Pair<>(1, 7));  add(new Pair<>(15, 3));  add(new Pair<>(16, 4));  add(new Pair<>(9, 9));  add(new Pair<>(16, 7));  add(new Pair<>(19, 9));  add(new Pair<>(17, 11));  add(new Pair<>(20, 11));  add(new Pair<>(18, 12));  add(new Pair<>(8, 17));  add(new Pair<>(13, 15));  add(new Pair<>(19, 13));  add(new Pair<>(17, 14));  add(new Pair<>(5, 19));  add(new Pair<>(12, 17));  add(new Pair<>(11, 18));  add(new Pair<>(12, 20));  add(new Pair<>(20, 19));  add(new Pair<>(19, 20));  }});
                add(new ArrayList<>() {{  add(new Pair<>(3, 4));  add(new Pair<>(1, 7));  add(new Pair<>(15, 3));  add(new Pair<>(16, 4));  add(new Pair<>(9, 9));  add(new Pair<>(16, 7));  add(new Pair<>(19, 9));  add(new Pair<>(17, 11));  add(new Pair<>(20, 11));  add(new Pair<>(18, 12));  add(new Pair<>(19, 13));  add(new Pair<>(13, 15));  add(new Pair<>(17, 14));  add(new Pair<>(8, 17));  add(new Pair<>(5, 19));  add(new Pair<>(12, 17));  add(new Pair<>(11, 18));  add(new Pair<>(12, 20));  add(new Pair<>(20, 19));  add(new Pair<>(19, 20));  }});
                add(new ArrayList<>() {{  add(new Pair<>(1, 7));  add(new Pair<>(3, 4));  add(new Pair<>(5, 19));  add(new Pair<>(9, 9));  add(new Pair<>(8, 17));  add(new Pair<>(15, 3));  add(new Pair<>(11, 18));  add(new Pair<>(16, 4));  add(new Pair<>(12, 17));  add(new Pair<>(13, 15));  add(new Pair<>(16, 7));  add(new Pair<>(12, 20));  add(new Pair<>(17, 11));  add(new Pair<>(17, 14));  add(new Pair<>(19, 9));  add(new Pair<>(18, 12));  add(new Pair<>(19, 13));  add(new Pair<>(20, 11));  add(new Pair<>(19, 20));  add(new Pair<>(20, 19));  }});
                add(new ArrayList<>() {{  add(new Pair<>(3, 4));  add(new Pair<>(1, 7));  add(new Pair<>(9, 9));  add(new Pair<>(15, 3));  add(new Pair<>(5, 19));  add(new Pair<>(16, 4));  add(new Pair<>(8, 17));  add(new Pair<>(16, 7));  add(new Pair<>(13, 15));  add(new Pair<>(11, 18));  add(new Pair<>(12, 17));  add(new Pair<>(17, 11));  add(new Pair<>(19, 9));  add(new Pair<>(12, 20));  add(new Pair<>(18, 12));  add(new Pair<>(17, 14));  add(new Pair<>(20, 11));  add(new Pair<>(19, 13));  add(new Pair<>(19, 20));  add(new Pair<>(20, 19));  }});
                add(new ArrayList<>() {{  add(new Pair<>(3, 4));  add(new Pair<>(1, 7));  add(new Pair<>(15, 3));  add(new Pair<>(9, 9));  add(new Pair<>(16, 4));  add(new Pair<>(16, 7));  add(new Pair<>(5, 19));  add(new Pair<>(8, 17));  add(new Pair<>(19, 9));  add(new Pair<>(17, 11));  add(new Pair<>(13, 15));  add(new Pair<>(18, 12));  add(new Pair<>(12, 17));  add(new Pair<>(20, 11));  add(new Pair<>(11, 18));  add(new Pair<>(17, 14));  add(new Pair<>(19, 13));  add(new Pair<>(12, 20));  add(new Pair<>(20, 19));  add(new Pair<>(19, 20));  }});
                add(new ArrayList<>() {{  add(new Pair<>(3, 4));  add(new Pair<>(1, 7));  add(new Pair<>(15, 3));  add(new Pair<>(16, 4));  add(new Pair<>(9, 9));  add(new Pair<>(16, 7));  add(new Pair<>(19, 9));  add(new Pair<>(17, 11));  add(new Pair<>(8, 17));  add(new Pair<>(5, 19));  add(new Pair<>(13, 15));  add(new Pair<>(18, 12));  add(new Pair<>(20, 11));  add(new Pair<>(12, 17));  add(new Pair<>(17, 14));  add(new Pair<>(19, 13));  add(new Pair<>(11, 18));  add(new Pair<>(12, 20));  add(new Pair<>(20, 19));  add(new Pair<>(19, 20));  }});
                add(new ArrayList<>() {{  add(new Pair<>(3, 4));  add(new Pair<>(1, 7));  add(new Pair<>(15, 3));  add(new Pair<>(16, 4));  add(new Pair<>(9, 9));  add(new Pair<>(16, 7));  add(new Pair<>(19, 9));  add(new Pair<>(17, 11));  add(new Pair<>(20, 11));  add(new Pair<>(18, 12));  add(new Pair<>(8, 17));  add(new Pair<>(13, 15));  add(new Pair<>(5, 19));  add(new Pair<>(19, 13));  add(new Pair<>(17, 14));  add(new Pair<>(12, 17));  add(new Pair<>(11, 18));  add(new Pair<>(12, 20));  add(new Pair<>(20, 19));  add(new Pair<>(19, 20));  }});
                add(new ArrayList<>() {{  add(new Pair<>(3, 4));  add(new Pair<>(1, 7));  add(new Pair<>(15, 3));  add(new Pair<>(16, 4));  add(new Pair<>(9, 9));  add(new Pair<>(16, 7));  add(new Pair<>(19, 9));  add(new Pair<>(17, 11));  add(new Pair<>(20, 11));  add(new Pair<>(18, 12));  add(new Pair<>(13, 15));  add(new Pair<>(8, 17));  add(new Pair<>(19, 13));  add(new Pair<>(17, 14));  add(new Pair<>(5, 19));  add(new Pair<>(12, 17));  add(new Pair<>(11, 18));  add(new Pair<>(12, 20));  add(new Pair<>(20, 19));  add(new Pair<>(19, 20));  }});
                add(new ArrayList<>() {{  add(new Pair<>(1, 7));  add(new Pair<>(3, 4));  add(new Pair<>(5, 19));  add(new Pair<>(9, 9));  add(new Pair<>(8, 17));  add(new Pair<>(11, 18));  add(new Pair<>(15, 3));  add(new Pair<>(12, 17));  add(new Pair<>(13, 15));  add(new Pair<>(16, 4));  add(new Pair<>(12, 20));  add(new Pair<>(16, 7));  add(new Pair<>(17, 11));  add(new Pair<>(17, 14));  add(new Pair<>(18, 12));  add(new Pair<>(19, 9));  add(new Pair<>(19, 13));  add(new Pair<>(20, 11));  add(new Pair<>(19, 20));  add(new Pair<>(20, 19));  }});
                add(new ArrayList<>() {{  add(new Pair<>(3, 4));  add(new Pair<>(1, 7));  add(new Pair<>(9, 9));  add(new Pair<>(15, 3));  add(new Pair<>(16, 4));  add(new Pair<>(5, 19));  add(new Pair<>(8, 17));  add(new Pair<>(16, 7));  add(new Pair<>(13, 15));  add(new Pair<>(11, 18));  add(new Pair<>(12, 17));  add(new Pair<>(17, 11));  add(new Pair<>(19, 9));  add(new Pair<>(18, 12));  add(new Pair<>(12, 20));  add(new Pair<>(17, 14));  add(new Pair<>(20, 11));  add(new Pair<>(19, 13));  add(new Pair<>(19, 20));  add(new Pair<>(20, 19));  }});
                add(new ArrayList<>() {{  add(new Pair<>(3, 4));  add(new Pair<>(1, 7));  add(new Pair<>(15, 3));  add(new Pair<>(9, 9));  add(new Pair<>(16, 4));  add(new Pair<>(16, 7));  add(new Pair<>(5, 19));  add(new Pair<>(8, 17));  add(new Pair<>(19, 9));  add(new Pair<>(17, 11));  add(new Pair<>(13, 15));  add(new Pair<>(18, 12));  add(new Pair<>(12, 17));  add(new Pair<>(11, 18));  add(new Pair<>(20, 11));  add(new Pair<>(17, 14));  add(new Pair<>(19, 13));  add(new Pair<>(12, 20));  add(new Pair<>(20, 19));  add(new Pair<>(19, 20));  }});
                add(new ArrayList<>() {{  add(new Pair<>(3, 4));  add(new Pair<>(1, 7));  add(new Pair<>(15, 3));  add(new Pair<>(16, 4));  add(new Pair<>(9, 9));  add(new Pair<>(16, 7));  add(new Pair<>(19, 9));  add(new Pair<>(17, 11));  add(new Pair<>(8, 17));  add(new Pair<>(5, 19));  add(new Pair<>(18, 12));  add(new Pair<>(13, 15));  add(new Pair<>(20, 11));  add(new Pair<>(17, 14));  add(new Pair<>(12, 17));  add(new Pair<>(19, 13));  add(new Pair<>(11, 18));  add(new Pair<>(12, 20));  add(new Pair<>(20, 19));  add(new Pair<>(19, 20));  }});
                add(new ArrayList<>() {{  add(new Pair<>(1, 7));  add(new Pair<>(3, 4));  add(new Pair<>(5, 19));  add(new Pair<>(9, 9));  add(new Pair<>(8, 17));  add(new Pair<>(11, 18));  add(new Pair<>(12, 17));  add(new Pair<>(15, 3));  add(new Pair<>(13, 15));  add(new Pair<>(12, 20));  add(new Pair<>(16, 4));  add(new Pair<>(16, 7));  add(new Pair<>(17, 11));  add(new Pair<>(17, 14));  add(new Pair<>(18, 12));  add(new Pair<>(19, 9));  add(new Pair<>(19, 13));  add(new Pair<>(20, 11));  add(new Pair<>(19, 20));  add(new Pair<>(20, 19));  }});
                add(new ArrayList<>() {{  add(new Pair<>(1, 7));  add(new Pair<>(3, 4));  add(new Pair<>(9, 9));  add(new Pair<>(5, 19));  add(new Pair<>(8, 17));  add(new Pair<>(15, 3));  add(new Pair<>(16, 4));  add(new Pair<>(11, 18));  add(new Pair<>(16, 7));  add(new Pair<>(12, 17));  add(new Pair<>(13, 15));  add(new Pair<>(12, 20));  add(new Pair<>(17, 11));  add(new Pair<>(19, 9));  add(new Pair<>(17, 14));  add(new Pair<>(18, 12));  add(new Pair<>(19, 13));  add(new Pair<>(20, 11));  add(new Pair<>(19, 20));  add(new Pair<>(20, 19));  }});
                add(new ArrayList<>() {{  add(new Pair<>(1, 7));  add(new Pair<>(3, 4));  add(new Pair<>(9, 9));  add(new Pair<>(5, 19));  add(new Pair<>(15, 3));  add(new Pair<>(8, 17));  add(new Pair<>(16, 4));  add(new Pair<>(16, 7));  add(new Pair<>(11, 18));  add(new Pair<>(13, 15));  add(new Pair<>(12, 17));  add(new Pair<>(17, 11));  add(new Pair<>(12, 20));  add(new Pair<>(19, 9));  add(new Pair<>(18, 12));  add(new Pair<>(17, 14));  add(new Pair<>(20, 11));  add(new Pair<>(19, 13));  add(new Pair<>(19, 20));  add(new Pair<>(20, 19));  }});
                add(new ArrayList<>() {{  add(new Pair<>(3, 4));  add(new Pair<>(1, 7));  add(new Pair<>(9, 9));  add(new Pair<>(15, 3));  add(new Pair<>(16, 4));  add(new Pair<>(5, 19));  add(new Pair<>(16, 7));  add(new Pair<>(8, 17));  add(new Pair<>(13, 15));  add(new Pair<>(11, 18));  add(new Pair<>(12, 17));  add(new Pair<>(17, 11));  add(new Pair<>(19, 9));  add(new Pair<>(18, 12));  add(new Pair<>(12, 20));  add(new Pair<>(17, 14));  add(new Pair<>(20, 11));  add(new Pair<>(19, 13));  add(new Pair<>(19, 20));  add(new Pair<>(20, 19));  }});
                add(new ArrayList<>() {{  add(new Pair<>(3, 4));  add(new Pair<>(1, 7));  add(new Pair<>(15, 3));  add(new Pair<>(9, 9));  add(new Pair<>(16, 4));  add(new Pair<>(16, 7));  add(new Pair<>(5, 19));  add(new Pair<>(8, 17));  add(new Pair<>(19, 9));  add(new Pair<>(17, 11));  add(new Pair<>(13, 15));  add(new Pair<>(12, 17));  add(new Pair<>(18, 12));  add(new Pair<>(11, 18));  add(new Pair<>(20, 11));  add(new Pair<>(17, 14));  add(new Pair<>(19, 13));  add(new Pair<>(12, 20));  add(new Pair<>(20, 19));  add(new Pair<>(19, 20));  }});
                add(new ArrayList<>() {{  add(new Pair<>(3, 4));  add(new Pair<>(1, 7));  add(new Pair<>(15, 3));  add(new Pair<>(9, 9));  add(new Pair<>(16, 4));  add(new Pair<>(16, 7));  add(new Pair<>(5, 19));  add(new Pair<>(19, 9));  add(new Pair<>(8, 17));  add(new Pair<>(17, 11));  add(new Pair<>(13, 15));  add(new Pair<>(18, 12));  add(new Pair<>(20, 11));  add(new Pair<>(12, 17));  add(new Pair<>(11, 18));  add(new Pair<>(17, 14));  add(new Pair<>(19, 13));  add(new Pair<>(12, 20));  add(new Pair<>(20, 19));  add(new Pair<>(19, 20));  }});
                add(new ArrayList<>() {{  add(new Pair<>(3, 4));  add(new Pair<>(1, 7));  add(new Pair<>(15, 3));  add(new Pair<>(16, 4));  add(new Pair<>(9, 9));  add(new Pair<>(16, 7));  add(new Pair<>(19, 9));  add(new Pair<>(17, 11));  add(new Pair<>(8, 17));  add(new Pair<>(5, 19));  add(new Pair<>(13, 15));  add(new Pair<>(18, 12));  add(new Pair<>(20, 11));  add(new Pair<>(12, 17));  add(new Pair<>(17, 14));  add(new Pair<>(11, 18));  add(new Pair<>(19, 13));  add(new Pair<>(12, 20));  add(new Pair<>(20, 19));  add(new Pair<>(19, 20));  }});
                add(new ArrayList<>() {{  add(new Pair<>(3, 4));  add(new Pair<>(1, 7));  add(new Pair<>(15, 3));  add(new Pair<>(16, 4));  add(new Pair<>(9, 9));  add(new Pair<>(16, 7));  add(new Pair<>(19, 9));  add(new Pair<>(17, 11));  add(new Pair<>(8, 17));  add(new Pair<>(5, 19));  add(new Pair<>(18, 12));  add(new Pair<>(20, 11));  add(new Pair<>(13, 15));  add(new Pair<>(17, 14));  add(new Pair<>(19, 13));  add(new Pair<>(12, 17));  add(new Pair<>(11, 18));  add(new Pair<>(12, 20));  add(new Pair<>(20, 19));  add(new Pair<>(19, 20));  }});
                add(new ArrayList<>() {{  add(new Pair<>(3, 4));  add(new Pair<>(1, 7));  add(new Pair<>(15, 3));  add(new Pair<>(16, 4));  add(new Pair<>(9, 9));  add(new Pair<>(16, 7));  add(new Pair<>(19, 9));  add(new Pair<>(17, 11));  add(new Pair<>(20, 11));  add(new Pair<>(18, 12));  add(new Pair<>(8, 17));  add(new Pair<>(13, 15));  add(new Pair<>(19, 13));  add(new Pair<>(5, 19));  add(new Pair<>(17, 14));  add(new Pair<>(12, 17));  add(new Pair<>(11, 18));  add(new Pair<>(12, 20));  add(new Pair<>(20, 19));  add(new Pair<>(19, 20));  }});
                add(new ArrayList<>() {{  add(new Pair<>(1, 7));  add(new Pair<>(3, 4));  add(new Pair<>(5, 19));  add(new Pair<>(9, 9));  add(new Pair<>(8, 17));  add(new Pair<>(11, 18));  add(new Pair<>(12, 17));  add(new Pair<>(12, 20));  add(new Pair<>(15, 3));  add(new Pair<>(13, 15));  add(new Pair<>(16, 4));  add(new Pair<>(16, 7));  add(new Pair<>(17, 11));  add(new Pair<>(17, 14));  add(new Pair<>(18, 12));  add(new Pair<>(19, 9));  add(new Pair<>(19, 13));  add(new Pair<>(20, 11));  add(new Pair<>(19, 20));  add(new Pair<>(20, 19));  }});
                add(new ArrayList<>() {{  add(new Pair<>(3, 4));  add(new Pair<>(1, 7));  add(new Pair<>(9, 9));  add(new Pair<>(15, 3));  add(new Pair<>(16, 4));  add(new Pair<>(5, 19));  add(new Pair<>(16, 7));  add(new Pair<>(8, 17));  add(new Pair<>(13, 15));  add(new Pair<>(11, 18));  add(new Pair<>(17, 11));  add(new Pair<>(12, 17));  add(new Pair<>(19, 9));  add(new Pair<>(18, 12));  add(new Pair<>(17, 14));  add(new Pair<>(12, 20));  add(new Pair<>(20, 11));  add(new Pair<>(19, 13));  add(new Pair<>(19, 20));  add(new Pair<>(20, 19));  }});
                add(new ArrayList<>() {{  add(new Pair<>(3, 4));  add(new Pair<>(1, 7));  add(new Pair<>(15, 3));  add(new Pair<>(9, 9));  add(new Pair<>(16, 4));  add(new Pair<>(16, 7));  add(new Pair<>(5, 19));  add(new Pair<>(8, 17));  add(new Pair<>(19, 9));  add(new Pair<>(17, 11));  add(new Pair<>(13, 15));  add(new Pair<>(12, 17));  add(new Pair<>(11, 18));  add(new Pair<>(18, 12));  add(new Pair<>(20, 11));  add(new Pair<>(17, 14));  add(new Pair<>(19, 13));  add(new Pair<>(12, 20));  add(new Pair<>(20, 19));  add(new Pair<>(19, 20));  }});
                add(new ArrayList<>() {{  add(new Pair<>(1, 7));  add(new Pair<>(3, 4));  add(new Pair<>(5, 19));  add(new Pair<>(9, 9));  add(new Pair<>(8, 17));  add(new Pair<>(11, 18));  add(new Pair<>(12, 17));  add(new Pair<>(12, 20));  add(new Pair<>(13, 15));  add(new Pair<>(15, 3));  add(new Pair<>(16, 4));  add(new Pair<>(16, 7));  add(new Pair<>(17, 11));  add(new Pair<>(17, 14));  add(new Pair<>(18, 12));  add(new Pair<>(19, 9));  add(new Pair<>(19, 13));  add(new Pair<>(20, 11));  add(new Pair<>(19, 20));  add(new Pair<>(20, 19));  }});
                add(new ArrayList<>() {{  add(new Pair<>(1, 7));  add(new Pair<>(3, 4));  add(new Pair<>(5, 19));  add(new Pair<>(9, 9));  add(new Pair<>(8, 17));  add(new Pair<>(15, 3));  add(new Pair<>(11, 18));  add(new Pair<>(12, 17));  add(new Pair<>(16, 4));  add(new Pair<>(13, 15));  add(new Pair<>(12, 20));  add(new Pair<>(16, 7));  add(new Pair<>(17, 11));  add(new Pair<>(17, 14));  add(new Pair<>(18, 12));  add(new Pair<>(19, 9));  add(new Pair<>(19, 13));  add(new Pair<>(20, 11));  add(new Pair<>(19, 20));  add(new Pair<>(20, 19));  }});
                add(new ArrayList<>() {{  add(new Pair<>(3, 4));  add(new Pair<>(1, 7));  add(new Pair<>(9, 9));  add(new Pair<>(15, 3));  add(new Pair<>(16, 4));  add(new Pair<>(5, 19));  add(new Pair<>(16, 7));  add(new Pair<>(8, 17));  add(new Pair<>(13, 15));  add(new Pair<>(17, 11));  add(new Pair<>(11, 18));  add(new Pair<>(12, 17));  add(new Pair<>(19, 9));  add(new Pair<>(18, 12));  add(new Pair<>(17, 14));  add(new Pair<>(12, 20));  add(new Pair<>(20, 11));  add(new Pair<>(19, 13));  add(new Pair<>(19, 20));  add(new Pair<>(20, 19));  }});
                add(new ArrayList<>() {{  add(new Pair<>(1, 7));  add(new Pair<>(3, 4));  add(new Pair<>(5, 19));  add(new Pair<>(9, 9));  add(new Pair<>(8, 17));  add(new Pair<>(15, 3));  add(new Pair<>(16, 4));  add(new Pair<>(11, 18));  add(new Pair<>(12, 17));  add(new Pair<>(16, 7));  add(new Pair<>(13, 15));  add(new Pair<>(12, 20));  add(new Pair<>(17, 11));  add(new Pair<>(17, 14));  add(new Pair<>(19, 9));  add(new Pair<>(18, 12));  add(new Pair<>(19, 13));  add(new Pair<>(20, 11));  add(new Pair<>(19, 20));  add(new Pair<>(20, 19));  }});
                add(new ArrayList<>() {{  add(new Pair<>(1, 7));  add(new Pair<>(3, 4));  add(new Pair<>(9, 9));  add(new Pair<>(15, 3));  add(new Pair<>(5, 19));  add(new Pair<>(16, 4));  add(new Pair<>(8, 17));  add(new Pair<>(16, 7));  add(new Pair<>(11, 18));  add(new Pair<>(13, 15));  add(new Pair<>(12, 17));  add(new Pair<>(17, 11));  add(new Pair<>(12, 20));  add(new Pair<>(19, 9));  add(new Pair<>(18, 12));  add(new Pair<>(17, 14));  add(new Pair<>(20, 11));  add(new Pair<>(19, 13));  add(new Pair<>(19, 20));  add(new Pair<>(20, 19));  }});
                add(new ArrayList<>() {{  add(new Pair<>(3, 4));  add(new Pair<>(1, 7));  add(new Pair<>(9, 9));  add(new Pair<>(15, 3));  add(new Pair<>(16, 4));  add(new Pair<>(5, 19));  add(new Pair<>(16, 7));  add(new Pair<>(8, 17));  add(new Pair<>(13, 15));  add(new Pair<>(17, 11));  add(new Pair<>(11, 18));  add(new Pair<>(19, 9));  add(new Pair<>(12, 17));  add(new Pair<>(18, 12));  add(new Pair<>(17, 14));  add(new Pair<>(12, 20));  add(new Pair<>(20, 11));  add(new Pair<>(19, 13));  add(new Pair<>(19, 20));  add(new Pair<>(20, 19));  }});
                add(new ArrayList<>() {{  add(new Pair<>(3, 4));  add(new Pair<>(1, 7));  add(new Pair<>(15, 3));  add(new Pair<>(9, 9));  add(new Pair<>(16, 4));  add(new Pair<>(16, 7));  add(new Pair<>(5, 19));  add(new Pair<>(8, 17));  add(new Pair<>(19, 9));  add(new Pair<>(17, 11));  add(new Pair<>(13, 15));  add(new Pair<>(18, 12));  add(new Pair<>(20, 11));  add(new Pair<>(12, 17));  add(new Pair<>(11, 18));  add(new Pair<>(17, 14));  add(new Pair<>(19, 13));  add(new Pair<>(12, 20));  add(new Pair<>(20, 19));  add(new Pair<>(19, 20));  }});
                add(new ArrayList<>() {{  add(new Pair<>(3, 4));  add(new Pair<>(1, 7));  add(new Pair<>(15, 3));  add(new Pair<>(16, 4));  add(new Pair<>(9, 9));  add(new Pair<>(16, 7));  add(new Pair<>(19, 9));  add(new Pair<>(17, 11));  add(new Pair<>(8, 17));  add(new Pair<>(18, 12));  add(new Pair<>(5, 19));  add(new Pair<>(20, 11));  add(new Pair<>(13, 15));  add(new Pair<>(17, 14));  add(new Pair<>(19, 13));  add(new Pair<>(12, 17));  add(new Pair<>(11, 18));  add(new Pair<>(12, 20));  add(new Pair<>(20, 19));  add(new Pair<>(19, 20));  }});
                add(new ArrayList<>() {{  add(new Pair<>(1, 7));  add(new Pair<>(3, 4));  add(new Pair<>(5, 19));  add(new Pair<>(8, 17));  add(new Pair<>(9, 9));  add(new Pair<>(11, 18));  add(new Pair<>(12, 17));  add(new Pair<>(12, 20));  add(new Pair<>(13, 15));  add(new Pair<>(15, 3));  add(new Pair<>(16, 4));  add(new Pair<>(16, 7));  add(new Pair<>(17, 11));  add(new Pair<>(17, 14));  add(new Pair<>(18, 12));  add(new Pair<>(19, 9));  add(new Pair<>(19, 13));  add(new Pair<>(20, 11));  add(new Pair<>(19, 20));  add(new Pair<>(20, 19));  }});
                add(new ArrayList<>() {{  add(new Pair<>(1, 7));  add(new Pair<>(3, 4));  add(new Pair<>(5, 19));  add(new Pair<>(9, 9));  add(new Pair<>(8, 17));  add(new Pair<>(11, 18));  add(new Pair<>(15, 3));  add(new Pair<>(12, 17));  add(new Pair<>(13, 15));  add(new Pair<>(12, 20));  add(new Pair<>(16, 4));  add(new Pair<>(16, 7));  add(new Pair<>(17, 11));  add(new Pair<>(17, 14));  add(new Pair<>(18, 12));  add(new Pair<>(19, 9));  add(new Pair<>(19, 13));  add(new Pair<>(20, 11));  add(new Pair<>(19, 20));  add(new Pair<>(20, 19));  }});
                add(new ArrayList<>() {{  add(new Pair<>(3, 4));  add(new Pair<>(1, 7));  add(new Pair<>(9, 9));  add(new Pair<>(15, 3));  add(new Pair<>(16, 4));  add(new Pair<>(5, 19));  add(new Pair<>(16, 7));  add(new Pair<>(8, 17));  add(new Pair<>(13, 15));  add(new Pair<>(17, 11));  add(new Pair<>(19, 9));  add(new Pair<>(11, 18));  add(new Pair<>(12, 17));  add(new Pair<>(18, 12));  add(new Pair<>(17, 14));  add(new Pair<>(20, 11));  add(new Pair<>(12, 20));  add(new Pair<>(19, 13));  add(new Pair<>(19, 20));  add(new Pair<>(20, 19));  }});
                add(new ArrayList<>() {{  add(new Pair<>(1, 7));  add(new Pair<>(3, 4));  add(new Pair<>(5, 19));  add(new Pair<>(9, 9));  add(new Pair<>(8, 17));  add(new Pair<>(11, 18));  add(new Pair<>(12, 17));  add(new Pair<>(15, 3));  add(new Pair<>(12, 20));  add(new Pair<>(13, 15));  add(new Pair<>(16, 4));  add(new Pair<>(16, 7));  add(new Pair<>(17, 11));  add(new Pair<>(17, 14));  add(new Pair<>(18, 12));  add(new Pair<>(19, 9));  add(new Pair<>(19, 13));  add(new Pair<>(20, 11));  add(new Pair<>(19, 20));  add(new Pair<>(20, 19));  }});
                add(new ArrayList<>() {{  add(new Pair<>(1, 7));  add(new Pair<>(3, 4));  add(new Pair<>(5, 19));  add(new Pair<>(9, 9));  add(new Pair<>(8, 17));  add(new Pair<>(15, 3));  add(new Pair<>(16, 4));  add(new Pair<>(11, 18));  add(new Pair<>(12, 17));  add(new Pair<>(13, 15));  add(new Pair<>(16, 7));  add(new Pair<>(12, 20));  add(new Pair<>(17, 11));  add(new Pair<>(17, 14));  add(new Pair<>(19, 9));  add(new Pair<>(18, 12));  add(new Pair<>(19, 13));  add(new Pair<>(20, 11));  add(new Pair<>(19, 20));  add(new Pair<>(20, 19));  }});
                add(new ArrayList<>() {{  add(new Pair<>(1, 7));  add(new Pair<>(3, 4));  add(new Pair<>(9, 9));  add(new Pair<>(5, 19));  add(new Pair<>(8, 17));  add(new Pair<>(15, 3));  add(new Pair<>(16, 4));  add(new Pair<>(16, 7));  add(new Pair<>(11, 18));  add(new Pair<>(12, 17));  add(new Pair<>(13, 15));  add(new Pair<>(12, 20));  add(new Pair<>(17, 11));  add(new Pair<>(19, 9));  add(new Pair<>(17, 14));  add(new Pair<>(18, 12));  add(new Pair<>(19, 13));  add(new Pair<>(20, 11));  add(new Pair<>(19, 20));  add(new Pair<>(20, 19));  }});
                add(new ArrayList<>() {{  add(new Pair<>(1, 7));  add(new Pair<>(3, 4));  add(new Pair<>(9, 9));  add(new Pair<>(15, 3));  add(new Pair<>(5, 19));  add(new Pair<>(16, 4));  add(new Pair<>(8, 17));  add(new Pair<>(16, 7));  add(new Pair<>(11, 18));  add(new Pair<>(13, 15));  add(new Pair<>(12, 17));  add(new Pair<>(17, 11));  add(new Pair<>(19, 9));  add(new Pair<>(12, 20));  add(new Pair<>(18, 12));  add(new Pair<>(17, 14));  add(new Pair<>(20, 11));  add(new Pair<>(19, 13));  add(new Pair<>(19, 20));  add(new Pair<>(20, 19));  }});
                add(new ArrayList<>() {{  add(new Pair<>(3, 4));  add(new Pair<>(1, 7));  add(new Pair<>(9, 9));  add(new Pair<>(15, 3));  add(new Pair<>(16, 4));  add(new Pair<>(16, 7));  add(new Pair<>(5, 19));  add(new Pair<>(8, 17));  add(new Pair<>(13, 15));  add(new Pair<>(17, 11));  add(new Pair<>(19, 9));  add(new Pair<>(11, 18));  add(new Pair<>(12, 17));  add(new Pair<>(18, 12));  add(new Pair<>(17, 14));  add(new Pair<>(20, 11));  add(new Pair<>(12, 20));  add(new Pair<>(19, 13));  add(new Pair<>(19, 20));  add(new Pair<>(20, 19));  }});
                add(new ArrayList<>() {{  add(new Pair<>(1, 7));  add(new Pair<>(3, 4));  add(new Pair<>(5, 19));  add(new Pair<>(9, 9));  add(new Pair<>(8, 17));  add(new Pair<>(15, 3));  add(new Pair<>(11, 18));  add(new Pair<>(16, 4));  add(new Pair<>(12, 17));  add(new Pair<>(13, 15));  add(new Pair<>(16, 7));  add(new Pair<>(12, 20));  add(new Pair<>(17, 11));  add(new Pair<>(17, 14));  add(new Pair<>(18, 12));  add(new Pair<>(19, 9));  add(new Pair<>(19, 13));  add(new Pair<>(20, 11));  add(new Pair<>(19, 20));  add(new Pair<>(20, 19));  }});
                add(new ArrayList<>() {{  add(new Pair<>(1, 7));  add(new Pair<>(3, 4));  add(new Pair<>(9, 9));  add(new Pair<>(5, 19));  add(new Pair<>(15, 3));  add(new Pair<>(16, 4));  add(new Pair<>(8, 17));  add(new Pair<>(16, 7));  add(new Pair<>(11, 18));  add(new Pair<>(13, 15));  add(new Pair<>(12, 17));  add(new Pair<>(17, 11));  add(new Pair<>(12, 20));  add(new Pair<>(19, 9));  add(new Pair<>(18, 12));  add(new Pair<>(17, 14));  add(new Pair<>(20, 11));  add(new Pair<>(19, 13));  add(new Pair<>(19, 20));  add(new Pair<>(20, 19));  }});
                add(new ArrayList<>() {{  add(new Pair<>(1, 7));  add(new Pair<>(3, 4));  add(new Pair<>(5, 19));  add(new Pair<>(9, 9));  add(new Pair<>(8, 17));  add(new Pair<>(15, 3));  add(new Pair<>(11, 18));  add(new Pair<>(12, 17));  add(new Pair<>(13, 15));  add(new Pair<>(16, 4));  add(new Pair<>(12, 20));  add(new Pair<>(16, 7));  add(new Pair<>(17, 11));  add(new Pair<>(17, 14));  add(new Pair<>(18, 12));  add(new Pair<>(19, 9));  add(new Pair<>(19, 13));  add(new Pair<>(20, 11));  add(new Pair<>(19, 20));  add(new Pair<>(20, 19));  }});
                add(new ArrayList<>() {{  add(new Pair<>(3, 4));  add(new Pair<>(1, 7));  add(new Pair<>(9, 9));  add(new Pair<>(15, 3));  add(new Pair<>(16, 4));  add(new Pair<>(5, 19));  add(new Pair<>(8, 17));  add(new Pair<>(16, 7));  add(new Pair<>(13, 15));  add(new Pair<>(11, 18));  add(new Pair<>(12, 17));  add(new Pair<>(17, 11));  add(new Pair<>(19, 9));  add(new Pair<>(12, 20));  add(new Pair<>(18, 12));  add(new Pair<>(17, 14));  add(new Pair<>(20, 11));  add(new Pair<>(19, 13));  add(new Pair<>(19, 20));  add(new Pair<>(20, 19));  }});
                add(new ArrayList<>() {{  add(new Pair<>(15, 3));  add(new Pair<>(3, 4));  add(new Pair<>(16, 4));  add(new Pair<>(1, 7));  add(new Pair<>(16, 7));  add(new Pair<>(9, 9));  add(new Pair<>(19, 9));  add(new Pair<>(17, 11));  add(new Pair<>(20, 11));  add(new Pair<>(18, 12));  add(new Pair<>(19, 13));  add(new Pair<>(17, 14));  add(new Pair<>(13, 15));  add(new Pair<>(8, 17));  add(new Pair<>(12, 17));  add(new Pair<>(11, 18));  add(new Pair<>(5, 19));  add(new Pair<>(20, 19));  add(new Pair<>(12, 20));  add(new Pair<>(19, 20));  }});
            }
        });


        boolean[] inputsPassed = new boolean[numOfTests];
        double[] testTimes = new double[numOfTests];


        System.out.println("""
                
                =======================================================================================
                                               Testing Foreman ...
                =======================================================================================""");


        for (int currentIndex = 0; currentIndex < numOfTests; ++currentIndex) {
            int testNumber = currentIndex + 1;
            ArrayList<Pair<Integer, Integer>> inputList = inputLists.get(currentIndex);
            ArrayList<ArrayList<Pair<Integer, Integer>>> expectedList = expectedLists.get(currentIndex);

            System.out.printf("""
                    
                    -------------------------------
                             Input List %s
                    -------------------------------
                    %s
                    """, testNumber, getListAsString(inputList));

            long startTime = System.nanoTime();

            ArrayList<ArrayList<Pair<Integer, Integer>>> resultList = StudentSolver.solve(inputList);

            long endTime = System.nanoTime();
            testTimes[currentIndex] = (double) (endTime - startTime) / 1_000_000_000;

            StringBuilder resultListsAsString = new StringBuilder();
            for (ArrayList<Pair<Integer, Integer>> list : resultList)
                resultListsAsString.append(getListAsString(list)).append("\n");

            StringBuilder expectedListsAsString = new StringBuilder();
            for (ArrayList<Pair<Integer, Integer>> list : expectedList)
                expectedListsAsString.append(getListAsString(list)).append("\n");

            System.out.printf("""
                    
                    -------------------------------
                          Simulated Results %s
                    -------------------------------
                    %s
                    Number of lists: %d
                    """, testNumber, resultListsAsString, resultList.size());

            System.out.printf("""
                    
                    ------------------------------
                          Expected Results %s
                    ------------------------------
                    %s
                    Number of lists: %d
                    """, testNumber, expectedListsAsString, expectedList.size());

            if (listsMatch(resultList, expectedList)) {
                inputsPassed[currentIndex] = true;
                ++numOfTestsPassed;
            }

            System.out.println("\n=======================================================================================");
        }

        StringBuilder testLog = new StringBuilder();

        for (int i = 0; i < numOfTests; ++i)
            testLog.append("\nTest ").append(i + 1).append(":\t ").append(inputsPassed[i] ? "+ Passed" : "- Failed");
        testLog.append("\n\nTests passed:\t").append(numOfTestsPassed).append(" / ").append(numOfTests);

        System.out.println(testLog);

        System.out.println("\n=======================================================================================");

        StringBuilder timeLog = new StringBuilder();
        double elapsedTime = 0;

        for (double time : testTimes)
            elapsedTime += time;

        for (int i = 0; i < numOfTests; ++i)
            timeLog.append("\nTest ").append(i + 1).append(" time:\t").append(testTimes[i]).append(" seconds");
        timeLog.append("\n\nTotal execution time:\t").append(elapsedTime).append(" seconds");

        System.out.println(timeLog);

        System.out.println("\n=======================================================================================");
    }

    /**
     * Returns the ArrayList of integer Pairs as a String.
     *
     * @param inputList the provided ArrayList of integer Pairs
     * @return the ArrayList of integer Pairs as a String
     */
    public static String getListAsString(ArrayList<Pair<Integer, Integer>> inputList) {

        StringBuilder listToString = new StringBuilder();
        int count = 0;

        // add each integer from the pair to the string
        for (Pair<Integer, Integer> pair : inputList) {
            if (count == 0)
                ++count;
            else
                listToString.append(", ");

            listToString.append("(").append(pair.first).append(", ").append(pair.second).append(")");
        }

        return listToString.toString();
    }

    /**
     * Returns true if the input list of sorted lists has all matching elements and sizes of each list within the
     * expected list of sorted lists.
     *
     * @param inputList the input list of lists of pairs of integers
     * @param expectedList the expected list of lists of pairs of integers
     * @return true if the contents of the lists match; false otherwise
     */
    public static boolean listsMatch(ArrayList<ArrayList<Pair<Integer, Integer>>> inputList,
                                              ArrayList<ArrayList<Pair<Integer, Integer>>> expectedList) {

        int inputSize = inputList.size();

        // the number of possible sorted lists must match
        if (inputSize != expectedList.size())
            return false;

        // traverse through all sorted lists
        for (int i = 0; i < inputSize; ++i) {
            ArrayList<Pair<Integer, Integer>> currentInputList = inputList.get(i);
            int currentListSize = currentInputList.size();
            boolean found = false;

            // all internal list sizes must match
            if (currentListSize != expectedList.get(i).size())
                return false;

            // check each sorted list from the input list against all other sorted lists in the expected list
            for (int j = 0; j < inputSize; ++j) {
                ArrayList<Pair<Integer, Integer>> currentExpectedList = expectedList.get(j);
                int currentExpectedSize = currentExpectedList.size();

                // traverse all pairs in each list
                for (int k = 0; k < currentExpectedSize; ++k) {
                    // if the first and second values don't match, skip to the next one
                    if (!currentInputList.get(k).equals(currentExpectedList.get(k)))
                        break;

                    // if we've reached this point, a matching sorted list has been found
                    if (k == currentExpectedSize - 1) {
                        found = true;
                        break;
                    }
                }

                // we can break out early if we've already found a match
                if (found)
                    break;
            }

            // if we've iterated through all lists without finding a match, a sorted list is missing from the input list
            if (!found)
                return false;
        }

        // if we've reached this point, all sorted lists in the input lists exist in the expected lists
        return true;
    }
}
