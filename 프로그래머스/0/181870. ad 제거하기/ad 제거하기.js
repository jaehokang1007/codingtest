function solution(strArr) {
    var answer = [];
    for (i of strArr) {
        if (!i.includes("ad")) answer.push(i);
    }
    return answer;
}