package sort;

public class EvenTimeOddTims {
//    题目1:一种数出现奇数次，其他所有数都出现了偶数次，如何找到这个奇数
    public static void printOddTimesNum1(int[] arr){
        int eor = 0;
        for (int i : arr) {
            eor ^= i;
        }
        System.out.println(eor);
    }

//    题目2:两种数出现奇数次，其他数出现偶数次，如何找到这两个数。
    public static void pringOddTimesNum2(int[] arr) {
        int eor = 0;
        int onlyOne = 0;
        for (int i : arr) {
            eor ^= i;
        }
        //eor = a ^ b
        // eor != 0
        // eor必然有一个位置上是1
        int rightOne = eor & (~eor + 1); //通过去反加1获取补码，在与上他本身的到最右侧的一
        for (int i : arr) {
            if ((i & rightOne) == 0) {// 这里异或值的结果只能是0或者rightOne，不能为1，如a=1101,b=1111,则b&rightOne=0010为2.
                onlyOne ^= i;
            }
        }
        System.out.println(onlyOne + " " + (eor ^ onlyOne));
    }
}
