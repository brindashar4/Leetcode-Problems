class Roman_to_Integer_13 {
    public int romanToInt(String s) {
        HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
        hmap.put('I', 1);
        hmap.put('V', 5);
        hmap.put('X', 10);
        hmap.put('L', 50);
        hmap.put('C', 100);
        hmap.put('D', 500);
        hmap.put('M', 1000);
        int index = s.length() - 1;
        int result = 0;
        for (int i = index; i >= 0; i--) {
            if (i >= 1) {
                String sub = s.substring(i - 1, i + 1);
                int x = hmap.get(sub.charAt(0));
                int y = hmap.get(sub.charAt(1));

                if (x < y)
                    result += y - x;
                else if (x > y && i < index && y < hmap.get(s.charAt(i + 1))) {
                    result += x - y;
                } else
                    result += x + y;
                i--;
            } else if (i == 0) {
                int x = hmap.get(s.charAt(0));
                if (index > 0 && x < hmap.get(s.charAt(i + 1))) {
                    result -= x;
                } else
                    result += x;
            }
        }
        return result;
    }
}