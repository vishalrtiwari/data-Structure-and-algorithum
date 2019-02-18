package com.company.Algorithum.searching;

public class TwoDPeekElement {

    public static void Main(String[] args) {
        int arr[][] =
                {{10, 8, 10, 10},
                        {14, 13, 12, 11},
                        {1, 9, 11, 2},
                        {16, 17, 19, 20}};
        int result = peakdetect(arr, 4, 3, 1);
        System.out.println(result);

    }



    public static int peakincolown(int arr[][], int row, int midcolown) {
        int maxindex = 0;
        int max = 0;
        for (int i = 0; i < row; i++) {
            if (arr[i][midcolown] >= max) {
                max = arr[i][midcolown];
                maxindex = i;
            }

        }
        return maxindex;
    }
    public static int peakdetect(int arr[][],int row,int colown,int midcolown) {

        int maxindex = peakincolown(arr, row, midcolown);
        if (midcolown == 0 || midcolown == colown ) {
            return arr[maxindex][midcolown];
        }
        if ((arr[maxindex][midcolown - 1] <= arr[maxindex][midcolown]) && (arr[maxindex][midcolown + 1] <= arr[maxindex][midcolown])) {
            return arr[maxindex][midcolown];
        }
        if (arr[maxindex][midcolown - 1] > arr[maxindex][midcolown]) {
            return peakdetect(arr, row, colown,  midcolown / 2);
        }
        else{
            return peakdetect(arr, row, colown, colown-( midcolown / 2));
        }

    }
}
