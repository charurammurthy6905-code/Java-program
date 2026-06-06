public class banfre{
    public static void main(String[] args) {
        String str = "Banana";
        
        int[] freq = new int[256]; // For ASCII characters
        
        for (char ch : str.toCharArray()) {
            freq[ch]++;
        }
        
        System.out.println("Character Frequency in '" + str + "':");
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                System.out.println((char)i + " -> " + freq[i]);
            }
        }
    }
}