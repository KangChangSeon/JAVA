public class test6 
{
    public static void main(String[] args)
    {
        String str1 = "ABCDE";
        char ch = str1.charAt(3);
        System.out.println(ch);
        //문자열 str1 의 4번째 문자 'D'를 ch에 저장//

        String str2 = "012345";
        String tmp = str2.substring(1,4);
        System.out.println(tmp);
        //substring()은 문자열의 일부를 뽑아낼 수 있다. 주의 할 점은 범위의 끝은 포함되지 않는다.//

        String str3 = "abc";
        if (str3.equals("abc"))
            System.out.println(str3);
        else
            System.out.println("같지 않음");
        //equals()는 문자열의 내용이 같은지 다른지 확인하는데 사용한다. 대소문자를 구분한다는 점을 주의해야한다.//
    }
}
