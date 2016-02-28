package codemons.codebase.life_universe_and_everything;

import java.util.*;
import java.lang.*;

public class LifeUniverseAndEverything
{
    public static void main (String[] args) throws java.lang.Exception
    {
        ArrayList<Integer> arraylist = new ArrayList<Integer>();

        Scanner in= new Scanner(System.in);

        int n = in.nextInt();
        while(n!=42){
            arraylist.add(n);
            n = in.nextInt();
        }


        for(int counter: arraylist){
            System.out.println(counter);
        }
        in.close();
    }
}

