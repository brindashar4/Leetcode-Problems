public class Valid_Parantheses_20 {
    public boolean isValid(String s) {
        HashMap<Character, String> hmap = new HashMap<>();
        hmap.put('}', "curly");
        hmap.put(')', "round");
        hmap.put(']', "square");
        hmap.put('{', "curly");
        hmap.put('(', "round");
        hmap.put('[', "square");

        ArrayList<Character> opening = new ArrayList<>();
        opening.add('{');
        opening.add('(');
        opening.add('[');
        if (s.length() == 1)
            return false;
        ArrayList<Character> seq = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            int length = seq.size() - 1;
            if (opening.contains(s.charAt(i)))
                seq.add(s.charAt(i));
            else {
                if (seq.size() == 0 || (hmap.get(s.charAt(i)) != hmap.get(seq.get(length))))
                    return false;
                else {
                    seq.remove(length);
                }
            }
            if (i == s.length() - 1 && seq.size() > 0)
                return false;
        }
        return true;
    }
}
