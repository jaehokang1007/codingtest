function solution(n, s) {
    if (s < n) return [-1];
    var answer = [];
    if (s % n == 0) {
        for (let i = 0; i < n; i++) {
            answer.push(s / n);
        }
    }
    else {
        for (let i = 0; i < n; i++) {
            answer.push(Math.floor(s / n + i));
        }
    }
    return answer;
}