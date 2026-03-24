package lang.object.tostring;

public class ObjectPrint {
    public static void print(Object obj) {
        String string = "객체 정보 출력 : "+ obj.toString(); // Object 객체의 toString 를 먼저보지만
        // dog의 오버라이딩 함수가 잇으면 우선권이 오버라이딩에 먼저 잇어서 dog의 tostring으로 들어간다.
        System.out.println(string);
    }
}
