function solution(myString) {
  var answer = [];
  let number = 0;
  let arr = myString.split('');
  for (i of arr) {
    if (i !== 'x') number++;
    else {
      answer.push(number);
      number = 0;
    }
  }
  answer.push(number);
  return answer;
}
