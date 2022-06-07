public class main {
    public static void main(String[] args) {
        int birthMonth = 7;

        if (birthMonth >= 1)
        {
            if (birthMonth <= 12) {
                System.out.println("Your birth month is: " + birthMonth);
            }
            else
            {
                System.out.println("You entered an incorrect month value: " + birthMonth);
            }
        }
        else
        {
            System.out.println("You entered an incorrect month value: " + birthMonth);
        }
    }
}
