/* 01. array */
/* 배열은 여러 개의 값을 순차적으로(인덱스를 활용하여) 나열한 자료구조이다. */

/* 1. 배열 리터럴을 통해 배열 생성 */
const arr = ['바나나', '복숭아', '키위'];
const arr1 = ['사과', 1, '바나나'];

console.log(arr);
console.log(arr.length);

console.log(arr1);
console.log(arr1.length);

/* 2. 배열 빌트인 생성자 함수 */
const arr3 = Array();
console.log(arr3);
console.log(arr3.length);

const arr4 = Array(10);
console.log(arr4);
console.log(arr4.length);

const arr5 = Array(1, 2, 3);
console.log(arr5);

for(let i = 0; i < arr5.length; i++) {
    console.log(arr5[i]);
}

console.log(typeof arr5);