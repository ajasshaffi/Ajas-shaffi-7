import java.io.*;

import java.util.*;

class experiment2

{

    public static void main(String[] args) throws Exception

    {

    FileInputStream obj = new FileInputStream("read2.txt");

    int c=-1, i=0, w=0;

    int ch;

    while((ch = obj.read())!=-1)

    {

        c++;

        if(ch=='\n')

            l++;

        if(ch == ' '||ch=='\n')

            w++;

    }

      System.out.println("Number of Characters = "+c);

        System.out.println("Number of Words = "+w);

          System.out.println("Number of Lines ="+l);

    fin.close();

    }

}
