package com.example.demo10;
public class Password
{
    String lower_case = "abcdefghijklmnopqrstuvwxyz";
    String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String Spec_char = "-*!&%$#";
    String num = "1234567890";
    String pass = " ";
    {
        for(int i=0;i<10;i++)
        {
            int rand = (int)(5*Math.random());
            switch(rand)
            {
                case 0:
                    pass += String.valueOf((int)(Math.random()));
                    break;

                case 1:
                    rand = (int)(lower_case.length()*Math.random());
                    pass += String.valueOf(lower_case.charAt(rand));
                    break;

                case 2:
                    rand = (int)(upper_case.length()*Math.random());
                    pass += String.valueOf(upper_case.charAt(rand));
                    break;

                case 3:
                    rand = (int)(Spec_char.length()*Math.random());
                    pass += String.valueOf(Spec_char.charAt(rand));
                    break;

                case 4:
                    rand = (int)(num.length()*Math.random());
                    pass += String.valueOf(num.charAt(rand));
                    break;

            }
        }
        System.out.println(pass);
    }
}
