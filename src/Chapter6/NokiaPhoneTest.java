package Chapter6;

public class NokiaPhoneTest {
    public static void main(String[] args) {
        NokiaPhone nokia3310 = new NokiaPhone();
        System.out.println(nokia3310.welcomeMessage());
        System.out.println(nokia3310.phoneMenu());
        nokia3310.phoneMenuSelection();
        nokia3310.choiceToTerminateOrNot();

    }
}
