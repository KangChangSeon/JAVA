public class test10
{
    public static void main(String[] args)
    {
        class TV
        {
            //속성//
            String color;
            boolean power;
            int channel;

            //기능//
            void power() { power = !power; }
            void channelUp() { channel++; }
            void channelDown() { channel--; }
        }
    }
}
