function solution(my_string) {
    var answer = [];
    let letter;
    for (let i = 0; i < my_string.length; i++) {
        letter = my_string.charAt(i);
        if (letter >= 0 || letter <= 0) answer.push(Number(letter));
    }
    
    return answer.sort();
}