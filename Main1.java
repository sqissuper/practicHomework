//final class A{
//
//}
//class B extends A {
//
//}

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main1 {

    //给定包含大小写字母和空格‘ ’的字符串，返回最后一个单词的长度
//    public static int lengthOfLastWord(String s) {
//        if(s == null) return 0;
//        int count = 0;
//        char[] c = s.toCharArray();
//        int i = c.length - 1;
//        for(; i >= 0; i--){
//            if(c[i] != ' '){
//                count++;
//            }else if(count != 0){
//                return count;
//            }
//        }
//        return count;
//
//    }

    //将nums2数组合并到nums1中并排序
//    public static void merge(int[] nums1, int m, int[] nums2, int n) {
//        int i = m - 1;
//        int j = n - 1;
//        int k = m + n - 1;
//        while (i >= 0 && j >= 0){
//            if(nums1[i] > nums2[j]){
//                nums1[k] = nums1[i];
//                i--;
//            } else {
//                nums1[k] = nums2[j];
//                j--;
//            }
//            k--;
//        }
//        //如果i提前结束
//        while(j >= 0){
//            nums1[k] = nums2[j];
//            k--;
//            j--;
//        }
//        //如果j提前结束
//        while(i >= 0){
//            nums1[k] = nums1[i];
//            k--;
//            i--;
//        }
//        for (int l = 0; l < m + n; l++) {
//            System.out.print(nums1[l] + " ");
//        }

//        int[] ret = Arrays.copyOf(nums1,m);
//        nums1 = Arrays.copyOf(nums1,m + n);
//        for (int i = 0; i < n; i++) {
//            nums1[m + i] = nums2[i];
//
//        }
//        Arrays.sort(nums1);
//        Arrays.toString(nums1);

//        m = nums1.length;
//        n = nums2.length;
//        int[] ret = new int[m + n];
//        int i = 0,j = 0,k = 0;
//        while(k < m + n) {
//            if(nums1[i] > nums2[j]){
//                ret[k] = nums2[j];
//                j++;
//            }else{
//                ret[k] = nums1[i];
//                i++;
//            }
//            k++;
//        }

//    }
//    private float f = 1.0f;
//    static  int n = 10;
//    int m = 20;
//    public static boolean containsDuplicate(int[] nums) {
//        Arrays.sort(nums);
//        for(int i = 0; i < nums.length - 1; i ++) {
//            if(nums[i] == nums[i + 1]){
//                return true;
//            }
//        }
//        return false;
//    }
//    public static boolean containsDuplicate(int[] nums) {
//        if(nums.length == 1) return false;
//        for(int i = 0; i < nums.length; i ++) {
//            for(int j = nums.length - 1; j > i; j--) {
//                if(nums[i] == nums[j]){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }

    //奇数跟在偶数后边
//    public static int[] sortArrayByParity(int[] A) { //[3,1,2,4]
//        int i = 0;
//        int j = A.length - 1;
//        while(i != j) {
//            if(A[i] % 2 != 0) {
//                int tmp = A[i];
//                A[i] = A[j];
//                A[j] = tmp;
//                j--;
//            } else {
//                i++;
//            }
//        }
//        return A;
//    }

    //平方且排序
//    public static int[] sortedSquares(int[] nums) {//[-4,-1,0,3,10]
//        int[] ret = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            ret[i] = nums[i]*nums[i];
//        }
//        Arrays.sort(ret);
//        return ret;
//    }

    //仅反转字符串
//    public static String reverseOnlyLetters(String S) {
//        char[] ch = S.toCharArray();
//        int s = 0;
//        int e = ch.length - 1;
//        while(s < e) {
//            if((ch[s] > 64 && ch[s] < 91) || (ch[s] > 96 && ch[s] < 123)) {
//                if((ch[e] > 64 && ch[e] < 91) || (ch[e] > 96 && ch[e] < 123)) {
//                    char tmp = ch[s];
//                    ch[s] = ch[e];
//                    ch[e] = tmp;
//                    s++;
//                    e--;
//                }else{
//                    e--;
//                }
//            } else {
//                s++;
//            }
//        }
//        S = new String(ch);
//        return S;
//    }

    //替换字符串
//    public static String modifyString(String s) {
//        String s1 = "#";
//        s = s1 + s + s1;
//        char[] ch = s.toCharArray();
//        for (int i = 1; i < ch.length; i++) {
//            if(ch[i] == '?') {
//                for(char ch1 = 'a'; ch1 <= 'z'; ch1++) {
//                    if(ch1 != ch[i - 1] && ch1 != ch[i + 1]) {
//                        ch[i] = ch1;
//                        break;
//                    }
//                }
//
//            }
//        }
//        s = new String(ch);
//        return s.substring(1,s.length() - 1);
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//
//        String str = "??yw?ipz??";
//        System.out.println(modifyString(str));
//
//        System.out.println(reverseOnlyLetters(str));
//        int[] nums = {-4,-1,0,3,10};
//        System.out.println(Arrays.toString(sortedSquares(nums)));
//        int[] A = {3,1,2,4};
//        sortArrayByParity(A);
//        int[] nums = {0};
//        System.out.println(containsDuplicate(nums));
//        Main1 main = new Main1();
//        System.out.println(main.f);
//        String str = sc.next();
//        String str1 = sc.next();
//        System.out.println(str.concat(str1));
//        String str1 = "aa";
//        String str2 = "aab";
//        System.out.println(str2.contains(str1));

//        int[] nums1 = {1,2,3};
//        int[] nums2 = {0,2, 5, 6,7,9};
//        int m = nums1.length;
//        int n = nums2.length;
//        nums1 = Arrays.copyOf(nums1,m + n);
//        merge(nums1,m,nums2,n);


//        String s = "hello ";
//        int ret = lengthOfLastWord(s);
//        System.out.println(ret);

    }
}
