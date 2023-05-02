public class test7
{
    public static void main(String[] args)
    {
        System.out.println("매개변수의 개수:"+args.length);
        for (int i = 0; i < args.length; i++)
            System.out.println("args["+i+"]= \""+args[i]+"\"");
    }    
}
//이클립스에서 커맨드라인 매개변수 입력하기//
//Run Configurations 에서 Arguments 탭에서 매개변수 입력시 매개변수 입력 가능//