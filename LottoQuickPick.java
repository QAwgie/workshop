import java.util.Arrays;
import java.util.Random;

public class LottoQuickPick {
    public static void main(String[] args) {
        final int NUM_LOTTO_NUMBERS = 6;
        final int MAX_NUMBER = 69;

        int[] lottoTicket = generateLottoTicket(NUM_LOTTO_NUMBERS, MAX_NUMBER);

        Arrays.sort(lottoTicket);
        
        System.out.println("Your Lotto Quick Pick ticket:");
        for (int number : lottoTicket) {
            System.out.print(number + " ");
        }
    }

    private static int[] generateLottoTicket(int numNumbers, int maxNumber) {
        int[] ticket = new int[numNumbers];
        Random random = new Random();
        int count = 0;

        while (count < numNumbers) {
            int randomNumber = random.nextInt(maxNumber) + 1;
            if (!contains(ticket, randomNumber)) {
                ticket[count] = randomNumber;
                count++;
            }
        }

        return ticket;
    }

    private static boolean contains(int[] array, int number) {
        for (int i : array) {
            if (i == number) {
                return true;
            }
        }
        return false;
    }
}
