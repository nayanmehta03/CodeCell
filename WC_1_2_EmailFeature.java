
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
public class WC_1_2_EmailFeature {



        public static void numUniqueEmails(String[] emails) {
            Set<String> set = new HashSet<>();

            for (String email : emails) {
                String localName = email.split("@")[0];
                String domainName = email.split("@")[1];

                localName = localName.replace(".", "");
                int index = localName.indexOf('+');
                if (index != -1) {
                    localName = localName.substring(0, index);
                }

                set.add(localName + "@" + domainName);
            }

            System.out.println(set.size());
        }

        public static void main(String[] args)
            {
            Scanner reader = new Scanner(System.in);
            String[] inputLine = new String[1000];

            String input = reader.nextLine();
            inputLine = input.split(" ");
            numUniqueEmails(inputLine);
        }

    }

