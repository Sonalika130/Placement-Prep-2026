class ConcentricNOPattern {
    public static void main(String[] args) {

        int n = 4;
        int size = 2 * n - 1;

        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size; j++) {

                // Distance from each border
                int top = i;
                int left = j;
                int bottom = size - 1 - i;
                int right = size - 1 - j;

                // Nearest border
                int min = Math.min(Math.min(top, bottom),
                                   Math.min(left, right));

                // Print layer value
                System.out.print((n - min) + " ");
            }

            System.out.println();
        }
    }
}