public class CakeCase {
    public static void main(String[] args) {
        for (int cakeBox = 1; cakeBox <= 50; cakeBox++) {
            if (cakeBox == 27) break;  // Stop checking when you find a spoiled cake
            if (cakeBox % 5 != 0) continue; // Only inspect every 5th box
            System.out.println("Inspecting cake box number: " + cakeBox);
        }
    }
}

