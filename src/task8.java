import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task8 {
    // TODO 5 practic. 2 task из 8...
//    public static void main(String[] args) {
//        int[] array = {5, 4, 7, 9, 13};
//        int[] massiv = {4, 2, 8, 14, 19, 5};
//        method(array, massiv);
//    }
//    public static void method(int[] array, int[] massiv) {
//        int sum = 0;
//        if (array.length != massiv.length) {
//            System.out.println("Массивдин узундугу бирдей эмес!");
//        }
//        for (int i = 0; i < array.length; i++) {
//            sum += array[i];
//        }
//        int sum2 = 0;
//        for (int i = 0; i < massiv.length; i++) {
//            sum2 += massiv[i];
//        }
//        System.out.println(sum + sum2);
//    }


    // TODO 5 practic. 2 task из 8... метод return.
//    public static void main(String[] args) {
//        int[] array = {5, 4, 7, 9, 13};
//        int[] massiv = {4, 2, 8, 14, 19, 5};
//        int mass =  method(array, massiv);
//        System.out.println(mass);
//    }
//    public static int method(int[] array, int[] massiv) {
//        int sum = 0;
//        if (array.length != massiv.length) {
//            System.out.println("Массивдин узундугу бирдей эмес!");
//        }
//        for (int i = 0; i < array.length; i++) {
//            sum += array[i];
//        }
//        int sum2 = 0;
//        for (int i = 0; i < massiv.length; i++) {
//            sum2 += massiv[i];
//        }
//        return sum + sum2;
//    }

    // TODO 5 practic. 4 task из 8...
//    public static void main(String[] args) {
//        int num = new Scanner(System.in).nextInt();
//        String str = "hello";
//        method(str, num);
//    }
//    public static void method(String str, int num) {
//        for (int i = 0; i < num; i++) {
//            System.out.println(str);
//        }
//    }


    // TODO 5 practic. 4 task из 8... метод return.
//    public static void main(String[] args) {
//        int num = new Scanner(System.in).nextInt();
//        String str = "hello";
//        String nn = method(str, num);
//        System.out.println(nn);
//    }
//    public static String  method(String str, int num) {
//        for (int i = 0; i < num; i++) {
//            System.out.println(str);
//        }
//        return "";
//    }


    // TODO 5 practic. 4 task из 8... метод return.
//    public static void main(String[] args) {
//        int num = new Scanner(System.in).nextInt();
//        String str = "hello";
//        String a = method(str, num);
//
//    }
//    public static String method(String str, int num) {
//        for (int i = 0; i < num; i++) {
//            System.out.println(str);
//        }
//        return str;
//    }


    // TODO 5 practic. 5 task из 8...
//    public static void main(String[] args) {
//        String str = "hello";
//        method(str);
//    }
//    public static void method(String str) {
//        String a = "";
//        for (int i = str.length() -1; i >= 0; i--) {
//            a += str.charAt(i);
//        }
//        System.out.println(a);
//    }


    // TODO 5 practic. 5 task из 8... return method.
//    public static void main(String[] args) {
//        String str = "hello";
//        System.out.println(method(str));
//    }
//    public static String method(String str) {
//        String a = "";
//        for (int i = str.length() -1; i >= 0; i--) {
//            a += str.charAt(i);
//        }
//        return a;
//    }


    // TODO 5 practic. 6 task из 8...
//    public static void main(String[] args) {
//        int[] array = {12, 20, 30, 45, 50, 200};
//        method(array);
//    }
//    public static void method(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + 1 + " ");
//        }
//    }


    // TODO 5 practic. 6 task из 8... return method.
//    public static void main(String[] args) {
//        int[] array = {12, 20, 30, 45, 50, 200};
//        int[] aa = method(array);
//        System.out.println(Arrays.toString(aa));
//    }
//    public static int[] method(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            array[i] += 1;
//        }
//        return array;
//    }


    // TODO 5 practic. 7 task из 8... first
//    public static void main(String[] args) {
//        int a = 20;
//        int b = 10;
//        int c = 25;
//        method(a, b, c);
//    }
//
//    public static void method(int a, int b, int c) {
//        if (a > b && a > c) {
//            System.out.println(a);
//        }
//        if (b > a && b > c) {
//            System.out.println(b);
//        }
//        if (c > a && c > b) {
//            System.out.println(c);
//        }
//    }

    // TODO 5 practic. 7 task из 8... second.
//    public static void main(String[] args) {
//        int[] array = {1, 45, 76, 80, 21, 43, 69, 90, 200};
//        System.out.println(method(array));
//    }
//
//    public static int method(int[] array) {
//        int sum = array[0];
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] > sum) {
//                sum = array[i];
//            }
//        }
//        return sum;
//    }



    // TODO 5 practic. 7 task из 8... third
//    public static void main(String[] args) {
//        int[] array = {1, 45, 76, 80, 21, 43, 69, 90, 200};
//        System.out.println(method(array));
//    }
//
//    public static int method(int[] array) {
//        int sum = array[0];
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] < sum) {
//                sum = array[i];
//            }
//        }
//        return sum;
//    }



    // TODO 5 practic. 8 task из 8...
//    public static void main(String[] args) {
//        String[] array = {"hello", "world", "java", "the", "main"};
//        String str = new Scanner(System.in).nextLine();
//        System.out.println(method(array, str));
//    }
//
//    public static boolean method(String [] array , String str) {
//        for (int i = 0; i < array.length; i++) {
//            if (array[i].equalsIgnoreCase(str)) {
//                return true;
//            }
//        }
//        return false;
//    }

}
