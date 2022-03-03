class Solution {
    public String solution(String[] seoul) {
        for(int i=0;i<seoul.length;i++){
            if(seoul[i].equals("Kim")){
                return "김서방은 "+ i + "에 있다";
            }
        }
        return "";
    }
}

-------------------------------------------

def solution(seoul):
    idx = 0
    for i, txt in enumerate(seoul):
        if "Kim" in txt:
            idx = i
            break
    return "김서방은 "+str(idx)+"에 있다"
