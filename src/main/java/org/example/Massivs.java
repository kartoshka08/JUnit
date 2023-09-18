package org.example;

public class Massivs {
    public int[] sortMass() {
        try {
            int[] start = {1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4};
            int[] answer = new int[5];
            for (int i = 0; i < start.length; i++) {
                if (start[i] > 0) {
                    answer[i] = start[i];
                }
            }
            return answer;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
}
