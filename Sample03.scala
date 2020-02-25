object Sample03{
  def main(arg: Array[String]){
    println(123)
    // 16進数表現は10進数に修正される
    println(0x7b)
    // Int型の最大値は21億
    // これを超えた場合、コンパイルエラーとなる
    // LをつけることでLong型に変更できる
    println(3000000000L)
  }
}