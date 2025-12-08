package previous_yr_qs;

public class grand_children_count {
    public static int countGrandChildren(String[][] pairs, String person) {
            int count = 0;

            // Step 1: Find children of 'person'
            for (int i = 0; i < pairs.length; i++) {
                if (pairs[i][1].equals(person)) { // If person is father
                    String child = pairs[i][0];   // This is the child

                    // Step 2: Now check if this child is father of someone
                    for (int j = 0; j < pairs.length; j++) {
                        if (pairs[j][1].equals(child)) {
                            count++; // grandchild found
                        }
                    }
                }
            }
            return count;
        }

        public static void main(String[] args) {
            String[][] pairs = {
                    {"luke", "shaw"},
                    {"wayne", "rooney"},
                    {"rooney", "ronaldo"},
                    {"shaw", "rooney"}
            };

            System.out.println("Grandchildren of ronaldo: "
                    + countGrandChildren(pairs, "ronaldo"));
        }
    }

