function solution(binomial) {
    var answer = 0;
    let arr = binomial.split(" ");
    switch(arr[1]) {
        case '+': answer = Number(arr[0]) + Number(arr[2]); break;
        case '-': answer = Number(arr[0]) - Number(arr[2]); break;
        case '*': answer = arr[0] * arr[2];
    }
    return answer;
}