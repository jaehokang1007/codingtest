function solution(numbers, direction) {
    let bri = '';
    switch(direction) {
        case 'right':
            bri = numbers.pop();
            numbers.unshift(bri);
            break;
            
        case 'left':
            bri = numbers.shift();
            numbers.push(bri);
    }
    return numbers;
}