package converter;
import java.util.Scanner;

public class RomanConverter {
    public static void main(String[] args) {
        
    
    Scanner scan = new Scanner(System.in);
    RomanConverter converter = new RomanConverter();

    System.out.print("Enter an integer: ");
    int dec = scan.nextInt();

    String romanResult = converter.toRoman(dec);
    System.out.println("Roman Numeral:" + romanResult);

    int ogDec = converter.toNum(romanResult);
    System.out.println("Converter back to Dec:" + ogDec);

    scan.close();
    }

    
    public String toRoman(int num) {
        if (num<= 0) return "";
        if (num >= 1000) return "M" + toRoman(num - 1000);
        if (num >= 500) return "D" + toRoman(num - 500);
        if (num >= 100) return "C" + toRoman(num - 100);
        if (num >= 50) return "L" + toRoman(num - 50);
        if (num >= 10) return "X" + toRoman(num - 10);
        if (num >= 9) return "IX" + toRoman(num - 9);
        if (num >= 4) return "IV" + toRoman(num - 4);
        if (num >= 5) return "V" + toRoman(num - 5);
        if (num >= 1) return "I" + toRoman(num - 1);

        return "";

    }

    public int toNum(String romanNum) {

        if (romanNum == null || romanNum.length() == 0) return 0;
    
        char c = romanNum.toUpperCase().charAt(0);
        int value = 0;
    
        switch(c) {
            case 'M': value = 1000; break;
            case 'D': value = 500; break;
            case 'C': value = 100; break;
            case 'L': value = 50; break;
            case 'X': value = 10; break;
            case 'V': value = 5; break;
            case 'I': value = 1; break;
        }
        return value + toNum(romanNum.substring(1));
    

    
    }
}
