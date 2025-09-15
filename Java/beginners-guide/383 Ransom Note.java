class Solution {

    public boolean canConstruct(String ransomNote, String magazine) {

        // HashMap here works as python's dictionarys
        HashMap<Character, Integer> magazineLetters = new HashMap<>();

        // Updates the HashMap to have all the characters presents in magazine and count the amount of letters
        for (int i = 0; i < magazine.length(); i++) {

            char magazineChar = magazine.charAt(i);
            int currentCount = magazineLetters.getOrDefault(magazineChar, 0);

            magazineLetters.put(magazineChar, currentCount + 1);
        }

        // Updates the HashMap again, now checking if it has enough letters to use for ransomNote
        for (int i = 0; i < ransomNote.length(); i++) {

            char ransomChar = ransomNote.charAt(i);
            int currentCount = magazineLetters.getOrDefault(ransomChar, 0);

            if (currentCount == 0) {
                return false;
            }

            magazineLetters.put(ransomChar, currentCount - 1);
        }

        // If it had enough characters i.e. currentCount != 0, it returns true
        return true;
    }
}
