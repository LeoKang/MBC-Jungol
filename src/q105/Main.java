package q105;

public class Main {
    public static void main(String[] args) {
        String[][] data = {
                {"Seoul", "10,312,545", "+91,375"},
                {"Pusan", "3,567,910", "+5,868"},
                {"Incheon", "2,758,296", "+64,888"},
                {"Daegu", "2,511,676", "+17,230"},
                {"Gwangju", "1,454,636", "+29,774"}
        };

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.printf("%15s", data[i][j]);
            }
            System.out.println();
        }
    }
}

//public class Main {
//    public static void main(String[] args) {
//        System.out.printf("%15s%15s%15s\n", "Seoul", "10,312,545", "+91,375");
//        System.out.printf("%15s%15s%15s\n", "Pusan", "3,567,910", "+5,868");
//        System.out.printf("%15s%15s%15s\n", "Incheon", "2,758,296", " +64,888");
//        System.out.printf("%15s%15s%15s\n", "Daegu", "2,511,676", "+17,230");
//        System.out.printf("%15s%15s%15s\n", "Gwangju", "1,454,636", " +29,774");
//    }
//}
