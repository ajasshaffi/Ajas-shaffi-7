import java.io.*;

import java.util.*;

class readexample

{

    public static void main(String[] args) throws Exception

    {

    FileInputStream fin = new FileInputStream("read1.txt");

    int i=1;

    int ch;

    System.out.print(i+"-");

    while((ch = fin.read())!=-1)

    {

    System.out.print((char)ch);

     if(ch=='\n')

        System.out.print(++i+"-");

    }

    fin.close();

    }

}
