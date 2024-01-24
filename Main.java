import java.awt.Robot;
import java.awt.datatransfer.StringSelection;
import java.util.Scanner;
import java.awt.AWTException;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.event.KeyEvent;
import java.awt.datatransfer.StringSelection;

public class Main {

    public static void main(String[] args) throws AWTException, InterruptedException {


        String y= String.valueOf(12);

        Robot robot = new Robot();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your text:");
        String text = scanner.nextLine();

        StringSelection stringSection = new StringSelection(text);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSection, null);

        System.out.println("How many times do spam?");
        int dotime = scanner.nextInt();
        int counter = 0;


        System.out.println("How many time want to delay this spam?");
        int time = scanner.nextInt();

        System.out.println("How many time want to delay between two spams?");
        int delay = scanner.nextInt();

        time = time*1000;
        Thread.sleep(time);

        while(counter <= dotime ) {

            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_V);


            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(delay);

            counter++;

        }






    }

}

