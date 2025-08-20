function solution(n_str) {
    let arr = n_str.split("");
    let char = arr[0];
    while (char === '0') {
        arr.shift();
        char = arr[0];
    }
    return arr.join("");
}