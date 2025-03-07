public class Calculator {
    //定义变量
        //重载的方法名不能和变量名相同
        public static double add(double num1,double num2) {
            return num1+num2;
        }
        //静态的方法应该要加上static
        public static double subtract(double num1,double num2) {
            return num1-num2;
        }
        //方法的基本组成为方法名，参数，返回值，方法体（就是{}）
        public static double multiply(double num1, double num2) {
            return num1 * num2;
        }
        /*1.除法中被除数不能是0，注意要加入检查纠错机制
        2.异常机制：像“急救包”处理意外
        步骤：发现危险操作：比如除以零、文件找不到。
        抛出异常（throw）：大喊“出事了！”，程序暂停。
        捕获异常（try-catch）：像接住抛出的球，处理问题。
        例子：
        try {
            int result = 10 / 0; // 这里会出错
        } catch (ArithmeticException e) {
            System.out.println("抓到错误：不能除以零！");
        }
        3.throw new ArithmeticException(...)：
        throw：主动“扔出一个错误”，像举手告诉老师题目有问题。
        new ArithmeticException(...)：创建一个“算术错误”的对象，并写上错误信息。
         */
        public static double divide(double num1, double num2) {
            if (num2 == 0) throw new ArithmeticException("除数不能为0");
            return num1 / num2;
        }

        public static double mod(double num1, double num2) {
            return num1 % num2;
        }

        // 主方法（程序入口） 程序入口必须写 public static void main(String[] args)
        public static void main(String[] args) {
            double num1 = 2.0;
            double num2 = 1.0;

        //进行运算并输出结果
            System.out.println("加法结果: " + add(num1, num2));
            System.out.println("减法结果: " + subtract(num1, num2));
            System.out.println("乘法结果: " + multiply(num1, num2));
            System.out.println("除法结果: " + divide(num1, num2));
            System.out.println("取余结果: " + mod(num1, num2));
        }
}