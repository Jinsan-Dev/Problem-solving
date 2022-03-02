import java.util.*;
class Solution {
    public String solution(String phone_number) {
        String[] arr = phone_number.split("");
        for(int i=0;i<arr.length-4;i++){
            arr[i] = "*";
        }
        
        return String.join("",arr);
    }
}

------------------------------------------------

def solution(phone_number):
    rear = phone_number[-4:]
    newStr = ''
    for i in range(len(phone_number)):
        if(i+4 < len(phone_number)):
            newStr = newStr + "*"
    return newStr+rear
