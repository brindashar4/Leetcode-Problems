public class Add_Digits_258 {

    public int addDigits(int num) {
        String n = Integer.toString(num);
        int size = n.length();
        int s1 = size - 1;
        int addn = 0;
        while (s1 >= 0) {
            addn += Character.getNumericValue(n.charAt(s1));
            s1--;
        }
        if (addn >= 10) {
            addn = addDigits(addn);
        }
        return addn;
    }
}
