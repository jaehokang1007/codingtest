function solution(my_string, indices) {
    var answer = '';
    for (let i = 0; i < my_string.length; i++) {
        if (indices.includes(i)) continue;
        else answer += my_string.charAt(i);
    }
    return answer;
}