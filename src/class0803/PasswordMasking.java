package class0803;

import java.io.*;

/**
 * 下面的代码里，PasswordField 类的 readPassword 方法通过 EraserThread 类提供这种服务。
 * readPassword 在用户输入密码之前启动 EraserThread，读了密码之后便马上停止该线程并返回密码。
 * EraserThread 运行的时候会尝试以每秒一千次的速度删除并用星号代替用户打出的每一个字符。
 *
 * PasswordMasking 类里的 main 示范了 readPassword 的应用。
 */
class PasswordMasking {
    public static void main(String argv[]) {
        String password = PasswordField.readPassword("Enter password: ");
        System.out.println("The password entered is: "+password);
    }
}

class PasswordField {

    /**
     *@param prompt The prompt to display to the user
     *@return The password as entered by the user
     */
    public static String readPassword (String prompt) {
        EraserThread et = new EraserThread(prompt);
        Thread mask = new Thread(et);
        mask.start();

        BufferedReader in =
                new BufferedReader(new InputStreamReader(System.in));
        String password = "";

        try {
            password = in.readLine();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        // stop masking
        et.stopMasking();
        // return the password entered by the user
        return password;
    }
}

class EraserThread implements Runnable {
    private boolean stop;


    public EraserThread(String prompt) {
        System.out.print(prompt);
    }

    /**
     * Begin masking...display asterisks (*)
     */
    public void run () {
        stop = true;
        while (stop) {
            System.out.print("\010*");
            try {
                Thread.currentThread().sleep(1);
            } catch(InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }

    /**
     * Instruct the thread to stop masking
     */
    public void stopMasking() {
        this.stop = false;
    }
}
