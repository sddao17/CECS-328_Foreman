
import java.util.ArrayList;

/**
 * @author Steven Dao
 * @version 1.0
 *
 * Date: October 5, 2021
 * Purpose: To create the class StudentSolver that arranges in increasing order the total amount of work that
 *          teams can accomplish given set unit hours using numerical pairs.
 */
public class StudentSolver {

    /**
     * Creates and returns an ArrayList of all possible sorted combinations of the provided Pairs of integers.
     *
     * @param list the list of Pairs of integers that we need to make possible lists for
     * @return the ArrayList of all possible combinations of sorted lists of pairs
     */
    public static ArrayList<ArrayList<Pair<Integer, Integer>>> solve(ArrayList<Pair<Integer, Integer>> list) {

        // return the possible sorted lists when finished with all sorting
        ArrayList<ArrayList<Pair<Integer, Integer>>> possibleLists = new ArrayList<>();

        // keep track of some possible units of time for a and b
        ArrayList<Pair<Double, Double>> unitHoursList = new ArrayList<>();
        // keep track of the highest number we want to find for combinations of unit hours
        double maxHours = 2_000_000_001;
        // keep track of the increments to control timeouts
        double increment = 20_000_000;

        // add all pairs of non-equal integer-doubles between 1 and our set maxHours to our unit hours list
        for (double a = 1; a <= maxHours; a += increment)
            for (double b = 1; b <= maxHours; b += increment)
                // it's given that a != b
                if (a != b)
                    unitHoursList.add(new Pair<>(a, b));

        // find sorted pairs for each combination of unit hours
        for (Pair<Double, Double> unitHours : unitHoursList) {
            // sort the pairs according to their equivalent unit hours worked
            ArrayList<Pair<Integer, Integer>> currentList = pairMergeSort(list, unitHours);

            // only add non-repeating sorted lists to our final list
            if (!sortedListsContainsList(possibleLists, currentList))
                possibleLists.add(currentList);
        }

        return possibleLists;
    }

    /**
     * Returns the sorted list of integer pairs given the initial pairs and the applied unit hours for the team
     * using merge-sort logic.
     *
     * @param pairList the pair lists representing the teams of workers
     * @param unitHours the given unit hours representing a and b
     * @return the sorted list of pairs
     */
    private static ArrayList<Pair<Integer, Integer>> pairMergeSort(ArrayList<Pair<Integer, Integer>> pairList,
                                                           Pair<Double, Double> unitHours) {

        // store the size to prevent excessive method calls within loops
        int pairListSize = pairList.size();

        // base case: exit the branch when there are no more pairs to compare
        if (pairListSize < 2)
            return pairList;

        // return the sorted pair list when finished with all sorting
        ArrayList<Pair<Integer, Integer>> sortedPairList = new ArrayList<>();
        // find the middle point of the list size, rounded down
        int middle = Math.floorDiv(pairListSize, 2);

        // create a sub ArrayList that will consist of all elements from index 0 to the middle of the pair list
        ArrayList<Pair<Integer, Integer>> pairsZeroToMid = new ArrayList<>();

        // add each element from index 0 to the middle of the pair list
        for (int i = 0; i < middle; ++i)
            pairsZeroToMid.add(pairList.get(i));

        // create a sub ArrayList that will consist of all elements from the middle to the end of the pair list
        ArrayList<Pair<Integer, Integer>> pairsMidToEnd = new ArrayList<>();

        // add each element from the middle to the end of the pair list
        for (int i = middle; i < pairListSize; ++i)
            pairsMidToEnd.add(pairList.get(i));

        // merge-sort logic - halve the lists and branch off, sorting through each pair of lists
        ArrayList<Pair<Integer, Integer>> leftBranch = pairMergeSort(pairsZeroToMid, unitHours);
        ArrayList<Pair<Integer, Integer>> rightBranch = pairMergeSort(pairsMidToEnd, unitHours);

        // continue while each branch has not been fully evaluated yet
        while (leftBranch.size() > 0 && rightBranch.size() > 0) {
            // store the pairs we are currently comparing for readability
            Pair<Integer, Integer> leftCurrentPair = leftBranch.get(0);
            Pair<Integer, Integer> rightCurrentPair = rightBranch.get(0);

            // if the left pair's hours is greater than the right pair's hours, then we add the lesser value
            if (getUnitHoursWorked(leftCurrentPair, unitHours) > getUnitHoursWorked(rightCurrentPair, unitHours)) {
                // add to the sorted pair list and remove the current pair from its branch
                sortedPairList.add(rightCurrentPair);
                rightBranch.remove(0);

                // we do the same for the right branch comparing to the left branch, and if they are equal
            } else {
                // add to the sorted pair list and remove the current pair from its branch
                sortedPairList.add(leftCurrentPair);
                leftBranch.remove(0);
            }
        }

        // add any leftover branches of both left and right sides to the sorted pair list
        sortedPairList.addAll(leftBranch);
        sortedPairList.addAll(rightBranch);

        return sortedPairList;
    }

    /**
     * Returns the total unit hours the given team can achieve.
     *
     * @param workerRates the work rate of the team of workers (x(a), x(b))
     * @param unitHours the unit of hours (a, b) for the worker pair
     * @return the team's total unit hours
     */
    private static double getUnitHoursWorked(Pair<Integer, Integer> workerRates, Pair<Double, Double> unitHours) {

        // multiply each worker's rate by their given unit hours and return their total
        return (workerRates.first * unitHours.first) + (workerRates.second * unitHours.second);
    }

    /**
     * Returns true if the list of sorted lists contains the input list.
     *
     * @param sortedLists the list of sorted lists
     * @param inputList the input list to check against the sorted lists
     * @return true if the sorted lists contain the input list; false otherwise.
     */
    private static boolean sortedListsContainsList(ArrayList<ArrayList<Pair<Integer, Integer>>> sortedLists,
                                                  ArrayList<Pair<Integer, Integer>> inputList) {

        // the input list does not yet exist within the sorted lists if it's empty
        if (sortedLists.size() == 0)
            return false;

        // store the size to prevent excessive method calls within loops
        int listSize = sortedLists.get(0).size();

        // iterate through all the sorted pair lists
        for (ArrayList<Pair<Integer, Integer>> sortedList : sortedLists) {
            // check each sorted pair list against our input list
            for (int i = 0; i < listSize; ++i) {

                // if the compared pair values are not the same, immediately continue on the next list
                if (!sortedList.get(i).equals(inputList.get(i)))
                    break;

                // if we've reached this point, a matching sorted list has been found
                if (i == listSize - 1)
                    return true;
            }
        }

        // if we've reached this point, the input list does not yet exist in the sorted lists
        return false;
    }
}
