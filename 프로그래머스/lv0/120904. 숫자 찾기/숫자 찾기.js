function solution(num, k) {
    var answer = -1;
    num = num.toString();
    answer = num.search(k);
    answer = answer == -1 ? -1 : answer + 1; 
    return answer;
}