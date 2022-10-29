public class richestCustomerWealth {

    public static int maxnumWealth(int[][] accounts) {
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {

                sum = sum + accounts[i][j];
            }

            maxi = Math.max(maxi, sum);

        }
        System.out.println(maxi);

        return maxi;
    }

    public static void main(String[] args) {
        int[][] accounts = { { 7, 1, 3 }, { 2, 8, 7 }, { 1, 9, 5 } };

        maxnumWealth(accounts);

    }

}
