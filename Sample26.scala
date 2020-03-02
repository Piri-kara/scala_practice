object Sample26{
  def main(args: Array[String]){
    val p1=new Person("山田", 24)
    val p2=new Person("田中", 38)
    val p3=new Person("中西", 27)

    println("年上は"+(p1.senior(p2)).name+"さん")
    println("年上は"+(p2.senior(p3)).name+"さん")
    println()
    println("変数p1は山田さんですか？")
    if(p1.same("山田")){
      println("はい、そうです")
    }
    else{
      println("いいえ、違います")
    }
  }
}

// 自己参照のthis
// メソッドで同じ名前のフィールドと引数を両方用いたい時に、フィールドの先頭に「this」をつける
// thisは「このインスタンス」の意味
// インスタンス内で自分自身のインスタンスそのものを表現したい場合は、参照変数の代わりに「this」をそのまま記述する
class Person(val name:String, var age:Int){
  // Personインスタンスを受け取り、年齢が上の方のインスタンスを返すメソッド
  // if式で自分の年齢、引数で渡ってきた他の人の年齢を比較
  def senior(other:Person):Person={
    if(this.age>=other.age){
      this
    }
    else{
      other
    }
  }
  // 引数で渡ってきた名前と自分の名前が同じかどうか調べるメソッド
  // インスタンスフィールドのnameと引数で渡ってきたnameが同じであるかを調べている
  def same(name:String):Boolean={
    this.name == name
  }
}