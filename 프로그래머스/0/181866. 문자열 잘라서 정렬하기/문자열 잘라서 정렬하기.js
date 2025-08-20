function solution(myString) {
    // x 기준으로 배열 만들고, 빈 문자열 제거, 정렬
    return myString.split("x").filter(i => i != "").sort();
}