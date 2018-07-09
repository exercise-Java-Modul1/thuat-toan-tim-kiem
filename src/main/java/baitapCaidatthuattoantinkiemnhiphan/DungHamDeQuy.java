package baitapCaidatthuattoantinkiemnhiphan;

public class DungHamDeQuy {
    static int[] array = {4, 1, 5, 7, 9, 12, 6, 3, 2};

    static void sapxeplaimang2(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int k = i; k < array.length; k++) {
                if (array[i] > array[k]) {
                    int temp = array[i];
                    array[i] = array[k];
                    array[k] = temp;
                }
            }
        }
    }

    static int deQuyTimKiemNhiPhan(int[] array, int low, int hight, int data) {

        int mid = (hight + low) / 2;
        if (hight >= low) {
            if (array[mid] > data) {
                hight = mid - 1;
                return deQuyTimKiemNhiPhan(array, low, hight, data);
            } else if (array[mid] < data) {
                low = mid + 1;
                return deQuyTimKiemNhiPhan(array, low, hight, data);
            } else {
                return mid;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        sapxeplaimang2(array);

        System.out.println(deQuyTimKiemNhiPhan(array, 0, array.length, 5));
        System.out.println(deQuyTimKiemNhiPhan(array, 0, array.length, 12));
    }
}
