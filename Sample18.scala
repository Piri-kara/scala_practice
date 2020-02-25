object Sample18{
  def main(args: Array[String]){
    // オーバーロード
    // 同じオブジェクトやクラス内に同じ名前のメソッドを複数定義することができる
    // メソッド名は同じでもOKだが、シグネチャ（引数の数と型の組み合わせ）は異ならなければならない
    val a=3
    val b=5
    val c=1.2
    sum(a,b)
    sum(b,c)
    sum(c,a)
  }
  def sum(x:Int, y:Int){
    println("Int+Int=>"+(x+y))
  }
  def sum(x:Int, y:Double){
    println("Int+Double=>"+(x+y))
  }
  def sum(x:Double, y:Int){
    println("Double+Int=>"+(x+y))
  }
}