package 자료구조와_함께_배우는_알고리즘_입문.chap03;

import java.util.Scanner;

public class Q2_03 {
    //--- 요솟수가 n인 배열 a에서 key와 값이 같은 요소를 보초법으로 선형 검색 ---//
    static int seqSearchSen(int[] a, int n, int key) {

        int i;

        for(i = 0; i < n; i++){
            if(a[i] == key) {
                break;
            }
        }

        return i;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = stdIn.nextInt();
        int[] x = new int[num + 1];                        // 요솟수가 num + 1인 배열

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }

        System.out.print("검색 값 : ");                    // 키값을 읽력받음
        int ky = stdIn.nextInt();

        int idx = seqSearchSen(x, num, ky);              // 배열 x에서 값이 ky인 요소를 검색

        System.out.println();

        System.out.print("  ");

        for(int i = 0; i < num; i++) {
            System.out.print(" "+i);
        }
        System.out.println();

        System.out.print("--+");
        for(int i = 0; i < num; i++) {
            System.out.print("--");
        }
        System.out.println();

        for(int i = 0; i < num; i++) {

            if(i != 0){
                System.out.println("  "+"|");
            }
            System.out.print("  "+"|");

            for(int j = 0; j < num; j++) {

                if(j == i){
                    System.out.print(" *");
                }else{
                    System.out.print("  ");
                }

            }
            System.out.println();
            System.out.print(" "+i+"|");

            for(int j = 0; j < num; j++) {

                System.out.print(" "+x[j]);

            }
            System.out.println();
        }

        if (idx == -1)
            System.out.println("검색 값의 요소가 없습니다.");
        else
            System.out.println("검색 값은 x[" + idx + "]에 있습니다.");
    }

}
