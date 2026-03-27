package lang.string;

public class StringBasicMain {
    public static void main(String[] args) {

        String str1 = "hello"; //잘 생각해보면 참조형인데 이런식으로 쓰는게 안되지면 자박 알아서 객체 만들어서 해준다,
        String str2  = new String("hello");// 이런식으로 변경을 해준다.

        System.out.println("str1 = "+str1);
        System.out.println("str2 = "+str2);


    }
}
