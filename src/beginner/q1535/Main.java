package beginner.q1535;

import java.util.*;

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        LinkedHashSet<String> words = new LinkedHashSet<>();
//
//        while (sc.hasNextLine()) {
//            String line = sc.nextLine().trim();
//            if (line.equals("END")) break;
//            if (line.isEmpty()) continue;
//
//            for (String w : line.split("\\s+")) {
//                words.add(w);
//            }
//            System.out.println(String.join(" ", words));
//        }
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        ArrayList<String> list = new ArrayList<>();
//
//        while (sc.hasNextLine()) {
//            String line = sc.nextLine().trim();
//            if (line.equals("END")) break;
//
//            String[] tokens = line.split(" ");
//
//            for (String token : tokens) {
//                if (token.isEmpty()) continue;
//
//                if (!list.contains(token)) {
//                    list.add(token);
//                }
//            }
//
//            for (String word : list) {
//                System.out.print(word + " ");
//            }
//            System.out.println();
//        }
//
//        sc.close();
//    }
//}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Set<String> set = new HashSet<>();

        do {
            String inp = sc.nextLine();
            if (inp.equals("END"))
                break;
            StringTokenizer st = new StringTokenizer(inp);
            while (st.hasMoreTokens()) {
                String token = st.nextToken();
                if (!set.contains(token)) {
                    sb.append(token + " ");
                    set.add(token);
                }
            }
            System.out.println(sb);
        } while (true);
        sc.close();
    }
}
