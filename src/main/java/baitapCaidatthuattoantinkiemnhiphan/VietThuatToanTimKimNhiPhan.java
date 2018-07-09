package baitapCaidatthuattoantinkiemnhiphan;

public class VietThuatToanTimKimNhiPhan {
    static int[] arr = {1, 9, 8, 5, 6, 7, 2, 4, 10};

    static void sapxeplaimang(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    static int timKiemNhiPhan(int[] arr, int data) {
        int low = 0;
        int hight = arr.length - 1;
        while (hight >= low) {
            int mid = (hight + low) / 2;
            if (arr[mid] > data) {
                hight = mid - 1;
            } else if (arr[mid] < data) {
                low = mid + 1;
            } else {
                return mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        sapxeplaimang(arr);

        System.out.println(timKiemNhiPhan(arr, 5));
        System.out.println(timKiemNhiPhan(arr, 1));
        System.out.println(timKiemNhiPhan(arr, 6));
        System.out.println(timKiemNhiPhan(arr, 100));
    }
}
