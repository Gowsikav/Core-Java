public class WordFrequency
{
    public static void main(String[] args) {
        String text="This dog is very cute and very smart";
        text = text.toLowerCase();
        String[] words = text.split("\\s+");

        String[] unique = new String[words.length];
        int[] freq = new int[words.length];
        int uniqueIndex = 0;

        for(int i = 0; i < words.length; i++) {
            boolean found = false;
            for (int j = 0; j < uniqueIndex; j++) {
                if (words[i].equals(unique[j])) {
                    freq[j]++;
                    found = true;
                    break;
                }
            }
            if (!found) {
                unique[uniqueIndex] = words[i];
                freq[uniqueIndex] = 1;
                uniqueIndex++;
            }
        }

        System.out.println("Word Frequencies:");
        for (int i = 0; i < uniqueIndex; i++) {
            System.out.println(unique[i] + ": " + freq[i]);
        }
    }


    }

