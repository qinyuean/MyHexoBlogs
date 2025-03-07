import java.util.Scanner;

public class CalculatorPlus {
    //定义方法（优化为直接输出结果）
    public static void add(int num1,int num2){
        System.out.println("加法结果为"+(num1+num2));
    }
    /*使用void 方法，直接在方法内输出结果
    void 英文是“空的”，表示这个方法不返回任何结果。
    使用场景：只需完成操作，不需要返回结果
     */
    public static void subtract(int num1,int num2){
        System.out.println("减法结果为"+(num1-num2));
    }
    public static void multiply(int num1,int num2){
        System.out.println("乘法结果"+(num1*num2));
    }
    //使用if...else语句对特殊情况进行处理
    public static void divide(int num1,int num2) {
        if (num2 == 0) {
            System.out.println("除数不能为0");
        } else {
            System.out.println("除法结果为" + (num1 / num2));
        }
    }
    public static void modulo(int num1,int num2) {
        if (num2 == 0) {
            System.out.println("取余数不能为0");
        } else {
            System.out.println("取余结果"+(num1%num2));
        }
    }
    //程序主体
    public static void main(String[] args) {
            //使用Scanner函数接受输入，格式为Scanner 变量名 = new Scanner(System.in)
            Scanner sc = new Scanner(System.in);
            /*Java语法强制要求：同一类型的多个变量必须在一条语句中声明，且类型关键字（如 int）只能出现一次。
            记忆口诀：“一类型，多变量，逗号分隔别重复”。*/
            int num1 =0 , num2 =0;
            while (true) {
                // // 无限循环：只要条件为 true，就一直循环（像复读机一样反复问）
                System.out.println("请输入两个整数：");
                //hasNextInt()：检查输入的是不是整数
                if (sc.hasNextInt()) {
                    //如果是整数，读取第一个数
                    num1 = sc.nextInt();
                    if (sc.hasNextInt()) {
                        num2 = sc.nextInt();
                        //break 跳出循环，继续执行后面的代码
                        break;
                    } else {
                        System.out.println("别乱输，第二个输个整数");
                        sc.next();
                    }
                }else{
                        System.out.println("假的吧，第一个数输错了");
                        sc.next();//sc.next() 清除无效输入
                    }
                }
                sc.close();

                // 调用方法
                add(num1, num2);
                subtract(num1, num2);
                multiply(num1, num2);
                divide(num1, num2);
                modulo(num1, num2);
            }

}
