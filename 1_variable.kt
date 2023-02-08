/*
  val : value   <-- java final 같은 느낌. 한번 값 assign 한 후 re-assign 불가하다.
  var : variable
*/

var x = 5  // 변수가 top level 에 위치 할 수 있다. 
           // top level  변수 <-- class 나 func 밖에 정의된 변수.
fun main() {
  x+=1
  println(x)
  
  // 1. val 변수이름 : 타입 = 값
  val a : Int = 1
  
  // 2. val 변수이름 = 값
  val b = 1
  
  // 3. 지연할당. <-- type 을 무조건 명시.
  val c : Int
  c = 3
  
  // 4. var 의 경우, 값을 변경 가능.
  var d : Int = 3
  d = 5
  
  // 5. var 의 값을 바꾸더라도, type 변경은 안된다.
  var e : Int = 3
  e = "string"    // 이러면 에러
  
}
