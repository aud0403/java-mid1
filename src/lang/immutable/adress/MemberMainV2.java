package lang.immutable.adress;

public class MemberMainV2 {
    public static void main(String[] args) {

        ImmutableAddress address = new ImmutableAddress("서울");

        MemberV2 memberA = new MemberV2("회원 A" ,  address);
        MemberV2 memberB = new MemberV2("회원 B" ,  address);

        //회원A,회원B의 처음 주소는 모두 서울
        System.out.println("memberA = " + memberA);
        System.out.println("memberA = " + memberB);

        //회원B의 주소를 부산으로 변경해야함
        //컴파일 오류
        //memberB.getAddress().setValue("부산"); // a,b 가 같은 address 를 참조하고 잇따.

        //b의 address가 불변이 아니고 ImmutableAddress안에 잇는 value값이 불변
        memberB.setAddress(new ImmutableAddress("부산"));
        System.out.println("부산 -> memberB.address");
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);
    }
}
