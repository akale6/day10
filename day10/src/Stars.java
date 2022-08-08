//打印空心金字塔
//化繁为简 ，先打印一半实心金字塔
//打印完整的金字塔
//    *
//   ***
//  *****
// *******
//*********
//2n-1
//在输出的时候考虑空格
//接着打印空心
//    *
//   * *
//  *   *
// *     *
//*********
//灵活转变 把5 变成可变的值 定义一个变量
public class Stars {
    public static void main(String[] args) {
        int totalLevel = 5;//表示层数
        for (int i = 1; i <= totalLevel; i++) {//i表示层数
            for (int k = 1; k <= totalLevel - i; k++) {//对应空格 总层数减去当前层
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) { //j表示星星
                if (j == 1 || j == 2 * i - 1 ){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

                }
                System.out.println(" ");



            }
        }
    }
