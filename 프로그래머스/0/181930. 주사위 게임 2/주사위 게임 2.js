function solution(a, b, c) {
    var answer = 0;
    let Case = 0;
    let number = [a, b, c];
    number.sort();
    for (let i = 1; i < number.length; i++) {
        if(number[i-1] === number[i]) Case++;
    }
    switch(Case) {
        case 0: answer = a+b+c; break;
        case 1: answer = (a+b+c) * (a**2+b**2+c**2); break;
        case 2: answer = (a+b+c) * (a**2+b**2+c**2) * (a**3+b**3+c**3);
        
    }
    return answer;
}