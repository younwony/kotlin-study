package study

fun main() {
    // 기본 선언 방식: Java 는 타입 변수(int number)인 반면 Kotlin 은 변수 타입(number: Int)
    var number2:Long = 20L; // 변경 가능한 변수
    val number1 = 10L; // 변경 불가능한 변수, Java final

    // tip : 우선 val 변수로 만들고 필요한 경우 var로 변경
    // Java의 Long과 long의 차이점은 Kotlin에서는 없습니다.

    var number3: Long? = null // null을 허용하는 변수, 변수에 ?를 추가해야 null을 허용합니다.
    var person = Person("윤원희") // Java의 new 키워드 없이 객체 생성
}

fun startsWithA1(str: String?): Boolean {
    // null이 아닌 경우에만 실행
    if(str == null) {
        throw IllegalArgumentException("str is null");
    }

    return str.startsWith("A")
}

fun startsWithA1ToKotlin(str: String?): Boolean {
    return str?.startsWith("A") ?: throw IllegalArgumentException("str is null")
}

// null 반환 할때 Return 에 ?를 추가해야 합니다.
//fun startsWithA2(str: String?): Boolean? {
//    kotlin에서는 compiler가 null을 체크해줍니다.
//    str.startsWith("A") // 컴파일 에러 발생
//}


fun startsWithA3(str: String): Boolean {
    return str.startsWith("A")
}

fun safeCall() {
    val str: String? = null;
    // safe call 연산자 ?.
    // str이 null이 아니면 startsWith("A")를 실행하고, null이면 null을 반환합니다. -> result 는 null
    val result = str?.startsWith("A")
    println(result) // null 출력
}

fun elvisOperator() {
    val str: String? = null;
    // Elvis 연산자 ?: -> str이 null이면 "default"를 반환합니다.
    val result = str ?: "default"
    println(result) // "default" 출력
}

fun earlyReturn(number: Long?): Long {
    number ?: return 0L // number가 null이면 0L을 반환하고 함수 종료

    // number가 null이 아니면 아래 코드 실행
    return number;
}

// !! 연산자
fun nonNullAssertion() {
    val str: String? = null;
    // !! 연산자는 null이 아닌 값을 보장합니다. 만약 null이면 NullPointerException이 발생합니다.
    val result = str!!.startsWith("A") // NullPointerException 발생
    println(result)
}