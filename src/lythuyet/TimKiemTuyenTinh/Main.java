package lythuyet.TimKiemTuyenTinh;

public class Main {
    public static int timKiem(int [] array, int value){
        int index = -1;
        for (int i= 0; i< array.length; i++){
            if (value == array[i]){
                index = i;
                break;
            }
        }
        return index;
    }
}
