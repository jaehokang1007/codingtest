function solution(my_string) {
    var answer = '';
    for (let i = 0; i < my_string.length; i++) {
        if (answer.includes(my_string.charAt(i))) continue;
        else answer += my_string.charAt(i);
    }
    return answer;
}