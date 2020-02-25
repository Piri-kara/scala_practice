object Practice04{
  def main(args: Array[String]){
    val x=88
    val y=79
    val z=96

    print("整数"+x+","+y+","+z+"の中で最小の値は")
    println(min(x,y,z)+"です")
  }
  def min(a:Int, b:Int, c:Int):Int = {
    // 最小の値をaと仮置き
    var minValue = a
    // bの方が小さい場合はbを代入
    if(minValue > b){
      minValue = b
    }
    // さらにcの方が小さい場合はcを代入
    if(minValue > c){
      minValue = c
    }
    // minValueを明示的に返す
    return minValue
  }
}