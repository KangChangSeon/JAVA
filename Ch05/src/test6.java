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
 
    // char charAt(Index) = 문자열에서 해당 위치(Index)에 있는 문자를 반환한다.
    // int length() = 문자열의 길이를 반환한다.
    // String substring(int from, int to) = 문자열에서 해당 범위(from~to)의 문자열을 반환한다.(to는 포함 안됨)
    // boolean equals(Object obj) = 문자열의 내용이 같은지 확인한다. 같으면 결과는 true, 다르면 false
    // char[] toCharArray() = 문자열을 문자배열(char[])로 변환해서 반환한다.