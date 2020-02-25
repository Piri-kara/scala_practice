object Sample08{
  def main(arg: Array[String]){
    // 変数とはデータを格納する入れもの
    // メソッドの中で宣言された変数をローカル変数と呼ぶ
    // varは可変の変数（再代入可能）
    // valは不変の変数（再代入不可能）
    // var 変数名:変数の型 = 初期値 で宣言できる
    // Scalaではval推奨
    // 変数の型と同じ型の値しか原則代入できない

    //Integer型の変数x1を宣言
    val x1:Int = 10
    // x1=20 valによる宣言なので再代入できない
    var x2:Int = 30
    x2 = 40 //varによる宣言なので再代入できる

    // Double型の変数x3を宣言し、x2を代入
    // 型が違うが、Double型はInt型より大きな数値を扱えるため、互換性がある
    // Byte < Short < Int < Long < Float < Doubleの順に上位互換
    val x3:Double = x2
    // val x4:Int = "Hello" Int型なので文字列は代入できない
    println(x1)
    println(x2)
    println(x3)
  }
}