function solution(num_str) {
    var answer = 0;
    let arr = num_str.split("");
    for (let i = 0; i < arr.length; i++) {
        !isNaN(arr[i]) ? answer += Number(arr[i]) : answer *= 1;
    }
    return answer;
}