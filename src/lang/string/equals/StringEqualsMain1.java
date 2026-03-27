package lang.string.equals;

public class StringEqualsMain1 {
    public static void main(String[] args) {

        String str1= new String("hello");
        String str2= new String("hello");
        System.out.println("new String() == 비교" + (str1 == str2));
        System.out.println("new String() equals 비교" + (str1.equals(str2)));
        //String의 equals는 object의 것을 오버라이딩 해서 문자열 비교가 가능

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("리터럴 == 비교 : " + (str3 == str4));
        System.out.println("리터러 equals 비교 : "+(str3.equals(str4)));

        //문자열 비교는 항상 equals로 해야 한다.
        
    }
}
