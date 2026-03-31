function solution(order) {
    var answer = 0;
    let clap = [3, 6, 9];
    let arr = order.toString().split("");
    
    for (let i of arr) {
        if (clap.includes(Number(i))) answer++;
    }
    return answer;
}