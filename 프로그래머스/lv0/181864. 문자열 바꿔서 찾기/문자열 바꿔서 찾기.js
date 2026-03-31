function solution(myString, pat) {
    var answer = 0;
    let str = myString.replace(/A/g, "C");
    str = str.replace(/B/g, "A");
    str = str.replace(/C/g, "B");
    
    answer = str.search(pat);
    answer = answer == -1 ? 0 : 1;
    return answer;
}