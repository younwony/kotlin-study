package study

fun main() {
    var number2 = 20L; // 변경 가능한 변수
    val number1 = 10L; // 변경 불가능한 변수, Java final

    // tip : 우선 val 변수로 만들고 필요한 경우 var로 변경
    // Java의 Long과 long의 차이점은 Kotlin에서는 없습니다.

    var number3: Long? = null // null을 허용하는 변수, 변수에 ?를 추가해야 null을 허용합니다.
    var person = Person("윤원희") // Java의 new 키워드 없이 객체 생성
}