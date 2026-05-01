package sub1;
/*
 * 날짜 : 2026/05/01
 * 이름 : 한세류
 * 내용 : 프로그래머스 기출 문제
 */
class Solution {
    public int[] solution(String[] cpr) {
        int[] answer = {0, 0, 0, 0, 0};
        String[] basic_order = {"check", "call", "pressure", "respiration", "repeat"};

        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                if(cpr[i].equals(basic_order[j])){
                    answer[i] = j + 1;
                    break;
                }
            }
        }
        return answer;
    }
}