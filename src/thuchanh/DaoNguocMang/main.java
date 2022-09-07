package thuchanh.DaoNguocMang;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
public class main {
    public static void main(String[] args) {
        Integer[] arr = {1, 3, 5, 7};
//        System.out.println(Arrays.toString(arr));
        List list = Arrays.asList(arr);
        Collections.reverse(list);
        Integer[] array = (Integer[])list.toArray(new Integer[4]);
        System.out.println(Arrays.toString(array));
    }
}
//    int[] src = {0, 1, 2, 3, 4, 5};
//,     int j = src.length - 1
//                for (int i = 0; i < j; i++, j--){
//        int temp = src[i];
//        src[i]  = src[j];
//        src[j] = temp;
//        }
//        System.out.println(Arrays.toString(src));
//        }
//        }