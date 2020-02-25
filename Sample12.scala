object Sample12{
  def main(arg: Array[String]){
    val x=7
    val y=3
    // 論理演算子
    // Boolean型の値を演算する
    // 結果もBoolean型
    // 単項演算子の「!」はBoolean型の値の左前に付加するs
    print(x+">5&&"+y+">5:")
    println(x>5&&y>5)
    print(x+">5||"+y+">5:")
    println(x>5||y>5)
    print("!("+x+">5):")
    println((!(x>5)))
  }
}