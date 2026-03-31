function solution(my_string, m, c) {
    if (m == 1 && c == 1) return my_string
    let answer = '';
    let char = '';
    for (let i = 0; i < my_string.length; i++) {
        char = my_string.charAt(i);
        if (i % m == c - 1) answer += char;
    }
    return answer;
}