//import java.io.IOException;
//import java.util.Scanner;
//
//public class J05004 {
//    static class Student{
//        String ma, name, date, clas;
//        int stt;
//        float gpa;
//        private static String chuanHoaTen(String name) {
//            name = name.replaceAll("\\s+", " ").trim();
//            String[] arr = name.split("\\s+");
//            int n = arr.length;
//            String res = "";
//            for (int i = 0; i < n; i++) {
//                arr[i] = arr[i].toLowerCase();
//                arr[i] = arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1);
//                res += arr[i];
//                if (i != n - 1) {
//                    res += " ";
//                }
//            }
//            return res;
//        }
//
//        private static String chuanHoaDate(String date) {
//            if (date.charAt(1) == '/') {
//                date = "0" + date;
//            }
//            if (date.charAt(4) == '/') {
//                date = date.substring(0, 3) + "0" + date.substring(3);
//            }
//            return date;
//        }
//
//        public Student(int stt, String name, String clas, String date, float gpa){
//            this.stt = stt;
//            this.ma = String.format("B20DCCN%03d", stt);
//            this.name = chuanHoaTen(name);
//            this.date = chuanHoaDate(date);
//            this.clas = clas;
//            this.gpa = gpa;
//        }
//
//        public String toString(){
//            return ma + " " + name + " " + clas + " " + date + " " + String.format("%.2f", gpa);
//        }
//
//    }
//    public static void main(String[] args) throws IOException, ClassNotFoundException {
////        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("DATA.in"));
////        List<String> b = new ArrayList<>();
////        b.add("Jhsf00dklT12uhf780LPPZH");
////        b.add("AAAAddd0000000000000000001T");
////        oos.writeObject(b);
////        oos.close();
////        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
////        List<String> arr = (ArrayList<String>) ois.readObject();
////        ois.close();
//
//        Scanner sc = new Scanner(System.in);
//        int t = Integer.parseInt(sc.nextLine());
//        for(int i = 1; i <= t; i++){
//            Student x = new Student(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()));
//            System.out.println(x);
//        }
//    }
//}
