package ch05;

public class MethodExample2 {
    public static void main(String[] args) {
        //input O, output O (비 void형)
        int result = sum(10,20);
        System.out.println("sum : "+result);

        result = sum(101,201);
        System.out.println("sum : "+result);

    }

    public static int sum(int n1, int n2){
        return  n1+n2;
    }
    //return 값 타입과 선언부의 타입과 같아야함.  int형.




}
