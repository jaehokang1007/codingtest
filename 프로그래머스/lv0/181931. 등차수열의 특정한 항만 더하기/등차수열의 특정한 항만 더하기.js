function solution(a, d, included) {
    var answer = 0;
    let bri = a;
    for (let i = 0; i < included.length; i++) {
        if (included[i]) {
            answer += a;
        }
        a += d
    }
    return answer;
}