import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class prac20 {
    public static void main(String[] args) {
        //TODO 1 task из 20.
//        public static void main(String[] args) {
//            int number = new Scanner(System.in).nextInt();
//            int[] array = new int[5];
//            method(array, number);
//
//        }
//
//        public static void method(int[] array, int number) {
//            Random random = new Random();
//            int a = 0;
//            for (int i = 0; i < array.length; i++) {
//                array[i] = random.nextInt(9);
//                if (array[i] >= number) {
//                    System.out.print(" true ");
//                } else {
//                    System.out.print(" false ");
//                }
//            }
//
//            System.out.println(Arrays.toString(array));
//        }


        //TODO 2 task из 20.
//        public static void main(String[] args) {
//        boolean[] array = {false, true, true, true, true, true, false, false};
//        method(array);
//    }
//
//    public static void method(boolean[] array) {
//        int b = 0;
//        for (int i = 0; i < array.length; i++) {
//            boolean a = array[i];
//            if (a) {
//                b++;
//            }
//        }
//        System.out.println(b);
//  }


        //TODO 3 task из 20.
//        public static void main(String[] args) {
//            int[] array = new int[10];
//            method(array);
//
//        }
//
//        public static void method(int[] array) {
//            Random random = new Random();
//            for (int i = 0; i < array.length; i++) {
//                array[i] = random.nextInt(1, 50);
//                if (array[i] > 20) {
//                    System.out.println("числа больше 20: " + array[i]);
//                }
//            }
//        }



        //TODO 4 task из 20.
//        public static void main(String[] args) {
//            int num = new Scanner(System.in).nextInt();
//            int[] array = new int[10];
//            method(array, num);
//
//        }
//
//        public static void method(int[] array, int number) {
//            Random random = new Random();
//            int count = 0;
//            for (int i = 0; i < array.length; i++) {
//                array[i] = random.nextInt(1, 50);
//                if (array[i] == number) {
//                    count++;
//                }
//            }
//            System.out.println("повторялось: " + count);
//        }




        //TODO 5 task из 20.
//        public static void main(String[] args) {
//            int number = new Scanner(System.in).nextInt();
//            int num = method(number);
//            System.out.println(num);
//
//
//        }
//
//        public static int method(int number) {
//            int a = 0;
//            for (int i = 1; i <= number; i++) {
//                a += i;
//            }
//            return a;
//        }


        //TODO 6 task из 20.
//        public static void main(String[] args) {
//            System.out.print("K: ");
//            int number = new Scanner(System.in).nextInt();
//            int[] array = {2, 5, 34, 87, 23, 1, 43, 54};
//
//            System.out.println(method(array, number));
//        }
//
//        public static int method(int[] array, int number) {
//            int sum = 0;
//            for (int i = 0; i < array.length; i++) {
//                if (i == number) {
//                    return sum;
//                } else {
//                    sum += array[i];
//                }
//            }
//            return sum;
//        }
//


        //TODO 7 task из 20.
//        public static void main(String[] args) {
//            int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//            int[] array2 = method(array);
//            System.out.println(Arrays.toString(array2));
//
//
//        }
//
//        public static int[] method(int[] array) {
//            Random random = new Random();
//            int a = 0;
//            for (int i = 0; i < array.length; i++) {
//                array[i] = random.nextInt(1,11);
//                if (array[i] % 2 != 0) {
//                    i--;
//                }
//            }
//            return array;
//        }


        //TODO 8 task из 20.
//        public static void main(String[] args) {
//            int num = new Scanner(System.in).nextInt();
//            String str = String.valueOf(num);
//            System.out.println(method(str));
//        }
//
//        public static String  method(String num) {
//
//            String dayOfWeek = null;
//            switch (num) {
//                case "1":
//                    dayOfWeek = "Ponedelnik";
//                    break;
//                case "2":
//                    dayOfWeek = "Vtornik";
//                    break;
//                case "3":
//                    dayOfWeek = "Sreda";
//                    break;
//                case "4":
//                    dayOfWeek = "Chetverg";
//                    break;
//                case "5":
//                    dayOfWeek = "Pyatnisa";
//                    break;
//                case "6":
//                    dayOfWeek = "subbota";
//                    break;
//                case "7":
//                    dayOfWeek = "Voskresenye";
//                    break;
//                default:
//                    dayOfWeek = "Oshubka";
//                    break;
//
//
//            }
//            return dayOfWeek;
//        }



        //TODO 9 task из 20.
//        public static void main(String[] args) {
//            int[] arrays = new int[15];
//            method(arrays);
//        }
//        public static void method(int[] array) {
//            Random random = new Random();
//            for (int i = 0; i < array.length; i++) {
//                int rand = random.nextInt(44) * 2 + 10;
//                array[i] = rand;
//                System.out.print(array[i] + " ");
//            }
//        }





        //TODO 11 task из 20.
//        public static void main(String[] args) {
//            String[] array = {"nurislam", "nurmuhammed", "nurlan", "aktan", "bayel"};
//            String name = new Scanner(System.in).nextLine();
//            boolean action = method(array, name);
//            System.out.println(action);
//        }
//        public static boolean method(String[] array, String name) {
//            for (int i = 0; i < array.length; i++) {
//                if (name.equalsIgnoreCase(array[i])) {
//                    if (i % 2 == 0) return true;
//                }
//            }
//            return false;
//        }


        //TODO 12 task из 20.
//        public static void main(String[] args) {
//            int number = 10;
//            int[] massiv = new int[10];
//            int[] arrays = method(massiv);
//            System.out.println(Arrays.toString(arrays));
//        }
//
//        public static int[]  method(int[] massive) {
//            int[] array = new int[10];
//            for (int i = 0; i < array.length; i++) {
//                array[i] = new Random().nextInt(1, 100);
//            }
//            for (int i = 0; i < array.length - 1; i++) {
//                for (int j = 0; j < array.length - 1; j++) {
//                    if (array[j] > array[j + 1]) {
//                        int a = array[j];
//                        array[j] = array[j + 1];
//                        array[j + 1] = a;
//                    }
//                }
//            }
//            return array;
//        }


        //TODO 13 task из 20.
//        public static void main(String[] args) {
//            int[] array = {1, 56, 7, 45, 90, 35, 78, 4};
//            System.out.println(method(array));
//        }
//
//        public static boolean method(int[] massive) {
//            for (int i = 0; i < massive.length; i++) {
//                if (massive[i] <= 0) return false;
//            }
//            return true;
//        }


        //TODO 14 task из 20.
//        public static void main(String[] args) {
//            int number = 65;
//            int[] massiv = {2, 7, 34, 56, 76, 89, 50, 15};
//            int[] res = method(massiv, number);
//            if (res != null){
//                System.out.println(Arrays.toString(res));
//            } else {
//                System.out.println("tekih netu");
//            }
//        }
//
//        public static int[] method(int[] massive, int numbers) {
//            for (int i = 0; i < massive.length -1; i++) {
//                if (numbers == (massive[i] + massive[i + 1])) {
//                    return new int[]{i, i + 1};
//                }
//            }
//            return null;
//        }



        //TODO 15 task из 20.
//        public static void main(String[] args) {
//            int[] array = {2, 2, 2, 2, 2};
//            boolean res =  method(array);
//            System.out.println(res);
//        }
//
//        public static boolean method(int[] massive) {
//            int a = 2;
//            int count = 0;
//            for (int i = 0; i < massive.length; i++) {
//                if (massive[i] == a) {
//                    count++;
//                }
//            }
//            return count == 5;
//        }



        //TODO 16 task из 20.
//        public static void main(String[] args) {
//            int number = 4;
//            String word = "Hi";
//            String str = method(word, number);
//            System.out.println(str);
//        }
//
//        public static String method(String word, int num) {
//            String res = "";
//            for (int i = 0; i < num; i++) {
//                res += word;
//            }
//            return res;
//        }



        //TODO 17 task из 20.
//        public static void main(String[] args) {
//            int[] array = {1, 2, 3, 6, 9, 6, 13};
//            System.out.println(method(array));
//        }
//
//        public static boolean method(int[] array) {
//            for (int i = 0; i < array.length -2; i++) {
//                if (array[i] == 1 && array[i + 1] == 2 && array[i + 2] == 3) {
//                    return true;
//                }
//            }
//            return false;
//        }


        //TODO 18 task из 20.
//        public static void main(String[] args) {
//            int[] array = {1, 2, 9, 7, 5, 8, 34, 22};
//            System.out.println(method(array));
//        }
//
//        public static boolean method(int[] array) {
//            for (int i = 0; i < 4; i++) {
//                if (array[i] == 9) {
//                    return true;
//                }
//            }
//            return false;
//        }



        //TODO 19 task из 20.
//        public static void main(String[] args) {
//            int[] array = {1, 1, 1, 7, 45, 8, 34, 22, 90};
//            System.out.println(method(array));
//        }
//
//        public static boolean method(int[] array) {
//            for (int i = 0; i < array.length -2; i++) {
//                if (array[i] == array[i + 2]) {
//                    return true;
//                }
//            }
//            return false;
//        }

    }
}
