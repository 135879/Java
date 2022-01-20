package com.company;

public class Task1 {
    public static int solution(int a, int b, int c){
        int d = b*b - 4*a*c;
        int answer = -1;
        if(d < 0){
            answer = 0;
        } else if(d == 0){
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;

    }

}
