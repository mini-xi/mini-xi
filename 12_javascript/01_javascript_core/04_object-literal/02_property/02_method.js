/* 02. method */
/* 자바 스크립트의 함수는 객체이다. 함수는 값으로 취급할 수 있고 프로퍼티 값으로 사용할 수도 있다. */

var name = '달마시안';

var dog = {
    name: '뽀삐',
    eat: function(food) {
        console.log(`${this.name}(은)는 ${food}를 맛있게 먹어요.`);    // 메소드에서의 'this'는 메소드를 호출한 객체, this.을 안 붙이면 위에 달마시안이 뜬다.
        console.log(`${name}(은)는 ${food}를 맛있게 먹어요.`);    // 달마시안이라고 프린트됨. this.이 없으면 전역변수를 뜻한다.

        return '잘 먹었네';
    }
};

console.log(dog.eat('간식', '고구마'));