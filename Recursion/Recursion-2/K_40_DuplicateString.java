public class K_40_DuplicateString {
    public static void removeDupicate(String str, int indx,
     StringBuilder newstr, boolean map[]) {
        if (indx == str.length()) {
            System.out.println(newstr);
            return;
        }

        // work
        char currChar = str.charAt(indx);
        if (map[currChar - 'a'] == true) {
            removeDupicate(str, indx + 1, newstr, map);
        } else {
            map[currChar - 'a'] = true;
            removeDupicate(str, indx + 1, newstr.append(currChar), map);

        }
    }

    public static void main(String[] arg) {
        String str = "aabbccccsdsssddd";
        removeDupicate(str, 0, new StringBuilder(""), new boolean[26]);

    }

}
