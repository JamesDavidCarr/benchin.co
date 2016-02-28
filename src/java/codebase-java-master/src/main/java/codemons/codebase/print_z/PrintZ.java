package codemons.codebase.print_z;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class PrintZ {

    public static void printZ(int size){
        for (int i = 0; i < size; i++) {
            System.out.print("*");
        }
        System.out.print("\n");
        for (int i = 0; i < size-2; i++) {
            for (int j = 0; j < size-i-2; j++) {
                System.out.print(" ");
            }
            System.out.print("*\n");
        }
        for (int i = 0; i < size; i++) {
            System.out.print("*");
        }
    }

    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();
        int N = Integer.parseInt(line);

        printZ(N);

    }
}