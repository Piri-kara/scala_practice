object Sample24{
  def main(args: Array[String]){
    val p1=new Person("山田", 24, "東京", "公務員")
    val p2=new Person("田中", 38, "千葉")
    val p3=new Person("中西", 27)

    p1.introduce()
    p2.introduce()
    p3.introduce()
  }
}

class Person(n:String, a:Int, g:String, j:String){
  val name=n
  val age=a
  val graduate=g
  var job=j

  // コンストラクタ = インスタンスが生成される時に1度だけ呼び出される特殊なメソッド
  // オーバーロードすることが可能
  // 補助コンストラクタ = 基本コンストラクタ以外のコンストラクタ
  // 引数が3つ or 2つの補助コンストラクタを作成
  def this(n:String, a:Int, g:String){
    // 同じクラスの他のコンストラクタを呼び出す必要がある
    // this(引数リスト)でコンストラクタを呼び出すことができる
    this(n,a,g,"無職")
  }
  def this(n:String, a:Int){
    this(n,a,"不明")
  }
  def introduce(){
    println("名前："+name+" 年齢："+age+"歳"+" 出身："+graduate+" 職業："+job)
  }
}